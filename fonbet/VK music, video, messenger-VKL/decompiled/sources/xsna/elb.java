package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.DownloadingState;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.List;

/* compiled from: ChapterDao_Impl.kt */
/* loaded from: classes.dex */
public final class elb implements ukb {
    public final RoomDatabase a;
    public final a b = new a();
    public final b c = new b();

    /* compiled from: ChapterDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            flb flbVar = (flb) obj;
            qyg0Var.bindLong(1, flbVar.e());
            qyg0Var.D3(2, String.valueOf(flbVar.n().b));
            qyg0Var.D3(3, flbVar.a());
            qyg0Var.D3(4, flbVar.l());
            String o = flbVar.o();
            if (o == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.D3(5, o);
            }
            if (flbVar.d() == null) {
                qyg0Var.bindNull(6);
            } else {
                qyg0Var.bindLong(6, r0.intValue());
            }
            qyg0Var.bindLong(7, flbVar.i());
            qyg0Var.D3(8, flbVar.h());
            String m = flbVar.m();
            if (m == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.D3(9, m);
            }
            if (flbVar.j() == null) {
                qyg0Var.bindNull(10);
            } else {
                qyg0Var.bindLong(10, r0.intValue());
            }
            if (flbVar.b() == null) {
                qyg0Var.bindNull(11);
            } else {
                qyg0Var.bindLong(11, r0.intValue());
            }
            String g = flbVar.g();
            if (g == null) {
                qyg0Var.bindNull(12);
            } else {
                qyg0Var.D3(12, g);
            }
            qyg0Var.bindLong(13, DownloadingState.a.a(flbVar.c()));
            MusicOfflineCacheStorage k = flbVar.k();
            String name = k != null ? k.name() : null;
            if (name == null) {
                qyg0Var.bindNull(14);
            } else {
                qyg0Var.D3(14, name);
            }
            qyg0Var.D3(15, flbVar.f());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `audio_book_chapter` (`id`,`uid`,`chapter_id`,`title`,`url`,`duration`,`progress_time`,`progress_status`,`track_code`,`special_project_id`,`context_flags_mask`,`manifest_url`,`downloading_state`,`storage`,`json_raw`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: ChapterDao_Impl.kt */
    public static final class b extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            yj4 yj4Var = (yj4) obj;
            qyg0Var.D3(1, yj4Var.c());
            qyg0Var.D3(2, yj4Var.b());
            qyg0Var.bindLong(3, yj4Var.a());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `audio_book_to_chapters` (`uid`,`chapter_id`,`book_id`) VALUES (?,?,?)";
        }
    }

    public elb(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static int p(String str, String str2, elb elbVar) {
        return super.n(str, str2);
    }

    @Override // xsna.ukb
    public final io.reactivex.rxjava3.internal.operators.observable.q a(int i, String str) {
        zkb zkbVar = new zkb(str, i, this);
        return mvg0.c(this.a, true, new String[]{"audio_book_chapter", "audio_book_to_chapters"}, zkbVar);
    }

    @Override // xsna.ukb
    public final void b(String str, String str2, String str3) {
        u370.f(this.a, false, true, new dlb(str3, str, str2, 0));
    }

    @Override // xsna.ukb
    public final void c(yj4 yj4Var) {
        u370.f(this.a, false, true, new he3(5, this, yj4Var));
    }

    @Override // xsna.ukb
    public final Integer d(String str, String str2) {
        return (Integer) u370.f(this.a, true, false, new clb(str, str2, 0));
    }

    @Override // xsna.ukb
    public final List<flb> e(String str, List<String> list) {
        StringBuilder e = fw3.e("SELECT * FROM audio_book_chapter WHERE uid = ? AND chapter_id IN (");
        e370.c(list.size(), e);
        e.append(")");
        return (List) u370.f(this.a, true, false, new vkb(e.toString(), str, list, this));
    }

    @Override // xsna.ukb
    public final void f(int i, String str) {
        u370.f(this.a, false, true, new wkb(i, str));
    }

    @Override // xsna.ukb
    public final void g(final int i, final String str, final String str2, final String str3) {
        u370.f(this.a, false, true, new izs() { // from class: xsna.blb
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                String str4 = str3;
                int i2 = i;
                String str5 = str;
                String str6 = str2;
                qyg0 V0 = ((hyg0) obj).V0("\n        UPDATE audio_book_chapter \n        SET progress_status = ?, \n        progress_time = MIN(?, COALESCE((SELECT duration FROM audio_book_chapter WHERE uid = ? AND chapter_id = ?), ?)) \n        WHERE uid = ? AND chapter_id = ?\n    ");
                try {
                    V0.D3(1, str4);
                    long j = i2;
                    V0.bindLong(2, j);
                    V0.D3(3, str5);
                    V0.D3(4, str6);
                    V0.bindLong(5, j);
                    V0.D3(6, str5);
                    V0.D3(7, str6);
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

    @Override // xsna.ukb
    public final MusicOfflineCacheStorage h(String str) {
        return (MusicOfflineCacheStorage) u370.f(this.a, true, false, new ykb(str, this));
    }

    @Override // xsna.ukb
    public final int i(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new g22(5, str, str2))).intValue();
    }

    @Override // xsna.ukb
    public final String j(String str, String str2) {
        return (String) u370.f(this.a, true, false, new alb(str, str2, 0));
    }

    @Override // xsna.ukb
    public final flb k(String str, String str2) {
        return (flb) u370.f(this.a, true, false, new defpackage.h0(str, str2, this));
    }

    @Override // xsna.ukb
    public final List l(int i, String str) {
        return (List) u370.f(this.a, true, true, new uo3(str, i, this));
    }

    @Override // xsna.ukb
    public final void m(flb flbVar) {
        u370.f(this.a, false, true, new jp5(4, this, flbVar));
    }

    @Override // xsna.ukb
    public final int n(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new rw(this, str, str2, 5))).intValue();
    }

    @Override // xsna.ukb
    public final int o(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new xkb(str, str2, 0))).intValue();
    }
}
