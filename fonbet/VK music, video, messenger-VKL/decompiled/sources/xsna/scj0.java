package xsna;

import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* compiled from: SharingV2ViewPreferencesWrapper.kt */
/* loaded from: classes5.dex */
public final class scj0 {
    public final SharedPreferences a;

    public scj0(ContextWrapper contextWrapper) {
        this.a = Preference.h(contextWrapper, 0, "SharingV2ViewSharedPrefs");
    }
}
