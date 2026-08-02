package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;

/* compiled from: ClipCtaWithDonutMviEvent.kt */
/* loaded from: classes16.dex */
public final class lpc implements mpc {
    public final ClipInvolvementActionButton<?> a;

    public lpc(ClipInvolvementActionButton<?> clipInvolvementActionButton) {
        this.a = clipInvolvementActionButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lpc) && epx.f(this.a, ((lpc) obj).a);
    }

    public final int hashCode() {
        ClipInvolvementActionButton<?> clipInvolvementActionButton = this.a;
        if (clipInvolvementActionButton == null) {
            return 0;
        }
        return clipInvolvementActionButton.hashCode();
    }

    public final String toString() {
        return "ReturnData(selectedAttach=" + this.a + ')';
    }
}
