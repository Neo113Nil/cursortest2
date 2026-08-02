package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes7.dex */
public final class g extends j {
    public static final String e = "g";
    public final f a;
    public final e b;
    public final h c;
    public final n d;

    public g(f fVar, e eVar, h hVar, n nVar) {
        this.a = fVar;
        this.b = eVar;
        this.c = hVar;
        this.d = nVar;
    }

    @Override // com.vungle.ads.internal.task.j
    public final int a() {
        return this.a.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.d;
        if (nVar != null) {
            try {
                int a = ((i) nVar).a(this.a);
                Process.setThreadPriority(a);
                boolean z = u.a;
                t.a(e, "Setting process thread prio = " + a + " for " + this.a.d());
            } catch (Throwable unused) {
                boolean z2 = u.a;
                t.b(e, "Error on setting process thread priority");
            }
        }
        try {
            String d = this.a.d();
            Bundle c = this.a.c();
            boolean z3 = u.a;
            String str = e;
            t.a(str, "Start job " + d + "Thread " + Thread.currentThread().getName());
            int a2 = ((p) this.b).a(d).a(c, this.c);
            t.a(str, "On job finished " + d + " with result " + a2);
            if (a2 == 2) {
                this.a.getClass();
            }
        } catch (Exception e2) {
            boolean z4 = u.a;
            t.b(e, "Cannot create job" + e2.getLocalizedMessage());
        }
    }
}
