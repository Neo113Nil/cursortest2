package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.commands.messages.GetRecentClipIdsCmd;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.dcm;

/* compiled from: DialogClipsContextRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class dcm implements qbm {
    public final com.vk.im.engine.models.c a;
    public final f1w b;
    public final xbw c;
    public final lzv d;
    public final izv e;
    public final ConcurrentHashMap<Long, a> f = new ConcurrentHashMap<>();
    public final ConcurrentHashMap.KeySetView<Long, Boolean> g = ConcurrentHashMap.newKeySet();
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public final ConcurrentHashMap<Long, io.reactivex.rxjava3.disposables.c> i = new ConcurrentHashMap<>();

    /* compiled from: DialogClipsContextRepositoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final List<String> a;
        public final boolean b;
        public final boolean c;
        public final int d;

        public a() {
            this(0, 15);
        }

        public static a a(a aVar, List list, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                list = aVar.a;
            }
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            if ((i & 4) != 0) {
                z2 = aVar.c;
            }
            int i2 = (i & 8) != 0 ? aVar.d : 20;
            aVar.getClass();
            return new a(i2, z, list, z2);
        }

        public final List<String> b() {
            return this.a;
        }

        public final int c() {
            return this.d;
        }

        public final boolean d() {
            return this.c;
        }

        public final boolean e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheEntry(clips=");
            sb.append(this.a);
            sb.append(", isLoading=");
            sb.append(this.b);
            sb.append(", isFullyLoaded=");
            sb.append(this.c);
            sb.append(", lastRequestedCount=");
            return vu5.b(sb, this.d, ')');
        }

        public a(int i, boolean z, List list, boolean z2) {
            this.a = list;
            this.b = z;
            this.c = z2;
            this.d = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i, int i2) {
            this((i2 & 8) != 0 ? 0 : i, (i2 & 2) == 0, r0, false);
            EmptyList emptyList = EmptyList.b;
        }
    }

    /* compiled from: DialogClipsContextRepositoryImpl.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetRecentClipIdsCmd.RecentClipsFilter.values().length];
            try {
                iArr[GetRecentClipIdsCmd.RecentClipsFilter.RECENT_INC_AND_OUT_CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetRecentClipIdsCmd.RecentClipsFilter.RECENT_ALL_CLIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dcm(com.vk.im.engine.models.c cVar, f1w f1wVar, xbw xbwVar, lzv lzvVar, izv izvVar) {
        this.a = cVar;
        this.b = f1wVar;
        this.c = xbwVar;
        this.d = lzvVar;
        this.e = izvVar;
    }

    public static ArrayList d(List list) {
        VideoFile A;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Attach a2 = ((j8v) it.next()).a();
            String str = null;
            AttachVideo attachVideo = a2 instanceof AttachVideo ? (AttachVideo) a2 : null;
            if (attachVideo != null && (A = attachVideo.A()) != null) {
                str = A.a1();
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // xsna.qbm
    public final void a(long j) {
        if (this.a.z()) {
            ConcurrentHashMap.KeySetView<Long, Boolean> keySetView = this.g;
            if (keySetView.isEmpty()) {
                this.h.b(hg1.c(this.c.a().r0(asu0.a.c()), p980.class, e980.class, OnCacheInvalidateEvent.class).subscribe(new mp0(new wcj(this, 3), 18), new ga(new x90(14), 25)));
            }
            keySetView.add(Long.valueOf(j));
            Long valueOf = Long.valueOf(j);
            final pv7 pv7Var = new pv7((byte) 0, 6);
            this.f.compute(valueOf, new BiFunction() { // from class: xsna.vbm
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return (dcm.a) pv7.this.invoke(obj, obj2);
                }
            });
            e(20, j);
        }
    }

    @Override // xsna.qbm
    public final void b(long j) {
        if (this.a.z()) {
            Long valueOf = Long.valueOf(j);
            ConcurrentHashMap.KeySetView<Long, Boolean> keySetView = this.g;
            if (keySetView.remove(valueOf)) {
                Long valueOf2 = Long.valueOf(j);
                ConcurrentHashMap<Long, a> concurrentHashMap = this.f;
                concurrentHashMap.remove(valueOf2);
                Long valueOf3 = Long.valueOf(j);
                ConcurrentHashMap<Long, io.reactivex.rxjava3.disposables.c> concurrentHashMap2 = this.i;
                io.reactivex.rxjava3.disposables.c remove = concurrentHashMap2.remove(valueOf3);
                if (remove != null) {
                    remove.dispose();
                }
                if (keySetView.isEmpty()) {
                    this.h.e();
                    Iterator<T> it = concurrentHashMap2.values().iterator();
                    while (it.hasNext()) {
                        ((io.reactivex.rxjava3.disposables.c) it.next()).dispose();
                    }
                    concurrentHashMap2.clear();
                    concurrentHashMap.clear();
                }
            }
        }
    }

    @Override // xsna.qbm
    public final String c(long j) {
        List list;
        List<String> b2;
        if (!this.a.z()) {
            return null;
        }
        Long valueOf = Long.valueOf(j);
        final kxa kxaVar = new kxa((byte) 0, 3);
        BiFunction<? super Long, ? super a, ? extends a> biFunction = new BiFunction() { // from class: xsna.bcm
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (dcm.a) kxa.this.invoke(obj, obj2);
            }
        };
        ConcurrentHashMap<Long, a> concurrentHashMap = this.f;
        concurrentHashMap.compute(valueOf, biFunction);
        a aVar = concurrentHashMap.get(Long.valueOf(j));
        if (aVar != null && !aVar.b().isEmpty()) {
            if (aVar.b().size() < 20 && !aVar.d() && !aVar.e()) {
                e(20, j);
            }
            return pli.o(j5g.H0(aVar.b(), 20));
        }
        e(20, j);
        a aVar2 = concurrentHashMap.get(Long.valueOf(j));
        if (aVar2 == null || (b2 = aVar2.b()) == null || (list = j5g.H0(b2, 20)) == null) {
            list = EmptyList.b;
        }
        return pli.o(list);
    }

    public final void e(int i, long j) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Long valueOf = Long.valueOf(j);
        final ccm ccmVar = new ccm(ref$BooleanRef, i, 0);
        this.f.compute(valueOf, new BiFunction() { // from class: xsna.rbm
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (dcm.a) ccm.this.invoke(obj, obj2);
            }
        });
        if (ref$BooleanRef.element) {
            long a2 = qni0.a() - TimeUnit.DAYS.toMillis(60L);
            new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.n(this.d.b(this, new GetRecentClipIdsCmd(j, i, this.a.C().a() ? GetRecentClipIdsCmd.RecentClipsFilter.RECENT_INC_AND_OUT_CLIPS : GetRecentClipIdsCmd.RecentClipsFilter.RECENT_ALL_CLIPS, Long.valueOf(a2))).q(asu0.a.c()), new b00(new sbm(this, j), 18)), new ed(new tbm(this, j, i, a2), 12)), new fa4(this, j, 1)).subscribe(new pm1(new ubm(this, j, i), 14), new ia(new cj1(19), 24));
        }
    }

    public final void f(long j) {
        int i;
        Long valueOf = Long.valueOf(j);
        ConcurrentHashMap<Long, a> concurrentHashMap = this.f;
        a aVar = concurrentHashMap.get(valueOf);
        if (aVar != null) {
            int c = aVar.c();
            Integer valueOf2 = Integer.valueOf(c);
            if (c <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                i = valueOf2.intValue();
                Long valueOf3 = Long.valueOf(j);
                final vv7 vv7Var = new vv7(6);
                concurrentHashMap.computeIfPresent(valueOf3, new BiFunction() { // from class: xsna.wbm
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return (dcm.a) vv7.this.invoke(obj, obj2);
                    }
                });
                e(i, j);
            }
        }
        i = 20;
        Long valueOf32 = Long.valueOf(j);
        final vv7 vv7Var2 = new vv7(6);
        concurrentHashMap.computeIfPresent(valueOf32, new BiFunction() { // from class: xsna.wbm
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (dcm.a) vv7.this.invoke(obj, obj2);
            }
        });
        e(i, j);
    }
}
