package xsna;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;

/* compiled from: SelectionHandles.kt */
/* loaded from: classes11.dex */
public final class jdi0 {
    public final Handle a;
    public final long b;
    public final SelectionHandleAnchor c;
    public final boolean d;

    public jdi0(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.a = handle;
        this.b = j;
        this.c = selectionHandleAnchor;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdi0)) {
            return false;
        }
        jdi0 jdi0Var = (jdi0) obj;
        return this.a == jdi0Var.a && ov70.c(this.b, jdi0Var.b) && this.c == jdi0Var.c && this.d == jdi0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) ov70.h(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
