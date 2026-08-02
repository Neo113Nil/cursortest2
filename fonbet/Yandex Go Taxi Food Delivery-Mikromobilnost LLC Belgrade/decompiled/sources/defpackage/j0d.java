package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class j0d {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final e1d f;
    public final Set g;

    public j0d(String str, Set set, Set set2, int i, int i2, e1d e1dVar, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = e1dVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static g0d a(jgg0 jgg0Var) {
        return new g0d(jgg0Var, new jgg0[0]);
    }

    public static g0d b(Class cls) {
        return new g0d(cls, new Class[0]);
    }

    public static j0d c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(jgg0.a(cls));
        for (Class cls2 : clsArr) {
            jhe0.a(cls2, "Null interface");
            hashSet.add(jgg0.a(cls2));
        }
        return new j0d(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new e0d(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
