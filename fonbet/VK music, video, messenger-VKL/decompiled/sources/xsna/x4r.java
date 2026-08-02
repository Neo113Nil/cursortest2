package xsna;

import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.newsfeed.api.NewsfeedRouter;

/* compiled from: FeedTrendsHandler.kt */
/* loaded from: classes7.dex */
public final class x4r implements fhd0, lao0 {
    public final NewsfeedRouter a;

    public x4r(NewsfeedRouter newsfeedRouter) {
        this.a = newsfeedRouter;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.a.f(fgxVar.e, "discover_category_trends/trends");
        blk.P(fgxVar).onSuccess();
    }
}
