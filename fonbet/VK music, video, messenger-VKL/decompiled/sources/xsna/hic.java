package xsna;

import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: ClearRippleEffectAction.kt */
/* loaded from: classes4.dex */
public final class hic extends gux {
    public final UsableRecyclerView a;

    public hic(UsableRecyclerView usableRecyclerView) {
        this.a = usableRecyclerView;
    }

    @Override // xsna.gux
    public final void a() {
        this.a.setSelectorBoundsProvider(null);
    }
}
