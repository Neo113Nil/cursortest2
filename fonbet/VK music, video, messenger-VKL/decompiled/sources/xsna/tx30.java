package xsna;

import com.vk.im.engine.models.SearchMode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class tx30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tx30(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ux30 ux30Var = (ux30) this.d;
                ux30Var.c.U(ux30Var.b.get(this.c).g, SearchMode.MESSAGES);
                break;
            default:
                ((izs) this.d).invoke(Integer.valueOf(this.c));
                break;
        }
        return s3q0.a;
    }
}
