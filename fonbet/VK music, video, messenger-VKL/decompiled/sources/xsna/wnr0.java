package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: VerifiedSellerRouter.kt */
/* loaded from: classes.dex */
public interface wnr0 {
    public static final a a = a.a;

    void b(Context context, UserId userId, String str);

    void c(Context context, UserId userId);

    void d(Context context, boolean z);

    /* compiled from: VerifiedSellerRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final wnr0 STUB = new C3946a();

        public final wnr0 getSTUB() {
            return STUB;
        }

        /* compiled from: VerifiedSellerRouter.kt */
        /* renamed from: xsna.wnr0$a$a, reason: collision with other inner class name */
        public static final class C3946a implements wnr0 {
            @Override // xsna.wnr0
            public final void a(Context context, UserId userId) {
            }

            @Override // xsna.wnr0
            public final void c(Context context, UserId userId) {
            }

            @Override // xsna.wnr0
            public final void d(Context context, boolean z) {
            }

            @Override // xsna.wnr0
            public final void b(Context context, UserId userId, String str) {
            }
        }
    }

    default void a(Context context, UserId userId) {
    }
}
