package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i3e0 implements izs {
    public final /* synthetic */ float b;
    public final /* synthetic */ bwf c;
    public final /* synthetic */ int d;

    public /* synthetic */ i3e0(float f, bwf bwfVar, int i) {
        this.b = f;
        this.c = bwfVar;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Float valueOf = Float.valueOf(this.b);
        bwf bwfVar = this.c;
        qgi0.m((tgi0) obj, new t1e0(((Number) swe0.k(valueOf, bwfVar)).floatValue(), bwfVar, this.d));
        return s3q0.a;
    }
}
