package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes13.dex */
public final /* synthetic */ class phi0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ shi0 b;

    public /* synthetic */ phi0(shi0 shi0Var, int i) {
        this.a = i;
        this.b = shi0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        shi0 shi0Var = this.b;
        switch (i) {
            case 0:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, shi0Var.g, c530.a, AppColor$Palette.TextMinor, xya1.e(btsVar).h.a, 2, Integer.MAX_VALUE, shi0Var.f, tp2.a, xya1.e(btsVar).g.a, 2, Integer.MAX_VALUE, null, btsVar, intValue & 14, 0, 0);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    jeb1.f(shi0Var.b, an91.m(c530Var, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, null, btsVar2, 805306416, 48, 30204);
                    break;
                }
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    jeb1.f(shi0Var.c, an91.m(c530Var, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar3).g.b, btsVar3, 805306416, 48, 13820);
                    break;
                }
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    btsVar4.Y();
                    break;
                } else {
                    jeb1.f(shi0Var.h, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar4).h.a, btsVar4, 48, 0, 16380);
                    break;
                }
        }
        return zy11Var;
    }
}
