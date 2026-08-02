package xsna;

import android.content.Context;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.attachments.AdHideReason;
import com.vkontakte.android.attachments.AdSource;
import java.util.List;

/* compiled from: PostAdHideController.kt */
/* loaded from: classes4.dex */
public final class d0c0 {
    public final dw0 a;
    public final io.reactivex.rxjava3.disposables.b b;

    public d0c0(dw0 dw0Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = dw0Var;
        this.b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, NewsEntry newsEntry, aw0 aw0Var) {
        List<AdHideReason> list;
        AdSource.a aVar = AdSource.Companion;
        AdSource adSource = aw0Var.d;
        int i = aw0Var.b;
        int i2 = aw0Var.a;
        aVar.getClass();
        boolean b = AdSource.a.b(adSource);
        List<AdHideReason> list2 = aw0Var.e;
        if (newsEntry != 0) {
            if (!b || (list = list2) == null || list.isEmpty()) {
                DeprecatedStatisticInterface deprecatedStatisticInterface = (DeprecatedStatisticInterface) newsEntry;
                ahn.g(deprecatedStatisticInterface, 0, i2, i, "closed_by_user");
                ahn.g(deprecatedStatisticInterface, 0, i2, i, "hide");
            } else {
                ahn.g((DeprecatedStatisticInterface) newsEntry, 0, i2, i, "closed_by_user");
            }
        }
        this.b.b(hg1.l(this.a.a(new cw0(aw0Var.c, null)), context, 62).subscribe(new u30(newsEntry, 6), new pmu(new o99(com.vk.metrics.eventtracking.b.a, 10), 13)));
    }
}
