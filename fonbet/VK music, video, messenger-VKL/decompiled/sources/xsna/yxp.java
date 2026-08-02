package xsna;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import java.util.ArrayList;

/* compiled from: EventBundle.kt */
/* loaded from: classes11.dex */
public final class yxp<T> {
    public final ArrayList<a<T>> a = new ArrayList<>();

    /* compiled from: EventBundle.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> {
        public final long a;
        public final SchemeStat$EventBenchmarkMain.b b;

        public a(long j, SchemeStat$EventBenchmarkMain.b bVar) {
            this.a = j;
            this.b = bVar;
        }

        public final T a() {
            return (T) this.b;
        }

        public final long b() {
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
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Pack(timestampMs=" + this.a + ", event=" + this.b + ')';
        }
    }
}
