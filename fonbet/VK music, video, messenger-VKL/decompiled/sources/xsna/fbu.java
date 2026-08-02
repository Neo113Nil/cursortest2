package xsna;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;

/* compiled from: GradientFill.java */
/* loaded from: classes12.dex */
public final class fbu implements eij {
    public final GradientType a;
    public final Path.FillType b;
    public final of2 c;
    public final pf2 d;
    public final uf2 e;
    public final uf2 f;
    public final String g;
    public final boolean h;

    public fbu(String str, GradientType gradientType, Path.FillType fillType, of2 of2Var, pf2 pf2Var, uf2 uf2Var, uf2 uf2Var2, boolean z) {
        this.a = gradientType;
        this.b = fillType;
        this.c = of2Var;
        this.d = pf2Var;
        this.e = uf2Var;
        this.f = uf2Var2;
        this.g = str;
        this.h = z;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new gbu(k800Var, i700Var, aVar, this);
    }
}
