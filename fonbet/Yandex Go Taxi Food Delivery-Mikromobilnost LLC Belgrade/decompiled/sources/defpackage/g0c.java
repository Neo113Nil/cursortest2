package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class g0c implements lfx, zzb {
    public static final Map b;
    public final Class a;

    static {
        List g = scc.g(sls.class, tls.class, wls.class, zls.class, bms.class, dms.class, ems.class, fms.class, gms.class, hms.class, r1d.class, r1d.class, uls.class, r1d.class, r1d.class, r1d.class, r1d.class, r1d.class, r1d.class, r1d.class, r1d.class, r1d.class, xls.class);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        int i = 0;
        for (Object obj : g) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = b.s(arrayList);
    }

    public g0c(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.zzb
    public final Class a() {
        return this.a;
    }

    public final String c() {
        String j;
        Class cls = this.a;
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String j2 = uh6.j(cls.getName());
            return j2 == null ? cls.getCanonicalName() : j2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (j = uh6.j(componentType.getName())) != null) {
            str = j.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String d() {
        String O;
        Class cls = this.a;
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String O2 = uh6.O(cls.getName());
                return O2 == null ? cls.getSimpleName() : O2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (O = uh6.O(componentType.getName())) != null) {
                str = O.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return evu0.d0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return evu0.c0('$', simpleName, simpleName);
        }
        return evu0.d0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean e(Object obj) {
        Map map = b;
        Class cls = this.a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return ym11.f(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = ffx.N(qoi0.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0c) && ffx.N(this).equals(ffx.N((lfx) obj));
    }

    public final int hashCode() {
        return ffx.N(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
