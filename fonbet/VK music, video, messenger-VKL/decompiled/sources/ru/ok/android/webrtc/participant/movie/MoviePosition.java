package ru.ok.android.webrtc.participant.movie;

import java.util.concurrent.TimeUnit;
import xsna.zcl;

/* loaded from: classes9.dex */
public abstract class MoviePosition {

    public static final class Defined extends MoviePosition {
        public final long a;
        public final TimeUnit b;

        public Defined(long j, TimeUnit timeUnit) {
            super(null);
            this.a = j;
            this.b = timeUnit;
        }

        public static /* synthetic */ Defined copy$default(Defined defined, long j, TimeUnit timeUnit, int i, Object obj) {
            if ((i & 1) != 0) {
                j = defined.a;
            }
            if ((i & 2) != 0) {
                timeUnit = defined.b;
            }
            return defined.copy(j, timeUnit);
        }

        public final long component1() {
            return this.a;
        }

        public final TimeUnit component2() {
            return this.b;
        }

        public final Defined copy(long j, TimeUnit timeUnit) {
            return new Defined(j, timeUnit);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defined)) {
                return false;
            }
            Defined defined = (Defined) obj;
            return this.a == defined.a && this.b == defined.b;
        }

        public final long getPosition() {
            return this.a;
        }

        public final TimeUnit getTimeUnit() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public String toString() {
            return "Defined(position=" + this.a + ", timeUnit=" + this.b + ")";
        }
    }

    public static final class Undefined extends MoviePosition {
        public static final Undefined INSTANCE = new Undefined();

        public Undefined() {
            super(null);
        }
    }

    public MoviePosition(zcl zclVar) {
    }
}
