package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.a6v0;
import xsna.ugb0;
import xsna.xsp;

/* compiled from: PodcastOfflineInteractorImpl.kt */
/* loaded from: classes.dex */
public final class yhb0 implements whb0 {
    public final qgb0 a;
    public final usp b;

    /* compiled from: PodcastOfflineInteractorImpl.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineEntitySortType.values().length];
            try {
                iArr[OfflineEntitySortType.NewerFirst.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineEntitySortType.OlderFirst.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineEntitySortType.ByTitle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((MusicTrack) t).z), Long.valueOf(((MusicTrack) t2).z));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((xsp) t).i, ((xsp) t2).i);
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((xsp) t).e, ((xsp) t2).e);
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((xsp) t2).i, ((xsp) t).i);
        }
    }

    public yhb0(qgb0 qgb0Var, usp uspVar) {
        this.a = qgb0Var;
        this.b = uspVar;
    }

    @Override // xsna.whb0
    public final void G(UserId userId, int i, a6v0 a6v0Var) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + ", podcastOwnerId=" + a6v0Var.a()});
        }
        Podcast a2 = a6v0.a.a(a6v0Var, i);
        if (a2 == null) {
            return;
        }
        MusicOfflineCacheStorage.a aVar = MusicOfflineCacheStorage.Companion;
        this.a.g(ugb0.a.a(userId, a2));
    }

    @Override // xsna.whb0
    public final void a(UserId userId, Podcast podcast) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + ", podcastOwnerId=" + podcast.c});
        }
        this.a.g(ugb0.a.a(userId, podcast));
    }

    @Override // xsna.whb0
    public final void b(UserId userId, UserId userId2, boolean z) {
        this.a.a(String.valueOf(userId.b), String.valueOf(userId2.b), z);
    }

    @Override // xsna.whb0
    public final List<OfflinePodcast> c(UserId userId) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", defpackage.k0.a(j, "uid=")});
        }
        List<wkb0> d2 = this.a.d(String.valueOf(j));
        ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
        Iterator<T> it = d2.iterator();
        while (it.hasNext()) {
            arrayList.add(((wkb0) it.next()).a());
        }
        return arrayList;
    }

    @Override // xsna.whb0
    public final List<UserId> d(UserId userId) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", defpackage.k0.a(j, "uid=")});
        }
        return this.a.e(String.valueOf(j));
    }

    @Override // xsna.whb0
    public final List<MusicTrack> e(UserId userId) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", defpackage.k0.a(j, "uid=")});
        }
        List<xsp> f = this.b.f(String.valueOf(j));
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator<T> it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(xsp.a.b((xsp) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.whb0
    public final void f(UserId userId, UserId userId2) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + ", podcastOwnerId=" + userId2});
        }
        this.a.f(String.valueOf(j), String.valueOf(userId2.b));
    }

    @Override // xsna.whb0
    public final List<MusicTrack> g(UserId userId, UserId userId2) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + ", podcastOwnerId=" + userId2});
        }
        List<xsp> l2 = this.b.l(String.valueOf(j), String.valueOf(userId2.b));
        ArrayList arrayList = new ArrayList(c5g.u(l2, 10));
        Iterator<T> it = l2.iterator();
        while (it.hasNext()) {
            arrayList.add(xsp.a.b((xsp) it.next()));
        }
        return j5g.D0(new b(), arrayList);
    }

    @Override // xsna.whb0
    public final Podcast n(UserId userId, UserId userId2) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + ", podcastOwnerId=" + userId2});
        }
        ugb0 c2 = this.a.c(String.valueOf(j), String.valueOf(userId2.b));
        if (c2 != null) {
            return ugb0.a.b(c2);
        }
        return null;
    }

    @Override // xsna.whb0
    public final int p(UserId userId, UserId userId2) {
        return this.a.b(String.valueOf(userId.b), String.valueOf(userId2.b));
    }

    @Override // xsna.whb0
    public final io.reactivex.rxjava3.core.q<List<MusicTrack>> q(UserId userId, UserId userId2, OfflineEntitySortType offlineEntitySortType) {
        return this.b.p(String.valueOf(userId.b), String.valueOf(userId2.b)).U(new xhb0(new fv90(offlineEntitySortType, 7), 0));
    }
}
