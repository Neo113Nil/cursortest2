package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StrictModeHelper.kt */
/* loaded from: classes.dex */
public final class vpm0 {
    public final bpn0 a = new bpn0(new wv8(8));

    /* compiled from: StrictModeHelper.kt */
    /* loaded from: classes17.dex */
    public interface a {

        /* compiled from: StrictModeHelper.kt */
        /* renamed from: xsna.vpm0$a$a, reason: collision with other inner class name */
        public static final class C3898a implements a {
            public static final C3898a a = new C3898a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3898a);
            }

            public final int hashCode() {
                return 305675863;
            }

            public final String toString() {
                return "CatchAll";
            }
        }

        /* compiled from: StrictModeHelper.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1862181871;
            }

            public final String toString() {
                return "SkipAll";
            }
        }

        /* compiled from: StrictModeHelper.kt */
        public static final class c implements a {
            public final ArrayList a;

            public c(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final List<String> b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SkipAnyOf(containsAnyOf="), this.a);
            }
        }

        default boolean a(StackTraceElement stackTraceElement) {
            if (!equals(C3898a.a)) {
                if (equals(b.a)) {
                    return true;
                }
                if (!(this instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList = ((c) this).a;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (drm0.D(stackTraceElement.toString(), (String) it.next(), false)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
