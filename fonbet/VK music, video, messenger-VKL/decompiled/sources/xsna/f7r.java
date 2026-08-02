package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes.dex */
public final class f7r {
    public final String a;
    public final Map<Class<?>, Object> b;

    public f7r(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    @NonNull
    public static f7r b(@NonNull String str) {
        return new f7r(str, Collections.EMPTY_MAP);
    }

    @Nullable
    public final <T extends Annotation> T a(@NonNull Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7r)) {
            return false;
        }
        f7r f7rVar = (f7r) obj;
        return this.a.equals(f7rVar.a) && this.b.equals(f7rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NonNull
    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
