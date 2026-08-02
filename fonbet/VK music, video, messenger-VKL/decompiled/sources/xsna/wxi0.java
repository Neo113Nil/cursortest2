package xsna;

import com.vk.dto.common.id.UserId;
import xsna.usi0;

/* compiled from: SessionsChangeReductionResult.kt */
/* loaded from: classes6.dex */
public interface wxi0 {

    /* compiled from: SessionsChangeReductionResult.kt */
    public static final class a implements wxi0 {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final UserId a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Added(addedId="), this.a, ')');
        }
    }

    /* compiled from: SessionsChangeReductionResult.kt */
    public static final class b implements wxi0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -176953171;
        }

        public final String toString() {
            return "Default";
        }
    }

    /* compiled from: SessionsChangeReductionResult.kt */
    public static final class c implements wxi0 {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }

        public final UserId a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Logout(logoutId="), this.a, ')');
        }
    }

    /* compiled from: SessionsChangeReductionResult.kt */
    public static final class d implements wxi0 {
        public final usi0.a a;
        public final usi0.a b;

        public d(usi0.a aVar, usi0.a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        public final usi0.a a() {
            return this.b;
        }

        public final usi0.a b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SessionsSwitch(oldSession=" + this.a + ", newSession=" + this.b + ')';
        }
    }
}
