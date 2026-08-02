package xsna;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes.dex */
public final class lcg0 implements x8i {
    public final Set<toe0<?>> a;
    public final Set<toe0<?>> b;
    public final Set<toe0<?>> c;
    public final Set<toe0<?>> d;
    public final Set<toe0<?>> e;
    public final Set<Class<?>> f;
    public final x8i g;

    /* compiled from: RestrictedComponentContainer.java */
    /* loaded from: classes13.dex */
    public static class a implements gfe0 {
        public final Set<Class<?>> a;
        public final gfe0 b;

        public a(Set<Class<?>> set, gfe0 gfe0Var) {
            this.a = set;
            this.b = gfe0Var;
        }
    }

    public lcg0(i8i<?> i8iVar, x8i x8iVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<gzl> set = i8iVar.c;
        Set<Class<?>> set2 = i8iVar.g;
        for (gzl gzlVar : set) {
            int i = gzlVar.c;
            int i2 = gzlVar.b;
            boolean z = i == 0;
            toe0<?> toe0Var = gzlVar.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(toe0Var);
                } else {
                    hashSet.add(toe0Var);
                }
            } else if (i == 2) {
                hashSet3.add(toe0Var);
            } else if (i2 == 2) {
                hashSet5.add(toe0Var);
            } else {
                hashSet2.add(toe0Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(toe0.a(gfe0.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = set2;
        this.g = x8iVar;
    }

    @Override // xsna.x8i
    public final <T> T a(Class<T> cls) {
        if (this.a.contains(toe0.a(cls))) {
            T t = (T) this.g.a(cls);
            return !cls.equals(gfe0.class) ? t : (T) new a(this.f, (gfe0) t);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // xsna.x8i
    public final <T> f9e0<Set<T>> b(toe0<T> toe0Var) {
        if (this.e.contains(toe0Var)) {
            return this.g.b(toe0Var);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + toe0Var + ">>.");
    }

    @Override // xsna.x8i
    public final <T> T c(toe0<T> toe0Var) {
        if (this.a.contains(toe0Var)) {
            return (T) this.g.c(toe0Var);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + toe0Var + ".");
    }

    @Override // xsna.x8i
    public final <T> f9e0<T> d(toe0<T> toe0Var) {
        if (this.b.contains(toe0Var)) {
            return this.g.d(toe0Var);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + toe0Var + ">.");
    }

    @Override // xsna.x8i
    public final <T> f9e0<T> e(Class<T> cls) {
        return d(toe0.a(cls));
    }

    @Override // xsna.x8i
    public final <T> yrl<T> f(toe0<T> toe0Var) {
        if (this.c.contains(toe0Var)) {
            return this.g.f(toe0Var);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + toe0Var + ">.");
    }

    @Override // xsna.x8i
    public final <T> Set<T> g(toe0<T> toe0Var) {
        if (this.d.contains(toe0Var)) {
            return this.g.g(toe0Var);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + toe0Var + ">.");
    }

    public final <T> yrl<T> h(Class<T> cls) {
        return f(toe0.a(cls));
    }
}
