package xsna;

import java.util.List;

/* compiled from: CreateMarketItemReviewAction.kt */
/* loaded from: classes18.dex */
public abstract class z7k implements kj50 {

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static abstract class a extends z7k {

        /* compiled from: CreateMarketItemReviewAction.kt */
        /* renamed from: xsna.z7k$a$a, reason: collision with other inner class name */
        public static final class C4161a extends a {
            public static final C4161a b = new C4161a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4161a);
            }

            public final int hashCode() {
                return 99327127;
            }

            public final String toString() {
                return "OnCloseButtonClick";
            }
        }

        /* compiled from: CreateMarketItemReviewAction.kt */
        public static final class b extends a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2037022762;
            }

            public final String toString() {
                return "OnCloseNoButtonClick";
            }
        }

        /* compiled from: CreateMarketItemReviewAction.kt */
        public static final class c extends a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -156594866;
            }

            public final String toString() {
                return "OnCloseYesButtonClick";
            }
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class b extends z7k {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1284612602;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class c extends z7k {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1737347322;
        }

        public final String toString() {
            return "OnBackButtonClick";
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class d extends z7k {
        public final String b;

        public d(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnCommentChanged(newValue="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class e extends z7k {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnConsChanged(newValue="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static abstract class f extends z7k {

        /* compiled from: CreateMarketItemReviewAction.kt */
        public static final class a extends f {
            public final int b;
            public final Integer c;

            public a(int i, Integer num) {
                this.b = i;
                this.c = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.b) * 31;
                Integer num = this.c;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Done(localImageId=");
                sb.append(this.b);
                sb.append(", uploadedPhotoId=");
                return uqi.b(sb, this.c, ')');
            }
        }

        /* compiled from: CreateMarketItemReviewAction.kt */
        public static final class b extends f {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Failed(imageId="), this.b, ')');
            }
        }

        /* compiled from: CreateMarketItemReviewAction.kt */
        public static final class c extends f {
            public final List<String> b;

            public c(List<String> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("OnPhotoSelected(uris="), this.b);
            }
        }

        /* compiled from: CreateMarketItemReviewAction.kt */
        public static final class d extends f {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 837903492;
            }

            public final String toString() {
                return "OnPlaceHolderClick";
            }
        }

        /* compiled from: CreateMarketItemReviewAction.kt */
        public static final class e extends f {
            public final int b;

            public e(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.b == ((e) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnReloadClick(id="), this.b, ')');
            }
        }

        /* compiled from: CreateMarketItemReviewAction.kt */
        /* renamed from: xsna.z7k$f$f, reason: collision with other inner class name */
        public static final class C4162f extends f {
            public final int b;

            public C4162f(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4162f) && this.b == ((C4162f) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnRemoveClick(id="), this.b, ')');
            }
        }

        /* compiled from: CreateMarketItemReviewAction.kt */
        public static final class g extends f {
            public final int b;

            public g(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.b == ((g) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Progress(imageId="), this.b, ')');
            }
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class g extends z7k {
        public final String b;

        public g(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnProsChanged(newValue="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class h extends z7k {
        public final float b;

        public h(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Float.compare(this.b, ((h) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("OnRatingChanged(rating="));
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class i extends z7k {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -262355015;
        }

        public final String toString() {
            return "OnSendButtonClick";
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class j extends z7k {
        public final boolean b;

        public j(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnShowBottomBarChanged(isVisible="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class k extends z7k {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -549277016;
        }

        public final String toString() {
            return "OnSuccessButtonClick";
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class l extends z7k {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1065313778;
        }

        public final String toString() {
            return "OnSuccessFAQButtonClick";
        }
    }

    /* compiled from: CreateMarketItemReviewAction.kt */
    public static final class m extends z7k {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 123418956;
        }

        public final String toString() {
            return "ShowUserAgreement";
        }
    }
}
