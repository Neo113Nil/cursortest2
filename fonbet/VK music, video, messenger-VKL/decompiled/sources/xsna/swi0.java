package xsna;

import java.util.ArrayList;
import xsna.wwi0;

/* compiled from: SessionRoomsFeaturePatch.kt */
/* loaded from: classes7.dex */
public interface swi0 extends xl50 {

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class a implements swi0 {
        public final wwi0.a b;

        public a(wwi0.a aVar) {
            this.b = aVar;
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
            return "CountDownTimer(countdownTimer=" + this.b + ')';
        }
    }

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class b implements swi0 {
        public static final b b = new b();
    }

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class c implements swi0 {
        public final wwi0.c.C3962c b;
        public final boolean c;

        public c(wwi0.c.C3962c c3962c, boolean z) {
            this.b = c3962c;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetActiveRoom(room=");
            sb.append(this.b);
            sb.append(", postponeNotification=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class d implements swi0 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetMeIsAdmin(isAdmin="), this.b, ')');
        }
    }

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class e implements swi0 {
        public final wwi0.c b;

        public e(wwi0.c cVar) {
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetProposedRoom(room=" + this.b + ')';
        }
    }

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class f implements swi0 {
        public final ArrayList b;

        public f(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b.equals(((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SetRoomsList(rooms="), this.b);
        }
    }

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class g implements swi0 {
        public final wwi0.c b;
        public final wwi0.c c;

        public g(wwi0.c cVar, wwi0.c cVar2) {
            this.b = cVar;
            this.c = cVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "StartTransition(from=" + this.b + ", to=" + this.c + ')';
        }
    }

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class h implements swi0 {
        public static final h b = new h();
    }

    /* compiled from: SessionRoomsFeaturePatch.kt */
    public static final class i implements swi0 {
        public final wwi0.c.C3962c b;

        public i(wwi0.c.C3962c c3962c) {
            this.b = c3962c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateRoom(room=" + this.b + ')';
        }
    }
}
