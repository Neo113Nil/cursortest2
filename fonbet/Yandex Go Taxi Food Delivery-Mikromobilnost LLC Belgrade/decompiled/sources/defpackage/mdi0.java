package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class mdi0 {
    public long a;
    public long b;
    public final Object c;
    public final /* synthetic */ Object d;

    public mdi0(ndi0 ndi0Var, long j) {
        this.d = ndi0Var;
        this.c = new LinkedHashMap(0, 0.75f, true);
        this.a = j;
        if (j > 0) {
            return;
        }
        ny61.g("maxSize <= 0");
        throw null;
    }

    public void a(Object obj, Object obj2, kdi0 kdi0Var) {
        kdi0 kdi0Var2 = (kdi0) obj2;
        ((tdi0) ((ndi0) this.d).b).b((ii10) obj, kdi0Var2.a, kdi0Var2.b, kdi0Var2.c);
    }

    public long b() {
        if (this.b == -1) {
            long j = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
                j += c(entry.getKey(), entry.getValue());
            }
            this.b = j;
        }
        return this.b;
    }

    public long c(Object obj, Object obj2) {
        try {
            long j = ((kdi0) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + Extension.FIX_SPACE + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.b = -1L;
            throw e;
        }
    }

    public void d(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        while (b() > j) {
            if (linkedHashMap.isEmpty()) {
                if (b() == 0) {
                    return;
                }
                ny61.r("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) a.O(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.b = b() - c(key, value);
                a(key, value, null);
            }
        }
    }

    public boolean e(long j, boolean z, boolean z2) {
        m8b1 m8b1Var = (m8b1) this.d;
        m8b1Var.Gg();
        m8b1Var.Hg();
        g gVar = (g) m8b1Var.b;
        boolean a = gVar.a();
        y1a1 y1a1Var = gVar.y;
        if (a) {
            o5a1 o5a1Var = gVar.x;
            g.e(o5a1Var);
            u4a1 u4a1Var = o5a1Var.J;
            gVar.D.getClass();
            u4a1Var.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            g.g(y1a1Var);
            y1a1Var.H.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        g.g(y1a1Var);
        y1a1Var.H.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !gVar.w.Ug();
        jya1 jya1Var = gVar.E;
        g.f(jya1Var);
        ieb1.wh(jya1Var.Mg(z3), bundle, true);
        if (!z2) {
            j jVar = gVar.F;
            g.f(jVar);
            jVar.Ng("auto", "_e", bundle);
        }
        this.a = j;
        s7b1 s7b1Var = (s7b1) this.c;
        s7b1Var.c();
        s7b1Var.b(((Long) nw91.q0.a(null)).longValue());
        return true;
    }

    public mdi0(m8b1 m8b1Var) {
        this.d = m8b1Var;
        g gVar = (g) m8b1Var.b;
        this.c = new s7b1(this, gVar, 0);
        gVar.D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }
}
