package xsna;

import com.vk.dto.attaches.Attach;

/* compiled from: MsgListVc.kt */
/* loaded from: classes2.dex */
public final class xm30 implements xwb0 {
    public final /* synthetic */ Attach a;

    public xm30(Attach attach) {
        this.a = attach;
    }

    @Override // xsna.xwb0
    public final void E() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.b.x(new x080(this.a));
    }

    @Override // xsna.xwb0
    public final void k() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.b.x(new w080(this.a));
    }
}
