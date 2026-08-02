package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: MarketShopConditionsRouter.kt */
/* loaded from: classes18.dex */
public interface me10 {
    static /* synthetic */ void b(me10 me10Var, Context context, UserId userId, Long l, com.vk.movika.sdk.base.ui.l lVar, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        gzs<s3q0> gzsVar = lVar;
        if ((i & 8) != 0) {
            gzsVar = new kr6(13);
        }
        me10Var.a(context, userId, l, gzsVar);
    }

    void a(Context context, UserId userId, Long l, gzs<s3q0> gzsVar);

    /* compiled from: MarketShopConditionsRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final me10 STUB = new C3339a();

        public final me10 getSTUB() {
            return STUB;
        }

        /* compiled from: MarketShopConditionsRouter.kt */
        /* renamed from: xsna.me10$a$a, reason: collision with other inner class name */
        public static final class C3339a implements me10 {
            @Override // xsna.me10
            public final void a(Context context, UserId userId, Long l, gzs<s3q0> gzsVar) {
            }
        }
    }
}
