package xsna;

/* compiled from: MediaContext.kt */
/* loaded from: classes4.dex */
public final class pq10 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public pq10() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq10)) {
            return false;
        }
        pq10 pq10Var = (pq10) obj;
        return this.a == pq10Var.a && this.b == pq10Var.b && this.c == pq10Var.c && this.d == pq10Var.d && this.e == pq10Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaContext(shouldShowMediaActionsUi=");
        sb.append(this.a);
        sb.append(", areAnimationsEnabled=");
        sb.append(this.b);
        sb.append(", canOpenAttachments=");
        sb.append(this.c);
        sb.append(", isCropUiAvailable=");
        sb.append(this.d);
        sb.append(", isEditUiAvailable=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public /* synthetic */ pq10(int i) {
        this(true, true, true, true, true);
    }

    public pq10(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }
}
