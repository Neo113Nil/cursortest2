package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ak30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ak30(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return yj30.a((yj30) obj, this.c);
            default:
                boolean z = ((qba0) obj).d;
                boolean z2 = this.c;
                return Boolean.valueOf(!(z2 || z) || (z2 && z));
        }
    }
}
