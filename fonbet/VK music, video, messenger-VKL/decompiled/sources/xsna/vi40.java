package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

/* compiled from: MusicDownloadsInProgressProviderImpl.kt */
/* loaded from: classes.dex */
public final class vi40 implements ri40, ug40 {
    public final oc40 a;
    public int b;
    public final LinkedHashMap<Integer, Integer> c = new LinkedHashMap<>();
    public final TreeSet<Playlist> d = new TreeSet<>(new b(new a(), this));
    public final io.reactivex.rxjava3.subjects.f<List<Playlist>> e = new io.reactivex.rxjava3.subjects.f<>();
    public io.reactivex.rxjava3.disposables.c f;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            DownloadingState downloadingState = ((Playlist) t2).H;
            vi40 vi40Var = vi40.this;
            return jw5.b(Integer.valueOf(vi40.e(vi40Var, downloadingState)), Integer.valueOf(vi40.e(vi40Var, ((Playlist) t).H)));
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        public final /* synthetic */ a b;
        public final /* synthetic */ vi40 c;

        public b(a aVar, vi40 vi40Var) {
            this.b = aVar;
            this.c = vi40Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            LinkedHashMap<Integer, Integer> linkedHashMap = this.c.c;
            int compare = this.b.compare(t, t2);
            return compare != 0 ? compare : jw5.b(linkedHashMap.get(Integer.valueOf(((Playlist) t).b)), linkedHashMap.get(Integer.valueOf(((Playlist) t2).b)));
        }
    }

    public vi40(oc40 oc40Var) {
        this.a = oc40Var;
    }

    public static final int e(vi40 vi40Var, DownloadingState downloadingState) {
        return downloadingState instanceof DownloadingState.Downloading ? ((DownloadingState.Downloading) downloadingState).zb() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 4 : 3 : epx.f(downloadingState, DownloadingState.PartlyDownloaded.b) ? 2 : 1;
    }

    @Override // xsna.ug40
    public final void a(Playlist playlist) {
        xqp xqpVar = new xqp(new dn20(playlist, 5), 1);
        TreeSet<Playlist> treeSet = this.d;
        treeSet.removeIf(xqpVar);
        treeSet.add(playlist);
        this.c.put(Integer.valueOf(playlist.b), Integer.valueOf(this.b));
        this.b++;
        this.e.onNext(j5g.O0(treeSet));
        if (this.f == null) {
            this.f = this.a.a().b0(n8b0.class).U(new op0(new h630(this, 4), 24)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n1r(new dxh(this, 27), 6));
        }
    }

    @Override // xsna.ug40
    public final void b(Playlist playlist) {
        final qw30 qw30Var = new qw30(playlist, 2);
        Predicate<? super Playlist> predicate = new Predicate() { // from class: xsna.ui40
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) qw30.this.invoke(obj)).booleanValue();
            }
        };
        TreeSet<Playlist> treeSet = this.d;
        if (treeSet.removeIf(predicate)) {
            treeSet.add(playlist);
            this.e.onNext(j5g.O0(treeSet));
        }
    }

    @Override // xsna.ug40
    public final void c(String str) {
        Object obj;
        TreeSet<Playlist> treeSet = this.d;
        Iterator<T> it = treeSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((Playlist) obj).Ib(), str)) {
                    break;
                }
            }
        }
        Playlist playlist = (Playlist) obj;
        if (playlist == null) {
            return;
        }
        treeSet.remove(playlist);
        this.e.onNext(j5g.O0(treeSet));
    }

    @Override // xsna.ug40
    public final void d(Playlist playlist) {
        si40 si40Var = new si40(new ba40(playlist, 2), 0);
        TreeSet<Playlist> treeSet = this.d;
        if (treeSet.removeIf(si40Var)) {
            this.e.onNext(j5g.O0(treeSet));
            if (treeSet.isEmpty()) {
                io.reactivex.rxjava3.disposables.c cVar = this.f;
                if (cVar != null) {
                    cVar.dispose();
                }
                this.f = null;
            }
        }
    }

    @Override // xsna.ri40
    public final io.reactivex.rxjava3.core.q<List<Playlist>> w() {
        return this.e;
    }

    @Override // xsna.ri40
    public final List<Playlist> z() {
        return j5g.O0(this.d);
    }
}
