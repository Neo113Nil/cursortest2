package xsna;

/* compiled from: BroadcastScheduledViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class ii8 {

    /* compiled from: BroadcastScheduledViewEvent.kt */
    public static final class a extends ii8 {
        public static final a a = new a();
    }

    /* compiled from: BroadcastScheduledViewEvent.kt */
    public static final class b extends ii8 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SelectBroadcast(id="), this.a, ')');
        }
    }
}
