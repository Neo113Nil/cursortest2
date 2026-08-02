package ru.ok.tensorflow.smoothing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.util.Function2;

/* loaded from: classes9.dex */
public class Smoother {
    private final DetectionMerger detectionMerger;
    private Function2<Detection, Long, DetectionSmoother> detectionSmootherFunc;
    private DetectionTrace detectionTrace;
    private Map<Long, DetectionSmoother> smoothersPrev = new HashMap();
    private boolean doFilterAngle = true;

    public class DetectionTrace {
        private int length;
        List<List<Detection>> trace = new ArrayList();

        public DetectionTrace(int i) {
            this.length = i;
        }

        public void add(List<Detection> list) {
            this.trace.add(list);
            while (this.trace.size() > this.length) {
                this.trace.remove(0);
            }
        }

        public Collection<Detection> getCombined() {
            HashMap hashMap = new HashMap();
            for (int size = this.trace.size() - 1; size >= 0; size--) {
                for (Detection detection : this.trace.get(size)) {
                    long j = detection.id;
                    if (!hashMap.containsKey(Long.valueOf(j))) {
                        hashMap.put(Long.valueOf(j), detection);
                    }
                }
            }
            return hashMap.values();
        }
    }

    public Smoother(DetectionMerger detectionMerger, int i, Function2<Detection, Long, DetectionSmoother> function2) {
        this.detectionMerger = detectionMerger;
        this.detectionSmootherFunc = function2;
        this.detectionTrace = new DetectionTrace(i);
    }

    public void setFilterAngle(boolean z) {
        this.doFilterAngle = z;
    }

    public List<Detection> smooth(List<Detection> list) {
        long currentTimeMillis = System.currentTimeMillis();
        List<Detection> mergeIds = this.detectionMerger.mergeIds(this.detectionTrace.getCombined(), list);
        HashMap hashMap = new HashMap();
        for (Detection detection : mergeIds) {
            long j = detection.id;
            hashMap.put(Long.valueOf(j), this.smoothersPrev.containsKey(Long.valueOf(j)) ? this.smoothersPrev.get(Long.valueOf(j)) : this.detectionSmootherFunc.apply(detection, Long.valueOf(currentTimeMillis)));
        }
        ArrayList arrayList = new ArrayList();
        for (Detection detection2 : mergeIds) {
            arrayList.add(((DetectionSmoother) hashMap.get(Long.valueOf(detection2.id))).smooth(detection2, currentTimeMillis, this.doFilterAngle));
        }
        this.detectionTrace.add(arrayList);
        this.smoothersPrev = hashMap;
        return arrayList;
    }

    public List<Recognition> smoothRecognitions(List<Recognition> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Recognition> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().detection);
        }
        List<Detection> smooth = smooth(arrayList);
        ArrayList arrayList2 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList2.add(list.get(i).updateDetection(smooth.get(i)));
        }
        return arrayList2;
    }
}
