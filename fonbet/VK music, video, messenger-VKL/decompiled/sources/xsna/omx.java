package xsna;

import android.util.Size;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.model.FrameSize;

/* compiled from: InternalStatInfo.kt */
/* loaded from: classes8.dex */
public final class omx {
    public final fgq a;
    public final pjz b;
    public final Long c;
    public final uwc0 d;
    public final FrameSize e;
    public final boolean f;
    public final long g;
    public final String h;
    public final String i;
    public final nwk j;
    public final cnh k;
    public final k5h l;

    public omx(OneVideoPlayer oneVideoPlayer, fgq fgqVar, pjz pjzVar, Long l, uwc0 uwc0Var) {
        long j;
        String str;
        cms0 cms0Var;
        this.a = fgqVar;
        this.b = pjzVar;
        this.c = l;
        this.d = uwc0Var;
        one.video.player.tracks.c E = oneVideoPlayer.E();
        String str2 = null;
        this.e = (E == null || (cms0Var = (cms0) E.c) == null) ? null : cms0Var.b();
        this.f = oneVideoPlayer.J() != null;
        boolean z = oneVideoPlayer instanceof BaseVideoPlayer;
        if (z) {
            vw3 vw3Var = BaseVideoPlayer.H;
            j = ((BaseVideoPlayer) oneVideoPlayer).h(false);
        } else {
            j = 100;
        }
        this.g = j;
        BaseVideoPlayer baseVideoPlayer = z ? (BaseVideoPlayer) oneVideoPlayer : null;
        if (baseVideoPlayer != null) {
            baseVideoPlayer.verifyThread("one.video.player.BaseVideoPlayer.getVideoDecoderNameString");
            str = baseVideoPlayer.j;
        } else {
            str = null;
        }
        this.h = str;
        BaseVideoPlayer baseVideoPlayer2 = z ? (BaseVideoPlayer) oneVideoPlayer : null;
        if (baseVideoPlayer2 != null) {
            baseVideoPlayer2.verifyThread("one.video.player.BaseVideoPlayer.getAudioDecoderNameString");
            str2 = baseVideoPlayer2.k;
        }
        this.i = str2;
        this.j = new nwk(oneVideoPlayer, 13);
        this.k = new cnh(oneVideoPlayer, 16);
        this.l = new k5h(oneVideoPlayer, 24);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InternalStatInfo(" + this.e);
        pjz pjzVar = this.b;
        if (pjzVar != null) {
            Long l = pjzVar.a;
            long j = pjzVar.b;
            if (l != null) {
                sb.append(", latency= " + l.longValue());
            }
            if (j > 0) {
                sb.append(", buffer_latency= " + j);
            }
        }
        Long l2 = this.c;
        if (l2 != null) {
            long longValue = l2.longValue();
            if (longValue != 0) {
                sb.append(", live_seek= " + longValue);
            }
        }
        sb.append(", vfpo= " + this.g);
        String str = this.h;
        if (str != null) {
            sb.append(", vcodec= ".concat(str));
        }
        String str2 = this.i;
        if (str2 != null) {
            sb.append(", acodec= ".concat(str2));
        }
        fgq fgqVar = this.a;
        if (fgqVar != null) {
            sb.append(", extra= " + fgqVar);
        }
        uwc0 uwc0Var = this.d;
        if (uwc0Var != null) {
            sb.append(", power= " + uwc0Var);
        }
        ik80 x = ((OneVideoPlayer) this.j.c).x();
        if (x != null) {
            sb.append(", bw= " + x.getBitrateEstimate());
            sb.append(", rtt= " + x.a());
        }
        Size f = ((OneVideoPlayer) this.k.c).f();
        if (f != null) {
            sb.append(", vport= " + f);
        }
        ymo L = ((OneVideoPlayer) this.l.c).L();
        if (L != null) {
            sb.append(", rendered_f= " + L.a);
            sb.append(", dropped_f= " + L.b);
            sb.append(", max_consecutive_dropped_f= " + L.e);
            sb.append(", skipped_f= " + L.d);
            sb.append(", dropped_to_keyframe= " + L.c);
        }
        sb.append(")");
        return sb.toString();
    }
}
