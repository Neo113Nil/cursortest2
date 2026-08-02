package xsna;

import android.content.Intent;
import android.os.Handler;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.StoryAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xsna.pdv0;
import xsna.us80;

/* compiled from: GetterCallbackStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final class yxt implements nzl0 {
    public final /* synthetic */ q7r a;
    public final /* synthetic */ kl20 b;
    public final /* synthetic */ eza0 c;
    public final /* synthetic */ jz50 d;

    public yxt(q7r q7rVar, kl20 kl20Var, eza0 eza0Var, jz50 jz50Var) {
        this.a = q7rVar;
        this.b = kl20Var;
        this.c = eza0Var;
        this.d = jz50Var;
    }

    @Override // xsna.nzl0
    public final boolean a(UserId userId) {
        return o25.a().a(userId);
    }

    @Override // xsna.nzl0
    public final void b(int i, UserId userId) {
        this.a.i0.getDependencies().b.b(i, userId);
    }

    @Override // xsna.nzl0
    public final void c() {
        jz50 jz50Var = this.d;
        if (jz50Var.b.i0.getCurrentStory() == null || !jz50Var.b.i0.getCurrentStory().q) {
            return;
        }
        mkm0 mkm0Var = jz50Var.b.i0;
        if (mkm0Var.f || mkm0Var.c == null) {
            return;
        }
        jz50Var.f.b();
        anm0 anm0Var = jz50Var.b.i0.getDependencies().f;
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_SHARE;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER;
        anm0Var.q(eventType, mobileOfficialAppsCoreNavStat$EventScreen, jz50Var.b.i0.getViewEntryPoint(), jz50Var.b.i0.getCurrentStory(), jz50Var.b.i0.P0(), null);
        if (!(jz50Var.b.i0.getStoriesContainer() instanceof HighlightStoriesContainer)) {
            jz50Var.b.i0.c.R2(new StoryAttachment(jz50Var.b.i0.getCurrentStory(), jz50Var.b.i0.getStoriesContainer().b));
            return;
        }
        j6v j6vVar = jz50Var.b.i0.getDependencies().c;
        Narrative narrative = ((HighlightStoriesContainer) jz50Var.b.i0.getStoriesContainer()).o;
        j6vVar.c(NarrativePublishEventType.SHARE_NARRATIVE, mobileOfficialAppsCoreNavStat$EventScreen, narrative);
        jz50Var.b.i0.c.R2(new NarrativeAttachment(narrative));
    }

    @Override // xsna.nzl0
    public final void d() {
        this.d.b(true, null, null);
    }

    @Override // xsna.nzl0
    public final boolean e() {
        mkm0 mkm0Var = this.a.i0;
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if (currentStory == null) {
            return false;
        }
        return mkm0Var.getDependencies().o.m(currentStory.c);
    }

    @Override // xsna.mbm0
    public final void f(MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint, boolean z) {
        String lowerCase = creationEntryPoint.name().toLowerCase(Locale.getDefault());
        spl0 a = b6m.a();
        jz50 jz50Var = this.d;
        Intent h = a.h(jz50Var.b.i0.getContext(), jz50Var.b.i0.getCurrentStory(), jz50Var.b.i0.getStoriesContainer(), lowerCase, z);
        elm0 elm0Var = jz50Var.b.i0.c;
        if (elm0Var != null) {
            elm0Var.k(h);
            if (z) {
                jz50Var.b.i0.getDependencies().f.q(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.SHARE_TO_STORY, MobileOfficialAppsCoreNavStat$EventScreen.STORY_ARCHIVE, jz50Var.b.i0.getViewEntryPoint(), jz50Var.b.i0.getCurrentStory(), jz50Var.b.i0.P0(), null);
            } else {
                jz50Var.b.i0.f1(StoryViewAction.REPLY, null);
            }
        }
    }

    @Override // xsna.nzl0
    public final void g(m8m0 m8m0Var) {
        umm0 umm0Var = this.a.i0.b;
        if (umm0Var != null) {
            umm0Var.h.add(m8m0Var);
        }
    }

    @Override // xsna.nzl0
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint getViewEntryPoint() {
        return this.a.i0.getViewEntryPoint();
    }

    @Override // xsna.nzl0
    public final void h(zzs zzsVar) {
        this.d.d(this.a.i0.getCurrentStory(), false, false, zzsVar);
    }

    @Override // xsna.nzl0
    public final io.reactivex.rxjava3.core.a i(StoryEntry storyEntry, boolean z, Integer num) {
        q7r q7rVar = this.a;
        mkm0 mkm0Var = q7rVar.i0;
        if (z) {
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_NEW_REACTIONS;
            storiesFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (!bVar.a(storiesFeatures)) {
                StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_REACTION_STICKER;
                storiesFeatures2.getClass();
                if (!bVar.a(storiesFeatures2)) {
                    mkm0Var.f1(StoryViewAction.CLICK_TO_LIKE, new rlh(q7rVar, 11));
                }
            }
            return mkm0Var.getDependencies().a.k(storyEntry, num, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER);
        }
        StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_NEW_REACTIONS;
        storiesFeatures3.getClass();
        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
        if (!bVar2.a(storiesFeatures3)) {
            StoriesFeatures storiesFeatures4 = StoriesFeatures.ST_REACTION_STICKER;
            storiesFeatures4.getClass();
            if (!bVar2.a(storiesFeatures4)) {
                mkm0Var.f1(StoryViewAction.CLICK_TO_UNLIKE, new rlh(q7rVar, 11));
            }
        }
        return mkm0Var.getDependencies().a.g(storyEntry, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER);
    }

    @Override // xsna.nzl0
    public final boolean isPlaying() {
        return this.a.j0.w;
    }

    @Override // xsna.nzl0
    public final void j() {
        xmm0 xmm0Var = this.a.V;
        if (xmm0Var != null) {
            xmm0Var.a(false);
        }
    }

    @Override // xsna.nzl0
    public final void k() {
        this.d.e();
    }

    @Override // xsna.nzl0
    public final boolean l() {
        return this.a.u0.e;
    }

    @Override // xsna.nzl0
    public final void m(Narrative narrative) {
        UserId userId;
        x4m0 x4m0Var = this.d.c;
        x4m0Var.getClass();
        int i = narrative.b;
        mkm0 mkm0Var = x4m0Var.c;
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if (currentStory == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<Integer> list = narrative.l;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Number) it.next()).intValue() == currentStory.c) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            arrayList.add(new us80.c(currentStory.c, i));
        } else {
            arrayList.add(new us80.a(currentStory.c, i));
        }
        StoryEntry currentStory2 = mkm0Var.getCurrentStory();
        if (currentStory2 == null || (userId = currentStory2.d) == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.b bVar = x4m0Var.e;
        io.reactivex.rxjava3.core.x h = x4m0Var.a.h(userId, arrayList);
        asu0 asu0Var = asu0.a;
        bVar.b(h.q(asu0Var.c()).m(asu0Var.d()).subscribe(new uu60(new r2m0(narrative, z, currentStory, x4m0Var), 21), new hdi0(new u9e(x4m0Var, 7), 2)));
    }

    @Override // xsna.nzl0
    public final void n(StoryEntry storyEntry) {
        mkm0 mkm0Var = this.a.i0;
        if (mkm0Var.R0()) {
            mkm0Var.getDependencies().b.j(storyEntry);
        }
    }

    @Override // xsna.nzl0
    public final io.reactivex.rxjava3.core.q<tnm0> o(v3u0 v3u0Var, LoadStrategy loadStrategy) {
        return this.a.i0.getDependencies().u.f(v3u0Var, loadStrategy);
    }

    @Override // xsna.nzl0
    public final u8m0 p() {
        return this.a.i0.P0();
    }

    @Override // xsna.nzl0
    public final void q() {
        this.a.g.removeCallbacksAndMessages(null);
        this.c.b();
        this.b.b();
    }

    @Override // xsna.nzl0
    public final void r() {
        Handler handler = this.a.g;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new r44(this.c, 12), 300L);
        this.b.c();
    }

    @Override // xsna.nzl0
    public final void s() {
        VideoFile videoFile;
        jz50 jz50Var = this.d;
        StoryEntry currentStory = jz50Var.b.i0.getCurrentStory();
        if (currentStory == null || (videoFile = currentStory.n) == null) {
            return;
        }
        StoryOwner storyOwner = jz50Var.b.i0.getStoriesContainer().b;
        videoFile.N8(storyOwner != null ? storyOwner.Db() : null);
        pdv0.a a = vtk0.c().a(currentStory.n);
        a.E();
        a.k(e3m.h(jz50Var.b.i0.getContext()));
    }

    @Override // xsna.nzl0
    public final void t(ClickableSticker clickableSticker) {
        this.d.b(true, clickableSticker, null);
    }

    @Override // xsna.nzl0
    public final void u(ClickableApp clickableApp) {
        q7r q7rVar = this.a;
        xjc xjcVar = q7rVar.Q;
        if (xjcVar != null) {
            xjcVar.b(q7rVar.j0, clickableApp);
        }
    }

    @Override // xsna.nzl0
    public final void v() {
        iq50 iq50Var = this.a.u0;
        iq50Var.f = false;
        q7r q7rVar = iq50Var.a;
        q7rVar.i0.c1(false);
        iq50Var.b(false);
        q7rVar.i0.V0(SourceTransitionStory.CLICK);
    }

    @Override // xsna.nzl0
    public final void w(m8m0 m8m0Var) {
        umm0 umm0Var = this.a.i0.b;
        if (umm0Var != null) {
            umm0Var.h.remove(m8m0Var);
        }
    }
}
