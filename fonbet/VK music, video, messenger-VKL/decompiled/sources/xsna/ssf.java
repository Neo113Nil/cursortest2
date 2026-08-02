package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;

/* compiled from: ClipsWrapperOpenActionEvent.kt */
/* loaded from: classes17.dex */
public final class ssf {
    public final ClipFeedOpenAction a;

    public ssf(ClipFeedOpenAction clipFeedOpenAction) {
        this.a = clipFeedOpenAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssf) && epx.f(this.a, ((ssf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClipsWrapperOpenActionEvent(openAction=" + this.a + ')';
    }
}
