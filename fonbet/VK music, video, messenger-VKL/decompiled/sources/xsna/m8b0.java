package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Genre;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlaylistDao_Impl.kt */
/* loaded from: classes.dex */
public final class m8b0 implements j8b0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: PlaylistDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            w8b0 w8b0Var = (w8b0) obj;
            qyg0Var.bindLong(1, w8b0Var.f());
            qyg0Var.D3(2, String.valueOf(w8b0Var.n().b));
            qyg0Var.D3(3, w8b0Var.i());
            UserId h = w8b0Var.h();
            String valueOf = h == null ? null : String.valueOf(h.b);
            if (valueOf == null) {
                qyg0Var.bindNull(4);
            } else {
                qyg0Var.D3(4, valueOf);
            }
            String a = w8b0Var.a();
            if (a == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.D3(5, a);
            }
            qyg0Var.D3(6, w8b0Var.l());
            qyg0Var.bindLong(7, DownloadingState.a.a(w8b0Var.d()));
            qyg0Var.bindLong(8, w8b0Var.m().h());
            String k = w8b0Var.k();
            if (k == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.D3(9, k);
            }
            String j = w8b0Var.j();
            if (j == null) {
                qyg0Var.bindNull(10);
            } else {
                qyg0Var.D3(10, j);
            }
            String c = w8b0Var.c();
            if (c == null) {
                qyg0Var.bindNull(11);
            } else {
                qyg0Var.D3(11, c);
            }
            qyg0Var.bindLong(12, w8b0Var.o());
            List<Genre> e = w8b0Var.e();
            String jSONArray = e != null ? kvf.a(e).toString() : null;
            if (jSONArray == null) {
                qyg0Var.bindNull(13);
            } else {
                qyg0Var.D3(13, jSONArray);
            }
            qyg0Var.bindLong(14, w8b0Var.b());
            qyg0Var.bindLong(15, w8b0Var.r() ? 1L : 0L);
            qyg0Var.bindLong(16, w8b0Var.p() ? 1L : 0L);
            qyg0Var.bindLong(17, w8b0Var.q() ? 1L : 0L);
            qyg0Var.D3(18, w8b0Var.g());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `playlist` (`id`,`uid`,`pid`,`owner_id`,`access_key`,`track_code`,`downloading_state`,`type`,`title`,`subtitle`,`description`,`year`,`genres`,`content_restriction`,`is_explicit`,`is_curator`,`is_exclusive`,`json_raw`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public m8b0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static s3q0 p(String str, m8b0 m8b0Var) {
        super.a(str);
        return s3q0.a;
    }

    @Override // xsna.j8b0
    public final void a(String str) {
        u370.f(this.a, false, true, new defpackage.y(19, this, str));
    }

    @Override // xsna.j8b0
    public final void b() {
        u370.f(this.a, false, true, new kl60(9));
    }

    @Override // xsna.j8b0
    public final int c(String str) {
        return ((Number) u370.f(this.a, true, false, new com.vk.movika.sdk.base.observable.a0(str, 3))).intValue();
    }

    @Override // xsna.j8b0
    public final int d(String str, String str2) {
        return ((Number) u370.f(this.a, true, false, new pm90(2, str, str2))).intValue();
    }

    @Override // xsna.j8b0
    public final int e(String str) {
        return ((Number) u370.f(this.a, true, false, new fjw(str, 1))).intValue();
    }

    @Override // xsna.j8b0
    public final uab0 f(String str, String str2) {
        return (uab0) u370.f(this.a, true, false, new defpackage.s(str, str2, this));
    }

    @Override // xsna.j8b0
    public final int g(String str, String str2) {
        return ((Number) u370.f(this.a, false, true, new nm1(22, str, str2))).intValue();
    }

    @Override // xsna.j8b0
    public final List<uab0> h(String str, String str2) {
        return (List) u370.f(this.a, true, true, new k8b0(str2, str, this));
    }

    @Override // xsna.j8b0
    public final List<uab0> i(String str) {
        return (List) u370.f(this.a, true, false, new ii40(str, this));
    }

    @Override // xsna.j8b0
    public final List<uab0> j(String str) {
        return (List) u370.f(this.a, true, false, new fk2(2, str, this));
    }

    @Override // xsna.j8b0
    public final void k(ArrayList arrayList) {
        u370.f(this.a, false, true, new q7a0(1, this, arrayList));
    }

    @Override // xsna.j8b0
    public final List<uab0> l(String str) {
        return (List) u370.f(this.a, true, false, new l8b0(str, this));
    }

    @Override // xsna.j8b0
    public final void m(String str, String str2) {
        u370.f(this.a, false, true, new bv1(str2, str));
    }

    @Override // xsna.j8b0
    public final void n(int i, String str) {
        u370.f(this.a, false, true, new hbe(i, str));
    }

    @Override // xsna.j8b0
    public final void o(w8b0 w8b0Var) {
        u370.f(this.a, false, true, new sh3(24, this, w8b0Var));
    }
}
