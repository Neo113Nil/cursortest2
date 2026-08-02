package xsna;

import com.vk.voip.ui.sessionrooms.f;
import java.util.ArrayList;
import java.util.Collection;
import xsna.wwi0;

/* compiled from: SessionRoomsFeatureViewState.kt */
/* loaded from: classes7.dex */
public final class ywi0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;
    public final fi50 f;
    public final fi50 g;
    public final fi50 h;

    /* compiled from: SessionRoomsFeatureViewState.kt */
    public static final class a implements fm50<wwi0> {
        public final yzt0<Collection<f.a.b>> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("AdminInMainCall(rooms="), this.a, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureViewState.kt */
    public static final class b implements fm50<wwi0> {
        public final yzt0<a> a;

        /* compiled from: SessionRoomsFeatureViewState.kt */
        public static final class a {
            public final f.a.b a;
            public final ArrayList b;

            public a(f.a.b bVar, ArrayList arrayList) {
                this.a = bVar;
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Rooms(room=");
                sb.append(this.a);
                sb.append(", rooms=");
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
            }
        }

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("AdminInRoom(rooms="), this.a, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureViewState.kt */
    public static final class c implements fm50<wwi0> {
        public static final c a = new c();
    }

    /* compiled from: SessionRoomsFeatureViewState.kt */
    public static final class d implements fm50<wwi0> {
        public final yzt0<wwi0.a> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("CountDownTimer(countdownTimer="), this.a, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureViewState.kt */
    public static final class e implements fm50<wwi0> {
        public final yzt0<f.a> a;

        public e(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("MainCall(proposedRoom="), this.a, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureViewState.kt */
    public static final class f implements fm50<wwi0> {
        public final yzt0<f.a.b> a;

        public f(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Room(room="), this.a, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureViewState.kt */
    public static final class g implements fm50<wwi0> {
        public final yzt0<izs<f.a.b, Boolean>> a;

        public g(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("RoomsFilter(filter="), this.a, ')');
        }
    }

    /* compiled from: SessionRoomsFeatureViewState.kt */
    public static final class h implements fm50<wwi0> {
        public static final h a = new h();
    }

    public ywi0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5, fi50 fi50Var6, fi50 fi50Var7, fi50 fi50Var8) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
        this.f = fi50Var6;
        this.g = fi50Var7;
        this.h = fi50Var8;
    }
}
