package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.core.NewsFeedWatcher;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityMrcUrl;
import com.vk.statistic.TargetPlayheadViewability;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import xsna.pg30;

/* compiled from: MrcNewsfeedWatcher.kt */
/* loaded from: classes14.dex */
public final class jg30 extends NewsFeedWatcher {
    public final lg30 m;
    public final ig30 n;

    public jg30(RecyclerView recyclerView, k7b0 k7b0Var, lg30 lg30Var, dlv dlvVar) {
        super(recyclerView, dlvVar);
        this.m = lg30Var;
        this.n = new ig30(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(NewsEntry newsEntry) {
        SortedSet a;
        for (kuc0 kuc0Var : this.d) {
            if (kuc0Var instanceof rg30) {
                rg30 rg30Var = (rg30) kuc0Var;
                if (newsEntry instanceof DeprecatedStatisticInterface) {
                    pwc0 pwc0Var = rg30Var.k;
                    x6c0 x6c0Var = null;
                    if (pwc0Var != null && (a = pwc0Var.a()) != null) {
                        Iterator it = a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (epx.f(((x6c0) next).b(), newsEntry)) {
                                x6c0Var = next;
                                break;
                            }
                        }
                        x6c0Var = x6c0Var;
                    }
                    if (x6c0Var != null) {
                        float height = (x6c0Var.c().height() / x6c0Var.getFullHeight()) * 100;
                        DeprecatedStatisticInterface deprecatedStatisticInterface = (DeprecatedStatisticInterface) newsEntry;
                        List list = (List) rg30Var.e.get(deprecatedStatisticInterface);
                        if (list == null) {
                            list = rg30Var.e(deprecatedStatisticInterface, false);
                        }
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl = (DeprecatedStatisticPlayheadViewabilityMrcUrl) it2.next();
                            if (deprecatedStatisticPlayheadViewabilityMrcUrl.l == TargetPlayheadViewability.BANNER && deprecatedStatisticPlayheadViewabilityMrcUrl.n == 0 && height < deprecatedStatisticPlayheadViewabilityMrcUrl.m) {
                                it2.remove();
                                rg30Var.a.a(new pg30.b(deprecatedStatisticPlayheadViewabilityMrcUrl));
                            }
                        }
                    }
                } else {
                    rg30Var.getClass();
                }
            }
        }
        this.m.e();
    }
}
