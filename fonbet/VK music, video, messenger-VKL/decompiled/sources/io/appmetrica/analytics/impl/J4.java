package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class J4 implements Qa, InterfaceC4712am, Sa {
    public final Context a;
    public final C4747c5 b;
    public final Km c;
    public final Jh d;
    public final Q4 e;
    public final C5255vn f;
    public ArrayList g;
    public final C4773d5 h;
    public final C5248vg i;
    public final C4823f4 j;
    public final Ag k;
    public final Object l;

    public J4(@NonNull Context context, @NonNull Rl rl, @NonNull C4747c5 c4747c5, @NonNull B4 b4, @NonNull C5248vg c5248vg) {
        this(context, rl, c4747c5, b4, new Jh(b4.b), c5248vg, new C4773d5(), new L4(), new Ag());
    }

    public static void b(B4 b4) {
        C5342za.I.c().b(!Boolean.FALSE.equals(b4.b.n));
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(@NonNull A4 a4) {
        Jh jh = this.d;
        jh.a = jh.a.mergeFrom(a4);
    }

    @Override // io.appmetrica.analytics.impl.Qa
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final A4 d() {
        return this.d.a;
    }

    @NonNull
    public final C5248vg e() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    @NonNull
    public final Context getContext() {
        return this.a;
    }

    public J4(Context context, Rl rl, C4747c5 c4747c5, B4 b4, Jh jh, C5248vg c5248vg, C4773d5 c4773d5, L4 l4, Ag ag) {
        this.g = new ArrayList();
        this.l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = c4747c5;
        this.d = jh;
        this.h = c4773d5;
        this.e = L4.a(this);
        b(b4);
        Km a = rl.a(applicationContext, c4747c5, b4.a);
        this.c = a;
        this.j = AbstractC4849g4.a(a, C5342za.k().c());
        this.f = l4.a(this, a);
        this.i = c5248vg;
        this.k = ag;
        rl.a(c4747c5, this);
    }

    public final synchronized void a(@NonNull G4 g4) {
        this.h.a.add(g4);
        N6.a(g4.c, this.j.a(Pm.a(this.c.e().l)));
    }

    public final synchronized void b(@NonNull G4 g4) {
        this.h.a.remove(g4);
    }

    @Override // io.appmetrica.analytics.impl.Qa
    @NonNull
    public final C4747c5 b() {
        return this.b;
    }

    public final void a(@NonNull C4722b6 c4722b6, @NonNull G4 g4) {
        Q4 q4 = this.e;
        q4.getClass();
        q4.a(c4722b6, new P4(g4));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4712am
    public final void a(@NonNull Tl tl, @Nullable C5100pm c5100pm) {
        synchronized (this.l) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    C4933jb c4933jb = (C4933jb) it.next();
                    N6.a(c4933jb.a, tl, this.j.a(c4933jb.c));
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4712am
    public final void a(@NonNull C5100pm c5100pm) {
        synchronized (this.l) {
            try {
                Iterator it = this.h.a.iterator();
                while (it.hasNext()) {
                    G4 g4 = (G4) it.next();
                    N6.a(g4.c, this.j.a(Pm.a(c5100pm.l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    C4933jb c4933jb = (C4933jb) it2.next();
                    if (AbstractC5022mm.a(c5100pm, c4933jb.b, c4933jb.c, new C4882hb())) {
                        N6.a(c4933jb.a, this.j.a(c4933jb.c));
                    } else {
                        arrayList.add(c4933jb);
                    }
                }
                this.g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(@Nullable C4933jb c4933jb) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c4933jb != null) {
            list = c4933jb.b;
            resultReceiver = c4933jb.a;
            hashMap = c4933jb.c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a = this.c.a(list, hashMap);
        if (!a) {
            N6.a(resultReceiver, this.j.a(hashMap));
        }
        if (!this.c.g()) {
            if (a) {
                N6.a(resultReceiver, this.j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.l) {
            if (a && c4933jb != null) {
                try {
                    this.g.add(c4933jb);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f.c();
    }

    public final void a(@Nullable ResultReceiver resultReceiver) {
        this.k.a(new I4(resultReceiver));
    }

    @NonNull
    public final C4823f4 a() {
        return this.j;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final void a(@NonNull B4 b4) {
        this.c.a(b4.a);
        a(b4.b);
    }
}
