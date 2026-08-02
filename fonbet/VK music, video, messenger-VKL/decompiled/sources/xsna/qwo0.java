package xsna;

import android.graphics.Bitmap;

/* compiled from: TimelineItemStyle.kt */
/* loaded from: classes18.dex */
public final class qwo0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final gzs<Bitmap> g;
    public float h;

    public /* synthetic */ qwo0(int i, int i2, int i3, int i4, int i5, String str, String str2) {
        this(i, (i5 & 4) != 0 ? i : i2, i3, i4, str, (i5 & 32) != 0 ? null : str2, (gzs) null);
    }

    public final int a() {
        return swe0.g((int) (this.h * 255), 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwo0)) {
            return false;
        }
        qwo0 qwo0Var = (qwo0) obj;
        return epx.f(this.a, qwo0Var.a) && this.b == qwo0Var.b && this.c == qwo0Var.c && this.d == qwo0Var.d && this.e == qwo0Var.e && epx.f(this.f, qwo0Var.f) && epx.f(this.g, qwo0Var.g);
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
        StringBuilder sb = new StringBuilder("TimelineItemStyle(text=");
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

    public qwo0(int i, int i2, int i3, int i4, String str, String str2, gzs gzsVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str2;
        this.g = gzsVar;
        this.h = 1.0f;
    }
}
