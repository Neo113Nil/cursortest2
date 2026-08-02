package xsna;

import java.util.ArrayList;

/* compiled from: NpsOverlayState.kt */
/* loaded from: classes17.dex */
public interface bm70 extends r3q0 {

    /* compiled from: NpsOverlayState.kt */
    public static final class a implements bm70 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // xsna.r3q0
        public final String F() {
            return this.a;
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
            return ho8.a(new StringBuilder("Hidden(uniqueKey="), this.a, ')');
        }
    }

    /* compiled from: NpsOverlayState.kt */
    public interface b extends bm70 {

        /* compiled from: NpsOverlayState.kt */
        public static final class a implements b {
            public final String a;
            public final String b;
            public final String c;
            public final ArrayList d;

            /* compiled from: NpsOverlayState.kt */
            /* renamed from: xsna.bm70$b$a$a, reason: collision with other inner class name */
            public static final class C2613a {
                public final String a;

                public C2613a(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2613a) && epx.f(this.a, ((C2613a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("AnswerState(title="), this.a, ')');
                }
            }

            public a(String str, String str2, String str3, ArrayList arrayList) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = arrayList;
            }

            @Override // xsna.r3q0
            public final String F() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d.equals(aVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Question(uniqueKey=");
                sb.append(this.a);
                sb.append(", coverUrl=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", answers=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
            }
        }

        /* compiled from: NpsOverlayState.kt */
        /* renamed from: xsna.bm70$b$b, reason: collision with other inner class name */
        public static final class C2614b implements b {
            public final String a;

            public C2614b(String str) {
                this.a = str;
            }

            @Override // xsna.r3q0
            public final String F() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2614b) && epx.f(this.a, ((C2614b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Thanks(uniqueKey="), this.a, ')');
            }
        }
    }
}
