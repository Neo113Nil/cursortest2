package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.DiagonalUserStackSize;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.xcc;

/* compiled from: UserStackScreenContent.kt */
/* loaded from: classes18.dex */
public final class wzq0 implements yah0 {
    public final ListBuilder b;
    public final ListBuilder c;

    /* compiled from: UserStackScreenContent.kt */
    public static final class a implements wq5<String> {
        public static final a b = new a();

        @Override // xsna.wq5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(String str, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(327724634);
            if ((i & 6) == 0) {
                i2 = (M.J(str) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(yzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            int i3 = i2;
            if (M.t(i3 & 1, (i3 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(327724634, i3, -1, "com.vk.design.demo.presentation.screens.UserStackScreenContent.UserStackComposeContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (UserStackScreenContent.kt:143)");
                }
                if (as.a((i3 & 112) | 8, yzsVar, fwu0.l(str, null, null, null, M, i3 & 14, 62), M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new n1k(i, 4, this, str, yzsVar);
            }
        }
    }

    /* compiled from: UserStackScreenContent.kt */
    public static final class b implements wq5<String> {
        public static final b b = new b();

        @Override // xsna.wq5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(String str, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1637153037);
            if ((i & 6) == 0) {
                i2 = (M.J(str) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(yzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            int i3 = i2;
            if (M.t(i3 & 1, (i3 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1637153037, i3, -1, "com.vk.design.demo.presentation.screens.UserStackScreenContent.UserStackComposeContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (UserStackScreenContent.kt:163)");
                }
                if (as.a((i3 & 112) | 8, yzsVar, fwu0.l(str, null, null, null, M, i3 & 14, 62), M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new sol(i, 5, this, str, yzsVar);
            }
        }
    }

    /* compiled from: UserStackScreenContent.kt */
    public static final class c implements ixj {
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // xsna.ixj
        public final void e(yzs<? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1890449109);
            if ((i & 6) == 0) {
                i2 = (M.y(yzsVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1890449109, i2, -1, "com.vk.design.demo.presentation.screens.UserStackScreenContent.UserStackComposeContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (UserStackScreenContent.kt:166)");
                }
                yzsVar.invoke(Integer.valueOf(this.b), M, Integer.valueOf((i2 << 3) & 112));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new u67(this, yzsVar, i, 5);
            }
        }
    }

    /* compiled from: UserStackScreenContent.kt */
    public static final class d implements wq5<String> {
        public static final d b = new d();

        @Override // xsna.wq5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(String str, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(488897677);
            if ((i & 6) == 0) {
                i2 = (M.J(str) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(yzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            int i3 = i2;
            if (M.t(i3 & 1, (i3 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(488897677, i3, -1, "com.vk.design.demo.presentation.screens.UserStackScreenContent.UserStackComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (UserStackScreenContent.kt:178)");
                }
                if (as.a((i3 & 112) | 8, yzsVar, fwu0.l(str, null, null, null, M, i3 & 14, 62), M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new q5v(i, 5, this, str, yzsVar);
            }
        }
    }

    public wzq0() {
        ListBuilder e = e43.e();
        e.add("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg");
        e.add("https://sun9-28.userapi.com/c854120/v854120167/11c411/dc9U6UnH86k.jpg");
        e.add("https://sun9-9.userapi.com/92JU6sQELiAZ5vopNPN87bGzxrNsD_PshYoyTA/h4JKcoub8qE.jpg");
        this.b = e.g();
        ListBuilder e2 = e43.e();
        e2.add("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg");
        e2.add("https://sun9-28.userapi.com/c854120/v854120167/11c411/dc9U6UnH86k.jpg");
        e2.add("https://sun9-9.userapi.com/92JU6sQELiAZ5vopNPN87bGzxrNsD_PshYoyTA/h4JKcoub8qE.jpg");
        this.c = e2.g();
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 c2;
        androidx.compose.runtime.a M = aVar.M(1837954545);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
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
                androidx.compose.runtime.b.f(1837954545, i2, -1, "com.vk.design.demo.presentation.screens.UserStackScreenContent.Content (UserStackScreenContent.kt:73)");
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            q630 f = txj0.f(p490.D(aVar2, p490.x(M), 14), 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, f);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c3, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("User Stack", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            TopBar$Before.e a4 = TopBar$Before.e.a.a(b2, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(376642931);
                c2 = jh.c(qzu0.a, M);
            } else {
                M.K(376643764);
                c2 = j8.c(qzu0.a, M);
            }
            muv0.h(a3, null, null, null, null, a4, d.a.a(d.c.C0760d.a.a(c2, null, gzsVar2, null, null, null, M, 1572872 | ((i4 << 3) & 896), 58), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            djn0.a(true, false, M, 54, 2);
            q630 D2 = s200.D(aVar2, 4);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(8), aVar3, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, D2);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.i.a(1);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            bap.g(s3q0.a, new vzq0(this, ref$ObjectRef, rg50Var, null), M, 6);
            b(rg50Var.getIntValue(), (i4 >> 12) & 112, M);
            M.G();
            djn0.a(false, true, M, 390, 1);
            ae2.a(0, 6, M, new ll1(29, this, ref$ObjectRef), null, null);
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
            s.d = new hoh0(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(final int i, final int i2, androidx.compose.runtime.a aVar) {
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(727104759);
        int i3 = (i2 & 6) == 0 ? (M.o(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= M.J(this) ? 32 : 16;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(727104759, i4, -1, "com.vk.design.demo.presentation.screens.UserStackScreenContent.UserStackComposeContent (UserStackScreenContent.kt:130)");
            }
            M.K(1658161181);
            Iterator<E> it = UserStackSize.h().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c0012a = a.C0011a.a;
                if (!hasNext) {
                    break;
                }
                UserStackSize userStackSize = (UserStackSize) it.next();
                boolean z = (i4 & 112) == 32;
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new tzq0(this, 0);
                    M.R(x);
                }
                hyv0.c(null, userStackSize, null, (izs) x, M, 0, 5);
            }
            M.j();
            M.K(1658800463);
            for (UserStackSize userStackSize2 : UserStackSize.h()) {
                xcc.a.e eVar = xcc.a.e.a;
                boolean z2 = ((i4 & 112) == 32) | ((i4 & 14) == 4);
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new hu1(this, i, 4);
                    M.R(x2);
                }
                hyv0.e(null, userStackSize2, eVar, (izs) x2, M, 6);
            }
            M.j();
            q630 D = s200.D(q630.a.a, 4);
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            M.K(607375333);
            for (DiagonalUserStackSize diagonalUserStackSize : DiagonalUserStackSize.h()) {
                xcc.a.c cVar = xcc.a.c.a;
                boolean z3 = (i4 & 112) == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new qzl0(this, 11);
                    M.R(x3);
                }
                hyv0.b(null, diagonalUserStackSize, cVar, (izs) x3, M, 0, 1);
                c0012a = c0012a;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.uzq0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    wzq0.this.b(i, I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
