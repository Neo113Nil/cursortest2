package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: InviteFriendsMviState.kt */
/* loaded from: classes14.dex */
public final class uyh0 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final a d;

    public uyh0() {
        this(0);
    }

    public static uyh0 a(uyh0 uyh0Var, boolean z, boolean z2, String str, a aVar, int i) {
        if ((i & 1) != 0) {
            z = uyh0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = uyh0Var.b;
        }
        if ((i & 4) != 0) {
            str = uyh0Var.c;
        }
        if ((i & 8) != 0) {
            aVar = uyh0Var.d;
        }
        uyh0Var.getClass();
        return new uyh0(z, z2, str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyh0)) {
            return false;
        }
        uyh0 uyh0Var = (uyh0) obj;
        return this.a == uyh0Var.a && this.b == uyh0Var.b && epx.f(this.c, uyh0Var.c) && epx.f(this.d, uyh0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SearchState(isVisible=" + this.a + ", isLoading=" + this.b + ", query=" + this.c + ", result=" + this.d + ')';
    }

    /* compiled from: InviteFriendsMviState.kt */
    public interface a {

        /* compiled from: InviteFriendsMviState.kt */
        /* renamed from: xsna.uyh0$a$a, reason: collision with other inner class name */
        public static final class C3855a implements a {
            public static final C3855a a = new C3855a();
        }

        /* compiled from: InviteFriendsMviState.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: InviteFriendsMviState.kt */
        public static final class c implements a {
            public final List<jis> a;
            public final String b;

            public c(List<jis> list, String str) {
                this.a = list;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(foundedFriends=");
                sb.append(this.a);
                sb.append(", nextFrom=");
                return ho8.a(sb, this.b, ')');
            }

            public c() {
                this(EmptyList.b, null);
            }
        }
    }

    public uyh0(boolean z, boolean z2, String str, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = aVar;
    }

    public /* synthetic */ uyh0(int i) {
        this(false, false, "", a.C3855a.a);
    }
}
