package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ColorChooseCell.kt */
/* loaded from: classes5.dex */
public final class qcc extends lg90 {
    public final long g;
    public d6g i;
    public float h = 1.0f;
    public final long j = 9205357640488583168L;

    public qcc(long j) {
        this.g = j;
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
        if (obj instanceof y6g) {
            return l5g.d(this.g, ((y6g) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.g);
    }

    @Override // xsna.lg90
    public final long i() {
        return this.j;
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.V1(oioVar, this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, this.h, this.i, 0, 86);
    }

    public final String toString() {
        return pm0.d(')', this.g, new StringBuilder("ColorPainter(color="));
    }
}
