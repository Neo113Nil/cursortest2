package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class c0d implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ c0d(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f(this.c, ((e0d) obj).a));
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c);
                qgi0.n(tgi0Var, 5);
                return s3q0.a;
        }
    }
}
