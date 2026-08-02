package xsna;

import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;

/* compiled from: DiscoverMediaPhotoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class y5n {
    public final int a;
    public final FontFamily b;
    public final float c;
    public final TextSizeUnit d;
    public final int e;
    public final float f;
    public final int g;
    public final float h;
    public final int i;
    public final FontFamily j;
    public final float k;
    public final TextSizeUnit l;
    public final float m;

    public y5n(int i, FontFamily fontFamily, float f, TextSizeUnit textSizeUnit, int i2, float f2, int i3, float f3, int i4, FontFamily fontFamily2, float f4, TextSizeUnit textSizeUnit2, float f5) {
        this.a = i;
        this.b = fontFamily;
        this.c = f;
        this.d = textSizeUnit;
        this.e = i2;
        this.f = f2;
        this.g = i3;
        this.h = f3;
        this.i = i4;
        this.j = fontFamily2;
        this.k = f4;
        this.l = textSizeUnit2;
        this.m = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5n)) {
            return false;
        }
        y5n y5nVar = (y5n) obj;
        return this.a == y5nVar.a && Float.compare(1.6f, 1.6f) == 0 && this.b == y5nVar.b && Float.compare(this.c, y5nVar.c) == 0 && this.d == y5nVar.d && this.e == y5nVar.e && Float.compare(this.f, y5nVar.f) == 0 && Float.compare(1.0f, 1.0f) == 0 && this.g == y5nVar.g && Float.compare(this.h, y5nVar.h) == 0 && this.i == y5nVar.i && this.j == y5nVar.j && Float.compare(this.k, y5nVar.k) == 0 && this.l == y5nVar.l && Float.compare(this.m, y5nVar.m) == 0 && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + io.reactivex.rxjava3.subjects.b.a(this.m, (this.l.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.k, (this.j.hashCode() + shy.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, shy.a(this.g, io.reactivex.rxjava3.subjects.b.a(1.0f, io.reactivex.rxjava3.subjects.b.a(this.f, shy.a(this.e, (this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, (this.b.hashCode() + io.reactivex.rxjava3.subjects.b.a(1.6f, Integer.hashCode(this.a) * 31, 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverMediaTextStyle(textContainerViewPadding=");
        sb.append(this.a);
        sb.append(", shadowRatio=1.6, titleViewFamily=");
        sb.append(this.b);
        sb.append(", titleViewSize=");
        sb.append(this.c);
        sb.append(", titleViewSizeUnit=");
        sb.append(this.d);
        sb.append(", titleViewMinHeight=");
        sb.append(this.e);
        sb.append(", titleViewAdd=");
        sb.append(this.f);
        sb.append(", titleViewMult=1.0, subtitleViewMarginTop=");
        sb.append(this.g);
        sb.append(", subtitleViewAlpha=");
        sb.append(this.h);
        sb.append(", subtitleViewMinHeight=");
        sb.append(this.i);
        sb.append(", subtitleViewFamily=");
        sb.append(this.j);
        sb.append(", subtitleViewSize=");
        sb.append(this.k);
        sb.append(", subtitleViewSizeUnit=");
        sb.append(this.l);
        sb.append(", subtitleViewAdd=");
        return shy.c(this.m, ", subtitleViewMult=1.0)", sb);
    }
}
