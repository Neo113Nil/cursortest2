package defpackage;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes10.dex */
public final class bkq0 {
    public final ResolvedTextDirection a;
    public final int b;
    public final long c;

    public bkq0(ResolvedTextDirection resolvedTextDirection, int i, long j) {
        this.a = resolvedTextDirection;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkq0)) {
            return false;
        }
        bkq0 bkq0Var = (bkq0) obj;
        return this.a == bkq0Var.a && this.b == bkq0Var.b && this.c == bkq0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return b64.o(sb, this.c, ')');
    }
}
