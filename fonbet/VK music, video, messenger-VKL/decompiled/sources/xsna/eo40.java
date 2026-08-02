package xsna;

/* compiled from: MusicMixColorPalette.kt */
/* loaded from: classes3.dex */
public final class eo40 {
    public final Object a;
    public final Object b;
    public final Cloneable c;

    public eo40(w6d w6dVar, i3i0 i3i0Var) {
        this.a = w6dVar;
        this.b = i3i0Var;
        biq biqVar = new biq();
        biqVar.addTarget(w6dVar.n.b);
        biqVar.addTarget(w6dVar.o);
        biqVar.addTarget(w6dVar.q);
        biqVar.addTarget(w6dVar.r);
        biqVar.addTarget(w6dVar.t);
        this.c = biqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eo40(float[] fArr, float[] fArr2, float[] fArr3) {
        this.a = fArr;
        this.b = fArr2;
        this.c = fArr3;
    }

    public eo40(String str, String str2, String str3) {
        this(ao8.f(str), ao8.f(str2), ao8.f(str3));
    }
}
