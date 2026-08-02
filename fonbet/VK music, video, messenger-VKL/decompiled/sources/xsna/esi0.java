package xsna;

import java.util.List;

/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class esi0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;

    public esi0(String str, String str2, boolean z, List list) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esi0)) {
            return false;
        }
        esi0 esi0Var = (esi0) obj;
        return epx.f(this.a, esi0Var.a) && epx.f(this.b, esi0Var.b) && this.c == esi0Var.c && epx.f(this.d, esi0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesSection(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", showAllBtn=");
        sb.append(this.c);
        sb.append(", services=");
        return jr.a(')', sb, this.d);
    }
}
