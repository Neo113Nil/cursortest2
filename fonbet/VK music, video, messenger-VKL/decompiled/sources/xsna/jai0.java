package xsna;

import androidx.compose.foundation.text.selection.CrossStatus;
import xsna.obi0;

/* compiled from: SelectionLayout.kt */
/* loaded from: classes11.dex */
public final class jai0 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ljo0 f;

    public jai0(long j, int i, int i2, int i3, int i4, ljo0 ljo0Var) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = ljo0Var;
    }

    public final obi0.a a(int i) {
        return new obi0.a(a020.s(this.f, i), i, this.a);
    }

    public final CrossStatus b() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        ljo0 ljo0Var = this.f;
        sb.append(a020.s(ljo0Var, i));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append(a020.s(ljo0Var, i2));
        sb.append("), prevOffset=");
        return vu5.b(sb, this.e, ')');
    }
}
