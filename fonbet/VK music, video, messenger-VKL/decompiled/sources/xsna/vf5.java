package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Thumb;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.core.database.models.AutoDownloadType;
import java.util.List;

/* compiled from: AutoDownloadTrackDao_Impl.kt */
/* loaded from: classes.dex */
public final class vf5 implements jf5 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: AutoDownloadTrackDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            wf5 wf5Var = (wf5) obj;
            qyg0Var.bindLong(1, wf5Var.j());
            qyg0Var.D3(2, String.valueOf(wf5Var.x().b));
            qyg0Var.D3(3, wf5Var.q());
            String a = wf5Var.a();
            if (a == null) {
                qyg0Var.bindNull(4);
            } else {
                qyg0Var.D3(4, a);
            }
            String w = wf5Var.w();
            if (w == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.D3(5, w);
            }
            qyg0Var.bindLong(6, DownloadingState.a.a(wf5Var.g()));
            String v = wf5Var.v();
            if (v == null) {
                qyg0Var.bindNull(7);
            } else {
                qyg0Var.D3(7, v);
            }
            String t = wf5Var.t();
            if (t == null) {
                qyg0Var.bindNull(8);
            } else {
                qyg0Var.D3(8, t);
            }
            String b = wf5Var.b();
            if (b == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.D3(9, b);
            }
            List<Artist> n = wf5Var.n();
            String jSONArray = n != null ? kvf.a(n).toString() : null;
            if (jSONArray == null) {
                qyg0Var.bindNull(10);
            } else {
                qyg0Var.D3(10, jSONArray);
            }
            List<Artist> i = wf5Var.i();
            String jSONArray2 = i != null ? kvf.a(i).toString() : null;
            if (jSONArray2 == null) {
                qyg0Var.bindNull(11);
            } else {
                qyg0Var.D3(11, jSONArray2);
            }
            Thumb u = wf5Var.u();
            String jSONObject = u == null ? null : u.e5().toString();
            if (jSONObject == null) {
                qyg0Var.bindNull(12);
            } else {
                qyg0Var.D3(12, jSONObject);
            }
            MusicOfflineCacheStorage s = wf5Var.s();
            String name = s != null ? s.name() : null;
            if (name == null) {
                qyg0Var.bindNull(13);
            } else {
                qyg0Var.D3(13, name);
            }
            String y = wf5Var.y();
            if (y == null) {
                qyg0Var.bindNull(14);
            } else {
                qyg0Var.D3(14, y);
            }
            String p = wf5Var.p();
            if (p == null) {
                qyg0Var.bindNull(15);
            } else {
                qyg0Var.D3(15, p);
            }
            Long h = wf5Var.h();
            if (h == null) {
                qyg0Var.bindNull(16);
            } else {
                qyg0Var.bindLong(16, h.longValue());
            }
            Long f = wf5Var.f();
            if (f == null) {
                qyg0Var.bindNull(17);
            } else {
                qyg0Var.bindLong(17, f.longValue());
            }
            qyg0Var.bindLong(18, wf5Var.z() ? 1L : 0L);
            if (wf5Var.m() == null) {
                qyg0Var.bindNull(19);
            } else {
                qyg0Var.bindLong(19, r0.intValue());
            }
            Boolean A = wf5Var.A();
            if ((A != null ? Integer.valueOf(A.booleanValue() ? 1 : 0) : null) == null) {
                qyg0Var.bindNull(20);
            } else {
                qyg0Var.bindLong(20, r0.intValue());
            }
            String o = wf5Var.o();
            if (o == null) {
                qyg0Var.bindNull(21);
            } else {
                qyg0Var.D3(21, o);
            }
            qyg0Var.bindLong(22, wf5Var.e());
            Long r = wf5Var.r();
            if (r == null) {
                qyg0Var.bindNull(23);
            } else {
                qyg0Var.bindLong(23, r.longValue());
            }
            Long c = wf5Var.c();
            if (c == null) {
                qyg0Var.bindNull(24);
            } else {
                qyg0Var.bindLong(24, c.longValue());
            }
            Long k = wf5Var.k();
            if (k == null) {
                qyg0Var.bindNull(25);
            } else {
                qyg0Var.bindLong(25, k.longValue());
            }
            AutoDownloadType d = wf5Var.d();
            if ((d != null ? Integer.valueOf(d.i()) : null) == null) {
                qyg0Var.bindNull(26);
            } else {
                qyg0Var.bindLong(26, r1.intValue());
            }
            qyg0Var.D3(27, wf5Var.l());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `auto_download_track` (`id`,`uid`,`mid`,`access_key`,`track_code`,`downloading_state`,`title`,`subtitle`,`artist_name_fallback`,`main_artists`,`featured_artists`,`thumb`,`storage`,`url`,`manifest_url`,`duration`,`date`,`is_explicit`,`lyrics_id`,`is_focus_track`,`main_color`,`content_restriction`,`size_in_bytes`,`auto_download_date`,`initial_auto_download_date`,`auto_download_type`,`json_raw`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public vf5(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.completable.e a(final long j, final String str, final String str2) {
        return mvg0.a(this.a, new izs() { // from class: xsna.sf5
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                long j2 = j;
                String str3 = str;
                String str4 = str2;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE auto_download_track SET auto_download_date = ? WHERE uid = ? AND mid = ?");
                try {
                    V0.bindLong(1, j2);
                    V0.D3(2, str3);
                    V0.D3(3, str4);
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

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.completable.e b(String str, String str2) {
        return mvg0.a(this.a, new uf5(str, str2, 0));
    }

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.completable.e c(String str, String str2, String str3) {
        return mvg0.a(this.a, new o15(str3, str, str2, 1));
    }

    @Override // xsna.jf5
    public final List<xf5> d() {
        return (List) u370.f(this.a, true, true, new py(this, 5));
    }

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.completable.e e(long j, String str, String str2) {
        return mvg0.a(this.a, new ch3(j, str, str2));
    }

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.completable.e f(long j, String str) {
        return mvg0.a(this.a, new tf5(j, str, 0));
    }

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.single.b g(String str) {
        return mvg0.d(this.a, true, new lf5(str, this));
    }

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.single.b h(String str, String str2) {
        return mvg0.d(this.a, false, new mf5(str, str2, 0));
    }

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.single.b i(String str) {
        return mvg0.d(this.a, true, new nf5(str, 0));
    }

    @Override // xsna.jf5
    public final int j(String str) {
        return ((Number) u370.f(this.a, true, false, new x43(str, 1))).intValue();
    }

    @Override // xsna.jf5
    public final String k(String str) {
        return (String) u370.f(this.a, true, false, new pf5(str, 0));
    }

    @Override // xsna.jf5
    public final int l(String str) {
        return ((Number) u370.f(this.a, true, false, new com.vk.movika.sdk.base.observable.c(str, 8))).intValue();
    }

    @Override // xsna.jf5
    public final io.reactivex.rxjava3.internal.operators.single.b m(String str) {
        return mvg0.d(this.a, true, new rf5(str, this));
    }

    @Override // xsna.jf5
    public final wf5 n(String str) {
        return (wf5) u370.f(this.a, true, false, new kf5(str, this));
    }

    @Override // xsna.jf5
    public final int o(String str) {
        return ((Number) u370.f(this.a, true, false, new qf5(str, 0))).intValue();
    }

    @Override // xsna.jf5
    public final void p(final String str, final String str2, final String str3, final String str4) {
        u370.f(this.a, false, true, new izs() { // from class: xsna.of5
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                String str5 = str3;
                String str6 = str4;
                String str7 = str;
                String str8 = str2;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE OR IGNORE auto_download_track SET mid = ?, json_raw = ? WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str5);
                    V0.D3(2, str6);
                    V0.D3(3, str7);
                    V0.D3(4, str8);
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

    @Override // xsna.jf5
    public final void q(wf5 wf5Var) {
        u370.f(this.a, false, true, new ll1(1, this, wf5Var));
    }

    @Override // xsna.jf5
    public final wf5 r(String str, String str2) {
        return (wf5) u370.f(this.a, true, false, new du0(str, str2, this));
    }
}
