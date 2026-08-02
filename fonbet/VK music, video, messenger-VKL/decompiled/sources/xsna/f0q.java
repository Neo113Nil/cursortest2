package xsna;

import android.net.LinkProperties;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes11.dex */
public final class f0q {
    public static final con0 a = new con0("REMOVED_TASK");
    public static final con0 b = new con0("CLOSED_EMPTY");

    public static final String a(LinkProperties linkProperties) {
        return linkProperties.getInterfaceName() + ':' + linkProperties.getDomains() + ':' + j5g.g0(linkProperties.getDnsServers(), DomExceptionUtils.SEPARATOR, null, null, 0, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(cso0 cso0Var, yzs yzsVar, Throwable th, ContinuationImpl continuationImpl) {
        btr btrVar;
        int i;
        try {
            if (continuationImpl instanceof btr) {
                btrVar = (btr) continuationImpl;
                int i2 = btrVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    btrVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = btrVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = btrVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        btrVar.L$0 = th;
                        btrVar.label = 1;
                        if (yzsVar.invoke(cso0Var, th, btrVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) btrVar.L$0;
                        kotlin.a.a(obj);
                    }
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            return s3q0.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                mnh0.d(th2, th);
            }
            throw th2;
        }
        btrVar = new btr(continuationImpl);
        Object obj2 = btrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = btrVar.label;
    }
}
