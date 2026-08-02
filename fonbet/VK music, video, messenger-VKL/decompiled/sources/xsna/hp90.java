package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: PastCallNavigationEvent.kt */
/* loaded from: classes7.dex */
public abstract class hp90 implements x49 {

    /* compiled from: PastCallNavigationEvent.kt */
    public static final class a extends hp90 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -483003799;
        }

        public final String toString() {
            return "ShowCallDeletedSnack";
        }
    }

    /* compiled from: PastCallNavigationEvent.kt */
    public static final class b extends hp90 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1716648452;
        }

        public final String toString() {
            return "ShowClearCallHistoryImmediateSnack";
        }
    }

    /* compiled from: PastCallNavigationEvent.kt */
    public static final class c extends hp90 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -56615482;
        }

        public final String toString() {
            return "ShowReportCallSnack";
        }
    }

    /* compiled from: PastCallNavigationEvent.kt */
    public static final class d extends hp90 {
        public final CallsUserId a;

        public d(CallsUserId callsUserId) {
            this.a = callsUserId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            CallsUserId callsUserId = this.a;
            if (callsUserId == null) {
                return 0;
            }
            return callsUserId.hashCode();
        }

        public final String toString() {
            return "ToPastCallsFilter(preselectedGroupId=" + this.a + ')';
        }
    }
}
