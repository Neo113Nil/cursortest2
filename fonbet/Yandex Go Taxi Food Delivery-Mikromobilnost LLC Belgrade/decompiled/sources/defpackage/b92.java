package defpackage;

import androidx.compose.foundation.gestures.b0;
import androidx.compose.material3.z;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final /* synthetic */ class b92 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ b92(b0 b0Var, float f, tls tlsVar) {
        this.a = 5;
        this.c = b0Var;
        this.b = f;
        this.w = tlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0161, code lost:
    
        if (r2 > r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0163, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0177, code lost:
    
        if (r2 < r5) goto L33;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = 0.0f;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        float f2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                l8v l8vVar = (l8v) obj3;
                c36 c36Var = (c36) obj2;
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                k28 k28Var = c1yVar.a;
                nfh nfhVar = k28Var.b;
                long v = nfhVar.v();
                nfhVar.q().save();
                try {
                    cot cotVar = (cot) nfhVar.a;
                    cotVar.n(f2, 0.0f);
                    cotVar.j(45.0f, 0L);
                    k28Var.d(l8vVar, c36Var);
                    return zy11Var;
                } finally {
                    b64.C(nfhVar, v);
                }
            case 1:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj3;
                y6y y6yVar = (y6y) obj2;
                xi2 xi2Var = (xi2) obj;
                if (f2 <= 0.0f) {
                    if (f2 < 0.0f) {
                        f = ((Number) xi2Var.e.getValue()).floatValue();
                        break;
                    }
                    float f3 = f - ref$FloatRef.element;
                    if (f3 != y6yVar.a(f3) || f != ((Number) xi2Var.e.getValue()).floatValue()) {
                        xi2Var.a();
                    }
                    ref$FloatRef.element += f3;
                    return zy11Var;
                }
                f = ((Number) xi2Var.e.getValue()).floatValue();
                break;
            case 2:
                List list = ((xrn0) obj3).c;
                ((m6y) ((u6y) obj)).f(list.size(), new qc0(list, 28, new vkn0(10)), new rc0(list, 13, krn0.a), new a(802480018, new lrn0(list, (tls) obj2, f2), true));
                return zy11Var;
            case 3:
                m3u0 m3u0Var = (m3u0) obj3;
                m3u0 m3u0Var2 = (m3u0) obj2;
                qam qamVar = (qam) obj;
                float intBitsToFloat = (Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - f2) / 2.0f;
                ((cot) qamVar.N().a).n(0.0f, intBitsToFloat);
                try {
                    qam.g0(qamVar, ((ldc) m3u0Var.getValue()).a, 0L, (Float.floatToRawIntBits(((Number) m3u0Var2.getValue()).floatValue()) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(90.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(90.0f) << 32), null, 242);
                    return zy11Var;
                } finally {
                    ((cot) qamVar.N().a).n(-0.0f, -intBitsToFloat);
                }
            case 4:
                o oVar = (o) obj3;
                o.a aVar = (o.a) obj;
                androidx.compose.animation.core.a aVar2 = ((z) obj2).x;
                o.a.o(aVar, oVar, aVar2 != null ? (int) ((Number) aVar2.e()).floatValue() : (int) f2, 0);
                return zy11Var;
            default:
                b0 b0Var = (b0) obj3;
                tls tlsVar = (tls) obj2;
                long longValue = ((Long) obj).longValue();
                if (b0Var.b == Long.MIN_VALUE) {
                    b0Var.b = longValue;
                }
                float f4 = b0Var.e;
                oj2 oj2Var = new oj2(f4);
                oj2 oj2Var2 = b0.f;
                long e = f2 == 0.0f ? b0Var.a.e(new oj2(f4), oj2Var2, b0Var.c) : m810.c((longValue - b0Var.b) / f2);
                float f5 = ((oj2) b0Var.a.n(e, oj2Var, oj2Var2, b0Var.c)).a;
                b0Var.c = (oj2) b0Var.a.k(e, oj2Var, oj2Var2, b0Var.c);
                b0Var.b = longValue;
                float f6 = b0Var.e - f5;
                b0Var.e = f5;
                tlsVar.invoke(Float.valueOf(f6));
                return zy11Var;
        }
    }

    public /* synthetic */ b92(float f, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
        this.w = obj2;
    }

    public /* synthetic */ b92(Object obj, Object obj2, float f, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = f;
    }
}
