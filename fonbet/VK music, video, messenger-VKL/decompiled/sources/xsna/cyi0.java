package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: SessionsSettings.kt */
/* loaded from: classes.dex */
public final class cyi0 {
    public final i3j0 a;
    public final i3j0 b;

    public cyi0(i3j0 i3j0Var, i3j0 i3j0Var2) {
        this.a = i3j0Var;
        this.b = i3j0Var2;
    }

    public final double a() {
        Double a = this.a.a();
        if (a != null) {
            double doubleValue = a.doubleValue();
            if (ConnectivityTracker.DEFAULT_UPLINK_BITRATE <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double a2 = this.b.a();
        if (a2 != null) {
            double doubleValue2 = a2.doubleValue();
            if (ConnectivityTracker.DEFAULT_UPLINK_BITRATE <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r6.b(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        byi0 byi0Var;
        int i;
        cyi0 cyi0Var;
        if (continuationImpl instanceof byi0) {
            byi0Var = (byi0) continuationImpl;
            int i2 = byi0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byi0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = byi0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = byi0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    byi0Var.L$0 = this;
                    byi0Var.label = 1;
                    if (this.a.b(byi0Var) != coroutineSingletons) {
                        cyi0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                cyi0Var = (cyi0) byi0Var.L$0;
                kotlin.a.a(obj);
                i3j0 i3j0Var = cyi0Var.b;
                byi0Var.L$0 = null;
                byi0Var.label = 2;
            }
        }
        byi0Var = new byi0(this, continuationImpl);
        Object obj2 = byi0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = byi0Var.label;
        if (i != 0) {
        }
        i3j0 i3j0Var2 = cyi0Var.b;
        byi0Var.L$0 = null;
        byi0Var.label = 2;
    }
}
