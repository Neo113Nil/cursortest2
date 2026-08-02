package xsna;

import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesAds;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: StoriesAdsControllerImpl.kt */
/* loaded from: classes11.dex */
public final class rpl0 implements qpl0 {
    public final p870 a;
    public final utl0 b;
    public StoriesAds.Settings d;
    public List<? extends StoriesContainer> e;
    public int f;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public final EnumSet<MobileOfficialAppsConStoriesStat$ViewEntryPoint> c = EnumSet.of(MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST);
    public final SparseBooleanArray g = new SparseBooleanArray();
    public final LinkedHashSet h = new LinkedHashSet();
    public boolean n = true;
    public final ArrayMap<String, Integer> o = new ArrayMap<>();

    /* compiled from: StoriesAdsControllerImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoriesAds.Settings.IntervalType.values().length];
            try {
                iArr[StoriesAds.Settings.IntervalType.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoriesAds.Settings.IntervalType.STORIES_AND_AUTHORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoriesAds.Settings.IntervalType.STORIES_AND_AUTHORS_AND_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rpl0(p870 p870Var, utl0 utl0Var) {
        this.a = p870Var;
        this.b = utl0Var;
    }

    @Override // xsna.qpl0
    public final void a(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        if (this.c.contains(mobileOfficialAppsConStoriesStat$ViewEntryPoint)) {
            boolean containsKey = this.o.containsKey(storyEntry.getId());
            int i = storyEntry.c;
            SparseBooleanArray sparseBooleanArray = this.g;
            if (!sparseBooleanArray.get(i, false)) {
                sparseBooleanArray.put(storyEntry.c, true);
                if (!containsKey) {
                    this.j++;
                    this.l = System.currentTimeMillis();
                }
            }
            UserId userId = storyEntry.d;
            LinkedHashSet linkedHashSet = this.h;
            if (!linkedHashSet.contains(userId)) {
                linkedHashSet.add(storyEntry.d);
                if (!containsKey) {
                    this.k++;
                }
            }
            if (containsKey) {
                h(storyEntry, 2);
            }
        }
    }

    @Override // xsna.qpl0
    public final StoriesContainer b(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        StoriesContainer storiesContainer;
        Object obj;
        List<? extends StoriesContainer> list = this.e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                CopyOnWriteArrayList<StoryEntry> Mb = ((StoriesContainer) obj).Mb();
                if (Mb == null || !Mb.isEmpty()) {
                    Iterator<T> it2 = Mb.iterator();
                    while (it2.hasNext()) {
                        Integer num = this.o.get(((StoryEntry) it2.next()).getId());
                        if (num != null && num.intValue() == 0) {
                            break loop0;
                        }
                    }
                }
            }
            storiesContainer = (StoriesContainer) obj;
        } else {
            storiesContainer = null;
        }
        StoriesAds.Settings settings = this.d;
        boolean z = false;
        if (settings != null && !this.m && this.c.contains(mobileOfficialAppsConStoriesStat$ViewEntryPoint)) {
            boolean z2 = settings.g() <= this.i;
            boolean z3 = settings.e() <= this.j && settings.b() <= this.k;
            int i = a.$EnumSwitchMapping$0[settings.c().ordinal()];
            if (i == 1) {
                z = z2;
            } else if (i == 2) {
                z = z3;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z2 && z3) {
                    z = true;
                }
            }
        }
        if (z) {
            return storiesContainer;
        }
        return null;
    }

    @Override // xsna.qpl0
    public final void c() {
        this.m = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // xsna.qpl0
    public final void d() {
        ?? r2;
        List<? extends StoriesContainer> list = this.e;
        if (list != null) {
            r2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof MyTargetAdStoriesContainer) {
                    r2.add(obj);
                }
            }
        } else {
            r2 = 0;
        }
        if (r2 == 0) {
            r2 = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) r2) {
            if (!((MyTargetAdStoriesContainer) obj2).Vb()) {
                arrayList.add(obj2);
            }
        }
        MyTargetAdStoriesContainer myTargetAdStoriesContainer = (MyTargetAdStoriesContainer) j5g.b0(this.f, arrayList);
        if (myTargetAdStoriesContainer == null) {
            return;
        }
        this.f++;
        io.reactivex.rxjava3.internal.operators.completable.f fVar = new io.reactivex.rxjava3.internal.operators.completable.f(new gae(1, myTargetAdStoriesContainer, this));
        asu0.a.getClass();
        itg0.j(fVar.q(asu0.i()), null, 3);
    }

    @Override // xsna.qpl0
    public final void e() {
        this.m = true;
    }

    @Override // xsna.qpl0
    public final void f(StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        if (this.c.contains(mobileOfficialAppsConStoriesStat$ViewEntryPoint)) {
            String id = storyEntry.getId();
            ArrayMap<String, Integer> arrayMap = this.o;
            boolean containsKey = arrayMap.containsKey(id);
            if (this.l != 0 && !containsKey) {
                this.i += (int) ((System.currentTimeMillis() - this.l) / 1000);
            }
            if (containsKey) {
                Integer num = arrayMap.get(storyEntry.getId());
                if ((num != null ? num.intValue() : 0) < 3) {
                    this.k = 0;
                    this.j = 0;
                    this.i = 0;
                    this.m = false;
                }
                h(storyEntry, 3);
            }
            this.l = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // xsna.qpl0
    public final void g(StoriesAds storiesAds) {
        ?? r4;
        utl0 utl0Var = this.b;
        utl0Var.a();
        this.f = 0;
        ArrayMap<String, Integer> arrayMap = this.o;
        arrayMap.clear();
        this.d = storiesAds != null ? storiesAds.a() : null;
        List<StoriesContainer> b = storiesAds != null ? storiesAds.b() : null;
        this.e = b;
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                for (StoryEntry storyEntry : ((StoriesContainer) it.next()).Mb()) {
                    if (!arrayMap.containsKey(storyEntry.getId())) {
                        arrayMap.put(storyEntry.getId(), 0);
                    }
                }
            }
        }
        List<? extends StoriesContainer> list = this.e;
        if (list != null) {
            r4 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof MyTargetAdStoriesContainer) {
                    r4.add(obj);
                }
            }
        } else {
            r4 = 0;
        }
        if (r4 == 0) {
            r4 = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) r4) {
            if (((MyTargetAdStoriesContainer) obj2).Vb()) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MyTargetAdStoriesContainer myTargetAdStoriesContainer = (MyTargetAdStoriesContainer) it2.next();
            CopyOnWriteArrayList<StoryEntry> Mb = myTargetAdStoriesContainer.Mb();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : Mb) {
                StoryEntry storyEntry2 = (StoryEntry) obj3;
                if (storyEntry2.Pb() && utl0Var.g(storyEntry2) == null) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                utl0Var.f((StoryEntry) it3.next(), myTargetAdStoriesContainer);
            }
        }
        StoriesAds.Settings a2 = storiesAds != null ? storiesAds.a() : null;
        if (this.n) {
            this.n = false;
            this.i += a2 != null ? a2.f() : 0;
            this.j += a2 != null ? a2.d() : 0;
            this.k += a2 != null ? a2.a() : 0;
        } else {
            this.g.clear();
            this.h.clear();
            this.i = a2 != null ? a2.f() : 0;
            this.j = a2 != null ? a2.d() : 0;
            this.k = a2 != null ? a2.a() : 0;
        }
        this.m = false;
        this.a.c(127);
    }

    public final void h(StoryEntry storyEntry, int i) {
        Object obj;
        CopyOnWriteArrayList<StoryEntry> Mb;
        if (storyEntry.F) {
            String id = storyEntry.getId();
            ArrayMap<String, Integer> arrayMap = this.o;
            Integer num = arrayMap.get(id);
            if ((num != null ? num.intValue() : 0) < i) {
                arrayMap.put(id, Integer.valueOf(i));
            }
            List<? extends StoriesContainer> list = this.e;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((StoriesContainer) obj).Mb().contains(storyEntry)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                StoriesContainer storiesContainer = (StoriesContainer) obj;
                if (storiesContainer == null || (Mb = storiesContainer.Mb()) == null) {
                    return;
                }
                for (StoryEntry storyEntry2 : Mb) {
                    String id2 = storyEntry2.getId();
                    if (!id2.equals(storyEntry.getId()) && arrayMap.containsKey(id2)) {
                        String id3 = storyEntry2.getId();
                        Integer num2 = arrayMap.get(id3);
                        if ((num2 != null ? num2.intValue() : 0) < 1) {
                            arrayMap.put(id3, 1);
                        }
                    }
                }
            }
        }
    }
}
