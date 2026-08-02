package com.yandex.go.antirobot;

import defpackage.ekh;
import defpackage.i3y;
import defpackage.ktq0;
import defpackage.on2;
import defpackage.ppr;
import defpackage.qje;
import defpackage.tje;
import defpackage.utq0;
import defpackage.wg10;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class b implements ktq0 {
    public static final wg10 e;
    public final on2 a;
    public final com.yandex.go.antirobot.experiment.b b;
    public final ekh c = new ekh();
    public final i3y d = kotlin.a.a(new ppr(5, this));

    static {
        Regex regex = wg10.e;
        e = qje.o("application/json");
    }

    public b(on2 on2Var, com.yandex.go.antirobot.experiment.b bVar) {
        this.a = on2Var;
        this.b = bVar;
    }

    @Override // defpackage.ktq0
    public final utq0 a(String str, String str2) {
        return (utq0) tje.Y(EmptyCoroutineContext.a, new GoAntirobotServerConnection$getResponse$1(str2, this, str, null));
    }
}
