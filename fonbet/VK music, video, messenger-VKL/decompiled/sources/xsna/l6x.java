package xsna;

import com.vk.core.preference.Preference;

/* compiled from: InstalledAppsTracker.kt */
/* loaded from: classes17.dex */
public final class l6x extends beg0 {
    @Override // xsna.beg0
    public final void r() {
        Preference.F(System.currentTimeMillis(), "InstalledAppsTracker", "last_sent_apps");
    }
}
