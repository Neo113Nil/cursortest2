package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;

/* compiled from: MarketGoodDialogsRouter.kt */
/* loaded from: classes18.dex */
public interface kz00 {
    static {
        int i = a.a;
    }

    /* compiled from: MarketGoodDialogsRouter.kt */
    public static final class a {
        private static final kz00 STUB = new C3220a();
        public static final /* synthetic */ int a = 0;

        public final kz00 getSTUB() {
            return STUB;
        }

        /* compiled from: MarketGoodDialogsRouter.kt */
        /* renamed from: xsna.kz00$a$a, reason: collision with other inner class name */
        public static final class C3220a implements kz00 {
            @Override // xsna.kz00
            public final void b(Context context, jz00 jz00Var) {
            }

            @Override // xsna.kz00
            public final void a(Context context, boolean z, xyh xyhVar) {
            }

            @Override // xsna.kz00
            public final void d(Context context, String str, Intent intent) {
            }

            @Override // xsna.kz00
            public final void c(Context context, InaccessibilityMessage inaccessibilityMessage, UserId userId, izs<? super UserId, s3q0> izsVar) {
            }
        }
    }

    default void b(Context context, jz00 jz00Var) {
    }

    default void a(Context context, boolean z, xyh xyhVar) {
    }

    default void d(Context context, String str, Intent intent) {
    }

    default void c(Context context, InaccessibilityMessage inaccessibilityMessage, UserId userId, izs<? super UserId, s3q0> izsVar) {
    }
}
