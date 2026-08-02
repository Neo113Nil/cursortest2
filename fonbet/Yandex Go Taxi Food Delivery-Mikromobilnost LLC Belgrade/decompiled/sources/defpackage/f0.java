package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes14.dex */
public final /* synthetic */ class f0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qor b;

    public /* synthetic */ f0(qor qorVar, int i) {
        this.a = i;
        this.b = qorVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qor qorVar = this.b;
        m2k0 m2k0Var = (m2k0) obj;
        switch (i) {
            case 0:
                m2k0Var.b(1.0f - qorVar.getValue().floatValue());
                break;
            case 1:
                m2k0Var.b(qorVar.getFloatValue());
                break;
            case 2:
                m2k0Var.b(qorVar.getFloatValue());
                break;
            case 3:
                m2k0Var.b(qorVar.getFloatValue());
                break;
            case 4:
                m2k0Var.G(-(m2k0Var.K.getDensity() * cjb1.d(0.0f, 14.0f, qorVar.getFloatValue())));
                break;
            case 5:
                m2k0Var.G(-(m2k0Var.K.getDensity() * cjb1.d(0.0f, 14.0f, qorVar.getFloatValue())));
                break;
            case 6:
                m2k0Var.b(qorVar.getFloatValue());
                break;
            case 7:
                m2k0Var.b(qorVar.getFloatValue());
                m2k0Var.G((1.0f - qorVar.getFloatValue()) * Float.intBitsToFloat((int) (m2k0Var.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 8:
                m2k0Var.b(qorVar.getFloatValue());
                break;
            default:
                m2k0Var.b(qorVar.getFloatValue());
                break;
        }
        return zy11Var;
    }
}
