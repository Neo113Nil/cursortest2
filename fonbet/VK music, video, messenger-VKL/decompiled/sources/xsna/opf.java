package xsna;

import xsna.npf;

/* compiled from: ClipsWrapperAction.kt */
/* loaded from: classes17.dex */
public final class opf implements npf.c {
    public final boolean b;
    public final boolean c;

    public opf(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opf)) {
            return false;
        }
        opf opfVar = (opf) obj;
        return this.b == opfVar.b && this.c == opfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Update(selfProfileButtonAvailable=");
        sb.append(this.b);
        sb.append(", canGoBack=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
