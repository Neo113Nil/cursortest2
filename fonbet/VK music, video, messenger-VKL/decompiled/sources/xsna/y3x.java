package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.utils.StringExtensionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InsertTestPushTokenUseCaseImpl.kt */
/* loaded from: classes5.dex */
public final class y3x implements u3x {
    public final qle0 a;
    public final Logger b;

    public y3x(sle0 sle0Var, Logger logger) {
        this.a = sle0Var;
        this.b = logger.createLogger("InsertPushTokenUseCaseImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // xsna.u3x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pke0 pke0Var, ContinuationImpl continuationImpl) {
        x3x x3xVar;
        Object obj;
        int i;
        y3x y3xVar;
        pke0 pke0Var2;
        y3x y3xVar2;
        if (continuationImpl instanceof x3x) {
            x3xVar = (x3x) continuationImpl;
            int i2 = x3xVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x3xVar.label = i2 - Integer.MIN_VALUE;
                obj = x3xVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = x3xVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    pke0 pke0Var3 = new pke0(pke0Var.a, pke0Var.b, pke0Var.c, pke0Var.d, pke0Var.e, true);
                    x3xVar.L$0 = this;
                    x3xVar.L$1 = pke0Var3;
                    x3xVar.label = 1;
                    obj = this.a.e(pke0Var3, x3xVar);
                    if (obj != coroutineSingletons) {
                        y3xVar = this;
                        pke0Var2 = pke0Var3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pke0Var2 = (pke0) x3xVar.L$1;
                    y3xVar2 = (y3x) x3xVar.L$0;
                    kotlin.a.a(obj);
                    int intValue = ((Number) obj).intValue();
                    Logger logger = y3xVar2.b;
                    StringBuilder sb = new StringBuilder("Insert test pushToken ");
                    sb.append(StringExtensionsKt.hideSensitive(pke0Var2.b));
                    sb.append(" has failed, update success = ");
                    sb.append(intValue > 0);
                    Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
                    return s3q0.a;
                }
                pke0Var2 = (pke0) x3xVar.L$1;
                y3xVar = (y3x) x3xVar.L$0;
                kotlin.a.a(obj);
                if (((Number) obj).longValue() < 0) {
                    qle0 qle0Var = y3xVar.a;
                    x3xVar.L$0 = y3xVar;
                    x3xVar.L$1 = pke0Var2;
                    x3xVar.label = 2;
                    obj = qle0Var.c(pke0Var2, x3xVar);
                    if (obj != coroutineSingletons) {
                        y3xVar2 = y3xVar;
                        int intValue2 = ((Number) obj).intValue();
                        Logger logger2 = y3xVar2.b;
                        StringBuilder sb2 = new StringBuilder("Insert test pushToken ");
                        sb2.append(StringExtensionsKt.hideSensitive(pke0Var2.b));
                        sb2.append(" has failed, update success = ");
                        sb2.append(intValue2 > 0);
                        Logger.DefaultImpls.info$default(logger2, sb2.toString(), null, 2, null);
                    }
                    return coroutineSingletons;
                }
                return s3q0.a;
            }
        }
        x3xVar = new x3x(this, continuationImpl);
        obj = x3xVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = x3xVar.label;
        if (i != 0) {
        }
        if (((Number) obj).longValue() < 0) {
        }
        return s3q0.a;
    }
}
