package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.toggle.features.StoriesFeatures;
import xsna.zxl0;

/* compiled from: StoriesBlockHolderFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class uql0 implements tql0 {
    public final StoryViewerRouter a;
    public final xsl0 b;
    public final wvl0 c;
    public final fsl0 d;

    public uql0(StoryViewerRouter storyViewerRouter, xsl0 xsl0Var, wvl0 wvl0Var, fsl0 fsl0Var) {
        this.a = storyViewerRouter;
        this.b = xsl0Var;
        this.c = wvl0Var;
        this.d = fsl0Var;
    }

    @Override // xsna.tql0
    public final rql0 a(Context context, ViewGroup viewGroup, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, y4m0 y4m0Var, String str) {
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_FEED_NEW_DESIGN;
        storiesFeatures.getClass();
        return new arl0(context, viewGroup, y4m0Var, mobileOfficialAppsConStoriesStat$ViewEntryPoint, str, this.c, this.a, this.b, this.d, com.vk.toggle.b.A.a(storiesFeatures) ? new byl0() : new ayl0(), 8);
    }

    @Override // xsna.tql0
    public final rql0 b(Context context, ViewGroup viewGroup, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, y4m0 y4m0Var, String str) {
        return new arl0(context, viewGroup, y4m0Var, mobileOfficialAppsConStoriesStat$ViewEntryPoint, str, this.c, this.a, this.b, this.d, new zxl0.a(context.getResources()), 24);
    }
}
