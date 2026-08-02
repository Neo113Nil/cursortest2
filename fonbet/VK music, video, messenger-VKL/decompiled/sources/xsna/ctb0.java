package xsna;

import java.util.ArrayList;

/* compiled from: PollViewState.kt */
/* loaded from: classes6.dex */
public final class ctb0 implements ao50 {
    public final fi50 a;

    /* compiled from: PollViewState.kt */
    public static final class a implements fm50<trb0> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: PollViewState.kt */
    public static abstract class b {

        /* compiled from: PollViewState.kt */
        public static final class a extends b {
            public final ArrayList a;
            public final boolean b;

            public a(ArrayList arrayList, boolean z) {
                this.a = arrayList;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AllInOne(questionStates=");
                sb.append(this.a);
                sb.append(", isFinished=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: PollViewState.kt */
        /* renamed from: xsna.ctb0$b$b, reason: collision with other inner class name */
        public static final class C2682b extends b {
            public final int a;
            public final ArrayList b;
            public final String c;
            public final boolean d;

            public C2682b(int i, ArrayList arrayList, String str, boolean z) {
                this.a = i;
                this.b = arrayList;
                this.c = str;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2682b)) {
                    return false;
                }
                C2682b c2682b = (C2682b) obj;
                return this.a == c2682b.a && epx.f(this.b, c2682b.b) && epx.f(this.c, c2682b.c) && this.d == c2682b.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + urd0.a(qr.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OneByOne(currentPageIndex=");
                sb.append(this.a);
                sb.append(", pages=");
                sb.append(this.b);
                sb.append(", actionButtonText=");
                sb.append(this.c);
                sb.append(", actionActive=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: PollViewState.kt */
        public static final class c extends b {
            public final xpe0 a;

            public c(xpe0 xpe0Var) {
                this.a = xpe0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OneInOne(questionState=" + this.a + ')';
            }
        }
    }

    public ctb0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
