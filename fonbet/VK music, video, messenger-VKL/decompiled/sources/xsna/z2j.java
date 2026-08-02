package xsna;

import java.util.List;

/* compiled from: ConfirmUserByServiceParams.kt */
/* loaded from: classes17.dex */
public final class z2j {
    public final String a;
    public final List<String> b;

    public z2j(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2j)) {
            return false;
        }
        z2j z2jVar = (z2j) obj;
        return epx.f(this.a, z2jVar.a) && epx.f(this.b, z2jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmUserByServiceParams(url=");
        sb.append(this.a);
        sb.append(", app2appUrls=");
        return ms9.a(')', sb, this.b);
    }
}
