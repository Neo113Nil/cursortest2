package xsna;

import android.content.Context;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UsersStore.kt */
/* loaded from: classes.dex */
public interface c2r0 {

    /* compiled from: UsersStore.kt */
    public static final class a {
        public static final C2636a a = new C2636a();

        /* compiled from: UsersStore.kt */
        /* renamed from: xsna.c2r0$a$a, reason: collision with other inner class name */
        public static final class C2636a implements c2r0 {
            @Override // xsna.c2r0
            public final boolean b(Context context, UserId userId) {
                return false;
            }

            @Override // xsna.c2r0
            public final io.reactivex.rxjava3.core.x<List<b>> c(Context context, boolean z) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.c2r0
            public final List<b> h(Context context, boolean z) {
                return EmptyList.b;
            }

            @Override // xsna.c2r0
            public final boolean i(Context context, UserId userId) {
                return false;
            }

            @Override // xsna.c2r0
            public final boolean j(Context context, b bVar) {
                return false;
            }

            @Override // xsna.c2r0
            public final boolean k(Context context, b bVar) {
                return false;
            }
        }
    }

    boolean b(Context context, UserId userId);

    io.reactivex.rxjava3.core.x<List<b>> c(Context context, boolean z);

    List<b> h(Context context, boolean z);

    boolean i(Context context, UserId userId);

    boolean j(Context context, b bVar);

    boolean k(Context context, b bVar);

    /* compiled from: UsersStore.kt */
    /* loaded from: classes15.dex */
    public static final class b {
        public final UserId a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;
        public final AccountProfileType i;
        public final long j;

        public b(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, boolean z, AccountProfileType accountProfileType) {
            this.a = userId;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = z;
            this.i = accountProfileType;
        }

        public final String a() {
            return this.g;
        }

        public final long b() {
            return this.j;
        }

        public final AccountProfileType c() {
            return this.i;
        }

        public final UserId d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            int a = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            return this.i.hashCode() + qoy.b(urd0.a((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
        }

        public final String toString() {
            return "UserEntry(userId=" + this.a + ", firstName=" + this.b + ", lastName=" + this.c + ", phone=" + this.d + ", email=" + this.e + ", avatar=" + this.f + ", exchangeToken=" + this.g + ", loggedIn=" + this.h + ", profileType=" + this.i + ')';
        }

        public b(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, boolean z, long j, AccountProfileType accountProfileType) {
            this(userId, str, str2, str3, str4, str5, str6, z, accountProfileType);
            this.j = j;
        }

        public b(UserId userId, String str, String str2, String str3, boolean z, AccountProfileType accountProfileType) {
            this(userId, str, null, null, null, str2, str3, z, accountProfileType);
        }
    }
}
