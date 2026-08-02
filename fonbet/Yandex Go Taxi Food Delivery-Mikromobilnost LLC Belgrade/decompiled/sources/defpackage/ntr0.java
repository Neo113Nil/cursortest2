package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.shimmer.ShimmerArgs$CompositeMode;
import com.ybsdk.widgets.common.shimmer.ShimmerArgs$GradientShape;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ntr0 {
    public static final ColorModel.Attr n = new ColorModel.Attr(ung0.ybColor_background_primary);
    public static final ShimmerArgs$GradientShape o = ShimmerArgs$GradientShape.VERTICAL;
    public static final ShimmerArgs$CompositeMode p = ShimmerArgs$CompositeMode.CLIP_TO_ALPHA;
    public final Context a;
    public final float b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final ShimmerArgs$CompositeMode h;
    public final boolean i;
    public final ColorModel j;
    public final ShimmerArgs$GradientShape k;
    public final int l;
    public final int m;

    public /* synthetic */ ntr0(Context context, float f, int i, long j, long j2, boolean z, boolean z2, ColorModel colorModel, ShimmerArgs$GradientShape shimmerArgs$GradientShape, int i2) {
        this(context, (i2 & 2) != 0 ? 0.6f : f, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 1250L : j, (i2 & 32) != 0 ? 75L : j2, true, (i2 & 128) != 0 ? true : z, p, (i2 & 512) != 0 ? true : z2, (i2 & 1024) != 0 ? n : colorModel, (i2 & 2048) != 0 ? o : shimmerArgs$GradientShape);
    }

    public static ntr0 a(ntr0 ntr0Var, float f, int i, long j, long j2, boolean z, ShimmerArgs$CompositeMode shimmerArgs$CompositeMode, ColorModel colorModel, int i2) {
        Context context = ntr0Var.a;
        float f2 = (i2 & 2) != 0 ? ntr0Var.b : f;
        ntr0Var.getClass();
        int i3 = (i2 & 8) != 0 ? ntr0Var.c : i;
        long j3 = (i2 & 16) != 0 ? ntr0Var.d : j;
        long j4 = (i2 & 32) != 0 ? ntr0Var.e : j2;
        boolean z2 = ntr0Var.f;
        boolean z3 = (i2 & 128) != 0 ? ntr0Var.g : z;
        ShimmerArgs$CompositeMode shimmerArgs$CompositeMode2 = (i2 & 256) != 0 ? ntr0Var.h : shimmerArgs$CompositeMode;
        boolean z4 = ntr0Var.i;
        ColorModel colorModel2 = (i2 & 1024) != 0 ? ntr0Var.j : colorModel;
        ShimmerArgs$GradientShape shimmerArgs$GradientShape = ntr0Var.k;
        ntr0Var.getClass();
        return new ntr0(context, f2, i3, j3, j4, z2, z3, shimmerArgs$CompositeMode2, z4, colorModel2, shimmerArgs$GradientShape);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntr0)) {
            return false;
        }
        ntr0 ntr0Var = (ntr0) obj;
        return jl40.l(this.a, ntr0Var.a) && Float.compare(this.b, ntr0Var.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.c == ntr0Var.c && this.d == ntr0Var.d && this.e == ntr0Var.e && this.f == ntr0Var.f && this.g == ntr0Var.g && this.h == ntr0Var.h && this.i == ntr0Var.i && jl40.l(this.j, ntr0Var.j) && this.k == ntr0Var.k;
    }

    public final int hashCode() {
        return this.k.hashCode() + vfc.d(this.j, unr0.e((this.h.hashCode() + unr0.e(unr0.e(qv10.c(qv10.c(oyr.b(this.c, g8e.c(0.0f, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShimmerArgs(context=");
        sb.append(this.a);
        sb.append(", highlightAlpha=");
        sb.append(this.b);
        sb.append(", baseAlpha=0.0, fixedWidth=");
        sb.append(this.c);
        sb.append(", animationDuration=");
        sb.append(this.d);
        x4e.A(this.e, ", repeatDelay=", ", clipToChildren=", sb);
        nnm.v(", autoStart=", ", compositeMode=", sb, this.f, this.g);
        sb.append(this.h);
        sb.append(", hardwareLayer=");
        sb.append(this.i);
        sb.append(", color=");
        sb.append(this.j);
        sb.append(", gradientShape=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public ntr0(Context context, float f, int i, long j, long j2, boolean z, boolean z2, ShimmerArgs$CompositeMode shimmerArgs$CompositeMode, boolean z3, ColorModel colorModel, ShimmerArgs$GradientShape shimmerArgs$GradientShape) {
        this.a = context;
        this.b = f;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = z2;
        this.h = shimmerArgs$CompositeMode;
        this.i = z3;
        this.j = colorModel;
        this.k = shimmerArgs$GradientShape;
        this.l = cob1.a(colorModel.get(context), 0.0f);
        this.m = cob1.a(colorModel.get(context), f);
    }
}
