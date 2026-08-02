package xsna;

import com.vk.api.generated.feedbacks.dto.FeedbacksFeedbackAnswerDto;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: InternalNpsCatalogRepositoryImpl.kt */
/* loaded from: classes16.dex */
public final class ljx implements ujx {
    public final LinkedHashSet a = new LinkedHashSet();

    @Override // xsna.ujx
    public final io.reactivex.rxjava3.core.a a(String str, Map map) {
        if (!this.a.add(str)) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            String str2 = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            arrayList.add(set.size() > 1 ? new FeedbacksFeedbackAnswerDto(str2, null, j5g.O0(set), 2, null) : new FeedbacksFeedbackAnswerDto(str2, (String) j5g.Z(set), null, 4, null));
        }
        tfx tfxVar = new tfx("feedbacks.saveAnswers", new et(18), new gp(16));
        tfx.o(tfxVar, "block_id", str, 0, 0, 12);
        tfx.o(tfxVar, "answers", GsonHolder.a().toJson(arrayList), 0, 0, 12);
        dz2 x = yfb.x(tfxVar);
        x.n = true;
        x.q = Integer.MAX_VALUE;
        return new io.reactivex.rxjava3.internal.operators.completable.v(rsg0.Z(x), io.reactivex.rxjava3.internal.functions.a.g);
    }
}
