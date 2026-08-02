package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: AudioSearch.java */
/* loaded from: classes14.dex */
public final class dx4 extends pug0 {
    public dx4(String str, @Nullable String str2) {
        this(0, 100, UserId.d, str, str2);
    }

    public dx4(int i, int i2, UserId userId, String str, @Nullable String str2) {
        super("audio.search", MusicTrack.e0);
        K(CampaignEx.JSON_KEY_AD_Q, str);
        C(1, "search_own");
        C(0, "performer_only");
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        if (str2 != null) {
            K("ref", str2);
        }
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
    }
}
