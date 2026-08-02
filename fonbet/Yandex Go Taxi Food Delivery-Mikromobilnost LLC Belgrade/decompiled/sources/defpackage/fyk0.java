package defpackage;

import com.airbnb.lottie.LottieDrawable;
import java.util.List;

/* loaded from: classes.dex */
public final class fyk0 implements e35, uee {
    public final LottieDrawable a;
    public final i35 b;
    public lhr0 c;

    public fyk0(LottieDrawable lottieDrawable, l35 l35Var, eyk0 eyk0Var) {
        this.a = lottieDrawable;
        i35 I = eyk0Var.b().I();
        this.b = I;
        l35Var.c(I);
        I.a(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.e35
    public final void d() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
    }
}
