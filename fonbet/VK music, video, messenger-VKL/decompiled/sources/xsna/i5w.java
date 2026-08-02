package xsna;

import com.vk.dto.common.Source;

/* compiled from: ImItemHistoryGetCmdArgs.kt */
/* loaded from: classes2.dex */
public final class i5w {
    public final wy1 a;
    public final int b;
    public final Source c;
    public final boolean d;

    public i5w(wy1 wy1Var, int i, Source source, boolean z) {
        this.a = wy1Var;
        this.b = i;
        this.c = source;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5w)) {
            return false;
        }
        i5w i5wVar = (i5w) obj;
        return epx.f(this.a, i5wVar.a) && this.b == i5wVar.b && this.c == i5wVar.c && this.d == i5wVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + io.reactivex.rxjava3.internal.operators.mixed.k.c(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImItemHistoryGetCmdArgs(from=");
        sb.append(this.a);
        sb.append(", limit=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
