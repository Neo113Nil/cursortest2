package xsna;

import com.vkontakte.android.data.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c6m0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c6m0(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                nf9 nf9Var = nf9.b;
                nf9.n((b.d) obj, Integer.valueOf(i2));
                return s3q0.a;
            default:
                return Integer.valueOf((((Integer) obj).intValue() / 2) * i2);
        }
    }
}
