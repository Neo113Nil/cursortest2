package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import com.vk.core.preference.Preference;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class e301 {
    public final Context a;

    public e301(@NonNull Context context) {
        this.a = context;
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (e301.class) {
            try {
                hashSet = Preference.h(this.a, 0, "playcore_split_install_internal").getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }
}
