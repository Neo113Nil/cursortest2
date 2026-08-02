package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.audiomsg.player.Speed;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.EmptyList;
import xsna.sgk0;

/* compiled from: DefaultAudioMsgPlayer.kt */
/* loaded from: classes.dex */
public final class xal implements ir4 {
    public final Context a;
    public final File b;
    public final Collection<File> c;
    public final b1v d;
    public final Collection<pr4> e;
    public final wwv f;
    public final ExecutorService g;
    public final ExecutorService h;
    public final a0b0 i;
    public final CopyOnWriteArrayList<kr4> j = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<a> k = new CopyOnWriteArrayList<>();
    public final c l = new c();
    public final l4b0 m;

    /* compiled from: DefaultAudioMsgPlayer.kt */
    /* loaded from: classes15.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: DefaultAudioMsgPlayer.kt */
    public final class b implements cpz {
        public b() {
        }

        @Override // xsna.cpz
        public final void a(Uri uri, Throwable th) {
            pro0.a();
            Iterator<a> it = xal.this.k.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // xsna.cpz
        public final void b(Uri uri, File file, long j, long j2, int i, String str) {
            pro0.a();
            Iterator<a> it = xal.this.k.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* compiled from: DefaultAudioMsgPlayer.kt */
    public final class c implements hv10 {
        public final xal a;

        public c() {
            this.a = xal.this;
        }

        @Override // xsna.hv10
        public final void a(bgk0 bgk0Var, float f) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().t(this.a, bgk0Var, f);
            }
        }

        @Override // xsna.hv10
        public final void b(bgk0 bgk0Var, ur4 ur4Var) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().c(this.a, bgk0Var, ur4Var);
            }
        }

        @Override // xsna.hv10
        public final void c(bgk0 bgk0Var, Speed speed) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().q(this.a, bgk0Var, speed);
            }
        }

        @Override // xsna.hv10
        public final void d(ur4 ur4Var, Uri uri, Throwable th) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().d(this.a, ur4Var, uri, th);
            }
        }

        @Override // xsna.hv10
        public final void e(ur4 ur4Var, Uri uri) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().h(this.a, ur4Var, uri);
            }
        }

        @Override // xsna.hv10
        public final void f(ur4 ur4Var, Uri uri) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().f(this.a, ur4Var, uri);
            }
        }

        @Override // xsna.hv10
        public final void g(ur4 ur4Var, Uri uri) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().j(this.a, ur4Var, uri);
            }
        }

        @Override // xsna.hv10
        public final void h(bgk0 bgk0Var, SpeakerType speakerType) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().l(this.a, bgk0Var, speakerType);
            }
        }

        @Override // xsna.hv10
        public final void i(bgk0 bgk0Var, ur4 ur4Var) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().e(this.a, bgk0Var, ur4Var);
            }
        }

        @Override // xsna.hv10
        public final void j(ur4 ur4Var) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().i(this.a, ur4Var);
            }
        }

        @Override // xsna.hv10
        public final void k(bgk0 bgk0Var) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().n(this.a, bgk0Var);
            }
        }

        @Override // xsna.hv10
        public final void l(bgk0 bgk0Var, ur4 ur4Var) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().a(this.a, bgk0Var, ur4Var);
            }
        }

        @Override // xsna.hv10
        public final void m(bgk0 bgk0Var, ur4 ur4Var) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().s(this.a, bgk0Var, ur4Var);
            }
        }

        @Override // xsna.hv10
        public final void n(bgk0 bgk0Var, List list) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().p(this.a, bgk0Var, list);
            }
        }

        @Override // xsna.hv10
        public final void o(ur4 ur4Var, Throwable th) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().m(this.a, ur4Var, th);
            }
        }

        @Override // xsna.hv10
        public final void p(bgk0 bgk0Var, ur4 ur4Var, float f) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().r(this.a, bgk0Var, ur4Var, f);
            }
        }
    }

    /* compiled from: DefaultAudioMsgPlayer.kt */
    /* loaded from: classes15.dex */
    public interface d {
        void a();
    }

    /* compiled from: DefaultAudioMsgPlayer.kt */
    public final class e implements tzc0 {
        public final xal a;

        public e() {
            this.a = xal.this;
        }

        @Override // xsna.tzc0
        public final void a(ur4 ur4Var, Uri uri) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().g(this.a, ur4Var, uri);
            }
        }

        @Override // xsna.tzc0
        public final void b(ur4 ur4Var, Uri uri, Throwable th) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().o(this.a, ur4Var, uri, th);
            }
        }

        @Override // xsna.tzc0
        public final void c(bgk0 bgk0Var, Collection<ur4> collection) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().v(this.a, bgk0Var, collection);
            }
        }

        @Override // xsna.tzc0
        public final void d(bgk0 bgk0Var, Collection<ur4> collection) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().b(this.a, bgk0Var, collection);
            }
        }

        @Override // xsna.tzc0
        public final void e(ur4 ur4Var, Uri uri) {
            pro0.a();
            Iterator<kr4> it = xal.this.j.iterator();
            while (it.hasNext()) {
                it.next().k(this.a, ur4Var, uri);
            }
        }
    }

    public xal(Context context, File file, Collection collection, b1v b1vVar, Collection collection2, wwv wwvVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService) {
        this.a = context;
        this.b = file;
        this.c = collection;
        this.d = b1vVar;
        this.e = collection2;
        this.f = wwvVar;
        this.g = scheduledExecutorService;
        this.h = executorService;
        this.i = new a0b0(context);
        fl3 fl3Var = new fl3();
        pzc0 pzc0Var = new pzc0(new v801(), null);
        k370 k370Var = new k370();
        l4b0 l4b0Var = new l4b0();
        l4b0Var.a = fl3Var;
        l4b0Var.b = pzc0Var;
        l4b0Var.c = k370Var;
        l4b0Var.d = false;
        this.m = l4b0Var;
    }

    @Override // xsna.ir4
    public final synchronized void A() {
        sgk0.a aVar = sgk0.e;
        synchronized (this) {
            try {
                l4b0 l4b0Var = this.m;
                l4b0Var.getClass();
                if (!l4b0Var.d) {
                    d();
                }
                this.m.b.g(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ir4
    public final synchronized void B(float f) {
        lza0 lza0Var = jw5.d;
        synchronized (this) {
            try {
                l4b0 l4b0Var = this.m;
                l4b0Var.getClass();
                if (!l4b0Var.d) {
                    d();
                }
                this.m.a.a(lza0Var, f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ir4
    public final synchronized void C(lza0 lza0Var, ur4 ur4Var) {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
            this.m.a.g(lza0Var, ur4Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ir4
    public final synchronized void D(bgk0 bgk0Var) {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
            if (isPlaying()) {
                q(bgk0Var);
            } else {
                p(bgk0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ir4
    public final void E(bgk0 bgk0Var) {
        r(bgk0Var, EmptyList.b);
    }

    @Override // xsna.ir4
    public final synchronized void F(bgk0 bgk0Var, atr atrVar, Collection<ur4> collection) {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
            this.m.b.e(bgk0Var, atrVar, collection);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(lza0 lza0Var) {
        Throwable th;
        try {
            try {
                l4b0 l4b0Var = this.m;
                l4b0Var.getClass();
                if (!l4b0Var.d) {
                    try {
                        d();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                l4b0 l4b0Var2 = this.m;
                a0b0 a0b0Var = this.i;
                a0b0Var.a().edit().putString("cache_sub_directory_name", UUID.randomUUID().toString()).apply();
                fv10 fv10Var = l4b0Var2.a;
                pzc0 pzc0Var = l4b0Var2.b;
                a8r a8rVar = l4b0Var2.c;
                List<ur4> n = fv10Var.n();
                ur4 b2 = fv10Var.b();
                float o = fv10Var.o();
                Speed z = fv10Var.z();
                SpeakerType f = fv10Var.f();
                float volume = fv10Var.getVolume();
                fv10Var.h(this.l);
                this.g.submit(new zal(pzc0Var, lza0Var, fv10Var, a8rVar, this));
                a8r a8rVar2 = (a8r) this.d.invoke(new File(this.b, this.i.a().getString("cache_sub_directory_name", "")));
                wel welVar = new wel(a8rVar2, this.h, new b());
                hil hilVar = new hil(this.a, new m66(welVar, 3));
                hilVar.d.add(this.l);
                hilVar.r(lza0Var, n);
                if (b2 != null) {
                    hilVar.g(lza0Var, b2);
                }
                hilVar.a(lza0Var, o);
                hilVar.c(lza0Var, z);
                hilVar.d(lza0Var, f);
                hilVar.w(lza0Var, volume);
                l4b0Var2.a = hilVar;
                l4b0Var2.b = new pzc0(welVar, new e());
                l4b0Var2.c = a8rVar2;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // xsna.ir4
    public final synchronized ur4 b() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.b();
    }

    public final void c() {
        String string = this.i.a().getString("cache_sub_directory_name", "");
        File file = this.b;
        File file2 = new File(file, string);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                if (!epx.f(file3, file2)) {
                    try {
                        nbr.l(file3);
                    } catch (SecurityException unused) {
                    } catch (Throwable th) {
                        pro0.c(new o1(th, 15));
                    }
                }
            }
        }
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            try {
                nbr.l((File) it.next());
            } catch (SecurityException unused2) {
            } catch (Throwable th2) {
                pro0.c(new o1(th2, 15));
            }
        }
    }

    public final synchronized void d() {
        try {
            if (this.m.d) {
                return;
            }
            if (this.i.a().getInt("version", 1) != 2) {
                this.i.a().edit().putString("cache_sub_directory_name", "").apply();
                this.i.a().edit().putInt("version", 2).apply();
            }
            if (this.i.a().getString("cache_sub_directory_name", "").length() == 0) {
                a0b0 a0b0Var = this.i;
                a0b0Var.a().edit().putString("cache_sub_directory_name", UUID.randomUUID().toString()).apply();
            }
            a8r a8rVar = (a8r) this.d.invoke(new File(this.b, this.i.a().getString("cache_sub_directory_name", "")));
            wel welVar = new wel(a8rVar, this.h, new b());
            l4b0 l4b0Var = this.m;
            hil hilVar = new hil(this.a, new m66(welVar, 3));
            hilVar.d.add(this.l);
            hilVar.c(sgk0.b, this.i.b());
            l4b0Var.a = hilVar;
            this.m.b = new pzc0(welVar, new e());
            l4b0 l4b0Var2 = this.m;
            l4b0Var2.c = a8rVar;
            l4b0Var2.d = true;
            this.g.submit(new Runnable() { // from class: xsna.wal
                @Override // java.lang.Runnable
                public final void run() {
                    xal xalVar = xal.this;
                    xalVar.c();
                    Iterator<T> it = xalVar.e.iterator();
                    while (it.hasNext()) {
                        ((pr4) it.next()).u(xalVar);
                    }
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(SpeakerType speakerType) {
        sgk0.d dVar = sgk0.d;
        synchronized (this) {
            try {
                l4b0 l4b0Var = this.m;
                l4b0Var.getClass();
                if (!l4b0Var.d) {
                    d();
                }
                this.m.a.d(dVar, speakerType);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ir4
    public final synchronized boolean isPlaying() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.isPlaying();
    }

    @Override // xsna.ir4
    public final synchronized boolean m() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.m();
    }

    @Override // xsna.ir4
    public final synchronized List<ur4> n() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.n();
    }

    @Override // xsna.ir4
    public final synchronized float o() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.o();
    }

    @Override // xsna.ir4
    public final void p(bgk0 bgk0Var) {
        this.f.invoke(new yal(new mh3(6, this, bgk0Var)));
    }

    @Override // xsna.ir4
    public final synchronized void q(bgk0 bgk0Var) {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
            this.m.a.q(bgk0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ir4
    public final synchronized void r(bgk0 bgk0Var, List<ur4> list) {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
            this.m.a.r(bgk0Var, list);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ir4
    public final synchronized boolean s() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.s();
    }

    @Override // xsna.ir4
    public final synchronized boolean t() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.t();
    }

    @Override // xsna.ir4
    public final synchronized boolean u() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.u();
    }

    @Override // xsna.ir4
    public final synchronized void v(kr4 kr4Var) {
        this.j.add(kr4Var);
    }

    @Override // xsna.ir4
    public final synchronized void w(lza0 lza0Var, Speed speed) {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
            l4b0 l4b0Var2 = this.m;
            this.i.a().edit().putInt("speed", speed.h()).apply();
            l4b0Var2.a.c(lza0Var, speed);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ir4
    public final synchronized void x(atr atrVar, LinkedHashSet linkedHashSet) {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
            this.m.b.f(atrVar, linkedHashSet);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ir4
    public final synchronized void y(kr4 kr4Var) {
        this.j.remove(kr4Var);
    }

    @Override // xsna.ir4
    public final synchronized Speed z() {
        try {
            l4b0 l4b0Var = this.m;
            l4b0Var.getClass();
            if (!l4b0Var.d) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m.a.z();
    }
}
