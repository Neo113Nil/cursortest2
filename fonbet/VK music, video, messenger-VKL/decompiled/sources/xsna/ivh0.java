package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.id.UserId;
import com.vk.music.search.history.SearchHistoryModel;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.vp70;

/* compiled from: SearchHistoryRepoImpl.kt */
/* loaded from: classes16.dex */
public final class ivh0 implements gvh0<vp70> {
    public final com.vk.music.pref.a a;
    public final int b;
    public final vqe0 c;
    public long d;
    public final bpn0 e;

    /* compiled from: SearchHistoryRepoImpl.kt */
    public static final class a extends m1q<b> {
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
        @Override // xsna.m1q, java.util.Queue, java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean add(b bVar) {
            vp70 vp70Var = bVar.b;
            UserId userId = vp70Var.b;
            String str = vp70Var.c;
            List l = e43.l(userId, str);
            SearchHistoryModel.Type type = vp70Var.a;
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = this.c;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                b bVar3 = null;
                if (bVar2 != null) {
                    vp70 vp70Var2 = bVar2.b;
                    if (vp70Var2 != vp70Var) {
                        SearchHistoryModel.Type type2 = vp70Var2.a;
                        String str2 = vp70Var2.c;
                        UserId userId2 = vp70Var2.b;
                        if ((type2 != type || !epx.f(userId2, vp70Var.b) || !epx.f(str2, str)) && (zx8.a.get(type) != vp70Var2.a || !epx.f(l, e43.l(userId2, str2)))) {
                            bVar2 = null;
                        }
                    }
                    bVar3 = bVar2;
                }
                if (bVar3 != null) {
                    arrayList.add(bVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayDeque.remove((b) it2.next());
                }
            }
            return super.add(bVar);
        }

        @Override // xsna.m1q, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof b) {
                return this.c.contains((b) obj);
            }
            return false;
        }

        @Override // xsna.m1q, java.util.Collection
        public final boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof b) {
                return this.c.remove((b) obj);
            }
            return false;
        }
    }

    /* compiled from: SearchHistoryRepoImpl.kt */
    public static final class b {
        public final long a;
        public final vp70 b;

        public b(long j, vp70 vp70Var) {
            this.a = j;
            this.b = vp70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "RecentQueryRecord(timestamp=" + this.a + ", model=" + this.b + ')';
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((b) t).a), Long.valueOf(((b) t2).a));
        }
    }

    public ivh0(com.vk.music.pref.a aVar, int i) {
        vqe0 vqe0Var = new vqe0(1);
        this.a = aVar;
        this.b = i;
        this.c = vqe0Var;
        this.e = new bpn0(new z260(this, 23));
    }

    @Override // xsna.gvh0
    public final List a() {
        if (d().c.isEmpty()) {
            e();
        }
        return rli0.A(new ulp0(dli0.c(d().c.descendingIterator()), jvh0.b));
    }

    @Override // xsna.gvh0
    public final void b(vp70 vp70Var) {
        vp70 vp70Var2 = vp70Var;
        if (d().c.isEmpty()) {
            e();
        }
        vqe0 vqe0Var = this.c;
        d().add(new b(((Number) vqe0Var.invoke()).longValue(), vp70Var2));
        this.d = ((Number) vqe0Var.invoke()).longValue();
        a d = d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator it = d.c.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.a);
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            vp70 vp70Var3 = bVar.b;
            String str = vp70Var3.e;
            String str2 = null;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    str2 = URLEncoder.encode(str, C.UTF8_NAME);
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            sb.append(vp70Var3.a.i() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + vp70Var3.b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + vp70Var3.c + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + vp70Var3.d + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
            arrayList.add(sb.toString());
        }
        this.a.h0(j5g.S0(arrayList));
    }

    @Override // xsna.gvh0
    public final long c() {
        return this.d;
    }

    @Override // xsna.gvh0
    public final void clear() {
        this.a.h0(EmptySet.b);
        e();
    }

    public final a d() {
        return (a) this.e.getValue();
    }

    public final void e() {
        Long n;
        Set<String> t = this.a.t();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = t.iterator();
        while (it.hasNext()) {
            List c0 = drm0.c0((String) it.next(), new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6);
            b bVar = null;
            if (c0.size() != 2) {
                c0 = null;
            }
            if (c0 != null && (n = arm0.n((String) c0.get(0))) != null) {
                long longValue = n.longValue();
                vp70 a2 = vp70.a.a((String) c0.get(1));
                if (a2 != null) {
                    bVar = new b(longValue, a2);
                }
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        List D0 = j5g.D0(new c(), arrayList);
        d().clear();
        d().addAll(D0);
        this.d = ((Number) this.c.invoke()).longValue();
    }
}
