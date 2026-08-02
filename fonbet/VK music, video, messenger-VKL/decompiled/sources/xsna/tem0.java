package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: StoryStatisticsExcludedUsersDao_Impl.kt */
/* loaded from: classes6.dex */
public final class tem0 implements rem0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: StoryStatisticsExcludedUsersDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            ArrayList arrayList;
            uem0 uem0Var = (uem0) obj;
            bpn0 bpn0Var = bfm0.a;
            qyg0Var.bindLong(1, uem0Var.a.b);
            bpn0 bpn0Var2 = qem0.a;
            Set<UserId> set = uem0Var.b;
            if (set != null) {
                Set<UserId> set2 = set;
                arrayList = new ArrayList(c5g.u(set2, 10));
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((UserId) it.next()).b));
                }
            } else {
                arrayList = null;
            }
            qyg0Var.D3(2, ((Gson) qem0.a.getValue()).toJson(arrayList));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `story_statistics_excluded_users` (`owner_id`,`excludedUsers`) VALUES (?,?)";
        }
    }

    public tem0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.rem0
    public final io.reactivex.rxjava3.internal.operators.completable.e a(uem0 uem0Var) {
        return mvg0.a(this.a, new aq1(24, this, uem0Var));
    }

    @Override // xsna.rem0
    public final void b() {
        u370.f(this.a, false, true, new n0m0(1));
    }

    @Override // xsna.rem0
    public final io.reactivex.rxjava3.internal.operators.maybe.c c(UserId userId) {
        return mvg0.b(this.a, new sem0(userId));
    }
}
