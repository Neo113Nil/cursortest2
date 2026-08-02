package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import xsna.fi20;

/* compiled from: SlowMotionData.java */
/* loaded from: classes12.dex */
public final class a3k0 implements fi20.a {
    public final ArrayList a;

    /* compiled from: SlowMotionData.java */
    public static final class a {
        public final long a;
        public final long b;
        public final int c;

        public a(long j, long j2, int i) {
            fxc0.p(j < j2);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            String str = y2r0.a;
            Locale locale = Locale.US;
            StringBuilder b = fp.b(this.a, "Segment: startTimeMs=", ", endTimeMs=");
            b.append(this.b);
            b.append(", speedDivisor=");
            b.append(this.c);
            return b.toString();
        }
    }

    public a3k0(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((a) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((a) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        fxc0.p(!z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a3k0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((a3k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
