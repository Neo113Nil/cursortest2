package xsna;

/* compiled from: HolidayInteractionProtocolEvent.kt */
/* loaded from: classes7.dex */
public abstract class abv {

    /* compiled from: HolidayInteractionProtocolEvent.kt */
    public static final class a extends abv {
        public static final a a = new a();
    }

    /* compiled from: HolidayInteractionProtocolEvent.kt */
    public static final class b extends abv {
        public static final b a = new b();
    }

    /* compiled from: HolidayInteractionProtocolEvent.kt */
    public static final class c extends abv {
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
            return ho8.a(new StringBuilder("Ready(interactionId="), this.a, ')');
        }
    }

    /* compiled from: HolidayInteractionProtocolEvent.kt */
    public static final class d extends abv {
        public static final d a = new d();
    }
}
