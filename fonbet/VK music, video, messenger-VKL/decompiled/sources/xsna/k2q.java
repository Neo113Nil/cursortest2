package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ExchangeTokenRepository.kt */
/* loaded from: classes.dex */
public interface k2q {

    /* compiled from: ExchangeTokenRepository.kt */
    /* loaded from: classes15.dex */
    public static final class a {
    }

    /* compiled from: ExchangeTokenRepository.kt */
    /* loaded from: classes15.dex */
    public static final class b {
        public final List<h2q> a;
        public final boolean b;

        public b(List<h2q> list, boolean z) {
            this.a = list;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TokensState(tokens=");
            sb.append(this.a);
            sb.append(", isLoggedIn=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    String a(UserId userId);

    void b(UserId userId, String str, boolean z);

    void c();
}
