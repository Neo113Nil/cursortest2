package xsna;

import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchQuery;

/* compiled from: SearchFeatureAction.kt */
/* loaded from: classes5.dex */
public interface wqh0 extends kj50 {

    /* compiled from: SearchFeatureAction.kt */
    public static final class a implements wqh0 {
        public static final a b = new a();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class b implements wqh0 {
        public static final b b = new b();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class c implements wqh0 {
        public static final c b = new c();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class d implements wqh0 {
        public static final d b = new d();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class e implements wqh0 {
        public final yqh0 b;

        public e(yqh0 yqh0Var) {
            this.b = yqh0Var;
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
            return "CatalogSnapshotReceived(snapshot=" + this.b + ')';
        }
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class f implements wqh0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ChangeQueryViewHint(hint=null)";
        }
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class g implements wqh0 {
        public static final g b = new g();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class h implements wqh0 {
        public static final h b = new h();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class i implements wqh0 {
        public final SearchParams b;

        public i(SearchParams searchParams) {
            this.b = searchParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ParametersUpdated(parameters=" + this.b + ')';
        }
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class j implements wqh0 {
        public static final j b = new j();
    }

    /* compiled from: SearchFeatureAction.kt */
    public interface k extends wqh0 {
        SearchQuery i();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class l implements m {
        public final SearchQuery b;

        public l(SearchQuery searchQuery) {
            this.b = searchQuery;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // xsna.wqh0.k
        public final SearchQuery i() {
            return this.b;
        }

        public final String toString() {
            return "QueryChanged(query=" + this.b + ')';
        }
    }

    /* compiled from: SearchFeatureAction.kt */
    public interface m extends k {
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class n implements m {
        public final SearchQuery b;
        public final boolean c;

        public n(SearchQuery searchQuery, boolean z) {
            this.b = searchQuery;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.b, nVar.b) && this.c == nVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        @Override // xsna.wqh0.k
        public final SearchQuery i() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QueryViewBound(query=");
            sb.append(this.b);
            sb.append(", isActiveQueryInput=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class o implements wqh0 {
        public final boolean b;
        public final boolean c;

        public o(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.b == oVar.b && this.c == oVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReloadRequested(force=");
            sb.append(this.b);
            sb.append(", skipIfAlreadyRequested=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class p implements wqh0 {
        public static final p b = new p();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class q implements wqh0 {
        public static final q b = new q();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class r implements wqh0 {
        public static final r b = new r();
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class s implements k {
        public final SearchQuery b;

        public s() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            SearchQuery searchQuery = this.b;
            if (searchQuery == null) {
                return 0;
            }
            return searchQuery.hashCode();
        }

        @Override // xsna.wqh0.k
        public final SearchQuery i() {
            return this.b;
        }

        public final String toString() {
            return "SearchActivated(query=" + this.b + ')';
        }

        public s(SearchQuery searchQuery) {
            this.b = searchQuery;
        }
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class t implements k {
        public final SearchQuery b;

        public t() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && epx.f(this.b, ((t) obj).b);
        }

        public final int hashCode() {
            SearchQuery searchQuery = this.b;
            if (searchQuery == null) {
                return 0;
            }
            return searchQuery.hashCode();
        }

        @Override // xsna.wqh0.k
        public final SearchQuery i() {
            return this.b;
        }

        public final String toString() {
            return "SearchImeActionClicked(query=" + this.b + ')';
        }

        public t(SearchQuery searchQuery) {
            this.b = searchQuery;
        }
    }

    /* compiled from: SearchFeatureAction.kt */
    public static final class u implements m {
        public final SearchQuery b;
        public final b9q0 c;

        public u(SearchQuery searchQuery, b9q0 b9q0Var) {
            this.b = searchQuery;
            this.c = b9q0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return epx.f(this.b, uVar.b) && epx.f(this.c, uVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        @Override // xsna.wqh0.k
        public final SearchQuery i() {
            return this.b;
        }

        public final String toString() {
            return "SearchRequested(query=" + this.b + ", rule=" + this.c + ')';
        }
    }
}
