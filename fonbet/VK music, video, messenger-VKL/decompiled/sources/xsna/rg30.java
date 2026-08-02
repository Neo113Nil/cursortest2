package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityMrcUrl;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vk.statistic.TargetPlayheadViewability;
import com.vk.toggle.features.FeedFeatures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import xsna.pg30;

/* compiled from: MrcTrackingAdPixelDataProcessor.kt */
/* loaded from: classes14.dex */
public final class rg30 implements kuc0<pwc0> {
    public final hg30 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final HashMap c = new HashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final Handler j = new Handler(Looper.getMainLooper());
    public pwc0 k;

    /* compiled from: MrcTrackingAdPixelDataProcessor.kt */
    public static final class a {
        public final ArrayList a;
        public final ArrayList b;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisibilityTrack(heights=");
            sb.append(this.a);
            sb.append(", times=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
        }

        public a(Object obj) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            this.a = arrayList;
            this.b = arrayList2;
        }
    }

    public rg30(hg30 hg30Var) {
        this.a = hg30Var;
    }

    public static void f(rg30 rg30Var, DeprecatedStatisticInterface deprecatedStatisticInterface, DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl, vx vxVar, int i) {
        boolean z = (i & 4) == 0;
        gzs gzsVar = vxVar;
        if ((i & 8) != 0) {
            gzsVar = new mg(18);
        }
        if (((Long) (z ? rg30Var.h : rg30Var.g).remove(deprecatedStatisticPlayheadViewabilityMrcUrl)) != null) {
            rg30Var.j.removeCallbacksAndMessages(deprecatedStatisticInterface);
            gzsVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.kuc0
    public final void a(NewsEntry newsEntry) {
        DeprecatedStatisticInterface deprecatedStatisticInterface = newsEntry instanceof DeprecatedStatisticInterface ? (DeprecatedStatisticInterface) newsEntry : null;
        if (deprecatedStatisticInterface == null) {
            return;
        }
        this.b.remove(deprecatedStatisticInterface);
        this.c.remove(deprecatedStatisticInterface);
        List list = (List) this.e.remove(deprecatedStatisticInterface);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.g.remove((DeprecatedStatisticPlayheadViewabilityMrcUrl) it.next());
            }
        }
        List list2 = (List) this.f.remove(deprecatedStatisticInterface);
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                this.h.remove((DeprecatedStatisticPlayheadViewabilityMrcUrl) it2.next());
            }
        }
        this.d.remove(newsEntry);
        this.j.removeCallbacksAndMessages(deprecatedStatisticInterface);
    }

    @Override // xsna.kuc0
    public final void b(pwc0 pwc0Var) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (x6c0 x6c0Var : pwc0Var.a()) {
            Parcelable b = x6c0Var.b();
            DeprecatedStatisticInterface deprecatedStatisticInterface = b instanceof DeprecatedStatisticInterface ? (DeprecatedStatisticInterface) b : null;
            if (deprecatedStatisticInterface != null) {
                d(deprecatedStatisticInterface, x6c0Var.getFullHeight(), x6c0Var.c().height(), uptimeMillis);
            }
        }
        clearData();
    }

    @Override // xsna.kuc0
    public final void c(pwc0 pwc0Var, long j, long j2) {
        long j3;
        long j4;
        rg30 rg30Var = this;
        pwc0 pwc0Var2 = pwc0Var;
        rg30Var.k = pwc0Var2;
        for (x6c0 x6c0Var : pwc0Var2.a()) {
            Parcelable b = x6c0Var.b();
            DeprecatedStatisticInterface deprecatedStatisticInterface = b instanceof DeprecatedStatisticInterface ? (DeprecatedStatisticInterface) b : null;
            if (deprecatedStatisticInterface != null) {
                LinkedHashSet linkedHashSet = rg30Var.d;
                if (!linkedHashSet.contains(deprecatedStatisticInterface)) {
                    linkedHashSet.add(deprecatedStatisticInterface);
                    rg30Var.a.a(new pg30.c(deprecatedStatisticInterface));
                }
                boolean e = x6c0Var.e();
                Handler handler = rg30Var.j;
                HashMap hashMap = rg30Var.c;
                LinkedHashMap linkedHashMap = rg30Var.i;
                LinkedHashMap linkedHashMap2 = rg30Var.h;
                LinkedHashMap linkedHashMap3 = rg30Var.f;
                if (e) {
                    LinkedHashSet linkedHashSet2 = rg30Var.b;
                    if (!linkedHashSet2.contains(deprecatedStatisticInterface)) {
                        linkedHashSet2.add(deprecatedStatisticInterface);
                        List list = (List) linkedHashMap3.remove(deprecatedStatisticInterface);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                linkedHashMap2.remove((DeprecatedStatisticPlayheadViewabilityMrcUrl) it.next());
                            }
                        }
                        linkedHashMap.remove(deprecatedStatisticInterface);
                        handler.removeCallbacksAndMessages(deprecatedStatisticInterface);
                        a aVar = (a) hashMap.remove(deprecatedStatisticInterface);
                        if (aVar != null) {
                            ArrayList arrayList = aVar.a;
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                rg30Var.d(deprecatedStatisticInterface, x6c0Var.getFullHeight(), ((Number) arrayList.get(i)).intValue(), ((Number) aVar.b.get(i)).longValue());
                                i++;
                                rg30Var = this;
                            }
                        }
                    }
                    rg30Var = this;
                    j4 = rg30Var.d(deprecatedStatisticInterface, x6c0Var.getFullHeight(), x6c0Var.c().height(), j2);
                    j3 = Long.MAX_VALUE;
                } else {
                    int height = x6c0Var.c().height();
                    a aVar2 = (a) hashMap.computeIfAbsent(deprecatedStatisticInterface, new sw6(new oey(7), 1));
                    Integer num = (Integer) j5g.k0(aVar2.a);
                    if (num == null || num.intValue() != height) {
                        aVar2.a.add(Integer.valueOf(height));
                        aVar2.b.add(Long.valueOf(j2));
                    }
                    int a2 = x6c0Var.a();
                    int d = x6c0Var.d();
                    j3 = Long.MAX_VALUE;
                    int ceil = (int) Math.ceil(a2 / 2);
                    List list2 = (List) linkedHashMap3.get(deprecatedStatisticInterface);
                    if (list2 == null) {
                        list2 = rg30Var.e(deprecatedStatisticInterface, true);
                    }
                    Iterator it2 = list2.iterator();
                    long j5 = Long.MAX_VALUE;
                    while (it2.hasNext()) {
                        DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl = (DeprecatedStatisticPlayheadViewabilityMrcUrl) it2.next();
                        Long l = (Long) linkedHashMap2.get(deprecatedStatisticPlayheadViewabilityMrcUrl);
                        if (l != null) {
                            if (d < ceil) {
                                f(rg30Var, deprecatedStatisticInterface, deprecatedStatisticPlayheadViewabilityMrcUrl, null, 8);
                            } else if (d < ceil || l.longValue() > j2) {
                                j5 = Math.min(l.longValue(), j5);
                            } else if (((Long) linkedHashMap2.remove(deprecatedStatisticPlayheadViewabilityMrcUrl)) != null) {
                                handler.removeCallbacksAndMessages(deprecatedStatisticInterface);
                                it2.remove();
                                final z410 z410Var = new z410(5);
                                ((List) linkedHashMap.computeIfAbsent(deprecatedStatisticInterface, new Function() { // from class: xsna.qg30
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return (List) z410.this.invoke(obj);
                                    }
                                })).add(deprecatedStatisticPlayheadViewabilityMrcUrl);
                                s3q0 s3q0Var = s3q0.a;
                            }
                        } else if (d >= ceil) {
                            long millis = TimeUnit.SECONDS.toMillis(deprecatedStatisticPlayheadViewabilityMrcUrl.n) + j2;
                            linkedHashMap2.put(deprecatedStatisticPlayheadViewabilityMrcUrl, Long.valueOf(millis));
                            j5 = Math.min(millis, j5);
                        }
                    }
                    j4 = j5;
                }
                if (j4 > SystemClock.uptimeMillis() && j4 < j3) {
                    handler.postAtTime(new a72(rg30Var, 13), deprecatedStatisticInterface, j4);
                }
            }
        }
    }

    @Override // xsna.kuc0
    public final void clearData() {
        this.b.clear();
        this.c.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.d.clear();
        boolean a2 = com.vk.toggle.b.A.a(FeedFeatures.ADS_DISABLE_HACK_PIXELS);
        LinkedHashMap linkedHashMap = this.i;
        if (!a2) {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    this.a.a(new pg30.b((DeprecatedStatisticPlayheadViewabilityMrcUrl) it2.next()));
                    it2.remove();
                }
            }
        }
        linkedHashMap.clear();
        this.j.removeCallbacksAndMessages(null);
    }

    public final long d(DeprecatedStatisticInterface deprecatedStatisticInterface, int i, int i2, long j) {
        float f = (i2 / i) * 100;
        List list = (List) this.e.get(deprecatedStatisticInterface);
        if (list == null) {
            list = e(deprecatedStatisticInterface, false);
        }
        Iterator it = list.iterator();
        long j2 = Long.MAX_VALUE;
        while (it.hasNext()) {
            DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl = (DeprecatedStatisticPlayheadViewabilityMrcUrl) it.next();
            LinkedHashMap linkedHashMap = this.g;
            Long l = (Long) linkedHashMap.get(deprecatedStatisticPlayheadViewabilityMrcUrl);
            if (l != null) {
                float f2 = deprecatedStatisticPlayheadViewabilityMrcUrl.m;
                if (f < f2) {
                    f(this, deprecatedStatisticInterface, deprecatedStatisticPlayheadViewabilityMrcUrl, null, 12);
                } else if (f < f2 || l.longValue() > j) {
                    j2 = Math.min(l.longValue(), j2);
                } else {
                    f(this, deprecatedStatisticInterface, deprecatedStatisticPlayheadViewabilityMrcUrl, new vx(it, this, deprecatedStatisticPlayheadViewabilityMrcUrl, 2), 4);
                }
            } else if (f >= deprecatedStatisticPlayheadViewabilityMrcUrl.m) {
                long millis = TimeUnit.SECONDS.toMillis(deprecatedStatisticPlayheadViewabilityMrcUrl.n) + j;
                linkedHashMap.put(deprecatedStatisticPlayheadViewabilityMrcUrl, Long.valueOf(millis));
                j2 = Math.min(millis, j2);
            }
        }
        return j2;
    }

    public final ArrayList e(DeprecatedStatisticInterface deprecatedStatisticInterface, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (DeprecatedStatisticUrl deprecatedStatisticUrl : deprecatedStatisticInterface.R6("playhead_viewability_value")) {
            if (deprecatedStatisticUrl instanceof DeprecatedStatisticPlayheadViewabilityMrcUrl) {
                DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl = (DeprecatedStatisticPlayheadViewabilityMrcUrl) deprecatedStatisticUrl;
                if (deprecatedStatisticPlayheadViewabilityMrcUrl.l == TargetPlayheadViewability.BANNER) {
                    arrayList.add(deprecatedStatisticUrl);
                    if (deprecatedStatisticPlayheadViewabilityMrcUrl.m >= 50) {
                        arrayList2.add(deprecatedStatisticUrl);
                    }
                }
            }
        }
        this.e.put(deprecatedStatisticInterface, arrayList);
        this.f.put(deprecatedStatisticInterface, arrayList2);
        return z ? arrayList2 : arrayList;
    }
}
