package xsna;

import android.net.Uri;
import android.util.SparseArray;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.moosic.VkMusicOldPlaylistEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ic50;
import xsna.w8b0;

/* compiled from: PlaylistOfflineInteractorImpl.kt */
/* loaded from: classes.dex */
public final class sbb0 implements rbb0 {
    public final ubb0 a;

    public sbb0(ubb0 ubb0Var) {
        this.a = ubb0Var;
    }

    @Override // xsna.rbb0
    public final void C(int i, ArrayList arrayList) {
        UserId c = o25.a().c();
        ubb0 ubb0Var = this.a;
        List list = (List) ubb0Var.b(new rs0(13, ubb0Var, c));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Playlist) it.next()).h;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        List list2 = (List) ubb0Var.b(new com.vk.movika.sdk.base.ui.l(18, ubb0Var, o25.a().c()));
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = ((Playlist) it2.next()).h;
            if (str2 != null) {
                arrayList3.add(str2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList) {
            VkMusicOldPlaylistEntity vkMusicOldPlaylistEntity = (VkMusicOldPlaylistEntity) obj;
            if (vkMusicOldPlaylistEntity.f()) {
                if (!arrayList3.contains(vkMusicOldPlaylistEntity.c())) {
                    arrayList4.add(obj);
                }
            } else if (!arrayList2.contains(vkMusicOldPlaylistEntity.c())) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(VkMusicOldPlaylistEntity.a.a((VkMusicOldPlaylistEntity) it3.next(), o25.a().c()));
        }
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(w8b0.a.a(o25.a().c(), (Playlist) it4.next(), DownloadingState.Downloaded.b, 0, 24));
        }
        ubb0Var.b(new g59(ubb0Var, arrayList6, i, 2));
    }

    @Override // xsna.rbb0
    public final void D(UserId userId, Playlist playlist) {
        ubb0 ubb0Var = this.a;
        ubb0Var.b(new w76(ubb0Var, userId, playlist, 4));
    }

    @Override // xsna.rbb0
    public final void L(int i, UserId userId, String str, String str2) {
        SparseArray<Uri> Fb;
        Uri uri;
        String uri2;
        ubb0 ubb0Var = this.a;
        List<Playlist> a = ubb0Var.a(userId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            Thumb thumb = ((Playlist) obj).m;
            if (thumb != null && (Fb = thumb.Fb()) != null && (uri = (Uri) zik0.b(Fb)) != null && (uri2 = uri.toString()) != null && drm0.D(uri2, str, false)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Playlist playlist = (Playlist) it.next();
            Thumb thumb2 = playlist.m;
            if (thumb2 != null) {
                SparseArray sparseArray = new SparseArray();
                int size = thumb2.Fb().size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = thumb2.Fb().keyAt(i2);
                    Uri valueAt = thumb2.Fb().valueAt(i2);
                    String path = valueAt.getPath();
                    if (path != null) {
                        if (brm0.B(path, str, false)) {
                            valueAt = Uri.fromFile(new File(brm0.y(path, str, str2)));
                        }
                        sparseArray.append(keyAt, valueAt);
                    }
                }
                ubb0Var.c.m(playlist.Ib(), Playlist.zb(playlist, new Thumb(thumb2.getId(), thumb2.getWidth(), thumb2.getHeight(), sparseArray), null, null, null, -2049, 255).e5().toString());
            }
        }
    }

    @Override // xsna.rbb0
    public final void a(String str) {
        ubb0 ubb0Var = this.a;
        ubb0Var.b(new com.vk.movika.sdk.base.ui.m(15, ubb0Var, str));
    }

    @Override // xsna.rbb0
    public final List<Playlist> b(UserId userId) {
        long j = userId.b;
        ubb0 ubb0Var = this.a;
        List<Playlist> list = (List) ubb0Var.b(new ie3(21, ubb0Var, userId));
        for (Playlist playlist : list) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.i;
                StringBuilder b = fp.b(j, "uid=", " query tracks of pid=");
                b.append(playlist.Ib());
                L.u(l, logType, new Object[]{"OfflineDbConn", b.toString()});
            }
            List D0 = j5g.D0(new wpg0(2), ubb0Var.b.y(String.valueOf(j), playlist.Ib()));
            ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
            Iterator it = D0.iterator();
            while (it.hasNext()) {
                arrayList.add(ic50.a.a((ic50) it.next()));
            }
            playlist.y = arrayList;
        }
        return list;
    }

    @Override // xsna.rbb0
    public final void c(UserId userId, Playlist playlist) {
        ubb0 ubb0Var = this.a;
        uab0 uab0Var = (uab0) ubb0Var.b(new svd(ubb0Var, userId, playlist, 8));
        w8b0 a = w8b0.a.a(userId, playlist, uab0Var != null ? uab0Var.a() : null, uab0Var != null ? uab0Var.b() : 0, 16);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " insert pid=" + a.i()});
        }
        ubb0Var.c.o(a);
    }

    @Override // xsna.rbb0
    public final int d(UserId userId) {
        return this.a.c.c(String.valueOf(userId.b));
    }

    @Override // xsna.rbb0
    public final int e(UserId userId) {
        return this.a.c.e(String.valueOf(userId.b));
    }

    @Override // xsna.rbb0
    public final List<Playlist> f(UserId userId) {
        return this.a.a(userId);
    }

    @Override // xsna.rbb0
    public final List<Playlist> g(UserId userId) {
        long j = userId.b;
        ubb0 ubb0Var = this.a;
        List<Playlist> list = (List) ubb0Var.b(new ww(18, ubb0Var, userId));
        for (Playlist playlist : list) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.i;
                StringBuilder b = fp.b(j, "uid=", " query tracks of pid=");
                b.append(playlist.Ib());
                L.u(l, logType, new Object[]{"OfflineDbConn", b.toString()});
            }
            List D0 = j5g.D0(new tbb0(0), ubb0Var.b.y(String.valueOf(j), playlist.Ib()));
            ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
            Iterator it = D0.iterator();
            while (it.hasNext()) {
                arrayList.add(ic50.a.a((ic50) it.next()));
            }
            playlist.y = arrayList;
        }
        return list;
    }

    @Override // xsna.rbb0
    public final Playlist h(UserId userId, String str) {
        long j = userId.b;
        ubb0 ubb0Var = this.a;
        Playlist playlist = (Playlist) ubb0Var.b(new t1h(ubb0Var, userId, str, 3));
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + " query tracks of pid=" + str});
        }
        if (playlist != null) {
            List D0 = j5g.D0(new k7q(1), ubb0Var.b.y(String.valueOf(j), str));
            ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
            Iterator it = D0.iterator();
            while (it.hasNext()) {
                arrayList.add(ic50.a.a((ic50) it.next()));
            }
            playlist.y = arrayList;
        }
        return playlist;
    }

    @Override // xsna.rbb0
    public final int i(UserId userId, String str) {
        ubb0 ubb0Var = this.a;
        return ((Number) ubb0Var.b(new og1(ubb0Var, userId, str, 5))).intValue();
    }

    @Override // xsna.rbb0
    public final List<Playlist> j(UserId userId) {
        long j = userId.b;
        ubb0 ubb0Var = this.a;
        List<Playlist> list = (List) ubb0Var.b(new pw(26, ubb0Var, userId));
        for (Playlist playlist : list) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.i;
                StringBuilder b = fp.b(j, "uid=", " query tracks of pid=");
                b.append(playlist.Ib());
                L.u(l, logType, new Object[]{"OfflineDbConn", b.toString()});
            }
            List D0 = j5g.D0(new wiu(2), ubb0Var.b.y(String.valueOf(j), playlist.Ib()));
            ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
            Iterator it = D0.iterator();
            while (it.hasNext()) {
                arrayList.add(ic50.a.a((ic50) it.next()));
            }
            playlist.y = arrayList;
        }
        return list;
    }

    @Override // xsna.rbb0
    public final void k(UserId userId, String str, Playlist playlist) {
        ubb0 ubb0Var = this.a;
        uab0 uab0Var = (uab0) ubb0Var.b(new k4w(ubb0Var, userId, str, playlist, 1));
        w8b0 a = w8b0.a.a(userId, playlist, uab0Var != null ? uab0Var.a() : null, uab0Var != null ? uab0Var.b() : 0, 16);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " insert pid=" + a.i()});
        }
        ubb0Var.c.o(a);
        ubb0Var.b.E(str, playlist.Ib());
    }

    @Override // xsna.rbb0
    public final List<MusicTrack> l(UserId userId, String str) {
        ubb0 ubb0Var = this.a;
        return (List) ubb0Var.b(new tbb(ubb0Var, userId, str, 5));
    }

    @Override // xsna.rbb0
    public final List<Playlist> m(UserId userId, String str) {
        ubb0 ubb0Var = this.a;
        return (List) ubb0Var.b(new wj9(ubb0Var, userId, str, 3));
    }
}
