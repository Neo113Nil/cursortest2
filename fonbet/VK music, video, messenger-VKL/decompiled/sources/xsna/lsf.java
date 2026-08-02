package xsna;

import xsna.uuf;

/* compiled from: ClipsWrapperNavigationButtonMviState.kt */
/* loaded from: classes17.dex */
public final class lsf implements km50, uuf.g {
    public final ksf b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public lsf() {
        this(0);
    }

    public static lsf a(lsf lsfVar, ksf ksfVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            ksfVar = lsfVar.b;
        }
        ksf ksfVar2 = ksfVar;
        if ((i & 2) != 0) {
            z = lsfVar.c;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = lsfVar.d;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = lsfVar.e;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = lsfVar.f;
        }
        lsfVar.getClass();
        return new lsf(ksfVar2, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsf)) {
            return false;
        }
        lsf lsfVar = (lsf) obj;
        return epx.f(this.b, lsfVar.b) && this.c == lsfVar.c && this.d == lsfVar.d && this.e == lsfVar.e && this.f == lsfVar.f;
    }

    public final int hashCode() {
        ksf ksfVar = this.b;
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b((ksfVar == null ? 0 : ksfVar.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // xsna.uuf.g
    public final ksf o() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperNavigationButtonMviState(button=");
        sb.append(this.b);
        sb.append(", isVisible=");
        sb.append(this.c);
        sb.append(", hasBackButtonInNavigationMenu=");
        sb.append(this.d);
        sb.append(", selfProfileButtonAvailable=");
        sb.append(this.e);
        sb.append(", canGoBack=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public /* synthetic */ lsf(int i) {
        this(null, true, false, false, false);
    }

    public lsf(ksf ksfVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = ksfVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }
}
