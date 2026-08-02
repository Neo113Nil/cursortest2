package xsna;

/* compiled from: UgcPackEditDataModel.kt */
/* loaded from: classes18.dex */
public final class iyp0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public iyp0(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyp0)) {
            return false;
        }
        iyp0 iyp0Var = (iyp0) obj;
        return epx.f(this.a, iyp0Var.a) && this.b == iyp0Var.b && this.c == iyp0Var.c && this.d == iyp0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UgcPackEditDataModel(stickerImageUploadUrl=");
        sb.append(this.a);
        sb.append(", stickerImageWidth=");
        sb.append(this.b);
        sb.append(", stickerImageHeight=");
        sb.append(this.c);
        sb.append(", stickersLimit=");
        return vu5.b(sb, this.d, ')');
    }
}
