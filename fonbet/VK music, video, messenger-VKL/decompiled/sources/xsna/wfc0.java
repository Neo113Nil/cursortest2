package xsna;

import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$AddAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$BestFriendEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ChangeOwnerEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ClickAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$CropPhotoClickEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$CropPhotoEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$DraftEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$EditAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$MentionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ParsedLinksEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PhotoAdditionalInfo;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PhotoSizes;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PosterEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PrimaryModeEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$RemoteDraftEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$SettingsEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: PostingFromNewsfeedAnalyticsImpl.kt */
/* loaded from: classes4.dex */
public final class wfc0 implements vfc0 {
    @Override // xsna.vfc0
    public final void a(long j) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FEED;
        MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent = null;
        MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent = null;
        MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent = null;
        MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent = null;
        MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes = null;
        MobileOfficialAppsConPostingStat$CropPhotoEvent mobileOfficialAppsConPostingStat$CropPhotoEvent = null;
        MobileOfficialAppsConPostingStat$CropPhotoClickEvent mobileOfficialAppsConPostingStat$CropPhotoClickEvent = null;
        MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo = null;
        MobileOfficialAppsConPostingStat$MentionEvent mobileOfficialAppsConPostingStat$MentionEvent = null;
        MobileOfficialAppsConPostingStat$PosterEvent mobileOfficialAppsConPostingStat$PosterEvent = null;
        MobileOfficialAppsConPostingStat$DraftEvent mobileOfficialAppsConPostingStat$DraftEvent = null;
        MobileOfficialAppsConPostingStat$RemoteDraftEvent mobileOfficialAppsConPostingStat$RemoteDraftEvent = null;
        MobileOfficialAppsConPostingStat$BestFriendEvent mobileOfficialAppsConPostingStat$BestFriendEvent = null;
        MobileOfficialAppsConPostingStat$ParsedLinksEvent mobileOfficialAppsConPostingStat$ParsedLinksEvent = null;
        MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent = null;
        MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent = null;
        Integer num = null;
        MobileOfficialAppsConPostingStat$TypePostingItem.PostType postType = null;
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsConPostingStat$TypePostingItem(mobileOfficialAppsCoreNavStat$EventScreen, new MobileOfficialAppsConPostingStat$ChangeOwnerEvent(MobileOfficialAppsConPostingStat$ChangeOwnerEvent.ChangeOwnerType.CHANGE_OWNER), mobileOfficialAppsConPostingStat$NavigationEvent, mobileOfficialAppsConPostingStat$ClickAttachmentEvent, mobileOfficialAppsConPostingStat$AddAttachmentEvent, mobileOfficialAppsConPostingStat$SettingsEvent, mobileOfficialAppsConPostingStat$PhotoSizes, mobileOfficialAppsConPostingStat$CropPhotoEvent, mobileOfficialAppsConPostingStat$CropPhotoClickEvent, mobileOfficialAppsConPostingStat$PhotoAdditionalInfo, mobileOfficialAppsConPostingStat$MentionEvent, mobileOfficialAppsConPostingStat$PosterEvent, mobileOfficialAppsConPostingStat$DraftEvent, mobileOfficialAppsConPostingStat$RemoteDraftEvent, mobileOfficialAppsConPostingStat$BestFriendEvent, mobileOfficialAppsConPostingStat$ParsedLinksEvent, mobileOfficialAppsConPostingStat$PrimaryModeEvent, mobileOfficialAppsConPostingStat$EditAttachmentEvent, num, Long.valueOf(j), postType, MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_PLUS_BUTTON, null, null, 14155772, null), 2)).q();
    }
}
