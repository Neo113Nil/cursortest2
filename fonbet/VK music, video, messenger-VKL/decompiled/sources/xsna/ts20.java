package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MixBackgroundCpuShader.kt */
/* loaded from: classes3.dex */
public final class ts20 implements tm6 {
    public final int a;
    public final float b;

    public ts20() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.tm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, int i3, ContinuationImpl continuationImpl) {
        rs20 rs20Var;
        int i4;
        if (continuationImpl instanceof rs20) {
            rs20Var = (rs20) continuationImpl;
            int i5 = rs20Var.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                rs20Var.label = i5 - Integer.MIN_VALUE;
                Object obj = rs20Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = rs20Var.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                ovj a = hqu0.a();
                ss20 ss20Var = new ss20(i, i2, this, i3, null);
                rs20Var.I$0 = i;
                rs20Var.I$1 = i2;
                rs20Var.I$2 = i3;
                rs20Var.label = 1;
                Object k = myc0.k(a, ss20Var, rs20Var);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }
        rs20Var = new rs20(this, continuationImpl);
        Object obj2 = rs20Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = rs20Var.label;
        if (i4 == 0) {
        }
    }

    public ts20(int i) {
        this.a = 27;
        this.b = 0.125f;
    }
}
