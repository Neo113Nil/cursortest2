package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.ironsource.C4504q2;
import com.vk.common.links.LaunchContext;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.im.reporters.api.engine.LongPollReporter;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stories.exceptions.StoryNotAccessibleException;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mtl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mtl0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                yp80 yp80Var = (yp80) this.d;
                LaunchContext launchContext = (LaunchContext) this.e;
                String str = (String) this.f;
                StoryEntry storyEntry = (StoryEntry) obj;
                boolean z = storyEntry.B;
                if (z || !storyEntry.C) {
                    enj.q(z ? R.string.story_reply_not_accessible_deleted : R.string.story_reply_not_accessible_privacy, 0, context);
                    if (yp80Var != null) {
                        yp80Var.onError(new StoryNotAccessibleException());
                    }
                    break;
                } else {
                    String str2 = launchContext.e;
                    Iterator<E> it = MobileOfficialAppsCoreNavStat$EventScreen.i().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (brm0.w(((MobileOfficialAppsCoreNavStat$EventScreen) obj2).name(), str2, true)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) obj2;
                    if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LINK;
                    }
                    if (str == null) {
                        str = launchContext.e;
                    }
                    com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(mobileOfficialAppsCoreNavStat$EventScreen, epx.f(str, C4504q2.x) ? MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_REPOST_NOTIFICATIONS : epx.f(str, "im") ? MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_REPOST_IM : MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_REPOST);
                    StoryCameraParams.a.r(aVar, o25.a().c(), null, 6);
                    aVar.q = new StoryEntryExtended(storyEntry, storyEntry.l0, false);
                    aVar.C(context);
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                    }
                    break;
                }
                break;
            default:
                w2w w2wVar = (w2w) this.c;
                List<e500> list = (List) this.d;
                aox aoxVar = (aox) this.e;
                c400 c400Var = (c400) this.f;
                ?? r13 = s6o0.b;
                LongPollReporter u = w2wVar.K().u();
                for (e500 e500Var : list) {
                    aoxVar.b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    e500Var.e(c400Var);
                    LongPollReporter.LongPollTask longPollTask = (LongPollReporter.LongPollTask) r13.get(e500Var.getClass());
                    if (longPollTask != null) {
                        u.d(longPollTask, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }
                }
                aoxVar.b();
                i1r0 i1r0Var = new i1r0(c400Var.a, w2wVar.f1());
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                i1r0Var.o(w2wVar);
                LongPollReporter.LongPollTask longPollTask2 = (LongPollReporter.LongPollTask) r13.get(i1r0.class);
                if (longPollTask2 != null) {
                    u.d(longPollTask2, SystemClock.elapsedRealtime() - elapsedRealtime2);
                }
                aoxVar.b();
                mcp mcpVar = new mcp(c400Var.b);
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                mcpVar.o(w2wVar);
                LongPollReporter.LongPollTask longPollTask3 = (LongPollReporter.LongPollTask) r13.get(mcp.class);
                if (longPollTask3 != null) {
                    u.d(longPollTask3, SystemClock.elapsedRealtime() - elapsedRealtime3);
                }
                aoxVar.b();
                kqu kquVar = new kqu(c400Var.c, w2wVar.f1());
                long elapsedRealtime4 = SystemClock.elapsedRealtime();
                kquVar.o(w2wVar);
                LongPollReporter.LongPollTask longPollTask4 = (LongPollReporter.LongPollTask) r13.get(kqu.class);
                if (longPollTask4 != null) {
                    u.d(longPollTask4, SystemClock.elapsedRealtime() - elapsedRealtime4);
                }
                break;
        }
        return s3q0.a;
    }
}
