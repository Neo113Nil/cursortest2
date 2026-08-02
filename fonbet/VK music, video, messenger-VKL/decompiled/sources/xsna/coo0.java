package xsna;

import java.util.Map;

/* compiled from: CommunityChannelTextCell.kt */
/* loaded from: classes17.dex */
public final class coo0 {
    public final us2 a;
    public final Map<String, r0x> b;

    public coo0(us2 us2Var, Map<String, r0x> map) {
        this.a = us2Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coo0)) {
            return false;
        }
        coo0 coo0Var = (coo0) obj;
        return epx.f(this.a, coo0Var.a) && epx.f(this.b, coo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextWithContent(text=");
        sb.append((Object) this.a);
        sb.append(", content=");
        return cjl0.a(sb, this.b, ')');
    }
}
