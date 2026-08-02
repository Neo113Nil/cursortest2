package defpackage;

import java.util.List;

/* loaded from: classes12.dex */
public final /* synthetic */ class jto implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ kto b;
    public final /* synthetic */ List c;

    public /* synthetic */ jto(kto ktoVar, List list, int i) {
        this.a = i;
        this.b = ktoVar;
        this.c = list;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        List list = this.c;
        kto ktoVar = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                ktoVar.c.c(oll0Var, list);
                break;
            default:
                ktoVar.b.c(oll0Var, list);
                break;
        }
        return zy11Var;
    }
}
