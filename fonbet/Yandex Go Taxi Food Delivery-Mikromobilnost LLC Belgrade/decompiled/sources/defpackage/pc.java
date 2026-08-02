package defpackage;

import com.yandex.go.agreement.router.d;

/* loaded from: classes12.dex */
public final /* synthetic */ class pc implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ pc(bd bdVar, int i) {
        this.a = i;
        this.b = bdVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        bd bdVar = this.b;
        switch (i) {
            case 0:
                d.P(((bl1) obj).a, bdVar.j);
                break;
            case 1:
                d.P(((bl1) obj).a, bdVar.j);
                break;
            default:
                d.P(((cl1) obj).a, bdVar.j);
                break;
        }
        return zy11Var;
    }
}
