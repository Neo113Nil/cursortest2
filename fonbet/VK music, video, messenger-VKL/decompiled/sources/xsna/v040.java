package xsna;

import com.vk.im.engine.models.messages.NestedMsg;
import xsna.x040;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v040 implements izs {
    public final /* synthetic */ x040 b;
    public final /* synthetic */ x040.a c;
    public final /* synthetic */ int d;
    public final /* synthetic */ StringBuilder e;

    public /* synthetic */ v040(x040 x040Var, x040.a aVar, int i, StringBuilder sb) {
        this.b = x040Var;
        this.c = aVar;
        this.d = i;
        this.e = sb;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.d + 1;
        jh.f(this.e, this.b.c((NestedMsg) obj, this.c, true, i), "\n", "\n");
        return s3q0.a;
    }
}
