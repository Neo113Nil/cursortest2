package xsna;

import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;

/* compiled from: AdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class sz0 implements AdsItemViewEvent {
    public final String b;

    public sz0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz0) && epx.f(this.b, ((sz0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("LinkClicked(url="), this.b, ')');
    }
}
