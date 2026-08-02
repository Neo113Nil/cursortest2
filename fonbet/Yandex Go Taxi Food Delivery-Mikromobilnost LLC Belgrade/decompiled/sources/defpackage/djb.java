package defpackage;

import android.content.Context;

/* loaded from: classes12.dex */
public final /* synthetic */ class djb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ w030 c;

    public /* synthetic */ djb(Object obj, Context context, w030 w030Var, int i) {
        this.a = i;
        this.b = context;
        this.c = w030Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        w030 w030Var = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                wyd wydVar = new wyd(0);
                ie ieVar = new ie(wydVar, new czd());
                return new uv6(this.b, this.c, wydVar, new syd(), ieVar);
            case 1:
                hd01 hd01Var = new hd01(0);
                ie ieVar2 = new ie(hd01Var, new jd01());
                return new uv6(this.b, this.c, hd01Var, new jhu0(hd01Var), ieVar2);
            case 2:
                xv6 xv6Var = new xv6(0);
                ie ieVar3 = new ie(xv6Var, new zv6());
                return new uv6(this.b, this.c, xv6Var, new sv6(), ieVar3);
            case 3:
                return new t(context, w030Var, 4);
            default:
                return new n12(context, w030Var, new y840(), new w840());
        }
    }
}
