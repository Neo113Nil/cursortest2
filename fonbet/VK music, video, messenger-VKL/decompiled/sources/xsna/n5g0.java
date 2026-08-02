package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: ReportFragmentRouter.kt */
/* loaded from: classes5.dex */
public interface n5g0 {
    public static final a a = a.a;

    /* compiled from: ReportFragmentRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final n5g0 STUB = new C3386a();

        public final n5g0 getSTUB() {
            return STUB;
        }

        /* compiled from: ReportFragmentRouter.kt */
        /* renamed from: xsna.n5g0$a$a, reason: collision with other inner class name */
        public static final class C3386a implements n5g0 {
            @Override // xsna.n5g0
            public final void a(int i, Context context, UserId userId) {
            }

            @Override // xsna.n5g0
            public final void b(int i, Context context, UserId userId) {
            }

            @Override // xsna.n5g0
            public final void d(int i, Context context, UserId userId) {
            }

            @Override // xsna.n5g0
            public final void c(Context context, String str, String str2, UserId userId, long j) {
            }
        }
    }

    default void a(int i, Context context, UserId userId) {
    }

    default void b(int i, Context context, UserId userId) {
    }

    default void d(int i, Context context, UserId userId) {
    }

    default void c(Context context, String str, String str2, UserId userId, long j) {
    }
}
