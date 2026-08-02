package xsna;

import java.util.ArrayList;

/* compiled from: DraftsListViewState.kt */
/* loaded from: classes18.dex */
public interface afo extends lm50 {

    /* compiled from: DraftsListViewState.kt */
    public static final class a implements afo {
        public final ArrayList b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public a(ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.b = arrayList;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = z5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(drafts=");
            sb.append(this.b);
            sb.append(", isRefreshing=");
            sb.append(this.c);
            sb.append(", isPaginationLoading=");
            sb.append(this.d);
            sb.append(", isPaginationError=");
            sb.append(this.e);
            sb.append(", isRefreshError=");
            sb.append(this.f);
            sb.append(", needScrollToTop=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: DraftsListViewState.kt */
    public static final class b implements afo {
        public static final b b = new b();
    }

    /* compiled from: DraftsListViewState.kt */
    public static final class c implements afo {
        public static final c b = new c();
    }

    /* compiled from: DraftsListViewState.kt */
    public static final class d implements afo {
        public static final d b = new d();
    }
}
