package com.yandex.div.internal;

import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.s3q0;

/* compiled from: KLog.kt */
/* loaded from: classes7.dex */
public final class KLog {
    public static final KLog INSTANCE = new KLog();
    private static final List<LogListener> listeners = new ArrayList();

    private KLog() {
    }

    public final boolean isAtLeast(Severity severity) {
        return Log.isAtLeast(severity);
    }

    public final void print(int i, String str, String str2) {
        android.util.Log.println(i, str, str2);
        List<LogListener> list = listeners;
        synchronized (list) {
            try {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((LogListener) it.next()).onNewMessage(i, str, str2);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
