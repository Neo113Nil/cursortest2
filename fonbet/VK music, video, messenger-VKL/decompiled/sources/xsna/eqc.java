package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: ClipDeduplicator.kt */
@ozl
/* loaded from: classes17.dex */
public final class eqc {
    public final Set<String> a = Collections.synchronizedSet(new LinkedHashSet());
    public int b;

    /* compiled from: ClipDeduplicator.kt */
    public static abstract class a<T> {

        /* compiled from: ClipDeduplicator.kt */
        /* renamed from: xsna.eqc$a$a, reason: collision with other inner class name */
        public static final class C2834a extends a {
            public static final C2834a a = new C2834a();
        }

        /* compiled from: ClipDeduplicator.kt */
        public static final class b<T> extends a<T> {
            public final ArrayList a;

            public b(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("OK(items="), this.a);
            }
        }

        /* compiled from: ClipDeduplicator.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }
}
