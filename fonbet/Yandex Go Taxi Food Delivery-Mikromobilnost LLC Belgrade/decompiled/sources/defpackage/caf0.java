package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class caf0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;

    public /* synthetic */ caf0(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Integer num = this.b;
        switch (i) {
            case 0:
                return new pbv((String) obj, (ccv) null, rev.k, (dcv) null, num != null ? new ufv(num.intValue()) : null, 42);
            default:
                return Boolean.valueOf(num != null && ((t6y) ((n6y) obj)).a == num.intValue());
        }
    }
}
