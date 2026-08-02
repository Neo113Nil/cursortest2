package xsna;

import android.content.SharedPreferences;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.Map;

/* compiled from: CropOnboardingAnimationHelper.kt */
/* loaded from: classes4.dex */
public final class shk {
    public final h7v a;
    public final SharedPreferences b;
    public final String c;
    public final Hint d;
    public final int e;
    public final int f;
    public final boolean g;

    public shk(h7v h7vVar, SharedPreferences sharedPreferences) {
        Map<String, String> map;
        String str;
        this.a = h7vVar;
        this.b = sharedPreferences;
        String id = HintId.POSTING_DRAG_ZOOM_PHOTO.getId();
        this.c = id;
        Hint p = h7vVar.p(id);
        this.d = p;
        int parseInt = (p == null || (map = p.e) == null || (str = map.get("show_times_count")) == null) ? 5 : Integer.parseInt(str);
        this.e = parseInt;
        boolean z = false;
        int i = sharedPreferences.getInt("current_times_animation", 0);
        this.f = i;
        if (i < parseInt && h7vVar.a(id)) {
            z = true;
        }
        this.g = z;
    }
}
