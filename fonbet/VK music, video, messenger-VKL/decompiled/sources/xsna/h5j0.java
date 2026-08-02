package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: ShakeDetectorDelegate.kt */
/* loaded from: classes17.dex */
public interface h5j0 {
    public static final /* synthetic */ a a = a.a;

    /* compiled from: ShakeDetectorDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final b b = new b(15.0f, TimeUnit.SECONDS.toMillis(1));
    }

    /* compiled from: ShakeDetectorDelegate.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public final float a;
        public final long b;

        public b(float f, long j) {
            this.a = f;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return Float.compare(this.a, bVar.a) == 0 && this.b == bVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + shy.a(3, io.reactivex.rxjava3.subjects.b.a(this.a, Integer.hashCode(100) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(sensorDelay=100, accelerationThreshold=");
            sb.append(this.a);
            sb.append(", shakeCount=3, shakePeriod=");
            return vu5.a(')', this.b, sb);
        }
    }
}
