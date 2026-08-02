package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;

/* loaded from: classes10.dex */
public final class pkq0 {
    public final Handle a;
    public final long b;
    public final SelectionHandleAnchor c;
    public final boolean d;

    public pkq0(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.a = handle;
        this.b = j;
        this.c = selectionHandleAnchor;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkq0)) {
            return false;
        }
        pkq0 pkq0Var = (pkq0) obj;
        return this.a == pkq0Var.a && wu60.c(this.b, pkq0Var.b) && this.c == pkq0Var.c && this.d == pkq0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) wu60.h(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return unr0.u(sb, this.d, ')');
    }
}
