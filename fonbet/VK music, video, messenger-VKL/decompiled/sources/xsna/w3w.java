package xsna;

/* compiled from: ImExperimentsSseConfig.kt */
/* loaded from: classes2.dex */
public final class w3w {
    public static final w3w f = new w3w(0);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public w3w() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3w)) {
            return false;
        }
        w3w w3wVar = (w3w) obj;
        return this.a == w3wVar.a && this.b == w3wVar.b && this.c == w3wVar.c && this.d == w3wVar.d && this.e == w3wVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImExperimentsSseConfig(sseStatEnabled=");
        sb.append(this.a);
        sb.append(", sseInitialReadTimeoutMs=");
        sb.append(this.b);
        sb.append(", sseTwoGReadThresholdMs=");
        sb.append(this.c);
        sb.append(", sseThreeGReadThresholdMs=");
        sb.append(this.d);
        sb.append(", sseWifiReadThresholdMs=");
        return vu5.b(sb, this.e, ')');
    }

    public /* synthetic */ w3w(int i) {
        this(false, 25000, 15000, 10000, 5000);
    }

    public w3w(boolean z, int i, int i2, int i3, int i4) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
