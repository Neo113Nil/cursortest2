package xsna;

import com.vk.push.core.base.AidlResult;
import com.vk.push.core.test.SendTestPushResult;
import com.vk.push.core.test.TestPushPayload;
import com.vk.push.pushsdk.domain.model.MessagePriority;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.eje0;
import xsna.uje0;

/* compiled from: SendTestPushUseCase.kt */
/* loaded from: classes5.dex */
public final class mji0 {
    public final rao0 a;
    public final qle0 b;
    public final don0 c;
    public final qta<wje0> d;

    public mji0(rao0 rao0Var, sle0 sle0Var, don0 don0Var, qta qtaVar) {
        this.a = rao0Var;
        this.b = sle0Var;
        this.c = don0Var;
        this.d = qtaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x011d, code lost:
    
        if (r1.t(r2, r3) == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, TestPushPayload testPushPayload, ContinuationImpl continuationImpl) {
        lji0 lji0Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        TestPushPayload testPushPayload2;
        Object c;
        mji0 mji0Var;
        Object b;
        String str2;
        eje0 eje0Var;
        mji0 mji0Var2;
        tle0 tle0Var;
        String str3 = str;
        if (continuationImpl instanceof lji0) {
            lji0Var = (lji0) continuationImpl;
            int i2 = lji0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lji0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = lji0Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lji0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    lji0Var.L$0 = this;
                    lji0Var.L$1 = str3;
                    testPushPayload2 = testPushPayload;
                    lji0Var.L$2 = testPushPayload2;
                    lji0Var.label = 1;
                    c = this.c.c(str3, lji0Var);
                    if (c != coroutineSingletons) {
                        mji0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    TestPushPayload testPushPayload3 = (TestPushPayload) lji0Var.L$2;
                    String str4 = (String) lji0Var.L$1;
                    mji0Var = (mji0) lji0Var.L$0;
                    kotlin.a.a(obj);
                    testPushPayload2 = testPushPayload3;
                    str3 = str4;
                    c = obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return AidlResult.Companion.success(SendTestPushResult.SUCCESS);
                    }
                    eje0Var = (eje0) lji0Var.L$2;
                    str2 = (String) lji0Var.L$1;
                    mji0Var2 = (mji0) lji0Var.L$0;
                    kotlin.a.a(obj);
                    tle0Var = (tle0) obj;
                    if (tle0Var != null) {
                        return AidlResult.Companion.failure(new Exception("Required push token not registered, get push token firstly"));
                    }
                    uje0.b bVar = new uje0.b(str2, tle0Var.a, false, Collections.singletonList(eje0Var));
                    qta<wje0> qtaVar = mji0Var2.d;
                    wje0 wje0Var = new wje0(Collections.singletonList(bVar), true, ReceivedBy.TEST);
                    lji0Var.L$0 = null;
                    lji0Var.L$1 = null;
                    lji0Var.L$2 = null;
                    lji0Var.label = 3;
                }
                Long l = (Long) c;
                long longValue = (l == null ? l.longValue() : 0L) + 1;
                rao0 rao0Var = mji0Var.a;
                Map<String, String> data = testPushPayload2.getData();
                eje0 eje0Var2 = new eje0(longValue, null, MessagePriority.NORMAL, 0, 0, System.currentTimeMillis() + rao0.a, LoginRequest.CLIENT_NAME, data.isEmpty() ? new JSONObject(data).toString() : null, new eje0.a(testPushPayload2.getTitle(), testPushPayload2.getBody(), testPushPayload2.getImgUrl(), null, null, null, null, null), 0L);
                qle0 qle0Var = mji0Var.b;
                lji0Var.L$0 = mji0Var;
                lji0Var.L$1 = str3;
                lji0Var.L$2 = eje0Var2;
                lji0Var.label = 2;
                b = qle0Var.b(str3, lji0Var);
                if (b != coroutineSingletons) {
                    str2 = str3;
                    eje0Var = eje0Var2;
                    obj = b;
                    mji0Var2 = mji0Var;
                    tle0Var = (tle0) obj;
                    if (tle0Var != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        lji0Var = new lji0(this, continuationImpl);
        Object obj2 = lji0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lji0Var.label;
        if (i != 0) {
        }
        Long l2 = (Long) c;
        long longValue2 = (l2 == null ? l2.longValue() : 0L) + 1;
        rao0 rao0Var2 = mji0Var.a;
        Map<String, String> data2 = testPushPayload2.getData();
        eje0 eje0Var22 = new eje0(longValue2, null, MessagePriority.NORMAL, 0, 0, System.currentTimeMillis() + rao0.a, LoginRequest.CLIENT_NAME, data2.isEmpty() ? new JSONObject(data2).toString() : null, new eje0.a(testPushPayload2.getTitle(), testPushPayload2.getBody(), testPushPayload2.getImgUrl(), null, null, null, null, null), 0L);
        qle0 qle0Var2 = mji0Var.b;
        lji0Var.L$0 = mji0Var;
        lji0Var.L$1 = str3;
        lji0Var.L$2 = eje0Var22;
        lji0Var.label = 2;
        b = qle0Var2.b(str3, lji0Var);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
