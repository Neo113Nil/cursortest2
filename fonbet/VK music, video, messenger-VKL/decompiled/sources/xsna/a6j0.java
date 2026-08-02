package xsna;

import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes12.dex */
public final class a6j0 implements eij {
    public final String a;
    public final List<eij> b;
    public final boolean c;

    public a6j0(String str, List<eij> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new igj(k800Var, aVar, this, i700Var);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
