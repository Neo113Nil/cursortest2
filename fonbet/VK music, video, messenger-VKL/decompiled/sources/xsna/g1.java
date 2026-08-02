package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.b2;
import xsna.u0;
import xsna.z1;

/* compiled from: AboutAppFeature.kt */
/* loaded from: classes6.dex */
public final class g1 extends wk50<p3, o2, u0, b2> {
    public final int f;
    public final boolean g;
    public final j2 h;
    public final bpn0 i;
    public final f4z j;

    public g1(int i, boolean z, j2 j2Var) {
        super(u0.a.b, new i2());
        this.f = i;
        this.g = z;
        this.h = j2Var;
        this.i = new bpn0(new d1(0));
        this.j = new f4z();
    }

    @Override // xsna.wk50
    public final void N(o2 o2Var, u0 u0Var) {
        u0 u0Var2 = u0Var;
        y0 y0Var = o2Var.e;
        if (u0Var2.equals(u0.a.b)) {
            boolean z = this.g;
            T(new b2.b(z));
            if (z) {
                U(SchemeStat$TypeMiniAppItem.Type.UNVERIFIED_SCREEN);
            }
            a7f0.a.f(this, this.h.b(this.f), new com.vk.movika.sdk.base.data.a(this, 1), new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 1), 1);
            return;
        }
        boolean equals = u0Var2.equals(u0.b.b);
        f4z f4zVar = this.j;
        if (equals) {
            f4zVar.b(z1.a.a);
            return;
        }
        if (u0Var2.equals(u0.f.b)) {
            f4zVar.b(new z1.f(y0Var.l));
            return;
        }
        if (u0Var2.equals(u0.d.b)) {
            f4zVar.b(new z1.f(y0Var.k));
            return;
        }
        if (u0Var2.equals(u0.c.b)) {
            f4zVar.b(new z1.d(y0Var.f));
        } else if (u0Var2.equals(u0.g.b)) {
            V();
        } else {
            if (!(u0Var2 instanceof u0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(new z1.e(((u0.e) u0Var2).b, y0Var.d));
        }
    }

    public final void U(SchemeStat$TypeMiniAppItem.Type type) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MINI_APP, Long.valueOf(this.f), null, null, null, null, 60, null), new SchemeStat$TypeMiniAppItem(type, null, null, 6, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    public final void V() {
        a7f0.a.d(this, this.h.a(this.f), null, new e1(this, 0), new f1(this, 0), 1);
        U(SchemeStat$TypeMiniAppItem.Type.UNVERIFIED_SCREEN_LAUNCH);
    }
}
