package com.yandex.go.splash.domain;

import android.os.Handler;
import android.os.Looper;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes8.dex */
public final class c {
    public final tse a;
    public final tt2 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public boolean d;

    public c(tse tseVar, tt2 tt2Var) {
        this.a = tseVar;
        this.b = tt2Var;
    }

    public final void a() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, o400.a, null, new SplashStateRepository$markSplashHidden$1(this, null), 2);
    }
}
