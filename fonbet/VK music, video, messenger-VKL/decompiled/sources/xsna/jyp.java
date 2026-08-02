package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.CycleInvocationException;
import com.vk.im.engine.exceptions.ImEngineIdOutOfBounds;
import com.vk.im.engine.exceptions.ImEngineTestException;
import com.vk.im.engine.exceptions.ImEngineUnrecoverableException;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import xsna.ah30;
import xsna.whc;

/* compiled from: EventConsumer.kt */
/* loaded from: classes7.dex */
public final class jyp implements io.reactivex.rxjava3.functions.f<sxp>, io.reactivex.rxjava3.disposables.c {
    public final w9w b;
    public volatile boolean c;

    public jyp(w9w w9wVar) {
        this.b = w9wVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        sxp sxpVar2 = sxpVar;
        if (sxpVar2 instanceof e980) {
            w9w w9wVar = this.b;
            e980 e980Var = (e980) sxpVar2;
            Peer peer = e980Var.b;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b = Peer.a.b(e980Var.d);
            Collection<Integer> collection = e980Var.e;
            Collection<Integer> collection2 = e980Var.f;
            LongPollType longPollType = e980Var.g;
            synchronized (w9wVar) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (!collection2.contains(Integer.valueOf(intValue))) {
                        w9w.h.getClass();
                        if (epx.f(((Map) w9w.j.getValue()).get(longPollType), Boolean.TRUE)) {
                            g9e0 g9e0Var = w9wVar.c;
                            qcy<Object> qcyVar = w9w.i[0];
                            ah30 ah30Var = (ah30) g9e0Var.b();
                            if (!ah30Var.i) {
                                ah30Var.g.onNext(new ah30.a(peer.b, b.b, intValue));
                            }
                        }
                    }
                }
            }
            return;
        }
        if (sxpVar2 instanceof f980) {
            w9w w9wVar2 = this.b;
            f980 f980Var = (f980) sxpVar2;
            Peer peer2 = f980Var.b;
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            Peer b2 = Peer.a.b(f980Var.d);
            Collection<Integer> collection3 = f980Var.e;
            synchronized (w9wVar2) {
                Iterator<T> it2 = collection3.iterator();
                while (it2.hasNext()) {
                    final int intValue2 = ((Number) it2.next()).intValue();
                    g9e0 g9e0Var2 = w9wVar2.e;
                    qcy<Object> qcyVar2 = w9w.i[2];
                    final nv30 nv30Var = (nv30) g9e0Var2.b();
                    Context context = e43.a;
                    final Context context2 = context != null ? context : null;
                    final long j = peer2.b;
                    final long j2 = b2.b;
                    if (!nv30Var.b) {
                        final boolean z = false;
                        nv30Var.a.submit(new Runnable() { // from class: xsna.mv30
                            @Override // java.lang.Runnable
                            public final void run() {
                                nv30 nv30Var2 = nv30.this;
                                Context context3 = context2;
                                long j3 = j2;
                                int i = intValue2;
                                long j4 = j;
                                boolean z2 = z;
                                if (nv30Var2.b) {
                                    return;
                                }
                                try {
                                    ra20 ra20Var = ra20.a;
                                    Long valueOf = Long.valueOf(j4);
                                    ra20Var.getClass();
                                    ra20.f(context3, j3, i, valueOf, z2);
                                    wo8.c(context3, j3, i, z2);
                                    z320.b(context3, j3, i, z2);
                                } catch (Throwable th) {
                                    L.j(th, "error on remove msg notify");
                                }
                            }
                        });
                    }
                }
            }
            return;
        }
        if (sxpVar2 instanceof i980) {
            w9w w9wVar3 = this.b;
            i980 i980Var = (i980) sxpVar2;
            Peer peer3 = i980Var.b;
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            Peer b3 = Peer.a.b(i980Var.d);
            final int i = i980Var.e;
            synchronized (w9wVar3) {
                g9e0 g9e0Var3 = w9wVar3.d;
                qcy<Object> qcyVar3 = w9w.i[1];
                final wi30 wi30Var = (wi30) g9e0Var3.b();
                Context context3 = e43.a;
                final Context context4 = context3 != null ? context3 : null;
                final a1w a1wVar = w9wVar3.a;
                final long j3 = peer3.b;
                final long j4 = b3.b;
                if (!wi30Var.g) {
                    wi30Var.e.submit(new Runnable() { // from class: xsna.vi30
                        @Override // java.lang.Runnable
                        public final void run() {
                            dv30 b4;
                            wi30 wi30Var2 = wi30.this;
                            Context context5 = context4;
                            a1w a1wVar2 = a1wVar;
                            long j5 = j3;
                            long j6 = j4;
                            int i2 = i;
                            if (wi30Var2.g) {
                                return;
                            }
                            try {
                                ChatFragment.w1.getClass();
                                uk70 uk70Var = null;
                                if (ChatFragment.y1 != j6 && (b4 = wi30Var2.d.b(a1wVar2, j5, j6, i2, false)) != null) {
                                    uk70Var = wi30Var2.c.a(context5, b4);
                                }
                                wi30Var2.b(context5, uk70Var);
                            } catch (Throwable th) {
                                if (wi30Var2.g) {
                                    return;
                                }
                                L.E(th, new Object[0]);
                            }
                        }
                    });
                }
            }
            return;
        }
        if (sxpVar2 instanceof b380) {
            b380 b380Var = (b380) sxpVar2;
            if (b380Var.f) {
                w9w w9wVar4 = this.b;
                Peer peer4 = b380Var.b;
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                Peer b4 = Peer.a.b(b380Var.d);
                final int i2 = b380Var.e;
                synchronized (w9wVar4) {
                    g9e0 g9e0Var4 = w9wVar4.e;
                    qcy<Object> qcyVar4 = w9w.i[2];
                    final nv30 nv30Var2 = (nv30) g9e0Var4.b();
                    Context context5 = e43.a;
                    final Context context6 = context5 != null ? context5 : null;
                    final long j5 = peer4.b;
                    final long j6 = b4.b;
                    if (!nv30Var2.b) {
                        final boolean z2 = true;
                        nv30Var2.a.submit(new Runnable() { // from class: xsna.mv30
                            @Override // java.lang.Runnable
                            public final void run() {
                                nv30 nv30Var22 = nv30.this;
                                Context context32 = context6;
                                long j32 = j6;
                                int i3 = i2;
                                long j42 = j5;
                                boolean z22 = z2;
                                if (nv30Var22.b) {
                                    return;
                                }
                                try {
                                    ra20 ra20Var = ra20.a;
                                    Long valueOf = Long.valueOf(j42);
                                    ra20Var.getClass();
                                    ra20.f(context32, j32, i3, valueOf, z22);
                                    wo8.c(context32, j32, i3, z22);
                                    z320.b(context32, j32, i3, z22);
                                } catch (Throwable th) {
                                    L.j(th, "error on remove msg notify");
                                }
                            }
                        });
                    }
                }
                return;
            }
            return;
        }
        if (sxpVar2 instanceof g980) {
            w9w w9wVar5 = this.b;
            g980 g980Var = (g980) sxpVar2;
            Peer peer5 = g980Var.b;
            Serializer.c<Peer> cVar5 = Peer.CREATOR;
            w9wVar5.a(g980Var.e, peer5, Peer.a.b(g980Var.d));
            return;
        }
        if (sxpVar2 instanceof p980) {
            p980 p980Var = (p980) sxpVar2;
            for (Map.Entry<Long, Collection<Integer>> entry : p980Var.d.entrySet()) {
                long longValue = entry.getKey().longValue();
                Iterator<T> it3 = entry.getValue().iterator();
                while (it3.hasNext()) {
                    int intValue3 = ((Number) it3.next()).intValue();
                    w9w w9wVar6 = this.b;
                    Peer peer6 = p980Var.b;
                    Serializer.c<Peer> cVar6 = Peer.CREATOR;
                    w9wVar6.a(intValue3, peer6, Peer.a.b(longValue));
                }
            }
            return;
        }
        if (sxpVar2 instanceof ka80) {
            return;
        }
        if (sxpVar2 instanceof h680) {
            t6g0 t6g0Var = t6g0.b;
            t6g0.d().h();
            return;
        }
        if (sxpVar2 instanceof y580) {
            y580 y580Var = (y580) sxpVar2;
            Throwable b5 = y580Var.b.a.b();
            String str = y580Var.c;
            if (str == null) {
                str = nlp.b(b5) ? nlp.d(b5) : nlp.c(b5) ? "db_consistency_error" : nlp.a(b5, ImEngineUnrecoverableException.class) ? "unrecoverable_error" : nlp.a(b5, Serializer.DeserializationError.class) ? "serializer_error" : nlp.a(b5, ImEngineIdOutOfBounds.class) ? "engine_id_out_of_bound" : nlp.a(b5, CycleInvocationException.class) ? "cycle_refresh" : "unknown_error";
            }
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("messages_db_error");
            aVar.c("type", str);
            aVar.i("StatlogTracker");
            bVar.k(aVar.e());
            if (nlp.a(b5, ImEngineTestException.class)) {
                Context context7 = e43.a;
                enj.r(context7 != null ? context7 : null, "(Мессенджер) Произошла тестовая ошибка!", 0);
                return;
            } else {
                bVar.a(b5);
                a1w a1wVar2 = q1w.a;
                (a1wVar2 != null ? a1wVar2 : null).G(y580Var.d, y580Var.e, new whc.a(str, b5));
                return;
            }
        }
        if (sxpVar2 instanceof j400) {
            L.e("[Push]: LongPollHistory update pushes");
            w9w.h.getClass();
            ((Map) w9w.j.getValue()).put(null, Boolean.TRUE);
            return;
        }
        if (sxpVar2 instanceof k980) {
            this.b.c(((k980) sxpVar2).c);
            return;
        }
        if (sxpVar2 instanceof j980) {
            w9w w9wVar7 = this.b;
            long j7 = ((j980) sxpVar2).b;
            ca70 ca70Var = ca70.a;
            Context context8 = e43.a;
            ca70.a(context8 != null ? context8 : null, "msg_request", Long.valueOf(j7));
            f620.d(w9wVar7, false);
            return;
        }
        if (sxpVar2 instanceof g480) {
            w9w w9wVar8 = this.b;
            g480 g480Var = (g480) sxpVar2;
            long j8 = g480Var.b;
            w9wVar8.b(g480Var.c);
            return;
        }
        if (sxpVar2 instanceof s380) {
            w9w w9wVar9 = this.b;
            long j9 = ((s380) sxpVar2).b;
            ca70 ca70Var2 = ca70.a;
            Context context9 = e43.a;
            ca70.a(context9 != null ? context9 : null, "msg_request", Long.valueOf(j9));
            f620.d(w9wVar9, false);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.c = true;
        w9w w9wVar = this.b;
        synchronized (w9wVar) {
            try {
                if (w9wVar.c.c()) {
                    g9e0 g9e0Var = w9wVar.c;
                    qcy<Object> qcyVar = w9w.i[0];
                    ah30 ah30Var = (ah30) g9e0Var.b();
                    if (!ah30Var.i) {
                        ah30Var.i = true;
                        ah30Var.h.dispose();
                    }
                    w9wVar.c.d();
                }
                if (w9wVar.d.c()) {
                    g9e0 g9e0Var2 = w9wVar.d;
                    qcy<Object> qcyVar2 = w9w.i[1];
                    ((wi30) g9e0Var2.b()).g = true;
                    w9wVar.d.d();
                }
                if (w9wVar.e.c()) {
                    g9e0 g9e0Var3 = w9wVar.e;
                    qcy<Object> qcyVar3 = w9w.i[2];
                    ((nv30) g9e0Var3.b()).b = true;
                    w9wVar.e.d();
                }
                if (w9wVar.f.c()) {
                    g9e0 g9e0Var4 = w9wVar.f;
                    qcy<Object> qcyVar4 = w9w.i[3];
                    ((h140) g9e0Var4.b()).d = true;
                    w9wVar.f.d();
                }
                if (w9wVar.g.c()) {
                    g9e0 g9e0Var5 = w9wVar.g;
                    qcy<Object> qcyVar5 = w9w.i[4];
                    ((wv30) g9e0Var5.b()).c.dispose();
                    w9wVar.g.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.c;
    }
}
