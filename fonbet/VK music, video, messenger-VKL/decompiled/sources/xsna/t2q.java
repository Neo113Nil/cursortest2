package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;

/* compiled from: ExcludedPacksDao_Impl.kt */
/* loaded from: classes5.dex */
public final class t2q implements s2q {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: ExcludedPacksDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            qyg0Var.bindLong(1, r5.a);
            Gson gson = psj.a;
            qyg0Var.D3(2, psj.a.toJson(((i9l0) obj).b));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `excluded_packs_stickers` (`version`,`packIds`) VALUES (?,?)";
        }
    }

    /* compiled from: ExcludedPacksDao_Impl.kt */
    public static final class b extends gu8 {
    }

    public t2q(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new b();
    }

    public static s3q0 e(t2q t2qVar, i9l0 i9l0Var) {
        super.d(i9l0Var);
        return s3q0.a;
    }

    @Override // xsna.s2q
    public final i9l0 a() {
        return (i9l0) u370.f(this.a, true, false, new qt(27));
    }

    @Override // xsna.s2q
    public final void b() {
        u370.f(this.a, false, true, new pt(27));
    }

    @Override // xsna.s2q
    public final void c(i9l0 i9l0Var) {
        u370.f(this.a, false, true, new du0(12, this, i9l0Var));
    }

    @Override // xsna.s2q
    public final void d(i9l0 i9l0Var) {
        u370.f(this.a, false, true, new o43(21, this, i9l0Var));
    }
}
