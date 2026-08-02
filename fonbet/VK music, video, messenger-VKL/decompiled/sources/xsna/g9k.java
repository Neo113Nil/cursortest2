package xsna;

import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;

/* compiled from: CreateMarketItemReviewViewState.kt */
/* loaded from: classes18.dex */
public final class g9k implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: CreateMarketItemReviewViewState.kt */
    public static final class a implements fm50<c9k> {
        public final yzt0<String> a;
        public final yzt0<String> b;
        public final yzt0<String> c;
        public final yzt0<x9k> d;
        public final yzt0<x9k> e;
        public final yzt0<x9k> f;
        public final yzt0<Boolean> g;
        public final yzt0<Boolean> h;
        public final yzt0<Boolean> i;
        public final yzt0<wow<ImageGalleryItem>> j;
        public final yzt0<Integer> k;
        public final yzt0<Integer> l;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
            this.k = h0u0Var11;
            this.l = h0u0Var12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l);
        }

        public final int hashCode() {
            return this.l.hashCode() + sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(productImage=");
            sb.append(this.a);
            sb.append(", userName=");
            sb.append(this.b);
            sb.append(", productName=");
            sb.append(this.c);
            sb.append(", commentData=");
            sb.append(this.d);
            sb.append(", prosData=");
            sb.append(this.e);
            sb.append(", consData=");
            sb.append(this.f);
            sb.append(", isSendButtonEnabled=");
            sb.append(this.g);
            sb.append(", isReviewSending=");
            sb.append(this.h);
            sb.append(", isBottomBarVisible=");
            sb.append(this.i);
            sb.append(", reviewImages=");
            sb.append(this.j);
            sb.append(", imageCount=");
            sb.append(this.k);
            sb.append(", rating=");
            return tr.c(sb, this.l, ')');
        }
    }

    /* compiled from: CreateMarketItemReviewViewState.kt */
    public static final class b implements fm50<c9k> {
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

    /* compiled from: CreateMarketItemReviewViewState.kt */
    public static final class c implements fm50<c9k> {
        public static final c a = new c();
    }

    /* compiled from: CreateMarketItemReviewViewState.kt */
    public static final class d implements fm50<c9k> {
        public final yzt0<String> a;
        public final yzt0<String> b;
        public final yzt0<Boolean> c;

        public d(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuccessfullySent(title=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", isShowFAQButton=");
            return tr.c(sb, this.c, ')');
        }
    }

    public g9k(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
