package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.ic50;

/* compiled from: TrackOfflineRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class qgp0 implements w8i {
    public final cb50 b;
    public final j8b0 c;
    public final mm20 d;
    public final bpn0 e = new bpn0(new zkv(this, 6));
    public final bpn0 f = new bpn0(new mn8(11));

    public qgp0(cb50 cb50Var, j8b0 j8b0Var, mm20 mm20Var) {
        this.b = cb50Var;
        this.c = j8b0Var;
        this.d = mm20Var;
    }

    public final ArrayList a(final UserId userId, final boolean z) {
        List<ic50> list = (List) e(new gzs() { // from class: xsna.mgp0
            @Override // xsna.gzs
            public final Object invoke() {
                cb50 cb50Var = this.b;
                L l = L.a;
                l.getClass();
                boolean m = L.m(LoggerOutputTarget.NONE);
                boolean z2 = z;
                if (!m) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", zhy0.a("onlyDownloaded=", z2)});
                }
                UserId userId2 = userId;
                return z2 ? cb50Var.r(String.valueOf(userId2.b), e43.l(DownloadingState.Downloaded.b, DownloadingState.Corrupted.b)) : cb50Var.y(String.valueOf(userId2.b), "-2147483648");
            }
        });
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ic50 ic50Var : list) {
            arrayList.add(new Pair(ic50.a.a(ic50Var), Integer.valueOf(ic50Var.a())));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((MusicTrack) ((Pair) next).i()).Sb()) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list2 = (List) pair.d();
        List list3 = (List) pair.g();
        List D0 = j5g.D0(new si8(2), list2);
        ArrayList u0 = j5g.u0(j5g.D0(new pgp0(), list3), D0);
        ArrayList arrayList4 = new ArrayList(c5g.u(u0, 10));
        Iterator it2 = u0.iterator();
        while (it2.hasNext()) {
            arrayList4.add((MusicTrack) ((Pair) it2.next()).i());
        }
        return arrayList4;
    }

    public final hc50 b(UserId userId, MusicTrack musicTrack) {
        boolean c = c();
        cb50 cb50Var = this.b;
        if (!c) {
            return cb50Var.l(String.valueOf(userId.b), musicTrack.Fb());
        }
        hc50 l = cb50Var.l(String.valueOf(userId.b), musicTrack.Fb());
        if (l != null) {
            return l;
        }
        String str = musicTrack.Z;
        if (str != null) {
            return cb50Var.C(String.valueOf(userId.b), str);
        }
        return null;
    }

    public final boolean c() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final int d(UserId userId, MusicTrack musicTrack, String str) {
        return ((Number) e(new l6f(this, userId, musicTrack, str, 1))).intValue();
    }

    public final <T> T e(gzs<? extends T> gzsVar) {
        if (!((com.vk.music.pref.a) this.e.getValue()).O()) {
            this.d.a();
        }
        return gzsVar.invoke();
    }
}
