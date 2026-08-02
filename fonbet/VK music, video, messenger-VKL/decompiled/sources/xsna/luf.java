package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;

/* compiled from: ClipsWrapperTrackTabEvent.kt */
/* loaded from: classes17.dex */
public final class luf implements km50 {
    public final ClipFeedTab b;

    public luf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luf) && epx.f(this.b, ((luf) obj).b);
    }

    public final int hashCode() {
        ClipFeedTab clipFeedTab = this.b;
        if (clipFeedTab == null) {
            return 0;
        }
        return clipFeedTab.hashCode();
    }

    public final String toString() {
        return "ClipsWrapperTrackTabEvent(trackingTab=" + this.b + ')';
    }

    public luf(ClipFeedTab clipFeedTab) {
        this.b = clipFeedTab;
    }
}
