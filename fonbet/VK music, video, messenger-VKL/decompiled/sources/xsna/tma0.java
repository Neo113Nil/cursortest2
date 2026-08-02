package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.PinReviewDetailsScreenResult;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.xma0;

/* compiled from: PinReviewManageServiceBottomSheet.kt */
/* loaded from: classes18.dex */
public final class tma0 extends jmu0 {
    public static final /* synthetic */ qcy<Object>[] m1;
    public final ComposeView h1;
    public final nzw i1 = new nzw(fpf0.d(dna0.class).toString(), this, new s6y(this, 24));
    public final Object j1;
    public final Object k1;
    public final Object l1;

    /* compiled from: PinReviewManageServiceBottomSheet.kt */
    public static final class a extends wpi {
        public final UserId g;

        public a(Context context, UserId userId) {
            super(context, dig0.b);
            this.g = userId;
            c(new jgj(S0(), 0, 0, 62));
            x(0);
            T0();
            F0(true);
            B(cn70.c(12), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            tma0 tma0Var = new tma0(S0());
            Bundle bundle = new Bundle();
            bundle.putParcelable(fpf0.a(UserId.class).l(), this.g);
            tma0Var.setArguments(bundle);
            return tma0Var;
        }
    }

    /* compiled from: PinReviewManageServiceBottomSheet.kt */
    public static final /* synthetic */ class b implements xy, g0t {
        public final /* synthetic */ dna0 b;

        public b(dna0 dna0Var) {
            this.b = dna0Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((rma0) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, dna0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: PinReviewManageServiceBottomSheet.kt */
    @b6l(c = "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.PinReviewManageServiceBottomSheet$ThemedContent$2$1", f = "PinReviewManageServiceBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<z37<rma0>, xma0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<rma0> z37Var, xma0 xma0Var, spj<? super s3q0> spjVar) {
            c cVar = tma0.this.new c(spjVar);
            cVar.L$0 = xma0Var;
            return cVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            xma0 xma0Var = (xma0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            tma0 tma0Var = tma0.this;
            qcy<Object>[] qcyVarArr = tma0.m1;
            tma0Var.getClass();
            if (epx.f(xma0Var, xma0.a.a)) {
                tma0Var.dismiss();
            } else if (xma0Var instanceof xma0.c) {
                FragmentManager parentFragmentManager = tma0Var.getParentFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putParcelable(fpf0.a(PinReviewDetailsScreenResult.class).l(), ((xma0.c) xma0Var).a);
                s3q0 s3q0Var = s3q0.a;
                parentFragmentManager.k0(bundle, "pin_review_details_screen_result_key");
                tma0Var.dismiss();
            } else {
                if (!(xma0Var instanceof xma0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                maz.c((maz) tma0Var.j1.getValue(), tma0Var.requireContext(), ((xma0.b) xma0Var).a, LaunchContext.A, null, null, 24);
                tma0Var.dismiss();
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(tma0.class, X3.i.U, "getStore()Lcom/vk/ecomm/reviews/impl/pinnedreview/presentation/PinReviewManageServiceStore;", 0);
        fpf0.a.getClass();
        m1 = new qcy[]{propertyReference1Impl};
    }

    public tma0(ComposeView composeView) {
        this.h1 = composeView;
        rka0 rka0Var = new rka0(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j1 = msy.a(lazyThreadSafetyMode, rka0Var);
        this.k1 = msy.a(lazyThreadSafetyMode, new iia0(this, 2));
        this.l1 = msy.a(lazyThreadSafetyMode, new Cnew(this, 26));
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        return this.h1;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(1012545647);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1012545647, 8, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.PinReviewManageServiceBottomSheet.ThemedContent (PinReviewManageServiceBottomSheet.kt:76)");
        }
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new b810(this, 15);
            aVar.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new c(null);
            aVar.R(x2);
        }
        r37.a(izsVar, (yzs) x2, lbs.c, aVar, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final dna0 eo() {
        qcy<Object> qcyVar = m1[0];
        return (dna0) this.i1.getValue();
    }
}
