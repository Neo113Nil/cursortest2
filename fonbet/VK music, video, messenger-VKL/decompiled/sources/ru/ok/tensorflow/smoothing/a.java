package ru.ok.tensorflow.smoothing;

import java.util.Comparator;
import ru.ok.tensorflow.smoothing.DetectionMerger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$mergeIds$0;
        lambda$mergeIds$0 = DetectionMerger.lambda$mergeIds$0((DetectionMerger.CandidateMatch) obj, (DetectionMerger.CandidateMatch) obj2);
        return lambda$mergeIds$0;
    }
}
