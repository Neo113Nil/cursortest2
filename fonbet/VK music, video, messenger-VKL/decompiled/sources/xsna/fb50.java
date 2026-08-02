package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Thumb;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MusicTrackDao_Impl.kt */
/* loaded from: classes.dex */
public final class fb50 implements cb50 {
    public final RoomDatabase a;
    public final a b = new a();
    public final b c = new b();

    /* compiled from: MusicTrackDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            kb50 kb50Var = (kb50) obj;
            qyg0Var.bindLong(1, kb50Var.i());
            qyg0Var.D3(2, String.valueOf(kb50Var.v().b));
            qyg0Var.D3(3, kb50Var.o());
            String a = kb50Var.a();
            if (a == null) {
                qyg0Var.bindNull(4);
            } else {
                qyg0Var.D3(4, a);
            }
            String u = kb50Var.u();
            if (u == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.D3(5, u);
            }
            qyg0Var.bindLong(6, DownloadingState.a.a(kb50Var.f()));
            String t = kb50Var.t();
            if (t == null) {
                qyg0Var.bindNull(7);
            } else {
                qyg0Var.D3(7, t);
            }
            String r = kb50Var.r();
            if (r == null) {
                qyg0Var.bindNull(8);
            } else {
                qyg0Var.D3(8, r);
            }
            String b = kb50Var.b();
            if (b == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.D3(9, b);
            }
            List<Artist> l = kb50Var.l();
            String jSONArray = l != null ? kvf.a(l).toString() : null;
            if (jSONArray == null) {
                qyg0Var.bindNull(10);
            } else {
                qyg0Var.D3(10, jSONArray);
            }
            List<Artist> h = kb50Var.h();
            String jSONArray2 = h != null ? kvf.a(h).toString() : null;
            if (jSONArray2 == null) {
                qyg0Var.bindNull(11);
            } else {
                qyg0Var.D3(11, jSONArray2);
            }
            Thumb s = kb50Var.s();
            String jSONObject = s == null ? null : s.e5().toString();
            if (jSONObject == null) {
                qyg0Var.bindNull(12);
            } else {
                qyg0Var.D3(12, jSONObject);
            }
            MusicOfflineCacheStorage q = kb50Var.q();
            String name = q != null ? q.name() : null;
            if (name == null) {
                qyg0Var.bindNull(13);
            } else {
                qyg0Var.D3(13, name);
            }
            String w = kb50Var.w();
            if (w == null) {
                qyg0Var.bindNull(14);
            } else {
                qyg0Var.D3(14, w);
            }
            String n = kb50Var.n();
            if (n == null) {
                qyg0Var.bindNull(15);
            } else {
                qyg0Var.D3(15, n);
            }
            CorruptedReason d = kb50Var.d();
            if ((d == null ? null : Integer.valueOf(d.h())) == null) {
                qyg0Var.bindNull(16);
            } else {
                qyg0Var.bindLong(16, r0.intValue());
            }
            Long g = kb50Var.g();
            if (g == null) {
                qyg0Var.bindNull(17);
            } else {
                qyg0Var.bindLong(17, g.longValue());
            }
            Long e = kb50Var.e();
            if (e == null) {
                qyg0Var.bindNull(18);
            } else {
                qyg0Var.bindLong(18, e.longValue());
            }
            qyg0Var.bindLong(19, kb50Var.x() ? 1L : 0L);
            if (kb50Var.k() == null) {
                qyg0Var.bindNull(20);
            } else {
                qyg0Var.bindLong(20, r0.intValue());
            }
            Boolean y = kb50Var.y();
            if ((y != null ? Integer.valueOf(y.booleanValue() ? 1 : 0) : null) == null) {
                qyg0Var.bindNull(21);
            } else {
                qyg0Var.bindLong(21, r1.intValue());
            }
            String m = kb50Var.m();
            if (m == null) {
                qyg0Var.bindNull(22);
            } else {
                qyg0Var.D3(22, m);
            }
            qyg0Var.bindLong(23, kb50Var.c());
            qyg0Var.D3(24, kb50Var.j());
            String p = kb50Var.p();
            if (p == null) {
                qyg0Var.bindNull(25);
            } else {
                qyg0Var.D3(25, p);
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `audio_track` (`id`,`uid`,`mid`,`access_key`,`track_code`,`downloading_state`,`title`,`subtitle`,`artist_name_fallback`,`main_artists`,`featured_artists`,`thumb`,`storage`,`url`,`manifest_url`,`corrupted_reason`,`duration`,`date`,`is_explicit`,`lyrics_id`,`is_focus_track`,`main_color`,`content_restriction`,`json_raw`,`release_audio_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: MusicTrackDao_Impl.kt */
    public static final class b extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            ufb0 ufb0Var = (ufb0) obj;
            qyg0Var.D3(1, ufb0Var.c());
            qyg0Var.D3(2, ufb0Var.a());
            qyg0Var.D3(3, ufb0Var.b());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `playlists_to_tracks` (`uid`,`music_track_id`,`playlist_id`) VALUES (?,?,?)";
        }
    }

    public fb50(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static int I(fb50 fb50Var, String str, String str2, String str3) {
        return super.B(str, str2, str3);
    }

    public static s3q0 J(fb50 fb50Var, kb50 kb50Var, String str) {
        super.s(kb50Var, str);
        return s3q0.a;
    }

    public static s3q0 K(fb50 fb50Var, ArrayList arrayList, ArrayList arrayList2, String str) {
        super.u(arrayList, arrayList2, str);
        return s3q0.a;
    }

    public static int L(fb50 fb50Var, String str, ArrayList arrayList, String str2) {
        return super.m(str, str2, arrayList);
    }

    @Override // xsna.cb50
    public final void A(String str, String str2, String str3) {
        u370.f(this.a, false, true, new lf3(str2, str, str3, 6));
    }

    @Override // xsna.cb50
    public final int B(String str, String str2, String str3) {
        return ((Number) u370.f(this.a, false, true, new eb50(this, str, str2, str3, 0))).intValue();
    }

    @Override // xsna.cb50
    public final hc50 C(String str, String str2) {
        return (hc50) u370.f(this.a, true, false, new ll1(str, str2, this, 16));
    }

    @Override // xsna.cb50
    public final void D(kb50 kb50Var) {
        u370.f(this.a, false, true, new defpackage.s(22, this, kb50Var));
    }

    @Override // xsna.cb50
    public final void E(String str, String str2) {
        u370.f(this.a, false, true, new mf5(str2, str, 1));
    }

    @Override // xsna.cb50
    public final void F(String str, String str2) {
        u370.f(this.a, false, true, new cq3(22, str2, str));
    }

    @Override // xsna.cb50
    public final int G(String str) {
        return ((Number) u370.f(this.a, true, false, new ugm(str, 29))).intValue();
    }

    @Override // xsna.cb50
    public final void H(ArrayList arrayList) {
        u370.f(this.a, false, true, new hn0(18, this, arrayList));
    }

    @Override // xsna.cb50
    public final List<hc50> a() {
        return (List) u370.f(this.a, true, false, new t3v(this, 6));
    }

    @Override // xsna.cb50
    public final int b(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new ml1(13, str, str2))).intValue();
    }

    @Override // xsna.cb50
    public final void c(String str, String str2, String str3) {
        u370.f(this.a, false, true, new iu9(str3, str, str2, 6));
    }

    @Override // xsna.cb50
    public final MusicOfflineCacheStorage d(String str) {
        return (MusicOfflineCacheStorage) u370.f(this.a, true, false, new nf5(str, this));
    }

    @Override // xsna.cb50
    public final MusicOfflineCacheStorage e() {
        return (MusicOfflineCacheStorage) u370.f(this.a, true, false, new azt(this, 13));
    }

    @Override // xsna.cb50
    public final io.reactivex.rxjava3.internal.operators.single.b f(ArrayList arrayList, DownloadingState downloadingState) {
        StringBuilder e = fw3.e("\n        SELECT mid\n        FROM audio_track \n        WHERE downloading_state = ?\n        AND mid IN (");
        e370.c(arrayList.size(), e);
        e.append(")");
        e.append("\n");
        e.append("    ");
        return mvg0.d(this.a, false, new f55(e.toString(), this, downloadingState, arrayList));
    }

    @Override // xsna.cb50
    public final void g() {
        u370.f(this.a, false, true, new u620(7));
    }

    @Override // xsna.cb50
    public final String h(String str, String str2) {
        return (String) u370.f(this.a, true, false, new qd1(24, str, str2));
    }

    @Override // xsna.cb50
    public final void i(String str, String str2) {
        u370.f(this.a, false, true, new bi0(25, str2, str));
    }

    @Override // xsna.cb50
    public final void j(ArrayList arrayList) {
        u370.f(this.a, false, true, new defpackage.c(24, this, arrayList));
    }

    @Override // xsna.cb50
    public final int k(String str, String str2, String str3) {
        return ((Number) u370.f(this.a, false, true, new rr3(str, str2, str3, 3))).intValue();
    }

    @Override // xsna.cb50
    public final hc50 l(String str, String str2) {
        return (hc50) u370.f(this.a, true, false, new jzq(str, str2, this));
    }

    @Override // xsna.cb50
    public final int m(String str, String str2, ArrayList arrayList) {
        return ((Number) u370.f(this.a, false, true, new ztj(this, str, arrayList, str2, 2))).intValue();
    }

    @Override // xsna.cb50
    public final void n(ufb0 ufb0Var) {
        u370.f(this.a, false, true, new tn0(17, this, ufb0Var));
    }

    @Override // xsna.cb50
    public final void o(String str, String str2) {
        u370.f(this.a, false, true, new wqb(15, str2, str));
    }

    @Override // xsna.cb50
    public final void p() {
        u370.f(this.a, false, true, new irt(5));
    }

    @Override // xsna.cb50
    public final void q(int i, String str) {
        u370.f(this.a, false, true, new yl9(i, str, 1));
    }

    @Override // xsna.cb50
    public final List r(String str, List list) {
        StringBuilder e = fw3.e("\n        SELECT \n            audio_track.id, \n            audio_track.uid, \n            audio_track.mid, \n            audio_track.downloading_state, \n            audio_track.json_raw,\n            playlists_to_tracks.rowid\n        FROM audio_track\n        INNER JOIN playlists_to_tracks \n        ON audio_track.mid = playlists_to_tracks.music_track_id \n        AND audio_track.uid = playlists_to_tracks.uid\n        WHERE audio_track.uid = ? \n        AND audio_track.downloading_state IN (");
        int size = list.size();
        e370.c(size, e);
        e.append(") ");
        e.append("\n");
        e.append("        AND  playlists_to_tracks.playlist_id = ");
        return (List) u370.f(this.a, true, true, new pch(tdj.a(e, "?", "\n", "    "), str, list, this, size));
    }

    @Override // xsna.cb50
    public final void s(kb50 kb50Var, String str) {
        u370.f(this.a, false, true, new l2e(this, kb50Var, str, 4));
    }

    @Override // xsna.cb50
    public final List<hc50> t(String str, List<String> list) {
        StringBuilder e = fw3.e("SELECT id, uid, mid, downloading_state, json_raw FROM audio_track WHERE uid = ? AND mid IN (");
        e370.c(list.size(), e);
        e.append(")");
        return (List) u370.f(this.a, true, false, new p83(e.toString(), str, list, this));
    }

    @Override // xsna.cb50
    public final void u(ArrayList arrayList, ArrayList arrayList2, String str) {
        u370.f(this.a, false, true, new f2b(this, arrayList, arrayList2, str));
    }

    @Override // xsna.cb50
    public final List<hc50> v(String str) {
        return (List) u370.f(this.a, true, true, new jjl(str, this));
    }

    @Override // xsna.cb50
    public final List<hc50> w(String str, List<String> list) {
        StringBuilder e = fw3.e("SELECT id, uid, mid, downloading_state, json_raw FROM audio_track WHERE uid = ? AND release_audio_id IN (");
        e370.c(list.size(), e);
        e.append(")");
        return (List) u370.f(this.a, true, false, new defpackage.l(e.toString(), str, list, this));
    }

    @Override // xsna.cb50
    public final void x(final int i, final int i2, final String str) {
        u370.f(this.a, false, true, new izs() { // from class: xsna.db50
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i3 = i;
                int i4 = i2;
                String str2 = str;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE audio_track SET downloading_state = ?, corrupted_reason = ? WHERE mid = ?");
                try {
                    V0.bindLong(1, i3);
                    V0.bindLong(2, i4);
                    V0.D3(3, str2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            }
        });
    }

    @Override // xsna.cb50
    public final List<ic50> y(String str, String str2) {
        return (List) u370.f(this.a, true, true, new ju(str, str2, this));
    }

    @Override // xsna.cb50
    public final int z(int i, String str) {
        return ((Number) u370.f(this.a, true, false, new tm(str, i, 2))).intValue();
    }
}
