package defpackage;

import com.yandex.go.navigator.main_screen.h;

/* loaded from: classes11.dex */
public final /* synthetic */ class l700 implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l700(float f, float f2, CharSequence charSequence, CharSequence charSequence2, f360 f360Var, i360 i360Var) {
        this.b = f;
        this.c = f2;
        this.w = charSequence;
        this.x = charSequence2;
        this.y = f360Var;
        this.z = i360Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        float f = this.b;
        switch (i) {
            case 0:
                wg6 wg6Var = (wg6) obj7;
                oz40 oz40Var = wg6Var.g;
                x700 x700Var = (x700) obj6;
                tls tlsVar = (tls) obj5;
                h hVar = (h) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else if (((dtr0) oz40Var.getValue()).a != -1) {
                    btsVar.e0(-1320549249);
                    vhb1.a(x700Var, this.c, tlsVar, hVar, rfb1.g(wg6Var) || ((dtr0) oz40Var.getValue()).a == -2, f <= 0.77f, btsVar, 8);
                    btsVar.t(false);
                    break;
                } else {
                    btsVar.e0(-1320162617);
                    btsVar.t(false);
                    break;
                }
                break;
            default:
                CharSequence charSequence = (CharSequence) obj7;
                CharSequence charSequence2 = (CharSequence) obj6;
                f360 f360Var = (f360) obj5;
                i360 i360Var = (i360) obj4;
                dj6 dj6Var = (dj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    float d = dj6Var.d();
                    float d2 = cjb1.d(1.0f, 0.0f, f);
                    float d3 = cjb1.d(0.0f, 8.0f, f);
                    float d4 = cjb1.d(0.0f, 2.0f, f);
                    float d5 = cjb1.d(16.0f, 6.0f, f);
                    float d6 = cjb1.d(0.0f, 6.0f, f < 1.0f ? f : 0.0f);
                    float d7 = cjb1.d(d, 56.0f, f);
                    if (f >= 1.0f) {
                        f = 1.0f - this.c;
                    }
                    float d8 = cjb1.d(0.0f, -8.0f, f);
                    byk0 c = cyk0.c(d5);
                    c530 c530Var = c530.a;
                    zgb1.b(charSequence, charSequence2, an91.o(c530Var, 56.0f, 0.0f, 8.0f, 0.0f, 10), x4c.G, 8388611, false, null, null, null, null, btsVar2, 28032, 992);
                    if (f360Var == null) {
                        btsVar2.e0(-2061047342);
                        z = false;
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-2061047341);
                        s3b1.f(f360Var.a, rx21.d(an91.k(aab1.a(d4, ldc.f, ymb1.l(ibb1.c(ira1.i(an91.k(ljs0.m(c530Var, d7), d3), d8), d6, c, 0L, 0L, 28), c), c), d4), f360Var.d, f360Var.e), mhe.g, btsVar2, 384, 0);
                        z = false;
                        btsVar2.t(false);
                    }
                    f360 f360Var2 = i360Var != null ? i360Var.a : null;
                    cj6 cj6Var = cj6.a;
                    if (f360Var2 == null) {
                        btsVar2.e0(-2060347114);
                        btsVar2.t(z);
                    } else {
                        btsVar2.e0(-2060347113);
                        s3b1.f(f360Var2.a, rx21.d(tra1.b(an91.o(cj6Var.a(c530Var, x4c.c), 0.0f, 12.0f, 0.0f, 0.0f, 13), d2), f360Var2.d, f360Var2.e), null, btsVar2, 0, 4);
                        z = false;
                        btsVar2.t(false);
                    }
                    CharSequence charSequence3 = i360Var != null ? i360Var.b : null;
                    if (charSequence3 != null) {
                        btsVar2.e0(-2059996038);
                        zgb1.a(charSequence3, tra1.b(an91.m(cj6Var.a(c530Var, x4c.y), 8.0f, 0.0f, 2), d2), 0, false, null, null, false, null, btsVar2, 0, 252);
                        btsVar2.t(false);
                        break;
                    } else {
                        btsVar2.e0(-2059996039);
                        btsVar2.t(z);
                        break;
                    }
                }
        }
        return zy11Var;
    }

    public /* synthetic */ l700(wg6 wg6Var, float f, x700 x700Var, float f2, tls tlsVar, h hVar) {
        this.w = wg6Var;
        this.b = f;
        this.x = x700Var;
        this.c = f2;
        this.y = tlsVar;
        this.z = hVar;
    }
}
