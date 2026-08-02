package xsna;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import xsna.qk5;
import xsna.uon0;
import xsna.yl5;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public final class qdq0 {
    public final Context a;
    public final tv5 b;
    public final n0q c;
    public final dxx0 d;
    public final Executor e;
    public final uon0 f;
    public final zuf g;
    public final zuf h;
    public final klc i;

    public qdq0(Context context, tv5 tv5Var, n0q n0qVar, dxx0 dxx0Var, Executor executor, uon0 uon0Var, zuf zufVar, zuf zufVar2, klc klcVar) {
        this.a = context;
        this.b = tv5Var;
        this.c = n0qVar;
        this.d = dxx0Var;
        this.e = executor;
        this.f = uon0Var;
        this.g = zufVar;
        this.h = zufVar2;
        this.i = klcVar;
    }

    public final void a(eo5 eo5Var, int i) {
        com.google.android.datatransport.runtime.backends.a a;
        rop0 rop0Var = this.b.get(eo5Var.a);
        BackendResponse.e(0L);
        final long j = 0;
        while (true) {
            ioc iocVar = new ioc(this, eo5Var);
            uon0 uon0Var = this.f;
            if (!((Boolean) uon0Var.b(iocVar)).booleanValue()) {
                final eo5 eo5Var2 = eo5Var;
                uon0Var.b(new uon0.a() { // from class: xsna.jdq0
                    @Override // xsna.uon0.a
                    public final Object execute() {
                        qdq0 qdq0Var = qdq0.this;
                        qdq0Var.c.M3(qdq0Var.g.C() + j, eo5Var2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) uon0Var.b(new hdq0(this, eo5Var));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (rop0Var == null) {
                b200.a(eo5Var, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                a = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((oy90) it.next()).a());
                }
                if (eo5Var.c() != null) {
                    klc klcVar = this.i;
                    Objects.requireNonNull(klcVar);
                    nlc nlcVar = (nlc) uon0Var.b(new osk0(klcVar, 5));
                    yl5.a aVar = new yl5.a();
                    aVar.f = new HashMap();
                    aVar.d = Long.valueOf(this.g.C());
                    aVar.e = Long.valueOf(this.h.C());
                    aVar.a = "GDT_CLIENT_METRICS";
                    aVar.c = new uip(new ijp("proto"), nlcVar.b());
                    arrayList.add(rop0Var.b(aVar.b()));
                }
                qk5.a a2 = uv5.a();
                a2.b(arrayList);
                a2.c(eo5Var.b);
                a = rop0Var.a(a2.a());
            }
            if (a.c() == BackendResponse.Status.TRANSIENT_ERROR) {
                final eo5 eo5Var3 = eo5Var;
                uon0Var.b(new uon0.a() { // from class: xsna.idq0
                    @Override // xsna.uon0.a
                    public final Object execute() {
                        qdq0 qdq0Var = qdq0.this;
                        n0q n0qVar = qdq0Var.c;
                        n0qVar.G3(iterable);
                        n0qVar.M3(qdq0Var.g.C() + j, eo5Var3);
                        return null;
                    }
                });
                this.d.a(eo5Var3, i + 1, true);
                return;
            }
            eo5 eo5Var4 = eo5Var;
            uon0Var.b(new an6(this, iterable));
            if (a.c() == BackendResponse.Status.OK) {
                j = Math.max(j, a.b());
                if (eo5Var4.c() != null) {
                    uon0Var.b(new ugm0(this, 3));
                }
            } else if (a.c() == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String k = ((oy90) it2.next()).a().k();
                    if (hashMap.containsKey(k)) {
                        hashMap.put(k, Integer.valueOf(((Integer) hashMap.get(k)).intValue() + 1));
                    } else {
                        hashMap.put(k, 1);
                    }
                }
                uon0Var.b(new d4n(this, hashMap));
            }
            eo5Var = eo5Var4;
        }
    }
}
