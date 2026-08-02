package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class kib implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long w;

    public /* synthetic */ kib(long j, float f, long j2) {
        this.b = j;
        this.c = f;
        this.w = j2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        float f;
        Paint paint;
        float f2;
        eb2 eb2Var;
        float f3;
        float f4;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        float f5 = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                qam qamVar = (qam) obj;
                i28 q = qamVar.N().q();
                eb2 eb2Var2 = new eb2();
                float w0 = qamVar.w0(10.0f);
                float f6 = 0.0f - w0;
                float w02 = qamVar.w0(0.0f) + f6;
                float w03 = qamVar.w0(5.0f) + f6;
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) + w0;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + w0;
                boolean b = y7m.b(8.0f, 0.0f);
                Paint paint2 = eb2Var2.a;
                if (b) {
                    f = 1.0f;
                } else {
                    f = 1.0f;
                    paint2.setMaskFilter(new BlurMaskFilter(qamVar.w0(8.0f), BlurMaskFilter.Blur.NORMAL));
                }
                if (ldc.d(j) == f) {
                    eb2Var = eb2Var2;
                    paint = paint2;
                    f3 = w02;
                    f2 = w03;
                    f4 = intBitsToFloat2;
                } else {
                    paint2.setColor(rzo.X(ldc.b(this.w, f - ldc.d(j), 0.0f, 0.0f, 0.0f, 14)));
                    paint = paint2;
                    f2 = w03;
                    eb2Var = eb2Var2;
                    f3 = w02;
                    f4 = intBitsToFloat2;
                    q.e(f3, f2, intBitsToFloat, f4, qamVar.w0(f5), qamVar.w0(f5), eb2Var);
                }
                paint.setColor(rzo.X(j));
                q.e(f3, f2, intBitsToFloat, f4, qamVar.w0(f5), qamVar.w0(f5), eb2Var);
                break;
            default:
                qam qamVar2 = (qam) obj;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & qamVar2.c()));
                cjf0.e(qamVar2, 1.0f, j, intBitsToFloat3);
                cjf0.e(qamVar2, f5, this.w, intBitsToFloat3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ kib(long j, long j2, float f) {
        this.b = j;
        this.w = j2;
        this.c = f;
    }
}
