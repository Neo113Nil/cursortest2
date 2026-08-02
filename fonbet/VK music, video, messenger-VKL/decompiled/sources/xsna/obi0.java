package xsna;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* compiled from: Selection.kt */
/* loaded from: classes11.dex */
public final class obi0 {
    public final a a;
    public final a b;
    public final boolean c;

    /* compiled from: Selection.kt */
    public static final class a {
        public final ResolvedTextDirection a;
        public final int b;
        public final long c;

        public a(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            this.a = resolvedTextDirection;
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(this.a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", selectableId=");
            return vu5.a(')', this.c, sb);
        }
    }

    public obi0(a aVar, a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public static obi0 a(obi0 obi0Var, a aVar, a aVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            aVar = obi0Var.a;
        }
        if ((i & 2) != 0) {
            aVar2 = obi0Var.b;
        }
        if ((i & 4) != 0) {
            z = obi0Var.c;
        }
        obi0Var.getClass();
        return new obi0(aVar, aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obi0)) {
            return false;
        }
        obi0 obi0Var = (obi0) obj;
        return epx.f(this.a, obi0Var.a) && epx.f(this.b, obi0Var.b) && this.c == obi0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
