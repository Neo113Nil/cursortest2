package xsna;

import xsna.u0;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l2(int i, String str) {
        this.b = 3;
        this.c = i;
        this.d = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.d).invoke(new u0.e(this.c));
                return s3q0.a;
            case 1:
                return Boolean.valueOf(x3c.e((xvy) this.d, this.c));
            case 2:
                return "state: " + ((zrz.a) this.d) + " start load of " + this.c + " items from network";
            default:
                return com.vk.movika.sdk.base.model.history.b.b(this.c, "Msg INSERT/REPLACE to bd. sizeOf = ", " msg=", (String) this.d);
        }
    }

    public /* synthetic */ l2(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
