package xsna;

import java.util.ArrayList;

/* compiled from: ScheduledCallsPatch.kt */
/* loaded from: classes7.dex */
public abstract class l7h0 implements b59 {

    /* compiled from: ScheduledCallsPatch.kt */
    public static final class a extends l7h0 {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: ScheduledCallsPatch.kt */
    public static final class b extends l7h0 {
        public final ArrayList b;
        public final String c;
        public final boolean d;

        public b(String str, ArrayList arrayList, boolean z) {
            this.b = arrayList;
            this.c = str;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(scheduledCalls=");
            sb.append(this.b);
            sb.append(", nextFrom=");
            sb.append(this.c);
            sb.append(", hasMore=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ScheduledCallsPatch.kt */
    public static final class c extends l7h0 {
        public static final c b = new c();
    }
}
