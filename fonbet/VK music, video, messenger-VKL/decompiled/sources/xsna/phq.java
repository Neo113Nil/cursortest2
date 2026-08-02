package xsna;

import androidx.media3.ui.b;
import java.util.Comparator;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.tensorflow.entity.Detection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class phq implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ phq(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$process$2;
        switch (this.b) {
            case 0:
                lambda$process$2 = FaceMorphingPipeline.lambda$process$2((Detection) obj, (Detection) obj2);
                return lambda$process$2;
            default:
                b.C0073b c0073b = (b.C0073b) obj;
                b.C0073b c0073b2 = (b.C0073b) obj2;
                int compare = Integer.compare(c0073b2.b, c0073b.b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = c0073b.c.compareTo(c0073b2.c);
                return compareTo != 0 ? compareTo : c0073b.d.compareTo(c0073b2.d);
        }
    }
}
