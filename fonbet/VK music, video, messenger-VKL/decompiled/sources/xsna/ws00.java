package xsna;

import android.view.View;

/* compiled from: MarketAllReviewsModalViewsEvent.kt */
/* loaded from: classes18.dex */
public abstract class ws00 {

    /* compiled from: MarketAllReviewsModalViewsEvent.kt */
    public static final class a extends ws00 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -610928166;
        }

        public final String toString() {
            return "ShowBaseModalToastError";
        }
    }

    /* compiled from: MarketAllReviewsModalViewsEvent.kt */
    public static final class b extends ws00 {
        public final View a;
        public final int b;
        public final boolean c;
        public final boolean d;

        public b(View view, int i, boolean z, boolean z2) {
            this.a = view;
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowCommunityModalActionsView(requireView=");
            sb.append(this.a);
            sb.append(", communityReviewId=");
            sb.append(this.b);
            sb.append(", canEdit=");
            sb.append(this.c);
            sb.append(", canDelete=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: MarketAllReviewsModalViewsEvent.kt */
    public static final class c extends ws00 {
        public final View a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public c(View view, String str, boolean z, boolean z2) {
            this.a = view;
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowGoodModalActionsView(requireView=");
            sb.append(this.a);
            sb.append(", goodReviewId=");
            sb.append(this.b);
            sb.append(", canEdit=");
            sb.append(this.c);
            sb.append(", canDelete=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
