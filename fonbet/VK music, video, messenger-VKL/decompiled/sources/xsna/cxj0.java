package xsna;

import com.vk.internal.api.GsonHolder;
import java.util.List;

/* compiled from: SituationalSuggestsService.kt */
/* loaded from: classes2.dex */
public interface cxj0 {
    default tfx a(List list) {
        tfx tfxVar = new tfx("situationalSuggests.sendStats", new ggj0(1), new bxj0(0));
        tfx.o(tfxVar, "events", GsonHolder.a().toJson(list), 0, 0, 12);
        return tfxVar;
    }

    default tfx b(List list) {
        tfx tfxVar = new tfx("situationalSuggests.getById", new sr(28), new tr(25));
        tfxVar.i("theme_ids", list);
        return tfxVar;
    }
}
