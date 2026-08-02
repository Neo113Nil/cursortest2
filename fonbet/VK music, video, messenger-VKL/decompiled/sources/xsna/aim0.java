package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsViewersMetaDao_Impl.kt */
/* loaded from: classes6.dex */
public final class aim0 implements zhm0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: StoryStatisticsViewersMetaDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            bpn0 bpn0Var = bfm0.a;
            qyg0Var.bindLong(1, ((bim0) obj).a.b);
            qyg0Var.bindLong(2, r5.b);
            qyg0Var.bindLong(3, r5.c);
            qyg0Var.bindLong(4, r5.d);
            qyg0Var.bindLong(5, r5.e);
            qyg0Var.bindLong(6, r5.f);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `story_statistics_viewers_meta` (`owner_id`,`story_id`,`viewsCount`,`answersCount`,`reactionsCount`,`new_reactions`) VALUES (?,?,?,?,?,?)";
        }
    }

    public aim0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.zhm0
    public final io.reactivex.rxjava3.internal.operators.single.b a(int i, UserId userId) {
        return mvg0.d(this.a, false, new fk5(userId, i, 2));
    }

    @Override // xsna.zhm0
    public final void b() {
        u370.f(this.a, false, true, new m4k0(5));
    }

    @Override // xsna.zhm0
    public final io.reactivex.rxjava3.internal.operators.completable.e c(bim0 bim0Var) {
        return mvg0.a(this.a, new eci0(5, this, bim0Var));
    }

    @Override // xsna.zhm0
    public final void d(int i, UserId userId) {
        u370.f(this.a, false, true, new yk30(userId, i, 1));
    }
}
