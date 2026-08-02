package xsna;

import xsna.uuf;

/* compiled from: ClipsWrapperMoreButtonMviState.kt */
/* loaded from: classes17.dex */
public final class hsf implements km50, uuf.d.b {
    public final ezt0 b;
    public final boolean c;

    public hsf() {
        this(0);
    }

    public static hsf a(hsf hsfVar, ezt0 ezt0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            ezt0Var = hsfVar.b;
        }
        if ((i & 2) != 0) {
            z = hsfVar.c;
        }
        hsfVar.getClass();
        return new hsf(ezt0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsf)) {
            return false;
        }
        hsf hsfVar = (hsf) obj;
        return epx.f(this.b, hsfVar.b) && this.c == hsfVar.c;
    }

    public final int hashCode() {
        ezt0 ezt0Var = this.b;
        return Boolean.hashCode(this.c) + ((ezt0Var == null ? 0 : ezt0Var.hashCode()) * 31);
    }

    @Override // xsna.uuf.d
    public final ppf o() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperMoreButtonMviState(button=");
        sb.append(this.b);
        sb.append(", isAvailable=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public /* synthetic */ hsf(int i) {
        this(null, false);
    }

    public hsf(ezt0 ezt0Var, boolean z) {
        this.b = ezt0Var;
        this.c = z;
    }
}
