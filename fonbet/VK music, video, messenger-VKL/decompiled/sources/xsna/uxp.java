package xsna;

import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;

/* compiled from: ViewState.kt */
/* loaded from: classes7.dex */
public abstract class uxp {

    /* compiled from: ViewState.kt */
    public static final class a extends uxp {
        public static final a a = new a();
    }

    /* compiled from: ViewState.kt */
    public static final class b extends uxp {
        public final VoipScheduleCallTimeZone a;

        public b(VoipScheduleCallTimeZone voipScheduleCallTimeZone) {
            this.a = voipScheduleCallTimeZone;
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
            return "TimeZonePicked(timezone=" + this.a + ')';
        }
    }
}
