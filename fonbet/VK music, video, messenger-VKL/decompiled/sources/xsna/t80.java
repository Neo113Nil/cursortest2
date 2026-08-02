package xsna;

import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;

/* compiled from: ActivitiesState.kt */
/* loaded from: classes17.dex */
public interface t80 {
    t80 a(boolean z);

    t80 b();

    boolean c();

    SdkClipActivities d();

    /* compiled from: ActivitiesState.kt */
    public interface a extends t80 {

        /* compiled from: ActivitiesState.kt */
        public static final class b implements a {
            public final SdkClipActivities a;

            public b(SdkClipActivities sdkClipActivities) {
                this.a = sdkClipActivities;
            }

            @Override // xsna.t80
            public final t80 a(boolean z) {
                b bVar = z ? this : null;
                return bVar != null ? bVar : new v80(this.a);
            }

            @Override // xsna.t80
            public final t80 b() {
                return new C3727a(this.a);
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
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Pending(activities=" + this.a + ')';
            }
        }

        /* compiled from: ActivitiesState.kt */
        /* renamed from: xsna.t80$a$a, reason: collision with other inner class name */
        public static final class C3727a implements a {
            public final SdkClipActivities a;

            public C3727a(SdkClipActivities sdkClipActivities) {
                this.a = sdkClipActivities;
            }

            @Override // xsna.t80
            public final t80 a(boolean z) {
                C3727a c3727a = z ? this : null;
                return c3727a != null ? c3727a : new u80(this.a);
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
                return (obj instanceof C3727a) && epx.f(this.a, ((C3727a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Displayed(activities=" + this.a + ')';
            }

            @Override // xsna.t80
            public final t80 b() {
                return this;
            }
        }
    }
}
