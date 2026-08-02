package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoMusicMixRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class rxs0 {
    public final uft0 a;

    public rxs0(uft0 uft0Var) {
        this.a = uft0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Integer num, String str, ContinuationImpl continuationImpl) {
        pxs0 pxs0Var;
        int i;
        if (continuationImpl instanceof pxs0) {
            pxs0Var = (pxs0) continuationImpl;
            int i2 = pxs0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pxs0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = pxs0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pxs0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    qxs0 qxs0Var = new qxs0(this, null, num, str, null, null, null);
                    pxs0Var.L$0 = null;
                    pxs0Var.L$1 = null;
                    pxs0Var.L$2 = null;
                    pxs0Var.L$3 = null;
                    pxs0Var.L$4 = null;
                    pxs0Var.label = 1;
                    obj = myc0.k(b, qxs0Var, pxs0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        pxs0Var = new pxs0(this, continuationImpl);
        Object obj2 = pxs0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pxs0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
