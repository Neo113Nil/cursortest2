package xsna;

import android.view.View;
import com.vk.feed.core.models.news.LatestNews;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.data.b;

/* compiled from: LatestNewsHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class kmy extends qi6<LatestNews> {
    public View C;

    @Override // xsna.qi6
    public final void E6(LatestNews latestNews) {
        LatestNews latestNews2 = latestNews;
        NewsEntry.TrackData trackData = latestNews2.l;
        if (trackData.j) {
            return;
        }
        b.d dVar = new b.d("grouped_news_action");
        dVar.b(Integer.valueOf(latestNews2.j), "type");
        dVar.b("seen", "action");
        dVar.b(trackData.b, "track_code");
        dVar.e();
        trackData.j = true;
    }
}
