package xsna;

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
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeFeedItem;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwy;
import xsna.fb80;

/* compiled from: NewsfeedListViewTimeChecker.kt */
/* loaded from: classes4.dex */
public final class ks60 implements j1u0 {
    public final RecyclerView b;
    public final fb80.a c;
    public final boolean d;
    public final xr60 e;
    public int q;
    public MobileOfficialAppsCoreNavStat$EventScreen r;
    public final Set<gb60> t;
    public final ph50<NewsEntry, Long> f = new ph50<>((Object) null);
    public final ph50<NewsEntry, Long> g = new ph50<>((Object) null);
    public final ArrayList<NewsEntry> h = new ArrayList<>();
    public final ph50<NewsEntry, bwy> i = new ph50<>((Object) null);
    public final ph50<NewsEntry, Boolean> j = new ph50<>((Object) null);
    public final HashMap<NewsEntry, Integer> k = new HashMap<>();
    public final HashMap<NewsEntry, Integer> l = new HashMap<>();
    public final HashMap<NewsEntry, NetworkPerformanceMeasurer.NetworkClass> m = new HashMap<>();
    public final LinkedHashSet<NewsEntry> n = new LinkedHashSet<>();
    public final a o = new a(0);
    public final a p = new a(0);
    public final apl s = new apl();

    /* compiled from: NewsfeedListViewTimeChecker.kt */
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

    /* compiled from: NewsfeedListViewTimeChecker.kt */
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

    public ks60(RecyclerView recyclerView, fb80.a aVar, boolean z, xr60 xr60Var, NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender) {
        this.b = recyclerView;
        this.c = aVar;
        this.d = z;
        this.e = xr60Var;
        this.t = Collections.singleton(new ev50(nativeAdUserLevelAnalyticsSender));
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

    public final void a(NewsEntry newsEntry, long j, long j2, boolean z) {
        SchemeStat$TypeFeedItem.StateAsync stateAsync;
        SchemeStat$TypeFeedItem.NetworkQuality networkQuality;
        Long d = this.g.d(newsEntry);
        long longValue = d != null ? d.longValue() : -1L;
        NetworkPerformanceMeasurer.NetworkClass networkClass = this.m.get(newsEntry);
        long j3 = j2 - j;
        long j4 = j3 >= 0 ? j3 : 0L;
        Integer num = this.l.get(newsEntry);
        int intValue = num != null ? num.intValue() : -1;
        Integer d2 = d(newsEntry, this.k.get(newsEntry));
        if (d2 != null) {
            int intValue2 = d2.intValue();
            bwy.d dVar = bwy.d.a;
            bwy e = this.i.e(newsEntry, dVar);
            if (epx.f(e, bwy.a.a)) {
                stateAsync = SchemeStat$TypeFeedItem.StateAsync.ERROR;
            } else if (epx.f(e, bwy.b.a)) {
                stateAsync = SchemeStat$TypeFeedItem.StateAsync.LOADED;
            } else if (epx.f(e, bwy.c.a)) {
                stateAsync = SchemeStat$TypeFeedItem.StateAsync.LOADING;
            } else {
                if (!epx.f(e, dVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                stateAsync = SchemeStat$TypeFeedItem.StateAsync.NONE;
            }
            SchemeStat$TypeFeedItem.StateAsync stateAsync2 = stateAsync;
            long j5 = longValue + j4;
            int i = this.q;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.r;
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
            this.e.d(newsEntry, new fb80.c(j4, stateAsync2, longValue, j5, intValue, i, intValue2, z, mobileOfficialAppsCoreNavStat$EventScreen2, networkQuality));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        char c;
        long j;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        char c2;
        long j2;
        LinkedHashSet<NewsEntry> linkedHashSet;
        qi6 qi6Var;
        NewsEntry t6;
        boolean z;
        u1c0 J0;
        qi6 qi6Var2;
        NewsEntry t62;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.s.getClass();
        long a2 = qni0.a();
        LinkedHashSet<NewsEntry> linkedHashSet2 = this.n;
        linkedHashSet2.clear();
        RecyclerView recyclerView = this.b;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
            if ((findContainingViewHolder instanceof qi6) && (t62 = (qi6Var2 = (qi6) findContainingViewHolder).t6()) != null) {
                this.n.add(t62);
                qi6Var2.J0();
            }
        }
        ph50<NewsEntry, Boolean> ph50Var = this.j;
        ph50Var.h();
        a aVar = this.o;
        aVar.a = null;
        aVar.b = 0;
        aVar.c = 0;
        a aVar2 = this.p;
        aVar2.a = null;
        aVar2.b = 0;
        aVar2.c = 0;
        this.r = this.c.provide();
        RecyclerView recyclerView2 = this.b;
        int childCount2 = recyclerView2.getChildCount();
        Object obj = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < childCount2) {
            RecyclerView.e0 childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i2));
            if (!(childViewHolder instanceof qi6) || (t6 = (qi6Var = (qi6) childViewHolder).t6()) == null) {
                j2 = a2;
                linkedHashSet = linkedHashSet2;
            } else {
                j2 = a2;
                View view = qi6Var.itemView;
                int top = view.getTop();
                int bottom = view.getBottom();
                if (!t6.equals(obj)) {
                    i3 = top;
                    obj = t6;
                }
                if (top < 0) {
                    top = 0;
                }
                i4 = (bottom - top) + i4;
                View view2 = qi6Var.itemView;
                int bottom2 = view2.getBottom();
                int c0 = j5g.c0(linkedHashSet2, t6);
                if (c0 > 0) {
                    linkedHashSet = linkedHashSet2;
                    if (c0 < linkedHashSet2.size() - 1 && i4 < recyclerView2.getHeight()) {
                        z = true;
                        ph50Var.p(t6, Boolean.valueOf(!e(t6) ? f(i3, bottom2, z) : false));
                        if (aVar.a != null && qi6Var.getLayoutPosition() - i2 == 0) {
                            aVar.a = t6;
                            aVar.b = i3;
                            aVar.c = bottom2;
                        } else if (epx.f(aVar.a, t6)) {
                            aVar.c = bottom2;
                        }
                        J0 = qi6Var.J0();
                        if (J0 != null) {
                            this.l.put(t6, Integer.valueOf(J0.k));
                            J0.i = Math.abs(view2.getBottom() - view2.getTop());
                        }
                        this.q = Math.max(this.q, view.getWidth());
                    }
                } else {
                    linkedHashSet = linkedHashSet2;
                }
                z = false;
                ph50Var.p(t6, Boolean.valueOf(!e(t6) ? f(i3, bottom2, z) : false));
                if (aVar.a != null) {
                }
                if (epx.f(aVar.a, t6)) {
                }
                J0 = qi6Var.J0();
                if (J0 != null) {
                }
                this.q = Math.max(this.q, view.getWidth());
            }
            i2++;
            a2 = j2;
            linkedHashSet2 = linkedHashSet;
        }
        long j3 = a2;
        LinkedHashSet<NewsEntry> linkedHashSet3 = linkedHashSet2;
        NewsEntry newsEntry = aVar.a;
        if (newsEntry != null && linkedHashSet3.size() > 1) {
            ph50Var.p(newsEntry, Boolean.valueOf(f(aVar.b, aVar.c, true)));
        }
        Object[] objArr7 = ph50Var.b;
        Object[] objArr8 = ph50Var.c;
        long[] jArr3 = ph50Var.a;
        int length = jArr3.length - 2;
        ph50<NewsEntry, bwy> ph50Var2 = this.i;
        ph50<NewsEntry, Long> ph50Var3 = this.f;
        char c3 = 7;
        if (length >= 0) {
            int i5 = 0;
            j = 255;
            while (true) {
                long j4 = jArr3[i5];
                int i6 = i5;
                if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            c2 = c3;
                            NewsEntry newsEntry2 = (NewsEntry) objArr7[i9];
                            if (((Boolean) objArr8[i9]).booleanValue()) {
                                if (ph50Var3.d(newsEntry2) == null) {
                                    objArr5 = objArr7;
                                    ph50Var3.p(newsEntry2, Long.valueOf(elapsedRealtime));
                                    objArr6 = objArr8;
                                    this.g.p(newsEntry2, Long.valueOf(j3));
                                    ph50Var2.p(newsEntry2, newsEntry2.f);
                                    NetworkPerformanceMeasurer.a.getClass();
                                    NetworkPerformanceMeasurer.NetworkClass networkClass = NetworkPerformanceMeasurer.m;
                                    if (networkClass == null) {
                                        networkClass = null;
                                    }
                                    this.m.put(newsEntry2, networkClass);
                                } else {
                                    objArr5 = objArr7;
                                    objArr6 = objArr8;
                                }
                                Iterator<T> it = this.t.iterator();
                                while (it.hasNext()) {
                                    ((gb60) it.next()).b(newsEntry2);
                                }
                            } else {
                                objArr5 = objArr7;
                                objArr6 = objArr8;
                                g(newsEntry2, elapsedRealtime);
                            }
                        } else {
                            objArr5 = objArr7;
                            objArr6 = objArr8;
                            c2 = c3;
                        }
                        j4 >>= 8;
                        i8++;
                        objArr7 = objArr5;
                        objArr8 = objArr6;
                        c3 = c2;
                    }
                    objArr3 = objArr7;
                    objArr4 = objArr8;
                    c = c3;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    objArr3 = objArr7;
                    objArr4 = objArr8;
                    c = c3;
                }
                if (i6 == length) {
                    break;
                }
                i5 = i6 + 1;
                objArr7 = objArr3;
                objArr8 = objArr4;
                c3 = c;
            }
        } else {
            c = 7;
            j = 255;
        }
        Object[] objArr9 = ph50Var3.b;
        long[] jArr4 = ph50Var3.a;
        int length2 = jArr4.length - 2;
        ArrayList<NewsEntry> arrayList = this.h;
        if (length2 >= 0) {
            int i10 = 0;
            while (true) {
                long j5 = jArr4[i10];
                if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j5 & j) < 128) {
                            NewsEntry newsEntry3 = (NewsEntry) objArr9[(i10 << 3) + i12];
                            if (ph50Var.b(newsEntry3)) {
                                objArr2 = objArr9;
                                jArr2 = jArr4;
                                if (!epx.f(newsEntry3.f, ph50Var2.d(newsEntry3))) {
                                    arrayList.add(newsEntry3);
                                }
                                j5 >>= 8;
                                i12++;
                                objArr9 = objArr2;
                                jArr4 = jArr2;
                            } else {
                                arrayList.add(newsEntry3);
                            }
                        }
                        objArr2 = objArr9;
                        jArr2 = jArr4;
                        j5 >>= 8;
                        i12++;
                        objArr9 = objArr2;
                        jArr4 = jArr2;
                    }
                    objArr = objArr9;
                    jArr = jArr4;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr9;
                    jArr = jArr4;
                }
                if (i10 == length2) {
                    break;
                }
                i10++;
                objArr9 = objArr;
                jArr4 = jArr;
            }
        }
        Iterator<NewsEntry> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            g(it2.next(), elapsedRealtime);
        }
        arrayList.clear();
        int childCount3 = recyclerView2.getChildCount();
        if (this.d) {
            for (int i13 = 0; i13 < childCount3; i13++) {
                RecyclerView.e0 childViewHolder2 = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i13));
                if (childViewHolder2 instanceof qi6) {
                    qi6 qi6Var3 = (qi6) childViewHolder2;
                    if (qi6Var3.t6() != null) {
                        qi6Var3.J0();
                    }
                }
            }
        }
    }

    public final void c(boolean z) {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ph50<NewsEntry, Long> ph50Var = this.f;
        Object[] objArr = ph50Var.b;
        Object[] objArr2 = ph50Var.c;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    long j2 = j;
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j2 & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            i = i4;
                            a((NewsEntry) objArr[i5], ((Number) objArr2[i5]).longValue(), elapsedRealtime, z);
                        } else {
                            i = i4;
                        }
                        j2 >>= 8;
                        i4 = i + 1;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ph50Var.h();
        this.g.h();
        this.j.h();
        this.n.clear();
        this.k.clear();
        this.l.clear();
        this.i.h();
        this.m.clear();
        a aVar = this.o;
        aVar.a = null;
        aVar.b = 0;
        aVar.c = 0;
        a aVar2 = this.p;
        aVar2.a = null;
        aVar2.b = 0;
        aVar2.c = 0;
        Iterator<T> it = this.t.iterator();
        while (it.hasNext()) {
            ((gb60) it.next()).a();
        }
        this.q = 0;
        this.r = null;
    }

    public final Integer d(NewsEntry newsEntry, Integer num) {
        RecyclerView.Adapter adapter = this.b.getAdapter();
        ho60 ho60Var = adapter instanceof ho60 ? (ho60) adapter : null;
        if (ho60Var != null) {
            int itemCount = ho60Var.getItemCount();
            int i = -1;
            int i2 = 0;
            for (int i3 = 0; i3 < itemCount; i3++) {
                ol60 y0 = ho60Var.y0(i3);
                z1c0 z1c0Var = y0 instanceof z1c0 ? (z1c0) y0 : null;
                if (z1c0Var != null) {
                    u1c0 u1c0Var = z1c0Var.h;
                    if (!epx.f(u1c0Var.b, newsEntry)) {
                        if (i != -1) {
                            break;
                        }
                    } else {
                        if (i == -1) {
                            i = i3;
                        }
                        i2 += u1c0Var.i;
                    }
                }
            }
            if (i2 != 0) {
                return Integer.valueOf(i2);
            }
        }
        return num;
    }

    public final boolean f(int i, int i2, boolean z) {
        int i3 = i2 - i;
        RecyclerView recyclerView = this.b;
        int max = Math.max(0, Math.min(recyclerView.getHeight(), i2) - Math.max(0, i));
        if (recyclerView.getHeight() <= 0 || i3 <= 0) {
            return false;
        }
        float f = max;
        if (f / recyclerView.getHeight() < 0.35f) {
            return z && f / ((float) i3) >= 0.35f;
        }
        return true;
    }

    public final void g(NewsEntry newsEntry, long j) {
        ks60 ks60Var;
        NewsEntry newsEntry2;
        ph50<NewsEntry, Long> ph50Var = this.f;
        Long d = ph50Var.d(newsEntry);
        if (d != null) {
            ks60Var = this;
            newsEntry2 = newsEntry;
            ks60Var.a(newsEntry2, d.longValue(), j, false);
        } else {
            ks60Var = this;
            newsEntry2 = newsEntry;
        }
        ph50Var.n(newsEntry2);
        ks60Var.g.n(newsEntry2);
        ks60Var.i.n(newsEntry2);
        ks60Var.m.remove(newsEntry2);
    }
}
