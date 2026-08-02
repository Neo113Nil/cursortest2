package ru.ok.tensorflow.smoothing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public class DetectionMerger {
    private float maxPositionDistanceFactor;
    private float maxSizeDistanceFactor;

    public class CandidateMatch {
        private Detection detectionCurr;
        private Detection detectionPrev;
        private float distance;

        public CandidateMatch(Detection detection, Detection detection2, float f) {
            this.detectionPrev = detection;
            this.detectionCurr = detection2;
            this.distance = f;
        }
    }

    public DetectionMerger(float f, float f2) {
        this.maxPositionDistanceFactor = f;
        this.maxSizeDistanceFactor = f2;
    }

    private float getPositionDistanceFactor(Detection detection, Detection detection2) {
        float[] center = detection.getCenter();
        float[] center2 = detection2.getCenter();
        float f = center[0] - center2[0];
        float f2 = center[1] - center2[1];
        return ((float) Math.sqrt((f2 * f2) + (f * f))) / ((detection2.getSize() + detection.getSize()) / 2.0f);
    }

    private float getSizeDistanceFactor(Detection detection, Detection detection2) {
        float size = detection.getSize() / detection2.getSize();
        return size < 1.0f ? 1.0f / size : size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$mergeIds$0(CandidateMatch candidateMatch, CandidateMatch candidateMatch2) {
        return Float.compare(candidateMatch.distance, candidateMatch2.distance);
    }

    public List<Detection> mergeIds(Collection<Detection> collection, Collection<Detection> collection2) {
        return mergeIds(collection, collection2, false);
    }

    public List<Detection> mergeIds(Collection<Detection> collection, Collection<Detection> collection2, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Detection detection : collection2) {
            for (Detection detection2 : collection) {
                float positionDistanceFactor = getPositionDistanceFactor(detection2, detection);
                float sizeDistanceFactor = getSizeDistanceFactor(detection2, detection);
                if (positionDistanceFactor < this.maxPositionDistanceFactor && sizeDistanceFactor < this.maxSizeDistanceFactor) {
                    arrayList.add(new CandidateMatch(detection2, detection, positionDistanceFactor + sizeDistanceFactor));
                }
            }
        }
        Collections.sort(arrayList, new a());
        HashMap hashMap = new HashMap();
        while (arrayList.size() > 0) {
            CandidateMatch candidateMatch = (CandidateMatch) arrayList.get(0);
            hashMap.put(candidateMatch.detectionCurr, candidateMatch.detectionPrev);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                CandidateMatch candidateMatch2 = (CandidateMatch) arrayList.get(size);
                if (candidateMatch2.detectionPrev == candidateMatch.detectionPrev || candidateMatch2.detectionCurr == candidateMatch.detectionCurr) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(collection2.size());
        for (Detection detection3 : collection2) {
            if (hashMap.containsKey(detection3)) {
                Detection updateId = detection3.updateId(((Detection) hashMap.get(detection3)).id);
                if (!z) {
                    arrayList2.add(updateId);
                }
            } else {
                arrayList2.add(detection3);
            }
        }
        return arrayList2;
    }
}
