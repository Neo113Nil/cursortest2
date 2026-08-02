package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import xsna.k2a0;

/* compiled from: PhoneActualizationRouter.kt */
/* loaded from: classes4.dex */
public interface l2a0 {

    /* compiled from: PhoneActualizationRouter.kt */
    public static final class b {
    }

    io.reactivex.rxjava3.core.x a(UserId userId, String str, String str2);

    void b(Context context, String str);

    /* compiled from: PhoneActualizationRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final l2a0 getSTUB() {
            return new C3227a();
        }

        /* compiled from: PhoneActualizationRouter.kt */
        /* renamed from: xsna.l2a0$a$a, reason: collision with other inner class name */
        public static final class C3227a implements l2a0 {
            @Override // xsna.l2a0
            public final io.reactivex.rxjava3.core.x a(UserId userId, String str, String str2) {
                return io.reactivex.rxjava3.core.x.k(k2a0.a.a);
            }

            @Override // xsna.l2a0
            public final void b(Context context, String str) {
            }
        }
    }
}
