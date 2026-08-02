package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.LogoutReason;
import xsna.pgn0;

/* compiled from: SuperappAuthBridge.kt */
/* loaded from: classes11.dex */
public interface egn0 {

    /* compiled from: SuperappAuthBridge.kt */
    public static final class a {
        public static void a(egn0 egn0Var, LogoutReason logoutReason, UserId userId, int i) {
            if ((i & 2) != 0) {
                int i2 = pgn0.a.a;
                userId = egn0Var.c().b;
            }
            egn0Var.a(logoutReason, userId, false);
        }
    }

    /* compiled from: SuperappAuthBridge.kt */
    /* loaded from: classes6.dex */
    public interface b {
        boolean a();

        String j();
    }

    void a(LogoutReason logoutReason, UserId userId, boolean z);

    w25 c();
}
