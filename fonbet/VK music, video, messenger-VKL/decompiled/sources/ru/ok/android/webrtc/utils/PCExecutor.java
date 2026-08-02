package ru.ok.android.webrtc.utils;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.m690;

/* loaded from: classes9.dex */
public final class PCExecutor implements Handler.Callback {
    public static final ExecutorService b;
    public static final ThreadLocal c;
    public final ExecutorService a = b;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        b = newSingleThreadExecutor;
        c = new ThreadLocal();
        newSingleThreadExecutor.execute(new m690());
    }

    public void execute(String str, Runnable runnable) {
        this.a.execute(new i(this, runnable));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        i iVar = (i) message.obj;
        if (iVar.b) {
            return true;
        }
        int i = iVar.c + 1;
        iVar.c = i;
        if (i >= 4) {
            return true;
        }
        throw new IllegalStateException("No task duration check thread");
    }

    public boolean isExecuterThread() {
        return c.get() == b;
    }
}
