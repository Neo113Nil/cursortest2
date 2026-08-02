package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.dto.common.ClipVideoFile;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.inc;
import xsna.pnc;

/* compiled from: ClipCoauthorDecisionBottomSheet.kt */
/* loaded from: classes16.dex */
public final class inc extends vpi implements w8i, ces {
    public static final /* synthetic */ int l1 = 0;
    public final Object g1;
    public final Object h1;
    public final Object i1;
    public final Object j1;
    public final Object k1;

    /* compiled from: ClipCoauthorDecisionBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipVideoFile g;
        public final ClipCoauthorsDecisionLaunchType h;

        public a(Context context, ClipVideoFile clipVideoFile, ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType) {
            super(context, tzp0.a(null, 3));
            this.g = clipVideoFile;
            this.h = clipCoauthorsDecisionLaunchType;
            F0(true);
            J();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            inc incVar = new inc();
            Bundle bundle = new Bundle();
            bundle.putParcelable("clip", this.g);
            bundle.putParcelable("launch_type", this.h);
            incVar.setArguments(bundle);
            return incVar;
        }
    }

    /* compiled from: ClipCoauthorDecisionBottomSheet.kt */
    public static final /* synthetic */ class b implements xy, g0t {
        public final /* synthetic */ qnc b;

        public b(qnc qncVar) {
            this.b = qncVar;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((fnc) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, qnc.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: ClipCoauthorDecisionBottomSheet.kt */
    @b6l(c = "com.vk.clips.coauthors.list.pendings.mvi.ClipCoauthorDecisionBottomSheet$Content$2$1", f = "ClipCoauthorDecisionBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements yzs<z37<fnc>, pnc, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(spj<? super c> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<fnc> z37Var, pnc pncVar, spj<? super s3q0> spjVar) {
            c cVar = inc.this.new c(spjVar);
            cVar.L$0 = pncVar;
            return cVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            pnc pncVar = (pnc) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (pncVar instanceof pnc.a) {
                inc.this.hide();
            } else {
                if (!(pncVar instanceof pnc.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ind) inc.this.h1.getValue()).c(((pnc.b) pncVar).a, true);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipCoauthorDecisionBottomSheet.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<fnc, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(fnc fncVar) {
            ((qnc) this.receiver).b(fncVar);
            return s3q0.a;
        }
    }

    public inc() {
        vf0 vf0Var = new vf0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g1 = msy.a(lazyThreadSafetyMode, vf0Var);
        this.h1 = msy.a(lazyThreadSafetyMode, new b3(this, 16));
        this.i1 = msy.a(lazyThreadSafetyMode, new na(this, 18));
        this.j1 = msy.a(lazyThreadSafetyMode, new ra0(this, 20));
        this.k1 = msy.a(lazyThreadSafetyMode, new sa0(this, 19));
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1131914928);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1131914928, i2, -1, "com.vk.clips.coauthors.list.pendings.mvi.ClipCoauthorDecisionBottomSheet.Content (ClipCoauthorDecisionBottomSheet.kt:59)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new g20(this, 23);
                M.R(x);
            }
            int m = n34.m(M);
            ro.d(16);
            final qnc qncVar = (qnc) gcd0.v(Integer.toString(m, 16), (izs) x, M);
            boolean y = M.y(qncVar);
            Object x2 = M.x();
            if (y || x2 == obj) {
                x2 = new jm0(qncVar, 12);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean z2 = i3 == 4;
            Object x3 = M.x();
            if (z2 || x3 == obj) {
                x3 = new c(null);
                M.R(x3);
            }
            r37.a(izsVar, (yzs) x3, kai.c(328573115, new zzs() { // from class: xsna.hnc
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    znc zncVar = (znc) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    int i4 = inc.l1;
                    if ((intValue & 48) == 0) {
                        intValue |= aVar2.J(zncVar) ? 32 : 16;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 145) != 144)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(328573115, intValue, -1, "com.vk.clips.coauthors.list.pendings.mvi.ClipCoauthorDecisionBottomSheet.Content.<anonymous> (ClipCoauthorDecisionBottomSheet.kt:75)");
                        }
                        qnc qncVar2 = qnc.this;
                        boolean y2 = aVar2.y(qncVar2);
                        Object x4 = aVar2.x();
                        if (y2 || x4 == a.C0011a.a) {
                            inc.d dVar = new inc.d(1, qncVar2, qnc.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                            aVar2.R(dVar);
                            x4 = dVar;
                        }
                        onc.a(zncVar, (izs) ((fcy) x4), aVar2, (intValue >> 3) & 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u05(this, i, 1);
        }
    }
}
