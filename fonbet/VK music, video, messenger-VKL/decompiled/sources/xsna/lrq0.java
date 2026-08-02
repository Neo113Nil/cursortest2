package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.button.tool.ToolButton$Appearance;
import com.vk.core.compose.component.button.tool.ToolButton$Mode;
import com.vk.core.compose.component.button.tool.ToolButton$TextPosition;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.f3u0;
import xsna.q630;
import xsna.us2;

/* compiled from: UserProfileLegoViewerModalMenu.kt */
/* loaded from: classes5.dex */
public final class lrq0 {
    public static final lrq0 a = new lrq0();

    /* compiled from: UserProfileLegoViewerModalMenu.kt */
    public static final class a extends kmu0 {
    }

    /* compiled from: UserProfileLegoViewerModalMenu.kt */
    public static final class b {
        public final List a;
        public final List b;
        public final ListBuilder c;

        public b(List list, List list2, ListBuilder listBuilder) {
            this.a = list;
            this.b = list2;
            this.c = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewerMenuLayout(primary=");
            mr.c(", apps=", sb, this.a);
            mr.c(", common=", sb, this.b);
            sb.append((Object) wow.c(this.c));
            sb.append(')');
            return sb.toString();
        }
    }

    public static ListBuilder h(sp spVar) {
        ListBuilder e = e43.e();
        f3u0.a.e eVar = f3u0.a.e.d;
        spVar.getClass();
        p4g.a(eVar, e, false);
        p4g.a(f3u0.a.C2849a.d, e, false);
        p4g.a(f3u0.a.f.d, e, false);
        p4g.a(f3u0.a.b.d, e, true);
        p4g.a(f3u0.a.i.d, e, !false);
        e.add(f3u0.a.d.d);
        p4g.a(f3u0.a.g.d, e, false);
        e.add(f3u0.a.h.d);
        p4g.a(f3u0.a.j.d, e, false);
        p4g.a(f3u0.a.c.d, e, !false);
        return e.g();
    }

    public final void a(List list, qvm0 qvm0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> an7Var;
        androidx.compose.runtime.a M = aVar.M(1378117702);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(qvm0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1378117702, i2, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.AppsSection (UserProfileLegoViewerModalMenu.kt:165)");
            }
            if (list.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    an7Var = new s2(i, 5, this, list, qvm0Var);
                    s.d = an7Var;
                }
                return;
            }
            M.K(1521192045);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f3u0.b bVar = (f3u0.b) it.next();
                lg90 a2 = pg90.a(R.drawable.vk_icon_services_outline_36, 0, M);
                bVar.a.getClass();
                String J = blk.J(null, M);
                boolean y = ((i2 & 112) == 32) | M.y(bVar);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new wx0(23, qvm0Var, bVar);
                    M.R(x);
                }
                a.c(a2, J, false, (gzs) x, M, 24584, 4);
            }
            M.j();
            d(6, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            an7Var = new an7(i, 10, this, list, qvm0Var);
            s.d = an7Var;
        }
    }

    public final void b(ListBuilder listBuilder, qvm0 qvm0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-765629203);
        int i2 = i | (M.J(listBuilder) ? 4 : 2) | (M.y(qvm0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-765629203, i2, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.CommonSection (UserProfileLegoViewerModalMenu.kt:184)");
            }
            ListIterator listIterator = listBuilder.listIterator(0);
            while (true) {
                ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
                if (!aVar2.hasNext()) {
                    break;
                }
                f3u0.a aVar3 = (f3u0.a) aVar2.next();
                lg90 a2 = pg90.a(aVar3.a, 0, M);
                String N = d370.N(aVar3.b, 0, M);
                boolean z = aVar3.c;
                boolean J = ((i2 & 112) == 32) | M.J(aVar3);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new sk(25, qvm0Var, aVar3);
                    M.R(x);
                }
                a.c(a2, N, z, x, M, 24584, 0);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n87(this, listBuilder, qvm0Var, i, 9);
        }
    }

    public final void c(final lg90 lg90Var, final String str, boolean z, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        final boolean z3;
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(1238033231);
        int i4 = i | (M.y(lg90Var) ? 4 : 2) | (M.J(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (M.l(z2) ? 256 : 128);
        }
        int i6 = i3 | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
            boolean z4 = i5 != 0 ? false : z2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1238033231, i6, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.MenuCell (UserProfileLegoViewerModalMenu.kt:222)");
            }
            if (z4) {
                M.K(1364011131);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().h;
                M.j();
            } else {
                M.K(1364072604);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().j;
                M.j();
            }
            if (z4) {
                M.K(1364169851);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var3.getText().k;
                M.j();
            } else {
                M.K(1364231324);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var4.getText().m;
                M.j();
            }
            long j3 = j2;
            com.vk.core.compose.component.cell.content.x a2 = f4j0.a(lg90Var, 28, j, M, 196664 | (i6 & 14), 24);
            us2.b bVar = new us2.b();
            int m = bVar.m(new hik0(j3, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                bVar.g(str);
                s3q0 s3q0Var = s3q0.a;
                bVar.k(m);
                mjv0.a(null, a1.b.a(a1.g.b.b(bVar.n(), null, null, 0, 0, M, 100663296, 254), null, null, null, null, null, null, null, null, M, 2046), a2, null, SexyCell$Size.Medium, null, false, gzsVar, null, M, ((i6 << 12) & 29360128) | 24576, 361);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z3 = z4;
            } catch (Throwable th) {
                bVar.k(m);
                throw th;
            }
        } else {
            M.h();
            z3 = z2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(lg90Var, str, z3, gzsVar, i, i2) { // from class: xsna.krq0
                public final /* synthetic */ lg90 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ int g;

                {
                    this.g = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(24585);
                    lrq0.this.c(this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I, this.g);
                    return s3q0.a;
                }
            };
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1956625812);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1956625812, i, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.MenuSeparator (UserProfileLegoViewerModalMenu.kt:256)");
            }
            ijv0.c(SeparatorDpi.At1x, SeparatorAppearance.Primary, s200.E(txj0.f(q630.a.a, 1.0f), 9, 8), M, 438, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rbo(this, i, 2);
        }
    }

    public final void e(List list, qvm0 qvm0Var, androidx.compose.runtime.a aVar, int i) {
        qvm0 qvm0Var2;
        androidx.compose.runtime.a aVar2;
        lrq0 lrq0Var;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> fxVar;
        androidx.compose.runtime.a aVar3;
        Pair pair;
        androidx.compose.runtime.a M = aVar.M(708851538);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(qvm0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(708851538, i2, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.PrimarySection (UserProfileLegoViewerModalMenu.kt:129)");
            }
            if (list.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    fxVar = new cr3(i, 5, this, list, qvm0Var);
                    s.d = fxVar;
                }
                return;
            }
            qvm0Var2 = qvm0Var;
            float f = 16;
            q630 f2 = txj0.f(s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 2, 2), 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a3 = yu50.a(M, c, cri.a.d, 131097492, list);
            while (a3.hasNext()) {
                f3u0.c cVar = (f3u0.c) a3.next();
                if (cVar instanceof f3u0.c.b) {
                    M.K(-95802894);
                    f3u0.c.b bVar = (f3u0.c.b) cVar;
                    bVar.c.getClass();
                    aVar3 = M;
                    lg90 l = fwu0.l(null, null, null, null, aVar3, 0, 62);
                    bVar.c.getClass();
                    pair = new Pair(l, blk.J(null, aVar3));
                    aVar3.j();
                } else {
                    aVar3 = M;
                    aVar3.K(-95799452);
                    pair = new Pair(pg90.a(cVar.a, 0, aVar3), d370.N(cVar.b, 0, aVar3));
                    aVar3.j();
                }
                lg90 lg90Var = (lg90) pair.d();
                String str = (String) pair.g();
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                xpy xpyVar = new xpy(1.0f, true);
                boolean J = ((i2 & 112) == 32) | aVar3.J(cVar);
                Object x = aVar3.x();
                if (J || x == a.C0011a.a) {
                    x = new u14(20, qvm0Var2, cVar);
                    aVar3.R(x);
                }
                M = aVar3;
                a.f(24584, M, str, (gzs) x, xpyVar, lg90Var);
            }
            aVar2 = M;
            aVar2.j();
            aVar2.G();
            lrq0Var = this;
            lrq0Var.d(6, aVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            qvm0Var2 = qvm0Var;
            aVar2 = M;
            lrq0Var = this;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            fxVar = new fx(i, 5, lrq0Var, list, qvm0Var2);
            s.d = fxVar;
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var, lg90 lg90Var) {
        androidx.compose.runtime.a M = aVar.M(-751623529);
        int i2 = i | (M.y(lg90Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-751623529, i2, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.PrimaryToolButton (UserProfileLegoViewerModalMenu.kt:203)");
            }
            xsv0.d(gzsVar, ToolButton$Mode.Tertiary, ToolButton$Appearance.Neutral, q630Var, ToolButton$TextPosition.Bottom, null, lg90Var, new pco(36), str, false, null, false, null, M, ((i2 >> 6) & 14) | 100688304 | (i2 & 7168) | 2097152 | ((i2 << 18) & 3670016) | ((i2 << 24) & 1879048192), 0, 31904);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rz7(this, lg90Var, str, gzsVar, q630Var, i, 2);
        }
    }

    public final void g(b bVar, qvm0 qvm0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-163742894);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(qvm0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-163742894, i2, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.ViewerMenuContent (UserProfileLegoViewerModalMenu.kt:117)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            List list = bVar.a;
            int i3 = (i2 & 112) | 384;
            lrq0 lrq0Var = a;
            lrq0Var.e(list, qvm0Var, M, i3);
            lrq0Var.a(bVar.b, qvm0Var, M, i3);
            lrq0Var.b(bVar.c, qvm0Var, M, i3);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fn7(i, 9, this, bVar, qvm0Var);
        }
    }
}
