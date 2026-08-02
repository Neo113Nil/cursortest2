package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public final /* synthetic */ class paz implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hyp0 b;

    public /* synthetic */ paz(hyp0 hyp0Var, int i) {
        this.a = i;
        this.b = hyp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hyp0 hyp0Var = this.b;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    jeb1.f(hyp0Var.a, ljs0.c(c530.a, 1.0f), AppColor$Palette.Text, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 432, 0, 16248);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    ydb1.a(null, null, wwg.S(-256471795, true, new paz(hyp0Var, objArr == true ? 1 : 0), btsVar2), null, null, null, null, false, btsVar2, 384, 251);
                    break;
                }
        }
        return zy11Var;
    }
}
