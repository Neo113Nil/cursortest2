package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.f8s;
import xsna.g8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: AlertScreenContent.kt */
/* loaded from: classes18.dex */
public final class us1 implements yah0 {
    public final wh50<Boolean> b = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final wh50<Boolean> c;
    public final wh50<tho0> d;
    public final wh50<Boolean> e;
    public final wh50<tho0> f;
    public final wh50<Boolean> g;
    public final wh50<tho0> h;
    public final wh50<tho0> i;

    public us1() {
        Boolean bool = Boolean.TRUE;
        this.c = androidx.compose.runtime.k.b(bool);
        this.d = androidx.compose.runtime.k.b(new tho0("Basic dialog title", 0L, 6));
        this.e = androidx.compose.runtime.k.b(bool);
        this.f = androidx.compose.runtime.k.b(new tho0("A dialog is a type of modal window that appears in front of app content to provide critical information, or prompt for a decision to be made.", 0L, 6));
        this.g = androidx.compose.runtime.k.b(bool);
        this.h = androidx.compose.runtime.k.b(new tho0("Cancel", 0L, 6));
        this.i = androidx.compose.runtime.k.b(new tho0("Ok", 0L, 6));
    }

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-581969361);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-581969361, i2, -1, "com.vk.design.demo.presentation.screens.AlertScreenContent.Content (AlertScreenContent.kt:55)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.e("Alerts", null, null, b, null, gzsVar, false, null, false, null, M, 4102 | ((i2 << 15) & 458752), 0, 2006);
            M = M;
            djn0.a(true, true, M, 438, 0);
            float f2 = 8;
            q630 D2 = p490.D(s200.D(aVar2, f2), p490.x(M), 14);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.o, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            int i5 = (i4 >> 15) & 14;
            e(i5, M);
            b(i5, M);
            c(i5, M);
            d(i5, M);
            int i6 = i4 & 458752;
            boolean z = i6 == 131072;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new v40(this, 2);
                M.R(x);
            }
            mpj0.a(6, 2, M, "Show Compose Alert", (gzs) x, null);
            f(i5, M);
            M.G();
            if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                M.K(678875926);
                String str = ((Boolean) ((zak0) this.c).getValue()).booleanValue() ? ((tho0) ((zak0) this.d).getValue()).a.c : null;
                String str2 = ((Boolean) ((zak0) this.e).getValue()).booleanValue() ? ((tho0) ((zak0) this.f).getValue()).a.c : null;
                String str3 = ((tho0) ((zak0) this.i).getValue()).a.c;
                boolean z2 = i6 == 131072;
                Object x2 = M.x();
                if (z2 || x2 == obj) {
                    x2 = new rj1(this, 2);
                    M.R(x2);
                }
                Alert$Button.Style style = Alert$Button.Style.Neutral;
                Alert$Button alert$Button = new Alert$Button(str3, (gzs) x2, style, null);
                String str4 = ((tho0) ((zak0) this.h).getValue()).a.c;
                boolean z3 = i6 == 131072;
                Object x3 = M.x();
                if (z3 || x3 == obj) {
                    x3 = new no(this, 1);
                    M.R(x3);
                }
                Alert$Button alert$Button2 = new Alert$Button(str4, (gzs) x3, style, null);
                boolean z4 = i6 == 131072;
                Object x4 = M.x();
                if (z4 || x4 == obj) {
                    x4 = new kf1(this, 1);
                    M.R(x4);
                }
                t7u0.d(0, 340, M, alert$Button, alert$Button2, null, null, str, str2, null, (izs) x4, null);
            } else {
                M.K(675399741);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rs1
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    us1.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(220354376);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(220354376, i2, -1, "com.vk.design.demo.presentation.screens.AlertScreenContent.ChangeDescription (AlertScreenContent.kt:127)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean booleanValue = ((Boolean) ((zak0) this.e).getValue()).booleanValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new s6(this, 4);
                M.R(x);
            }
            zov0.a(booleanValue, (izs) x, null, false, null, M, 0, 28);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            tho0 tho0Var = (tho0) ((zak0) this.f).getValue();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new t6(this, 4);
                M.R(x2);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x2, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14);
            vr9 a3 = f8s.a.a("Подзаголовок", null, null, M, 3078, 6);
            M = M;
            nvu0.a(a2, xpyVar, null, null, a3, M, 0, 12);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps1(this, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1045250033);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1045250033, i2, -1, "com.vk.design.demo.presentation.screens.AlertScreenContent.ChangeNegativeButton (AlertScreenContent.kt:150)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean booleanValue = ((Boolean) ((zak0) this.g).getValue()).booleanValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ns1(this, 0);
                M.R(x);
            }
            zov0.a(booleanValue, (izs) x, null, false, null, M, 0, 28);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            tho0 tho0Var = (tho0) ((zak0) this.h).getValue();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new com.vk.movika.sdk.base.hooks.p(this, 6);
                M.R(x2);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x2, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14);
            vr9 a3 = f8s.a.a("Левая кнопка", null, null, M, 3078, 6);
            M = M;
            nvu0.a(a2, xpyVar, null, null, a3, M, 0, 12);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new os1(this, i);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1416861651);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1416861651, i2, -1, "com.vk.design.demo.presentation.screens.AlertScreenContent.ChangePositiveButton (AlertScreenContent.kt:173)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            tho0 tho0Var = (tho0) ((zak0) this.i).getValue();
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new d7(this, 3);
                M.R(x);
            }
            aVar2 = M;
            nvu0.a(g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x, null, 0L, 0L, null, null, null, null, null, false, null, aVar2, 0, 196608, 32764), null, false, null, aVar2, 24576, 14), f, null, null, f8s.a.a("Правая кнопка", null, null, aVar2, 3078, 6), aVar2, 48, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ts1(this, i, 0);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-915019228);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-915019228, i2, -1, "com.vk.design.demo.presentation.screens.AlertScreenContent.ChangeTitle (AlertScreenContent.kt:104)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean booleanValue = ((Boolean) ((zak0) this.c).getValue()).booleanValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new com.vk.voip.ui.menu.feature.a(this, 3);
                M.R(x);
            }
            zov0.a(booleanValue, (izs) x, null, false, null, M, 0, 28);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            tho0 tho0Var = (tho0) ((zak0) this.d).getValue();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new i50(this, 2);
                M.R(x2);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x2, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14);
            vr9 a3 = f8s.a.a("Заголовок", null, null, M, 3078, 6);
            M = M;
            nvu0.a(a2, xpyVar, null, null, a3, M, 0, 12);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ss1(this, i, 0);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1011513256);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1011513256, i2, -1, "com.vk.design.demo.presentation.screens.AlertScreenContent.ShowViewAlertButton (AlertScreenContent.kt:187)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean y = M.y(context) | ((i2 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.logic.interactor.c(4, context, this);
                M.R(x);
            }
            mpj0.a(6, 2, M, "Show View Alert", (gzs) x, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qs1(this, i, 0);
        }
    }
}
