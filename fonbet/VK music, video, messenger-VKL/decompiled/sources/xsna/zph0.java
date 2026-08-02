package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bph0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.s600;

/* compiled from: SearchDatabaseViewContent.kt */
/* loaded from: classes5.dex */
public final class zph0<Item> extends i6v0<com.vk.search.params.impl.presentation.modal.database.mvi.model.b<Item>, bph0> {
    public final xqi<b.a<mph0>> f;
    public final vph0 g;
    public final mh h;
    public final qh i;
    public final wh50<tho0> j;
    public final hcw0 k;

    /* compiled from: SearchDatabaseViewContent.kt */
    @b6l(c = "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent$GeoLocationListItemDraw$1$1$1", f = "SearchDatabaseViewContent.kt", l = {264}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ s600 $animatable;
        final /* synthetic */ s700 $composition$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s600 s600Var, s700 s700Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$animatable = s600Var;
            this.$composition$delegate = s700Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$animatable, this.$composition$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                s600 s600Var = this.$animatable;
                i700 value = this.$composition$delegate.getValue();
                this.label = 1;
                if (s600.a.a(s600Var, value, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, this, 2046) == coroutineSingletons) {
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

    /* compiled from: SearchDatabaseViewContent.kt */
    @b6l(c = "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent$ItemsList$1$1$1", f = "SearchDatabaseViewContent.kt", l = {206}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ nek0 $keyboardController;
        final /* synthetic */ xvy $listState;
        int label;

        /* compiled from: SearchDatabaseViewContent.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ nek0 b;

            public a(nek0 nek0Var) {
                this.b = nek0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                nek0 nek0Var;
                if (((Boolean) obj).booleanValue() && (nek0Var = this.b) != null) {
                    nek0Var.hide();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xvy xvyVar, nek0 nek0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$listState = xvyVar;
            this.$keyboardController = nek0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$listState, this.$keyboardController, spjVar);
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
                izg0 M = nr2.M(new x750(this.$listState, 17));
                a aVar = new a(this.$keyboardController);
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

    /* compiled from: SearchDatabaseViewContent.kt */
    public static final class c implements izs<iph0, s3q0> {
        public final /* synthetic */ izs<bph0, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(izs<? super bph0, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(iph0 iph0Var) {
            iph0 iph0Var2 = iph0Var;
            int i = iph0Var2.b;
            izs<bph0, s3q0> izsVar = this.b;
            if (i == Integer.MIN_VALUE) {
                izsVar.invoke(bph0.e.b);
            } else {
                izsVar.invoke(new bph0.c(iph0Var2.f));
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchDatabaseViewContent.kt */
    @b6l(c = "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent$ItemsList$1$2$1$2$1$1", f = "SearchDatabaseViewContent.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<bph0, s3q0> $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(izs<? super bph0, s3q0> izsVar, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAction.invoke(bph0.d.b);
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public e(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class f implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ zph0 d;

        public f(List list, izs izsVar, zph0 zph0Var) {
            this.b = list;
            this.c = izsVar;
            this.d = zph0Var;
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
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                hfz hfzVar = (hfz) this.b.get(intValue);
                aVar2.K(-480722957);
                boolean z = hfzVar instanceof iph0;
                izs<? super bph0, s3q0> izsVar = this.c;
                if (z) {
                    aVar2.K(261589268);
                    iph0 iph0Var = (iph0) hfzVar;
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new c(izsVar);
                        aVar2.R(x);
                    }
                    aqh0.d(iph0Var, (izs) x, aVar2, 0);
                    aVar2.j();
                } else {
                    if (hfzVar instanceof ykt) {
                        aVar2.K(261611568);
                        zph0 zph0Var = this.d;
                        zph0Var.h((ykt) hfzVar, izsVar, zph0Var.i, aVar2, 4096);
                    } else {
                        aVar2.K(-490193055);
                    }
                    aVar2.j();
                }
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

    public zph0(ph phVar, Context context, xqi xqiVar, vph0 vph0Var, mh mhVar, qh qhVar) {
        super(context, phVar);
        this.f = xqiVar;
        this.g = vph0Var;
        this.h = mhVar;
        this.i = qhVar;
        this.j = androidx.compose.runtime.k.b(new tho0("", 0L, 6));
        this.k = new nrl(context, new acw0(new zb60(this, 21)), new o44(0));
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((com.vk.search.params.impl.presentation.modal.database.mvi.model.b) ao50Var, izsVar, aVar, 512);
    }

    public final void h(ykt yktVar, izs<? super bph0, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        com.vk.core.compose.component.cell.content.v a2;
        androidx.compose.runtime.a aVar3;
        com.vk.core.compose.component.cell.content.y0 y0Var;
        androidx.compose.runtime.a M = aVar.M(613984094);
        int i2 = i | (M.J(yktVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(613984094, i2, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent.GeoLocationListItemDraw (SearchDatabaseViewContent.kt:252)");
            }
            float f2 = kqu0.t;
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 7), "search_database_geo_item");
            com.vk.core.compose.component.cell.content.j0 a3 = Cell$Left.Main.a.C0731a.a(kai.c(1749475882, new wph0(yktVar, 0), M), M);
            String N = d370.N(R.string.search_params_my_location_title, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = new azt(23);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.f1 a4 = RichCell$Middle.h.b.a(N, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14);
            String str = yktVar.c;
            if (str == null) {
                Integer num = yktVar.d;
                str = num != null ? this.c.getString(num.intValue()) : null;
                if (str == null) {
                    str = "";
                }
            }
            boolean z = yktVar.e;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = new h2h0(1);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.f1 a5 = RichCell$Middle.g.b.a(str, z, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 196608, 12);
            Integer num2 = yktVar.h;
            if (num2 == null) {
                M.K(-1063618665);
                M.j();
                aVar3 = M;
                c0012a = c0012a2;
                a2 = null;
            } else {
                M.K(-1063618664);
                String N2 = d370.N(num2.intValue(), 0, M);
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonStyle buttonStyle = ButtonStyle.Link;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                Object x3 = M.x();
                if (x3 == c0012a2) {
                    x3 = new vsq(27);
                    M.R(x3);
                }
                c0012a = c0012a2;
                a2 = RichCell$Middle.a.C0734a.a(buttonStyle, buttonAppearance, buttonSize, N2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), gzsVar, M, 438, (57344 & (i2 << 6)) | 196608, 8176);
                aVar3 = M;
                aVar3.j();
            }
            androidx.compose.runtime.a aVar5 = aVar3;
            com.vk.core.compose.component.cell.content.b1 a6 = RichCell$Middle.b.a(null, a4, a5, null, null, a2, null, null, null, aVar5, 0, 1971);
            if (yktVar.f) {
                aVar5.K(1628276812);
                com.vk.core.compose.component.cell.content.y0 e2 = aqh0.e(aVar5);
                aVar5.j();
                y0Var = e2;
            } else {
                aVar5.K(-1063006849);
                aVar5.j();
                y0Var = null;
            }
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x4 = aVar5.x();
            if (z2 || x4 == c0012a) {
                x4 = new k75(13, izsVar, yktVar);
                aVar5.R(x4);
            }
            ygv0.a(E, a3, a6, y0Var, (gzs) x4, aVar5, 0, 32);
            ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar4, 1.0f)), aVar5, 54, 0);
            aVar2 = aVar5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xph0(this, yktVar, izsVar, gzsVar, i);
        }
    }

    public final void i(b.a.C1766a<?> c1766a, izs<? super bph0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(964391829);
        int i2 = i | (M.J(c1766a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(964391829, i2, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent.ItemsList (SearchDatabaseViewContent.kt:192)");
            }
            Object d2 = jk50.d(c1766a.a, EmptyList.b, M, 48);
            q630.a aVar2 = q630.a.a;
            q630 t = n34.t(txj0.d(aVar2, 1.0f), dz5.I(0, 1, M, false), null);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, t);
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
            k9q0.w(M, d3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            xvy a2 = zvy.a(0, 3, M);
            nek0 nek0Var = (nek0) M.r(uvi.q);
            boolean J = M.J(a2) | M.J(nek0Var);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new b(a2, nek0Var, null);
                M.R(x);
            }
            bap.g(a2, (wzs) x, M, 0);
            q630 E = ahn.E(txj0.d(aVar2, 1.0f), "search_database_result_list");
            boolean J2 = ((i2 & 112) == 32) | M.J(d2) | ((i2 & 896) == 256 || M.y(this));
            Object x2 = M.x();
            if (J2 || x2 == obj) {
                x2 = new ync(d2, izsVar, this, 9);
                M.R(x2);
            }
            lqy.a(E, a2, null, null, null, null, false, null, (izs) x2, M, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v(i, 9, this, c1766a, izsVar);
        }
    }

    public final void j(com.vk.search.params.impl.presentation.modal.database.mvi.model.b<Item> bVar, final izs<? super bph0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1220470005);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1220470005, i2, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent.ThemedContent (SearchDatabaseViewContent.kt:101)");
            }
            final wh50<b.a<mph0>> wh50Var = this.f.e;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = "";
                M.R("");
            }
            zak0 zak0Var = (zak0) this.j;
            if (!epx.f(((tho0) zak0Var.getValue()).a.c, (String) x)) {
                izsVar.invoke(new bph0.f(((tho0) zak0Var.getValue()).a.c));
            }
            float f2 = 12;
            q630 d2 = rte0.d(q630.a.a, vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            jai c2 = kai.c(-1117854916, new hq5(this, 16), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(d2, c2, null, null, null, 0, ylu0Var.getBackground().r, 0L, kai.c(392382545, new yzs() { // from class: xsna.yph0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(392382545, intValue, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent.ThemedContent.<anonymous> (SearchDatabaseViewContent.kt:115)");
                        }
                        b.a aVar4 = (b.a) wh50Var.getValue();
                        boolean z = aVar4 instanceof b.a.C1766a;
                        izs<? super bph0, s3q0> izsVar2 = izsVar;
                        if (z) {
                            aVar3.K(-1432461645);
                            zph0.this.i((b.a.C1766a) aVar4, izsVar2, aVar3, 512);
                            aVar3.j();
                        } else if (epx.f(aVar4, b.a.d.a)) {
                            aVar3.K(-1432243591);
                            aqh0.c(0, aVar3);
                            aVar3.j();
                        } else if (epx.f(aVar4, b.a.C1767b.a)) {
                            aVar3.K(-1432125605);
                            aqh0.a(0, aVar3);
                            aVar3.j();
                        } else if (epx.f(aVar4, b.a.c.a)) {
                            aVar3.K(-1432007960);
                            boolean J = aVar3.J(izsVar2);
                            Object x2 = aVar3.x();
                            if (J || x2 == a.C0011a.a) {
                                x2 = new zn1(izsVar2, 11);
                                aVar3.R(x2);
                            }
                            aqh0.b((gzs) x2, aVar3, 0);
                            aVar3.j();
                        } else {
                            if (!(aVar4 instanceof b.a.e)) {
                                throw alb0.c(-877495112, aVar3);
                            }
                            aVar3.K(-1431846481);
                            aVar3.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 805306416, 380);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fy7(i, 11, this, bVar, izsVar);
        }
    }

    public final void k(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1958470680);
        int i2 = i | (M.y(this) ? 4 : 2);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1958470680, i2, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent.Toolbar (SearchDatabaseViewContent.kt:141)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f2 = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
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
            k9q0.w(M, c2, cri.a.d);
            vph0 vph0Var = this.g;
            String N = d370.N(vph0Var.a, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new j0r(29);
                M.R(x);
            }
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(N, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14), null, null, null, M, 14);
            String N2 = d370.N(R.string.talkback_ic_back, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new p7x(21);
                M.R(x2);
            }
            muv0.h(a3, null, null, null, null, TopBar$Before.d.a.a(N2, this.h, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 24576, 4), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            String N3 = d370.N(vph0Var.b, 0, M);
            tho0 tho0Var = (tho0) ((zak0) this.j).getValue();
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || M.y(this);
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new or50(this, 20);
                M.R(x3);
            }
            izs izsVar = (izs) x3;
            q630 E = s200.E(txj0.f(aVar3, 1.0f), kqu0.b, kqu0.t);
            if (i3 != 4 && !M.y(this)) {
                z = false;
            }
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new e550(this, 23);
                M.R(x4);
            }
            lkg0 a4 = vlh0.a(3072, 5, M, null, null, (gzs) x4);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new k990(16);
                M.R(x5);
            }
            fiv0.a(N3, tho0Var, izsVar, E, null, a4, null, null, null, null, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), false, false, M, 0, 0, 28624);
            aVar2 = M;
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
            s.d = new com.vk.movika.tools.controls.seekbar.p(this, i, 12);
        }
    }
}
