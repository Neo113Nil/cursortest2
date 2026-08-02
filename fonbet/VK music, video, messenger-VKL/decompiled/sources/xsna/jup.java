package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jup implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ jup(boolean z, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.c = z;
        this.e = xzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                pup.f(this.c, (yzs) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                izs izsVar = (izs) this.e;
                ((Integer) obj2).intValue();
                pun0.b(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, this.c);
                break;
        }
        return s3q0.a;
    }
}
