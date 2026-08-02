package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerMode;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: SpinnerScreenContent.kt */
/* loaded from: classes18.dex */
public final class qkk0 implements yah0 {

    /* compiled from: SpinnerScreenContent.kt */
    @b6l(c = "com.vk.design.demo.presentation.screens.SpinnerScreenContent$VkSpinnerProgressContent$progressVal$2$1", f = "SpinnerScreenContent.kt", l = {257, 260}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<qhd0<Integer>, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(2, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(qhd0<Integer> qhd0Var, spj<? super s3q0> spjVar) {
            return ((a) create(qhd0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
        
            if (xsna.qsl.b(500, r7) == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (xsna.qsl.b(500, r7) == r1) goto L18;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0050 -> B:7:0x0025). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            qhd0 qhd0Var = (qhd0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.L$0 = qhd0Var;
                this.label = 1;
            } else if (i == 1) {
                kotlin.a.a(obj);
                qhd0Var.setValue(new Integer(((Number) qhd0Var.getValue()).intValue() + 15));
                if (((Number) qhd0Var.getValue()).intValue() >= 100) {
                    this.L$0 = qhd0Var;
                    this.label = 2;
                }
                this.L$0 = qhd0Var;
                this.label = 1;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                qhd0Var.setValue(new Integer(0));
                this.L$0 = qhd0Var;
                this.label = 1;
            }
        }
    }

    public static VkScreenSpinner m(qkk0 qkk0Var, Context context, VkSpinnerContent.SpinnerState spinnerState, VkScreenSpinner.SpinnerMode spinnerMode, String str, int i) {
        VkSpinner.SpinnerSize spinnerSize = VkSpinner.SpinnerSize.Size56;
        if ((i & 16) != 0) {
            str = null;
        }
        boolean z = (i & 32) == 0;
        qkk0Var.getClass();
        VkScreenSpinner vkScreenSpinner = new VkScreenSpinner(context, null, 6);
        vkScreenSpinner.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        vkScreenSpinner.setSpinnerSize(spinnerSize);
        vkScreenSpinner.setSpinnerState(spinnerState);
        vkScreenSpinner.setSpinnerMode(spinnerMode);
        vkScreenSpinner.b(str, false);
        if (z) {
            vkScreenSpinner.setOnCancelListener(new rkk0());
        }
        vkScreenSpinner.setCustomContent(new VkSpinnerContent.a.C0864a(new gko(R.drawable.vk_icon_refresh_outline_24), new s7c0(7)));
        return vkScreenSpinner;
    }

    public static FrameLayout n(Context context, boolean z, VkSpinner.SpinnerSize spinnerSize) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        VkSpinner vkSpinner = new VkSpinner(context, null, 6, 0);
        vkSpinner.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        vkSpinner.setIndeterminate(z);
        vkSpinner.setSpinnerSize(spinnerSize);
        frameLayout.addView(vkSpinner);
        return frameLayout;
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1466597847);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1466597847, i2, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.Content (SpinnerScreenContent.kt:64)");
            }
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
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
            k9q0.w(M, c, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Spinner", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            aVar2 = M;
            djn0.a(true, true, aVar2, 438, 0);
            float f2 = 8;
            q630 D2 = p490.D(s200.D(txj0.f(aVar3, 1.0f), f2), p490.x(aVar2), 14);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f2), aVar4, aVar2, 6);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D3 = aVar2.D();
            q630 c2 = qri.c(aVar2, D2);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a4, cVar);
            k9q0.w(aVar2, D3, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c2, dVar);
            rzo0.a(6, 2, aVar2, "Sizes:", null);
            int i5 = (i4 >> 15) & 14;
            l(i5, aVar2);
            rzo0.a(6, 2, aVar2, "States:", null);
            j(i5, aVar2);
            rzo0.a(6, 2, aVar2, "Cancelable:", null);
            h(i5, aVar2);
            rzo0.a(6, 2, aVar2, "Progress:", null);
            k(i5, aVar2);
            rzo0.a(6, 2, aVar2, "ScreenSpinner with indeterminateTint:", null);
            i(i5, aVar2);
            aVar2.G();
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
            s.d = new tma(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1459189513);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1459189513, i2, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.ScreenSpinnerDynamicColorChange (SpinnerScreenContent.kt:523)");
            }
            w0n0.a(6, 2, M, "5. Динамическая смена цвета ScreenSpinner:", null);
            List l = e43.l(Integer.valueOf(android.R.color.holo_red_dark), Integer.valueOf(android.R.color.holo_green_dark), Integer.valueOf(android.R.color.holo_blue_dark), Integer.valueOf(android.R.color.holo_orange_dark), Integer.valueOf(android.R.color.holo_purple));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new r9e(this, l, rg50Var, 7);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new com.vk.movika.sdk.base.logic.interactor.i(26, l, rg50Var);
                M.R(x3);
            }
            ae2.a(384, 2, M, izsVar, (izs) x3, null);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new rp1(21, rg50Var, l);
                M.R(x4);
            }
            bhu0.e((gzs) x4, ButtonSize.Small, ButtonStyle.Outline, ButtonAppearance.Accent, null, null, false, false, null, null, null, "Сменить цвет", null, null, null, null, false, null, null, null, M, 3510, 384, 0, 4190192);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ss1(this, i, 1);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1890909265);
        int i2 = (i & 6) == 0 ? (M.J(this) ? 4 : 2) | i : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1890909265, i2, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.ScreenSpinnerInDifferentModesWithCustomTint (SpinnerScreenContent.kt:469)");
            }
            w0n0.a(6, 2, M, "3. ScreenSpinner в разных режимах с custom tint:", null);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(16);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1001624332);
            for (VkScreenSpinner.SpinnerMode spinnerMode : VkScreenSpinner.SpinnerMode.h()) {
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, aVar2);
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
                k9q0.w(M, a3, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                boolean o = ((i2 & 14) == 4) | M.o(spinnerMode.ordinal());
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new twi0(3, this, spinnerMode);
                    M.R(x);
                }
                ae2.a(0, 6, M, (izs) x, null, null);
                w0n0.a(0, 2, M, spinnerMode.name(), null);
                M.G();
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ds7(this, i, 4);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-66008979);
        int i2 = (i & 6) == 0 ? (M.J(this) ? 4 : 2) | i : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-66008979, i2, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.ScreenSpinnerInDifferentStatesWithCustomTint (SpinnerScreenContent.kt:496)");
            }
            w0n0.a(6, 2, M, "4. ScreenSpinner в разных состояниях с custom tint:", null);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(16);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-1606420995);
            for (VkSpinnerContent.SpinnerState spinnerState : VkSpinnerContent.SpinnerState.h()) {
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, aVar2);
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
                k9q0.w(M, a3, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                boolean o = ((i2 & 14) == 4) | M.o(spinnerState.ordinal());
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new defpackage.h0(23, this, spinnerState);
                    M.R(x);
                }
                ae2.a(0, 6, M, (izs) x, null, null);
                w0n0.a(0, 2, M, spinnerState.name(), null);
                M.G();
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t1k0(this, i, 1);
        }
    }

    public final void e(int i, int i2, androidx.compose.runtime.a aVar, String str, String str2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(652785319);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(this) ? 2048 : 1024;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(652785319, i4, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.ScreenSpinnerWithColor (SpinnerScreenContent.kt:450)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
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
            boolean z = ((i4 & 7168) == 2048) | ((i4 & 896) == 256) | ((i4 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dqh(this, str2, i, 1);
                M.R(x);
            }
            ae2.a(0, 6, M, (izs) x, null, null);
            w0n0.a((i4 >> 3) & 14, 2, M, str, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wv80(this, i, str, str2, i2);
        }
    }

    public final void f(final int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-96281595);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-96281595, i2, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.ScreenSpinnerWithCustomTintColors (SpinnerScreenContent.kt:421)");
            }
            w0n0.a(6, 2, M, "2. ScreenSpinner с custom tint (через setColor):", null);
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(16);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = ((i2 << 9) & 7168) | 438;
            e(android.R.color.holo_red_dark, i3, M, "Красный", "Красный спиннер");
            e(android.R.color.holo_green_dark, i3, M, "Зеленый", "Зеленый спиннер");
            e(android.R.color.holo_blue_dark, i3, M, "Синий", "Синий спиннер");
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pkk0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    qkk0.this.f(I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }

    public final void g(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1812301991);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1812301991, i2, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.ScreenSpinnerWithoutCustomTint (SpinnerScreenContent.kt:406)");
            }
            w0n0.a(6, 2, M, "1. ScreenSpinner без custom tint (цвет темы):", null);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new emh0(this, 4);
                M.R(x);
            }
            ae2.a(0, 6, M, (izs) x, null, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ts1(this, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, xsna.q630] */
    /* JADX WARN: Type inference failed for: r19v3, types: [xsna.q630] */
    public final void h(int i, androidx.compose.runtime.a aVar) {
        qkk0 qkk0Var;
        androidx.compose.runtime.a M = aVar.M(1375469183);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? i | (M.J(this) ? 4 : 2) : i;
        int i4 = 0;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1375469183, i3, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.VkScreenSpinnerCancelableContent (SpinnerScreenContent.kt:203)");
            }
            char c = 6;
            Throwable th = null;
            w0n0.a(6, 2, M, "Compose", null);
            float f = 16;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, c2, cri.a.d);
            M.K(-1305757776);
            Iterator it = SpinnerMode.h().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                int i5 = 48;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (hasNext) {
                    SpinnerMode spinnerMode = (SpinnerMode) it.next();
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c3 = qri.c(M, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() == null) {
                        Throwable th2 = th;
                        n34.r();
                        throw th2;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a3, cri.a.f);
                    k9q0.w(M, D2, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c3, cri.a.d);
                    int i6 = i3;
                    SpinnerState spinnerState = SpinnerState.Loading;
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new xbj0(1);
                        M.R(x);
                    }
                    int i7 = i4;
                    ?? r19 = th;
                    zfr0.d(spinnerState, null, spinnerMode, "Subtitle", (gzs) x, 0L, 0L, null, null, M, 27654, 482);
                    w0n0.a(i7, 2, M, spinnerMode.name(), r19);
                    M.G();
                    th = r19;
                    i2 = 2;
                    i4 = i7;
                    i3 = i6;
                    f = f;
                    aVar2 = aVar2;
                    c = 6;
                } else {
                    float f2 = f;
                    int i8 = i3;
                    int i9 = i2;
                    int i10 = i4;
                    ?? r0 = th;
                    q630.a aVar5 = aVar2;
                    M.j();
                    M.G();
                    zrp<VkSpinnerContent.SpinnerState> h = VkSpinnerContent.SpinnerState.h();
                    List l = e43.l("Загрузка", "Загрузка 1%", "Загрузка 110%", "Загружено. Файл сохранен в /files/file1.txt");
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = androidx.compose.runtime.i.a(i10 == true ? 1 : 0);
                        M.R(x2);
                    }
                    rg50 rg50Var = (rg50) x2;
                    w0n0.a(6, i9, M, "View", r0);
                    a.j g2 = androidx.compose.foundation.layout.a.g(f2);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(g2, dt1.a.k, M, 6);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c4 = qri.c(M, aVar5);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw r0;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar6);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a4, cri.a.f);
                    k9q0.w(M, D3, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c4, cri.a.d);
                    M.K(136384489);
                    for (VkScreenSpinner.SpinnerMode spinnerMode2 : VkScreenSpinner.SpinnerMode.h()) {
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, i5);
                        int hashCode4 = Long.hashCode(n34.n(M));
                        sy90 D4 = M.D();
                        q630 c5 = qri.c(M, aVar5);
                        cri.h7.getClass();
                        LayoutNode.a aVar7 = cri.a.b;
                        if (M.N() == null) {
                            n34.r();
                            throw r0;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar7);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a5, cri.a.f);
                        k9q0.w(M, D4, cri.a.e);
                        k9q0.w(M, Integer.valueOf(hashCode4), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c5, cri.a.d);
                        boolean o = M.o(spinnerMode2.ordinal()) | ((i8 & 14) == 4 ? true : i10 == true ? 1 : 0);
                        Object x3 = M.x();
                        if (o || x3 == c0012a) {
                            x3 = new d50(28, this, spinnerMode2);
                            M.R(x3);
                        }
                        izs izsVar = (izs) x3;
                        boolean y = M.y(h);
                        Object x4 = M.x();
                        if (y || x4 == c0012a) {
                            x4 = new jbo(h, rg50Var, l, 5);
                            M.R(x4);
                        }
                        androidx.compose.runtime.a aVar8 = M;
                        ae2.a(0, 2, aVar8, izsVar, (izs) x4, null);
                        w0n0.a(i10 == true ? 1 : 0, i9, aVar8, spinnerMode2.name(), r0);
                        aVar8.G();
                        M = aVar8;
                        i5 = 48;
                    }
                    androidx.compose.runtime.a aVar9 = M;
                    aVar9.j();
                    aVar9.G();
                    boolean z = (i8 & 14) != 4 ? i10 == true ? 1 : 0 : true;
                    Object x5 = aVar9.x();
                    if (z || x5 == c0012a) {
                        x5 = new com.vk.catalog2.common.ui.holders.a(28, this, rg50Var);
                        aVar9.R(x5);
                    }
                    qkk0Var = this;
                    bhu0.e((gzs) x5, ButtonSize.Small, ButtonStyle.Outline, ButtonAppearance.Accent, null, null, false, false, null, null, null, "next state", null, null, null, null, false, null, null, null, aVar9, X2.b.f, 384, 0, 4190192);
                    M = aVar9;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
        } else {
            qkk0Var = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ccm(qkk0Var, i, 2);
        }
    }

    public final void i(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1697043297);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1697043297, i2, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.VkScreenSpinnerIndeterminateTintTestContent (SpinnerScreenContent.kt:397)");
            }
            int i3 = i2 & 14;
            g(i3, M);
            f(i3, M);
            c(i3, M);
            d(i3, M);
            b(i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h36(this, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, xsna.q630] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    public final void j(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        qkk0 qkk0Var;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(-673637359);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? i | (M.J(this) ? 4 : 2) : i;
        int i4 = 0;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-673637359, i3, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.VkScreenSpinnerStatesContent (SpinnerScreenContent.kt:143)");
            }
            q630 q630Var = null;
            w0n0.a(6, 2, M, "Compose", null);
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            q630.a aVar3 = q630.a.a;
            q630 G = m200.G(aVar3, intrinsicSize);
            float f = 8;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            k9q0.w(M, c, cri.a.d);
            M.K(912876402);
            Iterator it = SpinnerState.h().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                float f2 = 1.0f;
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                int i5 = 54;
                if (hasNext) {
                    SpinnerState spinnerState = (SpinnerState) it.next();
                    q630 f3 = txj0.f(aVar3, 1.0f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, M, 54);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, f3);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        ?? r0 = q630Var;
                        n34.r();
                        throw r0;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a3, cri.a.f);
                    k9q0.w(M, D2, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    int i6 = 2;
                    w0n0.a(i4, 2, M, spinnerState.name() + ": ", q630Var);
                    M.K(-951248474);
                    for (SpinnerMode spinnerMode : SpinnerMode.h()) {
                        float f4 = f;
                        a.C0011a.C0012a c0012a3 = c0012a2;
                        q630 H = s200.H(aVar3, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
                        int hashCode3 = Long.hashCode(n34.n(M));
                        sy90 D3 = M.D();
                        q630 c3 = qri.c(M, H);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (M.N() == null) {
                            ?? r02 = q630Var;
                            n34.r();
                            throw r02;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar6);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a4, cri.a.f);
                        k9q0.w(M, D3, cri.a.e);
                        k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c3, cri.a.d);
                        lg90 a5 = pg90.a(R.drawable.vk_icon_refresh_outline_24, i4, M);
                        Object x = M.x();
                        if (x == c0012a3) {
                            x = new w9(28);
                            M.R(x);
                        }
                        q630.a aVar7 = aVar3;
                        androidx.compose.runtime.a aVar8 = M;
                        nqv u = edi.u(a5, null, (gzs) x, aVar8, 27656, 6);
                        q630 q630Var2 = q630Var;
                        int i7 = i4;
                        M = aVar8;
                        zfr0.d(spinnerState, null, spinnerMode, null, null, 0L, 0L, null, u, M, 0, 250);
                        w0n0.a(i7, 2, M, spinnerMode.name(), q630Var2);
                        M.G();
                        q630Var = q630Var2;
                        i6 = 2;
                        i4 = i7;
                        f = f4;
                        i3 = i3;
                        it = it;
                        aVar3 = aVar7;
                        c0012a2 = c0012a3;
                    }
                    M.j();
                    M.G();
                    i2 = i6;
                    it = it;
                } else {
                    float f5 = f;
                    a.C0011a.C0012a c0012a4 = c0012a2;
                    int i8 = i2;
                    int i9 = i3;
                    int i10 = i4;
                    ?? r03 = q630Var;
                    M.j();
                    M.G();
                    w0n0.a(6, i8, M, "View", r03);
                    q630.a aVar9 = aVar3;
                    q630 G2 = m200.G(aVar9, IntrinsicSize.Min);
                    a.j g2 = androidx.compose.foundation.layout.a.g(f5);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a6 = androidx.compose.foundation.layout.b.a(g2, dt1.a.n, M, 6);
                    int hashCode4 = Long.hashCode(n34.n(M));
                    sy90 D4 = M.D();
                    q630 c4 = qri.c(M, G2);
                    cri.h7.getClass();
                    LayoutNode.a aVar10 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw r03;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar10);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a6, cri.a.f);
                    k9q0.w(M, D4, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode4), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c4, cri.a.d);
                    M.K(1422696985);
                    for (VkSpinnerContent.SpinnerState spinnerState2 : VkSpinnerContent.SpinnerState.h()) {
                        q630 f6 = txj0.f(aVar9, f2);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a7 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, M, i5);
                        int hashCode5 = Long.hashCode(n34.n(M));
                        sy90 D5 = M.D();
                        q630 c5 = qri.c(M, f6);
                        cri.h7.getClass();
                        LayoutNode.a aVar11 = cri.a.b;
                        if (M.N() == null) {
                            n34.r();
                            throw r03;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar11);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a7, cri.a.f);
                        k9q0.w(M, D5, cri.a.e);
                        k9q0.w(M, Integer.valueOf(hashCode5), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c5, cri.a.d);
                        w0n0.a(i10 == true ? 1 : 0, i8, M, spinnerState2.name() + ": ", r03);
                        M.K(998603017);
                        for (VkScreenSpinner.SpinnerMode spinnerMode2 : VkScreenSpinner.SpinnerMode.h()) {
                            q630.a aVar12 = aVar9;
                            int i11 = i5;
                            float f7 = f2;
                            q630 H2 = s200.H(aVar12, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.c a8 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
                            int hashCode6 = Long.hashCode(n34.n(M));
                            sy90 D6 = M.D();
                            q630 c6 = qri.c(M, H2);
                            cri.h7.getClass();
                            LayoutNode.a aVar13 = cri.a.b;
                            if (M.N() == null) {
                                n34.r();
                                throw r03;
                            }
                            M.H();
                            if (M.L()) {
                                M.I(aVar13);
                            } else {
                                M.f();
                            }
                            k9q0.w(M, a8, cri.a.f);
                            k9q0.w(M, D6, cri.a.e);
                            k9q0.w(M, Integer.valueOf(hashCode6), cri.a.g);
                            k9q0.t(M, cri.a.h);
                            k9q0.w(M, c6, cri.a.d);
                            boolean o = ((i9 & 14) == 4 ? true : i10 == true ? 1 : 0) | M.o(spinnerState2.ordinal()) | M.o(spinnerMode2.ordinal());
                            Object x2 = M.x();
                            if (o) {
                                c0012a = c0012a4;
                            } else {
                                c0012a = c0012a4;
                                if (x2 != c0012a) {
                                    izs izsVar = (izs) x2;
                                    c0012a4 = c0012a;
                                    androidx.compose.runtime.a aVar14 = M;
                                    ae2.a(0, 6, aVar14, izsVar, null, null);
                                    w0n0.a(i10 == true ? 1 : 0, i8, aVar14, spinnerMode2.name(), r03);
                                    aVar14.G();
                                    M = aVar14;
                                    i5 = i11;
                                    f2 = f7;
                                    aVar9 = aVar12;
                                }
                            }
                            x2 = new go6(this, spinnerState2, spinnerMode2, 8);
                            M.R(x2);
                            izs izsVar2 = (izs) x2;
                            c0012a4 = c0012a;
                            androidx.compose.runtime.a aVar142 = M;
                            ae2.a(0, 6, aVar142, izsVar2, null, null);
                            w0n0.a(i10 == true ? 1 : 0, i8, aVar142, spinnerMode2.name(), r03);
                            aVar142.G();
                            M = aVar142;
                            i5 = i11;
                            f2 = f7;
                            aVar9 = aVar12;
                        }
                        int i12 = i5;
                        androidx.compose.runtime.a aVar15 = M;
                        aVar15.j();
                        aVar15.G();
                        M = aVar15;
                        i5 = i12;
                    }
                    aVar2 = M;
                    qkk0Var = this;
                    if (gp.d(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
        } else {
            aVar2 = M;
            qkk0Var = this;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new j48(qkk0Var, i, 3);
        }
    }

    public final void k(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1839719558);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1839719558, i2, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.VkSpinnerProgressContent (SpinnerScreenContent.kt:253)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new a(2, null);
                M.R(x);
            }
            wh50 l = skd.l(0, (wzs) x, M, 6);
            w0n0.a(6, 2, M, "View", null);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new oi40(this, 17);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean J = M.J(l);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new bnc0(l, 11);
                M.R(x3);
            }
            ae2.a(0, 2, M, izsVar, (izs) x3, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mkg0(this, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable, xsna.q630] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Throwable] */
    public final void l(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1007653855);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (M.J(this) ? 4 : 2) | i : i;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1007653855, i3, -1, "com.vk.design.demo.presentation.screens.SpinnerScreenContent.VkSpinnerSizesContent (SpinnerScreenContent.kt:100)");
            }
            int i4 = 6;
            q630 q630Var = null;
            w0n0.a(6, 2, M, "Compose", null);
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            q630.a aVar2 = q630.a.a;
            q630 G = m200.G(aVar2, intrinsicSize);
            float f = 8;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            k9q0.w(M, c, cri.a.d);
            M.K(790863394);
            Iterator it = SpinnerSize.h().iterator();
            while (it.hasNext()) {
                SpinnerSize spinnerSize = (SpinnerSize) it.next();
                q630 f2 = txj0.f(aVar2, 1.0f);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, M, 54);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, f2);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (M.N() == null) {
                    ?? r14 = q630Var;
                    n34.r();
                    throw r14;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, a3, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                w0n0.a(0, i2, M, spinnerSize.name() + ": ", q630Var);
                androidx.compose.runtime.a aVar5 = M;
                zfr0.f(SpinnerState.Loading, null, null, 0L, spinnerSize, null, aVar5, 6, 46);
                M = aVar5;
                M.G();
                i4 = 6;
                aVar2 = aVar2;
                q630Var = q630Var;
                it = it;
                f = f;
                i2 = 2;
            }
            int i5 = i4;
            ?? r142 = q630Var;
            q630.a aVar6 = aVar2;
            M.j();
            M.G();
            w0n0.a(i5, 2, M, "View", r142);
            q630 G2 = m200.G(aVar6, IntrinsicSize.Min);
            a.j g2 = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(g2, dt1.a.n, M, i5);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, G2);
            cri.h7.getClass();
            LayoutNode.a aVar7 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw r142;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cri.a.f);
            k9q0.w(M, D3, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            M.K(1758523734);
            for (VkSpinner.SpinnerSize spinnerSize2 : VkSpinner.SpinnerSize.h()) {
                q630 f3 = txj0.f(aVar6, 1.0f);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, M, 54);
                int hashCode4 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
                q630 c4 = qri.c(M, f3);
                cri.h7.getClass();
                LayoutNode.a aVar8 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw r142;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar8);
                } else {
                    M.f();
                }
                k9q0.w(M, a5, cri.a.f);
                k9q0.w(M, D4, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode4), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c4, cri.a.d);
                w0n0.a(0, 2, M, spinnerSize2.name() + ": ", r142);
                boolean o = ((i3 & 14) == 4) | M.o(spinnerSize2.ordinal());
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new aj50(this, spinnerSize2);
                    M.R(x);
                }
                ae2.a(0, 6, M, (izs) x, null, null);
                M.G();
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kb10(this, i, 1);
        }
    }
}
