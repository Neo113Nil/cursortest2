package xsna;

import com.vk.search.integration.api.SearchDelegate;
import com.vk.search.integration.api.SearchTab;

/* compiled from: IntegrationSearchResultsDelegate.kt */
/* loaded from: classes5.dex */
public interface iax extends SearchDelegate, rtn0 {

    /* compiled from: IntegrationSearchResultsDelegate.kt */
    public interface a {

        /* compiled from: IntegrationSearchResultsDelegate.kt */
        /* renamed from: xsna.iax$a$a, reason: collision with other inner class name */
        public static final class C3043a implements a {
            public final String a;

            public C3043a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3043a) && epx.f(this.a, ((C3043a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("QueryChanged(query="), this.a, ')');
            }
        }

        /* compiled from: IntegrationSearchResultsDelegate.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -805999674;
            }

            public final String toString() {
                return "SearchActivated";
            }
        }

        /* compiled from: IntegrationSearchResultsDelegate.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1418854113;
            }

            public final String toString() {
                return "SearchCleared";
            }
        }

        /* compiled from: IntegrationSearchResultsDelegate.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -2072534290;
            }

            public final String toString() {
                return "SearchDisactivated";
            }
        }

        /* compiled from: IntegrationSearchResultsDelegate.kt */
        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -417778413;
            }

            public final String toString() {
                return "SearchResultsBound";
            }
        }

        /* compiled from: IntegrationSearchResultsDelegate.kt */
        public static final class f implements a {
            public final SearchTab a;

            public f(SearchTab searchTab) {
                this.a = searchTab;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SearchTabChanged(tab=" + this.a + ')';
            }
        }
    }

    void a(String str);

    io.reactivex.rxjava3.core.q<a> b();

    void c();

    void p();
}
