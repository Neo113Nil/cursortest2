package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import xsna.lc7;
import xsna.rpv;

/* compiled from: IconLruCache.kt */
/* loaded from: classes2.dex */
public final class wqv {
    public final lc7.a<cpv> a;
    public final rpv.b b;
    public final lc7<StringId, cpv> c;
    public final AtomicReference<Map<StringId, cpv>> d;
    public final ConcurrentHashMap<StringId, cpv> e;

    /* compiled from: IconLruCache.kt */
    public interface a {
        public static final C3950a a = C3950a.a;

        /* compiled from: IconLruCache.kt */
        /* renamed from: xsna.wqv$a$a, reason: collision with other inner class name */
        public static final class C3950a {
            public static final /* synthetic */ C3950a a = new C3950a();

            /* compiled from: IconLruCache.kt */
            /* renamed from: xsna.wqv$a$a$a, reason: collision with other inner class name */
            public static final class C3951a implements a {
                public static final C3951a b = new C3951a();
            }
        }
    }

    public wqv(Integer num, lc7.a aVar, rpv.b bVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = new lc7<>(num, aVar);
        this.d = new AtomicReference<>(sni.d(100, 2));
        this.e = new ConcurrentHashMap<>(20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cpv a(int i, String str) {
        String a2 = this.b.a(i, str);
        cpv cpvVar = this.e.get(new StringId(a2));
        if (cpvVar != null) {
            return cpvVar;
        }
        return (cpv) this.c.get(new StringId(a2));
    }

    public final void b(wqv wqvVar) {
        for (Map.Entry entry : wqvVar.c.snapshot().entrySet()) {
            c(((StringId) entry.getKey()).b, (cpv) entry.getValue(), null, null);
        }
        ConcurrentHashMap<StringId, cpv> concurrentHashMap = wqvVar.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(concurrentHashMap.size()));
        Iterator<T> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ((cpv) entry2.getValue()).b());
        }
        this.e.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String str, cpv cpvVar, String str2, VisibleStyle visibleStyle) {
        lc7.a<cpv> aVar = this.a;
        if (aVar != null && aVar.a(cpvVar)) {
            this.e.put(new StringId(str), cpvVar);
            return;
        }
        lc7<StringId, cpv> lc7Var = this.c;
        AtomicReference<Map<StringId, cpv>> atomicReference = this.d;
        if (str2 != null && visibleStyle != null) {
            int i = visibleStyle.b;
            if ((i & 8192) != 0) {
                String a2 = this.b.a(i & (-8193), str2);
                cpv cpvVar2 = (cpv) lc7Var.get(new StringId(a2));
                if (cpvVar2 != null) {
                    loop0: while (true) {
                        Map<StringId, cpv> map = atomicReference.get();
                        Map<StringId, cpv> map2 = map;
                        Map<StringId, cpv> d = sni.d(map2.size() + 1, 2);
                        d.putAll(map2);
                        d.put(new StringId(a2), cpvVar2);
                        while (!atomicReference.compareAndSet(map, d)) {
                            if (atomicReference.get() != map) {
                                break;
                            }
                        }
                    }
                }
                L.G("duplicate!");
            }
        }
        if (atomicReference.get().containsKey(new StringId(str))) {
            atomicReference.get().remove(new StringId(str));
        }
        lc7Var.put(new StringId(str), cpvVar);
    }

    public final void d(boolean z) {
        lc7<StringId, cpv> lc7Var = this.c;
        if (!z) {
            while (true) {
                AtomicReference<Map<StringId, cpv>> atomicReference = this.d;
                Map<StringId, cpv> map = atomicReference.get();
                Map<StringId, cpv> d = sni.d(map.size(), 2);
                d.putAll(lc7Var.snapshot());
                while (!atomicReference.compareAndSet(map, d)) {
                    if (atomicReference.get() != map) {
                        break;
                    }
                }
                return;
            }
        }
        bpn0 bpn0Var = lc7Var.c;
        try {
            lc7Var.evictAll();
        } catch (Throwable th) {
            L.E(th, new Object[0]);
        }
        if (bpn0Var.isInitialized()) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) bpn0Var.getValue();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"missed by evictAll() icons size = " + copyOnWriteArrayList.size()});
            }
            try {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((md7) it.next()).a();
                }
                copyOnWriteArrayList.clear();
            } catch (Throwable th2) {
                L.E(th2, new Object[0]);
            }
        }
        ConcurrentHashMap<StringId, cpv> concurrentHashMap = this.e;
        Iterator<cpv> it2 = concurrentHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        concurrentHashMap.clear();
    }

    public final void e(String str, cpv cpvVar) {
        String a2 = this.b.a(cpvVar.c, str);
        Map<StringId, cpv> map = this.d.get();
        cpv cpvVar2 = map.get(new StringId(a2));
        if (cpvVar2 != null) {
            cpvVar2.a();
        }
        map.remove(new StringId(a2));
    }

    public final void f(String str, int i, cpv cpvVar) {
        c(this.b.a(i, str), cpvVar, str, new VisibleStyle(i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icons.");
        sb.append(this.c);
        sb.append(";protected=");
        sb.append(this.e.size());
        sb.append(";free=");
        sb.append(an10.a((r1.maxSize() - r1.size()) / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES));
        sb.append("Mb;");
        return sb.toString();
    }

    public /* synthetic */ wqv(rpv.a aVar, rpv.b bVar) {
        this(30, aVar, bVar);
    }
}
