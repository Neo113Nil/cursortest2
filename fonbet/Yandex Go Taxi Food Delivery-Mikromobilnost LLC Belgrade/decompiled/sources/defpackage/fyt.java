package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;

/* loaded from: classes10.dex */
public final class fyt implements ehe {
    public final GradientType a;
    public final Path.FillType b;
    public final ce2 c;
    public final ae2 d;
    public final ae2 e;
    public final ae2 f;
    public final String g;
    public final boolean h;

    public fyt(String str, GradientType gradientType, Path.FillType fillType, ce2 ce2Var, ae2 ae2Var, ae2 ae2Var2, ae2 ae2Var3, boolean z) {
        this.a = gradientType;
        this.b = fillType;
        this.c = ce2Var;
        this.d = ae2Var;
        this.e = ae2Var2;
        this.f = ae2Var3;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        return new gyt(lottieDrawable, nszVar, l35Var, this);
    }
}
