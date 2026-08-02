package xsna;

import java.util.Comparator;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.tensorflow.entity.Detection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class rhq implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ rhq(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$process$4;
        switch (this.b) {
            case 0:
                lambda$process$4 = FaceMorphingPipeline.lambda$process$4((Detection) obj, (Detection) obj2);
                return lambda$process$4;
            default:
                ((tep0) obj).getClass();
                ((tep0) obj2).getClass();
                return Integer.compare(1, 1);
        }
    }
}
