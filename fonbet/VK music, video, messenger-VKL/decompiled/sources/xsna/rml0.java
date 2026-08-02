package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;

/* compiled from: StorefrontRouter.kt */
/* loaded from: classes.dex */
public interface rml0 {
    static {
        int i = a.a;
    }

    static /* synthetic */ void a(rml0 rml0Var, Context context, UserId userId, MarketAnalyticsParams marketAnalyticsParams, int i) {
        if ((i & 4) != 0) {
            marketAnalyticsParams = null;
        }
        rml0Var.c(context, userId, marketAnalyticsParams, null, (i & 16) == 0);
    }

    /* compiled from: StorefrontRouter.kt */
    public static final class a {
        private static final rml0 STUB = new C3613a();
        public static final /* synthetic */ int a = 0;

        public final rml0 getSTUB() {
            return STUB;
        }

        /* compiled from: StorefrontRouter.kt */
        /* renamed from: xsna.rml0$a$a, reason: collision with other inner class name */
        public static final class C3613a implements rml0 {
            @Override // xsna.rml0
            public final void b(Context context, UserId userId) {
            }

            @Override // xsna.rml0
            public final void c(Context context, UserId userId, MarketAnalyticsParams marketAnalyticsParams, Class<? extends FragmentImpl> cls, boolean z) {
            }
        }
    }

    default void b(Context context, UserId userId) {
    }

    default void c(Context context, UserId userId, MarketAnalyticsParams marketAnalyticsParams, Class<? extends FragmentImpl> cls, boolean z) {
    }
}
