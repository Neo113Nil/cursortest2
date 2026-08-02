package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: AutoLockTimeStrategy.kt */
/* loaded from: classes.dex */
public abstract class ug5 {
    public final int a;

    /* compiled from: AutoLockTimeStrategy.kt */
    public static final class a extends ug5 {
        public static final a b = new a(5);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -957790458;
        }

        public final String toString() {
            return "FiveMinutes";
        }
    }

    /* compiled from: AutoLockTimeStrategy.kt */
    /* loaded from: classes15.dex */
    public static final class b extends ug5 {
        public static final b b = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1046362326;
        }

        public final String toString() {
            return "Immediate";
        }
    }

    /* compiled from: AutoLockTimeStrategy.kt */
    /* loaded from: classes15.dex */
    public static final class c extends ug5 {
        public static final c b = new c(1);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -750752877;
        }

        public final String toString() {
            return "OneMinute";
        }
    }

    /* compiled from: AutoLockTimeStrategy.kt */
    /* loaded from: classes15.dex */
    public static final class d extends ug5 {
        public static final d b = new d(30);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1152076906;
        }

        public final String toString() {
            return "ThirtyMinutes";
        }
    }

    public ug5(int i) {
        this.a = i;
    }

    public final long a() {
        return TimeUnit.MINUTES.toMillis(this.a);
    }
}
