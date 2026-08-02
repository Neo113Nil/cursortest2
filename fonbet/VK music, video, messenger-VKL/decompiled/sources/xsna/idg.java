package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class idg implements izs {
    public final /* synthetic */ mdg b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ idg(mdg mdgVar, boolean z, boolean z2) {
        this.b = mdgVar;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        mdg mdgVar = this.b;
        int a6 = mdgVar.a6();
        boolean z = this.c;
        if (a6 == 1) {
            mdgVar.V7(z, this.d);
        } else {
            mdgVar.S7(th, z);
        }
        return s3q0.a;
    }
}
