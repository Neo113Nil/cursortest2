package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class a16 extends pa90 {
    public int A;
    public final long B;
    public float C;
    public wec D;
    public final l8v y;
    public final long z;

    public a16(l8v l8vVar, long j) {
        int i;
        this.y = l8vVar;
        this.z = j;
        this.A = 1;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j)) >= 0) {
            u92 u92Var = (u92) l8vVar;
            if (i2 <= u92Var.a.getWidth() && i <= u92Var.a.getHeight()) {
                this.B = j;
                this.C = 1.0f;
                return;
            }
        }
        ny61.g("Failed requirement.");
        throw null;
    }

    @Override // defpackage.pa90
    public final boolean a(float f) {
        this.C = f;
        return true;
    }

    @Override // defpackage.pa90
    public final boolean c(wec wecVar) {
        this.D = wecVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a16)) {
            return false;
        }
        a16 a16Var = (a16) obj;
        return jl40.l(this.y, a16Var.y) && z5w.a(0L, 0L) && k6w.a(this.z, a16Var.z) && this.A == a16Var.A;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A) + qv10.c(qv10.c(this.y.hashCode() * 31, 31, 0L), 31, this.z);
    }

    @Override // defpackage.pa90
    public final long i() {
        return rzo.a0(this.B);
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        qam.S(qamVar, this.y, this.z, 0L, (Math.round(Float.intBitsToFloat((int) (qamVar.c() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), this.C, this.D, this.A, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.y);
        sb.append(", srcOffset=");
        sb.append((Object) z5w.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) k6w.b(this.z));
        sb.append(", filterQuality=");
        int i = this.A;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public a16(l8v l8vVar) {
        this(l8vVar, (((u92) l8vVar).a.getHeight() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((u92) l8vVar).a.getWidth() << 32));
    }
}
