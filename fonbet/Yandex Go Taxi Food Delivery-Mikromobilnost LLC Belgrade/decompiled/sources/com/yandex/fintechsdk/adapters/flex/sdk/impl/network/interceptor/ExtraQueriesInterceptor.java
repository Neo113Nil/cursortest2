package com.yandex.fintechsdk.adapters.flex.sdk.impl.network.interceptor;

import defpackage.d5j0;
import defpackage.dh5;
import defpackage.jwu;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.m8w;
import defpackage.p8w;
import defpackage.t4j0;
import defpackage.zci0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/network/interceptor/ExtraQueriesInterceptor;", "Lp8w;", "Ldh5;", "extraQueriesProvider", "<init>", "(Ldh5;)V", "Lm8w;", "chain", "Lkvj0;", "intercept", "(Lm8w;)Lkvj0;", "Ldh5;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExtraQueriesInterceptor implements p8w {
    private final dh5 extraQueriesProvider;

    public ExtraQueriesInterceptor(dh5 dh5Var) {
        this.extraQueriesProvider = dh5Var;
    }

    @Override // defpackage.p8w
    public kvj0 intercept(m8w chain) {
        zci0 zci0Var = (zci0) chain;
        d5j0 d5j0Var = zci0Var.e;
        jwu g = d5j0Var.a.g();
        for (Map.Entry entry : this.extraQueriesProvider.a().entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                g.d(str, (String) it.next());
            }
        }
        kwu e = g.e();
        t4j0 b = d5j0Var.b();
        b.a = e;
        return zci0Var.b(new d5j0(b));
    }
}
