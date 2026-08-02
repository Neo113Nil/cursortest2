package xsna;

import android.os.Handler;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.api.domain.preload.StoryVideoMemoryCache;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.j1d0;

/* compiled from: StoryPreloadManagerThreadSafe.kt */
/* loaded from: classes6.dex */
public final class x8m0 {
    public final bpn0 a = new bpn0(new xs6(28));
    public final bpn0 b = new bpn0(new d14(28));
    public final hyu c = new hyu(22);
    public final w8m0 d = new w8m0(0);
    public final CopyOnWriteArrayList<sht0> e = new CopyOnWriteArrayList<>();
    public final io.reactivex.rxjava3.subjects.f<sht0> f = new io.reactivex.rxjava3.subjects.f<>();
    public final egi g = new egi();
    public final bpn0 h = new bpn0(new nm60(this, 22));
    public final a i = new a();

    /* compiled from: StoryPreloadManagerThreadSafe.kt */
    public static final class a implements j1d0.a {
        public a() {
        }

        @Override // xsna.j1d0.a
        public final void a(sht0 sht0Var) {
            x8m0.this.f.onNext(sht0Var);
        }
    }

    public x8m0() {
        dac0 dac0Var = new dac0(this, 13);
        asu0.a.getClass();
        asu0.o().execute(new ddx(2, dac0Var));
    }

    public final void a() {
        orj0 orj0Var = new orj0(this, 6);
        this.g.getClass();
        asu0.a.getClass();
        asu0.o().execute(new ddx(2, orj0Var));
    }

    public final j1d0 b() {
        bpn0 bpn0Var = this.h;
        if (!bpn0Var.isInitialized()) {
            bpn0Var = null;
        }
        if (bpn0Var != null) {
            return (j1d0) bpn0Var.getValue();
        }
        return null;
    }

    public final io.reactivex.rxjava3.core.a c(StoryEntry storyEntry, StoryVideoMemoryCache storyVideoMemoryCache) {
        VideoFile videoFile;
        m7q m7qVar;
        sht0 sht0Var = null;
        if (storyEntry.Tb() && (videoFile = storyEntry.n) != null && (m7qVar = (m7q) this.c.invoke(videoFile)) != null) {
            sht0Var = jgz.e(m7qVar);
        }
        if (sht0Var == null) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        io.reactivex.rxjava3.internal.operators.completable.l l = io.reactivex.rxjava3.core.a.l(new ya4(2, this, sht0Var));
        this.g.getClass();
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.internal.operators.observable.e0 e0Var = new io.reactivex.rxjava3.internal.operators.observable.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(this.f.a0(asu0.p()), new i3u(new ptl0(sht0Var, 2), 14)));
        lw30 lw30Var = new lw30(new lx60(13, storyVideoMemoryCache, this), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return l.c(new io.reactivex.rxjava3.internal.operators.maybe.s(new io.reactivex.rxjava3.internal.operators.maybe.b0(e0Var, lVar, lw30Var, lVar, kVar, kVar)).o(asu0Var.c())).q(asu0.p()).o(asu0Var.c());
    }

    public final void d() {
        bpn0 bpn0Var;
        Iterator<sht0> it = this.e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bpn0Var = this.h;
            if (!hasNext) {
                break;
            }
            sht0 next = it.next();
            j1d0 j1d0Var = (j1d0) bpn0Var.getValue();
            j1d0.b bVar = new j1d0.b(((Number) this.a.getValue()).longValue());
            j1d0Var.c();
            j1d0Var.h.add(new d1d0(next, bVar));
        }
        if (((j1d0) bpn0Var.getValue()).f == null) {
            ((j1d0) bpn0Var.getValue()).f = this.i;
        }
        final j1d0 j1d0Var2 = (j1d0) bpn0Var.getValue();
        j1d0Var2.c();
        bpn0 bpn0Var2 = j1d0Var2.l;
        ((Handler) bpn0Var2.getValue()).removeCallbacksAndMessages(null);
        ArrayList arrayList = j1d0Var2.h;
        final List O0 = j5g.O0(arrayList);
        arrayList.clear();
        final sht0 sht0Var = null;
        ((Handler) bpn0Var2.getValue()).post(new Runnable() { // from class: xsna.i1d0
            @Override // java.lang.Runnable
            public final void run() {
                boolean containsKey;
                q1d0 c;
                j1d0 j1d0Var3 = j1d0.this;
                List<d1d0> list = O0;
                sht0 sht0Var2 = sht0Var;
                e1d0 e1d0Var = j1d0Var3.g;
                synchronized (e1d0Var) {
                    try {
                        e1d0Var.b();
                        HashMap hashMap = new HashMap();
                        for (d1d0 d1d0Var : list) {
                            hashMap.put(d1d0Var.a, d1d0Var);
                        }
                        for (sht0 sht0Var3 : j5g.O0(e1d0Var.a.keySet())) {
                            if (!hashMap.containsKey(sht0Var3) && !epx.f(sht0Var3, sht0Var2) && (c = e1d0Var.c(sht0Var3)) != null) {
                                c.s.post(new o63(c, 12));
                            }
                        }
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            d1d0 d1d0Var2 = (d1d0) it2.next();
                            q1d0 q1d0Var = d1d0Var2.c;
                            sht0 sht0Var4 = d1d0Var2.a;
                            d1d0 d1d0Var3 = e1d0Var.a.get(sht0Var4);
                            if ((d1d0Var3 != null ? d1d0Var3.c : null) == null) {
                                e1d0Var.a.put(sht0Var4, d1d0Var2);
                            }
                        }
                        e1d0Var.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                q1d0 q1d0Var2 = j1d0Var3.j;
                if (q1d0Var2 != null) {
                    e1d0 e1d0Var2 = j1d0Var3.g;
                    synchronized (e1d0Var2) {
                        containsKey = e1d0Var2.b.containsKey(q1d0Var2);
                    }
                    if (!containsKey) {
                        j1d0Var3.j = null;
                    }
                }
                synchronized (j1d0Var3.k) {
                    j1d0Var3.i.clear();
                    j1d0Var3.g.a(new t440(j1d0Var3, 14));
                    s3q0 s3q0Var = s3q0.a;
                }
                if (j1d0Var3.j == null) {
                    j1d0Var3.e();
                }
            }
        });
    }
}
