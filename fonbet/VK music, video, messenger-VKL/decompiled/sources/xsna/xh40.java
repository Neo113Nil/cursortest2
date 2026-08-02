package xsna;

import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.dto.music.moosic.MoosicAudio;
import com.vk.dto.podcast.Podcast;
import com.vk.music.offline.api.domain.download.AudioDownloadManager;
import com.vk.music.offline.api.domain.download.DownloadType;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.k840;
import xsna.sg40;

/* compiled from: MusicDownloadManagerControllerImpl.kt */
/* loaded from: classes.dex */
public final class xh40 implements wh40, AudioDownloadManager.b {
    public final AudioDownloadManager a;
    public final AudioDownloadManager b;
    public final zh40 c;
    public final ug40 d;
    public final boolean e;
    public sg40 g;
    public final xb50 f = new xb50();
    public final ConcurrentHashMap<String, jb50> h = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, r8b0> i = new ConcurrentHashMap<>();
    public final bpn0 j = new bpn0(new d53(3));

    /* compiled from: MusicDownloadManagerControllerImpl.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioDownloadManager.State.values().length];
            try {
                iArr[AudioDownloadManager.State.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioDownloadManager.State.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioDownloadManager.State.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioDownloadManager.State.REMOVING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xh40(AudioDownloadManager audioDownloadManager, i5q i5qVar, zh40 zh40Var, vi40 vi40Var, boolean z) {
        this.a = audioDownloadManager;
        this.b = i5qVar;
        this.c = zh40Var;
        this.d = vi40Var;
        this.e = z;
        audioDownloadManager.d(this);
    }

    @Override // xsna.wh40
    public final ArrayList J() {
        Set<String> keySet = ((Boolean) this.j.getValue()).booleanValue() ? this.h.keySet() : EmptySet.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (d370.Q((String) obj) == DownloadType.MUSIC_TRACK) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String A = d370.A((String) it.next());
            if (A != null) {
                arrayList2.add(A);
            }
        }
        return arrayList2;
    }

    @Override // xsna.wh40
    public final void K(UserId userId, AudioBookChapter audioBookChapter, int i, be4 be4Var) {
        String url;
        sg40 sg40Var = this.g;
        if (sg40Var != null) {
            sg40Var.c.a(sg40Var.e.e());
            sg40Var.g.b(userId, audioBookChapter, i);
        }
        String l = d370.l(audioBookChapter.getId());
        this.h.put(l, be4Var);
        AudioBookFile Ab = audioBookChapter.Ab();
        if (Ab == null || (url = Ab.getUrl()) == null) {
            return;
        }
        this.c.d(l, null, Uri.parse(url), com.vk.dto.music.audiobook.a.b(audioBookChapter).getBytes(StandardCharsets.UTF_8));
    }

    @Override // xsna.wh40
    public final void L(Playlist playlist) {
        String Ib = playlist.Ib();
        ConcurrentHashMap<String, r8b0> concurrentHashMap = this.i;
        concurrentHashMap.remove(Ib);
        concurrentHashMap.remove(playlist.Hb());
        this.d.d(playlist);
    }

    @Override // xsna.wh40
    public final boolean M(String str) {
        AudioDownloadManager.a aVar;
        try {
            aVar = this.a.b(d370.P(str));
        } catch (Throwable unused) {
            aVar = null;
        }
        return aVar != null && aVar.e() == AudioDownloadManager.State.COMPLETED;
    }

    @Override // xsna.wh40
    public final void N(Playlist playlist) {
        d(this.f.d(playlist));
    }

    @Override // xsna.wh40
    public final void O(MusicTrack musicTrack) {
        String zb;
        MoosicAudio moosicAudio = musicTrack.W;
        if (moosicAudio == null) {
            String q = d370.q(musicTrack.Fb());
            this.h.remove(q);
            this.c.a(q);
            return;
        }
        EncryptedFileInfo zb2 = moosicAudio.zb();
        if (zb2 == null || (zb = zb2.zb()) == null) {
            return;
        }
        File file = new File(zb);
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // xsna.wh40
    public final boolean P() {
        return this.a.isInitialized();
    }

    @Override // xsna.wh40
    public final void Q(UserId userId, MusicTrack musicTrack, String str, jb50 jb50Var) {
        MusicTrack musicTrack2;
        xh40 xh40Var;
        String r;
        sg40 sg40Var;
        wh40 wh40Var;
        boolean z;
        MusicTrack zb;
        this.h.put(d370.P(musicTrack.Fb()), jb50Var);
        sg40 sg40Var2 = this.g;
        if (sg40Var2 != null) {
            wh40 wh40Var2 = sg40Var2.a;
            if ((((Boolean) sg40Var2.p.getValue()).booleanValue() || ((Boolean) sg40Var2.q.getValue()).booleanValue()) && wh40Var2.M(musicTrack.Fb())) {
                r = sg40Var2.k.r(musicTrack.Fb());
                sg40Var = sg40Var2;
                wh40Var = wh40Var2;
                musicTrack2 = musicTrack;
                z = true;
                zb = MusicTrack.zb(musicTrack2, 0, null, 0, 0, null, false, null, DownloadingState.Downloaded.b, false, false, null, null, null, -1, 1048571);
            } else {
                sg40Var = sg40Var2;
                wh40Var = wh40Var2;
                musicTrack2 = musicTrack;
                r = null;
                z = false;
                zb = musicTrack2;
            }
            boolean z2 = z;
            String str2 = r;
            sg40Var.c.a(sg40Var.e.e());
            kgp0.f(sg40Var.e, userId, zb, str, z2, str2, null, 32);
            if (str != null) {
                kgp0.f(sg40Var.e, userId, zb, null, z2, str2, null, 32);
            }
            if (z2) {
                wh40Var.S(musicTrack2);
            }
        } else {
            musicTrack2 = musicTrack;
        }
        String P = d370.P(musicTrack2.Fb());
        String str3 = musicTrack2.i;
        if (str3 == null) {
            xh40Var = this;
        } else {
            xh40Var = this;
            xh40Var.c.d(P, ob50.b(musicTrack2), Uri.parse(str3), musicTrack2.Fb().getBytes(StandardCharsets.UTF_8));
        }
        xh40Var.c(musicTrack2);
    }

    @Override // xsna.wh40
    public final void R(boolean z) {
        AudioDownloadManager audioDownloadManager = this.a;
        List<AudioDownloadManager.Requirement> n = audioDownloadManager.n();
        AudioDownloadManager.Requirement requirement = AudioDownloadManager.Requirement.NETWORK;
        boolean z2 = z != epx.f(n, Collections.singletonList(requirement));
        List<? extends AudioDownloadManager.Requirement> singletonList = z ? Collections.singletonList(requirement) : Collections.singletonList(AudioDownloadManager.Requirement.NETWORK_UNMETERED);
        audioDownloadManager.k(singletonList);
        if (this.e) {
            this.b.k(singletonList);
        }
        if (z2) {
            s750 s750Var = k840.a.e;
            if (s750Var == null) {
                s750Var = null;
            }
            s750Var.W0(z);
        }
    }

    @Override // xsna.wh40
    public final void S(MusicTrack musicTrack) {
        a(d370.p(musicTrack), AudioDownloadManager.State.COMPLETED, null);
    }

    @Override // xsna.wh40
    public final void T(AudioBook audioBook) {
        b(this.f.e(audioBook));
    }

    @Override // xsna.wh40
    public final void U(MusicTrack musicTrack) {
        String P = d370.P(musicTrack.Fb());
        zh40 zh40Var = this.c;
        zh40Var.c(P);
        Iterator<T> it = this.f.c(musicTrack).iterator();
        while (it.hasNext()) {
            zh40Var.c(((Uri) it.next()).toString());
        }
    }

    @Override // xsna.wh40
    public final io.reactivex.rxjava3.core.q<MusicTrack> V(UserId userId, Playlist playlist) {
        if (!playlist.y.isEmpty()) {
            String Ib = playlist.Ib();
            ConcurrentHashMap<String, r8b0> concurrentHashMap = this.i;
            if (!concurrentHashMap.containsKey(Ib)) {
                this.d.a(playlist);
                s8b0 s8b0Var = new s8b0(playlist, new whe(this));
                if (!s8b0Var.h()) {
                    concurrentHashMap.put(playlist.Ib(), s8b0Var);
                }
                io.reactivex.rxjava3.core.q I0 = io.reactivex.rxjava3.core.q.I0(new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.O(playlist.y), new yh1(new ch40(1, playlist), 28)), io.reactivex.rxjava3.core.q.R(300L, TimeUnit.MILLISECONDS), new io.reactivex.rxjava3.internal.operators.mixed.n(22, new uni(2)));
                amt amtVar = new amt(new iu9(playlist, this, userId, 4), 13);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return I0.E(amtVar, lVar, kVar, kVar);
            }
        }
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // xsna.wh40
    public final void W(float f, String str) {
        jb50 jb50Var = this.h.get(str);
        if (jb50Var != null) {
            jb50Var.a(f / 100);
        }
    }

    @Override // xsna.wh40
    public final void X(AudioBook audioBook) {
        d(this.f.e(audioBook));
    }

    @Override // xsna.wh40
    public final void Y(List<? extends Uri> list, List<? extends Uri> list2) {
        b(list);
        d(list2);
    }

    @Override // xsna.wh40
    public final ut70 Z(MusicTrack musicTrack, String str) {
        AudioDownloadManager.a aVar;
        try {
            aVar = this.a.b(d370.P(musicTrack.Fb()));
        } catch (Throwable unused) {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        float d = aVar.d();
        Float valueOf = (Float.isNaN(d) || d < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? null : Float.valueOf(d);
        long b = aVar.b();
        return new ut70(Integer.valueOf(aVar.e().h()), aVar.c(), Long.valueOf(aVar.a()), valueOf, b > 0 ? Long.valueOf(b) : null, aVar.f().toString(), str);
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager.b
    public final void a(String str, AudioDownloadManager.State state, Exception exc) {
        final sg40 sg40Var;
        if (state == AudioDownloadManager.State.COMPLETED && (sg40Var = this.g) != null) {
            final DownloadingState.Downloaded downloaded = DownloadingState.Downloaded.b;
            final String A = d370.A(str);
            if (A != null) {
                final DownloadType Q = d370.Q(str);
                sg40Var.n.execute(new Runnable() { // from class: xsna.pg40
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = sg40.a.$EnumSwitchMapping$0[DownloadType.this.ordinal()];
                        sg40 sg40Var2 = sg40Var;
                        String str2 = A;
                        DownloadingState downloadingState = downloaded;
                        if (i == 1) {
                            sg40Var2.e.t(str2, downloadingState);
                        } else if (i == 2) {
                            sg40Var2.g.h(str2, downloadingState);
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            sg40Var2.j.x(str2, downloadingState);
                        }
                    }
                });
            }
        }
        ConcurrentHashMap<String, jb50> concurrentHashMap = this.h;
        jb50 jb50Var = concurrentHashMap.get(str);
        if (jb50Var == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            jb50Var.c();
            concurrentHashMap.remove(str);
            return;
        }
        if (i == 2) {
            jb50Var.b();
            concurrentHashMap.remove(str);
        } else if (i == 3) {
            jb50Var.e(exc);
            concurrentHashMap.remove(str);
        } else {
            if (i != 4) {
                return;
            }
            jb50Var.d();
            concurrentHashMap.remove(str);
        }
    }

    @Override // xsna.wh40
    public final void a0(List<MusicTrack> list, List<MusicTrack> list2) {
        List<MusicTrack> list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (((MusicTrack) obj).W != null) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j0((MusicTrack) it.next(), false);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            if (((MusicTrack) obj2).W == null) {
                arrayList2.add(obj2);
            }
        }
        List<MusicTrack> list4 = list2;
        ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList3.add(d370.P(((MusicTrack) it2.next()).Fb()));
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(d370.P(((MusicTrack) it3.next()).Fb()));
        }
        ArrayList q = p4g.q(arrayList4);
        Iterator it4 = q.iterator();
        while (it4.hasNext()) {
            this.h.remove((String) it4.next());
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : q) {
            if (!arrayList3.contains((String) obj3)) {
                arrayList5.add(obj3);
            }
        }
        ArrayList<String> q2 = p4g.q(arrayList5);
        zh40 zh40Var = this.c;
        zh40Var.b(q2);
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            g5g.y(this.f.c((MusicTrack) it5.next()), arrayList6);
        }
        ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            arrayList7.add(((Uri) it6.next()).toString());
        }
        zh40Var.b(p4g.q(arrayList7));
    }

    public final void b(List<? extends Uri> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.c.a(((Uri) it.next()).toString());
        }
    }

    @Override // xsna.wh40
    public final void b0(Podcast podcast) {
        b(this.f.f(podcast));
    }

    public final void c(MusicTrack musicTrack) {
        for (Uri uri : this.f.c(musicTrack)) {
            this.c.f(uri, uri.toString(), musicTrack.Fb().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // xsna.wh40
    public final void c0(Playlist playlist) {
        b(this.f.d(playlist));
    }

    public final void d(List<? extends Uri> list) {
        for (Uri uri : list) {
            this.c.f(uri, uri.toString(), null);
        }
    }

    @Override // xsna.wh40
    public final void d0(UserId userId, MusicTrack musicTrack, UserId userId2, ifp0 ifp0Var) {
        sg40 sg40Var = this.g;
        if (sg40Var != null) {
            sg40Var.c.a(sg40Var.e.e());
            sg40Var.j.u(userId, musicTrack, userId2);
        }
        String q = d370.q(musicTrack.Fb());
        this.h.put(q, ifp0Var);
        String str = musicTrack.i;
        if (str != null) {
            this.c.d(q, null, Uri.parse(str), musicTrack.Fb().getBytes(StandardCharsets.UTF_8));
        }
        c(musicTrack);
    }

    @Override // xsna.wh40
    public final void e(Playlist playlist) {
        r8b0 r8b0Var = this.i.get(playlist.Ib());
        if (r8b0Var == null) {
            return;
        }
        r8b0Var.f();
    }

    @Override // xsna.wh40
    public final void e0(AudioBookChapter audioBookChapter) {
        EncryptedFileInfo zb;
        String zb2;
        if (audioBookChapter.Cb() == null) {
            String l = d370.l(audioBookChapter.getId());
            this.h.remove(l);
            this.c.a(l);
            return;
        }
        MoosicAudio Cb = audioBookChapter.Cb();
        if (Cb == null || (zb = Cb.zb()) == null || (zb2 = zb.zb()) == null) {
            return;
        }
        File file = new File(zb2);
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // xsna.wh40
    public final List<MusicTrack> f0(Playlist playlist) {
        String Ib = playlist.Ib();
        ConcurrentHashMap<String, r8b0> concurrentHashMap = this.i;
        r8b0 r8b0Var = concurrentHashMap.get(Ib);
        ArrayList c = r8b0Var != null ? r8b0Var.c() : null;
        concurrentHashMap.remove(playlist.Ib());
        this.d.b(playlist);
        return c;
    }

    @Override // xsna.wh40
    public final void g0(Podcast podcast) {
        d(this.f.f(podcast));
    }

    @Override // xsna.wh40
    public final void h0(sg40 sg40Var) {
        this.g = sg40Var;
    }

    @Override // xsna.wh40
    public final void i0(List<MusicTrack> list) {
        List<MusicTrack> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(d370.P(((MusicTrack) it.next()).Fb()));
        }
        ArrayList<String> q = p4g.q(arrayList);
        zh40 zh40Var = this.c;
        zh40Var.e(q);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            g5g.y(this.f.c((MusicTrack) it2.next()), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Uri) it3.next()).toString());
        }
        zh40Var.e(p4g.q(arrayList3));
    }

    @Override // xsna.wh40
    public final void j0(MusicTrack musicTrack, boolean z) {
        String zb;
        MoosicAudio moosicAudio = musicTrack.W;
        if (moosicAudio != null) {
            EncryptedFileInfo zb2 = moosicAudio.zb();
            if (zb2 == null || (zb = zb2.zb()) == null) {
                return;
            }
            File file = new File(zb);
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        String P = d370.P(musicTrack.Fb());
        ConcurrentHashMap<String, jb50> concurrentHashMap = this.h;
        jb50 jb50Var = concurrentHashMap.get(P);
        if (jb50Var != null) {
            jb50Var.d();
        }
        concurrentHashMap.remove(P);
        if (!z) {
            this.c.a(P);
        }
        b(this.f.c(musicTrack));
    }

    @Override // xsna.wh40
    public final ArrayList p() {
        Set<String> keySet = ((Boolean) this.j.getValue()).booleanValue() ? this.h.keySet() : EmptySet.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (d370.Q((String) obj) == DownloadType.PODCAST_EPISODE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String A = d370.A((String) it.next());
            if (A != null) {
                arrayList2.add(A);
            }
        }
        return arrayList2;
    }

    @Override // xsna.wh40
    public final ArrayList q() {
        Set<String> keySet = ((Boolean) this.j.getValue()).booleanValue() ? this.h.keySet() : EmptySet.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (d370.Q((String) obj) == DownloadType.AUDIO_BOOK_CHAPTER) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String A = d370.A((String) it.next());
            if (A != null) {
                arrayList2.add(A);
            }
        }
        return arrayList2;
    }
}
