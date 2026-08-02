package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.ui.PrivacyViewState;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: PrivacyViewStateMapper.kt */
/* loaded from: classes4.dex */
public final class wfd0 {
    public static PrivacyViewState a(PostingState.Editing editing) {
        PrivacyPostType privacyPostType = editing.i.i;
        boolean z = editing.l.i instanceof ActionsAvailabilityState.Availability.Available;
        tlo0.f h = tq.h(tlo0.Companion, R.string.privacy_settings_menu_description);
        Integer valueOf = privacyPostType instanceof PrivacyPostType.AllUsers ? Integer.valueOf(R.string.privacy_settings_visible_all) : privacyPostType instanceof PrivacyPostType.FriendsOnly ? Integer.valueOf(R.string.privacy_settings_visible_friends) : privacyPostType instanceof PrivacyPostType.BestFriends ? Integer.valueOf(R.string.privacy_settings_visible_best_friends) : null;
        return new PrivacyViewState(h, valueOf != null ? new tlo0.f(valueOf.intValue()) : null, PrivacyViewState.RightAction.Open, z, false);
    }
}
