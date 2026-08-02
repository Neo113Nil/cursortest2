package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.ny61;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            ny61.g("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            ny61.g("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        RecyclerView.e eVar = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || eVar == null || !eVar.C) {
            return;
        }
        if (z) {
            if (!recyclerView.mAdapterHelper.i()) {
                eVar.N(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            eVar.M(this.a, this.b, recyclerView.mState, this);
        }
        int i = this.d;
        if (i > eVar.D) {
            eVar.D = i;
            eVar.E = z;
            recyclerView.mRecycler.p();
        }
    }
}
