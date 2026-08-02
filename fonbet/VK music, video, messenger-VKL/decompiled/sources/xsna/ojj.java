package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.pkj;
import xsna.q630;
import xsna.ty6;
import xsna.wra0;
import xsna.zra0;

/* compiled from: ContentProductsBottomSheetContent.kt */
/* loaded from: classes18.dex */
public final class ojj {

    /* compiled from: ContentProductsBottomSheetContent.kt */
    @b6l(c = "com.vk.ecomm.contentproducts.view.ContentProductsBottomSheetContentKt$ContentProductsBottomSheetContent$2$1", f = "ContentProductsBottomSheetContent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<z37<xij>, ckj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<ckj, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super ckj, s3q0> izsVar, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<xij> z37Var, ckj ckjVar, spj<? super s3q0> spjVar) {
            a aVar = new a(this.$onEvent, spjVar);
            aVar.L$0 = ckjVar;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ckj ckjVar = (ckj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(ckjVar);
            return s3q0.a;
        }
    }

    /* compiled from: ContentProductsBottomSheetContent.kt */
    @b6l(c = "com.vk.ecomm.contentproducts.view.ContentProductsBottomSheetContentKt$TrackItemsView$2$1$1", f = "ContentProductsBottomSheetContent.kt", l = {341}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<List<Integer>> $fullyVisibleItems;
        final /* synthetic */ izs<List<Integer>, s3q0> $onAction;
        int label;

        /* compiled from: ContentProductsBottomSheetContent.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ izs<List<Integer>, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(izs<? super List<Integer>, s3q0> izsVar) {
                this.b = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                this.b.invoke((List) obj);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(spj spjVar, izs izsVar, mtk0 mtk0Var) {
            super(2, spjVar);
            this.$fullyVisibleItems = mtk0Var;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(spjVar, this.$onAction, this.$fullyVisibleItems);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new com.vk.movika.sdk.base.model.e(this.$fullyVisibleItems, 27));
                a aVar = new a(this.$onAction);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public static final void a(mm50<mkj, xij, ckj> mm50Var, izs<? super ckj, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(94490321);
        int i2 = (M.y(mm50Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(94490321, i2, -1, "com.vk.ecomm.contentproducts.view.ContentProductsBottomSheetContent (ContentProductsBottomSheetContent.kt:83)");
            }
            ((View) M.r(AndroidCompositionLocals_androidKt.f)).setTag("AndroidComposeView");
            boolean y = M.y(mm50Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new s6(mm50Var, 27);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new a(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(-620558121, new kjj(mm50Var, 0), M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dsg(mm50Var, izsVar, i, 2);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(510028936);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(510028936, i, -1, "com.vk.ecomm.contentproducts.view.EmptyPlaceholder (ContentProductsBottomSheetContent.kt:306)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ldv0.d(ra8.a.b(q630.a.a, dt1.a.f), null, zra0.a.a(null, null, d370.N(R.string.content_product_empty_list, 0, M), null, M, 196608, 27), null, null, null, false, M, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
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
            s.d = new gjj(q630Var, i, 0);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(689426240);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(689426240, i3, -1, "com.vk.ecomm.contentproducts.view.ErrorPlaceholder (ContentProductsBottomSheetContent.kt:280)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 b2 = ra8.a.b(q630.a.a, dt1.a.f);
            vl20 a2 = zra0.a.a(d370.N(R.string.content_product_error_title, 0, M), null, d370.N(R.string.content_product_error_description, 0, M), null, M, 196608, 26);
            String N = d370.N(R.string.content_product_error_retry, 0, M);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new k74(izsVar, 2);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(b2, null, a2, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, null, ButtonStyle.Primary, null, false, null, null, null, null, null, null, false, false, null, null, aVar2, 3072, 12582912, 131060), null, null, aVar2, 14), null, null, false, aVar2, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ad2(q630Var, izsVar, i, 2);
        }
    }

    public static final void d(izs izsVar, hpd0 hpd0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1971849754);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(hpd0Var) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1971849754, i2, -1, "com.vk.ecomm.contentproducts.view.ProductTile (ContentProductsBottomSheetContent.kt:266)");
            }
            MarketProductTileConfig marketProductTileConfig = hpd0Var.c;
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i3 == 4) | (i4 == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new pjj(izsVar, hpd0Var);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i3 == 4) | (i4 == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new qjj(izsVar, hpd0Var);
                M.R(x2);
            }
            izs izsVar3 = (izs) x2;
            boolean z3 = (i3 == 4) | (i4 == 32);
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new rjj(izsVar, hpd0Var);
                M.R(x3);
            }
            izs izsVar4 = (izs) x3;
            q630.a aVar2 = q630.a.a;
            com.vk.ecomm.design.compose.tile.a.a(marketProductTileConfig, aVar2, null, izsVar2, izsVar3, izsVar4, M, 48, 68);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h06(i, 2, izsVar, hpd0Var, q630Var2);
        }
    }

    public static final void e(final List list, final List list2, final String str, final dsy dsyVar, q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(221985624);
        int i2 = (M.y(izsVar) ? 131072 : 65536) | i | (M.J(list) ? 4 : 2) | (M.J(list2) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.J(dsyVar) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(221985624, i2, -1, "com.vk.ecomm.contentproducts.view.ProductsGreed (ContentProductsBottomSheetContent.kt:200)");
            }
            q630.a aVar3 = q630.a.a;
            q630 t = n34.t(txj0.z(txj0.f(aVar3, 1.0f), null, 3), dz5.I(0, 1, M, false), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(t, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            efu.b bVar = new efu.b(2);
            float f = 10;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            a.j g2 = androidx.compose.foundation.layout.a.g(2);
            u890 u890Var = new u890(f, f, f, 12);
            boolean z = ((i2 & 14) == 4) | ((458752 & i2) == 131072) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                aVar2 = aVar3;
                hjj hjjVar = new hjj(list, list2, str, izsVar, 0);
                M.R(hjjVar);
                x = hjjVar;
            } else {
                aVar2 = aVar3;
            }
            uqy.b(bVar, m, dsyVar, u890Var, g, g2, null, false, null, (izs) x, M, ((i2 >> 3) & 896) | 1769472, 0, 912);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(list, list2, str, dsyVar, q630Var2, izsVar, i) { // from class: xsna.ijj
                public final /* synthetic */ List b;
                public final /* synthetic */ List c;
                public final /* synthetic */ String d;
                public final /* synthetic */ dsy e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ izs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ojj.e(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(pkj pkjVar, izs<? super xij, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        pkj pkjVar2;
        int i3;
        String a2;
        String str;
        androidx.compose.runtime.a aVar2;
        int i4;
        Object x;
        pkj.a aVar3;
        com.vk.core.compose.component.topbar.a aVar4;
        androidx.compose.runtime.a M = aVar.M(-140302906);
        if ((i & 6) == 0) {
            i2 = i | (M.J(pkjVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-140302906, i5, -1, "com.vk.ecomm.contentproducts.view.ProductsInPost (ContentProductsBottomSheetContent.kt:106)");
            }
            boolean z = pkjVar instanceof pkj.a;
            pkj.a aVar5 = z ? (pkj.a) pkjVar : null;
            int i6 = aVar5 != null ? aVar5.e : 0;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.i.a(0);
                M.R(x2);
            }
            rg50 rg50Var = (rg50) x2;
            q630.a aVar6 = q630.a.a;
            float f = 12;
            q630 d = rte0.d(txj0.f(aVar6, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().r;
            e.a aVar7 = androidx.compose.ui.graphics.e.a;
            q630 m = hr80.m(d, j, aVar7);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new njj(0, rg50Var);
                M.R(x3);
            }
            q630 o = egi.o(m, (izs) x3);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, o);
            cri.h7.getClass();
            LayoutNode.a aVar8 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar8);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 z2 = txj0.z(aVar6, null, 3);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, z2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar8);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m2 = hr80.m(aVar6, ylu0Var2.getBackground().r, aVar7);
            int i7 = i5 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(517661081, i7, -1, "com.vk.ecomm.contentproducts.view.getTitle (ContentProductsBottomSheetContent.kt:320)");
            }
            if (z) {
                M.K(-743902626);
                M.j();
                str = ((pkj.a) pkjVar).b;
            } else if (pkjVar instanceof pkj.d) {
                M.K(-1586092443);
                M.j();
                str = "";
            } else {
                i3 = 0;
                a2 = zq.a(M, -743900264, R.string.content_product_products_in_post_title, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i8 = i3;
                TopBar$Middle.Text.Title a4 = TopBar$Middle.Text.Title.b.a(a2, null, null, null, null, M, 196608, 30);
                aVar2 = M;
                TopBar$Middle.Text a5 = TopBar$Middle.Text.b.a(a4, null, null, null, aVar2, 14);
                String N = d370.N(R.string.content_product_talkback_close, i8, aVar2);
                int i9 = i5 & 112;
                i4 = i9 != 32 ? 1 : i8;
                x = aVar2.x();
                if (i4 == 0 || x == c0012a) {
                    x = new nse(izsVar, 1);
                    aVar2.R(x);
                }
                TopBar$Before.d a6 = TopBar$Before.d.a.a(N, (gzs) x, null, null, aVar2, 24576, 12);
                aVar3 = !z ? (pkj.a) pkjVar : null;
                if (aVar3 != null) {
                    if (aVar3.g) {
                        aVar2.K(-9070304);
                        int i10 = i9 != 32 ? i8 : 1;
                        Object x4 = aVar2.x();
                        if (i10 != 0 || x4 == c0012a) {
                            x4 = new ln7(izsVar, 2);
                            aVar2.R(x4);
                        }
                        d.c.C0760d b2 = dx9.b(i6, (gzs) x4, null, aVar2, 0, 4);
                        aVar2 = aVar2;
                        com.vk.core.compose.component.topbar.a a7 = d.a.a(b2, null, null, null, aVar2, 24576, 14);
                        aVar2.j();
                        aVar4 = a7;
                        androidx.compose.runtime.a aVar9 = aVar2;
                        muv0.h(a5, m2, null, null, null, a6, aVar4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar9, 0, 0, 8092);
                        M = aVar9;
                        if (z) {
                            M.K(-8588161);
                            dsy a8 = gsy.a(i8, 3, M);
                            ty6.b bVar2 = dt1.a.m;
                            dtp0 d3 = jq2.d(500, i8, null, 6);
                            Object x5 = M.x();
                            if (x5 == c0012a) {
                                x5 = new k0j(rg50Var, 2);
                                M.R(x5);
                            }
                            pkjVar2 = pkjVar;
                            mm2.b(r9g.a, true, null, anp.d(d3, bVar2, (izs) x5, 4).b(anp.e(null, 3)), anp.k(jq2.d(500, i8, null, 6), dt1.a.k, 12).b(anp.f(null, 3)), null, kai.c(2105026298, new ejj(a8, izsVar, 0, pkjVar2), M), M, 1572918, 18);
                            M = M;
                            M.j();
                        } else {
                            pkjVar2 = pkjVar;
                            if (epx.f(pkjVar2, pkj.d.b)) {
                                M.K(-7181815);
                                zfr0.f(SpinnerState.Loading, txj0.d(aVar6, 0.5f), null, 0L, SpinnerSize.Size56, null, M, 24630, 44);
                                M = M;
                                M.j();
                            } else if (pkjVar2 instanceof pkj.c) {
                                M.K(-6892740);
                                c(i9 | 6, M, izsVar, txj0.c(aVar6, 0.5f));
                                M.j();
                            } else {
                                if (!epx.f(pkjVar2, pkj.b.b)) {
                                    throw alb0.c(553910870, M);
                                }
                                M.K(553974499);
                                b(txj0.c(aVar6, 0.5f), M, 6);
                                M.j();
                            }
                        }
                        if (kr.f(M)) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                }
                aVar2.K(-8733520);
                aVar2.j();
                aVar4 = null;
                androidx.compose.runtime.a aVar92 = aVar2;
                muv0.h(a5, m2, null, null, null, a6, aVar4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar92, 0, 0, 8092);
                M = aVar92;
                if (z) {
                }
                if (kr.f(M)) {
                }
            }
            a2 = str;
            i3 = 0;
            if (androidx.compose.runtime.b.d()) {
            }
            int i82 = i3;
            TopBar$Middle.Text.Title a42 = TopBar$Middle.Text.Title.b.a(a2, null, null, null, null, M, 196608, 30);
            aVar2 = M;
            TopBar$Middle.Text a52 = TopBar$Middle.Text.b.a(a42, null, null, null, aVar2, 14);
            String N2 = d370.N(R.string.content_product_talkback_close, i82, aVar2);
            int i92 = i5 & 112;
            if (i92 != 32) {
            }
            x = aVar2.x();
            if (i4 == 0) {
            }
            x = new nse(izsVar, 1);
            aVar2.R(x);
            TopBar$Before.d a62 = TopBar$Before.d.a.a(N2, (gzs) x, null, null, aVar2, 24576, 12);
            if (!z) {
            }
            if (aVar3 != null) {
            }
            aVar2.K(-8733520);
            aVar2.j();
            aVar4 = null;
            androidx.compose.runtime.a aVar922 = aVar2;
            muv0.h(a52, m2, null, null, null, a62, aVar4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar922, 0, 0, 8092);
            M = aVar922;
            if (z) {
            }
            if (kr.f(M)) {
            }
        } else {
            pkjVar2 = pkjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fjj(pkjVar2, izsVar, i, 0);
        }
    }

    public static final void g(dsy dsyVar, izs<? super List<Integer>, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1607911727);
        int i2 = (M.J(dsyVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1607911727, i2, -1, "com.vk.ecomm.contentproducts.view.TrackItemsView (ContentProductsBottomSheetContent.kt:331)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new jjj(dsyVar, 0));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            boolean J = M.J(mtk0Var) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new b(null, izsVar, mtk0Var);
                M.R(x2);
            }
            bap.g(mtk0Var, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i8c(dsyVar, izsVar, i, 3);
        }
    }
}
