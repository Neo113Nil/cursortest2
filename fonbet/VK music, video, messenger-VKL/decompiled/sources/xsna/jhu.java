package xsna;

/* compiled from: GroupCallCardTipFeatureState.kt */
/* loaded from: classes11.dex */
public final class jhu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;

    public jhu() {
        this(0);
    }

    public static jhu a(jhu jhuVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = jhuVar.a;
        }
        boolean z6 = z;
        if ((i2 & 2) != 0) {
            z2 = jhuVar.b;
        }
        boolean z7 = z2;
        if ((i2 & 4) != 0) {
            z3 = jhuVar.c;
        }
        boolean z8 = z3;
        if ((i2 & 8) != 0) {
            z4 = jhuVar.d;
        }
        boolean z9 = z4;
        if ((i2 & 16) != 0) {
            z5 = jhuVar.e;
        }
        boolean z10 = z5;
        if ((i2 & 32) != 0) {
            i = jhuVar.f;
        }
        jhuVar.getClass();
        return new jhu(z6, z7, z8, z9, z10, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhu)) {
            return false;
        }
        jhu jhuVar = (jhu) obj;
        return this.a == jhuVar.a && this.b == jhuVar.b && this.c == jhuVar.c && this.d == jhuVar.d && this.e == jhuVar.e && this.f == jhuVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupCallCardTipFeatureState(isNewCreatedGroupCall=");
        sb.append(this.a);
        sb.append(", wasClosed=");
        sb.append(this.b);
        sb.append(", shareCallLinkClicked=");
        sb.append(this.c);
        sb.append(", openAccessPanelClicked=");
        sb.append(this.d);
        sb.append(", isShareCallLinkSharing=");
        sb.append(this.e);
        sb.append(", participantsCount=");
        return vu5.b(sb, this.f, ')');
    }

    public /* synthetic */ jhu(int i) {
        this(false, false, false, false, false, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r6 == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jhu(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        boolean z6 = (!z || z2 || (z3 && z4)) ? false : true;
        this.g = z6;
    }
}
