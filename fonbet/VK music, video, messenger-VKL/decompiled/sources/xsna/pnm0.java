package xsna;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pnm0 implements izs {
    public final /* synthetic */ StoryOwner b;
    public final /* synthetic */ MobileOfficialAppsCoreNavStat$EventScreen c;
    public final /* synthetic */ rnm0 d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ MobileOfficialAppsConStoriesStat$ViewEntryPoint f;
    public final /* synthetic */ View g;

    public /* synthetic */ pnm0(StoryOwner storyOwner, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, rnm0 rnm0Var, Activity activity, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, View view) {
        this.b = storyOwner;
        this.c = mobileOfficialAppsCoreNavStat$EventScreen;
        this.d = rnm0Var;
        this.e = activity;
        this.f = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.g = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SimpleStoriesContainer simpleStoriesContainer = new SimpleStoriesContainer(this.b, EmptyList.b, null, false, 8, null);
        List singletonList = Collections.singletonList(simpleStoriesContainer);
        String Ob = simpleStoriesContainer.Ob();
        q40 q40Var = new q40(this.g, 26);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.c;
        this.d.h(this.e, singletonList, Ob, null, (r42 & 16) != 0, this.f, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, mobileOfficialAppsCoreNavStat$EventScreen != null ? mobileOfficialAppsCoreNavStat$EventScreen.name() : null, null, (r42 & 512) != 0 ? null : null, q40Var, (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
        return s3q0.a;
    }
}
