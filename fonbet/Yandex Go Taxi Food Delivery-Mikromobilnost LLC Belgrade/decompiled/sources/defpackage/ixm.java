package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class ixm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jvm b;

    public /* synthetic */ ixm(jvm jvmVar, int i) {
        this.a = 2;
        this.b = jvmVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jvm jvmVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    s3b1.f(jvmVar.a, null, null, btsVar, 0, 6);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    web1.e(null, null, null, jvmVar.b, null, 0L, null, null, null, 0, false, 0, null, jvmVar.c, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar2, 0, 0, 0, 268402679);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                oy91.c(jvmVar, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ixm(jvm jvmVar, int i, byte b) {
        this.a = i;
        this.b = jvmVar;
    }
}
