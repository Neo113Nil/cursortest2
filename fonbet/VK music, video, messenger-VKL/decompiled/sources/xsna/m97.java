package xsna;

import com.vk.core.preference.Preference;

/* compiled from: BiometricsLockSharedPrefStorage.kt */
/* loaded from: classes.dex */
public final class m97 implements p97 {
    @Override // xsna.p97
    public final boolean a() {
        return Preference.d("biometrics_lock", "is_password_set_key", false);
    }

    @Override // xsna.p97
    public final ux5 b() {
        return new ux5((int) Preference.m(0L, "biometrics_lock", "failure_attempts_key"), Preference.m(-1L, "biometrics_lock", "backoff_start_time_key"));
    }

    @Override // xsna.p97
    public final void c(boolean z) {
        Preference.I("biometrics_lock", "is_hide_app_content_enabled_key", z);
    }

    @Override // xsna.p97
    public final boolean d() {
        return Preference.d("biometrics_lock", "is_hide_push_info_enabled_key", false);
    }

    @Override // xsna.p97
    public final void e() {
        Preference.B("biometrics_lock");
    }

    @Override // xsna.p97
    public final boolean f(String str) {
        return Preference.s("biometrics_lock", "biometrics_password_key", "").equals(str);
    }

    @Override // xsna.p97
    public final long g() {
        return Preference.m(-1L, "biometrics_lock", "biometrics_lock_last_time_key");
    }

    @Override // xsna.p97
    public final long h() {
        return Preference.m(-1L, "biometrics_lock", "auto_lock_time_key");
    }

    @Override // xsna.p97
    public final void i(boolean z) {
        Preference.I("biometrics_lock", "is_biometrics_unlock_enabled_key", z);
    }

    @Override // xsna.p97
    public final void j(ux5 ux5Var) {
        Preference.F(ux5Var.a(), "biometrics_lock", "backoff_start_time_key");
        Preference.F(ux5Var.b(), "biometrics_lock", "failure_attempts_key");
    }

    @Override // xsna.p97
    public final boolean k() {
        return Preference.d("biometrics_lock", "is_biometrics_unlock_enabled_key", false);
    }

    @Override // xsna.p97
    public final void l(long j) {
        Preference.F(j, "biometrics_lock", "biometrics_lock_last_time_key");
    }

    @Override // xsna.p97
    public final boolean m() {
        return Preference.d("biometrics_lock", "is_hide_app_content_enabled_key", false);
    }

    @Override // xsna.p97
    public final void n(boolean z) {
        Preference.I("biometrics_lock", "is_hide_push_info_enabled_key", z);
    }

    @Override // xsna.p97
    public final void o(long j) {
        Preference.F(j, "biometrics_lock", "auto_lock_time_key");
    }

    @Override // xsna.p97
    public final void p(String str) {
        Preference.H("biometrics_lock", "biometrics_password_key", str);
        Preference.I("biometrics_lock", "is_password_set_key", true);
    }
}
