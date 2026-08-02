package xsna;

import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import com.vk.settings.impl.presentation.base.fragment.stories.StoriesNotificationSettingFragment;

/* compiled from: BookingAnalyticsClassHolder.kt */
/* loaded from: classes.dex */
public final class mp7 extends fqa {
    public final /* synthetic */ int c;

    public /* synthetic */ mp7(int i) {
        this.c = i;
    }

    @Override // xsna.fqa
    public final Class f() {
        switch (this.c) {
            case 0:
                return BookingEditScreenFragment.class;
            case 1:
                return CommunityProfileLinksFragment.class;
            default:
                return StoriesNotificationSettingFragment.class;
        }
    }
}
