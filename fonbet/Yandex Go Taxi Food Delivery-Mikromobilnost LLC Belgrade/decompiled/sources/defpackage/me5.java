package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final /* synthetic */ class me5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ oz40 w;

    public /* synthetic */ me5(oz40 oz40Var, oz40 oz40Var2, tls tlsVar) {
        this.a = 3;
        this.c = oz40Var;
        this.w = oz40Var2;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.w;
        oz40 oz40Var2 = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                hoy0 hoy0Var = (hoy0) obj;
                oz40Var2.setValue(hoy0Var);
                boolean l = jl40.l((String) oz40Var.getValue(), hoy0Var.a.b);
                kk2 kk2Var = hoy0Var.a;
                oz40Var.setValue(kk2Var.b);
                if (!l) {
                    tlsVar.invoke(kk2Var.b);
                    break;
                }
                break;
            case 1:
                hoy0 hoy0Var2 = (hoy0) obj;
                oz40Var2.setValue(hoy0Var2);
                boolean l2 = jl40.l((String) oz40Var.getValue(), hoy0Var2.a.b);
                kk2 kk2Var2 = hoy0Var2.a;
                oz40Var.setValue(kk2Var2.b);
                if (!l2) {
                    tlsVar.invoke(kk2Var2.b);
                    break;
                }
                break;
            case 2:
                hoy0 hoy0Var3 = (hoy0) obj;
                oz40Var2.setValue(hoy0Var3);
                boolean l3 = jl40.l((String) oz40Var.getValue(), hoy0Var3.a.b);
                kk2 kk2Var3 = hoy0Var3.a;
                oz40Var.setValue(kk2Var3.b);
                if (!l3) {
                    tlsVar.invoke(kk2Var3.b);
                    break;
                }
                break;
            case 3:
                String str = (String) obj;
                oz40Var2.setValue(str);
                oz40Var.setValue(Boolean.FALSE);
                tlsVar.invoke(new b0m0(str));
                break;
            default:
                tlsVar.invoke(new fys0((byte[]) obj, new wbf((int) (((k6w) oz40Var2.getValue()).a >> 32), (int) (((k6w) oz40Var2.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), fia1.f((zii0) oz40Var.getValue()), 1.0f, Float.intBitsToFloat(0), Float.intBitsToFloat(0), false)));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ me5(tls tlsVar, oz40 oz40Var, oz40 oz40Var2, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = oz40Var;
        this.w = oz40Var2;
    }
}
