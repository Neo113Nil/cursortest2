package xsna;

import com.vk.core.preference.Preference;
import xsna.ky6;

/* compiled from: AppSettings.kt */
/* loaded from: classes.dex */
public final class w83 {
    public final String a() {
        return Preference.j().getString("__device_id__", "");
    }

    public final void b(String str) {
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putString("__device_id__", str);
        aVar.a();
    }
}
