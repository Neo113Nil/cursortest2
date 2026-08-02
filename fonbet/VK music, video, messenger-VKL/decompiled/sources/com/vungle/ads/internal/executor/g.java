package com.vungle.ads.internal.executor;

import java.util.concurrent.Callable;
import xsna.dwz;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class g {
    public static final h a(Runnable runnable, Runnable runnable2) {
        int i = j.b;
        return runnable instanceof com.vungle.ads.internal.task.j ? new e(runnable, runnable2) : new f(runnable, runnable2);
    }

    public static Callable b(Callable callable, i iVar) {
        return new dwz(2, callable, iVar);
    }

    public static final Object a(Callable callable, gzs gzsVar) {
        try {
            return callable.call();
        } catch (OutOfMemoryError unused) {
            gzsVar.invoke();
            return null;
        }
    }
}
