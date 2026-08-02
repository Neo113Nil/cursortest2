package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class j5x0 {
    public static final j5x0 c = new j5x0(EmptyList.a, null);
    public final List a;
    public final Integer b;

    public j5x0(List list, Integer num) {
        this.a = list;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5x0)) {
            return false;
        }
        j5x0 j5x0Var = (j5x0) obj;
        return this.a.equals(j5x0Var.a) && jl40.l(this.b, j5x0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "State(tabs=" + this.a + ", selectedTabIndex=" + this.b + Extension.C_BRAKE;
    }
}
