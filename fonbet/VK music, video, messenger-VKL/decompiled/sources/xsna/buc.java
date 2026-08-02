package xsna;

import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.NoWhenBranchMatchedException;
import xsna.ajh0;

/* compiled from: ClipEditSdkSuggestsAnalyticsDelegate.kt */
/* loaded from: classes17.dex */
public final class buc implements zih0 {
    public final ImmutableClipState a;
    public final irk0 b;

    public buc(ImmutableClipState immutableClipState, irk0 irk0Var) {
        this.a = immutableClipState;
        this.b = irk0Var;
    }

    @Override // xsna.zih0
    public final void a(ajh0 ajh0Var) {
        if (!(ajh0Var instanceof ajh0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        ImmutableClipState immutableClipState = this.a;
        Integer m = arm0.m(10, immutableClipState.b);
        new xee0(c, null, new MobileOfficialAppsClipsStat$TypeClipsClipItem(m != null ? m.intValue() : 0, immutableClipState.c.b, immutableClipState.n), MobileOfficialAppsClipsStat$TypeClipEditItem.EventType.SELECT_HASHTAG_TREND_HINT, this.b).q();
    }
}
