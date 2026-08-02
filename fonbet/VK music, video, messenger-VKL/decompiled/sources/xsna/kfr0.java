package xsna;

import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.superapp.browser.ui.model.PersonalDiscountTransitionFrom;
import xsna.u1a0;

/* compiled from: VKSocialViewDelegate.kt */
/* loaded from: classes6.dex */
public final class kfr0 {
    public final fvv0 a;
    public final ggu0 b;
    public final mfu0 c;
    public final tdr0 d;
    public final wc80 e;
    public final srq0 f;
    public final rns0 g;
    public final ifr0 h = new ifr0(this);
    public final jfr0 i = new jfr0(this);

    /* compiled from: VKSocialViewDelegate.kt */
    public static final class a {
    }

    public kfr0(fvv0 fvv0Var, ggu0 ggu0Var, mfu0 mfu0Var, tdr0 tdr0Var, wc80 wc80Var, srq0 srq0Var, rns0 rns0Var) {
        this.a = fvv0Var;
        this.b = ggu0Var;
        this.c = mfu0Var;
        this.d = tdr0Var;
        this.e = wc80Var;
        this.f = srq0Var;
        this.g = rns0Var;
    }

    public final void a(PersonalDiscountTransitionFrom personalDiscountTransitionFrom) {
        if (((ggu0) this.g.c).x == null) {
            return;
        }
        new u1a0.a(((ggu0) this.f.c).b, this.a, personalDiscountTransitionFrom, new a(), this.h).I0(null);
    }

    public final void b(PersonalDiscountDialogType personalDiscountDialogType, PersonalDiscountTransitionFrom personalDiscountTransitionFrom) {
        if (((ggu0) this.g.c).x == null) {
            return;
        }
        int i = com.vk.superapp.browser.internal.ui.shortcats.a.o;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        vdx0Var.getClass();
        this.b.r.b(((lfn0) vdx0.E.getValue()).a().subscribe(new qtq0(new it8(this, personalDiscountTransitionFrom, personalDiscountDialogType, 5), 2), new dfr0(new gxj0(7), 0)));
    }
}
