package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.moosic.MoosicAudio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.k840;

/* compiled from: DownloadedEntitiesMarkerImpl.kt */
/* loaded from: classes.dex */
public final class bbo implements abo {
    public final dq40 a;
    public final bpn0 b = new bpn0(new wa3(5));

    public bbo(dq40 dq40Var) {
        this.a = dq40Var;
    }

    public static MusicTrack i(MusicTrack musicTrack, DownloadingState downloadingState, MoosicAudio moosicAudio) {
        return MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, downloadingState, false, false, null, moosicAudio, null, -1, 1015803);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x019b, code lost:
    
        if (r6 != (-1)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x019d, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a0, code lost:
    
        r6 = java.lang.Integer.valueOf(r6);
     */
    @Override // xsna.abo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<MusicTrack> a(Playlist playlist, List<MusicTrack> list) {
        Object failure;
        char c;
        HashMap hashMap;
        int i;
        MusicTrack musicTrack;
        Object failure2;
        if (list.isEmpty()) {
            return EmptyList.b;
        }
        List<String> l = l();
        String Ib = k840.a.d().d(playlist.Ib()) ? playlist.Ib() : k840.a.d().d(playlist.Hb()) ? playlist.Hb() : null;
        dq40 dq40Var = this.a;
        if (Ib != null) {
            try {
                failure = dq40Var.u(Ib);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (Result.a(failure) != null) {
                failure = EmptyList.b;
            }
            List<MusicTrack> list2 = (List) failure;
            List<MusicTrack> list3 = list2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((MusicTrack) it.next()).Fb());
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((MusicTrack) it2.next()).Z);
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (true) {
                c = '_';
                if (!it3.hasNext()) {
                    break;
                }
                MusicTrack musicTrack2 = (MusicTrack) it3.next();
                StringBuilder sb = new StringBuilder();
                String str = musicTrack2.d;
                if (str != null) {
                    bpn0 bpn0Var = cqm0.a;
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append('_');
                sb.append(musicTrack2.f);
                arrayList3.add(sb.toString());
            }
            hashMap = new HashMap();
            for (MusicTrack musicTrack3 : list) {
                String str2 = musicTrack3.d + c + musicTrack3.f;
                Iterator it4 = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i = -1;
                        break;
                    }
                    Object next = it4.next();
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((String) next).equals(musicTrack3.Fb())) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                Integer valueOf = i == -1 ? null : Integer.valueOf(i);
                if (valueOf == null && (valueOf = i7o0.g(arrayList2, new t3h(musicTrack3, 12))) == null) {
                    Iterator it5 = arrayList.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        Object next2 = it5.next();
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        String str3 = (String) next2;
                        String str4 = musicTrack3.Z;
                        if (str4 != null && str4.equals(str3)) {
                            break;
                        }
                        i3++;
                    }
                    valueOf = i3 == -1 ? null : Integer.valueOf(i3);
                    if (valueOf == null) {
                        Iterator it6 = arrayList3.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i4 = -1;
                                break;
                            }
                            Object next3 = it6.next();
                            if (i4 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (((String) next3).equals(str2)) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
                if (valueOf != null) {
                    hashMap.put(musicTrack3.Fb(), list2.get(valueOf.intValue()));
                }
                c = '_';
            }
        } else {
            List<MusicTrack> list4 = list;
            ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it7 = list4.iterator();
            while (it7.hasNext()) {
                arrayList4.add(((MusicTrack) it7.next()).Fb());
            }
            List<String> O0 = j5g.O0(j5g.S0(arrayList4));
            if (h()) {
                ArrayList arrayList5 = new ArrayList();
                Iterator<T> it8 = list4.iterator();
                while (it8.hasNext()) {
                    String str5 = ((MusicTrack) it8.next()).Z;
                    if (str5 != null) {
                        arrayList5.add(str5);
                    }
                }
                hashMap = pn00.n(j(O0), k(j5g.O0(j5g.S0(arrayList5))));
            } else {
                try {
                    failure2 = dq40Var.s(O0);
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                if (Result.a(failure2) != null) {
                    failure2 = EmptyList.b;
                }
                List<MusicTrack> list5 = (List) failure2;
                int e = on00.e(c5g.u(list5, 10));
                if (e < 16) {
                    e = 16;
                }
                hashMap = new LinkedHashMap(e);
                for (MusicTrack musicTrack4 : list5) {
                    hashMap.put(musicTrack4.Fb(), musicTrack4);
                }
            }
        }
        List<MusicTrack> list6 = list;
        ArrayList arrayList6 = new ArrayList(c5g.u(list6, 10));
        for (MusicTrack musicTrack5 : list6) {
            if (h()) {
                musicTrack = (MusicTrack) hashMap.get(musicTrack5.Fb());
                if (musicTrack == null) {
                    musicTrack = (MusicTrack) hashMap.get(musicTrack5.Z);
                }
            } else {
                musicTrack = (MusicTrack) hashMap.get(musicTrack5.Fb());
            }
            if (musicTrack != null) {
                musicTrack5 = i(musicTrack5, musicTrack.J, musicTrack.W);
            } else if (h() ? l.contains(musicTrack5.Fb()) || j5g.P(l, musicTrack5.Z) : l.contains(musicTrack5.Fb())) {
                musicTrack5 = MusicTrack.zb(musicTrack5, 0, null, 0, 0, null, false, null, DownloadingState.PendingDownload.b, false, false, null, null, null, -1, 1048571);
            }
            arrayList6.add(musicTrack5);
        }
        return arrayList6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // xsna.abo
    public final AudioBook b(AudioBook audioBook) {
        Object failure;
        Object failure2;
        dq40 dq40Var = this.a;
        List<AudioBookChapter> Bb = audioBook.Bb();
        if (Bb == null) {
            return audioBook;
        }
        try {
            failure = dq40Var.q();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = EmptyList.b;
        }
        List<String> list = (List) failure;
        List<AudioBookChapter> list2 = Bb;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AudioBookChapter) it.next()).getId());
        }
        try {
            List H = dq40Var.H(arrayList);
            int e = on00.e(c5g.u(H, 10));
            if (e < 16) {
                e = 16;
            }
            failure2 = new LinkedHashMap(e);
            for (Object obj : H) {
                failure2.put(((AudioBookChapter) obj).getId(), (AudioBookChapter) obj);
            }
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Throwable a = Result.a(failure2);
        jgp jgpVar = failure2;
        if (a != null) {
            jgpVar = jgp.b;
        }
        jgp jgpVar2 = jgpVar;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (AudioBookChapter audioBookChapter : list2) {
            AudioBookChapter audioBookChapter2 = (AudioBookChapter) jgpVar2.get(audioBookChapter.getId());
            if (audioBookChapter2 != null) {
                audioBookChapter = AudioBookChapter.zb(audioBookChapter, 0, null, audioBookChapter2.Bb(), audioBookChapter2.Cb(), 255);
            } else if (list.contains(audioBookChapter.getId())) {
                audioBookChapter = AudioBookChapter.zb(audioBookChapter, 0, null, DownloadingState.PendingDownload.b, null, 767);
            }
            arrayList2.add(audioBookChapter);
        }
        return AudioBook.zb(audioBook, arrayList2, false, 4193791);
    }

    @Override // xsna.abo
    public final List<Playlist> c(List<Playlist> list) {
        Object failure;
        try {
            failure = this.a.j();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = EmptyList.b;
        }
        List<Playlist> list2 = (List) failure;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Playlist playlist : list2) {
            linkedHashMap.put(playlist.Ib(), playlist.H);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Playlist playlist2 : list2) {
            linkedHashMap2.put(playlist2.Hb(), playlist2.H);
        }
        List<Playlist> list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        for (Playlist playlist3 : list3) {
            DownloadingState downloadingState = (DownloadingState) linkedHashMap.get(playlist3.Ib());
            if (downloadingState == null) {
                String Hb = playlist3.Hb();
                downloadingState = Hb != null ? (DownloadingState) linkedHashMap2.get(Hb) : null;
            }
            DownloadingState downloadingState2 = downloadingState;
            if (downloadingState2 != null) {
                playlist3 = Playlist.zb(playlist3, null, null, null, downloadingState2, -1, 254);
            }
            arrayList.add(playlist3);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // xsna.abo
    public final List<MusicTrack> d(List<MusicTrack> list) {
        Object failure;
        List<String> l = l();
        try {
            List<MusicTrack> V = this.a.V();
            int e = on00.e(c5g.u(V, 10));
            if (e < 16) {
                e = 16;
            }
            failure = new LinkedHashMap(e);
            for (Object obj : V) {
                failure.put(((MusicTrack) obj).Fb(), (MusicTrack) obj);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        jgp jgpVar = failure;
        if (a != null) {
            jgpVar = jgp.b;
        }
        jgp jgpVar2 = jgpVar;
        List<MusicTrack> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MusicTrack musicTrack : list2) {
            String Fb = musicTrack.Fb();
            String str = musicTrack.Z;
            MusicTrack musicTrack2 = (MusicTrack) jgpVar2.get(Fb);
            if (musicTrack2 == null) {
                musicTrack2 = (MusicTrack) jgpVar2.get(str);
            }
            if (musicTrack2 != null) {
                musicTrack = i(musicTrack, musicTrack2.J, musicTrack2.W);
            } else if (h() ? l.contains(musicTrack.Fb()) || j5g.P(l, str) : l.contains(musicTrack.Fb())) {
                musicTrack = MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, DownloadingState.PendingDownload.b, false, false, null, null, null, -1, 1048571);
            } else {
                DownloadingState downloadingState = musicTrack.J;
                DownloadingState.NotLoaded notLoaded = DownloadingState.NotLoaded.b;
                if (!epx.f(downloadingState, notLoaded)) {
                    musicTrack = MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, notLoaded, false, false, null, null, null, -1, 1048571);
                }
            }
            arrayList.add(musicTrack);
        }
        return arrayList;
    }

    @Override // xsna.abo
    public final LinkedHashMap e(List list) {
        Map<String, MusicTrack> j;
        List<String> l = l();
        if (h()) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MusicTrack) it.next()).Fb());
            }
            Map<String, MusicTrack> j2 = j(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str = ((MusicTrack) it2.next()).Z;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            j = pn00.n(j2, k(arrayList2));
        } else {
            List list3 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((MusicTrack) it3.next()).Fb());
            }
            j = j(arrayList3);
        }
        List<MusicTrack> list4 = list;
        ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
        for (MusicTrack musicTrack : list4) {
            String Fb = musicTrack.Fb();
            String str2 = musicTrack.Z;
            MusicTrack musicTrack2 = j.get(Fb);
            if (musicTrack2 == null) {
                musicTrack2 = j.get(str2);
            }
            if (musicTrack2 != null) {
                musicTrack = i(musicTrack, musicTrack2.J, musicTrack2.W);
            } else if (h() ? l.contains(musicTrack.Fb()) || j5g.P(l, str2) : l.contains(musicTrack.Fb())) {
                musicTrack = MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, DownloadingState.PendingDownload.b, false, false, null, null, null, -1, 1048571);
            } else {
                DownloadingState downloadingState = musicTrack.J;
                DownloadingState.NotLoaded notLoaded = DownloadingState.NotLoaded.b;
                if (!epx.f(downloadingState, notLoaded)) {
                    musicTrack = MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, notLoaded, false, false, null, null, null, -1, 1048571);
                }
            }
            arrayList4.add(musicTrack);
        }
        int e = on00.e(c5g.u(arrayList4, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            MusicTrack musicTrack3 = (MusicTrack) it4.next();
            linkedHashMap.put(musicTrack3.Fb(), musicTrack3);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // xsna.abo
    public final List<MusicTrack> f(List<MusicTrack> list) {
        Object failure;
        Object failure2;
        dq40 dq40Var = this.a;
        try {
            failure = dq40Var.p();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = EmptyList.b;
        }
        List<String> list2 = (List) failure;
        List<MusicTrack> list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((MusicTrack) it.next()).Fb());
        }
        try {
            List o = dq40Var.o(arrayList);
            int e = on00.e(c5g.u(o, 10));
            if (e < 16) {
                e = 16;
            }
            failure2 = new LinkedHashMap(e);
            for (Object obj : o) {
                failure2.put(((MusicTrack) obj).Fb(), (MusicTrack) obj);
            }
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Throwable a = Result.a(failure2);
        jgp jgpVar = failure2;
        if (a != null) {
            jgpVar = jgp.b;
        }
        jgp jgpVar2 = jgpVar;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        for (MusicTrack musicTrack : list3) {
            MusicTrack musicTrack2 = (MusicTrack) jgpVar2.get(musicTrack.Fb());
            if (musicTrack2 != null) {
                musicTrack = i(musicTrack, musicTrack2.J, musicTrack2.W);
            } else if (list2.contains(musicTrack.Fb())) {
                musicTrack = MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, DownloadingState.PendingDownload.b, false, false, null, null, null, -1, 1048571);
            }
            arrayList2.add(musicTrack);
        }
        return arrayList2;
    }

    @Override // xsna.abo
    public final Playlist g(Playlist playlist, ArrayList arrayList) {
        Object failure;
        boolean z;
        Playlist playlist2 = (Playlist) j5g.Y(c(Collections.singletonList(playlist)));
        boolean z2 = false;
        if (arrayList != null) {
            try {
                failure = this.a.s(arrayList);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (Result.a(failure) != null) {
                failure = EmptyList.b;
            }
            List<MusicTrack> list = (List) failure;
            boolean z3 = false;
            z = false;
            for (MusicTrack musicTrack : list) {
                if (epx.f(musicTrack.J, DownloadingState.NotLoaded.b)) {
                    z3 = true;
                } else if (epx.f(musicTrack.J, DownloadingState.Downloaded.b)) {
                    z = true;
                }
            }
            if (z3 || list.size() < arrayList.size()) {
                z2 = true;
            }
        } else {
            z = false;
        }
        k840.a.d().a(playlist2);
        return (z2 && z && !(playlist2.H instanceof DownloadingState.Downloading)) ? Playlist.zb(playlist2, null, null, null, DownloadingState.PartlyDownloaded.b, -1, 254) : playlist2;
    }

    public final boolean h() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.LinkedHashMap, java.util.Map] */
    public final Map<String, MusicTrack> j(List<String> list) {
        Object failure;
        try {
            List<MusicTrack> s = this.a.s(list);
            int e = on00.e(c5g.u(s, 10));
            if (e < 16) {
                e = 16;
            }
            failure = new LinkedHashMap(e);
            for (Object obj : s) {
                failure.put(((MusicTrack) obj).Fb(), (MusicTrack) obj);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        jgp jgpVar = failure;
        if (a != null) {
            jgpVar = jgp.b;
        }
        return jgpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.LinkedHashMap, java.util.Map] */
    public final Map<String, MusicTrack> k(List<String> list) {
        Object failure;
        try {
            List<MusicTrack> N = this.a.N(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : N) {
                if (((MusicTrack) obj).Z != null) {
                    arrayList.add(obj);
                }
            }
            int e = on00.e(c5g.u(arrayList, 10));
            if (e < 16) {
                e = 16;
            }
            failure = new LinkedHashMap(e);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                MusicTrack musicTrack = (MusicTrack) next;
                String str = musicTrack.Z;
                if (str == null) {
                    str = musicTrack.Fb();
                }
                failure.put(str, next);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        jgp jgpVar = failure;
        if (a != null) {
            jgpVar = jgp.b;
        }
        return jgpVar;
    }

    public final List<String> l() {
        Object failure;
        try {
            failure = this.a.J();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = EmptyList.b;
        }
        return (List) failure;
    }
}
