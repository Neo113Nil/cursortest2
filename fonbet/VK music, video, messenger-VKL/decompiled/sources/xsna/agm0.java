package xsna;

import androidx.room.RoomDatabase;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: StoryStatisticsQuestionDao_Impl.kt */
/* loaded from: classes6.dex */
public final class agm0 implements yfm0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: StoryStatisticsQuestionDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            Object obj2;
            Pair pair;
            Pair pair2;
            Object obj3;
            cgm0 cgm0Var = (cgm0) obj;
            bpn0 bpn0Var = bfm0.a;
            qyg0Var.bindLong(1, cgm0Var.a.b);
            qyg0Var.bindLong(2, cgm0Var.b);
            qyg0Var.bindLong(3, cgm0Var.c);
            qyg0Var.bindLong(4, cgm0Var.d);
            bgm0 bgm0Var = cgm0Var.e;
            Pair pair3 = new Pair("questionId", Integer.valueOf(bgm0Var.a));
            UserId userId = bgm0Var.b;
            if (userId != null) {
                str = Long.valueOf(userId.b).toString();
                obj2 = null;
            } else {
                str = null;
                obj2 = null;
            }
            Pair pair4 = new Pair("ownerId", str);
            Object obj4 = obj2;
            Pair pair5 = new Pair("question", bgm0Var.c);
            Pair pair6 = new Pair("isAnonymous", Boolean.valueOf(bgm0Var.d));
            Object obj5 = obj4;
            Pair pair7 = new Pair("isOwnerBlocker", Boolean.valueOf(bgm0Var.e));
            dgm0 dgm0Var = bgm0Var.f;
            if (dgm0Var != null) {
                Pair pair8 = new Pair("uid", Long.valueOf(dgm0Var.a.b));
                Pair pair9 = new Pair("fullName", dgm0Var.b);
                Pair pair10 = new Pair("firstName", dgm0Var.c);
                Image image = dgm0Var.d;
                if (image != null) {
                    obj5 = image.Gb().toString();
                }
                pair = pair3;
                pair2 = pair4;
                obj3 = new JSONObject(pn00.k(pair8, pair9, pair10, new Pair("image", obj5), new Pair("photo", dgm0Var.e), new Pair("canMessage", Boolean.valueOf(dgm0Var.f)), new Pair("firstNameGen", dgm0Var.g), new Pair("fullNameAcc", dgm0Var.h)));
            } else {
                pair = pair3;
                pair2 = pair4;
                obj3 = obj5;
            }
            qyg0Var.D3(5, new JSONObject(pn00.k(pair, pair2, pair5, pair6, pair7, new Pair(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, obj3), new Pair("isPublished", Boolean.valueOf(bgm0Var.g)), new Pair("withMention", Boolean.valueOf(bgm0Var.h)), new Pair("date", Integer.valueOf(bgm0Var.i)))).toString());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `story_statistics_question` (`owner_id`,`story_id`,`question_id`,`date`,`storyStatisticsQuestion`) VALUES (?,?,?,?,?)";
        }
    }

    public agm0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.yfm0
    public final io.reactivex.rxjava3.internal.operators.completable.e a(ArrayList arrayList) {
        return mvg0.a(this.a, new k22(24, this, arrayList));
    }

    @Override // xsna.yfm0
    public final void b() {
        u370.f(this.a, false, true, new g2h0(4));
    }

    @Override // xsna.yfm0
    public final io.reactivex.rxjava3.internal.operators.completable.e c(final int i, final UserId userId, final int i2) {
        return mvg0.a(this.a, new izs() { // from class: xsna.zfm0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                UserId userId2 = UserId.this;
                int i3 = i;
                int i4 = i2;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_question WHERE owner_id = ? AND story_id = ? AND question_id = ?");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId2.b);
                    V0.bindLong(2, i3);
                    V0.bindLong(3, i4);
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

    @Override // xsna.yfm0
    public final io.reactivex.rxjava3.internal.operators.single.b d(int i, UserId userId) {
        return mvg0.d(this.a, false, new def(userId, i, 2));
    }

    @Override // xsna.yfm0
    public final io.reactivex.rxjava3.internal.operators.completable.e e(int i, UserId userId) {
        return mvg0.a(this.a, new vqp(userId, i, 1));
    }
}
