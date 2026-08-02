package xsna;

import android.app.Activity;
import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.PromoStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesBlockEventDispatcher;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesHolderViewImpl;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.aex;
import xsna.o0r0;
import xsna.udx;

/* compiled from: InterestingStoriesHolderPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class zex implements pdx, w8i {
    public final InterestingStoriesHolderViewImpl b;
    public final Object c;
    public final ListDataSet<aex> d;
    public tdx e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public io.reactivex.rxjava3.disposables.b n;

    /* compiled from: InterestingStoriesHolderPresenterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverBlockType.values().length];
            try {
                iArr[DiscoverBlockType.PHONE_BOOK_STORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverBlockType.DISCOVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscoverBlockType.SOCIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DiscoverBlockType.FEED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zex(InterestingStoriesHolderViewImpl interestingStoriesHolderViewImpl) {
        this.b = interestingStoriesHolderViewImpl;
        gc gcVar = new gc(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, gcVar);
        this.d = new ListDataSet<>();
        this.f = msy.a(lazyThreadSafetyMode, new pr1(25));
        this.g = msy.a(lazyThreadSafetyMode, new ldl(this, 20));
        this.h = msy.a(lazyThreadSafetyMode, new xrj(this, 15));
        this.i = msy.a(lazyThreadSafetyMode, new rkt(this, 6));
        this.j = msy.a(lazyThreadSafetyMode, new nuv(this, 3));
        this.k = msy.a(lazyThreadSafetyMode, new m2g(this, 27));
        int i = 2;
        this.l = msy.a(lazyThreadSafetyMode, new s1x(this, i));
        this.m = msy.a(lazyThreadSafetyMode, new tzv(this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(zex zexVar, Context context, StoriesContainer storiesContainer, List list, Integer num) {
        String str;
        String str2;
        ?? r3 = zexVar.f;
        Activity h = e3m.h(context);
        if (h == 0) {
            return;
        }
        ArrayList<StoriesContainer> c = ((wvl0) zexVar.j.getValue()).c(list);
        tdx tdxVar = zexVar.e;
        DiscoverBlockType discoverBlockType = tdxVar != null ? tdxVar.e : null;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = (discoverBlockType == null ? -1 : a.$EnumSwitchMapping$0[discoverBlockType.ordinal()]) == 1 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_FEED_BLOCK : MobileOfficialAppsConStoriesStat$ViewEntryPoint.STORIES_FEED_BLOCK;
        DiscoverStoriesContainer j = zexVar.j();
        if (j == null || (str2 = j.o) == null) {
            tdx tdxVar2 = zexVar.e;
            if (tdxVar2 == null) {
                str = null;
                tdx tdxVar3 = zexVar.e;
                String str3 = tdxVar3 == null ? tdxVar3.g : null;
                MobileOfficialAppsConStoriesStat$ViewEntryPoint a2 = gan.a(storiesContainer, c, mobileOfficialAppsConStoriesStat$ViewEntryPoint);
                StoriesContainer storiesContainer2 = !(storiesContainer instanceof DiscoverStoriesContainer) ? null : storiesContainer;
                if (((Boolean) r3.getValue()).booleanValue()) {
                    Iterator<ydx> it = zexVar.k().iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().H1();
                        } catch (Throwable th) {
                            L.i(th);
                        }
                    }
                }
                StoryViewerRouter storyViewerRouter = (StoryViewerRouter) zexVar.i.getValue();
                String Ob = storiesContainer.Ob();
                Object obj = udx.c;
                storyViewerRouter.k(new h1m0(new com.vk.story.viewer.api.a(h, c, Ob, storiesContainer2, mobileOfficialAppsConStoriesStat$ViewEntryPoint, a2, udx.a.a(), str, str3, new kr(23), ((Boolean) r3.getValue()).booleanValue() ? new yex(zexVar, 0) : null, !(h instanceof f5z) ? (f5z) h : null), new enm0(num)));
            }
            str2 = tdxVar2.f;
        }
        str = str2;
        tdx tdxVar32 = zexVar.e;
        if (tdxVar32 == null) {
        }
        MobileOfficialAppsConStoriesStat$ViewEntryPoint a22 = gan.a(storiesContainer, c, mobileOfficialAppsConStoriesStat$ViewEntryPoint);
        if (!(storiesContainer instanceof DiscoverStoriesContainer)) {
        }
        if (((Boolean) r3.getValue()).booleanValue()) {
        }
        StoryViewerRouter storyViewerRouter2 = (StoryViewerRouter) zexVar.i.getValue();
        String Ob2 = storiesContainer.Ob();
        Object obj2 = udx.c;
        if (!(h instanceof f5z)) {
        }
        storyViewerRouter2.k(new h1m0(new com.vk.story.viewer.api.a(h, c, Ob2, storiesContainer2, mobileOfficialAppsConStoriesStat$ViewEntryPoint, a22, udx.a.a(), str, str3, new kr(23), ((Boolean) r3.getValue()).booleanValue() ? new yex(zexVar, 0) : null, !(h instanceof f5z) ? (f5z) h : null), new enm0(num)));
    }

    @Override // xsna.pdx
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.disposables.b bVar = this.n;
        if (bVar != null) {
            bVar.b(cVar);
        }
    }

    @Override // xsna.pdx
    public final void b(Context context, StoryEntry storyEntry) {
        DiscoverBlockType discoverBlockType;
        StoriesContainer l;
        List<StoriesContainer> list;
        tdx tdxVar = this.e;
        if (tdxVar == null || (discoverBlockType = tdxVar.e) == null || (l = l(storyEntry)) == null) {
            return;
        }
        Iterator<StoryEntry> it = l.g.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            StoryEntry next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (next.c == storyEntry.c) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i != -1 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            int i2 = a.$EnumSwitchMapping$0[discoverBlockType.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                tdx tdxVar2 = this.e;
                list = tdxVar2 != null ? tdxVar2.d : EmptyList.b;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                list = i();
            }
            m(this, context, l, list, valueOf);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pdx
    public final boolean c(StoryEntry storyEntry) {
        ArrayList<StoriesContainer> arrayList;
        Object obj;
        GetStoriesResponse i = ((lrl0) this.m.getValue()).i();
        if (i != null && (arrayList = i.c) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<StoriesContainer> it = arrayList.iterator();
            while (it.hasNext()) {
                g5g.y(it.next().g, arrayList2);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((StoryEntry) obj).c == storyEntry.c) {
                    break;
                }
            }
            StoryEntry storyEntry2 = (StoryEntry) obj;
            if (storyEntry2 != null) {
                return storyEntry2.c0;
            }
        }
        return storyEntry.c0;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pdx
    public final void d(Context context, StoryEntry storyEntry) {
        udx h = h();
        anm0 anm0Var = h.a;
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.GO_TO_AUTHOR_BUTTON;
        Object obj = udx.c;
        anm0.f(anm0Var, eventType, udx.a.a(), h.b(), storyEntry, null, 48);
        ((o0r0) this.k.getValue()).m(context, storyEntry.d, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pdx
    public final io.reactivex.rxjava3.core.a e(aex.a aVar) {
        io.reactivex.rxjava3.core.a g;
        StoryEntry b = aVar.b();
        StoriesContainer l = l(b);
        if (l == null) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        int c = bn10.c(aVar.a() != null ? bn10.c((int) (r1.a / (r1.b / 100.0f)), 0, 100) : 1, 1, 100);
        udx h = h();
        rdx a2 = aVar.a();
        h.getClass();
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = !b.c0 ? MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_LIKE : MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_UNLIKE;
        u8m0 a3 = udx.a(b, l, a2);
        anm0.f(h.a, eventType, udx.a.a(), h.b(), b, a3, 32);
        if (!b.c0) {
            anm0.f(h.a, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.VIEW_STORY, udx.a.a(), h.b(), b, a3, 32);
        }
        boolean z = b.c0;
        ?? r8 = this.g;
        if (z) {
            g = ((xsl0) r8.getValue()).g(b, MobileOfficialAppsCoreNavStat$EventScreen.STORIES_INTERESTING_BLOCK);
        } else {
            rul0 rul0Var = (rul0) this.h.getValue();
            UserId c2 = o25.a().c();
            MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.STORIES_FEED_BLOCK_PREVIEW;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORIES_INTERESTING_BLOCK;
            rul0Var.e(c2, b, mobileOfficialAppsConStoriesStat$ViewEntryPoint, c, true, mobileOfficialAppsCoreNavStat$EventScreen);
            g = ((xsl0) r8.getValue()).k(b, null, mobileOfficialAppsCoreNavStat$EventScreen);
        }
        return g.o(asu0.a.d()).i(new c40(new b40(20), 25));
    }

    @Override // xsna.pdx
    public final void f() {
        StoryEntry b;
        StoriesContainer l;
        aex.a g = k().g();
        if (g == null || (l = l((b = g.b()))) == null) {
            return;
        }
        udx h = h();
        rdx a2 = g.a();
        h.getClass();
        anm0.f(h.a, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.PREVIEW_VIEW, udx.a.a(), h.b(), b, udx.a(b, l, a2), 32);
    }

    @Override // xsna.pdx
    public final void g(Context context) {
        DiscoverBlockType discoverBlockType;
        List<StoriesContainer> list;
        StoriesContainer storiesContainer;
        tdx tdxVar = this.e;
        if (tdxVar == null || (discoverBlockType = tdxVar.e) == null) {
            return;
        }
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[discoverBlockType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            ArrayList arrayList = new ArrayList();
            tdx tdxVar2 = this.e;
            if (tdxVar2 != null) {
                arrayList.addAll(tdxVar2.d);
            }
            DiscoverStoriesContainer j = j();
            list = arrayList;
            if (j != null) {
                arrayList.add(j);
                list = arrayList;
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            list = i();
        }
        int i2 = iArr[discoverBlockType.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            storiesContainer = (StoriesContainer) j5g.k0(list);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            tdx tdxVar3 = this.e;
            storiesContainer = (StoriesContainer) j5g.b0(tdxVar3 != null ? tdxVar3.b : 0, list);
        }
        if (storiesContainer == null) {
            return;
        }
        udx h = h();
        anm0 anm0Var = h.a;
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.SHOW_ALL;
        Object obj = udx.c;
        anm0.f(anm0Var, eventType, udx.a.a(), h.b(), null, null, 48);
        m(this, context, storiesContainer, list, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final udx h() {
        return (udx) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List<StoriesContainer> i() {
        ArrayList<StoriesContainer> arrayList;
        GetStoriesResponse i = ((lrl0) this.m.getValue()).i();
        if (i == null || (arrayList = i.c) == null) {
            tdx tdxVar = this.e;
            return tdxVar != null ? tdxVar.d : EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<StoriesContainer> it = arrayList.iterator();
        while (it.hasNext()) {
            StoriesContainer next = it.next();
            StoriesContainer storiesContainer = next;
            if (!storiesContainer.Qb() && !(storiesContainer instanceof PromoStoriesContainer) && !fsk.A(storiesContainer) && !(storiesContainer instanceof LiveFinishedStoriesContainer)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final DiscoverStoriesContainer j() {
        StoriesContainer storiesContainer;
        ArrayList<StoriesContainer> arrayList;
        StoriesContainer storiesContainer2;
        GetStoriesResponse i = ((lrl0) this.m.getValue()).i();
        if (i == null || (arrayList = i.c) == null) {
            storiesContainer = null;
        } else {
            Iterator<StoriesContainer> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    storiesContainer2 = null;
                    break;
                }
                storiesContainer2 = it.next();
                if (storiesContainer2 instanceof DiscoverStoriesContainer) {
                    break;
                }
            }
            storiesContainer = storiesContainer2;
        }
        if (storiesContainer instanceof DiscoverStoriesContainer) {
            return (DiscoverStoriesContainer) storiesContainer;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final InterestingStoriesBlockEventDispatcher k() {
        return (InterestingStoriesBlockEventDispatcher) this.c.getValue();
    }

    public final StoriesContainer l(StoryEntry storyEntry) {
        tdx tdxVar = this.e;
        Object obj = null;
        if (tdxVar == null) {
            return null;
        }
        Iterator it = tdxVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((StoriesContainer) next).g.contains(storyEntry)) {
                obj = next;
                break;
            }
        }
        return (StoriesContainer) obj;
    }
}
