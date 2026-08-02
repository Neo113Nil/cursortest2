package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class j7a0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4v b;

    public /* synthetic */ j7a0(v4v v4vVar, int i) {
        this.a = i;
        this.b = v4vVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    s3b1.f(this.b, null, null, btsVar, 0, 6);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    v4v v4vVar = this.b;
                    if (v4vVar == null) {
                        btsVar2.e0(-379568664);
                        btsVar2.t(false);
                        break;
                    } else {
                        btsVar2.e0(-379684945);
                        s3b1.f(v4vVar, ljs0.m(c530Var, 24.0f), null, btsVar2, 48, 4);
                        btsVar2.t(false);
                        break;
                    }
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    v4v v4vVar2 = this.b;
                    if (v4vVar2 == null) {
                        btsVar3.e0(-887831466);
                        btsVar3.t(false);
                        break;
                    } else {
                        btsVar3.e0(-887947747);
                        s3b1.f(v4vVar2, ljs0.m(c530Var, 24.0f), null, btsVar3, 48, 4);
                        btsVar3.t(false);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
