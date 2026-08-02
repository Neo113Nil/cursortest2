package xsna;

import com.vk.clips.sdk.models.SdkActionLink;

/* compiled from: AdsAnalyticsAction.kt */
/* loaded from: classes17.dex */
public interface yt0 {

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class a implements yt0 {
        public final zt0 a;
        public final SdkActionLink b;

        public a(zt0 zt0Var, SdkActionLink sdkActionLink) {
            this.a = zt0Var;
            this.b = sdkActionLink;
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

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionButtonClick(model=" + this.a + ", actionButton=" + this.b + ')';
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class b implements yt0 {
        public final zt0 a;

        public b(zt0 zt0Var) {
            this.a = zt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CardButtonClicked(model=" + this.a + ')';
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class c implements yt0 {
        public final zt0 a;

        public c(zt0 zt0Var) {
            this.a = zt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CardClicked(model=" + this.a + ')';
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class d implements yt0 {
        public final zt0 a;

        public d(zt0 zt0Var) {
            this.a = zt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CardImpression(model=" + this.a + ')';
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class e implements yt0 {
        public final zt0 a;

        public e(zt0 zt0Var) {
            this.a = zt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DeeplinkClicked(model=" + this.a + ')';
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class f implements yt0 {
        public final zt0 a;

        public f(zt0 zt0Var) {
            this.a = zt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DescriptionExpandClick(model=" + this.a + ')';
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class g implements yt0 {
        public final zt0 a;

        public g(zt0 zt0Var) {
            this.a = zt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Impression(model=" + this.a + ')';
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public interface h extends yt0 {

        /* compiled from: AdsAnalyticsAction.kt */
        public static final class a implements h {
            public final zt0 a;

            public a(zt0 zt0Var) {
                this.a = zt0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            @Override // xsna.yt0
            public final zt0 getModel() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AdvInfo(model=" + this.a + ')';
            }
        }

        /* compiled from: AdsAnalyticsAction.kt */
        public static final class b implements h {
            public final zt0 a;

            public b(zt0 zt0Var) {
                this.a = zt0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            @Override // xsna.yt0
            public final zt0 getModel() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ComplainClick(model=" + this.a + ')';
            }
        }

        /* compiled from: AdsAnalyticsAction.kt */
        public static final class c implements h {
            public final zt0 a;

            public c(zt0 zt0Var) {
                this.a = zt0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            @Override // xsna.yt0
            public final zt0 getModel() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ERIDCopy(model=" + this.a + ')';
            }
        }

        /* compiled from: AdsAnalyticsAction.kt */
        public static final class d implements h {
            public final zt0 a;

            public d(zt0 zt0Var) {
                this.a = zt0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            @Override // xsna.yt0
            public final zt0 getModel() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "NotInterested(model=" + this.a + ')';
            }
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class i implements yt0 {
        public final zt0 a;

        public i(zt0 zt0Var) {
            this.a = zt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ProfileClick(model=" + this.a + ')';
        }
    }

    /* compiled from: AdsAnalyticsAction.kt */
    public static final class j implements yt0 {
        public final zt0 a;

        public j(zt0 zt0Var) {
            this.a = zt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        @Override // xsna.yt0
        public final zt0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StartAd(model=" + this.a + ')';
        }
    }

    zt0 getModel();
}
