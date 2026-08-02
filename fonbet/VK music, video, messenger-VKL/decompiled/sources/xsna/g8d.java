package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipMoreMenuParams.kt */
/* loaded from: classes17.dex */
public final class g8d {
    public final a a;
    public final String b;
    public final h8d c;
    public final pih0 d;

    /* compiled from: ClipMoreMenuParams.kt */
    public interface a {

        /* compiled from: ClipMoreMenuParams.kt */
        /* renamed from: xsna.g8d$a$a, reason: collision with other inner class name */
        public static final class C2925a implements a {
            public final ClipFeedTab a;

            public C2925a(ClipFeedTab clipFeedTab) {
                this.a = clipFeedTab;
            }

            @Override // xsna.g8d.a
            public final boolean a() {
                return false;
            }

            @Override // xsna.g8d.a
            public final boolean b() {
                return true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2925a) && epx.f(this.a, ((C2925a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Clips(tab=" + this.a + ')';
            }
        }

        /* compiled from: ClipMoreMenuParams.kt */
        public static final class b implements a {
            public final UserId a;

            public b(UserId userId) {
                this.a = userId;
            }

            @Override // xsna.g8d.a
            public final boolean a() {
                return true;
            }

            @Override // xsna.g8d.a
            public final boolean b() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Community(id="), this.a, ')');
            }
        }

        /* compiled from: ClipMoreMenuParams.kt */
        public static final class c implements a {
            @Override // xsna.g8d.a
            public final boolean a() {
                return false;
            }

            @Override // xsna.g8d.a
            public final boolean b() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Profile(id=null)";
            }
        }

        boolean a();

        boolean b();
    }

    public g8d(a aVar, String str, h8d h8dVar, pih0 pih0Var) {
        this.a = aVar;
        this.b = str;
        this.c = h8dVar;
        this.d = pih0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8d)) {
            return false;
        }
        g8d g8dVar = (g8d) obj;
        return epx.f(this.a, g8dVar.a) && epx.f(this.b, g8dVar.b) && epx.f(this.c, g8dVar.c) && epx.f(this.d, g8dVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        pih0 pih0Var = this.d;
        return hashCode + (pih0Var == null ? 0 : pih0Var.hashCode());
    }

    public final String toString() {
        return "ClipMoreMenuParams(source=" + this.a + ", analyticRef=" + this.b + ", eventConsumer=" + this.c + ", analyticsCallback=" + this.d + ')';
    }
}
