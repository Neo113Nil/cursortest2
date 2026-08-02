package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class c07 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ c07(float f, long j, m3u0 m3u0Var, m3u0 m3u0Var2, m3u0 m3u0Var3) {
        this.b = f;
        this.w = j;
        this.c = m3u0Var;
        this.x = m3u0Var2;
        this.y = m3u0Var3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m3u0 m3u0Var = this.c;
        Object obj2 = this.y;
        float f = this.b;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                c1y c1yVar = (c1y) obj;
                float w0 = c1yVar.w0(f);
                long floatToRawIntBits = (Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                qam.g0(c1yVar, ldc.b(this.w, ((Number) m3u0Var.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14), 0L, 0L, floatToRawIntBits, null, 246);
                qam.g0(c1yVar, ((ldc) ((m3u0) obj3).getValue()).a, 0L, 0L, floatToRawIntBits, new jvu0(0, 0, 30, c1yVar.w0(((y7m) ((m3u0) obj2).getValue()).a), 0.0f), 230);
                c1yVar.a();
                break;
            default:
                igr0 igr0Var = (igr0) obj3;
                eb2 eb2Var = (eb2) obj2;
                qam qamVar = (qam) obj;
                igr0Var.getClass();
                float w02 = qamVar.w0(0.0f);
                float w03 = qamVar.w0(igr0Var.c);
                float w04 = !Float.isNaN(f) ? qamVar.w0(f) : Math.min(Float.intBitsToFloat((int) (qamVar.c() >> 32)), Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f;
                long j = this.w;
                if (m3u0Var != null) {
                    j = ldc.b(j, ((Number) m3u0Var.getValue()).floatValue() * ldc.d(j), 0.0f, 0.0f, 0.0f, 14);
                }
                eb2Var.f(j);
                qamVar.N().q().e(w02, w03, Float.intBitsToFloat((int) (qamVar.c() >> 32)) + w02, Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + w03, w04, w04, eb2Var);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ c07(igr0 igr0Var, float f, eb2 eb2Var, m3u0 m3u0Var, long j) {
        this.x = igr0Var;
        this.b = f;
        this.y = eb2Var;
        this.c = m3u0Var;
        this.w = j;
    }
}
