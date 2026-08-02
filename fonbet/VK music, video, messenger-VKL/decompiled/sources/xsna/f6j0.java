package xsna;

/* compiled from: ShapePath.java */
/* loaded from: classes12.dex */
public final class f6j0 implements eij {
    public final String a;
    public final int b;
    public final wf2 c;
    public final boolean d;

    public f6j0(String str, int i, wf2 wf2Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = wf2Var;
        this.d = z;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new u5j0(k800Var, aVar, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return vu5.b(sb, this.b, '}');
    }
}
