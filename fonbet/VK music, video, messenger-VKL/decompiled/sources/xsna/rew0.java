package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: VoipAuthDataProvider.kt */
/* loaded from: classes7.dex */
public interface rew0 {

    /* compiled from: VoipAuthDataProvider.kt */
    public static final class a {
        public final boolean a;
        public final UserId b;
        public final List<UserId> c;

        public a(boolean z, UserId userId, List<UserId> list) {
            this.a = z;
            this.b = userId;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthState(isLoggedIn=");
            sb.append(this.a);
            sb.append(", currentId=");
            sb.append(this.b);
            sb.append(", authenticatedIds=");
            return ms9.a(')', sb, this.c);
        }
    }

    boolean a();

    void b(izs<? super Boolean, s3q0> izsVar);

    io.reactivex.rxjava3.core.q<a> c();

    boolean d();

    void e();

    UserId f();

    void g(UserId userId);

    boolean h();

    String i();

    void j(b bVar);

    void k(b bVar);

    void reset();

    /* compiled from: VoipAuthDataProvider.kt */
    public interface b {
        default void b() {
        }

        default void a(UserId userId) {
        }
    }
}
