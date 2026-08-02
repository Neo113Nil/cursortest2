package defpackage;

import com.google.android.gms.internal.play_billing.p;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class a4a1 {
    public static final a4a1 c = new a4a1(0);
    public final jga1 a = new jga1();
    public boolean b;

    public a4a1(int i) {
        d();
        d();
    }

    public static void a() {
        throw null;
    }

    public static a4a1 b() {
        return c;
    }

    public final Iterator c() {
        jga1 jga1Var = this.a;
        return jga1Var.isEmpty() ? Collections.emptyIterator() : ((nxs0) jga1Var.entrySet()).iterator();
    }

    public final Object clone() {
        a4a1 a4a1Var = new a4a1();
        jga1 jga1Var = this.a;
        if (jga1Var.b > 0) {
            jga1Var.d(0).a.getClass();
            ny61.u();
            return null;
        }
        Iterator it = jga1Var.b().iterator();
        if (!it.hasNext()) {
            return a4a1Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            ny61.u();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final void d() {
        if (this.b) {
            return;
        }
        jga1 jga1Var = this.a;
        int i = jga1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = jga1Var.d(i2).b;
            if (obj instanceof p) {
                ((p) obj).m();
            }
        }
        Iterator it = jga1Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof p) {
                ((p) value).m();
            }
        }
        if (!jga1Var.w) {
            if (jga1Var.b > 0) {
                jga1Var.d(0).a.getClass();
                ny61.u();
                return;
            } else {
                Iterator it2 = jga1Var.b().iterator();
                if (it2.hasNext()) {
                    throw g8e.j((Map.Entry) it2.next());
                }
            }
        }
        if (!jga1Var.w) {
            jga1Var.c = jga1Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(jga1Var.c);
            jga1Var.y = jga1Var.y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(jga1Var.y);
            jga1Var.w = true;
        }
        this.b = true;
    }

    public final void e() {
        jga1 jga1Var = this.a;
        if (jga1Var.b > 0) {
            jga1Var.d(0).getKey().getClass();
            ny61.u();
        } else {
            Iterator it = jga1Var.b().iterator();
            if (it.hasNext()) {
                throw g8e.j((Map.Entry) it.next());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a4a1) {
            return this.a.equals(((a4a1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public a4a1() {
    }
}
