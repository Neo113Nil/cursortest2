package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bdz0 {
    public final int a;
    public final List b;

    public bdz0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdz0)) {
            return false;
        }
        bdz0 bdz0Var = (bdz0) obj;
        return this.a == bdz0Var.a && jl40.l(this.b, bdz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TimelineState(currentActiveIndex=" + this.a + ", pointStates=" + this.b + Extension.C_BRAKE;
    }

    public bdz0() {
        this(0);
    }

    public /* synthetic */ bdz0(int i) {
        this(0, EmptyList.a);
    }
}
