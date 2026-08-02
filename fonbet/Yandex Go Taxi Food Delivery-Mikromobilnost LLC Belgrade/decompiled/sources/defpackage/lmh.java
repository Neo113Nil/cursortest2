package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class lmh extends tmh implements Comparable {
    public final int x;
    public final int y;

    public lmh(int i, xzz0 xzz0Var, int i2, omh omhVar, int i3) {
        super(i, xzz0Var, i2);
        int i4;
        this.x = iyi0.e(i3, omhVar.B) ? 1 : 0;
        a aVar = this.w;
        int i5 = aVar.u;
        int i6 = -1;
        if (i5 != -1 && (i4 = aVar.v) != -1) {
            i6 = i5 * i4;
        }
        this.y = i6;
    }

    @Override // defpackage.tmh
    public final int a() {
        return this.x;
    }

    @Override // defpackage.tmh
    public final /* bridge */ /* synthetic */ boolean b(tmh tmhVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.y, ((lmh) obj).y);
    }
}
