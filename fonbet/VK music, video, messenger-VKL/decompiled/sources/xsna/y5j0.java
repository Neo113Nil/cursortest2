package xsna;

import android.graphics.Path;
import androidx.annotation.Nullable;

/* compiled from: ShapeFill.java */
/* loaded from: classes12.dex */
public final class y5j0 implements eij {
    public final boolean a;
    public final Path.FillType b;
    public final String c;

    @Nullable
    public final mf2 d;

    @Nullable
    public final pf2 e;
    public final boolean f;

    public y5j0(String str, boolean z, Path.FillType fillType, @Nullable mf2 mf2Var, @Nullable pf2 pf2Var, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = mf2Var;
        this.e = pf2Var;
        this.f = z2;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new sbr(k800Var, aVar, this);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
