package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Set;

/* compiled from: ClipsCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class lld implements p9c {
    public final ForegroundEvent a = ForegroundEvent.CLIPS;
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> b = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_CLIP, MobileOfficialAppsCoreNavStat$EventScreen.MY_CLIPS, MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_OWNER_CLIPS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_COMMON_CLIPS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_LIKED_CLIPS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_GRID_DRAFTS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_DISCOVER, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FAVORITES_FOLDERS_LIST, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FAVORITES_FOLDERS_PICKER, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FAVORITES_FOLDER_CONTENT_LIST, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FAVORITES_FOLDER_RENAMING_DIALOG, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_CLIPS_SERVICE});
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> c = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_AUDIO_CROPPER, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_AUDIO_PICKER, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA_DRAFTS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA_SETTINGS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA_TIMER, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_COVER_EDITOR, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_DEEPFAKE_TEMPLATES, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_EDITOR, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_LINK_EDITOR, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_VOICEOVER_EDITOR, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MEDIAPICKER_MEDIA, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MEDIAPICKER_DRAFTS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MEDIAPICKER_TEMPLATES, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MEDIA_PICKER, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_COMMON_SETTINGS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_FRIENDS_AND_FRIENDS_LISTS_PICKER, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_FRIENDS_PICKER, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_VALUE_SETTINGS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_FRAGMENT_SPEED_EDITOR, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PUBLISH, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TEMPLATES_EDITOR});

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        return this.a;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = mt50Var.a;
        return this.b.contains(mobileOfficialAppsCoreNavStat$EventScreen) || this.c.contains(mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
