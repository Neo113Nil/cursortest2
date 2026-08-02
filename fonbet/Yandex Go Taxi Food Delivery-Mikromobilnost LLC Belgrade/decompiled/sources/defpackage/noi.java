package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class noi implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ noi(yx40 yx40Var, int i) {
        this.b = i;
        this.c = yx40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                yx40 yx40Var = (yx40) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    az91.c(btsVar, 0);
                    if (i2 < yx40Var.getIntValue() - 1) {
                        btsVar.e0(-65610886);
                        dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530.a, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-65356221);
                        btsVar.t(false);
                    }
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                afl0 afl0Var = (afl0) obj4;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                    long n = tje.n(appColor$Palette, btsVar2);
                    hk2 hk2Var = new hk2(0);
                    String str = afl0Var.b;
                    String str2 = afl0Var.e;
                    hk2Var.d(str);
                    if (str2 != null && i2 == afl0Var.f) {
                        int h = hk2Var.h(new bmt0(n, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534));
                        try {
                            hk2Var.d(str2);
                        } finally {
                            hk2Var.g(h);
                        }
                    }
                    kk2 i3 = hk2Var.i();
                    int i4 = (intValue2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT;
                    p9b1.d(ebp0Var, i3, null, c530.a, tp2.a, xya1.e(btsVar2).g.a, 5, Integer.MAX_VALUE, "", appColor$Palette, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, btsVar2, (i4 & 14) | 1572864, 2);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ noi(afl0 afl0Var, int i) {
        this.c = afl0Var;
        this.b = i;
    }
}
