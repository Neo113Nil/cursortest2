package defpackage;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes.dex */
public final class cir0 implements ehe {
    public final String a;
    public final int b;
    public final ae2 c;
    public final boolean d;

    public cir0(String str, int i, ae2 ae2Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = ae2Var;
        this.d = z;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        return new khr0(lottieDrawable, l35Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return oyr.s(sb, this.b, '}');
    }
}
