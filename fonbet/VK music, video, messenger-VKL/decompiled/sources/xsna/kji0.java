package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.auth.AuthTokenResult;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.test.TestPushPayload;
import java.util.UUID;
import xsna.sao0;

/* compiled from: SendTestPushComponentImpl.kt */
/* loaded from: classes5.dex */
public final class kji0 implements iji0 {
    public final yvj a;
    public final mji0 b;
    public final Logger c;

    public kji0(hpj hpjVar, mji0 mji0Var, Logger logger) {
        this.a = hpjVar;
        this.b = mji0Var;
        this.c = logger.createLogger(this);
    }

    @Override // xsna.iji0
    public final void a(String str, TestPushPayload testPushPayload, sao0.c cVar) {
        if (str == null) {
            return;
        }
        Logger.DefaultImpls.info$default(this.c, "send test push", null, 2, null);
        myc0.h(this.a, null, null, new jji0(this, str, testPushPayload, cVar, null), 3);
    }

    @Override // xsna.iji0
    public final void b(sao0.a aVar) {
        aVar.invoke(AidlResult.Companion.success(new AuthTokenResult(UUID.randomUUID().toString())));
    }
}
