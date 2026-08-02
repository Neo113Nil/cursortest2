package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;

/* compiled from: UserProfileContentRepository.kt */
/* loaded from: classes5.dex */
public interface rnq0 {

    /* compiled from: UserProfileContentRepository.kt */
    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a(String str, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabPinningInfo(tabName=");
            sb.append(this.a);
            sb.append(", pin=");
            sb.append(this.b);
            sb.append(", private=");
            sb.append(this.c);
            sb.append(", onlyMobile=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    io.reactivex.rxjava3.internal.operators.observable.j1 a();

    io.reactivex.rxjava3.core.q<List<ExtendedUserProfile.m>> b(UserId userId, boolean z);

    io.reactivex.rxjava3.internal.operators.observable.m1 c(int i, UserId userId, int i2);

    io.reactivex.rxjava3.internal.operators.observable.m1 d(UserId userId, String str);

    io.reactivex.rxjava3.internal.operators.observable.j1 e();

    io.reactivex.rxjava3.internal.operators.single.y f(UserId userId, String str, boolean z);

    io.reactivex.rxjava3.internal.operators.single.y g(int i, UserId userId, String str);

    io.reactivex.rxjava3.internal.operators.single.y h(UserId userId, String str);

    void i(a aVar);

    io.reactivex.rxjava3.internal.operators.observable.m1 j(String str);

    io.reactivex.rxjava3.internal.operators.single.y k(UserId userId, Integer num);

    io.reactivex.rxjava3.core.q<xaf> l();

    io.reactivex.rxjava3.internal.operators.observable.j1 m();

    void n(a aVar);

    io.reactivex.rxjava3.core.q o(UserId userId, String str);

    io.reactivex.rxjava3.core.q p(UserId userId, String str);

    io.reactivex.rxjava3.internal.operators.single.y q(UserId userId, String str);

    io.reactivex.rxjava3.internal.operators.single.y r(UserId userId, String str);
}
