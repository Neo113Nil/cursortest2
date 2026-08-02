package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes14.dex */
public final /* synthetic */ class of6 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;

    public /* synthetic */ of6(wg6 wg6Var, int i) {
        this.a = i;
        this.b = wg6Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wg6 wg6Var = this.b;
        switch (i) {
            case 0:
                ((m2k0) obj).b(1.0f - rfb1.d(wg6Var));
                break;
            case 1:
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.G(Float.intBitsToFloat((int) (m2k0Var.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Math.min(wg6Var.h.getFloatValue() + wg6Var.B.getIntValue(), Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & m2k0Var.J))));
                break;
            case 2:
                ((m2k0) obj).G(wg6Var.h.getFloatValue());
                break;
            case 3:
                ((m2k0) obj).G(wg6Var.h.getFloatValue());
                break;
            case 4:
                float floatValue = ((Float) obj).floatValue();
                tx40 tx40Var = wg6Var.h;
                tx40Var.setFloatValue(wg6Var.a(tx40Var.getFloatValue() + floatValue));
                break;
            case 5:
                wg6Var.D = (rzx) obj;
                break;
            case 6:
                ((m2k0) obj).G(Math.max(wg6Var.h.getFloatValue() - wg6Var.u[1], 0.0f));
                break;
            case 7:
                wg6Var.d(true);
                break;
            case 8:
                ((m2k0) obj).G(wg6Var.h.getFloatValue());
                break;
            default:
                ((m2k0) obj).G(wg6Var.h.getFloatValue());
                break;
        }
        return zy11Var;
    }
}
