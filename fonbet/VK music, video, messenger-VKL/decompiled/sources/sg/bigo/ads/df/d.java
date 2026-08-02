package sg.bigo.ads.df;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.an.k;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.df.g;
import xsna.lr;

/* loaded from: classes9.dex */
public final class d {
    private static boolean g = false;
    private static final d h = new d();
    public r c;
    public k d;
    public Context e;
    public final Set<f> a = q.a(50);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Runnable f = new Runnable() { // from class: sg.bigo.ads.df.d.2
        /* JADX WARN: Removed duplicated region for block: B:19:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0162 A[EDGE_INSN: B:28:0x0162->B:29:0x0162 BREAK  A[LOOP:0: B:2:0x0015->B:40:0x0015], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0015 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x015d A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
        @Override // java.lang.Runnable
        @SuppressLint({"ConcurrentModification", "IteratorRemove"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int b;
            int i;
            int c;
            int i2;
            int d;
            int i3;
            d.this.a.size();
            Iterator it = d.this.a.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                f fVar = (f) it.next();
                Context context = d.this.e;
                if (fVar.s == null) {
                    sg.bigo.ads.bn.a.a("TrackerInfo", "retryThirdTrackImpl mThirdImpressionTrack is error.");
                } else if (fVar.a(fVar.i) && (r6 = fVar.s.size()) != 0 && fVar.q.a(fVar.j, System.currentTimeMillis())) {
                    fVar.j = System.currentTimeMillis();
                    fVar.i++;
                    fVar.a(context);
                    if (fVar.t != null && fVar.a(fVar.k) && fVar.t.size() != 0 && fVar.q.a(fVar.l, System.currentTimeMillis())) {
                        fVar.l = System.currentTimeMillis();
                        fVar.k++;
                        b = fVar.b(context);
                        if (b == 0 && (i = fVar.k) > 0) {
                            fVar.k = i - 1;
                        }
                    } else {
                        b = 0;
                    }
                    if (fVar.u != null && fVar.a(fVar.m) && fVar.u.size() != 0 && fVar.q.a(fVar.n, System.currentTimeMillis())) {
                        fVar.n = System.currentTimeMillis();
                        fVar.m++;
                        c = fVar.c(context);
                        if (c == 0 && (i2 = fVar.m) > 0) {
                            fVar.m = i2 - 1;
                        }
                    } else {
                        c = 0;
                    }
                    if (fVar.v != null && fVar.a(fVar.o) && fVar.v.size() != 0 && fVar.q.a(fVar.p, System.currentTimeMillis())) {
                        fVar.p = System.currentTimeMillis();
                        fVar.o++;
                        d = fVar.d(context);
                        if (d == 0 && (i3 = fVar.o) > 0) {
                            fVar.o = i3 - 1;
                        }
                    } else {
                        d = 0;
                    }
                    int a = lr.a(r6, b, c, d);
                    if (fVar.a(fVar.s, fVar.i) && fVar.a(fVar.t, fVar.k) && fVar.a(fVar.u, fVar.m) && fVar.a(fVar.v, fVar.o)) {
                        fVar.toString();
                        g gVar = g.a.a;
                        g.b(fVar);
                        it.remove();
                    } else {
                        i4 += a;
                        if (i4 > 20) {
                            break;
                        }
                    }
                }
                int size = 0;
                if (fVar.t != null) {
                    fVar.l = System.currentTimeMillis();
                    fVar.k++;
                    b = fVar.b(context);
                    if (b == 0) {
                        fVar.k = i - 1;
                    }
                    if (fVar.u != null) {
                        fVar.n = System.currentTimeMillis();
                        fVar.m++;
                        c = fVar.c(context);
                        if (c == 0) {
                            fVar.m = i2 - 1;
                        }
                        if (fVar.v != null) {
                            fVar.p = System.currentTimeMillis();
                            fVar.o++;
                            d = fVar.d(context);
                            if (d == 0) {
                                fVar.o = i3 - 1;
                            }
                            int a2 = lr.a(size, b, c, d);
                            if (fVar.a(fVar.s, fVar.i)) {
                            }
                            i4 += a2;
                            if (i4 > 20) {
                            }
                        }
                        d = 0;
                        int a22 = lr.a(size, b, c, d);
                        if (fVar.a(fVar.s, fVar.i)) {
                        }
                        i4 += a22;
                        if (i4 > 20) {
                        }
                    }
                    c = 0;
                    if (fVar.v != null) {
                    }
                    d = 0;
                    int a222 = lr.a(size, b, c, d);
                    if (fVar.a(fVar.s, fVar.i)) {
                    }
                    i4 += a222;
                    if (i4 > 20) {
                    }
                }
                b = 0;
                if (fVar.u != null) {
                }
                c = 0;
                if (fVar.v != null) {
                }
                d = 0;
                int a2222 = lr.a(size, b, c, d);
                if (fVar.a(fVar.s, fVar.i)) {
                }
                i4 += a2222;
                if (i4 > 20) {
                }
            }
            if (d.this.a.size() == 0) {
                Set set = d.this.a;
                g gVar2 = g.a.a;
                set.addAll(g.a(1800000L, d.this.c));
                d.this.a.size();
            }
            d.this.a.size();
            if (d.this.a.size() > 0) {
                sg.bigo.ads.bh.d.a(1, d.this.f, 20000L);
            } else {
                d.b();
            }
        }
    };

    public static d a() {
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        g = true;
        sg.bigo.ads.bh.d.a(this.f);
        sg.bigo.ads.bh.d.a(1, this.f, 20000L);
    }

    public final void b(final f fVar) {
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.df.d.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.a.a;
                g.b(fVar);
            }
        });
    }

    public static /* synthetic */ boolean b() {
        g = false;
        return false;
    }

    public final void a(f fVar) {
        if (!g) {
            c();
        }
        this.a.add(fVar);
        g gVar = g.a.a;
        g.a(fVar);
    }
}
