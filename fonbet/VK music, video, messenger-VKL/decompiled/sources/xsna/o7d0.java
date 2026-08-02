package xsna;

/* compiled from: PrimaryBlockAlbumItemModel.kt */
/* loaded from: classes17.dex */
public final class o7d0 {
    public final int a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final boolean f;

    public o7d0(String str, boolean z, boolean z2, String str2, int i, int i2) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = i2;
        this.e = str2;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7d0)) {
            return false;
        }
        o7d0 o7d0Var = (o7d0) obj;
        return this.a == o7d0Var.a && epx.f(this.b, o7d0Var.b) && this.c == o7d0Var.c && this.d == o7d0Var.d && epx.f(this.e, o7d0Var.e) && this.f == o7d0Var.f;
    }

    public final int hashCode() {
        int a = shy.a(this.d, qoy.b(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrimaryBlockAlbumItemModel(uid=");
        sb.append(this.a);
        sb.append(", descriptionTxt=");
        sb.append(this.b);
        sb.append(", isHighlightDescription=");
        sb.append(this.c);
        sb.append(", count=");
        sb.append(this.d);
        sb.append(", imageUrl=");
        sb.append(this.e);
        sb.append(", holdBottomSpace=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
