package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ClipFeedSpinnerView.kt */
/* loaded from: classes17.dex */
public final class yyc extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;

    /* compiled from: ClipFeedSpinnerView.kt */
    @b6l(c = "com.vk.clips.sdk.shared.feed.view.render.spinner.ClipFeedSpinnerView$ThemedContent$3$1", f = "ClipFeedSpinnerView.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ SpinnerState $state;
        int label;
        final /* synthetic */ yyc this$0;

        /* compiled from: ClipFeedSpinnerView.kt */
        /* renamed from: xsna.yyc$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4143a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SpinnerState.values().length];
                try {
                    iArr[SpinnerState.Error.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SpinnerState.Done.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SpinnerState.Loading.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SpinnerState.Custom.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SpinnerState spinnerState, yyc yycVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = spinnerState;
            this.this$0 = yycVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$state, this.this$0, spjVar);
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
                SpinnerState spinnerState = this.$state;
                int i2 = spinnerState == null ? -1 : C4143a.$EnumSwitchMapping$0[spinnerState.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1 || i2 == 2) {
                        this.label = 1;
                        if (qsl.b(1000L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            gzs<s3q0> onFinalStateShown = this.this$0.getOnFinalStateShown();
            if (onFinalStateShown != null) {
                onFinalStateShown.invoke();
            }
            return s3q0.a;
        }
    }

    public yyc(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        int i2;
        a.C0011a.C0012a c0012a;
        int i3;
        spj spjVar;
        androidx.compose.runtime.a M = aVar.M(381407376);
        int i4 = i | (M.y(this) ? 4 : 2);
        boolean z = true;
        if (M.t(i4 & 1, (i4 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(381407376, i4, -1, "com.vk.clips.sdk.shared.feed.view.render.spinner.ClipFeedSpinnerView.ThemedContent (ClipFeedSpinnerView.kt:40)");
            }
            SpinnerState state = getState();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (state != null) {
                M.K(-1976216283);
                q630 d = txj0.d(q630.a.a, 1.0f);
                Object x = M.x();
                if (x == c0012a2) {
                    x = new cu1(7);
                    M.R(x);
                }
                q630 c = ojc.c(d, false, null, null, (gzs) x, 14);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, c);
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
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                i3 = -1;
                i2 = i4;
                c0012a = c0012a2;
                spjVar = null;
                zfr0.d(state, null, null, null, getOnCancelClick(), 0L, 0L, null, null, M, 0, 494);
                M.G();
            } else {
                i2 = i4;
                c0012a = c0012a2;
                i3 = -1;
                spjVar = null;
                M.K(-1977683854);
            }
            M.j();
            boolean o = M.o(state == null ? i3 : state.ordinal());
            if ((i2 & 14) != 4 && !M.y(this)) {
                z = false;
            }
            boolean z2 = o | z;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new a(state, this, spjVar);
                M.R(x2);
            }
            bap.g(state, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y6c(this, i, 1);
        }
    }

    public final gzs<s3q0> getOnCancelClick() {
        return (gzs) ((zak0) this.m).getValue();
    }

    public final gzs<s3q0> getOnFinalStateShown() {
        return (gzs) ((zak0) this.o).getValue();
    }

    public final SpinnerState getState() {
        return (SpinnerState) ((zak0) this.n).getValue();
    }

    public final void setOnCancelClick(gzs<s3q0> gzsVar) {
        ((zak0) this.m).setValue(gzsVar);
    }

    public final void setOnFinalStateShown(gzs<s3q0> gzsVar) {
        ((zak0) this.o).setValue(gzsVar);
    }

    public final void setState(SpinnerState spinnerState) {
        ((zak0) this.n).setValue(spinnerState);
    }

    @Override // xsna.rpo0
    public final void z(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(915106454);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(915106454, i2, -1, "com.vk.clips.sdk.shared.feed.view.render.spinner.ClipFeedSpinnerView.Theme (ClipFeedSpinnerView.kt:32)");
            }
            jaiVar2 = jaiVar;
            rrv0.e(true, null, null, null, null, null, jaiVar2, M, ((i2 << 18) & 3670016) | 6, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xyc(this, jaiVar2, i, 0);
        }
    }
}
