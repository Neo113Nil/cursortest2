package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import xsna.lau;

/* compiled from: SharedPrefsIABStringStorage.kt */
/* loaded from: classes2.dex */
public final class taj0 implements tlv {
    public saj0 a;

    @Override // xsna.tlv
    public final boolean a(String str) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return Preference.g(context).contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, xsna.saj0] */
    @Override // xsna.tlv
    public final void b(final uf20 uf20Var) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        SharedPreferences g = Preference.g(context);
        saj0 saj0Var = this.a;
        if (saj0Var != null) {
            g.unregisterOnSharedPreferenceChangeListener(saj0Var);
        }
        ?? r1 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xsna.saj0
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                String string;
                if (epx.f(str, "IABGPP_HDR_GppString")) {
                    String str2 = "";
                    if (sharedPreferences != null && (string = sharedPreferences.getString(str, "")) != null) {
                        str2 = string;
                    }
                    ((lau.b) uf20.this.c).a(uxp0.a(str2));
                }
            }
        };
        g.registerOnSharedPreferenceChangeListener(r1);
        this.a = r1;
    }

    @Override // xsna.tlv
    public final String c() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return Preference.g(context).getString("IABGPP_HDR_GppString", "");
    }
}
