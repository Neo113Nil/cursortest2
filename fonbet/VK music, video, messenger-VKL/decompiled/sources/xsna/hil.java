package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.audiomsg.player.Speed;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptyList;
import xsna.sgk0;

/* compiled from: DefaultMediaPlayer.kt */
/* loaded from: classes.dex */
public final class hil implements fv10 {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final a b;
    public final fo4 c;
    public final CopyOnWriteArrayList<hv10> d;
    public final h4b0 e;

    /* compiled from: DefaultMediaPlayer.kt */
    public final class a implements do4 {
        public a() {
        }

        @Override // xsna.do4
        public final void a() {
            h4b0 h4b0Var;
            hil hilVar = hil.this;
            synchronized (hilVar) {
                h4b0Var = hilVar.e;
                if (h4b0Var.f) {
                    throw new IllegalStateException("Player is released");
                }
                synchronized (hilVar) {
                    h4b0 h4b0Var2 = hilVar.e;
                    if (h4b0Var2.f) {
                        throw new IllegalStateException("Player is released");
                    }
                    if (h4b0Var2.d) {
                        hilVar.p(sgk0.c);
                    }
                }
            }
            hil.k(hilVar);
            h4b0Var.d = false;
            h4b0Var.e = null;
        }

        @Override // xsna.do4
        public final void b() {
            hil hilVar = hil.this;
            synchronized (hilVar) {
                h4b0 h4b0Var = hilVar.e;
                if (h4b0Var.f) {
                    throw new IllegalStateException("Player is released");
                }
                h4b0Var.e = Float.valueOf(hilVar.getVolume());
                hilVar.w(sgk0.c, hilVar.getVolume() * 0.4f);
            }
        }

        @Override // xsna.do4
        public final void c() {
            hil hilVar = hil.this;
            synchronized (hilVar) {
                try {
                    h4b0 h4b0Var = hilVar.e;
                    if (h4b0Var.f) {
                        throw new IllegalStateException("Player is released");
                    }
                    if (hilVar.isPlaying()) {
                        hilVar.q(sgk0.c);
                    }
                    hil.k(hilVar);
                    h4b0Var.d = false;
                    h4b0Var.e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.do4
        public final void d() {
            hil hilVar = hil.this;
            synchronized (hilVar) {
                h4b0 h4b0Var = hilVar.e;
                if (h4b0Var.f) {
                    throw new IllegalStateException("Player is released");
                }
                if (hilVar.isPlaying()) {
                    h4b0Var.d = true;
                    hilVar.q(sgk0.c);
                }
            }
        }
    }

    /* compiled from: DefaultMediaPlayer.kt */
    public final class b implements tgp0 {
        public b() {
        }

        @Override // xsna.tgp0
        public final void a(final bgk0 bgk0Var, final float f) {
            hil.i(hil.this, true, new izs(this) { // from class: xsna.jil
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ((hv10) obj).a(bgk0Var, f);
                    return s3q0.a;
                }
            });
        }

        @Override // xsna.tgp0
        public final void b(bgk0 bgk0Var, ur4 ur4Var) {
            if (ur4Var != null) {
                hil.i(hil.this, true, new com.vk.movika.sdk.base.logic.processor.d(this, bgk0Var, ur4Var, 10));
            }
        }

        @Override // xsna.tgp0
        public final void c(bgk0 bgk0Var, Speed speed) {
            hil.i(hil.this, true, new ut6(this, bgk0Var, speed, 12));
        }

        @Override // xsna.tgp0
        public final void d(ur4 ur4Var, Uri uri, Throwable th) {
            hil.i(hil.this, true, new ysd(this, ur4Var, uri, th));
        }

        @Override // xsna.tgp0
        public final void e(ur4 ur4Var, Uri uri) {
            hil.i(hil.this, true, new b7(this, ur4Var, uri));
        }

        @Override // xsna.tgp0
        public final void f(ur4 ur4Var, Uri uri) {
            hil.i(hil.this, true, new yl0(this, ur4Var, uri, 6));
        }

        @Override // xsna.tgp0
        public final void g(ur4 ur4Var, Uri uri) {
            hil.i(hil.this, true, new l22(this, ur4Var, uri));
        }

        @Override // xsna.tgp0
        public final void h(bgk0 bgk0Var, SpeakerType speakerType) {
            hil.i(hil.this, true, new com.vk.movika.sdk.base.ui.s0(this, bgk0Var, speakerType));
        }

        @Override // xsna.tgp0
        public final void i(final bgk0 bgk0Var, final ur4 ur4Var, final float f) {
            hil.i(hil.this, true, new izs(this) { // from class: xsna.iil
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ((hv10) obj).p(bgk0Var, ur4Var, f);
                    return s3q0.a;
                }
            });
        }

        @Override // xsna.tgp0
        public final void j(bgk0 bgk0Var, ur4 ur4Var) {
            hil.i(hil.this, true, new v74(this, bgk0Var, ur4Var));
        }

        @Override // xsna.tgp0
        public final void k(ur4 ur4Var, Throwable th) {
            az2 az2Var = new az2(this, ur4Var, th, 10);
            hil hilVar = hil.this;
            hil.i(hilVar, true, az2Var);
            hilVar.v();
        }

        @Override // xsna.tgp0
        public final void l(bgk0 bgk0Var, ur4 ur4Var) {
            hil.i(hil.this, true, new ng3(this, bgk0Var, ur4Var, 13));
        }

        @Override // xsna.tgp0
        public final void m(ur4 ur4Var) {
            sgk0.c cVar = sgk0.a;
            hil.i(hil.this, true, new ekh(this, ur4Var));
            hil hilVar = hil.this;
            synchronized (hilVar) {
                try {
                    h4b0 h4b0Var = hilVar.e;
                    if (h4b0Var.f) {
                        throw new IllegalStateException("Player is released");
                    }
                    if (epx.f(j5g.k0(h4b0Var.b), ur4Var)) {
                        h4b0Var.c = true;
                        hil.i(hilVar, false, new waw(hilVar));
                        hilVar.v();
                    } else {
                        hil.l(hilVar, ur4Var);
                        hilVar.p(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.tgp0
        public final void n(bgk0 bgk0Var, ur4 ur4Var) {
            hil.i(hil.this, true, new g84(this, bgk0Var, ur4Var));
        }
    }

    /* compiled from: DefaultMediaPlayer.kt */
    /* loaded from: classes15.dex */
    public static final class c implements izs<hv10, s3q0> {
        public final /* synthetic */ bgk0 b;
        public final /* synthetic */ List<ur4> c;

        public c(hil hilVar, bgk0 bgk0Var, List<ur4> list) {
            this.b = bgk0Var;
            this.c = list;
        }

        @Override // xsna.izs
        public final s3q0 invoke(hv10 hv10Var) {
            hv10Var.n(this.b, this.c);
            return s3q0.a;
        }
    }

    /* compiled from: DefaultMediaPlayer.kt */
    /* loaded from: classes15.dex */
    public static final class d implements izs<hv10, s3q0> {
        public final /* synthetic */ bgk0 b;

        public d(hil hilVar, bgk0 bgk0Var) {
            this.b = bgk0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(hv10 hv10Var) {
            hv10Var.k(this.b);
            return s3q0.a;
        }
    }

    public hil(Context context, m66 m66Var) {
        a aVar = new a();
        this.b = aVar;
        fo4 fo4Var = new fo4(context.getApplicationContext(), false);
        fo4Var.a(aVar);
        this.c = fo4Var;
        this.d = new CopyOnWriteArrayList<>();
        sgp0 sgp0Var = (sgp0) m66Var.invoke();
        sgp0Var.g(new b());
        this.e = new h4b0(sgp0Var, EmptyList.b);
    }

    public static final void i(hil hilVar, boolean z, izs izsVar) {
        CopyOnWriteArrayList<hv10> copyOnWriteArrayList = hilVar.d;
        if (z) {
            pro0.a();
            Iterator<hv10> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                izsVar.invoke(it.next());
            }
            return;
        }
        Iterator<hv10> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            hv10 next = it2.next();
            hilVar.a.postAtTime(new xw1(new com.vk.catalog2.common.ui.holders.a(9, izsVar, next), 5), next, SystemClock.uptimeMillis());
        }
    }

    public static final boolean j(hil hilVar) {
        boolean z;
        synchronized (hilVar) {
            h4b0 h4b0Var = hilVar.e;
            if (h4b0Var.f) {
                throw new IllegalStateException("Player is released");
            }
            z = false;
            if (hilVar.c.a.d(2)) {
                k(hilVar);
                h4b0Var.d = false;
                h4b0Var.e = null;
                z = true;
            }
        }
        return z;
    }

    public static final void k(hil hilVar) {
        synchronized (hilVar) {
            h4b0 h4b0Var = hilVar.e;
            if (h4b0Var.f) {
                throw new IllegalStateException("Player is released");
            }
            Float f = h4b0Var.e;
            if (f != null) {
                hilVar.w(sgk0.c, f.floatValue());
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public static final void l(hil hilVar, ur4 ur4Var) {
        sgk0.c cVar = sgk0.a;
        synchronized (hilVar) {
            h4b0 h4b0Var = hilVar.e;
            if (h4b0Var.f) {
                throw new IllegalStateException("Player is released");
            }
            int indexOf = h4b0Var.b.indexOf(ur4Var);
            if (indexOf >= 0 && indexOf < e43.h(h4b0Var.b)) {
                hilVar.g(cVar, h4b0Var.b.get(indexOf + 1));
            }
        }
    }

    @Override // xsna.fv10
    public final synchronized void a(lza0 lza0Var, float f) {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        h4b0Var.a.a(lza0Var, f);
    }

    @Override // xsna.fv10
    public final synchronized ur4 b() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.a.b();
    }

    @Override // xsna.fv10
    public final synchronized void c(bgk0 bgk0Var, Speed speed) {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        h4b0Var.a.c(bgk0Var, speed);
    }

    @Override // xsna.fv10
    public final synchronized void d(bgk0 bgk0Var, SpeakerType speakerType) {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        h4b0Var.a.d(bgk0Var, speakerType);
    }

    @Override // xsna.fv10
    public final void e(lza0 lza0Var) {
        synchronized (this) {
            if (!this.e.f) {
                r(lza0Var, EmptyList.b);
                fo4 fo4Var = this.c;
                fo4Var.a.g.remove(this.b);
                this.c.b();
                this.e.a.j(lza0Var);
                this.e.f = true;
            }
        }
        this.e.a.e(lza0Var);
    }

    @Override // xsna.fv10
    public final synchronized SpeakerType f() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.a.f();
    }

    @Override // xsna.fv10
    public final synchronized void g(bgk0 bgk0Var, ur4 ur4Var) {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        if (h4b0Var.b.contains(ur4Var)) {
            h4b0Var.a.h(bgk0Var, ur4Var);
            h4b0Var.c = false;
        }
    }

    @Override // xsna.fv10
    public final synchronized float getVolume() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.a.getVolume();
    }

    @Override // xsna.fv10
    public final void h(hv10 hv10Var) {
        this.d.remove(hv10Var);
        this.a.removeCallbacksAndMessages(hv10Var);
    }

    @Override // xsna.fv10
    public final synchronized boolean isPlaying() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.a.isPlaying();
    }

    @Override // xsna.fv10
    public final synchronized boolean m() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.c;
    }

    @Override // xsna.fv10
    public final synchronized List<ur4> n() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.b;
    }

    @Override // xsna.fv10
    public final synchronized float o() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.a.o();
    }

    @Override // xsna.fv10
    public final synchronized void p(bgk0 bgk0Var) {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        if (!h4b0Var.b.isEmpty() && !h4b0Var.a.isPlaying() && j(this)) {
            h4b0Var.a.p(bgk0Var);
            h4b0Var.c = false;
        }
    }

    @Override // xsna.fv10
    public final synchronized void q(bgk0 bgk0Var) {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        if (h4b0Var.a.isPlaying()) {
            h4b0Var.a.q(bgk0Var);
            v();
        }
    }

    @Override // xsna.fv10
    public final synchronized void r(bgk0 bgk0Var, List<ur4> list) {
        try {
            h4b0 h4b0Var = this.e;
            if (h4b0Var.f) {
                throw new IllegalStateException("Player is released");
            }
            x(bgk0Var);
            boolean z = h4b0Var.c;
            h4b0Var.b = list;
            h4b0Var.c = list.isEmpty();
            i(this, false, new c(this, bgk0Var, list));
            if (!z && h4b0Var.c) {
                i(this, false, new d(this, bgk0Var));
            }
            h4b0Var.a.h(bgk0Var, (ur4) j5g.a0(list));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.fv10
    public final synchronized boolean s() {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        h4b0Var.a.getClass();
        return true;
    }

    @Override // xsna.fv10
    public final boolean t() {
        return !n().isEmpty();
    }

    @Override // xsna.fv10
    public final synchronized boolean u() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.a.isLoading();
    }

    public final synchronized void v() {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        this.c.b();
        k(this);
        h4b0Var.d = false;
        h4b0Var.e = null;
    }

    public final synchronized void w(bgk0 bgk0Var, float f) {
        h4b0 h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        h4b0Var.a.i(bgk0Var, f);
        h4b0Var.e = null;
    }

    public final synchronized void x(bgk0 bgk0Var) {
        try {
            h4b0 h4b0Var = this.e;
            if (h4b0Var.f) {
                throw new IllegalStateException("Player is released");
            }
            if (!h4b0Var.a.isPlaying()) {
                if (!h4b0Var.a.isPaused()) {
                    if (h4b0Var.a.m()) {
                    }
                }
            }
            h4b0Var.a.k(bgk0Var);
            v();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.fv10
    public final synchronized Speed z() {
        h4b0 h4b0Var;
        h4b0Var = this.e;
        if (h4b0Var.f) {
            throw new IllegalStateException("Player is released");
        }
        return h4b0Var.a.z();
    }
}
