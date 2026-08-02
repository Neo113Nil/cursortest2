package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: VideoFocusStrategy.kt */
/* loaded from: classes11.dex */
public interface ams0 {

    /* compiled from: VideoFocusStrategy.kt */
    /* loaded from: classes6.dex */
    public interface a {

        /* compiled from: VideoFocusStrategy.kt */
        /* renamed from: xsna.ams0$a$a, reason: collision with other inner class name */
        public static final class C2550a implements a {
            public final bms0 a;

            public C2550a(bms0 bms0Var) {
                this.a = bms0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2550a) && epx.f(this.a, ((C2550a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "HandledChanged(transitionData=" + this.a + ')';
            }
        }

        /* compiled from: VideoFocusStrategy.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -707149157;
            }

            public final String toString() {
                return "HandledUnchanged";
            }
        }

        /* compiled from: VideoFocusStrategy.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -882672249;
            }

            public final String toString() {
                return "Unhandled";
            }
        }
    }

    a a(u8f0 u8f0Var, ArrayList arrayList, LinkedHashMap linkedHashMap, iht0 iht0Var);
}
