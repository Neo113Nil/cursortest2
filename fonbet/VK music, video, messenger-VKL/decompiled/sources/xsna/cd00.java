package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class cd00 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        synchronized (t8u0.c) {
            SharedPreferences i = Preference.i();
            z = i.getBoolean("key_client_update_needed", false);
            SharedPreferences.Editor edit = i.edit();
            edit.remove("key_client_update_needed");
            edit.apply();
        }
        return Boolean.valueOf(z);
    }
}
