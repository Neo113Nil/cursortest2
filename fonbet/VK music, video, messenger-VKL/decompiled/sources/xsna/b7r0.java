package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class b7r0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ b7r0(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                bpn0 bpn0Var = c7r0.a;
                if (str2 == null) {
                    str2 = "";
                }
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new p68(3, str2, str)).r0(asu0.a.c());
            default:
                ((Integer) obj).intValue();
                return str;
        }
    }
}
