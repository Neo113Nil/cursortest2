package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes13.dex */
public final /* synthetic */ class aq5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx40 b;

    public /* synthetic */ aq5(tx40 tx40Var, int i) {
        this.a = i;
        this.b = tx40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tx40 tx40Var = this.b;
        switch (i) {
            case 0:
                tx40Var.setFloatValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return zy11Var;
            case 1:
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.D(tx40Var.getFloatValue() * (-Float.intBitsToFloat((int) (m2k0Var.J >> 32))));
                m2k0Var.b(1.0f - tx40Var.getFloatValue());
                return zy11Var;
            case 2:
                m2k0 m2k0Var2 = (m2k0) obj;
                m2k0Var2.G(tx40Var.getFloatValue() * (Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & m2k0Var2.J)) / 2.0f));
                m2k0Var2.b(1.0f - tx40Var.getFloatValue());
                return zy11Var;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                j9d j9dVar = j9d.a;
                tx40Var.setFloatValue(floatValue);
                return zy11Var;
            case 4:
                tx40Var.setFloatValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return zy11Var;
            case 5:
                tx40Var.setFloatValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return zy11Var;
            case 6:
                tx40Var.setFloatValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return zy11Var;
            case 7:
                tx40Var.setFloatValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return zy11Var;
            case 8:
                tx40Var.setFloatValue((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return zy11Var;
            default:
                float floatValue2 = tx40Var.getFloatValue() / 2.0f;
                if (floatValue2 < 0.0f) {
                    floatValue2 = 0.0f;
                }
                return new z5w(((int) floatValue2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
    }
}
