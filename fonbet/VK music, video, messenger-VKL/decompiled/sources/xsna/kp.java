package xsna;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;

/* compiled from: AccountManagerInteractor.kt */
/* loaded from: classes.dex */
public interface kp {
    Bundle a(AccountAuthenticatorResponse accountAuthenticatorResponse);

    void b(UserId userId);

    /* compiled from: AccountManagerInteractor.kt */
    /* loaded from: classes14.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final kp STUB = new C3193a();

        public final kp getSTUB() {
            return STUB;
        }

        /* compiled from: AccountManagerInteractor.kt */
        /* renamed from: xsna.kp$a$a, reason: collision with other inner class name */
        public static final class C3193a implements kp {
            @Override // xsna.kp
            public final Bundle a(AccountAuthenticatorResponse accountAuthenticatorResponse) {
                return null;
            }

            @Override // xsna.kp
            public final void b(UserId userId) {
            }
        }
    }
}
