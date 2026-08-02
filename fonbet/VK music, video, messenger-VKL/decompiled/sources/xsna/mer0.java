package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* compiled from: VKPreferencesKeyValueStorage.kt */
/* loaded from: classes.dex */
public final class mer0 {
    public final SharedPreferences a;

    public mer0(Context context, String str) {
        this.a = Preference.h(context, 0, str);
    }
}
