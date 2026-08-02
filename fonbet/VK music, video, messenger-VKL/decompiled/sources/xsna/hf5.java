package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.core.database.models.AutoDownloadType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.wf5;
import xsna.xf5;

/* compiled from: AutoDownloadOfflineInteractorImpl.kt */
/* loaded from: classes.dex */
public final class hf5 implements df5 {
    public final jf5 a;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((xf5) t).f, ((xf5) t2).f);
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((xf5) t).f, ((xf5) t2).f);
        }
    }

    public hf5(jf5 jf5Var) {
        this.a = jf5Var;
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.a a(long j, String str, String str2) {
        return this.a.a(j, str, str2);
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.a b(String str, String str2) {
        return this.a.b(str, str2);
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.a c(String str, String str2, String str3) {
        return this.a.c(str, str2, str3);
    }

    @Override // xsna.df5
    public final List<MusicTrack> d() {
        List<xf5> d = this.a.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(xf5.a.a((xf5) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.a e(long j, String str, String str2) {
        return this.a.e(j, str, str2);
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.a f(long j, String str) {
        return this.a.f(j, str);
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.x<List<MusicTrack>> g(String str) {
        return this.a.g(str).l(new s7(new sm0(2), 3));
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.x<Boolean> h(String str, String str2) {
        return this.a.h(str, str2);
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.x<List<String>> i(String str) {
        return this.a.i(str);
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.a j(final MusicTrack musicTrack) {
        final AutoDownloadType autoDownloadType = AutoDownloadType.BUFFERED;
        return new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.gf5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Long l;
                String valueOf = String.valueOf(o25.a().c().b);
                jf5 jf5Var = hf5.this.a;
                MusicTrack musicTrack2 = musicTrack;
                wf5 r = jf5Var.r(valueOf, musicTrack2.Fb());
                long a2 = qni0.a();
                UserId c = o25.a().c();
                DownloadingState downloadingState = r != null ? r.f : null;
                MusicOfflineCacheStorage musicOfflineCacheStorage = r != null ? r.m : null;
                String str = r != null ? r.o : null;
                Long l2 = r != null ? r.w : null;
                Long valueOf2 = Long.valueOf(a2);
                Long valueOf3 = Long.valueOf(a2);
                AutoDownloadType autoDownloadType2 = AutoDownloadType.DOWNLOADED;
                AutoDownloadType autoDownloadType3 = autoDownloadType;
                if (autoDownloadType3 != autoDownloadType2) {
                    valueOf3 = null;
                }
                if (valueOf3 == null) {
                    l = r != null ? r.y : null;
                } else {
                    l = valueOf3;
                }
                DownloadingState downloadingState2 = downloadingState;
                jf5Var.q(new wf5(0L, c, musicTrack2.Fb(), musicTrack2.r, musicTrack2.y, downloadingState2 == null ? DownloadingState.NotLoaded.b : downloadingState2, musicTrack2.d, musicTrack2.e, musicTrack2.h, musicTrack2.t, musicTrack2.u, musicTrack2.Jb(), musicOfflineCacheStorage, musicTrack2.i, str, Long.valueOf(musicTrack2.f), Long.valueOf(musicTrack2.z), musicTrack2.s, Integer.valueOf(musicTrack2.n), Boolean.valueOf(musicTrack2.B), musicTrack2.S, musicTrack2.g, l2, valueOf2, l, autoDownloadType3, musicTrack2.e5().toString()));
                return s3q0.a;
            }
        });
    }

    @Override // xsna.df5
    public final long k(String str) {
        jf5 jf5Var = this.a;
        return jf5Var.o(str) + jf5Var.l(str);
    }

    @Override // xsna.df5
    public final MusicTrack l(String str) {
        wf5 n = this.a.n(str);
        if (n != null) {
            return wf5.a.a(n);
        }
        return null;
    }

    @Override // xsna.df5
    public final MusicTrack m(String str) {
        wf5 r = this.a.r(String.valueOf(o25.a().c().b), str);
        if (r != null) {
            return wf5.a.a(r);
        }
        return null;
    }

    @Override // xsna.df5
    public final boolean n(String str) {
        return this.a.j(str) >= 12;
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.x o(long j, String str, List list) {
        return this.a.m(str).l(new rf1(new ef5(this, str, j, list), 4));
    }

    @Override // xsna.df5
    public final void p(MusicTrack musicTrack, String str) {
        this.a.p(String.valueOf(o25.a().c().b), str, musicTrack.Fb(), musicTrack.e5().toString());
    }

    @Override // xsna.df5
    public final io.reactivex.rxjava3.core.x q(long j, String str, List list) {
        return this.a.g(str).l(new q7(new ff5(this, str, j, list), 5));
    }

    @Override // xsna.df5
    public final String r(String str) {
        return this.a.k(str);
    }
}
