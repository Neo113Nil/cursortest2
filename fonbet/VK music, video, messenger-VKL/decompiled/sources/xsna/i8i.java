package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes.dex */
public final class i8i<T> {
    public final String a;
    public final Set<toe0<? super T>> b;
    public final Set<gzl> c;
    public final int d;
    public final int e;
    public final b9i<T> f;
    public final Set<Class<?>> g;

    public i8i(@Nullable String str, Set<toe0<? super T>> set, Set<gzl> set2, int i, int i2, b9i<T> b9iVar, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = b9iVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    public static <T> a<T> b(toe0<T> toe0Var) {
        return new a<>(toe0Var, new toe0[0]);
    }

    @SafeVarargs
    public static <T> i8i<T> c(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(toe0.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            upj.a(cls2, "Null interface");
            hashSet.add(toe0.a(cls2));
        }
        return new i8i<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new y33(t), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    /* compiled from: Component.java */
    public static class a<T> {
        public String a = null;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public int e;
        public b9i<T> f;
        public final HashSet g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(toe0.a(cls));
            for (Class cls2 : clsArr) {
                upj.a(cls2, "Null interface");
                this.b.add(toe0.a(cls2));
            }
        }

        public final void a(gzl gzlVar) {
            if (this.b.contains(gzlVar.a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.c.add(gzlVar);
        }

        public final i8i<T> b() {
            if (this.f != null) {
                return new i8i<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i) {
            if (!(this.d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.d = i;
        }

        public a(toe0 toe0Var, toe0[] toe0VarArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(toe0Var);
            for (toe0 toe0Var2 : toe0VarArr) {
                upj.a(toe0Var2, "Null interface");
            }
            Collections.addAll(this.b, toe0VarArr);
        }
    }
}
