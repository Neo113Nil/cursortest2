package xsna;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeFeedItem;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwy;
import xsna.fb80;

/* compiled from: AsapSendBlockViewTimeChecker.kt */
/* loaded from: classes4.dex */
public final class qt3 extends hk6<Object> implements j1u0 {
    public final ListDataSet<u1c0> d;
    public final List<NewsEntry> e;
    public final Object f;
    public final boolean g;
    public final boolean h;
    public final ArrayList<bwy> i;
    public final HashMap<NewsEntry, Long> j;
    public final HashMap<NewsEntry, Long> k;
    public final ArrayList<NewsEntry> l;
    public final HashMap<NewsEntry, bwy> m;
    public final HashMap<NewsEntry, Boolean> n;
    public final HashMap<NewsEntry, Integer> o;
    public final HashMap<NewsEntry, Integer> p;
    public final HashMap<NewsEntry, NetworkPerformanceMeasurer.NetworkClass> q;
    public final LinkedHashSet<NewsEntry> r;
    public final a s;
    public final a t;
    public int u;
    public MobileOfficialAppsCoreNavStat$EventScreen v;
    public final apl w;
    public final Rect x;
    public final h5r y;
    public final Set<gb60> z;

    /* compiled from: AsapSendBlockViewTimeChecker.kt */
    public static final class a {
        public NewsEntry a;
        public int b;
        public int c;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            NewsEntry newsEntry = this.a;
            return Integer.hashCode(this.c) + shy.a(this.b, (newsEntry == null ? 0 : newsEntry.hashCode()) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FirstPost(entry=");
            sb.append(this.a);
            sb.append(", top=");
            sb.append(this.b);
            sb.append(", bottom=");
            return vu5.b(sb, this.c, ')');
        }

        public a(int i) {
            this.a = null;
            this.b = 0;
            this.c = 0;
        }
    }

    /* compiled from: AsapSendBlockViewTimeChecker.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkPerformanceMeasurer.NetworkClass.values().length];
            try {
                iArr[NetworkPerformanceMeasurer.NetworkClass.BAD_NETWORK_CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkPerformanceMeasurer.NetworkClass.SO_SO_NETWORK_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkPerformanceMeasurer.NetworkClass.GOOD_NETWORK_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qt3(RecyclerView recyclerView, fb80.b<Object> bVar, NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender, ListDataSet<u1c0> listDataSet, List<? extends NewsEntry> list, fb80.a aVar, boolean z, boolean z2) {
        super(recyclerView, bVar);
        this.d = listDataSet;
        this.e = list;
        this.f = aVar;
        this.g = z;
        this.h = z2;
        this.i = new ArrayList<>();
        this.j = new HashMap<>();
        this.k = new HashMap<>();
        this.l = new ArrayList<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new HashMap<>();
        this.q = new HashMap<>();
        this.r = new LinkedHashSet<>();
        this.s = new a(0);
        this.t = new a(0);
        this.w = new apl();
        this.x = new Rect();
        this.y = new h5r();
        this.z = Collections.singleton(new ev50(nativeAdUserLevelAnalyticsSender));
    }

    public static boolean e(NewsEntry newsEntry) {
        if ((newsEntry instanceof Post) || (newsEntry instanceof PromoPost) || (newsEntry instanceof ShitAttachment)) {
            return true;
        }
        if (newsEntry instanceof FaveEntry) {
            FaveEntry faveEntry = (FaveEntry) newsEntry;
            Object obj = faveEntry.i.f;
            if (obj instanceof NewsEntry) {
                return e((NewsEntry) obj);
            }
            if (faveEntry.m.length() <= 0) {
                return false;
            }
        } else if (newsEntry.Db().length() <= 0) {
            return false;
        }
        return true;
    }

    public final void a(NewsEntry newsEntry, long j, boolean z) {
        SchemeStat$TypeFeedItem.StateAsync stateAsync;
        SchemeStat$TypeFeedItem.NetworkQuality networkQuality;
        Long l = this.j.get(newsEntry);
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.k.get(newsEntry);
            long longValue2 = l2 != null ? l2.longValue() : -1L;
            NetworkPerformanceMeasurer.NetworkClass networkClass = this.q.get(newsEntry);
            long j2 = j - longValue;
            long j3 = j2 < 0 ? 0L : j2;
            Integer num = this.p.get(newsEntry);
            int intValue = num != null ? num.intValue() : -1;
            Integer d = d(newsEntry, this.o.get(newsEntry));
            if (d != null) {
                int intValue2 = d.intValue();
                bwy.d dVar = bwy.d.a;
                bwy orDefault = this.m.getOrDefault(newsEntry, dVar);
                if (epx.f(orDefault, bwy.a.a)) {
                    stateAsync = SchemeStat$TypeFeedItem.StateAsync.ERROR;
                } else if (epx.f(orDefault, bwy.b.a)) {
                    stateAsync = SchemeStat$TypeFeedItem.StateAsync.LOADED;
                } else if (epx.f(orDefault, bwy.c.a)) {
                    stateAsync = SchemeStat$TypeFeedItem.StateAsync.LOADING;
                } else {
                    if (!epx.f(orDefault, dVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stateAsync = SchemeStat$TypeFeedItem.StateAsync.NONE;
                }
                SchemeStat$TypeFeedItem.StateAsync stateAsync2 = stateAsync;
                long j4 = longValue2 + j3;
                int i = this.u;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.v;
                if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
                    UiTracker uiTracker = UiTracker.a;
                    mobileOfficialAppsCoreNavStat$EventScreen = UiTracker.c();
                }
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
                int i2 = networkClass == null ? -1 : b.$EnumSwitchMapping$0[networkClass.ordinal()];
                if (i2 == -1) {
                    networkQuality = SchemeStat$TypeFeedItem.NetworkQuality.UNKNOWN;
                } else if (i2 == 1) {
                    networkQuality = SchemeStat$TypeFeedItem.NetworkQuality.BAD;
                } else if (i2 == 2) {
                    networkQuality = SchemeStat$TypeFeedItem.NetworkQuality.MEDIUM;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    networkQuality = SchemeStat$TypeFeedItem.NetworkQuality.GOOD;
                }
                this.c.d(newsEntry, new fb80.c(j3, stateAsync2, longValue2, j4, intValue, i, intValue2, z, mobileOfficialAppsCoreNavStat$EventScreen2, networkQuality));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, xsna.fb80$a] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        qi6 qi6Var;
        NewsEntry t6;
        ?? r7;
        HashMap<NewsEntry, bwy> hashMap;
        HashMap<NewsEntry, Long> hashMap2;
        ArrayList<NewsEntry> arrayList;
        NewsEntry newsEntry;
        long j;
        LinkedHashSet<NewsEntry> linkedHashSet;
        qi6 qi6Var2;
        NewsEntry t62;
        int i;
        boolean z;
        u1c0 J0;
        qi6 qi6Var3;
        NewsEntry t63;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.w.getClass();
        long a2 = qni0.a();
        LinkedHashSet<NewsEntry> linkedHashSet2 = this.r;
        linkedHashSet2.clear();
        if (this.g) {
            this.y.b = false;
        }
        RecyclerView recyclerView = this.b;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i2));
            if ((findContainingViewHolder instanceof qi6) && (t63 = (qi6Var3 = (qi6) findContainingViewHolder).t6()) != null) {
                this.r.add(t63);
                qi6Var3.J0();
            }
        }
        HashMap<NewsEntry, Boolean> hashMap3 = this.n;
        hashMap3.clear();
        a aVar = this.s;
        aVar.a = null;
        aVar.b = 0;
        aVar.c = 0;
        a aVar2 = this.t;
        aVar2.a = null;
        aVar2.b = 0;
        aVar2.c = 0;
        this.v = this.f.provide();
        RecyclerView recyclerView2 = this.b;
        int childCount2 = recyclerView2.getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        while (i3 < childCount2) {
            RecyclerView.e0 findContainingViewHolder2 = recyclerView2.findContainingViewHolder(recyclerView2.getChildAt(i3));
            if (!(findContainingViewHolder2 instanceof qi6) || (t62 = (qi6Var2 = (qi6) findContainingViewHolder2).t6()) == null) {
                j = a2;
                linkedHashSet = linkedHashSet2;
            } else {
                j = a2;
                View view = qi6Var2.itemView;
                int top = view.getTop();
                int bottom = view.getBottom();
                if (t62.equals(obj)) {
                    i = top;
                    top = i5;
                } else {
                    i = top;
                    obj = t62;
                }
                if (i < 0) {
                    i = 0;
                }
                i4 = (bottom - i) + i4;
                int c0 = j5g.c0(linkedHashSet2, t62);
                if (c0 > 0) {
                    linkedHashSet = linkedHashSet2;
                    if (c0 < linkedHashSet2.size() - 1 && i4 < recyclerView2.getHeight()) {
                        z = true;
                        hashMap3.put(t62, Boolean.valueOf(!e(t62) ? f(top, bottom, z) : false));
                        if (aVar.a != null && qi6Var2.getLayoutPosition() - i3 == 0) {
                            aVar.a = t62;
                            aVar.b = top;
                            aVar.c = bottom;
                        } else if (epx.f(aVar.a, t62)) {
                            aVar.c = bottom;
                        }
                        J0 = qi6Var2.J0();
                        if (J0 != null) {
                            this.p.put(t62, Integer.valueOf(J0.k));
                            J0.i = Math.abs(view.getBottom() - view.getTop());
                        }
                        this.u = Math.max(this.u, view.getWidth());
                        i5 = top;
                    }
                } else {
                    linkedHashSet = linkedHashSet2;
                }
                z = false;
                hashMap3.put(t62, Boolean.valueOf(!e(t62) ? f(top, bottom, z) : false));
                if (aVar.a != null) {
                }
                if (epx.f(aVar.a, t62)) {
                }
                J0 = qi6Var2.J0();
                if (J0 != null) {
                }
                this.u = Math.max(this.u, view.getWidth());
                i5 = top;
            }
            i3++;
            a2 = j;
            linkedHashSet2 = linkedHashSet;
        }
        long j2 = a2;
        LinkedHashSet<NewsEntry> linkedHashSet3 = linkedHashSet2;
        boolean z2 = this.h;
        if (z2) {
            while (true) {
                childCount2--;
                if (-1 >= childCount2) {
                    break;
                }
                RecyclerView.e0 findContainingViewHolder3 = recyclerView2.findContainingViewHolder(recyclerView2.getChildAt(childCount2));
                if ((findContainingViewHolder3 instanceof qi6) && (t6 = (qi6Var = (qi6) findContainingViewHolder3).t6()) != null) {
                    View view2 = qi6Var.itemView;
                    if (aVar2.a == null) {
                        if (qi6Var.getAbsoluteAdapterPosition() == (recyclerView2.getAdapter() != null ? r9.getItemCount() : 0) - 1) {
                            aVar2.a = t6;
                            aVar2.b = view2.getTop();
                            aVar2.c = view2.getBottom();
                        }
                    }
                    if (epx.f(aVar2.a, t6)) {
                        aVar2.b = view2.getTop();
                    }
                }
            }
        }
        NewsEntry newsEntry2 = aVar.a;
        if (newsEntry2 != null) {
            boolean z3 = true;
            r7 = z3;
            if (linkedHashSet3.size() > 1) {
                hashMap3.put(newsEntry2, Boolean.valueOf(f(aVar.b, aVar.c, true)));
                r7 = z3;
            }
        } else {
            r7 = 1;
        }
        if (z2 && (newsEntry = aVar2.a) != null && linkedHashSet3.size() > r7) {
            hashMap3.put(newsEntry, Boolean.valueOf(f(aVar2.b, aVar2.c, r7)));
        }
        Iterator<Map.Entry<NewsEntry, Boolean>> it = hashMap3.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.m;
            hashMap2 = this.j;
            if (!hasNext) {
                break;
            }
            Map.Entry<NewsEntry, Boolean> next = it.next();
            NewsEntry key = next.getKey();
            if (next.getValue().booleanValue()) {
                if (hashMap2.get(key) == null) {
                    hashMap2.put(key, Long.valueOf(elapsedRealtime));
                    this.k.put(key, Long.valueOf(j2));
                    hashMap.put(key, key.f);
                    NetworkPerformanceMeasurer.a.getClass();
                    NetworkPerformanceMeasurer.NetworkClass networkClass = NetworkPerformanceMeasurer.m;
                    if (networkClass == null) {
                        networkClass = null;
                    }
                    this.q.put(key, networkClass);
                }
                Iterator<T> it2 = this.z.iterator();
                while (it2.hasNext()) {
                    ((gb60) it2.next()).b(key);
                }
            } else {
                i(key, elapsedRealtime);
            }
        }
        Iterator<NewsEntry> it3 = hashMap2.keySet().iterator();
        while (true) {
            boolean hasNext2 = it3.hasNext();
            arrayList = this.l;
            if (!hasNext2) {
                break;
            }
            NewsEntry next2 = it3.next();
            if (!hashMap3.containsKey(next2)) {
                arrayList.add(next2);
            } else if (!epx.f(next2.f, hashMap.get(next2))) {
                arrayList.add(next2);
            }
        }
        Iterator<NewsEntry> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            i(it4.next(), elapsedRealtime);
        }
        arrayList.clear();
    }

    public final void c(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap<NewsEntry, Long> hashMap = this.j;
        Iterator<Map.Entry<NewsEntry, Long>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            a(it.next().getKey(), elapsedRealtime, z);
        }
        hashMap.clear();
        this.k.clear();
        this.n.clear();
        this.r.clear();
        this.o.clear();
        this.p.clear();
        this.m.clear();
        this.q.clear();
        this.i.clear();
        a aVar = this.s;
        aVar.a = null;
        aVar.b = 0;
        aVar.c = 0;
        a aVar2 = this.t;
        aVar2.a = null;
        aVar2.b = 0;
        aVar2.c = 0;
        Iterator<T> it2 = this.z.iterator();
        while (it2.hasNext()) {
            ((gb60) it2.next()).a();
        }
        this.u = 0;
        this.v = null;
    }

    public final Integer d(NewsEntry newsEntry, Integer num) {
        ListDataSet<u1c0> listDataSet = this.d;
        int size = listDataSet.d.size();
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            u1c0 c = listDataSet.c(i3);
            if (!epx.f(c.b, newsEntry)) {
                if (i != -1) {
                    break;
                }
            } else {
                if (i == -1) {
                    i = i3;
                }
                i2 += c.i;
            }
        }
        return i2 != 0 ? Integer.valueOf(i2) : num;
    }

    public final boolean f(int i, int i2, boolean z) {
        int i3 = i2 - i;
        boolean z2 = this.g;
        RecyclerView recyclerView = this.b;
        if (!z2) {
            int max = Math.max(0, Math.min(recyclerView.getHeight(), i2) - Math.max(0, i));
            if (recyclerView.getHeight() > 0 && i3 > 0) {
                float f = max;
                if (f / recyclerView.getHeight() >= 0.35f || (z && f / i3 >= 0.35f)) {
                    return true;
                }
            }
            return false;
        }
        int width = recyclerView.getWidth();
        Rect rect = this.x;
        rect.set(0, i, width, i2);
        h5r h5rVar = this.y;
        Rect rect2 = h5rVar.a;
        if (!h5rVar.b) {
            h5rVar.b = true;
            recyclerView.getLocalVisibleRect(rect2);
        }
        if (rect.intersect(rect2)) {
            if (!z || rect.height() / i3 < 0.35f) {
                if (rect.height() / recyclerView.getHeight() >= 0.35f) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g() {
        for (NewsEntry newsEntry : this.j.keySet()) {
            HashMap<NewsEntry, Integer> hashMap = this.o;
            Integer d = d(newsEntry, hashMap.get(newsEntry));
            if (d != null) {
                hashMap.put(newsEntry, d);
            }
        }
    }

    public final void h(NewsEntry newsEntry) {
        i(newsEntry, SystemClock.elapsedRealtime());
    }

    public final void i(NewsEntry newsEntry, long j) {
        a(newsEntry, j, false);
        this.j.remove(newsEntry);
        this.k.remove(newsEntry);
        this.m.remove(newsEntry);
        this.q.remove(newsEntry);
    }
}
