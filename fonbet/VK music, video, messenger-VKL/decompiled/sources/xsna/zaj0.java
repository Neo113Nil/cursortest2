package xsna;

/* compiled from: SharesContentState.kt */
/* loaded from: classes16.dex */
public final class zaj0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final String d;

    public zaj0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaj0)) {
            return false;
        }
        zaj0 zaj0Var = (zaj0) obj;
        return this.a == zaj0Var.a && this.b == zaj0Var.b && this.c == zaj0Var.c && epx.f(this.d, zaj0Var.d);
    }

    public final int hashCode() {
        int a = shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharesContentState(isAvailable=");
        sb.append(this.a);
        sb.append(", isFastShareAvailable=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", countString=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ zaj0(int i) {
        this(null, 0, true, false);
    }

    public zaj0(String str, int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = str;
    }
}
