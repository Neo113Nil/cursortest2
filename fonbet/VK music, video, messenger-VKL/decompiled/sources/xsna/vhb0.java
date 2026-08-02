package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PodcastMarkAsListened.kt */
/* loaded from: classes15.dex */
public final class vhb0 extends xsg0 {
    public vhb0(UserId userId, int i, String str) {
        super("podcasts.markAsListened");
        F(userId, "owner_id");
        C(i, "episode_id");
        K("ref", str);
    }
}
