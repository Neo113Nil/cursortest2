package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: Scrollable.kt */
/* loaded from: classes11.dex */
public final class ahh0 {
    public static final j6e0 a = new j6e0(5);
    public static final b b = new b();
    public static final a c = new a();
    public static final c d = new c();

    /* compiled from: Scrollable.kt */
    public static final class a implements fa30 {
        @Override // kotlin.coroutines.d
        public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
            return wzsVar.invoke(r, this);
        }

        @Override // kotlin.coroutines.d
        public final <E extends d.b> E get(d.c<E> cVar) {
            return (E) d.b.a.a(this, cVar);
        }

        @Override // kotlin.coroutines.d
        public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
            return d.b.a.b(this, cVar);
        }

        @Override // kotlin.coroutines.d
        public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
            return d.a.a(this, dVar);
        }

        @Override // xsna.fa30
        public final float w() {
            return 1.0f;
        }
    }

    /* compiled from: Scrollable.kt */
    public static final class c implements azl {
        @Override // xsna.azl
        public final float getDensity() {
            return 1.0f;
        }

        @Override // xsna.azl
        public final float getFontScale() {
            return 1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zhh0 zhh0Var, long j, ContinuationImpl continuationImpl) {
        bhh0 bhh0Var;
        int i;
        Ref$FloatRef ref$FloatRef;
        zhh0 zhh0Var2;
        if (continuationImpl instanceof bhh0) {
            bhh0Var = (bhh0) continuationImpl;
            int i2 = bhh0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bhh0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = bhh0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bhh0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ref$FloatRef = new Ref$FloatRef();
                    MutatePriority mutatePriority = MutatePriority.Default;
                    chh0 chh0Var = new chh0(zhh0Var, j, ref$FloatRef, null);
                    bhh0Var.L$0 = zhh0Var;
                    bhh0Var.L$1 = ref$FloatRef;
                    bhh0Var.label = 1;
                    if (zhh0Var.f(mutatePriority, chh0Var, bhh0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zhh0Var2 = zhh0Var;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) bhh0Var.L$1;
                    zhh0 zhh0Var3 = (zhh0) bhh0Var.L$0;
                    kotlin.a.a(obj);
                    ref$FloatRef = ref$FloatRef2;
                    zhh0Var2 = zhh0Var3;
                }
                return new ov70(zhh0Var2.h(ref$FloatRef.element));
            }
        }
        bhh0Var = new bhh0(continuationImpl);
        Object obj2 = bhh0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bhh0Var.label;
        if (i != 0) {
        }
        return new ov70(zhh0Var2.h(ref$FloatRef.element));
    }

    public static q630 b(q630 q630Var, khh0 khh0Var, Orientation orientation) {
        return c(q630Var, khh0Var, orientation, true, false, null, 128);
    }

    public static q630 c(q630 q630Var, khh0 khh0Var, Orientation orientation, boolean z, boolean z2, sg50 sg50Var, int i) {
        return q630Var.g(new zgh0(khh0Var, orientation, z, z2, null, sg50Var));
    }

    /* compiled from: Scrollable.kt */
    public static final class b implements ggh0 {
        @Override // xsna.ggh0
        public final float f(float f) {
            return f;
        }
    }
}
