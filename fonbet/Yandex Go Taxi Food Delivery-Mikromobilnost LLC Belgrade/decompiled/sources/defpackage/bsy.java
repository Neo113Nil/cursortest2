package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class bsy implements wls {
    public final /* synthetic */ hzr A;
    public final /* synthetic */ int B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ tls E;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ sty0 c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ long x;
    public final /* synthetic */ eyr y;
    public final /* synthetic */ lzr z;

    public /* synthetic */ bsy(String str, sty0 sty0Var, boolean z, long j, eyr eyrVar, lzr lzrVar, hzr hzrVar, int i, boolean z2, int i2, tls tlsVar) {
        this.a = 1;
        this.b = str;
        this.c = sty0Var;
        this.w = z;
        this.x = j;
        this.y = eyrVar;
        this.z = lzrVar;
        this.A = hzrVar;
        this.B = i;
        this.C = z2;
        this.D = i2;
        this.E = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ety0 ety0Var;
        ety0 ety0Var2;
        int i = this.a;
        sty0 sty0Var = this.c;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    btsVar.e0(-725760132);
                    long j = sty0Var != null ? sty0Var.a : sty0.c;
                    if (this.C) {
                        btsVar.e0(-725215276);
                        ety0Var = web1.h(((zm51) btsVar.m(an51.a)).f);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-725090191);
                        ety0Var = ((zm51) btsVar.m(an51.a)).f;
                        btsVar.t(false);
                    }
                    ymb1.e(this.b, null, this.x, this.y, this.z, this.A, j, 0L, 0L, null, this.B, this.w, this.D, this.E, ety0Var, btsVar, 0, 0, 1922);
                    btsVar.t(false);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    long j2 = sty0Var != null ? sty0Var.a : sty0.c;
                    if (this.w) {
                        btsVar2.e0(130642543);
                        ety0Var2 = web1.h(((zm51) btsVar2.m(an51.a)).g);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(130762668);
                        ety0Var2 = ((zm51) btsVar2.m(an51.a)).g;
                        btsVar2.t(false);
                    }
                    ymb1.f(this.b, null, this.x, this.y, this.z, this.A, j2, 0L, 0L, null, this.B, this.C, this.D, this.E, ety0Var2, btsVar2, 0, 0, 1922);
                    break;
                }
            default:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    String str = this.b;
                    if (str != null) {
                        btsVar3.e0(-1868424802);
                        rcb1.c(null, false, 0, null, wwg.S(-2020998891, true, new bsy(str, this.x, this.y, this.z, this.B, this.w, this.D, this.E, this.c, this.C, this.A, 0), btsVar3), btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 13);
                        btsVar3.t(false);
                        break;
                    } else {
                        btsVar3.e0(-1868424803);
                        btsVar3.t(false);
                        break;
                    }
                }
        }
        return zy11Var;
    }

    public /* synthetic */ bsy(String str, long j, eyr eyrVar, lzr lzrVar, int i, boolean z, int i2, tls tlsVar, sty0 sty0Var, boolean z2, hzr hzrVar, int i3) {
        this.a = i3;
        this.b = str;
        this.x = j;
        this.y = eyrVar;
        this.z = lzrVar;
        this.B = i;
        this.w = z;
        this.D = i2;
        this.E = tlsVar;
        this.c = sty0Var;
        this.C = z2;
        this.A = hzrVar;
    }
}
