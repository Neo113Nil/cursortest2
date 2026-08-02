package xsna;

import java.util.Comparator;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.tensorflow.entity.Detection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class mus implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$process$2;
        lambda$process$2 = FrugalKeypointPipeline.lambda$process$2((Detection) obj, (Detection) obj2);
        return lambda$process$2;
    }
}
