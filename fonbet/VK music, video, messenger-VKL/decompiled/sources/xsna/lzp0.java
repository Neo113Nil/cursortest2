package xsna;

import android.util.LruCache;
import android.view.View;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.UUID;

/* compiled from: UiMeasuringDelegate.kt */
/* loaded from: classes16.dex */
public final class lzp0 implements uzh0 {
    public static final zy60 d = new zy60(14);
    public static final wd10 e = new wd10(16);
    public final UiMeasuringScreen a;
    public a b = a.Recommendations;
    public mzp0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UiMeasuringDelegate.kt */
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

        public final String h() {
            return this.screenTag;
        }
    }

    public lzp0(UiMeasuringScreen uiMeasuringScreen) {
        this.a = uiMeasuringScreen;
    }

    @Override // xsna.uzh0
    public final void a(View view) {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.start();
        }
        mzp0 mzp0Var2 = this.c;
        if (mzp0Var2 != null) {
            mzp0Var2.e(view);
        }
        mzp0 mzp0Var3 = this.c;
        if (mzp0Var3 != null) {
            mzp0Var3.h();
        }
    }

    @Override // xsna.uzh0
    public final void b() {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
    }

    @Override // xsna.uzh0
    public final void c() {
        a aVar = this.b;
        aVar.getClass();
        if (aVar == a.SearchResultsFiltered || aVar == a.SearchResults) {
            t(a.SuggesterOpen, true);
        }
    }

    @Override // xsna.uzh0
    public final void d(View view) {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.d(view);
        }
    }

    @Override // xsna.uzh0
    public final void e(View view) {
        mzp0 mzp0Var;
        mzp0 mzp0Var2 = this.c;
        if (mzp0Var2 != null) {
            mzp0Var2.start();
        }
        if (view != null && (mzp0Var = this.c) != null) {
            mzp0Var.e(view);
        }
        mzp0 mzp0Var3 = this.c;
        if (mzp0Var3 != null) {
            mzp0Var3.h();
        }
    }

    @Override // xsna.uzh0
    public final void f() {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    @Override // xsna.uzh0
    public final void g() {
        t(a.Recommendations, true);
    }

    @Override // xsna.uzh0
    public final void h() {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    @Override // xsna.uzh0
    public final void i() {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    @Override // xsna.uzh0
    public final void j(View view) {
        mzp0 mzp0Var;
        mzp0 mzp0Var2 = this.c;
        if (mzp0Var2 != null) {
            mzp0Var2.start();
        }
        if (view != null && (mzp0Var = this.c) != null) {
            mzp0Var.e(view);
        }
        mzp0 mzp0Var3 = this.c;
        if (mzp0Var3 != null) {
            mzp0Var3.h();
        }
    }

    @Override // xsna.uzh0
    public final void k(boolean z, boolean z2) {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
        if (z) {
            if (z2) {
                t(a.SearchResults, true);
            } else {
                t(a.SearchResultsFiltered, true);
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
                t(a.SearchResults, false);
            } else {
                t(aVar2, false);
            }
        }
    }

    @Override // xsna.uzh0
    public final void m(boolean z) {
        if (z) {
            t(a.SearchResults, true);
        } else {
            t(a.SearchResultsFiltered, true);
        }
    }

    @Override // xsna.uzh0
    public final void n() {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    @Override // xsna.uzh0
    public final void o(boolean z) {
        if (z) {
            t(a.SearchResults, true);
        } else {
            t(a.SearchResultsFiltered, true);
        }
    }

    @Override // xsna.uzh0
    public final void p() {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
    }

    @Override // xsna.uzh0
    public final void q(String str) {
        if (str.length() == 0) {
            t(a.Recommendations, true);
        } else {
            t(a.SuggesterQueryChange, false);
        }
    }

    @Override // xsna.uzh0
    public final void r(View view) {
        mzp0 mzp0Var;
        mzp0 mzp0Var2 = this.c;
        if (mzp0Var2 != null) {
            mzp0Var2.start();
        }
        if (view != null && (mzp0Var = this.c) != null) {
            mzp0Var.e(view);
        }
        mzp0 mzp0Var3 = this.c;
        if (mzp0Var3 != null) {
            mzp0Var3.h();
        }
    }

    @Override // xsna.uzh0
    public final void s() {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
    }

    public final void t(a aVar, boolean z) {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var2 = (mzp0) rzp0.c(this.a, null, false, 6).j();
        mzp0Var2.init();
        mzp0Var2.k(aVar.h());
        this.c = mzp0Var2;
        this.b = aVar;
        if (z) {
            return;
        }
        mzp0Var2.start();
        mzp0 mzp0Var3 = this.c;
        if (mzp0Var3 != null) {
            mzp0Var3.i();
        }
    }
}
