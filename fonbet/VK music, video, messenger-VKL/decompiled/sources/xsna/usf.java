package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;

/* compiled from: ClipsWrapperOpenActionMviState.kt */
/* loaded from: classes17.dex */
public final class usf implements km50 {
    public final a7j<ClipFeedOpenAction> b;

    public usf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usf) && epx.f(this.b, ((usf) obj).b);
    }

    public final int hashCode() {
        a7j<ClipFeedOpenAction> a7jVar = this.b;
        if (a7jVar == null) {
            return 0;
        }
        return a7jVar.hashCode();
    }

    public final String toString() {
        return "ClipsWrapperOpenActionMviState(openAction=" + this.b + ')';
    }

    public usf(a7j<ClipFeedOpenAction> a7jVar) {
        this.b = a7jVar;
    }
}
