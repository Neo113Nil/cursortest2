package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class efg implements izs {
    public final /* synthetic */ lfg b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ efg(lfg lfgVar, boolean z, boolean z2) {
        this.b = lfgVar;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        vqt vqtVar = (vqt) obj;
        int i = vqtVar.k;
        lfg lfgVar = this.b;
        boolean z = this.c;
        if (i == 0) {
            lfgVar.M8(vqtVar, z);
        } else {
            lfgVar.J8(vqtVar, z, this.d);
        }
        return s3q0.a;
    }
}
