package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class lga implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ f530 c;

    public /* synthetic */ lga(f530 f530Var, List list, int i) {
        this.a = 3;
        this.c = f530Var;
        this.b = list;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        List list = this.b;
        f530 f530Var = this.c;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                w691.a(vng.O(49), fidVar, f530Var, list);
                break;
            case 1:
                w691.a(vng.O(49), fidVar, f530Var, list);
                break;
            case 2:
                msa1.g(vng.O(1), fidVar, f530Var, list);
                break;
            default:
                ngb1.c(vng.O(1), fidVar, f530Var, list);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ lga(List list, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = f530Var;
    }
}
