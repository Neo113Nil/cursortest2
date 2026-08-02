package xsna;

import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import xsna.qvq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rlx0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rlx0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.vk.voip.ui.whiteboard.presentation.main.ui.a aVar = ((WhiteboardFragment) obj2).Q;
                if (aVar != null) {
                    boolean z = !booleanValue;
                    bwt0.p0(aVar.j, z);
                    bwt0.p0(aVar.k, z);
                    bwt0.p0(aVar.l, z);
                    bwt0.p0(aVar.i, z);
                }
                break;
            default:
                ((u6e) obj2).C(new qvq.x((llh0) obj));
                break;
        }
        return s3q0.a;
    }
}
