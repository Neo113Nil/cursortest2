package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsQuestionsMetaDao_Impl.kt */
/* loaded from: classes6.dex */
public final class ggm0 implements egm0 {
    public final RoomDatabase a;
    public final a b = new a();
    public final b c = new b();

    /* compiled from: StoryStatisticsQuestionsMetaDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            bpn0 bpn0Var = bfm0.a;
            qyg0Var.bindLong(1, ((hgm0) obj).a.b);
            qyg0Var.bindLong(2, r5.b);
            qyg0Var.bindLong(3, r5.c);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `story_statistics_questions_meta` (`owner_id`,`story_id`,`totalQuestionsCount`) VALUES (?,?,?)";
        }
    }

    /* compiled from: StoryStatisticsQuestionsMetaDao_Impl.kt */
    public static final class b extends gu8 {
    }

    public ggm0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.egm0
    public final io.reactivex.rxjava3.internal.operators.single.b a(int i, UserId userId) {
        return mvg0.d(this.a, false, new lwa(userId, i, 2));
    }

    @Override // xsna.egm0
    public final void b() {
        u370.f(this.a, false, true, new t810(16));
    }

    @Override // xsna.egm0
    public final io.reactivex.rxjava3.internal.operators.completable.e c(hgm0 hgm0Var) {
        return mvg0.a(this.a, new fgm0(0, this, hgm0Var));
    }

    @Override // xsna.egm0
    public final void d(hgm0 hgm0Var) {
        u370.f(this.a, false, true, new com.vk.movika.sdk.base.ui.s0(29, this, hgm0Var));
    }

    @Override // xsna.egm0
    public final hgm0 e(int i, UserId userId) {
        return (hgm0) u370.f(this.a, true, false, new p4w(userId, i, 2));
    }
}
