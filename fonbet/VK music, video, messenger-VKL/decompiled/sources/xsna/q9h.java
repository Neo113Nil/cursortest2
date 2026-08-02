package xsna;

import android.content.Context;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.dto.common.id.UserId;

/* compiled from: CommunityMarketRouter.kt */
/* loaded from: classes18.dex */
public interface q9h {
    static {
        int i = a.a;
    }

    /* compiled from: CommunityMarketRouter.kt */
    public static final class a {
        private static final q9h STUB = new C3555a();
        public static final /* synthetic */ int a = 0;

        public final q9h getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityMarketRouter.kt */
        /* renamed from: xsna.q9h$a$a, reason: collision with other inner class name */
        public static final class C3555a implements q9h {
            @Override // xsna.q9h
            public final void b(Context context, MarketItemLabelActionDto marketItemLabelActionDto) {
            }

            @Override // xsna.q9h
            public final void c(Context context, UserId userId) {
            }

            @Override // xsna.q9h
            public final void a(int i, Context context, UserId userId) {
            }

            @Override // xsna.q9h
            public final void d(int i, Context context, UserId userId) {
            }
        }
    }

    default void b(Context context, MarketItemLabelActionDto marketItemLabelActionDto) {
    }

    default void c(Context context, UserId userId) {
    }

    default void a(int i, Context context, UserId userId) {
    }

    default void d(int i, Context context, UserId userId) {
    }
}
