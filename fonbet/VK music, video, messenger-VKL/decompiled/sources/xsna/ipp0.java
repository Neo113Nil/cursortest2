package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.a;
import com.ironsource.X3;
import com.vk.video.growth.api.VideoGrowthTrapArguments;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.growth.impl.ui.entity.TrapState;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.dpp0;
import xsna.kpp0;
import xsna.wcy;

/* compiled from: TrapBottomSheet.kt */
/* loaded from: classes6.dex */
public final class ipp0 extends jmu0 {
    public static final /* synthetic */ qcy<Object>[] m1;
    public final Object h1;
    public final Object i1;
    public final Object j1;
    public final u1h0 k1;
    public boolean l1;

    /* compiled from: TrapBottomSheet.kt */
    public static final class a extends wpi {
        public static final int h = cn70.b(8);
        public static final int i = cn70.b(8);
        public final VideoGrowthTrapArguments g;

        public a(Context context, VideoGrowthTrapArguments videoGrowthTrapArguments) {
            super(context, tzp0.a(null, 3));
            this.g = videoGrowthTrapArguments;
            int i2 = h;
            n0(i2);
            o0(i2);
            p0(0);
            m0(i);
            F0(true);
            B(cn70.c(16), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ipp0 ipp0Var = new ipp0();
            ipp0Var.setArguments(yfb.b(new Pair("arguments", this.g)));
            return ipp0Var;
        }
    }

    /* compiled from: TrapBottomSheet.kt */
    public static final /* synthetic */ class b implements xy, g0t {
        public final /* synthetic */ bn50<TrapState, TrapState, dpp0, kpp0> b;

        public b(bn50<TrapState, TrapState, dpp0, kpp0> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((dpp0) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: TrapBottomSheet.kt */
    @b6l(c = "com.vk.video.growth.impl.ui.TrapBottomSheet$ThemedContent$2$1", f = "TrapBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<z37<dpp0>, kpp0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<dpp0> z37Var, kpp0 kpp0Var, spj<? super s3q0> spjVar) {
            c cVar = ipp0.this.new c(spjVar);
            cVar.L$0 = kpp0Var;
            return cVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kpp0 kpp0Var = (kpp0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ipp0 ipp0Var = ipp0.this;
            qcy<Object>[] qcyVarArr = ipp0.m1;
            ipp0Var.getClass();
            ?? r1 = ipp0Var.h1;
            if (epx.f(kpp0Var, kpp0.a.a)) {
                ipp0Var.l1 = false;
                ipp0Var.dismiss();
            } else {
                if (!epx.f(kpp0Var, kpp0.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ipp0Var.l1 = false;
                ipp0Var.dismiss();
                ((VideoGrowthComponent) ipp0Var.i1.getValue()).N8().b(ipp0Var.requireContext(), ((d) r1.getValue()).a.c.c, ((d) r1.getValue()).a.c.b, ((d) r1.getValue()).a.d, null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: TrapBottomSheet.kt */
    public static final class d implements epp0 {
        public final VideoGrowthTrapArguments a;

        public d(ipp0 ipp0Var) {
            Parcelable parcelable;
            Object parcelable2;
            Bundle requireArguments = ipp0Var.requireArguments();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = requireArguments.getParcelable("arguments", VideoGrowthTrapArguments.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = requireArguments.getParcelable("arguments");
                parcelable = (VideoGrowthTrapArguments) (parcelable3 instanceof VideoGrowthTrapArguments ? parcelable3 : null);
            }
            this.a = (VideoGrowthTrapArguments) parcelable;
        }

        @Override // xsna.epp0
        public final VideoGrowthTrapArguments d() {
            return this.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ipp0.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        m1 = new qcy[]{propertyReference1Impl};
    }

    public ipp0() {
        d3j0 d3j0Var = new d3j0(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h1 = msy.a(lazyThreadSafetyMode, d3j0Var);
        this.i1 = msy.a(lazyThreadSafetyMode, new bbb0(this, 29));
        this.j1 = msy.a(lazyThreadSafetyMode, new b6f0(this, 12));
        gj80 gj80Var = new gj80(this, 26);
        int i = wcy.c;
        this.k1 = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(TrapState.class)), wcy.a.a(fpf0.d(TrapState.class)), wcy.a.a(fpf0.d(dpp0.class)), wcy.a.a(fpf0.d(kpp0.class))).toString(), this, this, gj80Var);
        this.l1 = true;
    }

    @Override // xsna.vpi
    public final void bo(b33 b33Var) {
        View view = Hn().Y;
        if (view != null) {
            this.e0 = new jgj(view, 0, 0, 42);
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-2024021356);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2024021356, 8, -1, "com.vk.video.growth.impl.ui.TrapBottomSheet.ThemedContent (TrapBottomSheet.kt:90)");
        }
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new ie90(this, 23);
            aVar.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new c(null);
            aVar.R(x2);
        }
        r37.a(izsVar, (yzs) x2, yli.a, aVar, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final bn50<TrapState, TrapState, dpp0, kpp0> eo() {
        qcy<Object> qcyVar = m1[0];
        return (bn50) this.k1.getValue();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null || iah0.s(mo2getContext)) {
            super.onConfigurationChanged(configuration);
        } else {
            dismiss();
        }
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.l1) {
            eo().b(dpp0.b.b);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        eo().b(dpp0.d.b);
    }
}
