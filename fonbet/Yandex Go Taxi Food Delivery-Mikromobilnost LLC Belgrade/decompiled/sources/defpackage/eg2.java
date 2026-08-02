package defpackage;

import androidx.compose.ui.graphics.Path$Direction;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final /* synthetic */ class eg2 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qor b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float w;

    public /* synthetic */ eg2(float f, qor qorVar, long j) {
        this.w = f;
        this.b = qorVar;
        this.c = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qor qorVar = this.b;
        switch (i) {
            case 0:
                long j = this.c;
                c1y c1yVar = (c1y) obj;
                float floatValue = qorVar.getFloatValue() * this.w;
                jb2 a = nb2.a();
                a.f(ora1.b(wwg.b(0L, c1yVar.a.c()), (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(floatValue) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(floatValue)), 0L, 0L), Path$Direction.CounterClockwise);
                nfh nfhVar = c1yVar.a.b;
                long v = nfhVar.v();
                nfhVar.q().save();
                try {
                    ((cot) nfhVar.a).e(a);
                    qam.t0(c1yVar, j, 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                    c1yVar.a();
                    return zy11Var;
                } finally {
                    b64.C(nfhVar, v);
                }
            default:
                qam qamVar = (qam) obj;
                long j2 = this.c;
                if (qorVar != null) {
                    j2 = ldc.b(j2, qorVar.getFloatValue() * ldc.d(j2), 0.0f, 0.0f, 0.0f, 14);
                }
                qamVar.h(j2, 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() >> 32))) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(0.0f)), this.w, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                return zy11Var;
        }
    }

    public /* synthetic */ eg2(qor qorVar, long j, float f) {
        this.b = qorVar;
        this.c = j;
        this.w = f;
    }
}
