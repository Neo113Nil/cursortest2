package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class lxq {
    public final String a;
    public final Map b;

    public lxq(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static hzk a(String str) {
        return new hzk(str);
    }

    public static lxq c(String str) {
        return new lxq(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxq)) {
            return false;
        }
        lxq lxqVar = (lxq) obj;
        return this.a.equals(lxqVar.a) && this.b.equals(lxqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
