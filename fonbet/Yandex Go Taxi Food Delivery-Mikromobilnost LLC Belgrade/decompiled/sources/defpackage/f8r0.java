package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class f8r0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8r0 b;

    public /* synthetic */ f8r0(u8r0 u8r0Var, int i) {
        this.a = i;
        this.b = u8r0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        u8r0 u8r0Var = this.b;
        switch (i) {
            case 0:
                boolean z = false;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, z)) {
                    btsVar.Y();
                    break;
                } else {
                    udb1.c(ibp0Var, u8r0Var.c, null, null, btsVar, intValue & 14, 14);
                    break;
                }
            case 1:
                boolean z2 = false;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, z2)) {
                    btsVar2.Y();
                    break;
                } else {
                    p9b1.c(ebp0Var, u8r0Var.b, an91.m(c530Var, 0.0f, 8.0f, 1), null, null, 0, 0, u8r0Var.e, null, null, 0, 0, null, btsVar2, (intValue2 & 14) | 384, 0, 8124);
                    break;
                }
            case 2:
                boolean z3 = false;
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ibp0Var2) ? 4 : 2;
                }
                if ((intValue3 & 19) != 18) {
                    z3 = true;
                }
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, z3)) {
                    btsVar3.Y();
                    break;
                } else {
                    udb1.c(ibp0Var2, u8r0Var.c, null, null, btsVar3, intValue3 & 14, 14);
                    break;
                }
            case 3:
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
                    p9b1.c(ebp0Var2, u8r0Var.b, an91.m(c530Var, 0.0f, 8.0f, 1), null, null, 0, 0, u8r0Var.e, null, null, 0, 0, null, btsVar4, (intValue4 & 14) | 384, 0, 8124);
                    break;
                }
            default:
                ibp0 ibp0Var3 = (ibp0) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(ibp0Var3) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    btsVar5.Y();
                    break;
                } else {
                    Object Q = btsVar5.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar5.o0(Q);
                    }
                    ijb1.b(u8r0Var.d, an91.o(fnq0.a(c530Var, (tls) Q), 8.0f, 0.0f, ibp0Var3.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, null, null, true, btsVar5, 0, 28);
                    break;
                }
        }
        return zy11Var;
    }
}
