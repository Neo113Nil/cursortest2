package xsna;

import java.util.List;

/* compiled from: VideoInfo.kt */
/* loaded from: classes14.dex */
public final class zps0 {
    public final List<eqs0> a;
    public final CharSequence b;

    public zps0(CharSequence charSequence, List list) {
        this.a = list;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zps0)) {
            return false;
        }
        zps0 zps0Var = (zps0) obj;
        return epx.f(this.a, zps0Var.a) && epx.f(this.b, zps0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInfo(segments=");
        sb.append(this.a);
        sb.append(", separator=");
        return thl0.a(sb, this.b, ')');
    }
}
