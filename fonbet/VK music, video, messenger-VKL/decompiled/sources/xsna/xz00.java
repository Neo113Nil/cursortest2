package xsna;

import com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsSize;

/* compiled from: MarketProductImages.kt */
/* loaded from: classes18.dex */
public final class xz00 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final MarketPaginationDotsSize e;

    public xz00(float f, float f2, float f3, float f4, MarketPaginationDotsSize marketPaginationDotsSize) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = marketPaginationDotsSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz00)) {
            return false;
        }
        xz00 xz00Var = (xz00) obj;
        return pco.b(this.a, xz00Var.a) && pco.b(this.b, xz00Var.b) && pco.b(this.c, xz00Var.c) && pco.b(this.d, xz00Var.d) && this.e == xz00Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketImagesSliderStyle(imageWidth=");
        oq.f(this.a, ", imageHeight=", sb);
        oq.f(this.b, ", pageSpacing=", sb);
        oq.f(this.c, ", paginationDotsPadding=", sb);
        oq.f(this.d, ", paginationDotsSize=", sb);
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
