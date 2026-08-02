package defpackage;

import android.graphics.Matrix;
import androidx.compose.animation.core.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class nj20 implements tls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ nj20(long j, jvu0 jvu0Var, float f, long j2, osv osvVar, osv osvVar2, osv osvVar3, osv osvVar4) {
        this.b = j;
        this.x = jvu0Var;
        this.c = f;
        this.w = j2;
        this.y = osvVar;
        this.z = osvVar2;
        this.A = osvVar3;
        this.B = osvVar4;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        switch (i) {
            case 0:
                jb2 jb2Var = (jb2) obj6;
                lb2 lb2Var = (lb2) obj3;
                jb2 jb2Var2 = (jb2) obj5;
                jb2 jb2Var3 = (jb2) obj4;
                qam qamVar = (qam) obj;
                long d = jb2Var.i().d();
                Matrix matrix = new Matrix();
                matrix.setScale(Float.intBitsToFloat((int) (qamVar.c() >> 32)) / Float.intBitsToFloat((int) (d >> 32)), Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / Float.intBitsToFloat((int) (d & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                jb2Var.a.transform(matrix);
                zii0 i2 = jb2Var.i();
                float intBitsToFloat = (Float.intBitsToFloat((int) (qamVar.c() >> 32)) / 2.0f) - ((i2.c - i2.a) / 2.0f);
                jb2Var.r((Float.floatToRawIntBits((Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f) - ((i2.d - i2.b) / 2.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
                lb2Var.b(jb2Var);
                lb2Var.a(0.0f, lb2Var.a.getLength(), jb2Var2);
                float f = this.c;
                qam.Y(qamVar, jb2Var2, this.b, new jvu0(1, 0, 26, f, 0.0f), 52);
                lb2Var.b(jb2Var);
                lb2Var.a(0.0f, ((Number) ((a) obj2).e()).floatValue(), jb2Var3);
                qam.Y(qamVar, jb2Var3, this.w, new jvu0(1, 0, 26, f, 0.0f), 52);
                break;
            default:
                jvu0 jvu0Var = (jvu0) obj6;
                m3u0 m3u0Var = (m3u0) obj3;
                qam qamVar2 = (qam) obj;
                cjf0.d(qamVar2, 0.0f, 360.0f, this.b, jvu0Var);
                cjf0.d(qamVar2, ((Number) m3u0Var.getValue()).floatValue() + ((Number) ((m3u0) obj2).getValue()).floatValue() + (((((Number) ((m3u0) obj5).getValue()).intValue() * 216.0f) % 360.0f) - 90.0f) + (jvu0Var.c == 0 ? 0.0f : ((this.c / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(((Number) ((m3u0) obj4).getValue()).floatValue() - ((Number) m3u0Var.getValue()).floatValue()), 0.1f), this.w, jvu0Var);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ nj20(jb2 jb2Var, lb2 lb2Var, jb2 jb2Var2, float f, long j, a aVar, jb2 jb2Var3, long j2) {
        this.x = jb2Var;
        this.A = lb2Var;
        this.y = jb2Var2;
        this.c = f;
        this.b = j;
        this.B = aVar;
        this.z = jb2Var3;
        this.w = j2;
    }
}
