package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Draggable.kt */
/* loaded from: classes11.dex */
public final class odl implements gho {
    public final izs<Float, s3q0> a;
    public final a b = new a();
    public final ni50 c = new ni50();

    /* compiled from: Draggable.kt */
    public static final class a implements pgo {
        public a() {
        }

        @Override // xsna.pgo
        public final void a(float f) {
            odl.this.a.invoke(Float.valueOf(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public odl(izs<? super Float, s3q0> izsVar) {
        this.a = izsVar;
    }

    @Override // xsna.gho
    public final Object a(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object d = zvj.d(new ndl(this, mutatePriority, wzsVar, null), continuationImpl);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
