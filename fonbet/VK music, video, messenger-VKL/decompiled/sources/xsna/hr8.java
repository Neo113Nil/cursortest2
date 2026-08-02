package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.button.DropdownButton$Appearance;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.button.VkButton;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: ButtonScreenContent.kt */
/* loaded from: classes18.dex */
public final class hr8 implements yah0 {
    public final ListBuilder b;
    public final zrp<DropdownButton$Appearance> c;
    public final LinkedHashMap d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ButtonScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Compose;
        public static final a View;
        public static final a ViewSimple;

        static {
            a aVar = new a("View", 0);
            View = aVar;
            a aVar2 = new a("ViewSimple", 1);
            ViewSimple = aVar2;
            a aVar3 = new a("Compose", 2);
            Compose = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: ButtonScreenContent.kt */
    @b6l(c = "com.vk.design.demo.presentation.screens.ButtonScreenContent$LoaderTestButton$1$1", f = "ButtonScreenContent.kt", l = {Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $isLoading$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wh50<Boolean> wh50Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$isLoading$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$isLoading$delegate, spjVar);
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
                if (this.$isLoading$delegate.getValue().booleanValue()) {
                    this.label = 1;
                    if (qsl.b(2000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$isLoading$delegate.setValue(Boolean.FALSE);
            return s3q0.a;
        }
    }

    /* compiled from: ButtonScreenContent.kt */
    @b6l(c = "com.vk.design.demo.presentation.screens.ButtonScreenContent$LoaderWithTextButton$1$1", f = "ButtonScreenContent.kt", l = {336}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $isLoading$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wh50<Boolean> wh50Var, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$isLoading$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$isLoading$delegate, spjVar);
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
                if (this.$isLoading$delegate.getValue().booleanValue()) {
                    this.label = 1;
                    if (qsl.b(2000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$isLoading$delegate.setValue(Boolean.FALSE);
            return s3q0.a;
        }
    }

    /* compiled from: ButtonScreenContent.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.View.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ViewSimple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Compose.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonSize.values().length];
            try {
                iArr2[ButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public hr8() {
        ListBuilder e = e43.e();
        for (ButtonAppearance buttonAppearance : ButtonAppearance.h()) {
            for (qtp0 qtp0Var : qtp0.i()) {
                for (ButtonStyle buttonStyle : ButtonStyle.h()) {
                    Iterator<E> it = ButtonSize.h().iterator();
                    while (it.hasNext()) {
                        e.add(new hkr0(qtp0Var, buttonStyle, (ButtonSize) it.next(), buttonAppearance));
                    }
                }
            }
        }
        this.b = e.g();
        this.c = DropdownButton$Appearance.h();
        zrp<a> h = a.h();
        int e2 = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (Object obj : h) {
            linkedHashMap.put(obj, ((a) obj).name());
        }
        this.d = linkedHashMap;
        this.e = androidx.compose.runtime.k.b(a.Compose);
        Boolean bool = Boolean.FALSE;
        this.f = androidx.compose.runtime.k.b(bool);
        this.g = androidx.compose.runtime.k.b(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 q1;
        androidx.compose.runtime.a M = aVar.M(-329171575);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-329171575, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.Content (ButtonScreenContent.kt:107)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, c2, dVar);
            if (l()) {
                M.K(226064605);
                qzu0.a.getClass();
                q1 = qzu0.p1(M);
                M.j();
            } else {
                M.K(226139997);
                qzu0.a.getClass();
                q1 = qzu0.q1(M);
                M.j();
            }
            boolean y = M.y(this);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new com.vk.movika.sdk.base.ui.t(this, 12);
                M.R(x);
            }
            jjn0.a("Button", gzsVar, x5Var, gzsVar2, null, d.b.a.C0757a.a(q1, null, (gzs) x, null, null, null, M, 12582920, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), M, ((i2 << 3) & 112) | 6 | (i2 & 896) | ((i2 << 6) & 7168), 16);
            djn0.a(true, true, M, 438, 0);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, aVar2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            rv5 c4 = lv5.c(M);
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            q630 a4 = q9g.a(aVar2, 1.0f);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c5 = qri.c(M, a4);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b2 = lv5.b(txj0.d(aVar2, 1.0f), c4, 0L, 6);
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new t6(wh50Var, 13);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            boolean y2 = M.y(this);
            Object x4 = M.x();
            if (y2 || x4 == obj) {
                x4 = new wl0(this, 8);
                M.R(x4);
            }
            ae2.a(6, 0, M, izsVar2, (izs) x4, b2);
            q630 d3 = txj0.d(aVar2, 1.0f);
            VkBlurContentView vkBlurContentView = (VkBlurContentView) wh50Var.getValue();
            int i4 = VkBlurContentView.f;
            b(d3, c4, vkBlurContentView, M, 518 | ((i2 >> 6) & 7168));
            M.G();
            a aVar5 = (a) ((zak0) this.e).getValue();
            boolean y3 = M.y(this);
            Object x5 = M.x();
            if (y3 || x5 == obj) {
                x5 = new op1(this, 9);
                M.R(x5);
            }
            y9i0.a("Implementation", this.d, aVar5, (izs) x5, txj0.f(aVar2, 1.0f), M, 24582, 0);
            M = M;
            M.K(1505892461);
            M.j();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l48(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(q630 q630Var, rv5 rv5Var, VkBlurContentView vkBlurContentView, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(75069870);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rv5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(vkBlurContentView) : M.y(vkBlurContentView) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(75069870, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.ButtonsContent (ButtonScreenContent.kt:188)");
            }
            M.K(-872286740);
            q630 f = txj0.f(q630Var, 1.0f);
            if (l() && ((a) ((zak0) this.e).getValue()) == a.Compose) {
                f = f.g(wdj0.a(q630.a.a, ckv0.b(null, M, 1)));
            }
            M.j();
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.o;
            boolean y = M.y(this) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && M.y(vkBlurContentView))) | ((i2 & 112) == 32) | M.l(false);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new l14(this, vkBlurContentView, rv5Var, 1);
                M.R(x);
            }
            lqy.a(f, null, null, null, aVar2, null, false, null, (izs) x, M, 196608, 478);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yq8(this, q630Var, rv5Var, vkBlurContentView, i);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(997563100);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(997563100, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.ComposeLoaderTestButtons (ButtonScreenContent.kt:284)");
            }
            float f = 8;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
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
            int i3 = (i2 << 3) & 112;
            int i4 = i3 | 6;
            g("Loader Only (replaces text)", M, i4);
            M.K(1116912477);
            Iterator<E> it = ButtonSize.h().iterator();
            while (it.hasNext()) {
                d((ButtonSize) it.next(), M, i3);
            }
            M.j();
            g("Loader + Text", M, i4);
            M.K(1116917057);
            Iterator<E> it2 = ButtonSize.h().iterator();
            while (it2.hasNext()) {
                f((ButtonSize) it2.next(), M, i3);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c("Click button to start loading (2s)", s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), l5g.c(14, ylu0Var.getText().p, 0.6f), null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 54, 0, 8184);
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
            s.d = new oa5(this, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1483121558);
        if ((i & 6) == 0) {
            i2 = i | (M.o(buttonSize.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1483121558, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.LoaderTestButton (ButtonScreenContent.kt:307)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Boolean bool = (Boolean) wh50Var.getValue();
            bool.booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new b(wh50Var, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            q630 f = txj0.f(q630.a.a, 0.8f);
            String str = "Test Loader - " + buttonSize;
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            int i3 = i2;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ka0(wh50Var, 11);
                M.R(x3);
            }
            aVar2 = M;
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, f, null, booleanValue, true, null, null, null, str, null, null, null, null, false, null, null, null, aVar2, ((i3 << 3) & 112) | 100691334, 0, 0, 4189792);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ra5(this, buttonSize, i, 2);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1924258902);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1924258902, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.LoaderTestContent (ButtonScreenContent.kt:269)");
            }
            q630 D = s200.D(q630.a.a, 8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
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
            int i3 = d.$EnumSwitchMapping$0[((a) ((zak0) this.e).getValue()).ordinal()];
            if (i3 == 1) {
                M.K(1246017015);
                i(i2 & 14, M);
                M.j();
            } else if (i3 == 2) {
                M.K(1246019357);
                k(i2 & 14, M);
                M.j();
            } else {
                if (i3 != 3) {
                    throw alb0.c(1246012644, M);
                }
                M.K(1246014778);
                c(i2 & 14, M);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zu3(this, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1152032407);
        if ((i & 6) == 0) {
            i2 = i | (M.o(buttonSize.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1152032407, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.LoaderWithTextButton (ButtonScreenContent.kt:330)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Boolean bool = (Boolean) wh50Var.getValue();
            bool.booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new c(wh50Var, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            q630 f = txj0.f(q630.a.a, 0.8f);
            String str = "Loader + Text - " + buttonSize;
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            int i3 = i2;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ar8(0, wh50Var);
                M.R(x3);
            }
            aVar2 = M;
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, f, null, booleanValue, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar2, ((i3 << 3) & 112) | 28038, 0, 0, 4190048);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nv1(this, buttonSize, i, 1);
        }
    }

    public final void g(String str, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1929683127);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1929683127, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.SectionHeader (ButtonScreenContent.kt:259)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, s200.E(q630.a.a, 16, 8), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.J, M, i2 & 14, 0, 8188);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zq8(this, str, i, 0);
        }
    }

    public final void h(ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        int i2;
        VkButton.Size size;
        androidx.compose.runtime.a M = aVar.M(-1631375845);
        if ((i & 6) == 0) {
            i2 = (M.o(buttonSize.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1631375845, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.ViewLoaderTestButton (ButtonScreenContent.kt:376)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            int i3 = d.$EnumSwitchMapping$1[buttonSize.ordinal()];
            if (i3 == 1) {
                size = VkButton.Size.Small;
            } else if (i3 == 2) {
                size = VkButton.Size.Medium;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = VkButton.Size.Large;
            }
            q630 u = m200.u(txj0.f(q630.a.a, 0.8f), IntrinsicSize.Min);
            boolean o = M.o(size.ordinal()) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (o || x2 == c0012a) {
                x2 = new eo6(buttonSize, size, wh50Var, 1);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new t40(wh50Var, 7);
                M.R(x3);
            }
            ae2.a(Tensorflow.FRAME_WIDTH, 0, M, izsVar, (izs) x3, u);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uq8(this, buttonSize, i, 0);
        }
    }

    public final void i(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1766679181);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1766679181, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.ViewLoaderTestButtons (ButtonScreenContent.kt:353)");
            }
            float f = 8;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
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
            int i3 = (i2 << 3) & 112;
            int i4 = i3 | 6;
            g("Loader Only (replaces text)", M, i4);
            M.K(1251627646);
            Iterator<E> it = ButtonSize.h().iterator();
            while (it.hasNext()) {
                h((ButtonSize) it.next(), M, i3);
            }
            M.j();
            g("Loader + Text", M, i4);
            M.K(1251632354);
            Iterator<E> it2 = ButtonSize.h().iterator();
            while (it2.hasNext()) {
                j((ButtonSize) it2.next(), M, i3);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c("Click button to start loading (2s)", s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), l5g.c(14, ylu0Var.getText().p, 0.6f), null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 54, 0, 8184);
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
            s.d = new dv4(this, i, 2);
        }
    }

    public final void j(ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        int i2;
        VkButton.Size size;
        androidx.compose.runtime.a M = aVar.M(-1660658020);
        if ((i & 6) == 0) {
            i2 = (M.o(buttonSize.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1660658020, i2, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.ViewLoaderWithTextButton (ButtonScreenContent.kt:411)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            int i3 = d.$EnumSwitchMapping$1[buttonSize.ordinal()];
            if (i3 == 1) {
                size = VkButton.Size.Small;
            } else if (i3 == 2) {
                size = VkButton.Size.Medium;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = VkButton.Size.Large;
            }
            q630 u = m200.u(txj0.f(q630.a.a, 0.8f), IntrinsicSize.Min);
            boolean o = M.o(size.ordinal()) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (o || x2 == c0012a) {
                x2 = new rw(buttonSize, size, wh50Var, 2);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new z26(1, wh50Var);
                M.R(x3);
            }
            ae2.a(Tensorflow.FRAME_WIDTH, 0, M, izsVar, (izs) x3, u);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tq8(this, buttonSize, i, 0);
        }
    }

    public final void k(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(752922427);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(752922427, i, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.ViewSimpleLoaderTestButtons (ButtonScreenContent.kt:446)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c("VkSimpleButton does not support loading state", s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 1, q630.a.a), l5g.c(14, ylu0Var.getText().p, 0.6f), null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 54, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bn7(this, i, 2);
        }
    }

    public final boolean l() {
        return ((Boolean) ((zak0) this.f).getValue()).booleanValue();
    }
}
