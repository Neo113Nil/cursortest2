package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.jdt;
import xsna.o9t;
import xsna.pct;
import xsna.q630;
import xsna.v6p0;

/* compiled from: GamesCatalogMainTabScreen.kt */
/* loaded from: classes17.dex */
public final class pct {

    /* compiled from: GamesCatalogMainTabScreen.kt */
    @b6l(c = "com.vk.games.presentation.catalog.screen.GamesCatalogMainTabScreenKt$GamesCatalogMainTabScreen$1$1", f = "GamesCatalogMainTabScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ x6p0 $topAppBarState;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: GamesCatalogMainTabScreen.kt */
        @b6l(c = "com.vk.games.presentation.catalog.screen.GamesCatalogMainTabScreenKt$GamesCatalogMainTabScreen$1$1$1", f = "GamesCatalogMainTabScreen.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.pct$a$a, reason: collision with other inner class name */
        public static final class C3505a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ x6p0 $topAppBarState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3505a(x6p0 x6p0Var, spj<? super C3505a> spjVar) {
                super(2, spjVar);
                this.$topAppBarState = x6p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3505a(this.$topAppBarState, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3505a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                x6p0 x6p0Var = this.$topAppBarState;
                x6p0Var.e(x6p0Var.a() < 0.5f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.$topAppBarState.c());
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x6p0 x6p0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$topAppBarState = x6p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$topAppBarState, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            myc0.h(yvjVar, null, null, new C3505a(this.$topAppBarState, null), 3);
            return s3q0.a;
        }
    }

    /* compiled from: GamesCatalogMainTabScreen.kt */
    @b6l(c = "com.vk.games.presentation.catalog.screen.GamesCatalogMainTabScreenKt$RenderGameCatalogContent$3$1$1", f = "GamesCatalogMainTabScreen.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<o9t, s3q0> $onAction;
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* compiled from: GamesCatalogMainTabScreen.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ izs<o9t, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(izs<? super o9t, s3q0> izsVar) {
                this.b = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                int intValue = ((Number) obj).intValue();
                GamesCatalogScreenTab gamesCatalogScreenTab = GamesCatalogScreenTab.CATALOG;
                int ordinal = gamesCatalogScreenTab.ordinal();
                izs<o9t, s3q0> izsVar = this.b;
                if (intValue == ordinal) {
                    izsVar.invoke(new o9t.p(gamesCatalogScreenTab));
                } else {
                    GamesCatalogScreenTab gamesCatalogScreenTab2 = GamesCatalogScreenTab.CATEGORIES;
                    if (intValue == gamesCatalogScreenTab2.ordinal()) {
                        izsVar.invoke(new o9t.p(gamesCatalogScreenTab2));
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(mc90 mc90Var, izs<? super o9t, s3q0> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$pagerState, this.$onAction, spjVar);
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
                izg0 M = nr2.M(new odm(this.$pagerState, 11));
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

    /* compiled from: GamesCatalogMainTabScreen.kt */
    @b6l(c = "com.vk.games.presentation.catalog.screen.GamesCatalogMainTabScreenKt$RenderGameCatalogContentLego$3$1$1", f = "GamesCatalogMainTabScreen.kt", l = {229}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<o9t, s3q0> $onAction;
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* compiled from: GamesCatalogMainTabScreen.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ izs<o9t, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(izs<? super o9t, s3q0> izsVar) {
                this.b = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                int intValue = ((Number) obj).intValue();
                GamesCatalogScreenTab gamesCatalogScreenTab = GamesCatalogScreenTab.CATALOG;
                int ordinal = gamesCatalogScreenTab.ordinal();
                izs<o9t, s3q0> izsVar = this.b;
                if (intValue == ordinal) {
                    izsVar.invoke(new o9t.p(gamesCatalogScreenTab));
                } else {
                    GamesCatalogScreenTab gamesCatalogScreenTab2 = GamesCatalogScreenTab.CATEGORIES;
                    if (intValue == gamesCatalogScreenTab2.ordinal()) {
                        izsVar.invoke(new o9t.p(gamesCatalogScreenTab2));
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(mc90 mc90Var, izs<? super o9t, s3q0> izsVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$pagerState, this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new akh(this.$pagerState, 20));
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

    public static final void a(jdt.a aVar, izs<? super o9t, s3q0> izsVar, gzs<s3q0> gzsVar, rha rhaVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-827059585);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(rhaVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-827059585, i2, -1, "com.vk.games.presentation.catalog.screen.GamesCatalogMainTabScreen (GamesCatalogMainTabScreen.kt:43)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new te0(19);
                M.R(x);
            }
            yjl b2 = rc90.b(0, (gzs) x, M, 384, 3);
            x6p0 A = m200.A(M);
            xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new aq0(10);
                M.R(x2);
            }
            rmp a2 = v6p0.a.a(A, (gzs) x2, c2, M, 199728, 20);
            M = M;
            Integer valueOf = Integer.valueOf(((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).orientation);
            boolean J = M.J(A);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new a(A, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            if (rhaVar.d) {
                M.K(1296171607);
                int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                int i4 = i2 << 6;
                c(aVar, izsVar, a2, b2, gzsVar, rhaVar, M, (i4 & 458752) | i3 | (57344 & i4));
                M.j();
            } else {
                M.K(1296475035);
                int i5 = i2 << 6;
                b(aVar, izsVar, a2, b2, gzsVar, rhaVar, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i5 & 57344) | (i5 & 458752));
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jct(aVar, izsVar, gzsVar, rhaVar, i, 0);
        }
    }

    public static final void b(final jdt.a aVar, final izs<? super o9t, s3q0> izsVar, final v6p0 v6p0Var, final mc90 mc90Var, final gzs<s3q0> gzsVar, final rha rhaVar, androidx.compose.runtime.a aVar2, final int i) {
        final gzs<s3q0> gzsVar2;
        rha rhaVar2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-1770928053);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(v6p0Var) ? 256 : 128) | (M.J(mc90Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 16384 : 8192;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((196608 & i) == 0) {
            rhaVar2 = rhaVar;
            i2 |= M.J(rhaVar2) ? 131072 : 65536;
        } else {
            rhaVar2 = rhaVar;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1770928053, i2, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContent (GamesCatalogMainTabScreen.kt:92)");
            }
            wh50 c2 = jk50.c(aVar.e, M);
            wh50 c3 = jk50.c(aVar.b, M);
            q630 d = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            jai c4 = kai.c(357080676, new bl0(v6p0Var, izsVar, mc90Var, c2), M);
            jai c5 = kai.c(-1595606105, new ud6(7, izsVar, c3), M);
            final rha rhaVar3 = rhaVar2;
            aVar3 = M;
            phv0.b(d, c4, null, null, c5, 0, j, 0L, kai.c(-619635089, new yzs() { // from class: xsna.mct
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-619635089, intValue, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContent.<anonymous> (GamesCatalogMainTabScreen.kt:127)");
                        }
                        jdt.a aVar5 = jdt.a.this;
                        final wh50 c6 = jk50.c(aVar5.a, aVar4);
                        final wh50 c7 = jk50.c(aVar5.d, aVar4);
                        final wh50 c8 = jk50.c(aVar5.c, aVar4);
                        s3q0 s3q0Var = s3q0.a;
                        mc90 mc90Var2 = mc90Var;
                        boolean J = aVar4.J(mc90Var2);
                        final izs izsVar2 = izsVar;
                        boolean J2 = J | aVar4.J(izsVar2);
                        Object x = aVar4.x();
                        if (J2 || x == a.C0011a.a) {
                            x = new pct.b(mc90Var2, izsVar2, null);
                            aVar4.R(x);
                        }
                        bap.g(s3q0Var, (wzs) x, aVar4, 6);
                        q630 d2 = txj0.d(q630.a.a, 1.0f);
                        h4o0 A = x19.A(mc90Var2, null, aVar4, 24576, 14);
                        final v6p0 v6p0Var2 = v6p0Var;
                        final rha rhaVar4 = rhaVar3;
                        final gzs gzsVar3 = gzsVar2;
                        nb90.a(mc90Var2, d2, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, A, false, null, null, null, null, kai.c(-606148594, new zzs() { // from class: xsna.ict
                            @Override // xsna.zzs
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                int intValue2 = ((Integer) obj5).intValue();
                                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj6;
                                int intValue3 = ((Integer) obj7).intValue();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-606148594, intValue3, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContent.<anonymous>.<anonymous> (GamesCatalogMainTabScreen.kt:155)");
                                }
                                int ordinal = GamesCatalogScreenTab.CATALOG.ordinal();
                                q630.a aVar7 = q630.a.a;
                                v6p0 v6p0Var3 = v6p0.this;
                                izs izsVar3 = izsVar2;
                                rha rhaVar5 = rhaVar4;
                                gzs gzsVar4 = gzsVar3;
                                mtk0 mtk0Var = c8;
                                if (intValue2 == ordinal) {
                                    aVar6.K(-1730147587);
                                    tdt.a((jdt.e) c6.getValue(), (GamesCatalogScreenTab) mtk0Var.getValue(), izsVar3, rhaVar5, n34.t(aVar7, v6p0Var3.a(), null), gzsVar4, aVar6, 0);
                                    aVar6.j();
                                } else if (intValue2 == GamesCatalogScreenTab.CATEGORIES.ordinal()) {
                                    aVar6.K(-1729714021);
                                    jft.a((jdt.e) c7.getValue(), (GamesCatalogScreenTab) mtk0Var.getValue(), izsVar3, rhaVar5, n34.t(aVar7, v6p0Var3.a(), null), gzsVar4, aVar6, 0);
                                    aVar6.j();
                                } else {
                                    aVar6.K(1606783282);
                                    aVar6.j();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                return s3q0.a;
                            }
                        }, aVar4), aVar4, 48, 24576, 16252);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar3, 805330998, 364);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nct
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pct.b(jdt.a.this, izsVar, v6p0Var, mc90Var, gzsVar, rhaVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final jdt.a aVar, final izs<? super o9t, s3q0> izsVar, final v6p0 v6p0Var, final mc90 mc90Var, final gzs<s3q0> gzsVar, final rha rhaVar, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(1615324074);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(v6p0Var) ? 256 : 128) | (M.J(mc90Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(rhaVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1615324074, i2, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContentLego (GamesCatalogMainTabScreen.kt:188)");
            }
            wh50 c2 = jk50.c(aVar.e, M);
            wh50 c3 = jk50.c(aVar.b, M);
            q630 d = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar3 = M;
            phv0.b(d, kai.c(1294206275, new hct(v6p0Var, izsVar, mc90Var, c2, 0), M), null, null, kai.c(-856028922, new d6(5, izsVar, c3), M), 0, ylu0Var.getBackground().g, 0L, kai.c(-79198258, new yzs() { // from class: xsna.kct
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-79198258, intValue, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContentLego.<anonymous> (GamesCatalogMainTabScreen.kt:223)");
                        }
                        jdt.a aVar5 = jdt.a.this;
                        final wh50 c4 = jk50.c(aVar5.a, aVar4);
                        final wh50 c5 = jk50.c(aVar5.d, aVar4);
                        final wh50 c6 = jk50.c(aVar5.c, aVar4);
                        s3q0 s3q0Var = s3q0.a;
                        mc90 mc90Var2 = mc90Var;
                        boolean J = aVar4.J(mc90Var2);
                        final izs izsVar2 = izsVar;
                        boolean J2 = J | aVar4.J(izsVar2);
                        Object x = aVar4.x();
                        if (J2 || x == a.C0011a.a) {
                            x = new pct.c(mc90Var2, izsVar2, null);
                            aVar4.R(x);
                        }
                        bap.g(s3q0Var, (wzs) x, aVar4, 6);
                        q630 d2 = txj0.d(q630.a.a, 1.0f);
                        h4o0 A = x19.A(mc90Var2, null, aVar4, 24576, 14);
                        final v6p0 v6p0Var2 = v6p0Var;
                        final rha rhaVar2 = rhaVar;
                        final gzs gzsVar2 = gzsVar;
                        nb90.a(mc90Var2, d2, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, A, false, null, null, null, null, kai.c(-423007763, new zzs() { // from class: xsna.oct
                            @Override // xsna.zzs
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                int intValue2 = ((Integer) obj5).intValue();
                                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj6;
                                int intValue3 = ((Integer) obj7).intValue();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-423007763, intValue3, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContentLego.<anonymous>.<anonymous> (GamesCatalogMainTabScreen.kt:251)");
                                }
                                int ordinal = GamesCatalogScreenTab.CATALOG.ordinal();
                                q630.a aVar7 = q630.a.a;
                                v6p0 v6p0Var3 = v6p0.this;
                                izs izsVar3 = izsVar2;
                                rha rhaVar3 = rhaVar2;
                                gzs gzsVar3 = gzsVar2;
                                mtk0 mtk0Var = c6;
                                if (intValue2 == ordinal) {
                                    aVar6.K(-390117186);
                                    tdt.a((jdt.e) c4.getValue(), (GamesCatalogScreenTab) mtk0Var.getValue(), izsVar3, rhaVar3, n34.t(aVar7, v6p0Var3.a(), null), gzsVar3, aVar6, 0);
                                    aVar6.j();
                                } else if (intValue2 == GamesCatalogScreenTab.CATEGORIES.ordinal()) {
                                    aVar6.K(-389683620);
                                    jft.a((jdt.e) c5.getValue(), (GamesCatalogScreenTab) mtk0Var.getValue(), izsVar3, rhaVar3, n34.t(aVar7, v6p0Var3.a(), null), gzsVar3, aVar6, 0);
                                    aVar6.j();
                                } else {
                                    aVar6.K(1511462737);
                                    aVar6.j();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                return s3q0.a;
                            }
                        }, aVar4), aVar4, 48, 24576, 16252);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar3, 805330998, 364);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lct
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pct.c(jdt.a.this, izsVar, v6p0Var, mc90Var, gzsVar, rhaVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
