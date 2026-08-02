package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes14.dex */
public final /* synthetic */ class jhk0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ jhk0(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    CharSequence charSequence = (CharSequence) oz40Var.getValue();
                    if (charSequence != null) {
                        btsVar.e0(1552600844);
                        qgy.b(charSequence, null, null, AppColor$Palette.Text, uh6.E(14), 0L, null, 0L, 2, 2, 0, xya1.e(btsVar).g.b, null, btsVar, 805334064, 6, 10724);
                        btsVar.t(false);
                        break;
                    } else {
                        btsVar.e0(1552600843);
                        btsVar.t(false);
                        break;
                    }
                }
            case 1:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    Object Q = btsVar2.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar2.o0(Q);
                    }
                    ijb1.b(((Boolean) oz40Var.getValue()).booleanValue(), an91.o(fnq0.a(c530.a, (tls) Q), 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, null, null, true, btsVar2, 0, 28);
                    break;
                }
            case 2:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    btsVar3.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, "Simulation state", null, null, null, 0, 0, ((Boolean) oz40Var.getValue()).booleanValue() ? "Disable to pause" : "Enable to resume", null, null, 0, 0, null, btsVar3, (intValue3 & 14) | 48, 0, 8126);
                    break;
                }
            default:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    btsVar4.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var2, "Simulation state", null, null, null, 0, 0, ((Boolean) oz40Var.getValue()).booleanValue() ? "Disable to pause" : "Enable to resume", null, null, 0, 0, null, btsVar4, (intValue4 & 14) | 48, 0, 8126);
                    break;
                }
        }
        return zy11Var;
    }
}
