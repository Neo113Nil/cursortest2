package xsna;

import android.content.SharedPreferences;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;

/* compiled from: DebugDevSettingsFragment.java */
/* loaded from: classes17.dex */
public final class b5l implements Runnable {
    public final /* synthetic */ uek b;
    public final /* synthetic */ SharedPreferences c;
    public final /* synthetic */ DebugDevSettingsFragment d;

    public b5l(DebugDevSettingsFragment debugDevSettingsFragment, uek uekVar, SharedPreferences sharedPreferences) {
        this.d = debugDevSettingsFragment;
        this.b = uekVar;
        this.c = sharedPreferences;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uek uekVar = this.b;
        uekVar.c();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences.getBoolean("__dbg_network_netlog_write", false)) {
            uekVar.b();
        }
        tdj.b(sharedPreferences, "__dbg_network_clear_internal_state", true);
        enj.r(this.d.mo2getContext(), "Необходимо убить и перезапустить приложение", 1);
    }
}
