package xsna;

/* compiled from: TextSelectionColors.kt */
/* loaded from: classes11.dex */
public final class qlo0 {
    public final long a;
    public final long b;

    public qlo0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlo0)) {
            return false;
        }
        qlo0 qlo0Var = (qlo0) obj;
        return l5g.d(this.a, qlo0Var.a) && l5g.d(this.b, qlo0Var.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        dn.h(this.a, ", selectionBackgroundColor=", sb);
        return pm0.d(')', this.b, sb);
    }
}
