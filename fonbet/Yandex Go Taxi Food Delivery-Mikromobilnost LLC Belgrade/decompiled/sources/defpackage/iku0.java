package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final /* synthetic */ class iku0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ kku0 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ iku0(kku0 kku0Var, ArrayList arrayList, int i) {
        this.a = i;
        this.b = kku0Var;
        this.c = arrayList;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ArrayList arrayList = this.c;
        kku0 kku0Var = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                kku0.n(kku0Var, arrayList);
                break;
            default:
                kku0Var.b.c(oll0Var, arrayList);
                break;
        }
        return zy11Var;
    }
}
