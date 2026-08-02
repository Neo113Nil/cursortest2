package defpackage;

import androidx.compose.animation.core.a;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class evr0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ evr0(float f, long j, jvu0 jvu0Var, a aVar, long j2) {
        this.a = 2;
        this.b = f;
        this.c = j;
        this.x = jvu0Var;
        this.y = aVar;
        this.w = j2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                qam qamVar = (qam) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                float f2 = (f * 2.0f) + intBitsToFloat;
                float floatValue = ((Number) ((m3u0) obj2).getValue()).floatValue() * ((intBitsToFloat + f) / f2);
                Float valueOf = Float.valueOf(floatValue);
                long j = this.w;
                float f3 = -f;
                jd00.d(qamVar, ((ehr0) obj3).a(qamVar.c(), qamVar.getLayoutDirection(), qamVar.N().r()), zoy0.E(new Pair[]{new Pair(valueOf, new ldc(j)), new Pair(Float.valueOf(((f / 2.0f) / f2) + floatValue), new ldc(this.c)), new Pair(Float.valueOf(floatValue + (f / f2)), new ldc(j))}, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(r12) << 32) | (Float.floatToRawIntBits(r12) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 8), 0.0f, 60);
                break;
            case 1:
                qam qamVar2 = (qam) obj;
                jd00.d(qamVar2, ((ehr0) obj3).a(qamVar2.c(), qamVar2.getLayoutDirection(), qamVar2.N().r()), ocb1.g(this.c, this.w, Float.intBitsToFloat((int) (qamVar2.c() >> 32)), this.b, ((Number) ((m3u0) obj2).getValue()).floatValue()), 0.0f, 60);
                break;
            default:
                jvu0 jvu0Var = (jvu0) obj3;
                a aVar = (a) obj2;
                qam qamVar3 = (qam) obj;
                float f4 = f / 2.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar3.c() >> 32)) - f;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (qamVar3.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - f;
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                qamVar3.F(this.c, -90.0f, 360.0f, false, floatToRawIntBits2, floatToRawIntBits, (r25 & 128) != 0 ? i3r.a : jvu0Var, (r25 & 512) != 0 ? 3 : 0);
                if (((Number) aVar.e()).floatValue() > 0.0f) {
                    qamVar3.F(this.w, -90.0f, ((Number) aVar.e()).floatValue() * 360.0f, false, floatToRawIntBits2, floatToRawIntBits, (r25 & 128) != 0 ? i3r.a : jvu0Var, (r25 & 512) != 0 ? 3 : 0);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ evr0(float f, long j, long j2, ehr0 ehr0Var, osv osvVar, int i) {
        this.a = i;
        this.b = f;
        this.c = j;
        this.w = j2;
        this.x = ehr0Var;
        this.y = osvVar;
    }
}
