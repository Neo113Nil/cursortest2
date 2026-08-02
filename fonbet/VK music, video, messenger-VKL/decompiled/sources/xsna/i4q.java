package xsna;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExerciseRoute.kt */
/* loaded from: classes12.dex */
public final class i4q {
    public final ArrayList a;

    /* compiled from: ExerciseRoute.kt */
    public static final class a {
        public final Instant a;
        public final double b;
        public final double c;
        public final c2z d;
        public final c2z e;
        public final c2z f;

        public a(Instant instant, double d, double d2, c2z c2zVar, c2z c2zVar2, c2z c2zVar3) {
            this.a = instant;
            this.b = d;
            this.c = d2;
            this.d = c2zVar;
            this.e = c2zVar2;
            this.f = c2zVar3;
            v3r0.e(Double.valueOf(d), Double.valueOf(-90.0d), "latitude");
            v3r0.f(Double.valueOf(d), Double.valueOf(90.0d), "latitude");
            v3r0.e(Double.valueOf(d2), Double.valueOf(-180.0d), "longitude");
            v3r0.f(Double.valueOf(d2), Double.valueOf(180.0d), "longitude");
            if (c2zVar != null) {
                v3r0.e(c2zVar, (c2z) pn00.h(c2zVar.c, c2z.e), "horizontalAccuracy");
            }
            if (c2zVar2 != null) {
                v3r0.e(c2zVar2, (c2z) pn00.h(c2zVar2.c, c2z.e), "verticalAccuracy");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int b = zjh0.b(this.c, zjh0.b(this.b, this.a.hashCode() * 31, 31), 31);
            c2z c2zVar = this.d;
            int hashCode = (b + (c2zVar != null ? c2zVar.hashCode() : 0)) * 31;
            c2z c2zVar2 = this.e;
            int hashCode2 = (hashCode + (c2zVar2 != null ? c2zVar2.hashCode() : 0)) * 31;
            c2z c2zVar3 = this.f;
            return hashCode2 + (c2zVar3 != null ? c2zVar3.hashCode() : 0);
        }

        public final String toString() {
            return "Location(time=" + this.a + ", latitude=" + this.b + ", longitude=" + this.c + ", horizontalAccuracy=" + this.d + ", verticalAccuracy=" + this.e + ", altitude=" + this.f + ')';
        }
    }

    public i4q(ArrayList arrayList) {
        this.a = arrayList;
        int i = 0;
        List D0 = j5g.D0(new j4q(i), arrayList);
        int h = e43.h(D0);
        while (i < h) {
            Instant instant = ((a) D0.get(i)).a;
            i++;
            if (!instant.isBefore(((a) D0.get(i)).a)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4q)) {
            return false;
        }
        return this.a.equals(((i4q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ExerciseRoute(route="), this.a);
    }
}
