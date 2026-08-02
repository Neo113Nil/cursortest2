package xsna;

import android.view.View;
import com.vk.core.performance.score.PerformanceScoreProduct;

/* compiled from: ProductScoreSessionDelegate.kt */
/* loaded from: classes16.dex */
public final class yrd0 implements uzh0 {
    public final PerformanceScoreProduct a;
    public a b = a.Recommendations;
    public yw90 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductScoreSessionDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Recommendations;
        public static final a SearchResults;
        public static final a SearchResultsFiltered;
        public static final a SuggesterOpen;
        public static final a SuggesterQueryChange;
        private final String screenTag;

        static {
            a aVar = new a("Recommendations", 0, "recommendations");
            Recommendations = aVar;
            a aVar2 = new a("SuggesterOpen", 1, "suggester_open");
            SuggesterOpen = aVar2;
            a aVar3 = new a("SuggesterQueryChange", 2, "suggester_query_change");
            SuggesterQueryChange = aVar3;
            a aVar4 = new a("SearchResults", 3, "search_results");
            SearchResults = aVar4;
            a aVar5 = new a("SearchResultsFiltered", 4, "search_results_filtered");
            SearchResultsFiltered = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.screenTag = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public yrd0(PerformanceScoreProduct performanceScoreProduct) {
        this.a = performanceScoreProduct;
    }

    @Override // xsna.uzh0
    public final void a(View view) {
        yw90 yw90Var = this.c;
        if (yw90Var != null) {
            yw90Var.c();
        }
    }

    @Override // xsna.uzh0
    public final void c() {
        a aVar = this.b;
        aVar.getClass();
        if (aVar == a.SearchResultsFiltered || aVar == a.SearchResults) {
            t(a.SuggesterOpen);
        }
    }

    @Override // xsna.uzh0
    public final void d(View view) {
        yw90 yw90Var = this.c;
        if (yw90Var != null) {
            yw90Var.a();
        }
    }

    @Override // xsna.uzh0
    public final void e(View view) {
        yw90 yw90Var = this.c;
        if (yw90Var != null) {
            yw90Var.c();
        }
    }

    @Override // xsna.uzh0
    public final void g() {
        t(a.Recommendations);
    }

    @Override // xsna.uzh0
    public final void j(View view) {
        yw90 yw90Var = this.c;
        if (yw90Var != null) {
            yw90Var.c();
        }
    }

    @Override // xsna.uzh0
    public final void k(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                t(a.SearchResults);
            } else {
                t(a.SearchResultsFiltered);
            }
        }
    }

    @Override // xsna.uzh0
    public final void l(boolean z) {
        a aVar = this.b;
        aVar.getClass();
        a aVar2 = a.SearchResultsFiltered;
        if (aVar == aVar2 || aVar == a.SearchResults) {
            if (z) {
                t(a.SearchResults);
            } else {
                t(aVar2);
            }
        }
    }

    @Override // xsna.uzh0
    public final void m(boolean z) {
        if (z) {
            t(a.SearchResults);
        } else {
            t(a.SearchResultsFiltered);
        }
    }

    @Override // xsna.uzh0
    public final void o(boolean z) {
        if (z) {
            t(a.SearchResults);
        } else {
            t(a.SearchResultsFiltered);
        }
    }

    @Override // xsna.uzh0
    public final void p() {
        yw90 yw90Var = this.c;
        if (yw90Var != null) {
            yw90Var.stop();
        }
    }

    @Override // xsna.uzh0
    public final void q(String str) {
        if (str.length() == 0) {
            t(a.Recommendations);
        } else {
            t(a.SuggesterQueryChange);
        }
    }

    @Override // xsna.uzh0
    public final void r(View view) {
        yw90 yw90Var = this.c;
        if (yw90Var != null) {
            yw90Var.c();
        }
    }

    public final void t(a aVar) {
        yw90 yw90Var = this.c;
        if (yw90Var != null) {
            yw90Var.stop();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var2 = (yw90) zrd0.a(this.a).j();
        yw90Var2.init();
        this.c = yw90Var2;
        this.b = aVar;
    }

    @Override // xsna.uzh0
    public final void b() {
    }

    @Override // xsna.uzh0
    public final void f() {
    }

    @Override // xsna.uzh0
    public final void h() {
    }

    @Override // xsna.uzh0
    public final void i() {
    }

    @Override // xsna.uzh0
    public final void n() {
    }

    @Override // xsna.uzh0
    public final void s() {
    }
}
