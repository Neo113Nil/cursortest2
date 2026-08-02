package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class n0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ n0(oz40 oz40Var, float f) {
        this.a = 0;
        this.c = oz40Var;
        this.b = f;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                oz40Var.setValue(new y7m(((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & ((k6w) obj).a)) / f));
                break;
            case 1:
                cjs0 cjs0Var = (cjs0) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (cjs0Var.a >> 32)) * f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (cjs0Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * f;
                if (Float.intBitsToFloat((int) (((cjs0) oz40Var.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((cjs0) oz40Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) != intBitsToFloat2) {
                    oz40Var.setValue(new cjs0((Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                    break;
                }
                break;
            default:
                oz40Var.setValue(new y7m(((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & ((k6w) obj).a)) / f));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ n0(float f, oz40 oz40Var, int i) {
        this.a = i;
        this.b = f;
        this.c = oz40Var;
    }
}
