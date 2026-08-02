package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.api.generated.stories.dto.StoriesMarkSeenSourceDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: StoriesSeenInteractorImpl.kt */
/* loaded from: classes11.dex */
public final class sul0 implements rul0 {
    public final lul0 a;
    public final p870 b;
    public final lrl0 c;
    public final ztl0 d;
    public final bpn0 e;
    public final HashSet<String> f = new HashSet<>();
    public final HashSet<String> g = new HashSet<>();
    public final HashSet<String> h = new HashSet<>();
    public final HashSet<String> i = new HashSet<>();
    public Object j = EmptyList.b;
    public final WeakHashMap<StoriesContainer, StoryEntry> k = new WeakHashMap<>();
    public final Object l = msy.a(LazyThreadSafetyMode.NONE, new j55(11));

    /* compiled from: StoriesSeenInteractorImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public a(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: StoriesSeenInteractorImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: StoriesSeenInteractorImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public c(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: StoriesSeenInteractorImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public d(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public sul0(lul0 lul0Var, p870 p870Var, lrl0 lrl0Var, ztl0 ztl0Var, bpn0 bpn0Var) {
        this.a = lul0Var;
        this.b = p870Var;
        this.c = lrl0Var;
        this.d = ztl0Var;
        this.e = bpn0Var;
    }

    @Override // xsna.rul0
    public final void b(int i, UserId userId) {
        ((jfm0) this.e.getValue()).b(i, userId);
    }

    @Override // xsna.rul0
    public final void c() {
        this.c.e((Collection) this.j, new y160(11));
        this.j = EmptyList.b;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rul0
    public final void d(StoriesContainer storiesContainer, StoryEntry storyEntry) {
        CopyOnWriteArrayList<StoryEntry> Mb = storiesContainer.Mb();
        StringBuilder sb = new StringBuilder("Send markseen all: ");
        sb.append(storyEntry != null ? storyEntry.Yb() : null);
        L.e(sb.toString());
        if (!((Boolean) this.l.getValue()).booleanValue()) {
            itg0.h(this.a.b(Mb), new edd(this, storiesContainer, Mb, 5), new a(L.a));
        } else {
            this.c.k(storiesContainer);
            this.b.e(100, Mb);
        }
    }

    @Override // xsna.rul0
    public final void e(UserId userId, StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, int i, boolean z, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        String Yb = storyEntry.Yb();
        if (storyEntry.F) {
            HashSet<String> hashSet = this.f;
            if (!hashSet.contains(Yb)) {
                this.d.a(StoryViewAction.IMPRESSION, storyEntry);
            }
            hashSet.add(Yb);
        }
        String Yb2 = storyEntry.Yb();
        if (i == 0 || storyEntry.B || this.g.contains(storyEntry.Kb()) || storyEntry.c < 0) {
            return;
        }
        if (storyEntry.i0) {
            if (storyEntry.k0 == 0) {
                storyEntry.k0 = System.currentTimeMillis() / 1000;
            }
            storyEntry.j0++;
            storyEntry.i = i;
            storyEntry.C = storyEntry.C && fvr.p(storyEntry, userId);
            this.b.e(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, Collections.singletonList(storyEntry));
        } else {
            HashSet<String> hashSet2 = this.i;
            if (!z && (this.h.contains(Yb2) || hashSet2.contains(Yb2))) {
                return;
            } else {
                hashSet2.add(Yb2);
            }
        }
        L.e("Send markseen: " + storyEntry.Yb());
        avl0 avl0Var = this.a.a;
        UserId userId2 = storyEntry.d;
        int i2 = storyEntry.c;
        String str = storyEntry.o;
        StoriesMarkSeenSourceDto a2 = rtl0.a(mobileOfficialAppsConStoriesStat$ViewEntryPoint);
        String str2 = storyEntry.u;
        String a3 = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i);
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.markSeen", new qjk0(2), new rjk0(1));
        if (userId2 != null) {
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
        }
        tfx.l(tfxVar, "story_id", valueOf.intValue(), 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        if (a2 != null) {
            tfx.o(tfxVar, "source", a2.i(), 0, 0, 12);
        }
        tfxVar.j("all", false);
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        tfxVar.f(valueOf2.intValue(), 0, 100, NotificationCompat.CATEGORY_PROGRESS);
        tfx.o(tfxVar, "nav_screen", a3, 0, 0, 12);
        itg0.h(lul0.c(tfxVar), new dda(this, storyEntry, Yb2, 8), new rte(this, storyEntry, Yb2, 7));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rul0
    public final void f(List<? extends StoryEntry> list) {
        int i;
        List<? extends StoryEntry> list2 = list;
        boolean z = list2 instanceof Collection;
        boolean z2 = false;
        if (z && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((StoryEntry) it.next()).h && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        if (i == 0) {
            return;
        }
        if (!((Boolean) this.l.getValue()).booleanValue()) {
            itg0.h(this.a.b(list), new r5i0(2, this, list), new c(L.a));
            return;
        }
        this.c.f(list);
        if (!z || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((StoryEntry) it2.next()).R != null) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            ((jfm0) this.e.getValue()).n(list);
        }
        this.b.e(100, list);
    }

    @Override // xsna.rul0
    public final io.reactivex.rxjava3.core.x<Boolean> g(StoryEntry storyEntry, long j) {
        avl0 avl0Var = this.a.a;
        UserId userId = storyEntry.d;
        int i = storyEntry.c;
        String str = storyEntry.o;
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.markAppNotificationsSeen", new zjh0(4), new bkh0(4));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        tfx.l(tfxVar, "sticker_id", (int) j, 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "access_key", str, 0, 0, 12);
        }
        return lul0.c(tfxVar);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rul0
    public final void h(StoriesContainer storiesContainer, StoryEntry storyEntry) {
        ArrayList a2;
        int indexOf;
        WeakHashMap<StoriesContainer, StoryEntry> weakHashMap = this.k;
        if (epx.f(weakHashMap.get(storiesContainer), storyEntry) || (indexOf = (a2 = i7o0.a(storiesContainer.Mb())).indexOf(storyEntry)) == -1) {
            return;
        }
        weakHashMap.put(storiesContainer, storyEntry);
        List<? extends StoryEntry> subList = a2.subList(0, indexOf + 1);
        if (!((Boolean) this.l.getValue()).booleanValue()) {
            itg0.h(this.a.b(subList), new hcf0(1, this, subList), new b(L.a));
            return;
        }
        this.c.f(subList);
        List<? extends StoryEntry> list = subList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((StoryEntry) it.next()).R != null) {
                    ((jfm0) this.e.getValue()).n(subList);
                    break;
                }
            }
        }
        this.b.e(100, subList);
    }

    @Override // xsna.rul0
    public final void i(boolean z) {
        HashSet<String> hashSet = this.i;
        HashSet<String> hashSet2 = this.h;
        HashSet<String> hashSet3 = this.f;
        if (z) {
            hashSet2.removeAll(hashSet3);
            hashSet.removeAll(hashSet3);
            hashSet3.clear();
        } else {
            hashSet2.clear();
            hashSet.clear();
            hashSet3.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // xsna.rul0
    public final void j(StoryEntry storyEntry) {
        if (this.j.contains(storyEntry)) {
            return;
        }
        this.j = j5g.v0(storyEntry, (Collection) this.j);
        lul0 lul0Var = this.a;
        avl0 avl0Var = lul0Var.a;
        UserId userId = storyEntry.d;
        int i = storyEntry.c;
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.seenReplies", new rq(27), new sq(25));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        itg0.g(rsg0.Z(yfb.x(tfxVar)), new p5(27, this, storyEntry), new d(L.a));
        if (storyEntry.Z > 0) {
            avl0 avl0Var2 = lul0Var.a;
            UserId userId2 = storyEntry.d;
            int i2 = storyEntry.c;
            avl0Var2.getClass();
            tfx tfxVar2 = new tfx("stories.markQuestionsSeen", new koi0(5), new thl0(2));
            tfx.n(tfxVar2, "owner_id", userId2, 0L, 0L, 12);
            tfx.l(tfxVar2, "story_id", i2, 0, 0, 8);
            itg0.j(rsg0.Z(yfb.x(tfxVar2)), null, 3);
        }
    }
}
