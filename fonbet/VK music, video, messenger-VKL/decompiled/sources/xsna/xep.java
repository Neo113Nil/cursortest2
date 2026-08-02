package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;
import one.video.statistics.ContentType;

/* compiled from: EmptyBufferEventBuilder.kt */
/* loaded from: classes3.dex */
public final class xep extends l5m {
    public final g4b0 h;
    public final OneVideoPlayer i;
    public final long j;
    public final boolean k;
    public final dk80 l;

    public xep(g4b0 g4b0Var, OneVideoPlayer oneVideoPlayer, long j, boolean z, dk80 dk80Var) {
        super(null, null, 3);
        this.h = g4b0Var;
        this.i = oneVideoPlayer;
        this.j = j;
        this.k = z;
        this.l = dk80Var;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        cms0 cms0Var;
        FrameSize b;
        dk80 dk80Var = this.l;
        Integer valueOf = dk80Var != null ? Integer.valueOf(dk80Var.m) : null;
        String str = (valueOf != null && valueOf.intValue() == 1) ? "video" : (valueOf != null && valueOf.intValue() == 2) ? "live" : (valueOf != null && valueOf.intValue() == 3) ? "clip" : (valueOf != null && valueOf.intValue() == 0) ? "gif" : (valueOf != null && valueOf.intValue() == 4) ? "cover" : (valueOf != null && valueOf.intValue() == 5) ? "message" : (valueOf != null && valueOf.intValue() == 6) ? com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS : (valueOf != null && valueOf.intValue() == 7) ? "story" : "other";
        String h = (this.k ? DevNullEventKey.VIDEO_EMPTY_BUFFER_CLOSE : DevNullEventKey.VIDEO_EMPTY_BUFFER).h();
        int i = (int) this.j;
        OneVideoPlayer oneVideoPlayer = this.i;
        int i2 = oneVideoPlayer.J() == null ? 0 : 1;
        one.video.player.tracks.c E = oneVideoPlayer.E();
        String name = (E == null || (cms0Var = (cms0) E.c) == null || (b = cms0Var.b()) == null) ? null : b.name();
        g4b0 g4b0Var = this.h;
        ContentType contentType = g4b0Var.e;
        this.g = new SchemeStat$TypeDevNullItem(h, null, null, Integer.valueOf(i), str, Integer.valueOf(i2), name, null, contentType != null ? contentType.name() : null, null, g4b0Var.d, null, dk80Var != null ? Integer.valueOf(dk80Var.k).toString() : null, null, dk80Var != null ? Long.valueOf(dk80Var.l).toString() : null, null, g4b0Var.b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -87418, 3, null);
        return super.p();
    }
}
