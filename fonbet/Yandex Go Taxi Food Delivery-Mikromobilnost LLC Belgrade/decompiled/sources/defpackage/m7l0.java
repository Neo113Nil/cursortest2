package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class m7l0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ x7l0 b;

    public /* synthetic */ m7l0(x7l0 x7l0Var, int i) {
        this.a = i;
        this.b = x7l0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ldc ldcVar;
        int i = this.a;
        x7l0 x7l0Var = this.b;
        switch (i) {
            case 0:
                qam qamVar = (qam) obj;
                wa31 wa31Var = x7l0Var.r;
                float w0 = wa31Var != null ? qamVar.w0(wa31Var.b) : 0.0f;
                float w02 = qamVar.w0(56.0f) / 2.0f;
                float f = (w0 >= 1.0f ? w0 : 1.0f) / 2.0f;
                float intBitsToFloat = qamVar.getLayoutDirection() == LayoutDirection.Rtl ? (Float.intBitsToFloat((int) (qamVar.c() >> 32)) - w02) - f : w02 - f;
                wa31 wa31Var2 = x7l0Var.r;
                qam.t0(qamVar, (wa31Var2 == null || (ldcVar = wa31Var2.a) == null) ? ldc.m : ldcVar.a, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w0) << 32), 0.0f, null, 120);
                return zy11.a;
            default:
                return bb1.g((f530) obj, new m7l0(x7l0Var, 0));
        }
    }
}
