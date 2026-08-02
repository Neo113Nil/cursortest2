package xsna;

import java.util.Comparator;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.tensorflow.entity.Detection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class nus implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$process$3;
        lambda$process$3 = FrugalKeypointPipeline.lambda$process$3((Detection) obj, (Detection) obj2);
        return lambda$process$3;
    }
}
