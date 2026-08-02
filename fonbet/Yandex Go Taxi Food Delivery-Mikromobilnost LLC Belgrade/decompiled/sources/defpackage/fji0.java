package defpackage;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes.dex */
public final class fji0 implements ehe {
    public final String a;
    public final ie2 b;
    public final ie2 c;
    public final be2 d;
    public final boolean e;

    public fji0(String str, ie2 ie2Var, ae2 ae2Var, be2 be2Var, boolean z) {
        this.a = str;
        this.b = ie2Var;
        this.c = ae2Var;
        this.d = be2Var;
        this.e = z;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        return new eji0(lottieDrawable, l35Var, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
