package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class po7 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ fwi c;
    public final /* synthetic */ float w;
    public final /* synthetic */ long x;

    public /* synthetic */ po7(float f, fwi fwiVar, float f2, long j) {
        this.b = f;
        this.c = fwiVar;
        this.w = f2;
        this.x = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        float f = this.w;
        fwi fwiVar = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                long j = this.x;
                qam qamVar = (qam) obj;
                float w0 = fwiVar.w0(342.0f);
                float w02 = fwiVar.w0(306.0f);
                float w03 = fwiVar.w0(f);
                float intBitsToFloat = (w0 / 2.0f) + ((Float.intBitsToFloat((int) (qamVar.c() >> 32)) - w0) / 2.0f);
                float f3 = (w02 / 2.0f) + w03;
                float f4 = 1.0f - f2;
                float max = (((Math.max(intBitsToFloat, Float.intBitsToFloat((int) (qamVar.c() >> 32)) - intBitsToFloat) * 2.0f) - w0) * f4) + w0;
                float f5 = intBitsToFloat - (max / 2.0f);
                float max2 = f3 - (((((Math.max(f3, Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - f3) * 2.0f) - w02) * f4) + w02) / 2.0f);
                i28 q = qamVar.N().q();
                try {
                    q.s(new zii0(0.0f, 0.0f, Float.intBitsToFloat((int) (qamVar.c() >> 32)), Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))), new eb2());
                    qam.t0(qamVar, j, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), qamVar.c(), 0.0f, null, 120);
                    float w04 = qamVar.w0(20.0f) * f2;
                    qam.g0(qamVar, ldc.l, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(max2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(r12) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(w04) << 32) | (Float.floatToRawIntBits(w04) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 112);
                    return zy11Var;
                } finally {
                    q.n();
                }
            default:
                qam qamVar2 = (qam) obj;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar2.c() >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + f2;
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                float w05 = fwiVar.w0(f);
                jb2 a = nb2.a();
                Path path = a.a;
                a.m(0.0f, 0.0f);
                int i2 = (int) (floatToRawIntBits >> 32);
                a.l(Float.intBitsToFloat(i2), 0.0f);
                float intBitsToFloat4 = Float.intBitsToFloat(i2);
                int i3 = (int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                a.l(intBitsToFloat4, Float.intBitsToFloat(i3));
                float f6 = 2.0f * w05;
                float intBitsToFloat5 = Float.intBitsToFloat(i2) - f6;
                float intBitsToFloat6 = Float.intBitsToFloat(i3) - w05;
                float intBitsToFloat7 = Float.intBitsToFloat(i2);
                float intBitsToFloat8 = Float.intBitsToFloat(i3) + w05;
                if (a.b == null) {
                    a.b = new RectF();
                }
                a.b.set(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8);
                path.arcTo(a.b, 0.0f, -90.0f, false);
                a.l(w05, Float.intBitsToFloat(i3) - w05);
                float intBitsToFloat9 = Float.intBitsToFloat(i3) - w05;
                float intBitsToFloat10 = Float.intBitsToFloat(i3) + w05;
                if (a.b == null) {
                    a.b = new RectF();
                }
                a.b.set(0.0f, intBitsToFloat9, f6, intBitsToFloat10);
                path.arcTo(a.b, 270.0f, -90.0f, false);
                a.g();
                qam.Y(qamVar2, a, this.x, null, 60);
                return zy11Var;
        }
    }

    public /* synthetic */ po7(fwi fwiVar, float f, float f2, long j) {
        this.c = fwiVar;
        this.b = f;
        this.w = f2;
        this.x = j;
    }
}
