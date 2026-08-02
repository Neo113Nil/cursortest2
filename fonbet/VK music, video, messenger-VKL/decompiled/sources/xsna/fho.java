package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Draggable.kt */
/* loaded from: classes11.dex */
public final class fho {
    public static final a a = new a(3, null);
    public static final b b = new b(3, null);

    /* compiled from: Draggable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements yzs<yvj, ov70, spj<? super s3q0>, Object> {
        int label;

        @Override // xsna.yzs
        public final Object invoke(yvj yvjVar, ov70 ov70Var, spj<? super s3q0> spjVar) {
            long j = ov70Var.a;
            return new a(3, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
    }

    /* compiled from: Draggable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
        int label;

        @Override // xsna.yzs
        public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
            f.floatValue();
            return new b(3, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
    }

    public static q630 a(q630 q630Var, gho ghoVar, Orientation orientation, boolean z, sg50 sg50Var, boolean z2, yzs yzsVar, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            sg50Var = null;
        }
        return q630Var.g(new dho(ghoVar, orientation, z4, sg50Var, (i & 16) != 0 ? false : z2, a, yzsVar, (i & 128) != 0 ? false : z3));
    }

    public static final gho b(izs<? super Float, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:150)");
        }
        wh50 c = androidx.compose.runtime.k.c(izsVar, aVar, i & 14);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            odl odlVar = new odl(new eho(0, c));
            aVar.R(odlVar);
            x = odlVar;
        }
        gho ghoVar = (gho) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ghoVar;
    }

    public static final long c(long j) {
        boolean isNaN = Float.isNaN(jmr0.b(j));
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float b2 = isNaN ? 0.0f : jmr0.b(j);
        if (!Float.isNaN(jmr0.c(j))) {
            f = jmr0.c(j);
        }
        return m200.b(b2, f);
    }
}
