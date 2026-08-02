package xsna;

import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: UserRecomThemesStorageImpl.kt */
/* loaded from: classes4.dex */
public final class hzq0 implements gzq0 {
    @Override // xsna.gzq0
    public final void a(Set<Integer> set) {
        Set<Integer> set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) it.next()).intValue()));
        }
        Preference.J("onboarding_user_recom_themes", "recom_themes_ids", (Long[]) arrayList.toArray(new Long[0]));
    }

    @Override // xsna.gzq0
    public final void b(String str) {
        if (str != null) {
            Preference.H("onboarding_user_recom_themes", "recom_themes_source_screen", str);
        } else {
            Preference.C("onboarding_user_recom_themes", "recom_themes_source_screen");
        }
    }

    @Override // xsna.gzq0
    public final Set<Integer> c() {
        return rli0.C(new ulp0(rl3.D(Preference.n("onboarding_user_recom_themes", "recom_themes_ids")), new hxm0(6)));
    }

    @Override // xsna.gzq0
    public final void d(boolean z) {
        Preference.I("onboarding_user_recom_themes", "recom_themes_need_update", z);
    }

    @Override // xsna.gzq0
    public final Set<String> e() {
        Preference preference = Preference.a;
        return Preference.u(EmptySet.b, "onboarding_user_recom_themes", "recom_themes_selected_string_ids");
    }

    @Override // xsna.gzq0
    public final void f(Set<String> set) {
        Preference.K(set, "onboarding_user_recom_themes", "recom_themes_selected_string_ids");
    }

    @Override // xsna.gzq0
    public final void g(boolean z) {
        Preference.I("onboarding_user_recom_themes", "recom_themes_need_upload", z);
    }
}
