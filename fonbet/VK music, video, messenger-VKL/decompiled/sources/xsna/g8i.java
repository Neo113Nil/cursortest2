package xsna;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: CompletionMarker.kt */
/* loaded from: classes2.dex */
public interface g8i {

    /* compiled from: CompletionMarker.kt */
    public static final class a {
        public final boolean a;
        public final long b;
        public final long c;
        public final g8i d;
        public final Map<g8i, Long> e;
        public final Collection<g8i> f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, long j, long j2, g8i g8iVar, Map<g8i, Long> map, Collection<? extends g8i> collection) {
            this.a = z;
            this.b = j;
            this.c = j2;
            this.d = g8iVar;
            this.e = map;
            this.f = collection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int a = bh10.a(bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            g8i g8iVar = this.d;
            return this.f.hashCode() + v11.a((a + (g8iVar == null ? 0 : g8iVar.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DebugInfo(isCompleted=");
            sb.append(this.a);
            sb.append(", timeoutMs=");
            sb.append(this.b);
            sb.append(", totalTimeMs=");
            sb.append(this.c);
            sb.append(", hangedMarker=");
            sb.append(this.d);
            sb.append(", completedMarkers=");
            sb.append(this.e);
            sb.append(", skippedMarkers=");
            return l4.h(sb, this.f, ')');
        }
    }

    a a(long j, TimeUnit timeUnit);

    void await();

    boolean b(long j);

    String id();
}
