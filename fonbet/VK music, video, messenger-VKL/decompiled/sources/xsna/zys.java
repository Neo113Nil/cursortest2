package xsna;

import com.vk.fullscreen.promo.core.FullscreenPromoEvent;
import com.vk.fullscreen.promo.core.PromoArguments;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import kotlin.Pair;
import xsna.azs;

/* compiled from: FullscreenPromoManager.kt */
/* loaded from: classes.dex */
public final class zys {
    public final ConcurrentHashMap<FullscreenPromoEvent, ConcurrentLinkedQueue<Pair<wys, b>>> a = new ConcurrentHashMap<>();
    public volatile AtomicReference<String> b = new AtomicReference<>(null);
    public final List<a> c = dez0.b();

    /* compiled from: FullscreenPromoManager.kt */
    public static final class a {
        public final FullscreenPromoEvent a;
        public final PromoArguments b;

        public a(FullscreenPromoEvent fullscreenPromoEvent, PromoArguments promoArguments) {
            this.a = fullscreenPromoEvent;
            this.b = promoArguments;
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
            int hashCode = this.a.hashCode() * 31;
            PromoArguments promoArguments = this.b;
            return hashCode + (promoArguments == null ? 0 : promoArguments.hashCode());
        }

        public final String toString() {
            return "EventPayload(event=" + this.a + ", arguments=" + this.b + ')';
        }
    }

    /* compiled from: FullscreenPromoManager.kt */
    public static final class b {
        public final Set<vys> a;
        public final azs.a b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Set<? extends vys> set, azs.a aVar) {
            this.a = set;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PromoNode(conditions=" + this.a + ", presenterFactory=" + this.b + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FullscreenPromoManager.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c NoCandidates;
        public static final c NoSuitableCandidates;
        public static final c Occupied;
        public static final c Shown;

        static {
            c cVar = new c("NoCandidates", 0);
            NoCandidates = cVar;
            c cVar2 = new c("NoSuitableCandidates", 1);
            NoSuitableCandidates = cVar2;
            c cVar3 = new c("Occupied", 2);
            Occupied = cVar3;
            c cVar4 = new c("Shown", 3);
            Shown = cVar4;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: FullscreenPromoManager.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.NoCandidates.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.NoSuitableCandidates.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void a(PromoSessionInfo promoSessionInfo) {
        a aVar;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"FullscreenPromoManager", "complete promo " + promoSessionInfo.getId()});
        }
        String str = promoSessionInfo.e().b;
        if (pn.d(this.b, promoSessionInfo.getId(), str)) {
            d(new a(promoSessionInfo.e(), promoSessionInfo.d()));
            if (mr.d(str, this.b)) {
                while (!this.c.isEmpty() && (aVar = (a) j5g.a0(this.c)) != null) {
                    String str2 = aVar.a.b;
                    if (!sn.i(this.b, str2)) {
                        return;
                    }
                    this.c.remove(0);
                    d(aVar);
                    if (!epx.f(this.b.get(), str2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void b(wys wysVar, FullscreenPromoEvent fullscreenPromoEvent, Set<? extends vys> set, azs.a aVar) {
        ConcurrentLinkedQueue<Pair<wys, b>> putIfAbsent;
        b bVar = new b(set, aVar);
        ConcurrentHashMap<FullscreenPromoEvent, ConcurrentLinkedQueue<Pair<wys, b>>> concurrentHashMap = this.a;
        ConcurrentLinkedQueue<Pair<wys, b>> concurrentLinkedQueue = concurrentHashMap.get(fullscreenPromoEvent);
        if (concurrentLinkedQueue == null && (putIfAbsent = concurrentHashMap.putIfAbsent(fullscreenPromoEvent, (concurrentLinkedQueue = new ConcurrentLinkedQueue<>()))) != null) {
            concurrentLinkedQueue = putIfAbsent;
        }
        concurrentLinkedQueue.add(new Pair<>(wysVar, bVar));
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"FullscreenPromoManager", "register presenter promoId=" + wysVar.a + " forEvent=" + fullscreenPromoEvent.b});
    }

    public final void c(FullscreenPromoEvent fullscreenPromoEvent, PromoArguments.SignUp signUp) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"FullscreenPromoManager", "trigger event ".concat(fullscreenPromoEvent.b)});
        }
        a aVar = new a(fullscreenPromoEvent, signUp);
        AtomicReference<String> atomicReference = this.b;
        String str = fullscreenPromoEvent.b;
        while (!atomicReference.compareAndSet(null, str)) {
            if (atomicReference.get() != null) {
                this.c.add(aVar);
                return;
            }
        }
        int i = d.$EnumSwitchMapping$0[d(aVar).ordinal()];
        if (i == 1 || i == 2) {
            this.b.getAndSet(null);
        }
    }

    public final c d(a aVar) {
        ConcurrentLinkedQueue<Pair<wys, b>> concurrentLinkedQueue = this.a.get(aVar.a);
        if (concurrentLinkedQueue == null) {
            return c.NoCandidates;
        }
        Iterator<Pair<wys, b>> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            Pair<wys, b> next = it.next();
            wys d2 = next.d();
            b g = next.g();
            Set<vys> set = g.a;
            boolean z = true;
            if (!set.isEmpty()) {
                Set<vys> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator<T> it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (((vys) it2.next()).isValid()) {
                            break;
                        }
                    }
                }
                z = false;
            }
            String str = aVar.a.b;
            String str2 = aVar.a.b + ':' + d2.a;
            if (z) {
                AtomicReference<String> atomicReference = this.b;
                while (!atomicReference.compareAndSet(str, str2)) {
                    if (atomicReference.get() != str) {
                        return c.Occupied;
                    }
                }
                final xys xysVar = new xys(d2, 0);
                concurrentLinkedQueue.removeIf(new Predicate() { // from class: xsna.yys
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) xys.this.invoke(obj)).booleanValue();
                    }
                });
                azs a2 = g.b.a(this);
                PromoSessionInfo promoSessionInfo = new PromoSessionInfo(aVar.a, aVar.b, str2);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"FullscreenPromoManager", "show presenter ".concat(d2.a)});
                }
                a2.a(promoSessionInfo);
                return c.Shown;
            }
        }
        return c.NoSuitableCandidates;
    }
}
