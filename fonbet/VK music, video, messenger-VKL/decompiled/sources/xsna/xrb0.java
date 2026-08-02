package xsna;

import com.vk.dto.uxpolls.PollAnswer;
import java.util.Map;

/* compiled from: PollUiAction.kt */
/* loaded from: classes6.dex */
public interface xrb0 extends kj50 {

    /* compiled from: PollUiAction.kt */
    public interface a extends xrb0 {

        /* compiled from: PollUiAction.kt */
        /* renamed from: xsna.xrb0$a$a, reason: collision with other inner class name */
        public interface InterfaceC4038a extends a {

            /* compiled from: PollUiAction.kt */
            /* renamed from: xsna.xrb0$a$a$a, reason: collision with other inner class name */
            public static final class C4039a implements InterfaceC4038a {
                public final int b;
                public final int c;

                public C4039a(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4039a)) {
                        return false;
                    }
                    C4039a c4039a = (C4039a) obj;
                    return this.b == c4039a.b && this.c == c4039a.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                @Override // xsna.xrb0.a
                public final int n0() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Selected(qId=");
                    sb.append(this.b);
                    sb.append(", id=");
                    return vu5.b(sb, this.c, ')');
                }
            }
        }

        /* compiled from: PollUiAction.kt */
        public interface b extends a {

            /* compiled from: PollUiAction.kt */
            /* renamed from: xsna.xrb0$a$b$a, reason: collision with other inner class name */
            public static final class C4040a implements b {
                public final int b;
                public final int c;

                public C4040a(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4040a)) {
                        return false;
                    }
                    C4040a c4040a = (C4040a) obj;
                    return this.b == c4040a.b && this.c == c4040a.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                @Override // xsna.xrb0.a
                public final int n0() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Updated(qId=");
                    sb.append(this.b);
                    sb.append(", grade=");
                    return vu5.b(sb, this.c, ')');
                }
            }
        }

        /* compiled from: PollUiAction.kt */
        public interface c extends a {

            /* compiled from: PollUiAction.kt */
            /* renamed from: xsna.xrb0$a$c$a, reason: collision with other inner class name */
            public static final class C4041a implements c {
                public final int b;
                public final String c;

                public C4041a(int i, String str) {
                    this.b = i;
                    this.c = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4041a)) {
                        return false;
                    }
                    C4041a c4041a = (C4041a) obj;
                    return this.b == c4041a.b && epx.f(this.c, c4041a.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
                }

                @Override // xsna.xrb0.a
                public final int n0() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("FeedbackEdited(qId=");
                    sb.append(this.b);
                    sb.append(", feedback=");
                    return ho8.a(sb, this.c, ')');
                }
            }
        }

        /* compiled from: PollUiAction.kt */
        public interface d extends a {

            /* compiled from: PollUiAction.kt */
            /* renamed from: xsna.xrb0$a$d$a, reason: collision with other inner class name */
            public static final class C4042a implements d {
                public final int b;
                public final int c;

                public C4042a(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4042a)) {
                        return false;
                    }
                    C4042a c4042a = (C4042a) obj;
                    return this.b == c4042a.b && this.c == c4042a.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                @Override // xsna.xrb0.a
                public final int n0() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Selected(qId=");
                    sb.append(this.b);
                    sb.append(", star=");
                    return vu5.b(sb, this.c, ')');
                }
            }
        }

        int n0();
    }

    /* compiled from: PollUiAction.kt */
    public static final class b implements xrb0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -444274714;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    /* compiled from: PollUiAction.kt */
    public static final class c implements xrb0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1746670998;
        }

        public final String toString() {
            return "Next";
        }
    }

    /* compiled from: PollUiAction.kt */
    public static final class e implements xrb0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 535124106;
        }

        public final String toString() {
            return "SendPoll";
        }
    }

    /* compiled from: PollUiAction.kt */
    public static final class d implements xrb0 {
        public final Map<Integer, PollAnswer> b;

        public d(Map<Integer, PollAnswer> map) {
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("PresetAnswers(answers="), this.b, ')');
        }

        public d() {
            this(jgp.b);
        }
    }
}
