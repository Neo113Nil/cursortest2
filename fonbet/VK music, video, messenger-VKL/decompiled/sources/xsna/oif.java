package xsna;

import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class oif implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oif(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.d).invoke(new yaf.b.e(this.c));
                break;
            default:
                mc90.u((yjl) this.d, this.c);
                break;
        }
        return s3q0.a;
    }
}
