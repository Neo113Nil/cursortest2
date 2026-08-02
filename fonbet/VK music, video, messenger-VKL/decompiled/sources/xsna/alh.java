package xsna;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: CommunityProfileContentServicesViewHolder.kt */
/* loaded from: classes5.dex */
public final class alh extends GridLayoutManager.c {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public alh(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        boolean z = this.e;
        boolean z2 = this.d;
        return ((z || z2) && i <= ((!z2 || !z) ? (!z2 || z) ? 2 : 1 : 3)) ? 2 : 1;
    }
}
