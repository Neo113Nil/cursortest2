package xsna;

import java.util.ArrayList;

/* compiled from: QrDecoder.kt */
/* loaded from: classes5.dex */
public final class nne0 {
    public final ArrayList a;
    public final boolean b;
    public final int c;
    public final int d;

    public nne0(int i, int i2, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nne0)) {
            return false;
        }
        nne0 nne0Var = (nne0) obj;
        return this.a.equals(nne0Var.a) && this.b == nne0Var.b && this.c == nne0Var.c && this.d == nne0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrDecodeResult(results=");
        sb.append(this.a);
        sb.append(", isGoogleVision=");
        sb.append(this.b);
        sb.append(", imageWidth=");
        sb.append(this.c);
        sb.append(", imageHeight=");
        return vu5.b(sb, this.d, ')');
    }
}
