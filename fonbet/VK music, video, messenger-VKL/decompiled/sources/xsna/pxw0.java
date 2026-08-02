package xsna;

import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;

/* compiled from: VoipScheduleCallViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class pxw0 {

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class a extends pxw0 {
        public static final a a = new a();
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class b extends pxw0 {
        public final ScheduledAudioMuteOption a;

        public b(ScheduledAudioMuteOption scheduledAudioMuteOption) {
            this.a = scheduledAudioMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnAudioMuteOptionChange(value=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class c extends pxw0 {
        public static final c a = new c();
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class d extends pxw0 {
        public final VoipScheduledCallDuration a;

        public d(VoipScheduledCallDuration voipScheduledCallDuration) {
            this.a = voipScheduledCallDuration;
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
            return "OnCallDurationChange(value=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class e extends pxw0 {
        public final long a;

        public e(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && mvo0.a(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return "OnCallEndDateChange(value=" + ((Object) mvo0.b(this.a)) + ')';
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class f extends pxw0 {
        public final String a;

        public f(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OnCallNameChange(value="), this.a, ')');
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class g extends pxw0 {
        public final boolean a;

        public g(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnCallNameFocusChanged(hasFocus="), this.a, ')');
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class h extends pxw0 {
        public final long a;

        public h(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && mvo0.a(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return "OnCallStartDateChange(value=" + ((Object) mvo0.b(this.a)) + ')';
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class i extends pxw0 {
        public final mvo0 a;

        public i(mvo0 mvo0Var) {
            this.a = mvo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            mvo0 mvo0Var = this.a;
            if (mvo0Var == null) {
                return 0;
            }
            return Long.hashCode(mvo0Var.a);
        }

        public final String toString() {
            return "OnRepeatEndDateChange(endDate=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class j extends pxw0 {
        public final ScheduledCallRecurrence a;

        public j(ScheduledCallRecurrence scheduledCallRecurrence) {
            this.a = scheduledCallRecurrence;
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
            return "OnRepeatStepChange(value=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class k extends pxw0 {
        public static final k a = new k();
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class l extends pxw0 {
        public final VoipScheduleCallTimeZone a;

        public l(VoipScheduleCallTimeZone voipScheduleCallTimeZone) {
            this.a = voipScheduleCallTimeZone;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnTimeZoneChange(value=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class m extends pxw0 {
        public final ScheduledVideoMuteOption a;

        public m(ScheduledVideoMuteOption scheduledVideoMuteOption) {
            this.a = scheduledVideoMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnVideoMuteOptionChange(value=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class n extends pxw0 {
        public static final n a = new n();
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class o extends pxw0 {
        public static final o a = new o();
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static abstract class p extends pxw0 {

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class a extends p {
            public static final a a = new a();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class b extends p {
            public static final b a = new b();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class c extends p {
            public static final c a = new c();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class d extends p {
            public static final d a = new d();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class e extends p {
            public static final e a = new e();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class f extends p {
            public static final f a = new f();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class g extends p {
            public static final g a = new g();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class h extends p {
            public static final h a = new h();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class i extends p {
            public static final i a = new i();
        }

        /* compiled from: VoipScheduleCallViewEvent.kt */
        public static final class j extends p {
            public static final j a = new j();
        }
    }

    /* compiled from: VoipScheduleCallViewEvent.kt */
    public static final class q extends pxw0 {
        public static final q a = new q();
    }
}
