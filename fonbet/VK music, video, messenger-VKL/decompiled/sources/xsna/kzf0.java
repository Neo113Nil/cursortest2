package xsna;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: RenderingNestedItemsMeasurerImpl.kt */
/* loaded from: classes4.dex */
public final class kzf0 implements jzf0 {
    public final ArrayList<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime> a;
    public int b;

    public kzf0(ArrayList<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime> arrayList) {
        this.a = arrayList;
    }

    @Override // xsna.jzf0
    public final void a(String str, y1n y1nVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(System.currentTimeMillis());
        y1nVar.invoke();
        this.a.add(new MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime(new MobileOfficialAppsFeedStat$FeedTimeRange(String.valueOf(micros), String.valueOf(timeUnit.toMicros(System.currentTimeMillis()))), str, Integer.valueOf(this.b), null, 8, null));
        this.b++;
    }
}
