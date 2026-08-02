package xsna;

import android.net.Uri;
import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AudioLoudness;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.moosic.VkMusicOldPlaylistEntity;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.c6v0;
import xsna.hc50;
import xsna.kb50;

/* compiled from: TrackOfflineInteractorImpl.kt */
/* loaded from: classes.dex */
public final class lgp0 implements kgp0 {
    public final qgp0 a;

    public lgp0(qgp0 qgp0Var) {
        this.a = qgp0Var;
    }

    @Override // xsna.kgp0
    public final void E(int i, UserId userId, String str, String str2) {
        String str3 = str;
        qgp0 qgp0Var = this.a;
        for (MusicTrack musicTrack : (List) qgp0Var.e(new b44(qgp0Var, userId, str3, 4))) {
            Thumb Jb = musicTrack.Jb();
            if (Jb != null) {
                SparseArray sparseArray = new SparseArray();
                int size = Jb.Fb().size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = Jb.Fb().keyAt(i2);
                    Uri valueAt = Jb.Fb().valueAt(i2);
                    String path = valueAt.getPath();
                    if (path != null) {
                        if (brm0.B(path, str3, false)) {
                            valueAt = Uri.fromFile(new File(brm0.y(path, str3, str2)));
                        }
                        sparseArray.append(keyAt, valueAt);
                    }
                }
                qgp0Var.b.F(musicTrack.Fb(), MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, null, false, false, new Thumb(Jb.getId(), Jb.getWidth(), Jb.getHeight(), sparseArray), null, null, -1, 1044479).e5().toString());
            }
            str3 = str;
        }
    }

    @Override // xsna.kgp0
    public final void I(UserId userId, ArrayList arrayList) {
        AudioLoudness audioLoudness;
        Object obj;
        qgp0 qgp0Var = this.a;
        for (Iterator it = ((List) qgp0Var.e(new ww(22, qgp0Var, userId))).iterator(); it.hasNext(); it = it) {
            MusicTrack musicTrack = (MusicTrack) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                audioLoudness = null;
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (epx.f(musicTrack.Fb(), ((MusicTrack) obj).Fb())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MusicTrack musicTrack2 = (MusicTrack) obj;
            if (musicTrack2 != null) {
                audioLoudness = musicTrack2.a0;
            }
            qgp0Var.b.F(musicTrack.Fb(), MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, null, false, false, null, null, audioLoudness, -1, 524287).e5().toString());
        }
    }

    @Override // xsna.kgp0
    public final List<MusicTrack> a() {
        qgp0 qgp0Var = this.a;
        if (!((com.vk.music.pref.a) qgp0Var.e.getValue()).O()) {
            qgp0Var.d.a();
        }
        L.p("OfflineDbConn");
        List<hc50> a = qgp0Var.b.a();
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(hc50.a.a((hc50) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.kgp0
    public final void b(final UserId userId, MusicTrack musicTrack, final String str, boolean z, String str2, CorruptedReason corruptedReason) {
        qgp0 qgp0Var = this.a;
        cb50 cb50Var = qgp0Var.b;
        final MusicOfflineCacheStorage musicOfflineCacheStorage = (MusicOfflineCacheStorage) qgp0Var.e(new fw00(qgp0Var, musicTrack, userId, 4));
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " query manifest of mid=" + musicTrack.Fb()});
        }
        final kb50 a = kb50.a.a(userId, musicTrack, z, musicOfflineCacheStorage, str2 == null ? cb50Var.h(String.valueOf(o25.a().c().b), musicTrack.Fb()) : str2, (corruptedReason == null || musicOfflineCacheStorage != MusicOfflineCacheStorage.SD_CARD || musicOfflineCacheStorage.l()) ? corruptedReason : CorruptedReason.SD_CARD, 0, 64);
        L.n("OfflineDbConn", new gzs() { // from class: xsna.ngp0
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("uid=");
                sb.append(UserId.this.b);
                sb.append(" save track mid=");
                kb50 kb50Var = a;
                sb.append(kb50Var.o());
                sb.append("; pid=");
                String str3 = str;
                if (str3 == null) {
                    str3 = "-2147483648";
                }
                sb.append(str3);
                sb.append("; storage=");
                sb.append(musicOfflineCacheStorage);
                sb.append("; downloadingState=");
                sb.append(kb50Var.f());
                return sb.toString();
            }
        });
        cb50Var.s(a, str == null ? "-2147483648" : str);
    }

    @Override // xsna.kgp0
    public final void c(String str, MusicOfflineCacheStorage musicOfflineCacheStorage) {
        qgp0 qgp0Var = this.a;
        qgp0Var.e(new j6k(qgp0Var, str, musicOfflineCacheStorage, 6));
    }

    @Override // xsna.kgp0
    public final MusicOfflineCacheStorage d(String str) {
        qgp0 qgp0Var = this.a;
        return (MusicOfflineCacheStorage) qgp0Var.e(new com.vk.catalog2.common.ui.holders.a(29, qgp0Var, str));
    }

    @Override // xsna.kgp0
    public final MusicOfflineCacheStorage e() {
        qgp0 qgp0Var = this.a;
        if (!((com.vk.music.pref.a) qgp0Var.e.getValue()).O()) {
            qgp0Var.d.a();
        }
        L.p("OfflineDbConn");
        return qgp0Var.b.e();
    }

    @Override // xsna.kgp0
    public final int g(UserId userId) {
        qgp0 qgp0Var = this.a;
        return ((Number) qgp0Var.e(new com.vk.movika.sdk.base.logic.interactor.c(25, qgp0Var, userId))).intValue();
    }

    @Override // xsna.kgp0
    public final io.reactivex.rxjava3.core.x h(ArrayList arrayList) {
        qgp0 qgp0Var = this.a;
        if (!((com.vk.music.pref.a) qgp0Var.e.getValue()).O()) {
            qgp0Var.d.a();
        }
        return qgp0Var.b.f(arrayList, DownloadingState.Corrupted.b);
    }

    @Override // xsna.kgp0
    public final void i(UserId userId, MusicTrack musicTrack, String str) {
        qgp0 qgp0Var = this.a;
        hc50 hc50Var = (hc50) qgp0Var.e(new t1h(qgp0Var, userId, musicTrack, 4));
        if (hc50Var == null) {
            return;
        }
        cb50 cb50Var = qgp0Var.b;
        String valueOf = String.valueOf(userId.b);
        String b = qgp0Var.c() ? hc50Var.b() : musicTrack.Fb();
        if (str == null) {
            str = "-2147483648";
        }
        cb50Var.n(new ufb0(valueOf, b, str));
    }

    @Override // xsna.kgp0
    public final int j(UserId userId) {
        int g5 = DownloadingState.Downloaded.b.g5();
        qgp0 qgp0Var = this.a;
        return ((Number) qgp0Var.e(new gu60(qgp0Var, userId, g5, 1))).intValue();
    }

    @Override // xsna.kgp0
    public final List<MusicTrack> k(UserId userId, boolean z) {
        return this.a.a(userId, z);
    }

    @Override // xsna.kgp0
    public final String l(String str) {
        qgp0 qgp0Var = this.a;
        return (String) qgp0Var.e(new com.vk.movika.sdk.base.ui.r0(27, qgp0Var, str));
    }

    @Override // xsna.kgp0
    public final int m(UserId userId, MusicTrack musicTrack, String str) {
        return this.a.d(userId, musicTrack, str);
    }

    @Override // xsna.kgp0
    public final void n(final MusicTrack musicTrack, final CorruptedReason corruptedReason) {
        final int a = DownloadingState.a.a(DownloadingState.Corrupted.b);
        final qgp0 qgp0Var = this.a;
        qgp0Var.e(new gzs() { // from class: xsna.ogp0
            @Override // xsna.gzs
            public final Object invoke() {
                L l = L.a;
                l.getClass();
                boolean m = L.m(LoggerOutputTarget.NONE);
                MusicTrack musicTrack2 = musicTrack;
                int i = a;
                if (!m) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "mid=" + musicTrack2.Fb() + " downloadingState=" + i});
                }
                qgp0.this.b.x(i, corruptedReason.h(), musicTrack2.Fb());
                return s3q0.a;
            }
        });
    }

    @Override // xsna.kgp0
    public final void o(UserId userId, String str, String str2) {
        qgp0 qgp0Var = this.a;
        qgp0Var.e(new m1l0(1, userId, qgp0Var, str, str2));
    }

    @Override // xsna.kgp0
    public final List<MusicTrack> p(UserId userId, List<String> list) {
        qgp0 qgp0Var = this.a;
        List list2 = (List) qgp0Var.e(new com.vk.movika.sdk.base.logic.interactor.n(list, qgp0Var, userId, 5));
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(hc50.a.a((hc50) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.kgp0
    public final int q(UserId userId, String str, List list) {
        qgp0 qgp0Var = this.a;
        return ((Number) qgp0Var.e(new fms(list, userId, str, qgp0Var, 1))).intValue();
    }

    @Override // xsna.kgp0
    public final List<MusicTrack> r(UserId userId, List<String> list) {
        qgp0 qgp0Var = this.a;
        List list2 = (List) qgp0Var.e(new kfb(list, qgp0Var, userId, 7));
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(hc50.a.a((hc50) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.kgp0
    public final MusicTrack s(UserId userId, String str) {
        qgp0 qgp0Var = this.a;
        hc50 hc50Var = (hc50) qgp0Var.e(new k14(qgp0Var, userId, str, 8));
        if (hc50Var == null) {
            return null;
        }
        return hc50.a.a(hc50Var);
    }

    @Override // xsna.kgp0
    public final void t(String str, DownloadingState downloadingState) {
        int a = DownloadingState.a.a(downloadingState);
        qgp0 qgp0Var = this.a;
        qgp0Var.e(new j7t(qgp0Var, str, a, 1));
    }

    @Override // xsna.kgp0
    public final void v(int i, LinkedHashMap linkedHashMap, Map map) {
        Integer valueOf;
        cb50 cb50Var = this.a.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            c6v0 c6v0Var = (c6v0) entry.getValue();
            MusicTrack musicTrack = (MusicTrack) linkedHashMap.get(str);
            if (musicTrack != null) {
                Serializer.c<MusicTrack> cVar = MusicTrack.CREATOR;
                String a = MusicTrack.a.a(-c6v0Var.c(), o25.a().c());
                UserId c = o25.a().c();
                String a2 = MusicTrack.a.a(-c6v0Var.c(), c);
                String Fb = musicTrack.Fb();
                long j = c.b;
                hc50 l = cb50Var.l(String.valueOf(j), a2);
                Integer valueOf2 = l != null ? Integer.valueOf(l.a()) : null;
                if (valueOf2 != null) {
                    valueOf = valueOf2;
                } else {
                    hc50 l2 = cb50Var.l(String.valueOf(j), Fb);
                    valueOf = l2 != null ? Integer.valueOf(l2.a()) : null;
                    if (valueOf == null) {
                        valueOf = null;
                    }
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if (!linkedHashSet.contains(valueOf)) {
                        linkedHashSet.add(valueOf);
                        kb50 a3 = kb50.a.a(o25.a().c(), c6v0.a.c(c6v0Var, musicTrack, i, str), true, MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL, null, null, intValue, 32);
                        arrayList.add(a3);
                        q2z.a(a, a3.o(), arrayList2);
                    }
                }
            }
        }
        cb50Var.u(arrayList, arrayList2, null);
    }

    @Override // xsna.kgp0
    public final int w(UserId userId, String str, List list) {
        char c;
        ArrayList arrayList;
        ArrayList arrayList2;
        char c2;
        ArrayList arrayList3;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        MusicTrack musicTrack;
        boolean z;
        String str3;
        qgp0 qgp0Var = this.a;
        List list2 = (List) qgp0Var.e(new gs1(qgp0Var, userId, str, 5));
        ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList4.add(((MusicTrack) it.next()).Fb());
        }
        if (!((com.vk.music.pref.a) qgp0Var.e.getValue()).O()) {
            qgp0Var.d.a();
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list2) {
            if (((MusicTrack) obj4).W != null) {
                arrayList5.add(obj4);
            }
        }
        List list3 = list;
        ArrayList arrayList6 = new ArrayList(c5g.u(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((MusicTrack) it2.next()).Fb());
        }
        ArrayList arrayList7 = new ArrayList(c5g.u(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList7.add(((MusicTrack) it3.next()).Z);
        }
        ArrayList arrayList8 = new ArrayList(c5g.u(list3, 10));
        Iterator it4 = list3.iterator();
        while (true) {
            c = '_';
            if (!it4.hasNext()) {
                break;
            }
            MusicTrack musicTrack2 = (MusicTrack) it4.next();
            StringBuilder sb = new StringBuilder();
            String str4 = musicTrack2.d;
            if (str4 != null) {
                bpn0 bpn0Var = cqm0.a;
            } else {
                str4 = null;
            }
            sb.append(str4);
            sb.append('_');
            sb.append(musicTrack2.f);
            arrayList8.add(sb.toString());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            MusicTrack musicTrack3 = (MusicTrack) it5.next();
            if (arrayList6.contains(musicTrack3.Fb()) || (str2 = musicTrack3.d) == null || str2.length() == 0) {
                arrayList = arrayList9;
                arrayList2 = arrayList8;
                c2 = c;
                arrayList3 = arrayList10;
            } else {
                String str5 = musicTrack3.d + c + musicTrack3.f;
                String str6 = musicTrack3.d + c + (musicTrack3.f - 1);
                StringBuilder sb2 = new StringBuilder();
                boolean z2 = true;
                sb2.append(musicTrack3.d);
                sb2.append('_');
                sb2.append(musicTrack3.f + 1);
                String sb3 = sb2.toString();
                j9x it6 = e43.g(arrayList7).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    int intValue = ((Number) obj).intValue();
                    String str7 = (String) arrayList7.get(intValue);
                    if (str7 != null && str7.equals(musicTrack3.Fb()) && !linkedHashSet.contains(Integer.valueOf(intValue))) {
                        break;
                    }
                }
                Integer num = (Integer) obj;
                j9x it7 = e43.g(arrayList7).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next = it7.next();
                    int intValue2 = ((Number) next).intValue();
                    j9x j9xVar = it7;
                    String str8 = (String) arrayList7.get(intValue2);
                    if (str8 != null && (str3 = musicTrack3.Z) != null) {
                        boolean equals = str3.equals(str8);
                        z = z2;
                        if (equals == z && !linkedHashSet.contains(Integer.valueOf(intValue2))) {
                            obj2 = next;
                            break;
                        }
                    } else {
                        z = z2;
                    }
                    z2 = z;
                    it7 = j9xVar;
                }
                Integer num2 = (Integer) obj2;
                j9x it8 = e43.g(arrayList8).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it8.next();
                    j9x j9xVar2 = it8;
                    int intValue3 = ((Number) obj3).intValue();
                    String str9 = (String) arrayList8.get(intValue3);
                    if ((epx.f(str9, str5) || epx.f(str9, str6) || epx.f(str9, sb3)) && !linkedHashSet.contains(Integer.valueOf(intValue3))) {
                        break;
                    }
                    it8 = j9xVar2;
                }
                Integer num3 = (Integer) obj3;
                if (num != null) {
                    num3 = num;
                } else if (num2 != null) {
                    num3 = num2;
                }
                if (num3 != null && (musicTrack = (MusicTrack) j5g.b0(num3.intValue(), list)) != null && !linkedHashSet.contains(num3)) {
                    linkedHashSet.add(num3);
                    if (arrayList4.contains(musicTrack.Fb())) {
                        q2z.a(musicTrack3.Fb(), musicTrack.Fb(), arrayList10);
                    } else {
                        arrayList3 = arrayList10;
                        arrayList = arrayList9;
                        arrayList2 = arrayList8;
                        c2 = '_';
                        kb50 a = kb50.a.a(userId, MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, DownloadingState.Downloaded.b, false, false, null, musicTrack3.W, null, -1, 1015803), false, null, null, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        arrayList.add(a);
                        q2z.a(musicTrack3.Fb(), a.o(), arrayList3);
                    }
                }
                c = '_';
            }
            arrayList10 = arrayList3;
            arrayList9 = arrayList;
            arrayList8 = arrayList2;
            c = c2;
        }
        ArrayList arrayList11 = arrayList10;
        qgp0Var.b.u(arrayList9, arrayList11, str == null ? "-2147483648" : str);
        return arrayList11.size();
    }

    @Override // xsna.kgp0
    public final void z(int i, Map map, Map map2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, Set set, Set set2) {
        char c;
        String sb;
        String sb2;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        UserId c2 = o25.a().c();
        qgp0 qgp0Var = this.a;
        ArrayList a = qgp0Var.a(c2, false);
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            String str = ((MusicTrack) it.next()).d;
            if (str != null) {
                arrayList.add(str);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            c6v0 c6v0Var = (c6v0) entry.getValue();
            Object obj = map2.get(str2);
            MusicTrack musicTrack = (MusicTrack) obj;
            MusicTrack musicTrack2 = (MusicTrack) ((musicTrack == null || musicTrack.b != 0) ? obj : null);
            MusicTrack c3 = musicTrack2 != null ? c6v0.a.c(c6v0Var, musicTrack2, i, str2) : c6v0.a.b(c6v0Var, o25.a().c(), i, str2);
            List<Integer> d = c6v0Var.d();
            if (!(d instanceof Collection) || !d.isEmpty()) {
                Iterator<T> it2 = d.iterator();
                while (it2.hasNext()) {
                    if (linkedHashMap.get(Integer.valueOf(((Number) it2.next()).intValue())) != null) {
                        break;
                    }
                }
            }
            List<Integer> a2 = c6v0Var.a();
            if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                Iterator<T> it3 = a2.iterator();
                while (it3.hasNext()) {
                    if (linkedHashMap2.get(Integer.valueOf(((Number) it3.next()).intValue())) != null) {
                        break;
                    }
                }
            }
            if ((c3.U || c6v0.a.a(c6v0Var)) && !j5g.P(arrayList, c3.d)) {
                qgp0Var.e(new com.vk.movika.sdk.base.ui.r(21, qgp0Var, kb50.a.a(o25.a().c(), c3, true, MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL, null, null, 0, 96)));
                linkedHashMap5.put(Integer.valueOf(c6v0Var.c()), c3);
                linkedHashMap6.put(Integer.valueOf(c6v0Var.c()), c6v0Var);
            } else {
                List<Integer> d2 = c6v0Var.d();
                if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                    Iterator<T> it4 = d2.iterator();
                    while (it4.hasNext()) {
                        if (set.contains(Integer.valueOf(((Number) it4.next()).intValue()))) {
                            break;
                        }
                    }
                }
                List<Integer> a3 = c6v0Var.a();
                if (!(a3 instanceof Collection) || !a3.isEmpty()) {
                    Iterator<T> it5 = a3.iterator();
                    while (it5.hasNext()) {
                        if (set2.contains(Integer.valueOf(((Number) it5.next()).intValue()))) {
                            break;
                        }
                    }
                }
                if (!j5g.P(arrayList, c3.d)) {
                    qgp0Var.e(new com.vk.movika.sdk.base.ui.r(21, qgp0Var, kb50.a.a(o25.a().c(), c3, true, MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL, null, null, 0, 96)));
                    linkedHashMap5.put(Integer.valueOf(c6v0Var.c()), c3);
                    linkedHashMap6.put(Integer.valueOf(c6v0Var.c()), c6v0Var);
                }
            }
        }
        cb50 cb50Var = qgp0Var.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String valueOf = String.valueOf(o25.a().c().b);
        Iterator it6 = linkedHashMap.entrySet().iterator();
        while (true) {
            c = '_';
            if (!it6.hasNext()) {
                break;
            }
            VkMusicOldPlaylistEntity vkMusicOldPlaylistEntity = (VkMusicOldPlaylistEntity) ((Map.Entry) it6.next()).getValue();
            List<Integer> e = vkMusicOldPlaylistEntity.e();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it7 = e.iterator();
            while (it7.hasNext()) {
                MusicTrack musicTrack3 = (MusicTrack) linkedHashMap5.get(Integer.valueOf(((Number) it7.next()).intValue()));
                String Fb = musicTrack3 != null ? musicTrack3.Fb() : null;
                if (Fb != null) {
                    arrayList2.add(Fb);
                }
            }
            Playlist playlist = (Playlist) linkedHashMap3.get(Integer.valueOf(vkMusicOldPlaylistEntity.d()));
            if (playlist == null || (sb2 = playlist.Ib()) == null) {
                StringBuilder b = v1v.b(valueOf, '_');
                b.append(vkMusicOldPlaylistEntity.d());
                sb2 = b.toString();
            }
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                String str3 = (String) it8.next();
                linkedHashSet.add(str3);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", y57.a("insert playlist pid=", sb2, "; mid=", str3)});
                }
                cb50Var.n(new ufb0(valueOf, str3, sb2));
            }
        }
        Iterator it9 = linkedHashMap2.entrySet().iterator();
        while (it9.hasNext()) {
            VkMusicOldPlaylistEntity vkMusicOldPlaylistEntity2 = (VkMusicOldPlaylistEntity) ((Map.Entry) it9.next()).getValue();
            List<Integer> e2 = vkMusicOldPlaylistEntity2.e();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it10 = e2.iterator();
            while (it10.hasNext()) {
                MusicTrack musicTrack4 = (MusicTrack) linkedHashMap5.get(Integer.valueOf(((Number) it10.next()).intValue()));
                String Fb2 = musicTrack4 != null ? musicTrack4.Fb() : null;
                if (Fb2 != null) {
                    arrayList3.add(Fb2);
                }
            }
            Playlist playlist2 = (Playlist) linkedHashMap4.get(Integer.valueOf(vkMusicOldPlaylistEntity2.d()));
            if (playlist2 == null || (sb = playlist2.Ib()) == null) {
                StringBuilder b2 = v1v.b(valueOf, c);
                b2.append(vkMusicOldPlaylistEntity2.d());
                sb = b2.toString();
            }
            Iterator it11 = arrayList3.iterator();
            while (it11.hasNext()) {
                String str4 = (String) it11.next();
                linkedHashSet.add(str4);
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.i, new Object[]{"OfflineDbConn", y57.a("insert album pid=", sb, "; mid=", str4)});
                }
                cb50Var.n(new ufb0(valueOf, str4, sb));
                c = '_';
            }
        }
        for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            MusicTrack musicTrack5 = (MusicTrack) entry2.getValue();
            c6v0 c6v0Var2 = (c6v0) linkedHashMap6.get(Integer.valueOf(intValue));
            if (c6v0Var2 != null && (musicTrack5.U || c6v0.a.a(c6v0Var2) || !linkedHashSet.contains(musicTrack5.Fb()))) {
                if (!j5g.P(arrayList, musicTrack5.d)) {
                    L l3 = L.a;
                    l3.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l3, L.LogType.i, new Object[]{"OfflineDbConn", "insert to mine mid=" + musicTrack5.Fb()});
                    }
                    cb50Var.n(new ufb0(valueOf, musicTrack5.Fb(), "-2147483648"));
                }
            }
        }
    }
}
