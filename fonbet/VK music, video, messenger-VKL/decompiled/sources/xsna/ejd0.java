package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import com.vk.ecomm.market.good.good2.presentation.restrictions.ProductCardRestrictions;
import java.util.List;

/* compiled from: ProductCardAction.kt */
/* loaded from: classes18.dex */
public interface ejd0 extends lj50 {

    /* compiled from: ProductCardAction.kt */
    public interface a extends ejd0 {

        /* compiled from: ProductCardAction.kt */
        /* renamed from: xsna.ejd0$a$a, reason: collision with other inner class name */
        public static final class C2815a implements a {
            public static final C2815a b = new C2815a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2815a);
            }

            public final int hashCode() {
                return -2135749627;
            }

            public final String toString() {
                return "OnCreatePostClicked";
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1862282667;
            }

            public final String toString() {
                return "OnDataLoaded";
            }
        }
    }

    /* compiled from: ProductCardAction.kt */
    public interface b extends ejd0 {

        /* compiled from: ProductCardAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1721379518;
            }

            public final String toString() {
                return "ClickGoToShop";
            }
        }

        /* compiled from: ProductCardAction.kt */
        /* renamed from: xsna.ejd0$b$b, reason: collision with other inner class name */
        public static final class C2816b implements b {
            public static final C2816b b = new C2816b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2816b);
            }

            public final int hashCode() {
                return 783533114;
            }

            public final String toString() {
                return "ClickOpenCommunity";
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class c implements b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1451165133;
            }

            public final String toString() {
                return "ClickShopConditions";
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class d implements b {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1149765051;
            }

            public final String toString() {
                return "ClickSubscribe";
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class e implements b {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1117615290;
            }

            public final String toString() {
                return "ClickSubscribers";
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class f implements b {
            public final AdminLeaveAction b;

            public f(AdminLeaveAction adminLeaveAction) {
                this.b = adminLeaveAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.b == ((f) obj).b;
            }

            public final int hashCode() {
                AdminLeaveAction adminLeaveAction = this.b;
                if (adminLeaveAction == null) {
                    return 0;
                }
                return adminLeaveAction.hashCode();
            }

            public final String toString() {
                return "DoUnsubscribe(adminLeaveAction=" + this.b + ')';
            }
        }
    }

    /* compiled from: ProductCardAction.kt */
    public interface c extends ejd0 {

        /* compiled from: ProductCardAction.kt */
        public static final class a implements c {
            public final d210 b;

            public a(d210 d210Var) {
                this.b = d210Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Loaded(data=" + this.b + ')';
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 115810147;
            }

            public final String toString() {
                return "Refresh";
            }
        }

        /* compiled from: ProductCardAction.kt */
        /* renamed from: xsna.ejd0$c$c, reason: collision with other inner class name */
        public static final class C2817c implements c {
            public final ProductCardRestrictions b;

            public C2817c(ProductCardRestrictions productCardRestrictions) {
                this.b = productCardRestrictions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2817c) && this.b == ((C2817c) obj).b;
            }

            public final int hashCode() {
                ProductCardRestrictions productCardRestrictions = this.b;
                if (productCardRestrictions == null) {
                    return 0;
                }
                return productCardRestrictions.hashCode();
            }

            public final String toString() {
                return "RestrictionsUpdated(restrictions=" + this.b + ')';
            }
        }
    }

    /* compiled from: ProductCardAction.kt */
    public interface d extends ejd0 {

        /* compiled from: ProductCardAction.kt */
        public static final class a implements d {
            public final int b;

            public a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ChangePhotoViewerPosition(photoPosition="), this.b, ')');
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class b implements d {
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
                return vu5.b(new StringBuilder("ChangePosition(position="), this.b, ')');
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class c implements d {
            public final ProductGalleryItem.Type b;
            public final int c;

            public c(ProductGalleryItem.Type type, int i) {
                this.b = type;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.b == cVar.b && this.c == cVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClickItem(type=");
                sb.append(this.b);
                sb.append(", position=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: ProductCardAction.kt */
        /* renamed from: xsna.ejd0$d$d, reason: collision with other inner class name */
        public static final class C2818d implements d {
            public final ProductGalleryItem.Type b;
            public final int c;

            public C2818d(ProductGalleryItem.Type type, int i) {
                this.b = type;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2818d)) {
                    return false;
                }
                C2818d c2818d = (C2818d) obj;
                return this.b == c2818d.b && this.c == c2818d.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("View(type=");
                sb.append(this.b);
                sb.append(", position=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    /* compiled from: ProductCardAction.kt */
    public interface e extends ejd0 {

        /* compiled from: ProductCardAction.kt */
        public static final class a implements e {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2029575428;
            }

            public final String toString() {
                return "OnResume";
            }
        }
    }

    /* compiled from: ProductCardAction.kt */
    public interface f extends ejd0 {

        /* compiled from: ProductCardAction.kt */
        public static final class a implements f {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ChangeIsFavorite(isFave="), this.b, ')');
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class b implements f {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1327079273;
            }

            public final String toString() {
                return "ClickFavorite";
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class c implements f {
            public final String b;

            public c(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("ClickLabel(id="), this.b, ')');
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class d implements f {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 342523143;
            }

            public final String toString() {
                return "ClickOzonCard";
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class e implements f {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 554676398;
            }

            public final String toString() {
                return "ClickReviews";
            }
        }

        /* compiled from: ProductCardAction.kt */
        /* renamed from: xsna.ejd0$f$f, reason: collision with other inner class name */
        public static final class C2819f implements f {
            public final List<Image> b;

            public C2819f(List<Image> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2819f) && epx.f(this.b, ((C2819f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("OpenReviewPhotos(images="), this.b);
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class g implements f {
            public static final g b = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 912709337;
            }

            public final String toString() {
                return "RatingShown";
            }
        }

        /* compiled from: ProductCardAction.kt */
        public static final class h implements f {
            public final boolean b;

            public h(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.b == ((h) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("UpdateCanAddReview(canAddReview="), this.b, ')');
            }
        }
    }

    /* compiled from: ProductCardAction.kt */
    public interface g extends ejd0 {

        /* compiled from: ProductCardAction.kt */
        public static final class a implements g {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -642472456;
            }

            public final String toString() {
                return "TrackShowFirstReview";
            }
        }
    }
}
