package xsna;

import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: AdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class e01 implements AdsItemViewEvent {
    public final j4b0 b;
    public final int c;
    public final OneVideoPlaybackException.ErrorCode d;
    public final Throwable e;

    public e01(j4b0 j4b0Var, int i, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        this.b = j4b0Var;
        this.c = i;
        this.d = errorCode;
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e01)) {
            return false;
        }
        e01 e01Var = (e01) obj;
        return this.b.equals(e01Var.b) && this.c == e01Var.c && this.d == e01Var.d && epx.f(this.e, e01Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31)) * 31;
        Throwable th = this.e;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnError(playerState=");
        sb.append(this.b);
        sb.append(", errorTitleRes=");
        sb.append(this.c);
        sb.append(", errorCode=");
        sb.append(this.d);
        sb.append(", error=");
        return oq.c(sb, this.e, ')');
    }
}
