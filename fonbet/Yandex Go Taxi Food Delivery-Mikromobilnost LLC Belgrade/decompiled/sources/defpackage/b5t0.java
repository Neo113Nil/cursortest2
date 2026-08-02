package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class b5t0 {
    public final Set a;
    public final Set b;

    public b5t0(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final Set a() {
        return this.a;
    }

    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b5t0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        b5t0 b5t0Var = (b5t0) obj;
        return jl40.l(this.a, b5t0Var.a) && jl40.l(this.b, b5t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SnippetSelector(ids=" + this.a + ", tags=" + this.b + Extension.C_BRAKE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b5t0(int i) {
        this(r1, r1);
        EmptySet emptySet = EmptySet.a;
    }

    public b5t0() {
        this(0);
    }
}
