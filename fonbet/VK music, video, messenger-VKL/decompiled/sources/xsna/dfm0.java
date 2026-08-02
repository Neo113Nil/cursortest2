package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsInfoDao_Impl.kt */
/* loaded from: classes6.dex */
public final class dfm0 implements cfm0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: StoryStatisticsInfoDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            ffm0 ffm0Var = (ffm0) obj;
            bpn0 bpn0Var = bfm0.a;
            qyg0Var.bindLong(1, ffm0Var.a.b);
            qyg0Var.bindLong(2, ffm0Var.b);
            qyg0Var.D3(3, ((Gson) bfm0.a.getValue()).toJson(ffm0Var.c));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `story_statistics_info` (`owner_id`,`story_id`,`storyStatisticsInfo`) VALUES (?,?,?)";
        }
    }

    public dfm0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.cfm0
    public final io.reactivex.rxjava3.internal.operators.maybe.c a(int i, UserId userId) {
        return mvg0.b(this.a, new zi7(userId, i, 1));
    }

    @Override // xsna.cfm0
    public final void b() {
        u370.f(this.a, false, true, new pqz(28));
    }

    @Override // xsna.cfm0
    public final io.reactivex.rxjava3.internal.operators.completable.e c(ffm0 ffm0Var) {
        return mvg0.a(this.a, new y5m0(1, this, ffm0Var));
    }
}
