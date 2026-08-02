package xsna;

import com.vk.core.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yng implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ yng(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                s3q0 s3q0Var = s3q0.a;
                break;
            case 1:
                String[] strArr = DebugDevSettingsFragment.t0;
                break;
            case 2:
                Preference.f("notifications_prefs").edit().putBoolean("enable_only_messenger_notifications", true).apply();
                break;
            default:
                s3q0 s3q0Var2 = s3q0.a;
                break;
        }
    }

    public /* synthetic */ yng(izs izsVar, int i) {
        this.b = i;
    }
}
