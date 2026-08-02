package defpackage;

import androidx.compose.foundation.gestures.e;
import androidx.compose.material3.w;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final /* synthetic */ class kg6 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ kg6(w wVar, int i) {
        this.a = i;
        this.b = wVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        w wVar = this.b;
        switch (i) {
            case 0:
                m2k0 m2k0Var = (m2k0) obj;
                e eVar = wVar.e;
                float floatValue = eVar.j.getFloatValue();
                float e = eVar.d().e();
                float f = floatValue < e ? e - floatValue : 0.0f;
                m2k0Var.v(f > 0.0f ? (Float.intBitsToFloat((int) (m2k0Var.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + f) / Float.intBitsToFloat((int) (m2k0Var.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) : 1.0f);
                m2k0Var.B(jl40.b(0.5f, 0.0f));
                return zy11Var;
            case 1:
                m2k0 m2k0Var2 = (m2k0) obj;
                e eVar2 = wVar.e;
                float floatValue2 = eVar2.j.getFloatValue();
                float e2 = eVar2.d().e();
                float f2 = floatValue2 < e2 ? e2 - floatValue2 : 0.0f;
                m2k0Var2.v(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (m2k0Var2.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + f2) / Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & m2k0Var2.J))) : 1.0f);
                m2k0Var2.B(jl40.b(0.5f, 0.0f));
                return zy11Var;
            default:
                ((Float) obj).getClass();
                return Float.valueOf(((Number) wVar.b.invoke()).floatValue());
        }
    }
}
