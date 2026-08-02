package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VideoPrivacyRulesDo.kt */
/* loaded from: classes7.dex */
public final class l6t0 {
    public final List<String> a;
    public final List<String> b;

    public l6t0(List<String> list, List<String> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6t0)) {
            return false;
        }
        l6t0 l6t0Var = (l6t0) obj;
        return epx.f(this.a, l6t0Var.a) && epx.f(this.b, l6t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPrivacyRulesDo(watch=");
        sb.append(this.a);
        sb.append(", comments=");
        return ms9.a(')', sb, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l6t0() {
        this(r0, r0);
        EmptyList emptyList = EmptyList.b;
    }
}
