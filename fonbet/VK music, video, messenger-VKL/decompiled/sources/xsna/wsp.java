package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EpisodeDao_Impl.kt */
/* loaded from: classes.dex */
public final class wsp implements usp {
    public final RoomDatabase a;
    public final a b = new a();
    public final b c = new b();

    /* compiled from: EpisodeDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            xsp xspVar = (xsp) obj;
            qyg0Var.bindLong(1, xspVar.g());
            qyg0Var.D3(2, String.valueOf(xspVar.q().b));
            qyg0Var.D3(3, xspVar.j());
            String p = xspVar.p();
            if (p == null) {
                qyg0Var.bindNull(4);
            } else {
                qyg0Var.D3(4, p);
            }
            String o = xspVar.o();
            if (o == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.D3(5, o);
            }
            String a = xspVar.a();
            if (a == null) {
                qyg0Var.bindNull(6);
            } else {
                qyg0Var.D3(6, a);
            }
            String r = xspVar.r();
            if (r == null) {
                qyg0Var.bindNull(7);
            } else {
                qyg0Var.D3(7, r);
            }
            Long f = xspVar.f();
            if (f == null) {
                qyg0Var.bindNull(8);
            } else {
                qyg0Var.bindLong(8, f.longValue());
            }
            Long c = xspVar.c();
            if (c == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.bindLong(9, c.longValue());
            }
            qyg0Var.bindLong(10, xspVar.t() ? 1L : 0L);
            Boolean v = xspVar.v();
            if ((v != null ? Integer.valueOf(v.booleanValue() ? 1 : 0) : null) == null) {
                qyg0Var.bindNull(11);
            } else {
                qyg0Var.bindLong(11, r0.intValue());
            }
            qyg0Var.bindLong(12, xspVar.k());
            qyg0Var.bindLong(13, xspVar.u() ? 1L : 0L);
            qyg0Var.bindLong(14, xspVar.l());
            String d = xspVar.d();
            if (d == null) {
                qyg0Var.bindNull(15);
            } else {
                qyg0Var.D3(15, d);
            }
            Image b = xspVar.b();
            if (b == null || (str = b.Gb().toString()) == null) {
                str = "";
            }
            qyg0Var.D3(16, str);
            String m = xspVar.m();
            if (m == null) {
                qyg0Var.bindNull(17);
            } else {
                qyg0Var.D3(17, m);
            }
            qyg0Var.bindLong(18, xspVar.s() ? 1L : 0L);
            qyg0Var.bindLong(19, DownloadingState.a.a(xspVar.e()));
            MusicOfflineCacheStorage n = xspVar.n();
            String name = n != null ? n.name() : null;
            if (name == null) {
                qyg0Var.bindNull(20);
            } else {
                qyg0Var.D3(20, name);
            }
            String i = xspVar.i();
            if (i == null) {
                qyg0Var.bindNull(21);
            } else {
                qyg0Var.D3(21, i);
            }
            qyg0Var.D3(22, xspVar.h());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `episode` (`id`,`uid`,`mid`,`track_code`,`title`,`artist`,`url`,`duration`,`date`,`is_explicit`,`is_focus_track`,`plays`,`is_favorite`,`position`,`description`,`cover`,`post_id`,`is_donut`,`downloading_state`,`storage`,`manifest_url`,`json_raw`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: EpisodeDao_Impl.kt */
    public static final class b extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            rjb0 rjb0Var = (rjb0) obj;
            qyg0Var.D3(1, rjb0Var.c());
            qyg0Var.D3(2, rjb0Var.a());
            qyg0Var.D3(3, rjb0Var.b());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `podcast_to_episodes` (`uid`,`mid`,`podcast_owner_id`) VALUES (?,?,?)";
        }
    }

    public wsp(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static int q(String str, String str2, wsp wspVar) {
        return super.e(str, str2);
    }

    @Override // xsna.usp
    public final String a(String str, String str2) {
        return (String) u370.f(this.a, true, false, new i0l(str, str2, 1));
    }

    @Override // xsna.usp
    public final void b(rjb0 rjb0Var) {
        u370.f(this.a, false, true, new mp3(11, this, rjb0Var));
    }

    @Override // xsna.usp
    public final void c(ArrayList arrayList) {
        u370.f(this.a, false, true, new com.vk.movika.sdk.base.logic.interactor.i(11, this, arrayList));
    }

    @Override // xsna.usp
    public final MusicOfflineCacheStorage d(String str) {
        return (MusicOfflineCacheStorage) u370.f(this.a, true, false, new vsp(str, this));
    }

    @Override // xsna.usp
    public final int e(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new ab6(this, str, str2, 5))).intValue();
    }

    @Override // xsna.usp
    public final List<xsp> f(String str) {
        return (List) u370.f(this.a, true, false, new com.vk.movika.sdk.base.logic.processor.c(str, this));
    }

    @Override // xsna.usp
    public final List<xsp> g(String str, List<String> list) {
        StringBuilder e = fw3.e("SELECT * FROM episode WHERE uid = ? AND mid IN (");
        e370.c(list.size(), e);
        e.append(")");
        return (List) u370.f(this.a, true, false, new l14(e.toString(), str, list, this));
    }

    @Override // xsna.usp
    public final void h(String str, String str2, String str3) {
        u370.f(this.a, false, true, new com.vk.video.ui.discovery.minimizable.related_videos.j(str3, str, str2));
    }

    @Override // xsna.usp
    public final void i(ArrayList arrayList) {
        u370.f(this.a, false, true, new v74(11, this, arrayList));
    }

    @Override // xsna.usp
    public final int j(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new d50(15, str, str2))).intValue();
    }

    @Override // xsna.usp
    public final void k(int i, String str) {
        u370.f(this.a, false, true, new def(i, str, 1));
    }

    @Override // xsna.usp
    public final List<xsp> l(String str, String str2) {
        return (List) u370.f(this.a, true, true, new g84(str, str2, this, 14));
    }

    @Override // xsna.usp
    public final xsp m(String str, String str2) {
        return (xsp) u370.f(this.a, true, false, new ut6(str, str2, this));
    }

    @Override // xsna.usp
    public final int n(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new ma(12, str, str2))).intValue();
    }

    @Override // xsna.usp
    public final void o(xsp xspVar) {
        u370.f(this.a, false, true, new l22(14, this, xspVar));
    }

    @Override // xsna.usp
    public final io.reactivex.rxjava3.internal.operators.observable.q p(String str, String str2) {
        com.vk.movika.sdk.base.logic.processor.d dVar = new com.vk.movika.sdk.base.logic.processor.d(14, str, str2, this, false);
        return mvg0.c(this.a, true, new String[]{"episode", "podcast_to_episodes"}, dVar);
    }
}
