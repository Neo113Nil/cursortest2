package xsna;

import com.vk.libvideo.devnull.VideoTechEventType;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import org.chromium.net.NetError;

/* compiled from: VideoTechPlayerWastedEventBuilder.kt */
/* loaded from: classes2.dex */
public final class ojt0 extends l5m {
    public final m7q h;
    public final PlayerType i;
    public final String j;

    public ojt0(m7q m7qVar, PlayerType playerType, String str) {
        super(null, null, 3);
        this.h = m7qVar;
        this.i = playerType;
        this.j = str;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        String h = DevNullEventKey.VIDEO_TECH.h();
        String h2 = VideoTechEventType.VIDEO_TECH_WASTED_PLAYER.h();
        gpt0 gpt0Var = gpt0.a;
        m7q m7qVar = this.h;
        String h3 = gpt0.h(m7qVar);
        String obj = this.i.toString();
        String str = this.j;
        if (str == null) {
            str = m7qVar.r;
        }
        this.g = new SchemeStat$TypeDevNullItem(h, null, h2, null, h3, null, obj, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
        return super.p();
    }
}
