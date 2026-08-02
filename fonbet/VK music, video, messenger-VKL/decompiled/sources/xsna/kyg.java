package xsna;

import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: CommunityCreateReviewAction.kt */
/* loaded from: classes18.dex */
public abstract class kyg implements kj50 {

    /* compiled from: CommunityCreateReviewAction.kt */
    public static final class a extends kyg {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 215204894;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CommunityCreateReviewAction.kt */
    public static final class b extends kyg {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -982969886;
        }

        public final String toString() {
            return "OnBackButtonClick";
        }
    }

    /* compiled from: CommunityCreateReviewAction.kt */
    public static final class c extends kyg {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1687104839;
        }

        public final String toString() {
            return "OnCancel";
        }
    }

    /* compiled from: CommunityCreateReviewAction.kt */
    public static abstract class d extends kyg {

        /* compiled from: CommunityCreateReviewAction.kt */
        public static final class a extends d {
            public final int b;
            public final Photo c;

            public a(int i, Photo photo) {
                this.b = i;
                this.c = photo;
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
                Photo photo = this.c;
                return hashCode + (photo == null ? 0 : photo.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Done(id=");
                sb.append(this.b);
                sb.append(", uploadedPhoto=");
                return tq.c(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityCreateReviewAction.kt */
        public static final class b extends d {
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

        /* compiled from: CommunityCreateReviewAction.kt */
        public static final class c extends d {
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

        /* compiled from: CommunityCreateReviewAction.kt */
        /* renamed from: xsna.kyg$d$d, reason: collision with other inner class name */
        public static final class C3214d extends d {
            public static final C3214d b = new C3214d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3214d);
            }

            public final int hashCode() {
                return -429967716;
            }

            public final String toString() {
                return "OnPlaceHolderClick";
            }
        }

        /* compiled from: CommunityCreateReviewAction.kt */
        public static final class e extends d {
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

        /* compiled from: CommunityCreateReviewAction.kt */
        public static final class f extends d {
            public final int b;

            public f(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.b == ((f) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnRemoveClick(id="), this.b, ')');
            }
        }

        /* compiled from: CommunityCreateReviewAction.kt */
        public static final class g extends d {
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
                return vu5.b(new StringBuilder("Progress(jobId="), this.b, ')');
            }
        }
    }

    /* compiled from: CommunityCreateReviewAction.kt */
    public static final class e extends kyg {
        public final float b;

        public e(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Float.compare(this.b, ((e) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("OnRatingChanged(newRating="));
        }
    }

    /* compiled from: CommunityCreateReviewAction.kt */
    public static final class f extends kyg {
        public final String b;

        public f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnReviewTextChanged(newValue="), this.b, ')');
        }
    }

    /* compiled from: CommunityCreateReviewAction.kt */
    public static final class g extends kyg {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1312295073;
        }

        public final String toString() {
            return "OnSendButtonClick";
        }
    }

    /* compiled from: CommunityCreateReviewAction.kt */
    public static final class h extends kyg {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1698069044;
        }

        public final String toString() {
            return "ShowUserAgreement";
        }
    }
}
