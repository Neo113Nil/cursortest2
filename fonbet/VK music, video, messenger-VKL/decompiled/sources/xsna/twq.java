package xsna;

import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class twq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ twq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                axq axqVar = (axq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(610655192, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:69)");
                    }
                    axqVar.j("AvatarAnimatedStack", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                bs60 bs60Var = (bs60) this.c;
                NewsfeedResearch newsfeedResearch = (NewsfeedResearch) obj2;
                bs60Var.getClass();
                bs60Var.m((NewsEntry) obj, newsfeedResearch.b, newsfeedResearch.c, (MobileOfficialAppsCoreNavStat$EventScreen) obj3);
                break;
            default:
                kkw0 kkw0Var = (kkw0) this.c;
                ((Integer) obj2).getClass();
                int intValue2 = ((Integer) obj3).intValue();
                eo9 eo9Var = kkw0Var.g;
                if (eo9Var != null) {
                    eo9Var.c(intValue2);
                }
                break;
        }
        return s3q0.a;
    }
}
