package xsna;

import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import xsna.b9q0;

/* compiled from: SearchFeatureSpellcheckerEventsObserver.kt */
/* loaded from: classes16.dex */
public final class jsh0 {
    public final zqh0 a;

    public jsh0(zqh0 zqh0Var) {
        this.a = zqh0Var;
    }

    public final void a(l3a l3aVar) {
        boolean z = l3aVar instanceof SearchSpellcheckVh.a.C0525a;
        zqh0 zqh0Var = this.a;
        if (z) {
            zqh0Var.e(new SearchQuery(((SearchSpellcheckVh.a.C0525a) l3aVar).a, SearchInputMethod.Suggest, null, null, 12, null), b9q0.c.a);
        } else if (l3aVar instanceof SearchSpellcheckVh.a.b) {
            zqh0Var.e(new SearchQuery(((SearchSpellcheckVh.a.b) l3aVar).a, SearchInputMethod.Suggest, null, null, 12, null), new b9q0.b(true));
        }
    }
}
