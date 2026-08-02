package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kqp implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kqp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.fqp] */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mqp mqpVar = (mqp) this.c;
                NewsEntry newsEntry = (NewsEntry) obj;
                NewsfeedResearch newsfeedResearch = (NewsfeedResearch) obj2;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) obj3;
                List<String> list = newsfeedResearch.b;
                List<NewsfeedResearchEvent> list2 = newsfeedResearch.c;
                ?? r2 = mqpVar.c;
                if (!list.isEmpty()) {
                    io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(nr2.v(sa4.a(newsEntry, mobileOfficialAppsCoreNavStat$EventScreen), list, mqpVar.d().Z2()), new ca6(new b5h(mqpVar, 14), 15));
                    asu0.a.getClass();
                    r2.a(sVar.q(asu0.i()).subscribe());
                    if (!list2.isEmpty()) {
                        r2.a(pq3.r(mqpVar.d().b(), list2).q(asu0.i()).subscribe());
                    }
                }
                break;
            default:
                ord0 ord0Var = (ord0) this.c;
                int intValue = ((Integer) obj2).intValue();
                ((Integer) obj3).getClass();
                int a = iah0.a(44);
                float f = 8;
                int a2 = iah0.a(f);
                int i = a + a2;
                int i2 = (intValue + a2) / i;
                ord0Var.q.setSpanCount(i2);
                RecyclerView recyclerView = ord0Var.n;
                if (recyclerView.getItemDecorationCount() > 0) {
                    recyclerView.removeItemDecorationAt(0);
                }
                recyclerView.addItemDecoration(new sfu(i2, iah0.a(f), iah0.a(f)));
                f4m.w((intValue - (i2 * i)) + a2, recyclerView);
                ird0 ird0Var = ord0Var.t;
                if (ird0Var != null) {
                    ord0Var.q6(ird0Var);
                }
                u1u0.e(new kv2(ord0Var, 9));
                break;
        }
        return s3q0.a;
    }
}
