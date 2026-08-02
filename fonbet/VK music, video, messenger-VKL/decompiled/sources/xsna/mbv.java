package xsna;

/* compiled from: HolidayInteractionViewModel.kt */
/* loaded from: classes7.dex */
public abstract class mbv {

    /* compiled from: HolidayInteractionViewModel.kt */
    public static final class a extends mbv {
        public static final a a = new a();
    }

    /* compiled from: HolidayInteractionViewModel.kt */
    public static final class b extends mbv {
        public final C3335b a;
        public final int b;
        public final a c;

        /* compiled from: HolidayInteractionViewModel.kt */
        public static final class a {
            public final boolean a;
            public final String b;
            public final String c;

            public a(boolean z, String str, String str2) {
                this.a = z;
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Hint(isVisible=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", message=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: HolidayInteractionViewModel.kt */
        /* renamed from: xsna.mbv$b$b, reason: collision with other inner class name */
        public static final class C3335b {
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public C3335b(String str, String str2, String str3, String str4) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3335b)) {
                    return false;
                }
                C3335b c3335b = (C3335b) obj;
                return epx.f(this.a, c3335b.a) && epx.f(this.b, c3335b.b) && epx.f(this.c, c3335b.c) && epx.f(this.d, c3335b.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StaticData(buttonGradientStartColor=");
                sb.append(this.a);
                sb.append(", buttonGradientEndColor=");
                sb.append(this.b);
                sb.append(", requestButtonText=");
                sb.append(this.c);
                sb.append(", hideButtonText=");
                return ho8.a(sb, this.d, ')');
            }
        }

        public b(C3335b c3335b, int i, a aVar) {
            this.a = c3335b;
            this.b = i;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Idle(staticData=" + this.a + ", bottomInset=" + this.b + ", hint=" + this.c + ')';
        }
    }

    /* compiled from: HolidayInteractionViewModel.kt */
    public static final class c extends mbv {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("InProgress(stopButtonText="), this.a, ')');
        }
    }

    /* compiled from: HolidayInteractionViewModel.kt */
    public static final class d extends mbv {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public d(String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestReceived(buttonGradientStartColor=");
            sb.append(this.a);
            sb.append(", buttonGradientEndColor=");
            sb.append(this.b);
            sb.append(", incomingRequestMessage=");
            sb.append(this.c);
            sb.append(", cancelIncomingButtonText=");
            sb.append(this.d);
            sb.append(", acceptButtonText=");
            sb.append(this.e);
            sb.append(", acceptButtonIconUrl=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: HolidayInteractionViewModel.kt */
    public static final class e extends mbv {
        public final String a;
        public final String b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestSent(cancelOutgoingButtonText=");
            sb.append(this.a);
            sb.append(", outgoingRequestMessage=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
