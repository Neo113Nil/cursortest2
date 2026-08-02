package xsna;

import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;

/* compiled from: CommunityCreateReviewViewState.kt */
/* loaded from: classes18.dex */
public final class hzg implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: CommunityCreateReviewViewState.kt */
    public static final class a implements fm50<fzg> {
        public final yzt0<x9k> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<Integer> e;
        public final yzt0<wow<ImageGalleryItem>> f;
        public final yzt0<Integer> g;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateCommunityReviewComposeContent(commentData=");
            sb.append(this.a);
            sb.append(", isSendButtonEnabled=");
            sb.append(this.b);
            sb.append(", isReviewSending=");
            sb.append(this.c);
            sb.append(", isBottomBarVisible=");
            sb.append(this.d);
            sb.append(", imageCount=");
            sb.append(this.e);
            sb.append(", reviewImages=");
            sb.append(this.f);
            sb.append(", mark=");
            return tr.c(sb, this.g, ')');
        }
    }

    /* compiled from: CommunityCreateReviewViewState.kt */
    public static final class b implements fm50<fzg> {
        public final yzt0<tlo0> a;
        public final yzt0<tlo0> b;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(title=");
            sb.append(this.a);
            sb.append(", description=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityCreateReviewViewState.kt */
    public static final class c implements fm50<fzg> {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2045776848;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public hzg(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
