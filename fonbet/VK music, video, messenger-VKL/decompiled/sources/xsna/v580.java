package xsna;

import java.util.ArrayList;

/* compiled from: OnEduRolesEvent.kt */
/* loaded from: classes2.dex */
public abstract class v580 extends sxp {

    /* compiled from: OnEduRolesEvent.kt */
    public static final class a extends v580 {
        public final ArrayList b;
        public final String c = "UpdateEduRolesEvent";

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // xsna.sxp
        public final Object a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdateRolesEvent(users="), this.b);
        }
    }
}
