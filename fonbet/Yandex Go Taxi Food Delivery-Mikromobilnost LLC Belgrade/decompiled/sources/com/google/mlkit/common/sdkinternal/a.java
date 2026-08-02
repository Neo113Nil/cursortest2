package com.google.mlkit.common.sdkinternal;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.zzw;
import defpackage.atx0;
import defpackage.do91;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class a {
    public static final Object b = new Object();
    public static a c;
    public final zza a;

    public a(Looper looper) {
        this.a = new zza(looper);
    }

    public static a a() {
        a aVar;
        synchronized (b) {
            try {
                if (c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    c = new a(handlerThread.getLooper());
                }
                aVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static zzw b(Callable callable) {
        atx0 atx0Var = new atx0();
        zzh.zza.execute(new do91(23, callable, atx0Var));
        return atx0Var.a;
    }

    public static Executor c() {
        return zzh.zza;
    }
}
