package com.yandex.go.captcha;

import androidx.lifecycle.Lifecycle;
import defpackage.fb20;
import defpackage.hxx;
import defpackage.i38;
import defpackage.ii3;
import defpackage.ji3;
import defpackage.jj3;
import defpackage.jy60;
import defpackage.ki3;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.y4c0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class d implements jy60 {
    public final i38 a;
    public final jj3 b;
    public final ji3 c;
    public final ru.yandex.taxi.am.g d;
    public final com.yandex.go.antirobot.experiment.b e;
    public final fb20 f;
    public final oep0 g;
    public final tse h;
    public final Lifecycle i;
    public pzt0 k;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final String l = "AuthChallengeActivityListener";

    public d(i38 i38Var, jj3 jj3Var, ji3 ji3Var, ru.yandex.taxi.am.g gVar, com.yandex.go.antirobot.experiment.b bVar, fb20 fb20Var, oep0 oep0Var, tse tseVar, Lifecycle lifecycle) {
        this.a = i38Var;
        this.b = jj3Var;
        this.c = ji3Var;
        this.d = gVar;
        this.e = bVar;
        this.f = fb20Var;
        this.g = oep0Var;
        this.h = tseVar;
        this.i = lifecycle;
    }

    public static final void d(d dVar, ki3 ki3Var) {
        fb20 fb20Var = dVar.f;
        fb20Var.a.a("Antirobot.AuthChallenge.Explain.Opened", new Pair[0]);
        ((pep0) dVar.g).f(new y4c0((ii3) dVar.c.get(), fb20Var, dVar.b, new AuthChallengeActivityListener$showExplainDialog$1(dVar), 2), ki3Var, hxx.a);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.l;
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.h, null, null, new AuthChallengeActivityListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
