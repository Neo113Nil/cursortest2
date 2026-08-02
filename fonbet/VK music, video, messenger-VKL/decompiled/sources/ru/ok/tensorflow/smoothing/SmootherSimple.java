package ru.ok.tensorflow.smoothing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function2;

/* loaded from: classes9.dex */
public class SmootherSimple {
    private Function2<Detection, Long, DetectionSmoother> detectionSmootherFunc;
    private Map<Long, DetectionSmoother> smoothersPrev = new HashMap();
    private boolean doFilterAngle = true;

    public SmootherSimple(Function2<Detection, Long, DetectionSmoother> function2) {
        this.detectionSmootherFunc = function2;
    }

    public void setFilterAngle(boolean z) {
        this.doFilterAngle = z;
    }

    public List<Detection> smooth(List<Detection> list) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        for (Detection detection : list) {
            long j = detection.id;
            hashMap.put(Long.valueOf(j), this.smoothersPrev.containsKey(Long.valueOf(j)) ? this.smoothersPrev.get(Long.valueOf(j)) : this.detectionSmootherFunc.apply(detection, Long.valueOf(currentTimeMillis)));
        }
        ArrayList arrayList = new ArrayList();
        for (Detection detection2 : list) {
            arrayList.add(((DetectionSmoother) hashMap.get(Long.valueOf(detection2.id))).smooth(detection2, currentTimeMillis, this.doFilterAngle));
        }
        this.smoothersPrev = hashMap;
        return arrayList;
    }
}
