package com.yandex.passport.internal.network.client;

import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.entities.JwtToken;
import defpackage.kvj0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$getJwtToken$1 extends FunctionReferenceImpl implements tls {
    public BackendClient$getJwtToken$1(Object obj) {
        super(1, obj, com.yandex.passport.internal.network.a.class, "parseJwtToken", "parseJwtToken(Lokhttp3/Response;)Lcom/yandex/passport/internal/entities/JwtToken;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kvj0 kvj0Var = (kvj0) obj;
        ((com.yandex.passport.internal.network.a) this.receiver).getClass();
        String c = com.yandex.passport.internal.network.a.c(kvj0Var);
        if (kvj0Var.J) {
            return new JwtToken(c, 0L);
        }
        if (kvj0Var.w == 401) {
            throw new InvalidTokenException();
        }
        throw new FailedResponseException(c);
    }
}
