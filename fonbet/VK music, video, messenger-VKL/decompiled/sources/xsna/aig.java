package xsna;

import com.vk.voip.api.id.CallId;

/* compiled from: CommonCallListViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class aig implements j59 {

    /* compiled from: CommonCallListViewEvent.kt */
    public static final class a extends aig {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("JoinCallByLinkClick(vkJoinLink="), this.a, ')');
        }
    }

    /* compiled from: CommonCallListViewEvent.kt */
    public static final class b extends aig {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("OpenChatClick(dialogId="));
        }
    }

    /* compiled from: CommonCallListViewEvent.kt */
    public static final class c extends aig {
        public static final c a = new c();
    }

    /* compiled from: CommonCallListViewEvent.kt */
    public static final class d extends aig {
        public static final d a = new d();
    }

    /* compiled from: CommonCallListViewEvent.kt */
    public static final class e extends aig {
        public static final e a = new e();
    }

    /* compiled from: CommonCallListViewEvent.kt */
    public static final class f extends aig {
        public static final f a = new f();
    }

    /* compiled from: CommonCallListViewEvent.kt */
    public static final class g extends aig {
        public final String a;
        public final CallId b;

        public g(CallId callId, String str) {
            this.a = str;
            this.b = callId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShareLinkClick(vkJoinLink=" + this.a + ", callId=" + this.b + ')';
        }
    }

    /* compiled from: CommonCallListViewEvent.kt */
    public static final class h extends aig {
        public final String a;

        public h(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShareQRClick(vkJoinLink="), this.a, ')');
        }
    }
}
