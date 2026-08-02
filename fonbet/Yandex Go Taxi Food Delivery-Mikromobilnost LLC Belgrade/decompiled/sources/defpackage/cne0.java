package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* loaded from: classes10.dex */
public final class cne0 {
    public final i3y a;

    public cne0(l2z l2zVar) {
        this.a = a.a(l2zVar);
    }

    public final void a() {
        d().clear().apply();
    }

    public final void b() {
        d().commit();
    }

    public final boolean c(String str) {
        return k().contains(str);
    }

    public final SharedPreferences.Editor d() {
        return k().edit();
    }

    public final Set e() {
        return k().getAll().keySet();
    }

    public final boolean f(String str) {
        return k().getBoolean(str, false);
    }

    public final boolean g(String str, boolean z) {
        return k().getBoolean(str, z);
    }

    public final float h(String str) {
        return k().getFloat(str, 0.0f);
    }

    public final int i(String str, int i) {
        return k().getInt(str, i);
    }

    public final long j(String str, long j) {
        return k().getLong(str, j);
    }

    public final SharedPreferences k() {
        return (SharedPreferences) this.a.getValue();
    }

    public final String l(String str, String str2) {
        return k().getString(str, str2);
    }

    public final List m(String str, String str2) {
        List W;
        String string = k().getString(str, null);
        if (string == null || string.length() == 0) {
            return EmptyList.a;
        }
        W = evu0.W(string, new String[]{str2}, (r2 & 4) != 0 ? 0 : 2);
        return W;
    }

    public final Set n(String str) {
        SharedPreferences k = k();
        EmptySet emptySet = EmptySet.a;
        Set<String> stringSet = k.getStringSet(str, emptySet);
        return stringSet == null ? emptySet : stringSet;
    }

    public final k20 o(final tls tlsVar, final String str) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: bne0
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                String str3 = str;
                if (jl40.l(str2, str3)) {
                    tlsVar.invoke(sharedPreferences.getAll().get(str3));
                }
            }
        };
        k().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return new k20(5, this, onSharedPreferenceChangeListener);
    }

    public final void p(int i, String str) {
        d().putInt(str, i).apply();
    }

    public final void q(long j, String str) {
        d().putLong(str, j).apply();
    }

    public final void r(String str, String str2) {
        d().putString(str, str2).apply();
    }

    public final void s(String str, String str2, List list) {
        d().putString(str, list != null ? kotlin.collections.a.X(list, str2, null, null, null, 62) : null).apply();
    }

    public final void t(String str, Set set) {
        d().putStringSet(str, set).apply();
    }

    public final void u(String str, boolean z) {
        d().putBoolean(str, z).apply();
    }

    public final void w(String str) {
        d().remove(str).apply();
    }
}
