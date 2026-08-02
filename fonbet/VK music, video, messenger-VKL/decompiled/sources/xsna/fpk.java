package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* compiled from: CustomVirtualBackgroundMaskIdMapper.kt */
/* loaded from: classes7.dex */
public final class fpk {
    public final k9x a;
    public final SharedPreferences b = Preference.f("custom_virtual_background_ids");

    public fpk(k9x k9xVar) {
        this.a = k9xVar;
    }

    public static String a(int i) {
        return lhg.a(i, "mask_id");
    }

    public static String b(int i) {
        return lhg.a(i, "photo_id");
    }
}
