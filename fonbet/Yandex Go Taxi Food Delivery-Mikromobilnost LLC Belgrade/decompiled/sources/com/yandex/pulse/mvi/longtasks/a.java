package com.yandex.pulse.mvi.longtasks;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Printer;
import defpackage.hoz;
import defpackage.ioz;
import defpackage.t6f0;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class a implements ioz {
    public final Looper a;
    public final long b;
    public long c;
    public t6f0 e;
    public ArrayList d = new ArrayList();
    public final Printer f = new Printer() { // from class: com.yandex.pulse.mvi.longtasks.MainLooperLongTasksMonitor$1
        @Override // android.util.Printer
        public void println(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (str.startsWith(">>>>> Dispatching to ")) {
                a.this.c = uptimeMillis;
                return;
            }
            if (str.startsWith("<<<<< Finished to ")) {
                a aVar = a.this;
                long j = aVar.c;
                if (j != 0) {
                    long j2 = uptimeMillis - j;
                    if (j2 >= aVar.b) {
                        hoz hozVar = new hoz(j, j2);
                        if (aVar.e == null) {
                            aVar.d.add(hozVar);
                        } else {
                            aVar.e.b(Collections.singletonList(hozVar));
                        }
                    }
                }
            }
        }
    };

    public a(Looper looper, long j) {
        this.a = looper;
        this.b = j;
    }

    @Override // defpackage.ioz
    public final void a(t6f0 t6f0Var) {
        if (t6f0Var != null && this.d.size() > 0) {
            t6f0Var.b(this.d);
            this.d = new ArrayList();
        }
        this.e = t6f0Var;
    }

    @Override // defpackage.ioz
    public final void start() {
        this.d = new ArrayList();
        this.a.setMessageLogging(this.f);
    }

    @Override // defpackage.ioz
    public final void stop() {
        this.a.setMessageLogging(null);
    }
}
