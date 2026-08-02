package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ClipItemScreenSpinnerView.kt */
/* loaded from: classes17.dex */
public final class y2d extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;

    /* compiled from: ClipItemScreenSpinnerView.kt */
    @b6l(c = "com.vk.clips.viewer.impl.feed.item.view.ClipItemScreenSpinnerView$ThemedContent$3$1", f = "ClipItemScreenSpinnerView.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ SpinnerState $state;
        int label;
        final /* synthetic */ y2d this$0;

        /* compiled from: ClipItemScreenSpinnerView.kt */
        /* renamed from: xsna.y2d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4069a {
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
                    iArr[SpinnerState.Custom.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SpinnerState.Loading.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SpinnerState spinnerState, y2d y2dVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = spinnerState;
            this.this$0 = y2dVar;
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
                int i2 = C4069a.$EnumSwitchMapping$0[this.$state.ordinal()];
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return s3q0.a;
                }
                this.label = 1;
                if (qsl.b(2000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            gzs<s3q0> onFinalStateShown = this.this$0.getOnFinalStateShown();
            if (onFinalStateShown != null) {
                onFinalStateShown.invoke();
            }
            return s3q0.a;
        }
    }

    public y2d(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(SpinnerState.Loading);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(null);
        this.p = androidx.compose.runtime.k.b(null);
        this.q = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        String f;
        nqv u;
        androidx.compose.runtime.a M = aVar.M(1274658675);
        int i2 = i | (M.y(this) ? 4 : 2);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1274658675, i2, -1, "com.vk.clips.viewer.impl.feed.item.view.ClipItemScreenSpinnerView.ThemedContent (ClipItemScreenSpinnerView.kt:45)");
            }
            SpinnerState state = getState();
            q630 d = txj0.d(q630.a.a, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new gu0(5);
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
            gzs<s3q0> onCancelClick = getOnCancelClick();
            Integer subtitle = getSubtitle();
            if (subtitle == null) {
                M.K(102498250);
                M.j();
                f = null;
            } else {
                f = l4.f(M, 102498251, subtitle, M, 0);
            }
            Integer customContentIcon = getCustomContentIcon();
            if (customContentIcon == null) {
                M.K(102616515);
                M.j();
                u = null;
            } else {
                M.K(102616516);
                u = edi.u(pg90.a(customContentIcon.intValue(), 0, M), new pco(56), null, M, 24632, 12);
                M.j();
            }
            zfr0.d(state, null, null, f, onCancelClick, 0L, 0L, null, u, M, 0, 230);
            M.G();
            boolean o = M.o(state.ordinal());
            if ((i2 & 14) != 4 && !M.y(this)) {
                z = false;
            }
            boolean z2 = o | z;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new a(state, this, null);
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
            s.d = new com.vk.movika.tools.controls.seekbar.q(this, i, 2);
        }
    }

    public final Integer getCustomContentIcon() {
        return (Integer) ((zak0) this.n).getValue();
    }

    public final gzs<s3q0> getOnCancelClick() {
        return (gzs) ((zak0) this.p).getValue();
    }

    public final gzs<s3q0> getOnFinalStateShown() {
        return (gzs) ((zak0) this.q).getValue();
    }

    public final SpinnerState getState() {
        return (SpinnerState) ((zak0) this.m).getValue();
    }

    public final Integer getSubtitle() {
        return (Integer) ((zak0) this.o).getValue();
    }

    public final void setCustomContentIcon(Integer num) {
        ((zak0) this.n).setValue(num);
    }

    public final void setOnCancelClick(gzs<s3q0> gzsVar) {
        ((zak0) this.p).setValue(gzsVar);
    }

    public final void setOnFinalStateShown(gzs<s3q0> gzsVar) {
        ((zak0) this.q).setValue(gzsVar);
    }

    public final void setState(SpinnerState spinnerState) {
        ((zak0) this.m).setValue(spinnerState);
    }

    public final void setSubtitle(Integer num) {
        ((zak0) this.o).setValue(num);
    }

    @Override // xsna.rpo0
    public final void z(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(734961581);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(734961581, i2, -1, "com.vk.clips.viewer.impl.feed.item.view.ClipItemScreenSpinnerView.Theme (ClipItemScreenSpinnerView.kt:37)");
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
            s.d = new x2d(this, jaiVar2, i, 0);
        }
    }
}
