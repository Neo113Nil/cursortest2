package xsna;

import java.util.ArrayList;

/* compiled from: CreateMarketItemReviewPatch.kt */
/* loaded from: classes18.dex */
public abstract class s8k implements xl50 {

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class a extends s8k {
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
            return defpackage.q0.a(new StringBuilder("ChangeBottomBarVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class b extends s8k {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CommentChanged(text="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class c extends s8k {
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
            return ho8.a(new StringBuilder("ConsChanged(text="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class d extends s8k {
        public final a8k b;

        public d(a8k a8kVar) {
            this.b = a8kVar;
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
            return "CreateMarketItemReviewConfigLoaded(config=" + this.b + ')';
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class e extends s8k {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Loading(isLoading="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class f extends s8k {
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
            return ho8.a(new StringBuilder("ProsChanged(text="), this.b, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class g extends s8k {
        public final float b;

        public g(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Float.compare(this.b, ((g) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("RatingChanged(newRating="));
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class h extends s8k {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 619867568;
        }

        public final String toString() {
            return "ReviewSentError";
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static final class i extends s8k {
        public final String b;
        public final String c;

        public i(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReviewSuccessfullySent(resultTitle=");
            sb.append(this.b);
            sb.append(", resultDescription=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewPatch.kt */
    public static abstract class j extends s8k {

        /* compiled from: CreateMarketItemReviewPatch.kt */
        public static final class a extends j {
            public final ArrayList b;

            public a(ArrayList arrayList) {
                this.b = arrayList;
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
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ImagesChanged(reviewImages="), this.b);
            }
        }
    }
}
