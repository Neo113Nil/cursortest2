package xsna;

import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: SearchFeatureState.kt */
/* loaded from: classes5.dex */
public final class ksh0 implements km50 {
    public final b b;
    public final dsh0 c;
    public final irh0 d;
    public final a e;
    public final boolean f;

    /* compiled from: SearchFeatureState.kt */
    public interface a {

        /* compiled from: SearchFeatureState.kt */
        /* renamed from: xsna.ksh0$a$a, reason: collision with other inner class name */
        public static final class C3203a implements a {
            public static final C3203a a = new C3203a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3203a);
            }

            public final int hashCode() {
                return 1832629144;
            }

            public final String toString() {
                return "Search";
            }
        }

        /* compiled from: SearchFeatureState.kt */
        public static final class b implements a {
            public final ksh0 a;
            public final yqh0 b;

            public b(ksh0 ksh0Var, yqh0 yqh0Var) {
                this.a = ksh0Var;
                this.b = yqh0Var;
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
                int hashCode = this.a.hashCode() * 31;
                yqh0 yqh0Var = this.b;
                return hashCode + (yqh0Var == null ? 0 : yqh0Var.hashCode());
            }

            public final String toString() {
                return "Suggester(preSuggesterState=" + this.a + ", preSuggesterCatalogSnapshot=" + this.b + ')';
            }
        }
    }

    /* compiled from: SearchFeatureState.kt */
    public static final class b implements km50 {
        public final SearchQuery b;
        public final SearchParams c;
        public final boolean d;
        public final boolean e;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 15);
        }

        public static b a(b bVar, SearchQuery searchQuery, SearchParams searchParams, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                searchQuery = bVar.b;
            }
            if ((i & 2) != 0) {
                searchParams = bVar.c;
            }
            if ((i & 4) != 0) {
                z = bVar.d;
            }
            if ((i & 8) != 0) {
                z2 = bVar.e;
            }
            bVar.getClass();
            return new b(searchQuery, searchParams, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            SearchParams searchParams = this.c;
            return Boolean.hashCode(this.e) + qoy.b((hashCode + (searchParams == null ? 0 : searchParams.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QueryInputState(query=");
            sb.append(this.b);
            sb.append(", queryParams=");
            sb.append(this.c);
            sb.append(", isRequested=");
            sb.append(this.d);
            sb.append(", isLoading=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public b(SearchQuery searchQuery, SearchParams searchParams, boolean z, boolean z2) {
            this.b = searchQuery;
            this.c = searchParams;
            this.d = z;
            this.e = z2;
        }

        public /* synthetic */ b(SearchQuery searchQuery, SearchParams searchParams, int i) {
            this((i & 1) != 0 ? new SearchQuery("", SearchInputMethod.Keyboard, null, null, 12, null) : searchQuery, (i & 2) != 0 ? null : searchParams, false, false);
        }
    }

    public ksh0() {
        this(null, null, 31);
    }

    public static ksh0 a(ksh0 ksh0Var, b bVar, dsh0 dsh0Var, a aVar, boolean z, int i) {
        if ((i & 1) != 0) {
            bVar = ksh0Var.b;
        }
        b bVar2 = bVar;
        if ((i & 2) != 0) {
            dsh0Var = ksh0Var.c;
        }
        dsh0 dsh0Var2 = dsh0Var;
        irh0 irh0Var = ksh0Var.d;
        if ((i & 8) != 0) {
            aVar = ksh0Var.e;
        }
        a aVar2 = aVar;
        if ((i & 16) != 0) {
            z = ksh0Var.f;
        }
        ksh0Var.getClass();
        return new ksh0(bVar2, dsh0Var2, irh0Var, aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksh0)) {
            return false;
        }
        ksh0 ksh0Var = (ksh0) obj;
        return epx.f(this.b, ksh0Var.b) && epx.f(this.c, ksh0Var.c) && epx.f(this.d, ksh0Var.d) && epx.f(this.e, ksh0Var.e) && this.f == ksh0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFeatureState(queryInput=");
        sb.append(this.b);
        sb.append(", requestState=");
        sb.append(this.c);
        sb.append(", featureOptions=");
        sb.append(this.d);
        sb.append(", contentMode=");
        sb.append(this.e);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public ksh0(b bVar, dsh0 dsh0Var, irh0 irh0Var, a aVar, boolean z) {
        this.b = bVar;
        this.c = dsh0Var;
        this.d = irh0Var;
        this.e = aVar;
        this.f = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ksh0(b bVar, irh0 irh0Var, int i) {
        this(r3, new dsh0(drm0.p0(r13.b).toString(), r13.e, r13.c, r13.d, true, r3.c, false), (i & 4) != 0 ? new irh0(false, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : irh0Var, a.C3203a.a, false);
        b bVar2 = (i & 1) != 0 ? new b(null, 0 == true ? 1 : 0, 15) : bVar;
        SearchQuery searchQuery = bVar2.b;
    }
}
