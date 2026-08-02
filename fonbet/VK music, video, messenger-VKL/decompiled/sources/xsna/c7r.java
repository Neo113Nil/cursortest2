package xsna;

import com.vk.core.bundle.Descriptor;

/* compiled from: Fields.kt */
/* loaded from: classes.dex */
public class c7r {
    public final String a;
    public final Descriptor b;

    public c7r(String str, Descriptor descriptor) {
        this.a = str;
        this.b = descriptor;
    }

    public final boolean equals(Object obj) {
        c7r c7rVar = obj instanceof c7r ? (c7r) obj : null;
        return (c7rVar != null ? c7rVar.b : null) == this.b && epx.f(c7rVar.a, this.a);
    }

    public final int hashCode() {
        return (this.b.ordinal() * 3) + (this.a.hashCode() * 2);
    }
}
