package androidx.recyclerview.widget;

import defpackage.jjj;

/* loaded from: classes.dex */
public final class j0 implements jjj {
    public final /* synthetic */ RecyclerView a;

    public j0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.jjj
    public final float a() {
        float f;
        RecyclerView recyclerView = this.a;
        if (recyclerView.mLayout.J()) {
            f = recyclerView.mScaledVerticalScrollFactor;
        } else {
            if (!recyclerView.mLayout.I()) {
                return 0.0f;
            }
            f = recyclerView.mScaledHorizontalScrollFactor;
        }
        return -f;
    }

    @Override // defpackage.jjj
    public final boolean b(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.a;
        if (recyclerView.mLayout.J()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.mLayout.I()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.stopScroll();
        return recyclerView.flingNoThresholdCheck(i, i2);
    }

    @Override // defpackage.jjj
    public final void c() {
        this.a.stopScroll();
    }
}
