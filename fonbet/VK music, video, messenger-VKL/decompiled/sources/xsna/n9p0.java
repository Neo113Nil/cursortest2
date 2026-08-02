package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: TopicsRouter.kt */
/* loaded from: classes11.dex */
public interface n9p0 {
    void a(Context context, UserId userId, boolean z);

    boolean b(int i, int i2, Context context, UserId userId, yp80 yp80Var);

    /* compiled from: TopicsRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final n9p0 STUB = new C3390a();

        public final n9p0 getSTUB() {
            return STUB;
        }

        /* compiled from: TopicsRouter.kt */
        /* renamed from: xsna.n9p0$a$a, reason: collision with other inner class name */
        public static final class C3390a implements n9p0 {
            @Override // xsna.n9p0
            public final boolean b(int i, int i2, Context context, UserId userId, yp80 yp80Var) {
                return false;
            }

            @Override // xsna.n9p0
            public final void a(Context context, UserId userId, boolean z) {
            }
        }
    }
}
