package yads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import xsna.y7z0;

/* loaded from: classes10.dex */
public final class oe0 {
    public static final c63 h = new y7z0();
    public static final Random i = new Random();
    public final v73 a;
    public final t73 b;
    public final HashMap c;
    public final c63 d;
    public if2 e;
    public w73 f;
    public String g;

    public oe0() {
        this(h);
    }

    public final synchronized void a(ye yeVar) {
        if2 if2Var;
        this.g = null;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ne0 ne0Var = (ne0) it.next();
            it.remove();
            if (ne0Var.e && (if2Var = this.e) != null) {
                ((nn1) if2Var).b(yeVar, ne0Var.a);
            }
        }
    }

    public final void b(ye yeVar) {
        zn1 zn1Var;
        if (yeVar.b.c()) {
            this.g = null;
            return;
        }
        ne0 ne0Var = (ne0) this.c.get(this.g);
        this.g = a(yeVar.c, yeVar.d).a;
        c(yeVar);
        zn1 zn1Var2 = yeVar.d;
        if (zn1Var2 == null || !zn1Var2.a()) {
            return;
        }
        if (ne0Var != null) {
            long j = ne0Var.c;
            zn1 zn1Var3 = yeVar.d;
            if (j == zn1Var3.d && (zn1Var = ne0Var.d) != null && zn1Var.b == zn1Var3.b && zn1Var.c == zn1Var3.c) {
                return;
            }
        }
        zn1 zn1Var4 = yeVar.d;
        a(yeVar.c, new zn1(zn1Var4.a, zn1Var4.d));
        this.e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1.d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(ye yeVar) {
        try {
            this.e.getClass();
        } finally {
        }
        if (yeVar.b.c()) {
            return;
        }
        ne0 ne0Var = (ne0) this.c.get(this.g);
        zn1 zn1Var = yeVar.d;
        if (zn1Var != null && ne0Var != null) {
            long j = ne0Var.c;
            if (j == -1) {
                if (ne0Var.b != yeVar.c) {
                    return;
                }
            }
        }
        ne0 a = a(yeVar.c, zn1Var);
        if (this.g == null) {
            this.g = a.a;
        }
        zn1 zn1Var2 = yeVar.d;
        if (zn1Var2 != null && zn1Var2.a()) {
            zn1 zn1Var3 = yeVar.d;
            Object obj = zn1Var3.a;
            ne0 a2 = a(yeVar.c, new zn1(zn1Var3.b, zn1Var3.d, obj));
            if (!a2.e) {
                a2.e = true;
                yeVar.b.a(yeVar.d.a, this.b);
                t73 t73Var = this.b;
                Math.max(0L, mc3.b(this.b.f) + mc3.b(t73Var.h.a(yeVar.d.b).b));
                this.e.getClass();
            }
        }
        if (!a.e) {
            a.e = true;
            this.e.getClass();
        }
        if (a.a.equals(this.g) && !a.f) {
            a.f = true;
            ((nn1) this.e).a(yeVar, a.a);
        }
    }

    public oe0(c63 c63Var) {
        this.d = c63Var;
        this.a = new v73();
        this.b = new t73();
        this.c = new HashMap();
        this.f = w73.b;
    }

    public static String a() {
        byte[] bArr = new byte[12];
        i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ne0 a(int i2, zn1 zn1Var) {
        long j;
        ne0 ne0Var = null;
        long j2 = Long.MAX_VALUE;
        for (ne0 ne0Var2 : this.c.values()) {
            if (ne0Var2.c == -1 && i2 == ne0Var2.b && zn1Var != null) {
                ne0Var2.c = zn1Var.d;
            }
            if (zn1Var == null) {
                if (i2 == ne0Var2.b) {
                    j = ne0Var2.c;
                    if (j == -1 || j < j2) {
                        ne0Var = ne0Var2;
                        j2 = j;
                    } else if (j == j2) {
                        int i3 = mc3.a;
                        if (ne0Var.d != null && ne0Var2.d != null) {
                            ne0Var = ne0Var2;
                        }
                    }
                }
            } else {
                zn1 zn1Var2 = ne0Var2.d;
                if (zn1Var2 == null) {
                    if (!zn1Var.a() && zn1Var.d == ne0Var2.c) {
                        j = ne0Var2.c;
                        if (j == -1) {
                        }
                        ne0Var = ne0Var2;
                        j2 = j;
                    }
                } else if (zn1Var.d == zn1Var2.d && zn1Var.b == zn1Var2.b && zn1Var.c == zn1Var2.c) {
                    j = ne0Var2.c;
                    if (j == -1) {
                    }
                    ne0Var = ne0Var2;
                    j2 = j;
                }
            }
        }
        if (ne0Var != null) {
            return ne0Var;
        }
        String str = (String) this.d.get();
        ne0 ne0Var3 = new ne0(this, str, i2, zn1Var);
        this.c.put(str, ne0Var3);
        return ne0Var3;
    }

    public final void a(if2 if2Var) {
        this.e = if2Var;
    }

    public final synchronized void a(ye yeVar, int i2) {
        try {
            this.e.getClass();
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                ne0 ne0Var = (ne0) it.next();
                if (ne0Var.a(yeVar)) {
                    it.remove();
                    if (ne0Var.e) {
                        if (ne0Var.a.equals(this.g)) {
                            this.g = null;
                        }
                        ((nn1) this.e).b(yeVar, ne0Var.a);
                    }
                }
            }
            b(yeVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
