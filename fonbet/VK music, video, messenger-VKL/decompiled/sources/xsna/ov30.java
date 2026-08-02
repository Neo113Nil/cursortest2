package xsna;

import java.util.List;

/* compiled from: MsgReplacementData.kt */
/* loaded from: classes2.dex */
public final class ov30 {
    public final String a;
    public final String b;
    public final List<Object> c;

    public ov30(String str, String str2, List<? extends Object> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov30)) {
            return false;
        }
        ov30 ov30Var = (ov30) obj;
        return epx.f(this.a, ov30Var.a) && epx.f(this.b, ov30Var.b) && epx.f(this.c, ov30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgReplacementData(placeholderName=");
        sb.append(this.a);
        sb.append(", replacement=");
        sb.append(this.b);
        sb.append(", spans=");
        return ms9.a(')', sb, this.c);
    }
}
