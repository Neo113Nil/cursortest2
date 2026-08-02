package xsna;

import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsConfig;
import com.vk.voip.userid.CallsUserId;
import java.util.Calendar;
import java.util.List;

/* compiled from: VoipScheduleCallNavigationEvent.kt */
/* loaded from: classes7.dex */
public abstract class sww0 {

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class a extends sww0 {
        public static final a a = new a();
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class b extends sww0 {
        public final CallId a;
        public final VoipScheduleCallTimeZone b;

        public b(CallId callId, VoipScheduleCallTimeZone voipScheduleCallTimeZone) {
            this.a = callId;
            this.b = voipScheduleCallTimeZone;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.b.hashCode() * 31);
        }

        public final String toString() {
            return "OpenInviteDialog(callId=" + this.a + ", selectedTimeZone=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class c extends sww0 {
        public final VoipScheduledCallSettingsConfig a;

        public c(VoipScheduledCallSettingsConfig voipScheduledCallSettingsConfig) {
            this.a = voipScheduledCallSettingsConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }

        public final String toString() {
            return "ToAdditionalSettings(config=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class d extends sww0 {
        public final ScheduledAudioMuteOption a;

        public d(ScheduledAudioMuteOption scheduledAudioMuteOption) {
            this.a = scheduledAudioMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ToAudioMuteOptionSelector(option=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class e extends sww0 {
        public final CallsUserId a;

        public e(CallsUserId callsUserId) {
            this.a = callsUserId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            CallsUserId callsUserId = this.a;
            if (callsUserId == null) {
                return 0;
            }
            return callsUserId.hashCode();
        }

        public final String toString() {
            return "ToCallAsSelector(preselectedGroupId=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class f extends sww0 {
        public final long a;
        public final mvo0 b;

        public f(long j, mvo0 mvo0Var) {
            this.a = j;
            this.b = mvo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return mvo0.a(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            mvo0 mvo0Var = this.b;
            return hashCode + (mvo0Var == null ? 0 : Long.hashCode(mvo0Var.a));
        }

        public final String toString() {
            return "ToRepeatEndSelector(currentSelectedDate=" + ((Object) mvo0.b(this.a)) + ", repeatEndDate=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class g extends sww0 {
        public final ScheduledCallRecurrence a;
        public final Calendar b;

        public g(ScheduledCallRecurrence scheduledCallRecurrence, Calendar calendar) {
            this.a = scheduledCallRecurrence;
            this.b = calendar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ToRepeatSelector(step=" + this.a + ", scheduleDate=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class h extends sww0 {
        public final CallId a;
        public final g1x0 b;
        public final f1x0 c;
        public final String d;

        public h(CallId callId, g1x0 g1x0Var, f1x0 f1x0Var, String str) {
            this.a = callId;
            this.b = g1x0Var;
            this.c = f1x0Var;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && epx.f(this.d, hVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.b.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToScheduleCallSuccess(callId=");
            sb.append(this.a);
            sb.append(", shareInfo=");
            sb.append(this.b);
            sb.append(", calendarItem=");
            sb.append(this.c);
            sb.append(", dialogSubtitle=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class i extends sww0 {
        public final VoipScheduleCallTimeZone a;
        public final List<VoipScheduleCallTimeZone> b;

        public i(VoipScheduleCallTimeZone voipScheduleCallTimeZone, List<VoipScheduleCallTimeZone> list) {
            this.a = voipScheduleCallTimeZone;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToTimeZoneSelector(selectedTimeZone=");
            sb.append(this.a);
            sb.append(", timeZoneList=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: VoipScheduleCallNavigationEvent.kt */
    public static final class j extends sww0 {
        public final ScheduledVideoMuteOption a;

        public j(ScheduledVideoMuteOption scheduledVideoMuteOption) {
            this.a = scheduledVideoMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ToVideoMuteOptionSelector(option=" + this.a + ')';
        }
    }
}
