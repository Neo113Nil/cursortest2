package com.yandex.go.captcha;

import com.yandex.go.captcha.api.AuthChallengeResult;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class AuthChallengeActivityListener$showExplainDialog$1 extends FunctionReferenceImpl implements tls {
    public AuthChallengeActivityListener$showExplainDialog$1(d dVar) {
        super(1, dVar, d.class, "challengeClosed", "challengeClosed(Lcom/yandex/go/captcha/api/AuthChallengeResult;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        d dVar = (d) this.receiver;
        dVar.j.set(false);
        dVar.a.a((AuthChallengeResult) obj);
        return zy11.a;
    }
}
