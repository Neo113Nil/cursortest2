package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
/* loaded from: classes11.dex */
public final class dtf0 {
    public final int a;
    public final nqi b;
    public float c;

    public dtf0(int i, nqi nqiVar) {
        this.a = i;
        this.b = nqiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f, ContinuationImpl continuationImpl) {
        ctf0 ctf0Var;
        int i;
        if (continuationImpl instanceof ctf0) {
            ctf0Var = (ctf0) continuationImpl;
            int i2 = ctf0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ctf0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = ctf0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ctf0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Float f2 = new Float(f);
                    ctf0Var.label = 1;
                    obj = this.b.invoke(f2, ctf0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                this.c += ((Number) obj).floatValue();
                return s3q0.a;
            }
        }
        ctf0Var = new ctf0(this, continuationImpl);
        Object obj2 = ctf0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ctf0Var.label;
        if (i != 0) {
        }
        this.c += ((Number) obj2).floatValue();
        return s3q0.a;
    }
}
