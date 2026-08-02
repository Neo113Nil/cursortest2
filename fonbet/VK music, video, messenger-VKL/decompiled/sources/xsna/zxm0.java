package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SubscriptionDao_Impl.kt */
/* loaded from: classes.dex */
public final class zxm0 implements yxm0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: SubscriptionDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            py8 py8Var = (py8) obj;
            qyg0Var.bindLong(1, fvr.r(py8Var.e()));
            qyg0Var.bindLong(2, fvr.r(py8Var.b()));
            qyg0Var.D3(3, py8Var.c());
            qyg0Var.bindLong(4, py8Var.a());
            qyg0Var.bindLong(5, py8Var.d());
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `cached_subscription` (`user_id`,`owner_id`,`status`,`next_payment_date`,`updated_at`) VALUES (?,?,?,?,?)";
        }
    }

    /* compiled from: SubscriptionDao_Impl.kt */
    public static final class b extends gu8 {
    }

    public zxm0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new b();
    }

    @Override // xsna.yxm0
    public final Object a(py8 py8Var, z2o z2oVar) {
        Object g = u370.g(this.a, z2oVar, new prd0(4, this, py8Var), false, true);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : s3q0.a;
    }

    @Override // xsna.yxm0
    public final Object b(w2o w2oVar) {
        Object g = u370.g(this.a, w2oVar, new gz30(22), false, true);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : s3q0.a;
    }

    @Override // xsna.yxm0
    public final Object c(UserId userId, y2o y2oVar) {
        return u370.g(this.a, y2oVar, new nec0(userId, 1), true, false);
    }
}
