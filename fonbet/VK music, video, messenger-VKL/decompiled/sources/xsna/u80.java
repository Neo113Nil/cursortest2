package xsna;

import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;
import xsna.t80;

/* compiled from: ActivitiesState.kt */
/* loaded from: classes17.dex */
public final class u80 implements t80 {
    public final SdkClipActivities a;

    public u80(SdkClipActivities sdkClipActivities) {
        this.a = sdkClipActivities;
    }

    @Override // xsna.t80
    public final t80 a(boolean z) {
        u80 u80Var = !z ? this : null;
        return u80Var != null ? u80Var : new t80.a.C3727a(this.a);
    }

    @Override // xsna.t80
    public final boolean c() {
        return true;
    }

    @Override // xsna.t80
    public final SdkClipActivities d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u80) && epx.f(this.a, ((u80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Shown(activities=" + this.a + ')';
    }

    @Override // xsna.t80
    public final t80 b() {
        return this;
    }
}
