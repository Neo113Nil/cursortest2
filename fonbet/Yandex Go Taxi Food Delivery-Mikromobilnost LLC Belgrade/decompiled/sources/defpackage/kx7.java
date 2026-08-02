package defpackage;

import java.util.List;

/* loaded from: classes12.dex */
public final /* synthetic */ class kx7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;

    public /* synthetic */ kx7(String str, List list) {
        this.a = 2;
        this.c = str;
        this.b = list;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        List list = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                ((ip70) obj).n1(str, list, null, null);
                break;
            case 1:
                ((lx7) obj).a.r(new kx7(list, str, 0));
                break;
            default:
                xus xusVar = ((wus) obj).a;
                xusVar.D((m950) ((rx4) xusVar.F).get(), new ius(str, list), new dl1(18, xusVar));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ kx7(List list, String str, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
    }
}
