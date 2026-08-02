package xsna;

import com.vk.clips.sdk.models.SdkActionLink;

/* compiled from: SdkAdsViewerClick.kt */
/* loaded from: classes17.dex */
public interface gih0 {

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class a implements gih0 {
        public final SdkActionLink a;
        public final ju0 b;

        public a(SdkActionLink sdkActionLink, ju0 ju0Var) {
            this.a = sdkActionLink;
            this.b = ju0Var;
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

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionButtonClick(actionButton=" + this.a + ", model=" + this.b + ')';
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class b implements gih0 {
        public final ju0 a;

        public b(ju0 ju0Var) {
            this.a = ju0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CardButtonClicked(model=" + this.a + ')';
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class c implements gih0 {
        public final ju0 a;

        public c(ju0 ju0Var) {
            this.a = ju0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CardClicked(model=" + this.a + ')';
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class d implements gih0 {
        public final ju0 a;

        public d(ju0 ju0Var) {
            this.a = ju0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CardImpression(model=" + this.a + ')';
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class e implements gih0 {
        public final ju0 a;

        public e(ju0 ju0Var) {
            this.a = ju0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DeeplinkClicked(model=" + this.a + ')';
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class f implements gih0 {
        public final ju0 a;

        public f(ju0 ju0Var) {
            this.a = ju0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DescriptionExpandClick(model=" + this.a + ')';
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class g implements gih0 {
        public final ju0 a;

        public g(ju0 ju0Var) {
            this.a = ju0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Impression(model=" + this.a + ')';
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public interface h extends gih0 {

        /* compiled from: SdkAdsViewerClick.kt */
        public static final class a implements h {
            public final ju0 a;

            public a(ju0 ju0Var) {
                this.a = ju0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            @Override // xsna.gih0
            public final ju0 getModel() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AdvInfo(model=" + this.a + ')';
            }
        }

        /* compiled from: SdkAdsViewerClick.kt */
        public static final class b implements h {
            public final ju0 a;

            public b(ju0 ju0Var) {
                this.a = ju0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            @Override // xsna.gih0
            public final ju0 getModel() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ComplainClick(model=" + this.a + ')';
            }
        }

        /* compiled from: SdkAdsViewerClick.kt */
        public static final class c implements h {
            public final ju0 a;

            public c(ju0 ju0Var) {
                this.a = ju0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            @Override // xsna.gih0
            public final ju0 getModel() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ERIDCopy(model=" + this.a + ')';
            }
        }

        /* compiled from: SdkAdsViewerClick.kt */
        public static final class d implements h {
            public final ju0 a;

            public d(ju0 ju0Var) {
                this.a = ju0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            @Override // xsna.gih0
            public final ju0 getModel() {
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

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class i implements gih0 {
        public static final i a = new i();
        public static final ju0 b = new ju0(null, null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return b;
        }

        public final int hashCode() {
            return -676205023;
        }

        public final String toString() {
            return "OnError";
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class j implements gih0 {
        public final ju0 a;

        public j(ju0 ju0Var) {
            this.a = ju0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ProfileClick(model=" + this.a + ')';
        }
    }

    /* compiled from: SdkAdsViewerClick.kt */
    public static final class k implements gih0 {
        public final ju0 a;

        public k(ju0 ju0Var) {
            this.a = ju0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        @Override // xsna.gih0
        public final ju0 getModel() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StartAd(model=" + this.a + ')';
        }
    }

    ju0 getModel();
}
