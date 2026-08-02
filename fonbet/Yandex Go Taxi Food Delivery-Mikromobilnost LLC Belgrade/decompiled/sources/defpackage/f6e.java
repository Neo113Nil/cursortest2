package defpackage;

import androidx.compose.ui.graphics.colorspace.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public class f6e {
    public final ugc a;
    public final ugc b;
    public final ugc c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f6e(ugc ugcVar, ugc ugcVar2, int i) {
        this(ugcVar2, r0, r1, r4);
        float[] fArr;
        ugc f = cvw.v(ugcVar.b, 12884901888L) ? ffx.f(ugcVar) : ugcVar;
        ugc f2 = cvw.v(ugcVar2.b, 12884901888L) ? ffx.f(ugcVar2) : ugcVar2;
        float[] fArr2 = rzo.f;
        if (i == 3) {
            boolean v = cvw.v(ugcVar.b, 12884901888L);
            boolean v2 = cvw.v(ugcVar2.b, 12884901888L);
            if ((!v || !v2) && (v || v2)) {
                lz41 lz41Var = ((a) (v ? ugcVar : ugcVar2)).d;
                float[] a = v ? lz41Var.a() : fArr2;
                fArr2 = v2 ? lz41Var.a() : fArr2;
                fArr = new float[]{a[0] / fArr2[0], a[1] / fArr2[1], a[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long a(long j) {
        float h = ldc.h(j);
        float g = ldc.g(j);
        float e = ldc.e(j);
        float d = ldc.d(j);
        ugc ugcVar = this.b;
        long d2 = ugcVar.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float e2 = ugcVar.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public f6e(ugc ugcVar, ugc ugcVar2, ugc ugcVar3, float[] fArr) {
        this.a = ugcVar;
        this.b = ugcVar2;
        this.c = ugcVar3;
        this.d = fArr;
    }
}
