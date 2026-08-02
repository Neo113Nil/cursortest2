package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;

/* compiled from: BeautyWithIntensityPreferences.kt */
/* loaded from: classes11.dex */
public final class iw6 {
    public final String a = "beauty_with_intensity_preferences";
    public final q03 b;

    public iw6(q03 q03Var) {
        this.b = q03Var;
    }

    public final SharedPreferences a() {
        return Preference.e(((UserId) this.b.invoke()).b, this.a);
    }
}
