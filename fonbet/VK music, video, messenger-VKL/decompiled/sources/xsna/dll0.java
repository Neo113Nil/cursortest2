package xsna;

import com.vk.dto.common.GoodAlbum;
import com.vk.ecomm.storefront.impl.albums.presentation.model.LoadingState;
import java.util.List;

/* compiled from: StorefrontViewState.kt */
/* loaded from: classes18.dex */
public final class dll0 implements lm50 {
    public final LoadingState b;
    public final b c;
    public final a d;

    /* compiled from: StorefrontViewState.kt */
    public interface a {

        /* compiled from: StorefrontViewState.kt */
        /* renamed from: xsna.dll0$a$a, reason: collision with other inner class name */
        public static final class C2741a implements a {
            public static final C2741a a = new C2741a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2741a);
            }

            public final int hashCode() {
                return 728935065;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: StorefrontViewState.kt */
        public static final class b implements a {
            public final mpl0 a;
            public final List<GoodAlbum> b;
            public final boolean c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(mpl0 mpl0Var, List<? extends GoodAlbum> list, boolean z) {
                this.a = mpl0Var;
                this.b = list;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                mpl0 mpl0Var = this.a;
                return Boolean.hashCode(this.c) + fw3.a((mpl0Var == null ? 0 : mpl0Var.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(viewedGoods=");
                sb.append(this.a);
                sb.append(", albums=");
                sb.append(this.b);
                sb.append(", canLoadMore=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: StorefrontViewState.kt */
    public static final class b {
        public final boolean a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final int e;

        public b(int i, int i2, boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = i;
            this.c = z2;
            this.d = z3;
            this.e = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + qoy.b(qoy.b(shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopBarState(canEdit=");
            sb.append(this.a);
            sb.append(", bookmarksCount=");
            sb.append(this.b);
            sb.append(", isBookmarksEnabled=");
            sb.append(this.c);
            sb.append(", isCartEnabled=");
            sb.append(this.d);
            sb.append(", cartCount=");
            return vu5.b(sb, this.e, ')');
        }
    }

    public dll0(LoadingState loadingState, b bVar, a aVar) {
        this.b = loadingState;
        this.c = bVar;
        this.d = aVar;
    }
}
