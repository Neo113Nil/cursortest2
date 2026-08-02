package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.id.UserId;

/* compiled from: AdsItemEvent.kt */
/* loaded from: classes17.dex */
public interface xw0 {

    /* compiled from: AdsItemEvent.kt */
    public static final class a implements xw0 {
        public final SdkClipVideoFile a;
        public final kih0 b;

        public a(SdkClipVideoFile sdkClipVideoFile, kih0 kih0Var) {
            this.a = sdkClipVideoFile;
            this.b = kih0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ConfirmRestriction(clip=" + this.a + ", autoPlay=" + this.b + ')';
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class b implements xw0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 763182687;
        }

        public final String toString() {
            return "DisableCinemaMode";
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class c implements xw0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1558104434;
        }

        public final String toString() {
            return "InterceptLinkCommunityWithSubscribeClick";
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class d implements xw0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2067004869;
        }

        public final String toString() {
            return "MyTargetActionButtonClicked";
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class e implements xw0 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MyTargetExternalNavigation(adAttribution="), this.a, ')');
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class f implements xw0 {
        public final SdkClipVideoFile a;

        public f(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OnBind(clip="), this.a, ')');
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class g implements xw0 {
        public final kih0 a;

        public g(kih0 kih0Var) {
            this.a = kih0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ReplayAds(autoPlay=" + this.a + ')';
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class h implements xw0 {
        public final kih0 a;

        public h(kih0 kih0Var) {
            this.a = kih0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ResetCompletedState(autoPlay=" + this.a + ')';
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class i implements xw0 {
        public final kih0 a;

        public i(kih0 kih0Var) {
            this.a = kih0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ResetErrorState(autoPlay=" + this.a + ')';
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public interface j extends xw0 {

        /* compiled from: AdsItemEvent.kt */
        public static final class a implements j {
            public final UserId a;

            public a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("SubscriptionSuccess(ownerId="), this.a, ')');
            }
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public interface k extends xw0 {

        /* compiled from: AdsItemEvent.kt */
        public static final class a implements k {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
            }
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public interface l extends xw0 {

        /* compiled from: AdsItemEvent.kt */
        public static final class a implements l {
            public final nlh0 a;

            public a(nlh0 nlh0Var) {
                this.a = nlh0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Owner(controller=" + this.a + ')';
            }
        }

        /* compiled from: AdsItemEvent.kt */
        public static final class b implements l {
            public final nlh0 a;
            public final String b;

            public b(nlh0 nlh0Var, String str) {
                this.a = nlh0Var;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OwnerFromActionButton(controller=");
                sb.append(this.a);
                sb.append(", adAttribution=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class m implements xw0 {
        public final SdkClipVideoFile a;

        public m(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("ToggleMute(clip="), this.a, ')');
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public static final class n implements xw0 {
        public final kih0 a;
        public final wp50 b;

        public n(kih0 kih0Var, wp50 wp50Var) {
            this.a = kih0Var;
            this.b = wp50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            wp50 wp50Var = this.b;
            return hashCode + (wp50Var == null ? 0 : wp50Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TogglePlay(autoPlay=");
            sb.append(this.a);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.b, ')');
        }
    }

    /* compiled from: AdsItemEvent.kt */
    public interface o extends xw0 {

        /* compiled from: AdsItemEvent.kt */
        public static final class a implements o {
            public final nlh0 a;

            public a(nlh0 nlh0Var) {
                this.a = nlh0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Owner(controller=" + this.a + ')';
            }
        }
    }
}
