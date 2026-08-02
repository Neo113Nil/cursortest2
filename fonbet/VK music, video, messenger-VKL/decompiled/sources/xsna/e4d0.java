package xsna;

import android.net.Uri;

/* compiled from: PreviewImageCropArea.kt */
/* loaded from: classes18.dex */
public final class e4d0 {
    public String a;
    public Uri b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;

    public e4d0(String str, Uri uri, int i, int i2, int i3, int i4, boolean z) {
        this.a = str;
        this.b = uri;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4d0)) {
            return false;
        }
        e4d0 e4d0Var = (e4d0) obj;
        return epx.f(this.a, e4d0Var.a) && epx.f(this.b, e4d0Var.b) && this.c == e4d0Var.c && this.d == e4d0Var.d && this.e == e4d0Var.e && this.f == e4d0Var.f && this.g == e4d0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Boolean.hashCode(this.g) + shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, (hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewImageCropArea(photoId=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", x=");
        sb.append(this.c);
        sb.append(", y=");
        sb.append(this.d);
        sb.append(", width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append(", isInitialSet=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
