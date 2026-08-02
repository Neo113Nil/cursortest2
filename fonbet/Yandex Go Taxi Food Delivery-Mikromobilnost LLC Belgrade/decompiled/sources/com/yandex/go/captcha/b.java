package com.yandex.go.captcha;

import com.yandex.go.captcha.api.AuthChallengeResult;
import defpackage.fb20;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tls;
import defpackage.y4c0;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class b implements sy60 {
    public final /* synthetic */ y4c0 a;

    public b(y4c0 y4c0Var) {
        this.a = y4c0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        qu quVar = new qu(9);
        y4c0 y4c0Var = this.a;
        y4c0Var.r(quVar);
        ((fb20) y4c0Var.F).a.a("Antirobot.AuthChallenge.Explain.Closed", new Pair[0]);
        ((AuthChallengeActivityListener$showExplainDialog$1) ((tls) y4c0Var.H)).invoke(AuthChallengeResult.Failure);
    }
}
