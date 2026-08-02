package ru.ok.android.webrtc.participant.movie;

import java.util.concurrent.TimeUnit;
import xsna.zcl;

/* loaded from: classes9.dex */
public abstract class MovieDuration {

    public static final class Undefined extends MovieDuration {
        public static final Undefined INSTANCE = new Undefined();

        public Undefined() {
            super(null);
        }
    }

    public static final class Value extends MovieDuration {
        public final long a;
        public final TimeUnit b;

        public Value(long j, TimeUnit timeUnit) {
            super(null);
            this.a = j;
            this.b = timeUnit;
        }

        public static /* synthetic */ Value copy$default(Value value, long j, TimeUnit timeUnit, int i, Object obj) {
            if ((i & 1) != 0) {
                j = value.a;
            }
            if ((i & 2) != 0) {
                timeUnit = value.b;
            }
            return value.copy(j, timeUnit);
        }

        public final long component1() {
            return this.a;
        }

        public final TimeUnit component2() {
            return this.b;
        }

        public final Value copy(long j, TimeUnit timeUnit) {
            return new Value(j, timeUnit);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return this.a == value.a && this.b == value.b;
        }

        public final TimeUnit getTimeUnit() {
            return this.b;
        }

        public final long getValue() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public String toString() {
            return "Value(value=" + this.a + ", timeUnit=" + this.b + ")";
        }
    }

    public MovieDuration(zcl zclVar) {
    }
}
