package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class nyc implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qyc b;

    public /* synthetic */ nyc(qyc qycVar, int i) {
        this.a = i;
        this.b = qycVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qyc qycVar = this.b;
        switch (i) {
            case 0:
                qycVar.d.a();
                qycVar.f.c(qycVar.a, "web_view");
                break;
            case 1:
                qycVar.c.x("PhoneChallengeCard.Failed", null);
                qycVar.f.c(qycVar.a, "safe_flow_failed");
                qycVar.d.a();
                break;
            default:
                qycVar.c.x("PhoneChallengeCard.Closed", null);
                qycVar.h.b();
                break;
        }
        return zy11Var;
    }
}
