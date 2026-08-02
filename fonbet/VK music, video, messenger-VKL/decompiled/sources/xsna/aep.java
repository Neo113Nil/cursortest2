package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import xsna.ucp;

/* compiled from: EmojiTask.kt */
/* loaded from: classes11.dex */
public final class aep implements ucp.b {
    @Override // xsna.ucp.b
    public final SharedPreferences provide() {
        return Preference.f("emoji");
    }
}
