package xsna;

import android.os.SystemClock;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.viewer.api.StoryViewerRouter;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoryArchiveFragment.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class exl0 extends FunctionReferenceImpl implements izs<StoryEntry, s3q0> {
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final s3q0 invoke(StoryEntry storyEntry) {
        StoryArchiveFragment storyArchiveFragment = (StoryArchiveFragment) this.receiver;
        ((StoryViewerRouter) storyArchiveFragment.W.getValue()).h(storyArchiveFragment.kn(), ((cxl0) storyArchiveFragment.S).k6(), String.valueOf(storyEntry.c), null, (r42 & 16) != 0, MobileOfficialAppsConStoriesStat$ViewEntryPoint.ARCHIVE, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_ARCHIVE), null, (r42 & 512) != 0 ? null : null, new fxl0(storyArchiveFragment), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : StoryViewerRouter.InOutAnimation.RectToFullScreen, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : new gxl0(storyArchiveFragment), (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
        return s3q0.a;
    }
}
