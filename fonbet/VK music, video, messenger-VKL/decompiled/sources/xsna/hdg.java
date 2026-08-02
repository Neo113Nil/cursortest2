package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hdg implements izs {
    public final /* synthetic */ mdg b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ hdg(mdg mdgVar, boolean z, boolean z2) {
        this.b = mdgVar;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        vqt vqtVar = (vqt) obj;
        int i = vqtVar.k;
        mdg mdgVar = this.b;
        boolean z = this.c;
        if (i == 0) {
            mdgVar.T7(vqtVar, z);
        } else {
            mdgVar.W7(vqtVar, z, this.d);
        }
        return s3q0.a;
    }
}
