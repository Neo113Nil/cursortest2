package xsna;

import java.util.ArrayList;

/* compiled from: AddToCallFailure.kt */
/* loaded from: classes7.dex */
public abstract class zn0 {

    /* compiled from: AddToCallFailure.kt */
    public static final class a extends zn0 {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("AlreadyInCall(members="), this.a);
        }
    }

    /* compiled from: AddToCallFailure.kt */
    public static final class b extends zn0 {
        public final whr0 a;

        public b(whr0 whr0Var) {
            this.a = whr0Var;
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
            return "AlreadyInOtherCallRoom(member=" + this.a + ')';
        }
    }

    /* compiled from: AddToCallFailure.kt */
    public static final class c extends zn0 {
        public static final c a = new c();
    }

    /* compiled from: AddToCallFailure.kt */
    public static final class d extends zn0 {
        public static final d a = new d();
    }

    /* compiled from: AddToCallFailure.kt */
    public static final class e extends zn0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "ParticipantsLimit(limit=0)";
        }
    }

    /* compiled from: AddToCallFailure.kt */
    public static final class f extends zn0 {
        public final ArrayList a;

        public f(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Privacy(members="), this.a);
        }
    }

    /* compiled from: AddToCallFailure.kt */
    public static final class g extends zn0 {
        public static final g a = new g();
    }
}
