package xsna;

import android.content.SharedPreferences;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: CropOnboardingTooltipHelper.kt */
/* loaded from: classes4.dex */
public final class thk {
    public final h7v a;
    public final SharedPreferences b;
    public final j5d0 c;
    public final ec d;
    public PreviewRatio e;
    public final String f;
    public final Hint g;
    public final int h;
    public final int i;
    public boolean j;
    public final ArrayList k;

    public thk(h7v h7vVar, SharedPreferences sharedPreferences, j5d0 j5d0Var, ec ecVar) {
        Map<String, String> map;
        String str;
        this.a = h7vVar;
        this.b = sharedPreferences;
        this.c = j5d0Var;
        this.d = ecVar;
        String id = HintId.POSTING_SUITABLE_CROP.getId();
        this.f = id;
        Hint p = h7vVar.p(id);
        this.g = p;
        this.h = (p == null || (map = p.e) == null || (str = map.get("show_times_count")) == null) ? 5 : Integer.parseInt(str);
        this.i = sharedPreferences.getInt("current_times_tooltip", 0);
        this.k = new ArrayList();
    }
}
