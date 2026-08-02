package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q201 {
    public static final q201 c = new q201(0);
    public final n201 a;
    public final List b;

    public q201(n201 n201Var, List list) {
        this.a = n201Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q201)) {
            return false;
        }
        q201 q201Var = (q201) obj;
        return jl40.l(this.a, q201Var.a) && jl40.l(this.b, q201Var.b);
    }

    public final int hashCode() {
        n201 n201Var = this.a;
        return this.b.hashCode() + ((n201Var == null ? 0 : n201Var.hashCode()) * 31);
    }

    public final String toString() {
        return "TrackerRemoteDriverPath(activeRoute=" + this.a + ", track=" + this.b + Extension.C_BRAKE;
    }

    public q201() {
        this(0);
    }

    public /* synthetic */ q201(int i) {
        this(null, EmptyList.a);
    }
}
