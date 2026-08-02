package ru.ok.android.webrtc.utils.time;

import kotlin.NoWhenBranchMatchedException;
import okcalls.e2;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class Timestamp {
    public static final Companion Companion = new Companion(null);
    public final long a;
    public final e2 b;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final Timestamp local(long j) {
            return new Timestamp(j, e2.a, null);
        }

        public final Timestamp server(long j) {
            return new Timestamp(j, e2.c, null);
        }

        public final Timestamp utc(long j) {
            return new Timestamp(j, e2.b, null);
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e2.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Timestamp(long j, e2 e2Var, zcl zclVar) {
        this.a = j;
        this.b = e2Var;
    }

    public static final Timestamp local(long j) {
        return Companion.local(j);
    }

    public static final Timestamp server(long j) {
        return Companion.server(j);
    }

    public static final Timestamp utc(long j) {
        return Companion.utc(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Timestamp.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Timestamp timestamp = (Timestamp) obj;
        return this.a == timestamp.a && this.b == timestamp.b;
    }

    public final Long getServerTime(TimeProvider timeProvider) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return Long.valueOf(this.a);
        }
        if (i == 2) {
            Long serverTimeMs = timeProvider.getServerTimeMs();
            if (serverTimeMs != null) {
                return Long.valueOf(serverTimeMs.longValue() - timeProvider.utcTimeMs());
            }
            return null;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Long serverTimeMs2 = timeProvider.getServerTimeMs();
        if (serverTimeMs2 != null) {
            return Long.valueOf(serverTimeMs2.longValue() - timeProvider.localTimeMs());
        }
        return null;
    }

    public final long getTimestamp() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
