package xsna;

import android.net.Uri;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.dto.music.AudioStream;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.domain.download.AudioDownloadManager;
import com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger;
import com.vk.music.player.PlayerTrack;
import com.vk.toggle.features.MusicFeatures;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.k840;

/* compiled from: OneVideoPrefetchController.kt */
/* loaded from: classes3.dex */
public final class dn80 implements mzc0 {
    public final com.vk.music.offline.api.domain.download.b a;
    public final com.vk.music.player.cache.a b;
    public final bf5 c;
    public final df5 d;
    public final kgp0 e;
    public final com.vk.music.offline.api.domain.download.a f;
    public final wa40 g;
    public final oc40 h;
    public final Set<String> i = Collections.synchronizedSet(new LinkedHashSet());
    public final HashMap j = new HashMap();
    public final LinkedList<Pair<String, MusicTrack>> k = new LinkedList<>();
    public final va40 l = new va40();
    public Object m = EmptyList.b;
    public MusicTrack n;
    public Integer o;
    public boolean p;

    public dn80(fk80 fk80Var, com.vk.music.player.cache.a aVar, bf5 bf5Var, df5 df5Var, kgp0 kgp0Var, com.vk.music.offline.api.domain.download.a aVar2, wa40 wa40Var, oc40 oc40Var) {
        this.a = fk80Var;
        this.b = aVar;
        this.c = bf5Var;
        this.d = df5Var;
        this.e = kgp0Var;
        this.f = aVar2;
        this.g = wa40Var;
        this.h = oc40Var;
    }

    @Override // xsna.mzc0
    public final void a(long j, String str, String str2) {
        va40.a(this.l, null, this.d.a(j, str, str2).q(asu0.a.c()).subscribe());
    }

    @Override // xsna.mzc0
    public final void b(String str, String str2, String str3) {
        va40.a(this.l, null, this.d.c(String.valueOf(o25.a().c().b), str2, str3).q(asu0.a.c()).subscribe());
        this.f.b(str, str2, str3);
    }

    @Override // xsna.mzc0
    public final void c(String str, float f, long j) {
        Pair<String, MusicTrack> poll;
        if (f == 100.0f) {
            this.f.c(str);
            this.i.remove(str);
            String U = brm0.B(str, "track_download_", false) ? drm0.U(str, "track_download_") : brm0.B(str, "chapter_download_", false) ? drm0.U(str, "chapter_download_") : brm0.B(str, "episode_download_", false) ? drm0.U(str, "episode_download_") : null;
            va40 va40Var = this.l;
            if (U != null && j > 0) {
                va40.a(va40Var, null, this.d.f(j, U).q(asu0.a.c()).subscribe());
            }
            if (this.j.containsKey(str) && (poll = this.k.poll()) != null) {
                va40.a(va40Var, poll.i(), f(poll.j(), g(), poll.i()).q(asu0.a.c()).subscribe(new va4(0), new fv70(new rm0(22, this, poll), 1)));
            }
        }
    }

    @Override // xsna.mzc0
    public final void d(PlayerTrack playerTrack, List<PlayerTrack> list) {
        com.vk.music.offline.api.domain.download.b bVar;
        MusicTrack musicTrack;
        if (playerTrack != null) {
            h(playerTrack.b);
        }
        ListBuilder e = e43.e();
        if (playerTrack != null) {
            e.add(playerTrack);
        }
        List<PlayerTrack> list2 = list;
        e.addAll(list2);
        ListBuilder g = e.g();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            if (hashSet.add(((PlayerTrack) next).b.Fb())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PlayerTrack) it.next()).b.Fb());
        }
        if (arrayList.isEmpty() || arrayList2.equals(this.m)) {
            return;
        }
        this.m = arrayList2;
        List<PlayerTrack> v0 = playerTrack != null ? j5g.v0(playerTrack, list2) : list;
        ArrayList arrayList3 = new ArrayList(c5g.u(v0, 10));
        Iterator<T> it2 = v0.iterator();
        while (it2.hasNext()) {
            arrayList3.add("track_download_".concat(((PlayerTrack) it2.next()).b.Fb()));
        }
        va40 va40Var = this.l;
        Iterator it3 = va40Var.b.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            if (!arrayList3.contains(entry.getKey())) {
                ((io.reactivex.rxjava3.disposables.c) entry.getValue()).dispose();
                it3.remove();
            }
        }
        Set<String> set = this.i;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : set) {
            if (!arrayList3.contains((String) obj)) {
                arrayList4.add(obj);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (true) {
            boolean hasNext = it4.hasNext();
            bVar = this.a;
            if (!hasNext) {
                break;
            } else {
                bVar.i((String) it4.next());
            }
        }
        set.removeAll(j5g.S0(arrayList4));
        HashMap hashMap = this.j;
        p4g.o(arrayList3, hashMap);
        ym80 ym80Var = new ym80(arrayList3, 0);
        LinkedList<Pair<String, MusicTrack>> linkedList = this.k;
        g5g.D(linkedList, false, ym80Var);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Set<String> d = this.f.d();
        Iterator it5 = arrayList.iterator();
        int i = 0;
        while (it5.hasNext()) {
            PlayerTrack playerTrack2 = (PlayerTrack) it5.next();
            String concat = "track_download_".concat(playerTrack2.b.Fb());
            Iterator it6 = it5;
            AudioDownloadManager.a b = bVar.b(concat);
            AudioDownloadManager.State state = b != null ? b.c : null;
            boolean z = set.contains(concat) || d.contains(concat);
            Set<String> set2 = set;
            if (state == AudioDownloadManager.State.COMPLETED || state == AudioDownloadManager.State.DOWNLOADING || z) {
                MusicTrack musicTrack2 = playerTrack2.b;
                if (!z) {
                    arrayList7.add(musicTrack2);
                }
            } else {
                boolean f = epx.f(playerTrack2.b.Fb(), (playerTrack == null || (musicTrack = playerTrack.b) == null) ? null : musicTrack.Fb());
                if (f || i < this.b.d()) {
                    arrayList5.add(new Pair(concat, playerTrack2.b));
                    if (!f) {
                        i++;
                    }
                } else {
                    arrayList6.add(new Pair(concat, playerTrack2.b));
                }
            }
            it5 = it6;
            set = set2;
        }
        pn00.p(hashMap, arrayList5);
        linkedList.addAll(arrayList6);
        if (!arrayList7.isEmpty()) {
            ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
            Iterator it7 = arrayList7.iterator();
            while (it7.hasNext()) {
                arrayList8.add(((MusicTrack) it7.next()).Fb());
            }
            io.reactivex.rxjava3.internal.operators.single.f0 q = this.e.h(arrayList8).q(asu0.a.c());
            fs00 fs00Var = new fs00(new uf1(29, this, arrayList7), 9);
            new gz30(5);
            va40.a(va40Var, null, q.subscribe(fs00Var, new cn80()));
        }
        List<String> g2 = g();
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            String str = (String) pair.d();
            va40.a(va40Var, str, f((MusicTrack) pair.g(), g2, str).q(asu0.a.c()).subscribe(new va4(0), new ff3(new sf4(14, this, str), 29)));
        }
    }

    @Override // xsna.mzc0
    public final void e(PlayerTrack playerTrack, long j) {
        MusicTrack musicTrack;
        Integer num;
        if (!this.p || playerTrack == null || (musicTrack = playerTrack.b) == null) {
            return;
        }
        String Fb = musicTrack.Fb();
        MusicTrack musicTrack2 = this.n;
        if (!epx.f(Fb, musicTrack2 != null ? musicTrack2.Fb() : null) || (num = this.o) == null || j < num.intValue()) {
            return;
        }
        AudioDownloadManager.a f = this.a.f("track_download_".concat(musicTrack.Fb()));
        if ((f != null ? f.c : null) == AudioDownloadManager.State.COMPLETED) {
            this.p = false;
            String valueOf = String.valueOf(o25.a().c().b);
            va40.a(this.l, null, this.d.h(valueOf, musicTrack.Fb()).q(asu0.a.c()).subscribe(new cc20(new jy5(this, valueOf, musicTrack, 7), 11)));
        }
    }

    public final io.reactivex.rxjava3.core.a f(final MusicTrack musicTrack, List list, final String str) {
        io.reactivex.rxjava3.core.a aVar;
        String str2 = musicTrack.i;
        int i = musicTrack.c0;
        if (str2 != null) {
            long j = i;
            if (j <= 420000) {
                io.reactivex.rxjava3.core.a a = this.g.a(musicTrack, list);
                final String str3 = musicTrack.i;
                if (str3 == null) {
                    aVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
                } else {
                    if (j <= 420000) {
                        Set<String> set = this.i;
                        if (!set.contains(str)) {
                            set.add(str);
                            boolean c = this.a.c(str);
                            df5 df5Var = this.d;
                            aVar = c ? io.reactivex.rxjava3.core.a.l(new an80(0, this, str)).c(df5Var.j(musicTrack)) : io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.bn80
                                /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
                                
                                    if (r2 != null) goto L20;
                                 */
                                @Override // io.reactivex.rxjava3.functions.a
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    String str4;
                                    List<AudioStream> list2;
                                    Object obj;
                                    MusicTrack musicTrack2 = MusicTrack.this;
                                    AudioStreamDto.TypeDto b = ob50.b(musicTrack2);
                                    if (MusicFeatures.AUDIO_GET_ALL_PLAYING_FORMATS.h() && (list2 = musicTrack2.j) != null) {
                                        Iterator<T> it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (epx.f(((AudioStream) next).b, b != null ? b.j() : null)) {
                                                obj = next;
                                                break;
                                            }
                                        }
                                        AudioStream audioStream = (AudioStream) obj;
                                        if (audioStream != null) {
                                            str4 = audioStream.c;
                                        }
                                    }
                                    str4 = str3;
                                    this.a.l(str, b, Uri.parse(str4), musicTrack2.Fb().getBytes(StandardCharsets.UTF_8));
                                }
                            }).c(df5Var.j(musicTrack));
                        }
                    }
                    aVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                return a.c(aVar);
            }
        }
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<java.lang.String>] */
    public final List<String> g() {
        MusicTrack musicTrack = this.n;
        if (musicTrack != null) {
            List<String> R = j5g.R(j5g.v0(musicTrack.Fb(), (Collection) this.m));
            if (R != null) {
                return R;
            }
        }
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (xsna.jnj.d(r4.V) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r4.Mb() == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.Vb() == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(MusicTrack musicTrack) {
        boolean z;
        int i;
        this.n = musicTrack;
        bf5 bf5Var = this.c;
        Integer num = null;
        if (musicTrack != null && (i = musicTrack.c0) > 0) {
            num = Integer.valueOf(((bf5Var.d() * i) + 99) / 100);
        }
        this.o = num;
        if (num != null && bf5Var.c() == MusicAutoDownloadTrigger.LISTENING && bf5Var.a() > 0 && k840.a.i.c()) {
            z = true;
            if (musicTrack != null) {
            }
            if (musicTrack != null) {
            }
            if (musicTrack != null) {
            }
            this.p = z;
        }
        z = false;
        this.p = z;
    }

    @Override // xsna.mzc0
    public final void release() {
        reset();
        this.f.release();
        this.l.a.e();
    }

    @Override // xsna.mzc0
    public final void reset() {
        va40 va40Var = this.l;
        LinkedHashMap linkedHashMap = va40Var.c;
        LinkedHashMap linkedHashMap2 = va40Var.b;
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.c) ((Map.Entry) it.next()).getValue()).dispose();
        }
        linkedHashMap2.clear();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((io.reactivex.rxjava3.disposables.c) ((Map.Entry) it2.next()).getValue()).dispose();
        }
        linkedHashMap.clear();
        Set<String> set = this.i;
        Iterator<T> it3 = set.iterator();
        while (it3.hasNext()) {
            this.a.i((String) it3.next());
        }
        set.clear();
        h(null);
        this.j.clear();
        this.k.clear();
    }
}
