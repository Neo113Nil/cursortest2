package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.ybsdk.core.stories.StoriesComponentView;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.stop.interactor.g;

/* loaded from: classes10.dex */
public final /* synthetic */ class j5y implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5y(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 startProgressTimer$lambda$19;
        int i = this.a;
        long j = this.b;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                bVar.e(z5w.b(((z5w) ((a) obj).e()).a, j));
                bVar.c.invoke();
                return zy11Var;
            case 1:
                long j2 = this.b;
                qam.t0((qam) obj, ldc.b(j2, ((lg6) obj2).b.getFloatValue() * ldc.d(j2), 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                return zy11Var;
            case 2:
                LineAtStop lineAtStop = (LineAtStop) obj;
                return kotlin.sequences.b.o(new h73(1, lineAtStop.getThreadsAtStop()), new ec1((ru.yandex.taxi.masstransit.datasource.schedule.a) obj2, lineAtStop, this.b, 7));
            case 3:
                LineAtStop lineAtStop2 = (LineAtStop) obj;
                return kotlin.sequences.b.o(new h73(1, lineAtStop2.getThreadsAtStop()), new ec1((g) obj2, lineAtStop2, this.b, 8));
            case 4:
                j690 j690Var = (j690) obj2;
                c1y c1yVar = (c1y) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                if (intBitsToFloat > 0.0f) {
                    float w0 = c1yVar.w0(4.0f);
                    k28 k28Var = c1yVar.a;
                    float w02 = c1yVar.w0(j690Var.b(c1yVar.getLayoutDirection())) - w0;
                    float f = (w0 * 2.0f) + intBitsToFloat + w02;
                    LayoutDirection layoutDirection = c1yVar.getLayoutDirection();
                    int[] iArr = xx80.a;
                    float intBitsToFloat2 = iArr[layoutDirection.ordinal()] == 1 ? Float.intBitsToFloat((int) (k28Var.c() >> 32)) - f : w02 < 0.0f ? 0.0f : w02;
                    if (iArr[c1yVar.getLayoutDirection().ordinal()] == 1) {
                        f = Float.intBitsToFloat((int) (k28Var.c() >> 32)) - (w02 < 0.0f ? 0.0f : w02);
                    }
                    float f2 = f;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    float f3 = (-intBitsToFloat3) / 2.0f;
                    float f4 = intBitsToFloat3 / 2.0f;
                    nfh nfhVar = k28Var.b;
                    long v = nfhVar.v();
                    nfhVar.q().save();
                    try {
                        ((cot) nfhVar.a).f(intBitsToFloat2, f3, f2, f4, 0);
                        c1yVar.a();
                    } finally {
                        b64.C(nfhVar, v);
                    }
                } else {
                    c1yVar.a();
                }
                return zy11Var;
            case 5:
                qam.t0((qam) obj, this.b, 0L, (Float.floatToRawIntBits(((qor) obj2).getFloatValue() * Float.intBitsToFloat((int) (r12.c() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r12.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 122);
                return zy11Var;
            case 6:
                startProgressTimer$lambda$19 = StoriesComponentView.startProgressTimer$lambda$19((StoriesComponentView) obj2, j, ((Long) obj).longValue());
                return startProgressTimer$lambda$19;
            case 7:
                return aab1.a(2.0f, j, (f530) obj, (byk0) obj2);
            default:
                nvz0 nvz0Var = (nvz0) obj2;
                qam qamVar = (qam) obj;
                ((mvz0) nvz0Var.b.getValue()).getClass();
                float floatValue = nvz0Var.a.getFloatValue();
                oz40 oz40Var = nvz0Var.b;
                ((mvz0) oz40Var.getValue()).getClass();
                ((mvz0) oz40Var.getValue()).getClass();
                float w03 = qamVar.w0(24.0f);
                float w04 = qamVar.w0(8.0f);
                qamVar.c();
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - w04) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float w05 = qamVar.w0(12.0f);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(w05) << 32) | (Float.floatToRawIntBits(w05) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                long j3 = this.b;
                qam.g0(qamVar, j3, 0L, floatToRawIntBits, floatToRawIntBits2, null, 242);
                jb2 a = nb2.a();
                float intBitsToFloat4 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - w04;
                float f5 = floatValue - (w03 / 2.0f);
                float f6 = w03 / 24.0f;
                float f7 = w04 / 8.0f;
                float f8 = (12.0f * f6) + f5;
                float f9 = (8.0f * f7) + intBitsToFloat4;
                a.m(f8, f9);
                float f10 = (7.15542f * f7) + intBitsToFloat4;
                a.l((11.5777f * f6) + f5, f10);
                float f11 = (6.17114f * f7) + intBitsToFloat4;
                a.h((11.3258f * f6) + f5, (6.65156f * f7) + intBitsToFloat4, (11.1998f * f6) + f5, (6.39963f * f7) + intBitsToFloat4, (11.0728f * f6) + f5, f11);
                float f12 = (2.52532f * f7) + intBitsToFloat4;
                float f13 = (0.193012f * f7) + intBitsToFloat4;
                float f14 = (0.0113831f * f7) + intBitsToFloat4;
                a.h((9.04687f * f6) + f5, f12, (5.27311f * f6) + f5, f13, (1.10615f * f6) + f5, f14);
                float f15 = (0.0f * f7) + intBitsToFloat4;
                a.h((0.844995f * f6) + f5, f15, (0.56333f * f6) + f5, f15, (0.0f * f6) + f5, f15);
                a.l((24.0f * f6) + f5, f15);
                a.h((23.4367f * f6) + f5, f15, (23.155f * f6) + f5, f15, (22.8938f * f6) + f5, f14);
                a.h((18.7269f * f6) + f5, f13, (14.9531f * f6) + f5, f12, (12.9272f * f6) + f5, f11);
                float f16 = (12.4223f * f6) + f5;
                a.h((12.8002f * f6) + f5, (6.39962f * f7) + intBitsToFloat4, (12.6742f * f6) + f5, (6.65154f * f7) + intBitsToFloat4, f16, (7.15536f * f7) + intBitsToFloat4);
                a.l(f16, f10);
                a.l(f8, f9);
                a.g();
                qam.Y(qamVar, a, j3, null, 60);
                return zy11Var;
        }
    }

    public /* synthetic */ j5y(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
