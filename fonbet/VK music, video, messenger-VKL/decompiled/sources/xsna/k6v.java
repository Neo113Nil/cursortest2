package xsna;

import android.os.Bundle;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.data.b;
import java.util.List;
import org.json.JSONArray;

/* compiled from: HighlightsAnalyticsTrackerImpl.kt */
/* loaded from: classes3.dex */
public final class k6v implements j6v {
    @Override // xsna.j6v
    public final void a(NarrativePublishEventType narrativePublishEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i) {
        b.d dVar = new b.d("narrative_publish");
        dVar.b(narrativePublishEventType.toString(), "event_type");
        dVar.b(mobileOfficialAppsCoreNavStat$EventScreen, "nav_screen");
        dVar.b(new JSONArray().put(i), "story_ids");
        dVar.e();
    }

    @Override // xsna.j6v
    public final void b(NarrativePublishEventType narrativePublishEventType, String str, Narrative narrative) {
        Integer valueOf = Integer.valueOf(narrative.b);
        Long valueOf2 = Long.valueOf(narrative.c.b);
        String str2 = narrative.d;
        List<Integer> list = narrative.l;
        HighlightCover highlightCover = narrative.e;
        d(narrativePublishEventType, str, e(valueOf, valueOf2, str2, list, highlightCover != null ? up2.o(highlightCover) : null));
    }

    @Override // xsna.j6v
    public final void c(NarrativePublishEventType narrativePublishEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Narrative narrative) {
        b(narrativePublishEventType, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), narrative);
    }

    @Override // xsna.j6v
    public final void d(NarrativePublishEventType narrativePublishEventType, String str, Bundle bundle) {
        b.d dVar = new b.d("narrative_publish");
        dVar.b(narrativePublishEventType.toString(), "event_type");
        dVar.b(str, "nav_screen");
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                dVar.b(bundle.get(str2), str2);
            }
        }
        dVar.e();
    }

    @Override // xsna.j6v
    public final Bundle e(Integer num, Long l, String str, List<Integer> list, Integer num2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("narrative_id", num);
        bundle.putSerializable("narrative_owner_id", l);
        bundle.putSerializable("narrative_title", str);
        bundle.putSerializable("story_ids", list != null ? p4g.q(list) : null);
        bundle.putSerializable("cover_story_id", num2);
        return bundle;
    }

    @Override // xsna.j6v
    public final void f(NarrativePublishEventType narrativePublishEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Bundle bundle) {
        d(narrativePublishEventType, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), bundle);
    }
}
