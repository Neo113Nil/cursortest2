package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tac implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;

    public /* synthetic */ tac(int i, int i2, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.c = izsVar;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fbc.j(ne7.I(this.e | 1), aVar, this.c, this.d);
                break;
            default:
                uzj.a(ne7.I(this.e | 1), aVar, this.c, this.d);
                break;
        }
        return s3q0.a;
    }
}
