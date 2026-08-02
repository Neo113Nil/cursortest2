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
import com.vk.libvideo.adfree.api.VideoAdFreeBottomSheetArguments;
import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetState;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.d78;
import xsna.f88;
import xsna.wcy;

/* compiled from: VideoAdFreeBottomSheet.kt */
/* loaded from: classes18.dex */
public final class qyr0 extends jmu0 {
    public static final /* synthetic */ qcy<Object>[] m1;
    public final Object h1;
    public final Object i1;
    public final Object j1;
    public final u1h0 k1;
    public boolean l1;

    /* compiled from: VideoAdFreeBottomSheet.kt */
    public static final class a extends wpi {
        public static final int h;
        public static final int i;
        public final VideoAdFreeBottomSheetArguments g;

        static {
            float f = 8;
            h = iah0.a(f);
            i = iah0.a(f);
        }

        public a(Context context, VideoAdFreeBottomSheetArguments videoAdFreeBottomSheetArguments) {
            super(context, tzp0.a(null, 3));
            this.g = videoAdFreeBottomSheetArguments;
            int i2 = h;
            n0(i2);
            o0(i2);
            p0(0);
            m0(i);
            F0(true);
            B(iah0.a(16), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            qyr0 qyr0Var = new qyr0();
            qyr0Var.setArguments(yfb.b(new Pair("arguments", this.g)));
            return qyr0Var;
        }
    }

    /* compiled from: VideoAdFreeBottomSheet.kt */
    public static final /* synthetic */ class b implements xy, g0t {
        public final /* synthetic */ bn50<BottomSheetState, BottomSheetState, d78, f88> b;

        public b(bn50<BottomSheetState, BottomSheetState, d78, f88> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((d78) lj50Var);
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

    /* compiled from: VideoAdFreeBottomSheet.kt */
    @b6l(c = "com.vk.libvideo.adfree.impl.ui.VideoAdFreeBottomSheet$ThemedContent$2$1", f = "VideoAdFreeBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<z37<d78>, f88, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<d78> z37Var, f88 f88Var, spj<? super s3q0> spjVar) {
            c cVar = qyr0.this.new c(spjVar);
            cVar.L$0 = f88Var;
            return cVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            f88 f88Var = (f88) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            qyr0 qyr0Var = qyr0.this;
            qcy<Object>[] qcyVarArr = qyr0.m1;
            qyr0Var.getClass();
            ?? r1 = qyr0Var.h1;
            ?? r2 = qyr0Var.i1;
            ?? r3 = qyr0Var.j1;
            if (epx.f(f88Var, f88.a.a)) {
                qyr0Var.l1 = false;
                ((tyr0) r3.getValue()).j();
                qyr0Var.dismiss();
            } else if (epx.f(f88Var, f88.b.a)) {
                qyr0Var.l1 = false;
                ((tyr0) r3.getValue()).a();
                qyr0Var.dismiss();
            } else if (epx.f(f88Var, f88.c.a)) {
                ((com.vk.libvideo.adfree.api.di.a) r2.getValue()).b(qyr0Var.requireContext(), ((d) r1.getValue()).a.f);
                ((tyr0) r3.getValue()).i();
                qyr0Var.l1 = false;
                qyr0Var.dismiss();
            } else {
                if (!epx.f(f88Var, f88.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((tyr0) r3.getValue()).g();
                ((com.vk.libvideo.adfree.api.di.a) r2.getValue()).a(qyr0Var.requireContext(), ((d) r1.getValue()).a.g);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VideoAdFreeBottomSheet.kt */
    public static final class d implements f78 {
        public final VideoAdFreeBottomSheetArguments a;

        public d(qyr0 qyr0Var) {
            Parcelable parcelable;
            Object parcelable2;
            Bundle requireArguments = qyr0Var.requireArguments();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = requireArguments.getParcelable("arguments", VideoAdFreeBottomSheetArguments.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = requireArguments.getParcelable("arguments");
                parcelable = (VideoAdFreeBottomSheetArguments) (parcelable3 instanceof VideoAdFreeBottomSheetArguments ? parcelable3 : null);
            }
            this.a = (VideoAdFreeBottomSheetArguments) parcelable;
        }

        @Override // xsna.f78
        public final VideoAdFreeBottomSheetArguments d() {
            return this.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(qyr0.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        m1 = new qcy[]{propertyReference1Impl};
    }

    public qyr0() {
        irc0 irc0Var = new irc0(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h1 = msy.a(lazyThreadSafetyMode, irc0Var);
        this.i1 = msy.a(lazyThreadSafetyMode, new m5o0(this, 7));
        this.j1 = msy.a(lazyThreadSafetyMode, new qah0(this, 13));
        yyl0 yyl0Var = new yyl0(this, 10);
        int i = wcy.c;
        this.k1 = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(BottomSheetState.class)), wcy.a.a(fpf0.d(BottomSheetState.class)), wcy.a.a(fpf0.d(d78.class)), wcy.a.a(fpf0.d(f88.class))).toString(), this, this, yyl0Var);
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
        aVar.K(-1129388059);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1129388059, 8, -1, "com.vk.libvideo.adfree.impl.ui.VideoAdFreeBottomSheet.ThemedContent (VideoAdFreeBottomSheet.kt:89)");
        }
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new mdm0(this, 12);
            aVar.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new c(null);
            aVar.R(x2);
        }
        r37.a(izsVar, (yzs) x2, imi.a, aVar, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final bn50<BottomSheetState, BottomSheetState, d78, f88> eo() {
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
            eo().b(d78.a.b);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        eo().b(d78.d.b);
    }
}
