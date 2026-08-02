package xsna;

import com.vk.fullscreenvideo.a;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FullscreenControlsCallback.kt */
/* loaded from: classes2.dex */
public final class uxs implements izs<com.vk.fullscreenvideo.a, s3q0> {
    public final u5p0 b;
    public final wxt c;
    public final wxv d;
    public final rx4 e;
    public final kcj0 f;

    public uxs(u5p0 u5p0Var, wxt wxtVar, wxv wxvVar, rx4 rx4Var, kcj0 kcj0Var) {
        this.b = u5p0Var;
        this.c = wxtVar;
        this.d = wxvVar;
        this.e = rx4Var;
        this.f = kcj0Var;
    }

    public final void a(com.vk.fullscreenvideo.a aVar) {
        if (aVar.equals(a.d.C1074d.a)) {
            this.c.invoke();
            return;
        }
        if (aVar.equals(a.d.h.a)) {
            this.d.invoke();
            return;
        }
        if (aVar.equals(a.d.i.a)) {
            this.f.invoke();
            return;
        }
        if (aVar.equals(a.d.C1071a.a)) {
            this.e.invoke();
            return;
        }
        boolean equals = aVar.equals(a.f.a);
        u5p0 u5p0Var = this.b;
        if (equals) {
            u5p0Var.invoke(ijj0.a);
            return;
        }
        if (aVar.equals(a.g.a)) {
            u5p0Var.invoke(jjj0.a);
            return;
        }
        if (aVar instanceof a.d.b.C1072a) {
            u5p0Var.invoke(r0t0.a);
            return;
        }
        if (aVar.equals(a.d.c.a)) {
            u5p0Var.invoke(mhs0.a);
            return;
        }
        if (aVar instanceof a.d.b.C1073b) {
            u5p0Var.invoke(dss0.a);
            return;
        }
        if (aVar.equals(a.d.f.a)) {
            u5p0Var.invoke(ngt0.a);
            return;
        }
        if (aVar instanceof a.d.b.c) {
            u5p0Var.invoke(kgt0.a);
            return;
        }
        if (aVar.equals(a.d.j.a)) {
            u5p0Var.invoke(kst0.a);
            return;
        }
        if (aVar.equals(a.d.e.a)) {
            u5p0Var.invoke(new qws0(13, null, false));
            return;
        }
        if (aVar.equals(a.d.g.a)) {
            u5p0Var.invoke(ass0.a);
            return;
        }
        if (aVar.equals(a.C1070a.a)) {
            u5p0Var.invoke(t6t0.a);
            return;
        }
        if (aVar.equals(a.h.a)) {
            u5p0Var.invoke(uit0.a);
            return;
        }
        if (aVar.equals(a.c.a)) {
            u5p0Var.invoke(pws0.a);
            return;
        }
        if (aVar.equals(a.i.a)) {
            u5p0Var.invoke(u0t0.a);
        } else if (aVar instanceof a.b) {
            u5p0Var.invoke(new c4s0(((a.b) aVar).a));
        } else {
            if (!aVar.equals(a.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            u5p0Var.invoke(hsw.a);
        }
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ s3q0 invoke(com.vk.fullscreenvideo.a aVar) {
        a(aVar);
        return s3q0.a;
    }
}
