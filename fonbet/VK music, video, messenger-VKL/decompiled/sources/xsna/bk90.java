package xsna;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: ParsingNestedItemsMeasurerImpl.kt */
/* loaded from: classes4.dex */
public final class bk90 implements ak90 {
    public final ArrayList<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime> a;
    public int b;

    public bk90(ArrayList<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime> arrayList) {
        this.a = arrayList;
    }

    @Override // xsna.ak90
    public final void a(String str, f4n f4nVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(System.currentTimeMillis());
        f4nVar.invoke();
        this.a.add(new MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime(new MobileOfficialAppsFeedStat$FeedTimeRange(String.valueOf(micros), String.valueOf(timeUnit.toMicros(System.currentTimeMillis()))), str, Integer.valueOf(this.b), null, 8, null));
        this.b++;
    }
}
