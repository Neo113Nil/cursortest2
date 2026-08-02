package xsna;

import com.vk.api.generated.auth.dto.AuthGetAuthCodeStatusUserSessionDto;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: AuthCodeStatus.kt */
/* loaded from: classes6.dex */
public interface u25 {

    /* compiled from: AuthCodeStatus.kt */
    public static final class a implements u25 {
        public final String a;
        public final UserId b;
        public final int c;
        public final List<AuthGetAuthCodeStatusUserSessionDto> d;

        public a(int i, String str, List list, UserId userId) {
            this.a = str;
            this.b = userId;
            this.c = i;
            this.d = list;
        }
    }

    /* compiled from: AuthCodeStatus.kt */
    public static final class b implements u25 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1640883575;
        }

        public final String toString() {
            return "Created";
        }
    }

    /* compiled from: AuthCodeStatus.kt */
    public static final class c implements u25 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -580004691;
        }

        public final String toString() {
            return "Declined";
        }
    }

    /* compiled from: AuthCodeStatus.kt */
    public static final class d implements u25 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 316293830;
        }

        public final String toString() {
            return "Expired";
        }
    }

    /* compiled from: AuthCodeStatus.kt */
    public static final class e implements u25 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1373784920;
        }

        public final String toString() {
            return "Opened";
        }
    }
}
