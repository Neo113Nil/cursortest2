package xsna;

import java.util.Comparator;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.ssd.Util;
import xsna.b2k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class a2k0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ a2k0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$nms$0;
        switch (this.b) {
            case 0:
                return ((b2k0.a) obj).a - ((b2k0.a) obj2).a;
            default:
                lambda$nms$0 = Util.lambda$nms$0((Detection) obj, (Detection) obj2);
                return lambda$nms$0;
        }
    }
}
