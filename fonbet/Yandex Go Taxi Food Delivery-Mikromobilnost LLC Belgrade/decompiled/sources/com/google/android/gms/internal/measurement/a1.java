package com.google.android.gms.internal.measurement;

import defpackage.a7b1;
import defpackage.dxf0;
import defpackage.eqa1;
import defpackage.i9b1;
import defpackage.jab1;
import defpackage.kya1;
import defpackage.n7b1;
import defpackage.ny61;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class a1 extends w0 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected i9b1 zzc = i9b1.f;

    public static a1 n(Class cls) {
        Map map = zzd;
        a1 a1Var = (a1) map.get(cls);
        if (a1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                a1Var = (a1) map.get(cls);
            } catch (ClassNotFoundException e) {
                ny61.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = (a1) ((a1) jab1.e(cls)).q(6);
        if (a1Var2 != null) {
            map.put(cls, a1Var2);
            return a1Var2;
        }
        ny61.k();
        return null;
    }

    public static void o(Class cls, a1 a1Var) {
        a1Var.h();
        zzd.put(cls, a1Var);
    }

    public static Object p(Method method, a1 a1Var, Object... objArr) {
        try {
            return method.invoke(a1Var, objArr);
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

    @Override // defpackage.p5b1
    public final /* synthetic */ eqa1 b() {
        return (kya1) q(5);
    }

    @Override // defpackage.p5b1
    public final void c(y0 y0Var) {
        n7b1 a = a7b1.c.a(getClass());
        dxf0 dxf0Var = y0Var.a;
        if (dxf0Var == null) {
            dxf0Var = new dxf0(y0Var);
        }
        a.d(this, dxf0Var);
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final int e(n7b1 n7b1Var) {
        if (g()) {
            int c = n7b1Var.c(this);
            if (c >= 0) {
                return c;
            }
            ny61.q(String.valueOf(c).length() + 42, c);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int c2 = n7b1Var.c(this);
        if (c2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | c2;
            return c2;
        }
        ny61.q(String.valueOf(c2).length() + 42, c2);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a7b1.c.a(getClass()).b(this, (a1) obj);
    }

    public final boolean g() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            return a7b1.c.a(getClass()).h(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int h = a7b1.c.a(getClass()).h(this);
        this.zza = h;
        return h;
    }

    public final void i() {
        a7b1.c.a(getClass()).f(this);
        h();
    }

    public final kya1 j() {
        return (kya1) q(5);
    }

    public final kya1 k() {
        kya1 kya1Var = (kya1) q(5);
        kya1Var.g(this);
        return kya1Var;
    }

    public final void l() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int m() {
        if (g()) {
            int c = a7b1.c.a(getClass()).c(this);
            if (c >= 0) {
                return c;
            }
            ny61.q(String.valueOf(c).length() + 42, c);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int c2 = a7b1.c.a(getClass()).c(this);
        if (c2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | c2;
            return c2;
        }
        ny61.q(String.valueOf(c2).length() + 42, c2);
        return 0;
    }

    public abstract Object q(int i);

    public final String toString() {
        return b1.a(this, super.toString());
    }
}
