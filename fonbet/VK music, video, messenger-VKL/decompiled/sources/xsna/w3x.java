package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.utils.StringExtensionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InsertPushTokenUseCaseImpl.kt */
/* loaded from: classes5.dex */
public final class w3x implements u3x {
    public final qle0 a;
    public final Logger b;

    public w3x(sle0 sle0Var, Logger logger) {
        this.a = sle0Var;
        this.b = logger.createLogger("InsertPushTokenUseCaseImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.u3x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pke0 pke0Var, ContinuationImpl continuationImpl) {
        v3x v3xVar;
        Object obj;
        int i;
        w3x w3xVar;
        w3x w3xVar2;
        if (continuationImpl instanceof v3x) {
            v3xVar = (v3x) continuationImpl;
            int i2 = v3xVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v3xVar.label = i2 - Integer.MIN_VALUE;
                obj = v3xVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = v3xVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    v3xVar.L$0 = this;
                    v3xVar.L$1 = pke0Var;
                    v3xVar.label = 1;
                    obj = this.a.e(pke0Var, v3xVar);
                    if (obj != coroutineSingletons) {
                        w3xVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pke0Var = (pke0) v3xVar.L$1;
                    w3xVar2 = (w3x) v3xVar.L$0;
                    kotlin.a.a(obj);
                    int intValue = ((Number) obj).intValue();
                    Logger logger = w3xVar2.b;
                    StringBuilder sb = new StringBuilder("Insert pushToken ");
                    sb.append(StringExtensionsKt.hideSensitive(pke0Var.b));
                    sb.append(" has failed, update success = ");
                    sb.append(intValue > 0);
                    Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
                    return s3q0.a;
                }
                pke0Var = (pke0) v3xVar.L$1;
                w3xVar = (w3x) v3xVar.L$0;
                kotlin.a.a(obj);
                if (((Number) obj).longValue() < 0) {
                    qle0 qle0Var = w3xVar.a;
                    v3xVar.L$0 = w3xVar;
                    v3xVar.L$1 = pke0Var;
                    v3xVar.label = 2;
                    obj = qle0Var.c(pke0Var, v3xVar);
                    if (obj != coroutineSingletons) {
                        w3xVar2 = w3xVar;
                        int intValue2 = ((Number) obj).intValue();
                        Logger logger2 = w3xVar2.b;
                        StringBuilder sb2 = new StringBuilder("Insert pushToken ");
                        sb2.append(StringExtensionsKt.hideSensitive(pke0Var.b));
                        sb2.append(" has failed, update success = ");
                        sb2.append(intValue2 > 0);
                        Logger.DefaultImpls.info$default(logger2, sb2.toString(), null, 2, null);
                    }
                    return coroutineSingletons;
                }
                return s3q0.a;
            }
        }
        v3xVar = new v3x(this, continuationImpl);
        obj = v3xVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = v3xVar.label;
        if (i != 0) {
        }
        if (((Number) obj).longValue() < 0) {
        }
        return s3q0.a;
    }
}
