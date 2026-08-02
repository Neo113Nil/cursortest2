package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.IconButtonAppearance;
import com.vk.core.compose.component.defaults.IconButtonSize;
import com.vk.core.compose.component.defaults.b;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: IconButtonScreenContent.kt */
/* loaded from: classes18.dex */
public final class ppv implements yah0 {
    public final List b = e43.l(Boolean.TRUE, Boolean.FALSE);

    /* compiled from: IconButtonScreenContent.kt */
    public static final class a implements gzs<s3q0> {
        public static final a b = new a();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ d37 b;
        public final /* synthetic */ wow c;

        public b(d37 d37Var, wow wowVar) {
            this.b = d37Var;
            this.c = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return this.b.invoke(this.c.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public c(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;

        public d(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                qpv qpvVar = (qpv) this.b.b.get(intValue);
                aVar2.K(436654699);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(297290428, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronLeftOutline28> (VkSdkIcons.kt:454)");
                }
                lg90 b = or.b(aVar2, 356758943, R.drawable.vk_icon_chevron_left_outline_28, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 D = s200.D(q630.a.a, 4);
                com.vk.core.compose.component.defaults.b bVar = qpvVar.d;
                IconButtonSize iconButtonSize = qpvVar.a;
                boolean z = qpvVar.b;
                IconButtonAppearance iconButtonAppearance = qpvVar.c;
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = a.b;
                    aVar2.R(x);
                }
                nzu0.a((gzs) x, b, null, D, iconButtonAppearance, iconButtonSize, bVar, z, false, null, false, null, null, aVar2, 3526, 7936);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        gzs gzsVar4;
        lg90 c2;
        androidx.compose.runtime.a M = aVar.M(-1939228631);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 32 : 16;
        } else {
            gzsVar4 = gzsVar2;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73747 & i2) != 73746)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1939228631, i2, -1, "com.vk.design.demo.presentation.screens.IconButtonScreenContent.Content (IconButtonScreenContent.kt:38)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, f);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("IconButton", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a4 = TopBar$Before.e.a.a(b2, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(215879979);
                c2 = jh.c(qzu0.a, M);
            } else {
                M.K(215880812);
                c2 = j8.c(qzu0.a, M);
            }
            muv0.h(a3, null, null, null, null, a4, d.a.a(d.c.C0760d.a.a(c2, null, gzsVar4, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            djn0.a(true, false, M, 54, 2);
            rrv0.d(null, null, null, null, kai.c(-1847822460, new com.vk.movika.tools.controls.seekbar.p(this, 5), M), M, 24576, 15);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d4o(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(832661635);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(832661635, i2, -1, "com.vk.design.demo.presentation.screens.IconButtonScreenContent.IconButtonsContent (IconButtonScreenContent.kt:64)");
            }
            int i3 = i2 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2074395657, i3, -1, "com.vk.design.demo.presentation.screens.IconButtonScreenContent.iconButtonVariants (IconButtonScreenContent.kt:86)");
            }
            M.K(-629398822);
            ListBuilder e = e43.e();
            M.K(-629398208);
            for (IconButtonAppearance iconButtonAppearance : IconButtonAppearance.h()) {
                M.K(-629396689);
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    boolean booleanValue = ((Boolean) it.next()).booleanValue();
                    M.K(-629395418);
                    for (IconButtonSize iconButtonSize : IconButtonSize.h()) {
                        e.add(new qpv(iconButtonSize, booleanValue, iconButtonAppearance, b.d.a));
                        e.add(new qpv(iconButtonSize, booleanValue, iconButtonAppearance, new b.a(0)));
                        e.add(new qpv(iconButtonSize, booleanValue, iconButtonAppearance, new b.c()));
                        qzu0.a.getClass();
                        e.add(new qpv(iconButtonSize, booleanValue, iconButtonAppearance, new b.C0741b(qzu0.a(M))));
                    }
                    M.j();
                }
                M.j();
            }
            M.j();
            ListBuilder g = e.g();
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 d2 = txj0.d(q630.a.a, 1.0f);
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.o;
            boolean J = M.J(g);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new uoh(g, 26);
                M.R(x);
            }
            lqy.a(d2, null, null, null, aVar2, null, false, null, (izs) x, M, 196614, 478);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.s(this, i, 10);
        }
    }
}
