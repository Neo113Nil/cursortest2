package xsna;

import android.graphics.PointF;

/* compiled from: RectangleShape.java */
/* loaded from: classes12.dex */
public final class nif0 implements eij {
    public final String a;
    public final fg2<PointF, PointF> b;
    public final fg2<PointF, PointF> c;
    public final nf2 d;
    public final boolean e;

    public nif0(String str, fg2 fg2Var, uf2 uf2Var, nf2 nf2Var, boolean z) {
        this.a = str;
        this.b = fg2Var;
        this.c = uf2Var;
        this.d = nf2Var;
        this.e = z;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new mif0(k800Var, aVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
