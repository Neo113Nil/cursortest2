package com.yandex.passport.internal.ui.domik.call;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.passport.internal.ui.bouncer.error.n;

/* loaded from: classes2.dex */
public final class f {
    public final Context a;
    public final n b;
    public final long c;
    public final b d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final com.yandex.passport.internal.ui.autologin.d f;

    public f(Context context, n nVar, long j, b bVar) {
        this.a = context;
        this.b = nVar;
        this.c = j;
        this.d = bVar;
        com.yandex.passport.internal.ui.autologin.d dVar = new com.yandex.passport.internal.ui.autologin.d(1, this);
        this.f = dVar;
        dVar.run();
    }
}
