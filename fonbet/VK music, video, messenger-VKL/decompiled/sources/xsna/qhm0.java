package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: StoryStatisticsViewerDao_Impl.kt */
/* loaded from: classes6.dex */
public final class qhm0 implements phm0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: StoryStatisticsViewerDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            shm0 shm0Var = (shm0) obj;
            qyg0Var.bindLong(1, shm0Var.a);
            bpn0 bpn0Var = bfm0.a;
            qyg0Var.bindLong(2, shm0Var.b.b);
            qyg0Var.bindLong(3, shm0Var.c);
            qyg0Var.bindLong(4, shm0Var.d.b);
            rhm0 rhm0Var = shm0Var.e;
            Pair pair = new Pair("uid", Long.valueOf(rhm0Var.a.b));
            Pair pair2 = new Pair("fullName", rhm0Var.b);
            Pair pair3 = new Pair("firstName", rhm0Var.c);
            Image image = rhm0Var.d;
            qyg0Var.D3(5, new JSONObject(pn00.k(pair, pair2, pair3, new Pair("image", image != null ? image.Gb() : null), new Pair("photo", rhm0Var.e), new Pair("canMessage", Boolean.valueOf(rhm0Var.f)), new Pair("isLiked", Boolean.valueOf(rhm0Var.g)), new Pair("reactionId", rhm0Var.h), new Pair("isVerified", Boolean.valueOf(rhm0Var.i)), new Pair("isTrending", Boolean.valueOf(rhm0Var.j)), new Pair("isOauthVerified", Boolean.valueOf(rhm0Var.k)))).toString());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `story_statistics_viewer` (`ordinal_id`,`owner_id`,`story_id`,`user_id`,`storyStatisticsViewer`) VALUES (?,?,?,?,?)";
        }
    }

    public qhm0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.phm0
    public final io.reactivex.rxjava3.internal.operators.completable.e a(ArrayList arrayList) {
        return mvg0.a(this.a, new gs80(4, this, arrayList));
    }

    @Override // xsna.phm0
    public final void b() {
        u370.f(this.a, false, true, new q8w(25));
    }

    @Override // xsna.phm0
    public final List c(int i, UserId userId) {
        return (List) u370.f(this.a, true, false, new pf4(userId, i, 4));
    }

    @Override // xsna.phm0
    public final io.reactivex.rxjava3.internal.operators.single.b d(int i, UserId userId) {
        return mvg0.d(this.a, false, new m1g(userId, i, 2));
    }

    @Override // xsna.phm0
    public final void e(int i, UserId userId) {
        u370.f(this.a, false, true, new qf4(userId, i, 2));
    }
}
