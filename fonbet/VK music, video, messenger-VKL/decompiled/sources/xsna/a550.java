package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: MusicRouter.kt */
/* loaded from: classes.dex */
public interface a550 {
    static {
        int i = a.a;
    }

    static /* synthetic */ void b(a550 a550Var, Context context, UserId userId, int i, String str, String str2, String str3, String str4, int i2) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        a550Var.a(context, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, false, (i2 & 128) != 0 ? "" : str4);
    }

    /* compiled from: MusicRouter.kt */
    public static final class a {
        private static final a550 STUB = new C2521a();
        public static final /* synthetic */ int a = 0;

        public final a550 getSTUB() {
            return STUB;
        }

        /* compiled from: MusicRouter.kt */
        /* renamed from: xsna.a550$a$a, reason: collision with other inner class name */
        public static final class C2521a implements a550 {
            @Override // xsna.a550
            public final void a(Context context, UserId userId, int i, String str, String str2, String str3, boolean z, String str4) {
            }
        }
    }

    default void a(Context context, UserId userId, int i, String str, String str2, String str3, boolean z, String str4) {
    }
}
