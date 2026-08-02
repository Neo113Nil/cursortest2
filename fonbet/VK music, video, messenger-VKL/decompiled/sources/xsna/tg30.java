package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.InterfaceC4413l1;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.InterestingStoriesEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import ru.ok.android.commons.http.Http;
import xsna.pg30;
import xsna.tg30;

/* compiled from: MrcTrackingDataProcessor.kt */
/* loaded from: classes14.dex */
public final class tg30 implements kuc0<pwc0> {
    public final hg30 a;
    public final xt0 b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final vzt0 f = new vzt0();
    public final Handler g = new Handler(Looper.getMainLooper());

    /* compiled from: MrcTrackingDataProcessor.kt */
    public static final class a {
        public final NewsEntry a;
        public final long b;
        public final int c;

        public a(NewsEntry newsEntry, long j, int i) {
            this.a = newsEntry;
            this.b = j;
            this.c = i;
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
            return Integer.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShownPost(post=");
            sb.append(this.a);
            sb.append(", showingDurationMs=");
            sb.append(this.b);
            sb.append(", position=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: MrcTrackingDataProcessor.kt */
    public static final class b {
        public final ArrayList a;
        public final ArrayList b;
        public final int c;

        public b() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + qr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisibilityTrack(heights=");
            sb.append(this.a);
            sb.append(", times=");
            sb.append(this.b);
            sb.append(", position=");
            return vu5.b(sb, this.c, ')');
        }

        public b(Object obj) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            this.a = arrayList;
            this.b = arrayList2;
            this.c = -1;
        }
    }

    public tg30(hg30 hg30Var, xt0 xt0Var) {
        this.a = hg30Var;
        this.b = xt0Var;
    }

    public static long d(x6c0 x6c0Var) {
        SortedSet f = x6c0Var.f();
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(((x5u0) it.next()).J0());
        }
        if (arrayList.isEmpty()) {
            return 1000L;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u1c0 u1c0Var = (u1c0) it2.next();
            r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
            if (r74Var != null) {
                switch (r74Var.c) {
                    case 7:
                    case 58:
                    case 59:
                    case 71:
                    case 207:
                    case INVALID_CSB_DATA_VALUE:
                    case 231:
                    case 257:
                    case 299:
                    case Http.StatusCode.SEE_OTHER /* 303 */:
                    case SILENT_MODE_MONITOR_ERROR_VALUE:
                    case 336:
                    case 337:
                    case 353:
                    case 367:
                    case 404:
                    case InterfaceC4413l1.a.b.e /* 405 */:
                        return 2000L;
                }
            }
            NewsEntry newsEntry = u1c0Var.a;
            if ((newsEntry instanceof ClipsEntry) || (newsEntry instanceof InterestingStoriesEntry) || u1c0Var.c == 7) {
                return 2000L;
            }
        }
        return 1000L;
    }

    @Override // xsna.kuc0
    public final void a(NewsEntry newsEntry) {
        this.c.remove(newsEntry);
        this.d.remove(newsEntry);
    }

    @Override // xsna.kuc0
    public final void b(pwc0 pwc0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        for (x6c0 x6c0Var : pwc0Var.a()) {
            if (this.d.containsKey(x6c0Var.b())) {
                CopyOnWriteArrayList copyOnWriteArrayList = this.e;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((a) it.next()).a, x6c0Var)) {
                            break;
                        }
                    }
                }
                e(x6c0Var, currentTimeMillis);
            }
        }
        clearData();
    }

    @Override // xsna.kuc0
    public final void c(pwc0 pwc0Var, long j, long j2) {
        int i;
        boolean z;
        b bVar;
        long j3 = j;
        pwc0 pwc0Var2 = pwc0Var;
        for (x6c0 x6c0Var : pwc0Var2.a()) {
            Rect b2 = pwc0Var2.b();
            NewsEntry b3 = x6c0Var.b();
            HashMap hashMap = this.d;
            boolean containsKey = hashMap.containsKey(b3);
            HashMap hashMap2 = this.c;
            if (containsKey) {
                boolean z2 = x6c0Var.c().height() >= (x6c0Var.e() ? (int) (((float) x6c0Var.getFullHeight()) * 0.5f) : Integer.MAX_VALUE);
                if (x6c0Var.c().height() < b2.height() * 0.95f && !z2) {
                    e(x6c0Var, j3);
                }
            } else {
                int height = x6c0Var.c().height();
                NewsEntry b4 = x6c0Var.b();
                final qey qeyVar = new qey(9);
                b bVar2 = (b) hashMap2.computeIfAbsent(b4, new Function() { // from class: xsna.sg30
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (tg30.b) qey.this.invoke(obj);
                    }
                });
                ArrayList arrayList = bVar2.a;
                ArrayList arrayList2 = bVar2.b;
                Integer num = (Integer) j5g.k0(arrayList);
                if (num == null || num.intValue() != height) {
                    arrayList.add(Integer.valueOf(height));
                    arrayList2.add(Long.valueOf(j3));
                }
                int fullHeight = x6c0Var.e() ? (int) (x6c0Var.getFullHeight() * 0.5f) : Integer.MAX_VALUE;
                float height2 = b2.height() * 0.95f;
                int h = e43.h(arrayList);
                long d = d(x6c0Var);
                long j4 = 0;
                if (h >= 0) {
                    int i2 = -1;
                    boolean z3 = false;
                    int i3 = 0;
                    while (true) {
                        int intValue = ((Number) arrayList.get(i3)).intValue();
                        long longValue = ((Number) arrayList2.get(i3)).longValue();
                        boolean z4 = z3;
                        boolean z5 = ((float) intValue) >= height2;
                        if ((intValue >= fullHeight || z5) && i2 == -1) {
                            i2 = intValue;
                            j4 = longValue;
                            z3 = true;
                        } else {
                            z3 = z4;
                        }
                        if (intValue < i2) {
                            i2 = -1;
                            z3 = false;
                        }
                        if (i3 == h) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    z = z3;
                    i = i2;
                } else {
                    i = -1;
                    z = false;
                }
                if (i != -1 && j4 >= 0 && j >= 0 && j - j4 > d) {
                    NewsEntry b5 = x6c0Var.b();
                    hashMap.put(b5, Long.valueOf(j4 + d));
                    int position = x6c0Var.getPosition();
                    if ((b5 instanceof PromoPost) || (b5 instanceof ShitAttachment) || (b5 instanceof Html5Entry)) {
                        this.a.a(new pg30.a(b5, AdsintEventTypeDto.MRC_IMPRESSION, position));
                    }
                } else if (z) {
                    this.g.postAtTime(new yh9(this, 5), x6c0Var.b(), d(x6c0Var) + j);
                }
            }
            this.f.getClass();
            if (hashMap.containsKey(x6c0Var.b()) && (bVar = (b) hashMap2.get(x6c0Var.b())) != null) {
                bVar.b.clear();
                bVar.a.clear();
            }
            j3 = j;
        }
    }

    @Override // xsna.kuc0
    public final void clearData() {
        this.c.clear();
        this.d.clear();
        this.e.clear();
        ((ConcurrentHashMap) kg30.a.getValue()).clear();
        this.b.clearData();
        this.g.removeCallbacksAndMessages(null);
    }

    public final void e(x6c0 x6c0Var, long j) {
        int i;
        long j2;
        String str;
        String str2;
        NewsEntry b2 = x6c0Var.b();
        Long l = (Long) this.d.remove(b2);
        if (l != null) {
            long longValue = j - l.longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(j);
            long micros2 = micros - timeUnit.toMicros(longValue);
            this.e.add(new a(b2, longValue, x6c0Var.getPosition()));
            int position = x6c0Var.getPosition();
            if (b2 instanceof PromoPost) {
                PromoPost promoPost = (PromoPost) b2;
                Post post = promoPost.n;
                i = post.n;
                j2 = post.m.b;
                String str3 = promoPost.u.b;
                str = str3 != null ? str3 : "";
                str2 = promoPost.l;
            } else if (b2 instanceof ShitAttachment) {
                ShitAttachment shitAttachment = (ShitAttachment) b2;
                i = shitAttachment.i;
                j2 = shitAttachment.j;
                String str4 = shitAttachment.Q.b;
                str = str4 != null ? str4 : "";
                str2 = shitAttachment.v;
            } else {
                if (!(b2 instanceof Html5Entry)) {
                    if (b2 instanceof Post) {
                        Post post2 = (Post) b2;
                        i = post2.n;
                        j2 = post2.m.b;
                        String str5 = post2.L.b;
                        str = str5 != null ? str5 : "";
                        str2 = null;
                    }
                    this.g.removeCallbacksAndMessages(x6c0Var);
                    this.f.getClass();
                }
                Html5Entry html5Entry = (Html5Entry) b2;
                i = html5Entry.i;
                j2 = html5Entry.j;
                String str6 = html5Entry.z.b;
                str = str6 != null ? str6 : "";
                str2 = html5Entry.x;
            }
            this.a.a(new pg30.d(longValue, i, j2, str, micros2, micros, position, str2));
            this.g.removeCallbacksAndMessages(x6c0Var);
            this.f.getClass();
        }
    }
}
