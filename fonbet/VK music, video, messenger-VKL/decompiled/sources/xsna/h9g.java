package xsna;

import xsna.dr20;
import xsna.mkq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h9g implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h9g(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((i9g) this.d).a((lgu0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((hdh) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((rkq) this.d).h((mkq.b) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((dr20.b) this.d).e((yzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((wb50) this.d).b((va8) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((jhk0) this.d).d((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h9g(i9g i9gVar, lgu0 lgu0Var, int i) {
        this.b = 0;
        this.d = i9gVar;
        this.e = lgu0Var;
        this.c = i;
    }
}
