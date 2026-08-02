package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5248vg {
    public final HashSet a = new HashSet();
    public C5298xg b;
    public boolean c;
    public final Go d;
    public final Context e;

    public C5248vg(Context context, Go go) {
        this.e = context;
        this.d = go;
        this.b = go.b();
        this.c = go.c();
    }

    public final void a() {
        if (this.c) {
            return;
        }
        Context context = this.e;
        InterfaceC4701ab a = Fg.a(context, C5342za.I.d.a());
        Cg cg = (Cg) new C5068og(this, new Fg(a), new La(context), new Gg(context)).f.getValue();
        try {
            a.a(cg);
        } catch (Throwable th) {
            cg.a(th);
        }
    }

    public final synchronized void a(C5348zg c5348zg) {
        this.a.add(c5348zg);
        if (this.c) {
            c5348zg.a(this.b);
        }
    }

    public final synchronized void a(C5298xg c5298xg) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C5348zg) it.next()).a(c5298xg);
        }
    }
}
