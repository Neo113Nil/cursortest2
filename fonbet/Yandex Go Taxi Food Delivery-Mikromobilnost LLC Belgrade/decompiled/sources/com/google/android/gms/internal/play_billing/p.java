package com.google.android.gms.internal.play_billing;

import defpackage.dxf0;
import defpackage.eka1;
import defpackage.g5a1;
import defpackage.ny61;
import defpackage.ofa1;
import defpackage.ov91;
import defpackage.oyr;
import defpackage.pia1;
import defpackage.xea1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class p extends m {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected pia1 zzc = pia1.f;

    public static p k(Class cls) {
        Map map = zzb;
        p pVar = (p) map.get(cls);
        if (pVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                pVar = (p) map.get(cls);
            } catch (ClassNotFoundException e) {
                ny61.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = (p) ((p) eka1.g(cls)).g(6);
        if (pVar2 != null) {
            map.put(cls, pVar2);
            return pVar2;
        }
        ny61.k();
        return null;
    }

    public static Object l(Method method, p pVar, Object... objArr) {
        try {
            return method.invoke(pVar, objArr);
        } catch (IllegalAccessException e) {
            ny61.n("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            ny61.n("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void o(Class cls, p pVar) {
        pVar.n();
        zzb.put(cls, pVar);
    }

    public static final boolean q(p pVar, boolean z) {
        byte byteValue = ((Byte) pVar.g(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a = xea1.c.a(pVar.getClass()).a(pVar);
        if (z) {
            pVar.g(2);
        }
        return a;
    }

    @Override // com.google.android.gms.internal.play_billing.m
    public final /* synthetic */ ov91 a() {
        return (g5a1) g(5);
    }

    @Override // com.google.android.gms.internal.play_billing.m
    public final int b(ofa1 ofa1Var) {
        if (e()) {
            int c = ofa1Var.c(this);
            if (c >= 0) {
                return c;
            }
            ny61.r(oyr.i(c, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int c2 = ofa1Var.c(this);
        if (c2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | c2;
            return c2;
        }
        ny61.r(oyr.i(c2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return xea1.c.a(getClass()).e(this, (p) obj);
    }

    public final void f(n nVar) {
        ofa1 a = xea1.c.a(getClass());
        dxf0 dxf0Var = nVar.a;
        if (dxf0Var == null) {
            dxf0Var = new dxf0(nVar);
        }
        a.g(this, dxf0Var);
    }

    public abstract Object g(int i);

    public final int h() {
        if (e()) {
            int c = xea1.c.a(getClass()).c(this);
            if (c >= 0) {
                return c;
            }
            ny61.r(oyr.i(c, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int c2 = xea1.c.a(getClass()).c(this);
        if (c2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | c2;
            return c2;
        }
        ny61.r(oyr.i(c2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final int hashCode() {
        if (e()) {
            return xea1.c.a(getClass()).d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int d = xea1.c.a(getClass()).d(this);
        this.zza = d;
        return d;
    }

    public final g5a1 i() {
        return (g5a1) g(5);
    }

    public final g5a1 j() {
        g5a1 g5a1Var = (g5a1) g(5);
        if (!g5a1Var.a.equals(this)) {
            if (!g5a1Var.b.e()) {
                p pVar = (p) g5a1Var.a.g(4);
                xea1.c.a(pVar.getClass()).f(pVar, g5a1Var.b);
                g5a1Var.b = pVar;
            }
            p pVar2 = g5a1Var.b;
            xea1.c.a(pVar2.getClass()).f(pVar2, this);
        }
        return g5a1Var;
    }

    public final void m() {
        xea1.c.a(getClass()).b(this);
        n();
    }

    public final void n() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void p() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return r.a(this, super.toString());
    }
}
