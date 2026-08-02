package xsna;

import com.vk.lists.RecyclerPaginatedView;

/* compiled from: LegacyUpdatePaddingRoundedCardAction.kt */
@ozl
/* loaded from: classes4.dex */
public final class p1z extends gux {
    public final RecyclerPaginatedView a;
    public final boolean b;

    public p1z(RecyclerPaginatedView recyclerPaginatedView, boolean z) {
        this.a = recyclerPaginatedView;
        this.b = z;
    }

    @Override // xsna.gux
    public final void a() {
        gjf0.f(this.a, this.b ? cn70.b(8) : 0, true, false, false);
    }
}
