package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes.dex */
public final class ohr0 implements ehe {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final ae2 d;
    public final ae2 e;
    public final boolean f;

    public ohr0(String str, boolean z, Path.FillType fillType, ae2 ae2Var, ae2 ae2Var2, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = ae2Var;
        this.e = ae2Var2;
        this.f = z2;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        return new j3r(lottieDrawable, l35Var, this);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
