package xsna;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Reflection.java */
/* loaded from: classes11.dex */
public final class fpf0 {
    public static final hpf0 a;
    public static final dcy[] b;

    static {
        hpf0 hpf0Var = null;
        try {
            hpf0Var = (hpf0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (hpf0Var == null) {
            hpf0Var = new hpf0();
        }
        a = hpf0Var;
        b = new dcy[0];
    }

    public static rfc a(Class cls) {
        a.getClass();
        return new rfc(cls);
    }

    public static utp0 b(utp0 utp0Var) {
        a.getClass();
        return new utp0(utp0Var.k(), utp0Var.d(), utp0Var.e(), utp0Var.b() | 2);
    }

    public static utp0 c(Class cls) {
        rfc a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new utp0(a2, list, true);
    }

    public static utp0 d(Class cls) {
        rfc a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new utp0(a2, list, false);
    }

    public static utp0 e(Class cls, wcy... wcyVarArr) {
        rfc a2 = a(cls);
        List u0 = rl3.u0(wcyVarArr);
        a.getClass();
        return new utp0(a2, u0, false);
    }

    public static utp0 f(wcy wcyVar) {
        rfc a2 = a(List.class);
        List singletonList = Collections.singletonList(wcyVar);
        a.getClass();
        return new utp0(a2, singletonList, false);
    }

    public static utp0 g(wcy wcyVar, wcy wcyVar2) {
        rfc a2 = a(Map.class);
        List asList = Arrays.asList(wcyVar, wcyVar2);
        a.getClass();
        return new utp0(a2, asList, false);
    }
}
