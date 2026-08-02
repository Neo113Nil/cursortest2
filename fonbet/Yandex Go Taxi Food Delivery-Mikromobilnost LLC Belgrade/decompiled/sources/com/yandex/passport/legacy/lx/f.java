package com.yandex.passport.legacy.lx;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class f extends m {
    public static final ExecutorService e = Executors.newCachedThreadPool();
    public final Handler c;
    public final m d;

    public f(m mVar) {
        super(mVar);
        this.c = new Handler(Looper.getMainLooper());
        this.d = mVar;
    }

    @Override // com.yandex.passport.legacy.lx.m
    public final Object c() {
        return this.d.c();
    }

    public final n e(a aVar, a aVar2) {
        n nVar = new n();
        nVar.c = this;
        nVar.b = e.submit(new e(new c(this, nVar, aVar, 0), new d(0, this), new c(this, nVar, aVar2, 1)));
        return nVar;
    }
}
