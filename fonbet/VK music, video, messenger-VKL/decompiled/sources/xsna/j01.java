package xsna;

import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;

/* compiled from: AdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class j01 implements AdsItemViewEvent {
    public final hz0 b;

    public j01(hz0 hz0Var) {
        this.b = hz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j01) && epx.f(this.b, ((j01) obj).b);
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    public final String toString() {
        return "OnPositionUpdate(positionPointsState=" + this.b + ')';
    }
}
