package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import java.util.List;

/* compiled from: PodcastDao_Impl.kt */
/* loaded from: classes.dex */
public final class sgb0 implements qgb0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: PodcastDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            ugb0 ugb0Var = (ugb0) obj;
            qyg0Var.bindLong(1, ugb0Var.c());
            qyg0Var.D3(2, String.valueOf(ugb0Var.m().b));
            qyg0Var.bindLong(3, ugb0Var.g());
            qyg0Var.D3(4, String.valueOf(ugb0Var.e().b));
            String h = ugb0Var.h();
            if (h == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.D3(5, h);
            }
            qyg0Var.bindLong(6, ugb0Var.f());
            Thumb k = ugb0Var.k();
            String jSONObject = k == null ? null : k.e5().toString();
            if (jSONObject == null) {
                qyg0Var.bindNull(7);
            } else {
                qyg0Var.D3(7, jSONObject);
            }
            qyg0Var.bindLong(8, ugb0Var.j() ? 1L : 0L);
            String i = ugb0Var.i();
            if (i == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.D3(9, i);
            }
            qyg0Var.bindLong(10, ugb0Var.a() ? 1L : 0L);
            qyg0Var.bindLong(11, ugb0Var.n() ? 1L : 0L);
            String l = ugb0Var.l();
            if (l == null) {
                qyg0Var.bindNull(12);
            } else {
                qyg0Var.D3(12, l);
            }
            qyg0Var.bindLong(13, DownloadingState.a.a(ugb0Var.b()));
            qyg0Var.D3(14, ugb0Var.d());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `podcast` (`id`,`uid`,`podcast_id`,`owner_id`,`podcast_title`,`playlist_id`,`thumb`,`subtitle_badge`,`subtitle`,`can_subscribe`,`is_subscribed`,`track_code`,`downloading_state`,`json_raw`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public sgb0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.qgb0
    public final void a(String str, String str2, boolean z) {
        u370.f(this.a, false, true, new wi60(z, str, str2));
    }

    @Override // xsna.qgb0
    public final int b(String str, String str2) {
        return ((Number) u370.f(this.a, true, false, new clb(str, str2, 1))).intValue();
    }

    @Override // xsna.qgb0
    public final ugb0 c(String str, String str2) {
        return (ugb0) u370.f(this.a, true, false, new zt2(str, str2, this));
    }

    @Override // xsna.qgb0
    public final List<wkb0> d(String str) {
        return (List) u370.f(this.a, true, true, new rgb0(str, this));
    }

    @Override // xsna.qgb0
    public final List<UserId> e(String str) {
        return (List) u370.f(this.a, true, false, new ge3(str, this));
    }

    @Override // xsna.qgb0
    public final int f(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new lx60(6, str, str2))).intValue();
    }

    @Override // xsna.qgb0
    public final void g(ugb0 ugb0Var) {
        u370.f(this.a, false, true, new b1a(26, this, ugb0Var));
    }
}
