package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VideoViewerNetworkApiImpl.kt */
/* loaded from: classes7.dex */
public final class yrt0 implements vrt0 {
    public final ngj0 a;

    public yrt0(ngj0 ngj0Var) {
        this.a = ngj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.vrt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        wrt0 wrt0Var;
        int i;
        if (continuationImpl instanceof wrt0) {
            wrt0Var = (wrt0) continuationImpl;
            int i2 = wrt0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wrt0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = wrt0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wrt0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    xrt0 xrt0Var = new xrt0(this, str, null);
                    wrt0Var.L$0 = null;
                    wrt0Var.label = 1;
                    obj = myc0.k(b, xrt0Var, wrt0Var);
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
        wrt0Var = new wrt0(this, continuationImpl);
        Object obj2 = wrt0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wrt0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
