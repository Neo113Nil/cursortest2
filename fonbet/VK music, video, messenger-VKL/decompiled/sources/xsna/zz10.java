package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MediaStoreLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class zz10 {
    public final rq10 a;
    public final zy10 b;

    public zz10(rq10 rq10Var, zy10 zy10Var) {
        this.a = rq10Var;
        this.b = zy10Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, int i3, int i4, ContinuationImpl continuationImpl) {
        vz10 vz10Var;
        int i5;
        if (continuationImpl instanceof vz10) {
            vz10Var = (vz10) continuationImpl;
            int i6 = vz10Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                vz10Var.label = i6 - Integer.MIN_VALUE;
                Object obj = vz10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = vz10Var.label;
                if (i5 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    wz10 wz10Var = new wz10(this, i, i4, i3, i2, null);
                    vz10Var.I$0 = i;
                    vz10Var.I$1 = i2;
                    vz10Var.I$2 = i3;
                    vz10Var.I$3 = i4;
                    vz10Var.label = 1;
                    obj = myc0.k(b, wz10Var, vz10Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        vz10Var = new vz10(this, continuationImpl);
        Object obj2 = vz10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i5 = vz10Var.label;
        if (i5 != 0) {
        }
        return ((Result) obj2).d();
    }
}
