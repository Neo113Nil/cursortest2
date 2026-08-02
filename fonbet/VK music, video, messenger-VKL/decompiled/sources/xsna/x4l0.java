package xsna;

import android.graphics.Bitmap;

/* compiled from: ClipsStickerSelectionProvider.kt */
/* loaded from: classes16.dex */
public final class x4l0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final gzs<Bitmap> g;

    public x4l0() {
        throw null;
    }

    public x4l0(int i, int i2, int i3, int i4, String str, String str2, gzs gzsVar) {
        str2 = (i4 & 32) != 0 ? null : str2;
        gzsVar = (i4 & 64) != 0 ? null : gzsVar;
        this.a = str;
        this.b = i;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str2;
        this.g = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4l0)) {
            return false;
        }
        x4l0 x4l0Var = (x4l0) obj;
        return epx.f(this.a, x4l0Var.a) && this.b == x4l0Var.b && this.c == x4l0Var.c && this.d == x4l0Var.d && this.e == x4l0Var.e && epx.f(this.f, x4l0Var.f) && epx.f(this.g, x4l0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int a = shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31);
        String str2 = this.f;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        gzs<Bitmap> gzsVar = this.g;
        return hashCode + (gzsVar != null ? gzsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerItemStyle(text=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", projectionColor=");
        sb.append(this.c);
        sb.append(", iconColor=");
        sb.append(this.d);
        sb.append(", iconRes=");
        sb.append(this.e);
        sb.append(", iconUrl=");
        sb.append(this.f);
        sb.append(", iconBitmapProvider=");
        return uf3.d(sb, this.g, ')');
    }
}
