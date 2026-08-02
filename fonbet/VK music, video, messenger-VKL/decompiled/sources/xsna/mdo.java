package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class mdo implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        DraftShortVideoListView.State state = (DraftShortVideoListView.State) catalogBlockState;
        if (state instanceof DraftShortVideoListView.State.ClipState) {
            DraftShortVideoListView.State.ClipState clipState = (DraftShortVideoListView.State.ClipState) state;
            return new DraftShortVideoListView.d.a(clipState.b, clipState.d);
        }
        if (state instanceof DraftShortVideoListView.State.PlaceholderState) {
            return new DraftShortVideoListView.d.c(((DraftShortVideoListView.State.PlaceholderState) state).b);
        }
        if (state instanceof DraftShortVideoListView.State.LoadingState) {
            return new DraftShortVideoListView.d.b(((DraftShortVideoListView.State.LoadingState) state).b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
