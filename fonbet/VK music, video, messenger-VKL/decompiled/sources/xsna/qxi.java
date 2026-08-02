package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.push.pushsdk.VkpnsPushConfig;

/* compiled from: ConfigModule.kt */
/* loaded from: classes.dex */
public final class qxi {
    public static final qxi a = new qxi();
    public static volatile VkpnsPushConfig b;
    public static bpn0 c;

    public static final iul0 a() {
        bpn0 bpn0Var = c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (iul0) bpn0Var.getValue();
    }

    public static VkpnsPushConfig b() {
        VkpnsPushConfig vkpnsPushConfig = b;
        if (vkpnsPushConfig != null) {
            return vkpnsPushConfig;
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }

    public tfx c(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("kidsCollection.addAudio", new up(17), new iq(15));
        tfx.l(tfxVar, "audio_id", i, 0, 0, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx d(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("kidsCollection.addPlaylist", new cq(16), new dq(16));
        tfx.l(tfxVar, "playlist_id", i, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx e(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("kidsCollection.addPodcast", new jq(19), new kq(20));
        tfx.l(tfxVar, "podcast_id", i, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx f(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("kidsCollection.removePlaylist", new vp(21), new wp(18));
        tfx.l(tfxVar, "playlist_id", i, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx g(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("kidsCollection.restoreAudio", new lq(19), new mq(20));
        tfx.l(tfxVar, "audio_id", i, 0, 0, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }
}
