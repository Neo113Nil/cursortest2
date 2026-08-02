package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.b6v0;
import xsna.xsp;

/* compiled from: EpisodeOfflineInteractorImpl.kt */
/* loaded from: classes.dex */
public final class dtp implements ctp {
    public final usp a;

    public dtp(usp uspVar) {
        this.a = uspVar;
    }

    @Override // xsna.ctp
    public final void t(int i, UserId userId, String str, ArrayList arrayList) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", uq.b(arrayList, fp.b(j, "uid=", ", count="))});
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MusicTrack a = b6v0.a.a((b6v0) it.next(), i);
            if (a != null) {
                arrayList2.add(a);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(xsp.a.a(userId, (MusicTrack) it2.next(), true, MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL, null));
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new rjb0(String.valueOf(j), ((xsp) it3.next()).j(), str));
        }
        usp uspVar = this.a;
        uspVar.i(arrayList3);
        uspVar.c(arrayList4);
    }

    @Override // xsna.ctp
    public final void u(UserId userId, MusicTrack musicTrack, UserId userId2) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.i;
            StringBuilder b = fp.b(j, "uid=", ", mid=");
            b.append(musicTrack.Fb());
            L.u(l, logType, new Object[]{"OfflineDbConn", b.toString()});
        }
        String Fb = musicTrack.Fb();
        usp uspVar = this.a;
        uspVar.o(xsp.a.a(userId, musicTrack, false, uspVar.d(Fb), uspVar.a(String.valueOf(o25.a().c().b), musicTrack.Fb())));
        uspVar.b(new rjb0(String.valueOf(j), musicTrack.Fb(), String.valueOf(userId2.b)));
    }

    @Override // xsna.ctp
    public final String v(String str) {
        return this.a.a(String.valueOf(o25.a().c().b), str);
    }

    @Override // xsna.ctp
    public final void w(UserId userId, String str, String str2) {
        this.a.h(String.valueOf(userId.b), str, str2);
    }

    @Override // xsna.ctp
    public final void x(String str, DownloadingState downloadingState) {
        int a = DownloadingState.a.a(downloadingState);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", zil0.a(a, "mid=", str, ", downloadingState=")});
        }
        this.a.k(a, str);
    }

    @Override // xsna.ctp
    public final List y(UserId userId, ArrayList arrayList) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + ", size=" + arrayList.size()});
        }
        ArrayList v = c5g.v(j5g.V0(arrayList, 512, 512, true, new ij8(13, this, userId)));
        ArrayList arrayList2 = new ArrayList(c5g.u(v, 10));
        Iterator it = v.iterator();
        while (it.hasNext()) {
            arrayList2.add(xsp.a.b((xsp) it.next()));
        }
        return arrayList2;
    }

    @Override // xsna.ctp
    public final MusicTrack z(UserId userId, String str) {
        long j = userId.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + j + ", mid=" + str});
        }
        String valueOf = String.valueOf(j);
        usp uspVar = this.a;
        xsp m = uspVar.m(valueOf, str);
        if (m != null) {
            uspVar.e(String.valueOf(j), str);
        }
        if (m != null) {
            return xsp.a.b(m);
        }
        return null;
    }
}
