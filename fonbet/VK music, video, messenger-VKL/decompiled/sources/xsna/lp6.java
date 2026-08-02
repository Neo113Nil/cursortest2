package xsna;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* compiled from: BaseTrackSelection.java */
/* loaded from: classes12.dex */
public abstract class lp6 implements d7q {
    public final pfp0 a;
    public final int b;
    public final int[] c;
    public final androidx.media3.common.a[] d;
    public final long[] e;
    public int f;

    public lp6(int i, pfp0 pfp0Var, int[] iArr) {
        int i2 = 0;
        fxc0.z(iArr.length > 0);
        pfp0Var.getClass();
        this.a = pfp0Var;
        int length = iArr.length;
        this.b = length;
        this.d = new androidx.media3.common.a[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.d[i3] = pfp0Var.d[iArr[i3]];
        }
        Arrays.sort(this.d, new kp6(0));
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 >= i4) {
                this.e = new long[i4];
                return;
            } else {
                this.c[i2] = pfp0Var.a(this.d[i2]);
                i2++;
            }
        }
    }

    @Override // xsna.d7q
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // xsna.wgp0
    public final int b(androidx.media3.common.a aVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == aVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // xsna.d7q
    public final boolean d(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !a) {
            a = (i2 == i || a(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], y2r0.a(elapsedRealtime, j));
        return true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lp6 lp6Var = (lp6) obj;
            if (this.a.equals(lp6Var.a) && Arrays.equals(this.c, lp6Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.d7q
    public int evaluateQueueSize(long j, List<? extends aq10> list) {
        return list.size();
    }

    @Override // xsna.wgp0
    public final androidx.media3.common.a getFormat(int i) {
        return this.d[i];
    }

    @Override // xsna.wgp0
    public final int getIndexInTrackGroup(int i) {
        return this.c[i];
    }

    @Override // xsna.d7q
    public final androidx.media3.common.a getSelectedFormat() {
        return this.d[getSelectedIndex()];
    }

    @Override // xsna.d7q
    public final int getSelectedIndexInTrackGroup() {
        return this.c[getSelectedIndex()];
    }

    @Override // xsna.wgp0
    public final pfp0 getTrackGroup() {
        return this.a;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // xsna.wgp0
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // xsna.wgp0
    public final int length() {
        return this.c.length;
    }

    @Override // xsna.d7q
    public void disable() {
    }

    @Override // xsna.d7q
    public void enable() {
    }

    @Override // xsna.d7q
    public final void c(boolean z) {
    }

    @Override // xsna.d7q
    public void onPlaybackSpeed(float f) {
    }
}
