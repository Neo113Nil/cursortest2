package xsna;

import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;
import xsna.t80;

/* compiled from: ActivitiesState.kt */
/* loaded from: classes17.dex */
public final class v80 implements t80 {
    public final SdkClipActivities a;

    public v80(SdkClipActivities sdkClipActivities) {
        this.a = sdkClipActivities;
    }

    @Override // xsna.t80
    public final t80 a(boolean z) {
        v80 v80Var = !z ? this : null;
        return v80Var != null ? v80Var : new t80.a.b(this.a);
    }

    @Override // xsna.t80
    public final t80 b() {
        return new u80(this.a);
    }

    @Override // xsna.t80
    public final boolean c() {
        return false;
    }

    @Override // xsna.t80
    public final SdkClipActivities d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v80) && epx.f(this.a, ((v80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unshown(activities=" + this.a + ')';
    }
}
