package com.monetization.ads.network.core;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class c implements Executor {
    public final /* synthetic */ Handler a;

    public c(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
