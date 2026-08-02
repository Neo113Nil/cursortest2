package xsna;

import android.accounts.Account;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AccountManagerRepository.kt */
/* loaded from: classes.dex */
public interface mp {

    /* compiled from: AccountManagerRepository.kt */
    /* loaded from: classes14.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final mp STUB = new C3361a();

        /* compiled from: AccountManagerRepository.kt */
        /* renamed from: xsna.mp$a$a, reason: collision with other inner class name */
        public static final class C3361a implements mp {
            @Override // xsna.mp
            public final hp a(UserId userId) {
                return null;
            }

            @Override // xsna.mp
            public final List<hp> b() {
                return EmptyList.b;
            }

            @Override // xsna.mp
            public final boolean c(UserId userId) {
                return false;
            }

            @Override // xsna.mp
            public final Account d(hp hpVar) {
                return null;
            }

            @Override // xsna.mp
            public final hp e(UserId userId) {
                return null;
            }

            @Override // xsna.mp
            public final List<hp> f() {
                return EmptyList.b;
            }

            @Override // xsna.mp
            public final Account g(hp hpVar) {
                return null;
            }
        }

        public final mp getSTUB() {
            return STUB;
        }
    }

    hp a(UserId userId);

    List<hp> b();

    boolean c(UserId userId);

    Account d(hp hpVar);

    hp e(UserId userId);

    List<hp> f();

    Account g(hp hpVar);
}
