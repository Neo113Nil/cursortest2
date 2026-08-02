package xsna;

import android.util.Size;
import com.vk.libvideo.ui.video2.PlayerState;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class wya0 {
    public final PlayerState a;
    public final Size b;
    public final boolean c;
    public final owo0 d;
    public final sox e;
    public final DownloadInfo f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final t6p0 k;
    public final jya0 l;
    public final bwp m;
    public final boolean n;

    public wya0(PlayerState playerState, Size size, boolean z, owo0 owo0Var, sox soxVar, DownloadInfo downloadInfo, boolean z2, boolean z3, boolean z4, boolean z5, t6p0 t6p0Var, jya0 jya0Var, bwp bwpVar, boolean z6) {
        this.a = playerState;
        this.b = size;
        this.c = z;
        this.d = owo0Var;
        this.e = soxVar;
        this.f = downloadInfo;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = t6p0Var;
        this.l = jya0Var;
        this.m = bwpVar;
        this.n = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wya0)) {
            return false;
        }
        wya0 wya0Var = (wya0) obj;
        return this.a == wya0Var.a && epx.f(this.b, wya0Var.b) && this.c == wya0Var.c && epx.f(this.d, wya0Var.d) && epx.f(this.e, wya0Var.e) && epx.f(this.f, wya0Var.f) && this.g == wya0Var.g && this.h == wya0Var.h && this.i == wya0Var.i && this.j == wya0Var.j && epx.f(this.k, wya0Var.k) && epx.f(this.l, wya0Var.l) && epx.f(this.m, wya0Var.m) && this.n == wya0Var.n;
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        owo0 owo0Var = this.d;
        int hashCode = (b + (owo0Var == null ? 0 : owo0Var.hashCode())) * 31;
        sox soxVar = this.e;
        int hashCode2 = (hashCode + (soxVar == null ? 0 : soxVar.hashCode())) * 31;
        DownloadInfo downloadInfo = this.f;
        int hashCode3 = (this.k.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (downloadInfo == null ? 0 : downloadInfo.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31;
        jya0 jya0Var = this.l;
        int hashCode4 = (hashCode3 + (jya0Var == null ? 0 : jya0Var.hashCode())) * 31;
        bwp bwpVar = this.m;
        return Boolean.hashCode(this.n) + ((hashCode4 + (bwpVar != null ? bwpVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState(playerState=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", subtitles=");
        sb.append(this.c);
        sb.append(", timelineImages=");
        sb.append(this.d);
        sb.append(", intervals=");
        sb.append(this.e);
        sb.append(", downloadInfo=");
        sb.append(this.f);
        sb.append(", isActionLinkAvailable=");
        sb.append(this.g);
        sb.append(", isCastConnected=");
        sb.append(this.h);
        sb.append(", isSmartCastConnected=");
        sb.append(this.i);
        sb.append(", isAudioRestricted=");
        sb.append(this.j);
        sb.append(", tooltipsInfo=");
        sb.append(this.k);
        sb.append(", playbackQueueState=");
        sb.append(this.l);
        sb.append(", errorInfo=");
        sb.append(this.m);
        sb.append(", isDraggingEnable=");
        return defpackage.q0.a(sb, this.n, ')');
    }
}
