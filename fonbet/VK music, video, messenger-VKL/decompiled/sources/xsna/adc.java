package xsna;

import android.graphics.PointF;

/* compiled from: CircleShape.java */
/* loaded from: classes12.dex */
public final class adc implements eij {
    public final String a;
    public final fg2<PointF, PointF> b;
    public final uf2 c;
    public final boolean d;
    public final boolean e;

    public adc(String str, fg2<PointF, PointF> fg2Var, uf2 uf2Var, boolean z, boolean z2) {
        this.a = str;
        this.b = fg2Var;
        this.c = uf2Var;
        this.d = z;
        this.e = z2;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new kbp(k800Var, aVar, this);
    }
}
