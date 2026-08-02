package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.network.proxy.verifier.VkProxyPoll;
import kotlin.Result;
import xsna.y390;

/* compiled from: VkHostOverrideVerifier.kt */
/* loaded from: classes.dex */
public final class czu0 implements qev0 {
    public final cj00 b;

    public czu0(cj00 cj00Var, s3a s3aVar) {
        this.b = cj00Var;
    }

    @Override // xsna.qev0
    public final VkProxyPoll d() {
        String b;
        Object failure;
        dsw<UserId, v390> dswVar = y390.a;
        v390 a = y390.a.a();
        if (a == null || (b = v390.b("vk.ru", a.c(a.a))) == null) {
            return VkProxyPoll.NEXT;
        }
        if (b.equals("vk.ru")) {
            return VkProxyPoll.NEXT;
        }
        try {
            failure = Boolean.valueOf(this.b.a(b));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = Boolean.FALSE;
        }
        return ((Boolean) failure).booleanValue() ? VkProxyPoll.ERROR : VkProxyPoll.NEXT;
    }
}
