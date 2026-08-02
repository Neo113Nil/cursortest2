package xsna;

/* compiled from: BrushPainter.kt */
/* loaded from: classes11.dex */
public final class cl8 extends lg90 {
    public final y7z g;
    public float h = 1.0f;
    public d6g i;

    public cl8(y7z y7zVar) {
        this.g = y7zVar;
    }

    @Override // xsna.lg90
    public final boolean a(float f) {
        this.h = f;
        return true;
    }

    @Override // xsna.lg90
    public final boolean b(d6g d6gVar) {
        this.i = d6gVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cl8) {
            return epx.f(this.g, ((cl8) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // xsna.lg90
    public final long i() {
        return this.g.b();
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.x1(oioVar, this.g, 0L, 0L, this.h, null, this.i, 0, 86);
    }

    public final String toString() {
        return "BrushPainter(brush=" + this.g + ')';
    }
}
