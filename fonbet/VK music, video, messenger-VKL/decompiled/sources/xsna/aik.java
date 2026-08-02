package xsna;

/* compiled from: CropPhotoInfo.kt */
/* loaded from: classes4.dex */
public final class aik {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;

    public aik(String str, String str2, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aik)) {
            return false;
        }
        aik aikVar = (aik) obj;
        return this.a == aikVar.a && this.b == aikVar.b && epx.f(this.c, aikVar.c) && epx.f(this.d, aikVar.d);
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropPhotoInfo(isMoved=");
        sb.append(this.a);
        sb.append(", isZoomed=");
        sb.append(this.b);
        sb.append(", oldSize=");
        sb.append(this.c);
        sb.append(", newSize=");
        return ho8.a(sb, this.d, ')');
    }
}
