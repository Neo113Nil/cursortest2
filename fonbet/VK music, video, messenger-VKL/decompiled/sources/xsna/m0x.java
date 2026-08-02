package xsna;

import java.util.concurrent.ConcurrentHashMap;
import xsna.n0x;

/* compiled from: InlineNpsRepository.kt */
/* loaded from: classes17.dex */
public final class m0x {
    public final io.reactivex.rxjava3.subjects.f<a> a = new io.reactivex.rxjava3.subjects.f<>();
    public final ConcurrentHashMap<String, n0x> b = new ConcurrentHashMap<>();

    /* compiled from: InlineNpsRepository.kt */
    public static final class a {
        public final String a;
        public final n0x b;

        public a(String str, n0x n0xVar) {
            this.a = str;
            this.b = n0xVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateEvent(uniqueKey=" + this.a + ", inlineNpsState=" + this.b + ')';
        }
    }

    public final void a(String str, n0x n0xVar) {
        boolean z = n0xVar instanceof n0x.a;
        ConcurrentHashMap<String, n0x> concurrentHashMap = this.b;
        if (z) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, n0xVar);
        }
        this.a.onNext(new a(str, n0xVar));
    }
}
