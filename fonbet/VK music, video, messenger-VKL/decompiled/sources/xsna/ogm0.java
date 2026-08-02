package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesCachedData;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesKey;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ogm0 implements izs {
    public final /* synthetic */ UserId b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;
    public final /* synthetic */ pgm0 e;

    public /* synthetic */ ogm0(UserId userId, int i, List list, pgm0 pgm0Var) {
        this.b = userId;
        this.c = i;
        this.d = list;
        this.e = pgm0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((RepliesCachedData) obj).b);
        linkedHashMap.put(new RepliesKey(this.b, this.c), i7o0.a(this.d));
        RepliesCachedData repliesCachedData = new RepliesCachedData(linkedHashMap);
        pgm0 pgm0Var = this.e;
        pgm0Var.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.m(new blq(1, pgm0Var, repliesCachedData)).q(asu0.a.c());
    }
}
