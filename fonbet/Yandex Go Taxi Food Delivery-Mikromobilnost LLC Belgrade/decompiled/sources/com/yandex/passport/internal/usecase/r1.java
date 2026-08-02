package com.yandex.passport.internal.usecase;

import kotlin.coroutines.Continuation;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class r1 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.credentials.d b;
    public final com.yandex.passport.internal.core.accounts.j c;

    public r1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.credentials.d dVar, com.yandex.passport.internal.core.accounts.j jVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = dVar;
        this.c = jVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        q1 q1Var = (q1) obj;
        com.yandex.passport.internal.credentials.d dVar = this.b;
        try {
            String userData = this.c.a.getUserData(q1Var.a(), "user_info_body");
            return dVar.a((userData != null ? new JSONObject(userData) : null).getString("x_token_client_id"), q1Var.b());
        } catch (Exception unused) {
            return com.yandex.passport.internal.util.p.g(dVar.a, q1Var.b());
        }
    }
}
