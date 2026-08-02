package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.music.MusicDynamicRestriction;
import java.util.List;

/* compiled from: AudioBookDao_Impl.kt */
/* loaded from: classes.dex */
public final class wf4 implements of4 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: AudioBookDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            fg4 fg4Var = (fg4) obj;
            qyg0Var.bindLong(1, fg4Var.i());
            qyg0Var.D3(2, String.valueOf(fg4Var.p().b));
            qyg0Var.bindLong(3, fg4Var.c());
            qyg0Var.D3(4, fg4Var.n());
            qyg0Var.D3(5, fg4Var.b());
            qyg0Var.bindLong(6, fg4Var.k());
            qyg0Var.bindLong(7, fg4Var.r() ? 1L : 0L);
            qyg0Var.bindLong(8, fg4Var.h());
            qyg0Var.bindLong(9, fg4Var.q());
            Image f = fg4Var.f();
            if (f == null || (str = f.Gb().toString()) == null) {
                str = "";
            }
            qyg0Var.D3(10, str);
            String e = fg4Var.e();
            if (e == null) {
                qyg0Var.bindNull(11);
            } else {
                qyg0Var.D3(11, e);
            }
            if (fg4Var.l() == null) {
                qyg0Var.bindNull(12);
            } else {
                qyg0Var.bindLong(12, r0.intValue());
            }
            qyg0Var.bindLong(13, fg4Var.s() ? 1L : 0L);
            qyg0Var.D3(14, fg4Var.a());
            qyg0Var.D3(15, fg4Var.o());
            qyg0Var.bindLong(16, fg4Var.d());
            MusicDynamicRestriction m = fg4Var.m();
            String jSONObject = m == null ? null : m.e5().toString();
            if (jSONObject == null) {
                qyg0Var.bindNull(17);
            } else {
                qyg0Var.D3(17, jSONObject);
            }
            qyg0Var.bindLong(18, DownloadingState.a.a(fg4Var.g()));
            qyg0Var.D3(19, fg4Var.j());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `audio_book` (`id`,`uid`,`book_id`,`title`,`annotation`,`minimum_age`,`is_explicit`,`duration`,`updated_at`,`cover_image`,`copyright`,`release_date`,`is_favorite`,`access_status`,`track_code`,`context_flags_mask`,`restriction`,`downloading_state`,`json_raw`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public wf4(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.of4
    public final void a(fg4 fg4Var) {
        u370.f(this.a, false, true, new sf4(0, this, fg4Var));
    }

    @Override // xsna.of4
    public final int b(int i, String str) {
        return ((Number) u370.f(this.a, true, false, new uf4(str, i, 0))).intValue();
    }

    @Override // xsna.of4
    public final void c(int i, String str, boolean z) {
        u370.f(this.a, false, true, new vf4(i, 0, str, z));
    }

    @Override // xsna.of4
    public final fg4 d(int i, String str) {
        return (fg4) u370.f(this.a, true, false, new pf4(str, i, this));
    }

    @Override // xsna.of4
    public final int e(int i, String str) {
        return ((Number) u370.f(this.a, false, true, new qf4(str, i, 0))).intValue();
    }

    @Override // xsna.of4
    public final List<fg4> f(String str) {
        return (List) u370.f(this.a, true, false, new tf4(str, this));
    }

    @Override // xsna.of4
    public final io.reactivex.rxjava3.internal.operators.observable.q g(int i, String str) {
        rf4 rf4Var = new rf4(str, i, this);
        return mvg0.c(this.a, false, new String[]{"audio_book"}, rf4Var);
    }
}
