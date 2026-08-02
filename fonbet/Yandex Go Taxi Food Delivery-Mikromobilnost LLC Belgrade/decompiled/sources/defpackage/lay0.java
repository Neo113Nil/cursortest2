package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.a;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes9.dex */
public final class lay0 implements cou0 {
    public final rx2 a;
    public final jc4 b;
    public final t61 c;

    public lay0(rx2 rx2Var, jc4 jc4Var, t61 t61Var) {
        this.a = rx2Var;
        this.b = jc4Var;
        this.c = t61Var;
    }

    public final void a(Story story) {
        ArrayList arrayList = new ArrayList(story.g);
        String str = story.b;
        int size = story.i.d.size();
        String str2 = (String) a.R(arrayList);
        jc4 jc4Var = this.b;
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("banner_id", str);
        hashMap.put("type", "media-story");
        hashMap.put("page_number_total_count", Integer.valueOf(size));
        if (str2 != null) {
            hashMap.put("view", str2);
        }
        jc4Var.a.a("PromoStories.Received", hashMap, 1, new HashMap());
    }
}
