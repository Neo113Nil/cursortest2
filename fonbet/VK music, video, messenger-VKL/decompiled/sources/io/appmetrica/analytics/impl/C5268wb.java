package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.c5g;
import xsna.d4k;
import xsna.g5g;
import xsna.y370;

/* renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5268wb {
    public final C5131r2 a = new C5131r2();
    public final C5263w6 b = new C5263w6();
    public Jn c;
    public boolean d;
    public boolean e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC4830fb interfaceC4830fb) {
        if (this.e) {
            return;
        }
        g5g.A(this.b.a, new Ra[]{this.a.a(context, appMetricaConfig, interfaceC4830fb)});
        this.e = true;
    }

    public final synchronized void b() {
        if (this.d) {
            return;
        }
        C5263w6 c5263w6 = this.b;
        ArrayList arrayList = C5030n4.l().i.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c5263w6.a.addAll(arrayList2);
        this.d = true;
    }

    public final synchronized void c() {
        if (this.c != null) {
            return;
        }
        C4692a2 c4692a2 = new C4692a2(this.b);
        this.c = new Jn(c4692a2);
        In in = new In();
        in.a.add(c4692a2);
        AtomicBoolean atomicBoolean = d4k.a;
        in.a.add(y370.a);
        d4k.a(in);
    }

    public final synchronized void a() {
        this.b.a.clear();
        this.d = false;
        this.e = false;
    }
}
