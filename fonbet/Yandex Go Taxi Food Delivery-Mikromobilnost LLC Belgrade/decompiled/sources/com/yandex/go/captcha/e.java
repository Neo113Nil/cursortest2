package com.yandex.go.captcha;

import com.yandex.go.captcha.api.AuthChallengeResult;
import defpackage.fb20;
import defpackage.qu;
import defpackage.tls;
import defpackage.y4c0;
import defpackage.zy11;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final /* synthetic */ class e implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        y4c0 y4c0Var = ((b) obj).a;
        y4c0Var.r(new qu(9));
        ((fb20) y4c0Var.F).a.a("Antirobot.AuthChallenge.Explain.Closed", new Pair[0]);
        ((AuthChallengeActivityListener$showExplainDialog$1) ((tls) y4c0Var.H)).invoke(AuthChallengeResult.Failure);
        return zy11.a;
    }
}
