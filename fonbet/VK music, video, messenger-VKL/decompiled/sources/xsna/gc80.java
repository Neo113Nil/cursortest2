package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OnThresholdSumScrollListener.java */
/* loaded from: classes2.dex */
public class gc80 extends RecyclerView.t {
    public final int b;
    public int c = 0;
    public boolean d = false;
    public boolean e = false;

    public gc80(int i) {
        this.b = i;
    }

    public void l(boolean z) {
        throw null;
    }

    public void m(boolean z) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.c = 0;
            this.d = true;
            this.e = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if ((i2 < 0 && this.c >= 0) || (i2 > 0 && this.c <= 0)) {
            this.c = 0;
            this.d = true;
            this.e = true;
        }
        int i3 = this.c + i2;
        this.c = i3;
        boolean z = this.d;
        int i4 = this.b;
        if (z && Math.abs(i3) < i4) {
            int i5 = this.c;
            if (i5 < 0) {
                m(false);
            } else if (i5 > 0) {
                l(false);
            }
            this.d = false;
        }
        if (!this.e || Math.abs(this.c) < i4) {
            return;
        }
        if (this.c < 0) {
            m(true);
        } else {
            l(true);
        }
        this.e = false;
    }
}
