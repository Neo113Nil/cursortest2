package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: BitmapPainter.kt */
/* loaded from: classes11.dex */
public final class rc7 extends lg90 {
    public final agw g;
    public final long h;
    public int i;
    public final long j;
    public float k;
    public d6g l;

    public rc7(long j, agw agwVar) {
        int i;
        int i2;
        this.g = agwVar;
        this.h = j;
        this.i = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > agwVar.getWidth() || i2 > agwVar.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.j = j;
        this.k = 1.0f;
    }

    @Override // xsna.lg90
    public final boolean a(float f) {
        this.k = f;
        return true;
    }

    @Override // xsna.lg90
    public final boolean b(d6g d6gVar) {
        this.l = d6gVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc7)) {
            return false;
        }
        rc7 rc7Var = (rc7) obj;
        return epx.f(this.g, rc7Var.g) && h9x.b(0L, 0L) && q9x.b(this.h, rc7Var.h) && this.i == rc7Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + bh10.a(bh10.a(this.g.hashCode() * 31, 31, 0L), 31, this.h);
    }

    @Override // xsna.lg90
    public final long i() {
        return pli.w(this.j);
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.B0(oioVar, this.g, 0L, this.h, 0L, (Math.round(Float.intBitsToFloat((int) (oioVar.d() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L))) & 4294967295L), this.k, null, this.l, 0, this.i, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.g);
        sb.append(", srcOffset=");
        sb.append((Object) h9x.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) q9x.c(this.h));
        sb.append(", filterQuality=");
        int i = this.i;
        return tq.f(sb, i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : DeviceInfo.STR_TYPE_UNKNOWN, ')');
    }

    public rc7(agw agwVar) {
        this((agwVar.getHeight() & 4294967295L) | (agwVar.getWidth() << 32), agwVar);
    }
}
