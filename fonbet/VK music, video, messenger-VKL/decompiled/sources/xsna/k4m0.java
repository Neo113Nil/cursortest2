package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.Locale;

/* compiled from: StoryHandler.kt */
/* loaded from: classes7.dex */
public final class k4m0 implements fhd0, lao0 {
    public final StoryViewerRouter a;

    public k4m0(StoryViewerRouter storyViewerRouter) {
        this.a = storyViewerRouter;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        String a = fgxVar.a("access_key");
        String c = fgxVar.c("id");
        if (a != null && a.length() != 0) {
            c = v1v.a('_', c, a);
        }
        String str = c;
        LaunchContext O = blk.O(fgxVar);
        Context context = fgxVar.e;
        LoadContext a2 = LoadContext.a.a(fgxVar.a("context"));
        String a3 = com.vk.story.api.a.a(fgxVar.a("action"));
        String str2 = O.d;
        if (str2 == null) {
            str2 = O.e;
        }
        String str3 = str2;
        String str4 = O.j;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = null;
        if (str4 != null) {
            try {
                mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.valueOf(str4.toUpperCase(Locale.ROOT));
            } catch (Throwable unused) {
            }
        }
        StoryViewerRouter.d(this.a, context, null, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, a2, str3, null, a3, null, 3394);
        blk.P(fgxVar).onSuccess();
    }
}
