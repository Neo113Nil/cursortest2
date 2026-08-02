package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class dr41 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;

    public /* synthetic */ dr41(lzr lzrVar, String str, long j) {
        this.a = 2;
        this.b = lzrVar;
        this.w = str;
        this.c = j;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.w;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                x9o x9oVar = (x9o) obj5;
                lyy lyyVar = (lyy) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    wqy0.b(x9oVar.c, null, this.c, uh6.E(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new ety0(0L, 0L, null, null, lyyVar, null, 0L, 0, 0L, null, null, 16777183), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 65522);
                    break;
                }
            case 1:
                x9o x9oVar2 = (x9o) obj5;
                lyy lyyVar2 = (lyy) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    wqy0.b(x9oVar2.d, null, this.c, uh6.E(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new ety0(0L, 0L, null, null, lyyVar2, null, 0L, 0, 0L, null, null, 16777183), btsVar2, 3456, 0, 65522);
                    break;
                }
            default:
                lzr lzrVar = (lzr) obj5;
                String str = (String) obj4;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    f530 l = an91.l(c530.a, 14.0f, 9.0f);
                    if (lzrVar == null) {
                        lzrVar = lzr.E;
                    }
                    ymb1.f(str, l, this.c, null, lzrVar, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar3, 48, 0, 65512);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ dr41(x9o x9oVar, long j, lyy lyyVar, int i) {
        this.a = i;
        this.b = x9oVar;
        this.c = j;
        this.w = lyyVar;
    }
}
