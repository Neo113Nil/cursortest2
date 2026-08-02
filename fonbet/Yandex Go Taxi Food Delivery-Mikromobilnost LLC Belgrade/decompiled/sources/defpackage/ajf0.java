package defpackage;

import android.graphics.Canvas;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final /* synthetic */ class ajf0 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ajf0(float f, long j, long j2, osv osvVar) {
        this.b = f;
        this.c = j;
        this.w = j2;
        this.x = osvVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                jvu0 jvu0Var = (jvu0) obj2;
                qam qamVar = (qam) obj;
                cjf0.d(qamVar, 0.0f, 360.0f, this.c, jvu0Var);
                cjf0.d(qamVar, 270.0f, f * 360.0f, this.w, jvu0Var);
                break;
            case 1:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                k28 k28Var = c1yVar.a;
                qiy g = ocb1.g(this.c, this.w, Float.intBitsToFloat((int) (k28Var.c() >> 32)), this.b, ((Number) ((m3u0) obj2).getValue()).floatValue());
                long c = k28Var.c();
                c1yVar.getLayoutDirection();
                k28Var.b.r();
                jd00.d(c1yVar, new gx80(wwg.b(0L, c)), g, 0.0f, 60);
                break;
            default:
                List list = (List) obj2;
                c1y c1yVar2 = (c1y) obj;
                i28 q = c1yVar2.a.b.q();
                Canvas canvas = t72.a;
                Canvas canvas2 = ((s72) q).a;
                int saveLayer = canvas2.saveLayer(null, null);
                c1yVar2.a();
                qiy G = zoy0.G(list, 0.0f, c1yVar2.w0(16.0f), 10);
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float w0 = c1yVar2.w0(f);
                float w02 = c1yVar2.w0(16.0f);
                qam.t(c1yVar2, G, floatToRawIntBits, (Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(w02) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 15, 56);
                a6t0 a6t0Var = new a6t0(this.c);
                float w03 = c1yVar2.w0(48.0f);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(w03) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float w04 = c1yVar2.w0(f);
                float w05 = c1yVar2.w0(48.0f);
                qam.t(c1yVar2, a6t0Var, floatToRawIntBits2, (Float.floatToRawIntBits(w05) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w04) << 32), 0.0f, null, 5, 56);
                float w06 = c1yVar2.w0(48.0f);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(w06) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(0.0f) << 32);
                float w07 = c1yVar2.w0(f);
                float w08 = c1yVar2.w0(48.0f);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(w07) << 32) | (Float.floatToRawIntBits(w08) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float w09 = c1yVar2.w0(1.0f);
                long j = this.w;
                c1yVar2.h(j, floatToRawIntBits3, floatToRawIntBits4, w09, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                float f2 = ay41.a;
                float f3 = f2 - 48.0f;
                float w010 = c1yVar2.w0(f3);
                long floatToRawIntBits5 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(w010) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float w011 = c1yVar2.w0(f);
                float w012 = c1yVar2.w0(f3);
                c1yVar2.h(j, floatToRawIntBits5, (Float.floatToRawIntBits(w012) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w011) << 32), c1yVar2.w0(1.0f), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                float f4 = f2 - 16.0f;
                qiy G2 = zoy0.G(a.q0(list), c1yVar2.w0(f4), c1yVar2.w0(f2), 8);
                float w013 = c1yVar2.w0(f4);
                long floatToRawIntBits6 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(w013) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float w014 = c1yVar2.w0(f);
                float w015 = c1yVar2.w0(16.0f);
                qam.t(c1yVar2, G2, floatToRawIntBits6, (Float.floatToRawIntBits(w014) << 32) | (Float.floatToRawIntBits(w015) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 15, 56);
                canvas2.restoreToCount(saveLayer);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ajf0(float f, long j, jvu0 jvu0Var, long j2) {
        this.b = f;
        this.c = j;
        this.x = jvu0Var;
        this.w = j2;
    }

    public /* synthetic */ ajf0(List list, float f, long j, long j2) {
        this.x = list;
        this.b = f;
        this.c = j;
        this.w = j2;
    }
}
