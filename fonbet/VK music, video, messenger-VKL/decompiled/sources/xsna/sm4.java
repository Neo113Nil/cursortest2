package xsna;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.dto.common.id.UserId;

/* compiled from: AudioDeletePlaylist.java */
/* loaded from: classes14.dex */
public final class sm4 extends xsg0 {
    public sm4() {
        super("friends.markNewRecommendationsAsViewed");
    }

    public sm4(String str, String str2) {
        super("notifications.trackPushInteraction");
        K(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT, str);
        K("interaction_type", str2);
    }

    public sm4(int i, UserId userId, UserId userId2) {
        super("video.delete");
        F(userId, "owner_id");
        C(i, "video_id");
        F(userId2, "target_id");
    }

    public sm4(int i, UserId userId) {
        super("audio.deletePlaylist");
        C(i, "playlist_id");
        F(userId, "owner_id");
    }
}
