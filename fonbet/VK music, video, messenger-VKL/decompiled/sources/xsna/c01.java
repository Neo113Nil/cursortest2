package xsna;

import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;

/* compiled from: AdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class c01 implements AdsItemViewEvent {
    public final j4b0 b;

    public c01(j4b0 j4b0Var) {
        this.b = j4b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c01) && epx.f(this.b, ((c01) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return br.c(new StringBuilder("OnComplete(playerState="), this.b, ')');
    }
}
