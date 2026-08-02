package xsna;

import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class iqp implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iqp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, xsna.fqp] */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                jqp jqpVar = (jqp) this.c;
                NewsEntry newsEntry = (NewsEntry) obj;
                NewsfeedResearch newsfeedResearch = (NewsfeedResearch) obj2;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) obj3;
                List<String> list = newsfeedResearch.b;
                List<NewsfeedResearchEvent> list2 = newsfeedResearch.c;
                mqp mqpVar = jqpVar.a;
                if (!list.isEmpty()) {
                    AudienceResearchSurfaceCode a = sa4.a(newsEntry, mobileOfficialAppsCoreNavStat$EventScreen);
                    AudienceResearchComponent d = mqpVar.d();
                    ?? r3 = mqpVar.c;
                    io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(nr2.v(a, list, d.Z2()), new op0(new bjk(jqpVar, 5), 12));
                    asu0.a.getClass();
                    r3.a(sVar.q(asu0.i()).subscribe());
                    if (!list2.isEmpty()) {
                        r3.a(pq3.r(mqpVar.d().b(), list2).q(asu0.i()).subscribe());
                    }
                }
                break;
            default:
                tyq tyqVar = (tyq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1485932647, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:100)");
                    }
                    tyqVar.j("Image + RemoveIcon Badge", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
