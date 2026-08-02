package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d991 {
    public final Context a;

    public d991(Context context) {
        this.a = context;
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (d991.class) {
            try {
                hashSet = this.a.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
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
