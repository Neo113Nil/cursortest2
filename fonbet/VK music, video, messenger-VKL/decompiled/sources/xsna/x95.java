package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class x95 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x95(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                wzs wzsVar = (wzs) this.c;
                Long l = (Long) obj2;
                l.longValue();
                Long l2 = (Long) obj3;
                l2.longValue();
                wzsVar.invoke(l, l2);
                break;
            case 1:
                hr8 hr8Var = (hr8) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-546004487, intValue, -1, "com.vk.design.demo.presentation.screens.ButtonScreenContent.ButtonsContent.<anonymous>.<anonymous>.<anonymous> (ButtonScreenContent.kt:220)");
                    }
                    hr8Var.e(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                tyq tyqVar = (tyq) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1046208923, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:92)");
                    }
                    tyqVar.j("Placeholder + ActionButtonWithTitle", aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a aVar3 = (com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1265728970, intValue3, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.MovieRatings.<anonymous> (MovieRatingsView.kt:152)");
                    }
                    Iterator it = aVar3.c.iterator();
                    while (it.hasNext()) {
                        com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.b.a((a.C0461a) it.next(), aVar4, 0);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                w8d0 w8d0Var = (w8d0) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-48377394, intValue4, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl.Content.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockServicesListContentImpl.kt:118)");
                    }
                    w8d0Var.b0(null, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
        }
        return s3q0.a;
    }
}
