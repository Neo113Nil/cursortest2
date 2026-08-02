package xsna;

import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vkontakte.android.R;
import xsna.eeu0;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b3l implements Preference.b, Preference.c {
    public final /* synthetic */ DebugDevSettingsFragment b;

    public /* synthetic */ b3l(DebugDevSettingsFragment debugDevSettingsFragment) {
        this.b = debugDevSettingsFragment;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        this.b.lo(obj);
        return true;
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        String c = o2l.c("__dbg_test_xowner_disable_allowed_methods", "");
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(this.b.mo2getContext()));
        c2801a.b = "Установить методы для игнорирования xowner";
        c2801a.d = "Для установки методов можно перечислить их названия через запятую, так и группу методов целиком - методы определяются по содержанию подстроки";
        c2801a.g = c;
        c2801a.c(R.string.ok, new v3l(0), true);
        c2801a.g();
        return true;
    }
}
