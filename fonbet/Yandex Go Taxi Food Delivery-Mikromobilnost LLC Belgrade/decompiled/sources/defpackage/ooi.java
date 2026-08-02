package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class ooi implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwi b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ ooi(fwi fwiVar, oz40 oz40Var, int i) {
        this.a = i;
        this.b = fwiVar;
        this.c = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 10;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.c;
        fwi fwiVar = this.b;
        switch (i) {
            case 0:
                oz40Var.setValue(new y7m(fwiVar.H((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 1:
                oz40Var.setValue(new y7m(fwiVar.H((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 2:
                oz40Var.setValue(new y7m(fwiVar.H(((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + 10)));
                break;
            case 3:
                oz40Var.setValue(new y7m(fwiVar.H((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 4:
                oz40Var.setValue(new y7m(fwiVar.H((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 5:
                oz40Var.setValue(new y7m(fwiVar.H((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - 2.0f));
                break;
            case 6:
                break;
            case 7:
                oz40Var.setValue(new k6w((fwiVar.f0(c8m.a(r10.a)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (fwiVar.f0(c8m.b(((c8m) obj).a)) << 32)));
                break;
            case 8:
                oz40Var.setValue(new y7m(fwiVar.H((int) (((rzx) obj).e() >> 32))));
                break;
            case 9:
                break;
            case 10:
                oz40Var.setValue(new k6w((fwiVar.f0(c8m.a(r10.a)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (fwiVar.f0(c8m.b(((c8m) obj).a)) << 32)));
                break;
            default:
                oz40Var.setValue(new y7m(fwiVar.H((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
        }
        return zy11Var;
    }
}
