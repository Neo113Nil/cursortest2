package defpackage;

import com.yandex.go.payments.shared.family.web.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class fap implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    public /* synthetic */ fap(c cVar, String str, int i) {
        this.a = i;
        this.b = cVar;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.R(str);
                break;
            default:
                ((ag41) cVar.Q()).c(cu41.c);
                ((ag41) cVar.Q()).a(c.P(cVar, str));
                break;
        }
        return zy11Var;
    }
}
