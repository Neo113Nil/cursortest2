package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.x1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5283x1 implements Runnable {
    public final /* synthetic */ Context a;

    public RunnableC5283x1(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4710ak c4710ak = AbstractC5326yj.a;
        Context context = this.a;
        synchronized (c4710ak) {
            try {
                if (c4710ak.b == null) {
                    c4710ak.b = AbstractC5300xi.a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = c4710ak.a.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4753cb) it.next()).a(c4710ak.b);
                    }
                    c4710ak.a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
