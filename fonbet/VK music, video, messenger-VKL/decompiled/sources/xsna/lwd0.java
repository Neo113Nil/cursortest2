package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lwd0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lwd0(gzs gzsVar, cwd0 cwd0Var, boolean z, int i) {
        this.e = gzsVar;
        this.f = cwd0Var;
        this.c = z;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                mwd0.b((gzs) this.e, (cwd0) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.d | 1);
                kml0.b(this.c, (uvw) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lwd0(boolean z, uvw uvwVar, izs izsVar, int i) {
        this.c = z;
        this.e = uvwVar;
        this.f = izsVar;
        this.d = i;
    }
}
