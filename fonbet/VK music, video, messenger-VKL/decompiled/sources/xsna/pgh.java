package xsna;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: CommunityProfileContentClipsViewHolder.kt */
/* loaded from: classes5.dex */
public final class pgh extends GridLayoutManager.c {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public pgh(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        if (!this.d || i >= 3) {
            return (!this.e || i >= 1) ? 1 : 3;
        }
        return 3;
    }
}
