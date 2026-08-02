package xsna;

import com.vk.clips.sdk.shared.feed.recycler.manager.ClipsFeedLinearLayoutManager;

/* compiled from: ClipsFeedRecyclerView.kt */
/* loaded from: classes17.dex */
public final class q8e extends b0n {
    private final ClipsFeedLinearLayoutManager getLm() {
        return (ClipsFeedLinearLayoutManager) getLayoutManager();
    }

    public final void c(int i, boolean z) {
        if (!z) {
            getLm().K(i, 0);
        } else {
            getLm().r = new xev(i);
        }
    }
}
