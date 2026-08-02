package defpackage;

import com.yandex.go.payments.shared.family.web.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class eap implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ eap(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((ag41) cVar.Q()).c(cu41.c);
                break;
            case 3:
                ((ag41) cVar.Q()).b(false);
                ((ag41) cVar.Q()).c(cu41.b);
                break;
            case 4:
                ((ag41) cVar.Q()).b(true);
                ((ag41) cVar.Q()).c(cu41.c);
                break;
            default:
                ((ag41) cVar.Q()).c(cu41.d);
                xby.l(jst.e, "FamilyWebView", null, null, "FamilyWebView retry auth error", 6);
                break;
        }
        return zy11Var;
    }
}
