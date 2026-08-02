package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y620 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y620(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                boolean z = this.c;
                if (k720.O != z) {
                    k720.O = z;
                    k720.K.onNext(Boolean.valueOf(z));
                }
                break;
            default:
                ysg0.b.a(new xj70(this.c));
                break;
        }
        return s3q0.a;
    }
}
