package xsna;

import android.os.Bundle;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;

/* compiled from: HighlightsAnalyticsTracker.kt */
/* loaded from: classes3.dex */
public interface j6v {
    void a(NarrativePublishEventType narrativePublishEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i);

    void b(NarrativePublishEventType narrativePublishEventType, String str, Narrative narrative);

    void c(NarrativePublishEventType narrativePublishEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Narrative narrative);

    void d(NarrativePublishEventType narrativePublishEventType, String str, Bundle bundle);

    Bundle e(Integer num, Long l, String str, List<Integer> list, Integer num2);

    void f(NarrativePublishEventType narrativePublishEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Bundle bundle);
}
