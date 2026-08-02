package xsna;

import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$VideoSeenItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;

/* compiled from: MetricsStoryViewDelegate.java */
/* loaded from: classes6.dex */
public final class kl20 {

    @NonNull
    public q7r a;

    @NonNull
    public final xkm0 a() {
        elm0 elm0Var = this.a.i0.c;
        return new xkm0(elm0Var != null ? elm0Var.getRef() : "unknown", this.a.i0.getViewEntryPoint(), this.a.i0.P0(), this.a.i0.getCurrentStory(), Long.valueOf(this.a.j));
    }

    public final void b() {
        q7r q7rVar = this.a;
        if (q7rVar.n == null || q7rVar.i0.getCurrentStory() == null || this.a.i0.getCurrentStory().m0 == null) {
            return;
        }
        this.a.n.i("pause", "pause");
    }

    public final void c() {
        q7r q7rVar = this.a;
        if (q7rVar.n == null || q7rVar.i0.getCurrentStory() == null || this.a.i0.getCurrentStory().m0 == null) {
            return;
        }
        this.a.n.i("pause", CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void d() {
        if (this.a.i0.getCurrentStory() == null || !this.a.i0.getCurrentStory().Tb()) {
            return;
        }
        q7r q7rVar = this.a;
        if (q7rVar.v != null) {
            a7m0 storyMetricsCollector = q7rVar.i0.getStoryMetricsCollector();
            StoryEntry currentStory = this.a.i0.getCurrentStory();
            int a = this.a.i0.b.a();
            long duration = this.a.v.getDuration();
            storyMetricsCollector.getClass();
            long j = currentStory.c;
            long j2 = currentStory.d.b;
            MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType contentType = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType.STORY;
            MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype contentSubtype = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype.VIDEO;
            MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType eventType = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.SEEN;
            MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(j2, contentType, x260.b(com.vk.core.utils.newtork.b.c()), Long.valueOf(j), contentSubtype, vhk0.f(), null, null, null, null, null, null, null, eventType, null, null, null, new MobileOfficialAppsConStoriesStat$VideoSeenItem(duration, Integer.valueOf(a)), null, null, null, null, null, null, null, null, null, null, null, null, null, 2147344320, null);
            kx6 kx6Var = new kx6();
            kx6Var.f = mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
            kx6Var.q();
        }
    }
}
