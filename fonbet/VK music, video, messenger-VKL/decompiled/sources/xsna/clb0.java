package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PodcastsService.kt */
/* loaded from: classes.dex */
public final class clb0 implements blb0 {
    public final tfx d(UserId userId, String str) {
        tfx tfxVar = new tfx("podcasts.getGroupInfo", new zq(23), new com.vk.movika.sdk.android.defaultplayer.interactive.c(24));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }
}
