package xsna;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: FeatureStoragePreferenceRepository.kt */
/* loaded from: classes11.dex */
public final class lvq implements xuq {
    public final nu2 a;

    public lvq(nu2 nu2Var) {
        this.a = nu2Var;
    }

    @Override // xsna.xuq
    public final String a(String str, String str2, boolean z) {
        return j(str2, z).getString(str, null);
    }

    @Override // xsna.xuq
    public final String b(String str, String str2) {
        return i(str2).getString(str, null);
    }

    @Override // xsna.xuq
    public final void c(String str, String str2, String str3, boolean z) {
        j(str3, z).edit().putString(str, str2).apply();
    }

    @Override // xsna.xuq
    public final void d(String str) {
        i(str).edit().clear().apply();
        j(str, true).edit().clear().apply();
        j(str, false).edit().clear().apply();
    }

    @Override // xsna.xuq
    public final void e(String str, String str2, boolean z) {
        j(str2, z).edit().remove(str).apply();
    }

    @Override // xsna.xuq
    public final List f(String str, boolean z) {
        Map<String, ?> all = j(str, z).getAll();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Object value = entry.getValue();
            String str2 = value instanceof String ? (String) value : null;
            if (str2 != null) {
                arrayList.add(new Pair(entry.getKey(), str2));
            }
        }
        return arrayList;
    }

    @Override // xsna.xuq
    public final void g(String str, String str2) {
        e(str, str2, true);
        e(str, str2, false);
    }

    @Override // xsna.xuq
    public final void h(String str, String str2, String str3) {
        i(str3).edit().putString(str, str2).apply();
    }

    public final SharedPreferences i(String str) {
        return (SharedPreferences) this.a.invoke("toggles_meta_".concat(str));
    }

    public final SharedPreferences j(String str, boolean z) {
        return (SharedPreferences) this.a.invoke("toggles_" + str + '_' + (z ? "user" : "common"));
    }
}
