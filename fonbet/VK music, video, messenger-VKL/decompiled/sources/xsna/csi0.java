package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.vid0;
import xsna.wml0;

/* compiled from: ServicesItem.kt */
/* loaded from: classes18.dex */
public final class csi0 {

    /* compiled from: ServicesItem.kt */
    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.ServicesItemKt$ServiceRow$2$1$1$1", f = "ServicesItem.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<wml0, s3q0> $onAction;
        final /* synthetic */ zni0 $service;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super wml0, s3q0> izsVar, zni0 zni0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$onAction = izsVar;
            this.$service = zni0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$onAction, this.$service, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAction.invoke(new xml0(this.$service.a));
            return s3q0.a;
        }
    }

    /* compiled from: ServicesItem.kt */
    public static final class b implements izs<MarketProductTileConfig.f, s3q0> {
        public final /* synthetic */ izs<wml0, s3q0> b;
        public final /* synthetic */ zni0 c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super wml0, s3q0> izsVar, zni0 zni0Var) {
            this.b = izsVar;
            this.c = zni0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(MarketProductTileConfig.f fVar) {
            String str = fVar.a;
            this.b.invoke(new wml0.a.i(this.c.a));
            return s3q0.a;
        }
    }

    /* compiled from: ServicesItem.kt */
    public static final class c implements izs<MarketProductTileConfig.f, s3q0> {
        public final /* synthetic */ izs<wml0, s3q0> b;
        public final /* synthetic */ zni0 c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(izs<? super wml0, s3q0> izsVar, zni0 zni0Var) {
            this.b = izsVar;
            this.c = zni0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(MarketProductTileConfig.f fVar) {
            String str = fVar.a;
            this.b.invoke(new wml0.a.f(this.c.a));
            return s3q0.a;
        }
    }

    /* compiled from: ServicesItem.kt */
    public static final class d implements izs<MarketProductTileConfig.f, s3q0> {
        public final /* synthetic */ izs<wml0, s3q0> b;
        public final /* synthetic */ zni0 c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(izs<? super wml0, s3q0> izsVar, zni0 zni0Var) {
            this.b = izsVar;
            this.c = zni0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(MarketProductTileConfig.f fVar) {
            String str = fVar.a;
            this.b.invoke(new wml0.a.j(this.c.a));
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.vk.core.compose.component.cell.content.o] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.vk.core.compose.component.cell.content.Cell$Middle$c] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    public static final void a(zni0 zni0Var, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        String str;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        ?? r7;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        ?? r10;
        androidx.compose.runtime.a M = aVar.M(-1191802911);
        int i8 = i | (M.J(zni0Var) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i8 & 1, (i8 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1191802911, i8, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ListServiceItem (ServicesItem.kt:198)");
            }
            long j = zni0Var.a;
            MarketProductTileConfig marketProductTileConfig = zni0Var.b;
            Long valueOf = Long.valueOf(j);
            int i9 = i8 & 896;
            int i10 = i8 & 14;
            boolean z2 = (i9 == 256) | (i10 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new bsi0(izsVar, zni0Var, null);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, 0);
            String str2 = marketProductTileConfig.j;
            if (str2 == null) {
                M.K(1494466654);
                M.j();
                h1Var = null;
                str = null;
                i2 = i9;
                i3 = i10;
            } else {
                M.K(1494466655);
                SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new bqt(23);
                    M.R(x2);
                }
                i2 = i9;
                i3 = i10;
                str = null;
                com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(str2, null, null, 1, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), null, M, 12610560, 70);
                M = M;
                M.j();
                h1Var = a2;
            }
            MarketProductTileConfig.e eVar = marketProductTileConfig.i;
            String str3 = eVar != null ? eVar.a : str;
            if (str3 == null) {
                M.K(1494901584);
                M.j();
                r7 = str;
            } else {
                M.K(1494901585);
                SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.Merge;
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new gky(24);
                    M.R(x3);
                }
                com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(str3, 0, null, null, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x3, 2), M, 12582912, 94);
                M.j();
                r7 = b2;
            }
            androidx.compose.runtime.a aVar2 = M;
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(h1Var, r7, null, null, aVar2, 196608, 28);
            androidx.compose.runtime.a aVar3 = aVar2;
            MarketProductTileConfig.b bVar = marketProductTileConfig.p;
            if (bVar == null) {
                aVar3.K(1495272995);
                aVar3.j();
                i6 = i8;
                r10 = str;
                i4 = i2;
                i5 = i3;
                i7 = 256;
                z = false;
            } else {
                aVar3.K(1495272996);
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                ButtonSize buttonSize = ButtonSize.Medium;
                qzu0.a.getClass();
                lg90 M0 = qzu0.M0(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var.getIcon().b;
                SemanticsConfiguration.Mode mode3 = SemanticsConfiguration.Mode.ClearAndSet;
                boolean J = aVar3.J(bVar);
                Object x4 = aVar3.x();
                if (J || x4 == c0012a) {
                    x4 = new n7b0(bVar, 5);
                    aVar3.R(x4);
                }
                com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(mode3, (izs) x4, 2);
                l5g l5gVar = new l5g(j2);
                int i11 = i2;
                int i12 = i3;
                boolean z3 = (i12 == 4) | (i11 == 256);
                Object x5 = aVar3.x();
                if (z3 || x5 == c0012a) {
                    x5 = new hn9(26, izsVar, zni0Var);
                    aVar3.R(x5);
                }
                i4 = i11;
                z = false;
                i5 = i12;
                i6 = i8;
                i7 = 256;
                com.vk.core.compose.component.cell.content.v a5 = com.vk.core.compose.component.cell.content.k.a(buttonStyle, buttonAppearance, buttonSize, null, M0, l5gVar, null, false, null, a4, (gzs) x5, aVar3, 33206, 1572864, 16328);
                aVar3 = aVar3;
                com.vk.core.compose.component.cell.content.y0 a6 = o.c.a(a5, null, null, null, null, aVar3, 62);
                aVar3.j();
                r10 = a6;
            }
            boolean z4 = (i4 == i7 ? true : z) | (i5 != 4 ? z : true);
            Object x6 = aVar3.x();
            if (z4 || x6 == c0012a) {
                x6 = new rp1(19, izsVar, zni0Var);
                aVar3.R(x6);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            wiu0.b(q630Var, false, null, a3, r10, (gzs) x6, null, aVar4, (i6 >> 3) & 14, 70);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i87(i, 7, zni0Var, q630Var, izsVar);
        }
    }

    public static final void b(final List list, final int i, final boolean z, final izs izsVar, androidx.compose.runtime.a aVar, final int i2) {
        q630 H;
        androidx.compose.runtime.a M = aVar.M(-734728591);
        int i3 = 2048;
        int i4 = i2 | (M.J(list) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        int i5 = 0;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-734728591, i4, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ServiceRow (ServicesItem.kt:252)");
            }
            M.K(-1699530892);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            if (z) {
                M.K(-2048816694);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getBackground().g;
                float f2 = 20;
                H = s200.H(hr80.m(f, j, vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 7);
                M.j();
            } else {
                M.K(1180846959);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                H = s200.H(hr80.m(f, ylu0Var2.getBackground().g, androidx.compose.ui.graphics.e.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 7);
                M.j();
            }
            M.j();
            q630 u = m200.u(s200.F(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, H), IntrinsicSize.Max);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, u);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            spj spjVar = null;
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
            Iterator a3 = yu50.a(M, c2, cri.a.d, 24515912, list);
            while (a3.hasNext()) {
                zni0 zni0Var = (zni0) a3.next();
                Long valueOf = Long.valueOf(zni0Var.a);
                int i6 = i4 & 7168;
                int i7 = (i6 == i3 ? 1 : i5) | (M.J(zni0Var) ? 1 : 0);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                Object obj = x;
                if (i7 != 0 || x == c0012a) {
                    a aVar4 = new a(izsVar, zni0Var, spjVar);
                    M.R(aVar4);
                    obj = aVar4;
                }
                bap.g(valueOf, (wzs) obj, M, i5);
                MarketProductTileConfig marketProductTileConfig = zni0Var.b;
                q630 c3 = txj0.c(aVar2, 1.0f);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 E = ahn.E(c3.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), "service_" + zni0Var.a);
                boolean J = (i6 == 2048) | M.J(zni0Var);
                Object x2 = M.x();
                Object obj2 = x2;
                if (J || x2 == c0012a) {
                    b bVar = new b(izsVar, zni0Var);
                    M.R(bVar);
                    obj2 = bVar;
                }
                izs izsVar2 = (izs) obj2;
                boolean J2 = (i6 == 2048) | M.J(zni0Var);
                Object x3 = M.x();
                Object obj3 = x3;
                if (J2 || x3 == c0012a) {
                    c cVar = new c(izsVar, zni0Var);
                    M.R(cVar);
                    obj3 = cVar;
                }
                izs izsVar3 = (izs) obj3;
                boolean J3 = (i6 == 2048) | M.J(zni0Var);
                Object x4 = M.x();
                if (J3 || x4 == c0012a) {
                    x4 = new d(izsVar, zni0Var);
                    M.R(x4);
                }
                com.vk.ecomm.design.compose.tile.a.a(marketProductTileConfig, E, null, izsVar2, izsVar3, (izs) x4, M, 0, 68);
                i5 = 0;
                spjVar = null;
                i3 = 2048;
            }
            int i8 = i5;
            M.j();
            M.K(24542706);
            int max = Math.max(i8, i);
            while (i5 < max) {
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                f9t.e(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, i8);
                i5++;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(list, i, z, izsVar, i2) { // from class: xsna.asi0
                public final /* synthetic */ List b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ne7.I(1);
                    csi0.b(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj4, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final String str, final String str2, final boolean z, final boolean z2, final izs<? super wml0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        r5j0 r5j0Var;
        ikg0 ikg0Var;
        androidx.compose.runtime.a M = aVar.M(-154274507);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-154274507, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.Title (ServicesItem.kt:124)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            if (z2) {
                float f = 20;
                r5j0Var = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            } else {
                r5j0Var = androidx.compose.ui.graphics.e.a;
            }
            q630 m = hr80.m(q630.a.a, j, r5j0Var);
            b.C0749b c0749b = b.C0749b.a;
            com.vk.core.compose.component.group.header.f a2 = f.a.a(str2, null, null, null, null, null, null, null, false, M, ((i2 >> 3) & 14) | 805306368, 510);
            if (z) {
                M.K(-376255149);
                String N = d370.N(R.string.community_market_show_all, 0, M);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384) | ((i2 & 112) == 32);
                Object x = M.x();
                if (z3 || x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.logic.interactor.n(izsVar, str, str2, 4);
                    M.R(x);
                }
                ikg0Var = GroupHeader$Right.c.a(null, null, GroupHeader$Right.b.a.C0746a.a(3072, 4, M, null, N, (gzs) x), null, M, 11);
                M.j();
            } else {
                M.K(-375916568);
                M.j();
                ikg0Var = null;
            }
            com.vk.core.compose.component.group.header.g.b(a2, m, c0749b, null, null, ikg0Var, false, M, 384, 88);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, str2, z, z2, izsVar, i) { // from class: xsna.xri0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    csi0.c(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final MarketProductTileConfig d() {
        return new MarketProductTileConfig("random_uid", MarketProductTileConfig.ViewerType.Bayer, MarketProductTileConfig.ProductStatusType.Normal, MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE, Collections.singletonList(new Image((List<ImageSize>) Collections.singletonList(new ImageSize(new com.vk.dto.common.im.Image(180, 180, "https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", false), ImageSizeKey.SIZE_KEY_BASE, false, 4, (zcl) null)))), null, false, new MarketProductTileConfig.e("1500₽", "1800₽", 4), "Product name", new MarketProductTileConfig.c("Owner", MarketProductTileConfig.d.a.a), new MarketProductTileConfig.i.b(true), new MarketProductTileConfig.g(4.0f, "48 отзывов"), new MarketProductTileConfig.a(e43.l(vid0.c.a, new vid0.a("40 %"))), new MarketProductTileConfig.b(MarketProductTileConfig.CtaButtonType.Call, "В корзину", true), null, 73808);
    }

    public static final void e(nvy nvyVar, List<esi0> list, boolean z, final boolean z2, boolean z3, xvy xvyVar, final izs<? super wml0, s3q0> izsVar) {
        esi0 esi0Var = (esi0) j5g.a0(list);
        if (esi0Var != null && esi0Var.d.isEmpty()) {
            nvy.g(nvyVar, 52, null, new jai(1598086186, new trc(1, xvyVar, izsVar), true), 2);
            return;
        }
        final int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            final esi0 esi0Var2 = (esi0) obj;
            String str = esi0Var2.b;
            List list2 = esi0Var2.d;
            if (str != null) {
                nvy.g(nvyVar, null, null, new jai(-72279774, new yzs() { // from class: xsna.wri0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-72279774, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.services.<anonymous>.<anonymous> (ServicesItem.kt:102)");
                            }
                            esi0 esi0Var3 = esi0.this;
                            csi0.c(esi0Var3.a, esi0Var3.b, esi0Var3.c, z2 || i != 0, izsVar, aVar, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 3);
            }
            if (z3) {
                final wow wowVar = new wow(list2);
                nvy.c(nvyVar, list2.size(), null, new jai(954409068, new zzs() { // from class: xsna.yri0
                    @Override // xsna.zzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        q630 m;
                        wow wowVar2 = wow.this;
                        List<T> list3 = wowVar2.b;
                        int intValue = ((Integer) obj3).intValue();
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= aVar.o(intValue) ? 32 : 16;
                        }
                        if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(954409068, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.listSection.<anonymous> (ServicesItem.kt:176)");
                            }
                            aVar.K(-1935881156);
                            q630 E = ahn.E(q630.a.a, "service_" + ((zni0) list3.get(intValue)).a);
                            if (intValue == e43.h(new wow(wowVar2))) {
                                aVar.K(-1385391230);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j = ylu0Var.getBackground().g;
                                float f = 20;
                                m = s200.H(hr80.m(E, j, vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 7);
                                aVar.j();
                            } else {
                                aVar.K(-321775583);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                m = hr80.m(E, ylu0Var2.getBackground().g, androidx.compose.ui.graphics.e.a);
                                aVar.j();
                            }
                            aVar.j();
                            csi0.a((zni0) list3.get(intValue), m, izsVar, aVar, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 6);
            } else {
                final wow wowVar2 = new wow(list2);
                final int i3 = z ? 3 : 2;
                final int ceil = (int) Math.ceil(list2.size() / i3);
                nvy.c(nvyVar, ceil, null, new jai(526966453, new zzs() { // from class: xsna.zri0
                    @Override // xsna.zzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        List<T> list3 = wowVar2.b;
                        int intValue = ((Integer) obj3).intValue();
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= aVar.o(intValue) ? 32 : 16;
                        }
                        if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(526966453, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.cardsSection.<anonymous> (ServicesItem.kt:156)");
                            }
                            int i4 = i3;
                            int i5 = intValue * i4;
                            List subList = list3.subList(i5, Math.min(i5 + i4, list3.size()));
                            if (subList.isEmpty()) {
                                aVar.K(745434477);
                            } else {
                                aVar.K(752370386);
                                csi0.b(subList, i4 - subList.size(), intValue == ceil - 1, izsVar, aVar, 0);
                            }
                            aVar.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 6);
            }
            nvy.g(nvyVar, null, null, tki.a, 3);
            i = i2;
        }
    }
}
