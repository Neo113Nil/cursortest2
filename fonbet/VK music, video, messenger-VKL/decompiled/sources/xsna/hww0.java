package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;

/* compiled from: VoipScheduleCallAction.kt */
/* loaded from: classes7.dex */
public abstract class hww0 implements kj50 {

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class a extends hww0 {
        public static final a b = new a();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class b extends hww0 {
        public final ScheduledAudioMuteOption b;

        public b(ScheduledAudioMuteOption scheduledAudioMuteOption) {
            this.b = scheduledAudioMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AudioMuteOptionChange(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class c extends hww0 {
        public final VoipScheduledCallDuration b;

        public c(VoipScheduledCallDuration voipScheduledCallDuration) {
            this.b = voipScheduledCallDuration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CallDurationChange(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class d extends hww0 {
        public final long b;

        public d(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && mvo0.a(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return "CallEndDateChange(value=" + ((Object) mvo0.b(this.b)) + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class e extends hww0 {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CallNameChange(value="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class f extends hww0 {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("CallNameFocusChange(hasFocus="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class g extends hww0 {
        public final long b;

        public g(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && mvo0.a(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return "CallStartDateChange(value=" + ((Object) mvo0.b(this.b)) + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class h extends hww0 {
        public static final h b = new h();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class i extends hww0 {
        public static final i b = new i();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class j extends hww0 {
        public static final j b = new j();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class k extends hww0 {
        public static final k b = new k();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static abstract class l extends hww0 {

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class a extends l {
            public static final a b = new a();
        }

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class b extends l {
            public static final b b = new b();
        }

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class c extends l {
            public static final c b = new c();
        }

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class d extends l {
            public static final d b = new d();
        }

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class e extends l {
            public static final e b = new e();
        }

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class f extends l {
            public static final f b = new f();
        }

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class g extends l {
            public static final g b = new g();
        }

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class h extends l {
            public static final h b = new h();
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class m extends hww0 {
        public static final m b = new m();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class n extends hww0 {
        public final mvo0 b;

        public n(mvo0 mvo0Var) {
            this.b = mvo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            mvo0 mvo0Var = this.b;
            if (mvo0Var == null) {
                return 0;
            }
            return Long.hashCode(mvo0Var.a);
        }

        public final String toString() {
            return "RepeatEndDateChange(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class o extends hww0 {
        public final ScheduledCallRecurrence b;

        public o(ScheduledCallRecurrence scheduledCallRecurrence) {
            this.b = scheduledCallRecurrence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RepeatStepChange(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static abstract class p extends hww0 {

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class a extends p {
            public static final a b = new a();
        }

        /* compiled from: VoipScheduleCallAction.kt */
        public static final class b extends p {
            public final UserId b;

            public b(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("SelectGroup(groupId="), this.b, ')');
            }
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class q extends hww0 {
        public static final q b = new q();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class r extends hww0 {
        public final pyw0 b;

        public r(pyw0 pyw0Var) {
            this.b = pyw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SendActionAnalytics(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class s extends hww0 {
        public final VoipScheduleCallTimeZone b;

        public s(VoipScheduleCallTimeZone voipScheduleCallTimeZone) {
            this.b = voipScheduleCallTimeZone;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TimeZoneChange(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class t extends hww0 {
        public static final t b = new t();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class u extends hww0 {
        public final ScheduledVideoMuteOption b;

        public u(ScheduledVideoMuteOption scheduledVideoMuteOption) {
            this.b = scheduledVideoMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.b == ((u) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VideoMuteOptionChange(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class v extends hww0 {
        public static final v b = new v();
    }

    /* compiled from: VoipScheduleCallAction.kt */
    public static final class w extends hww0 {
        public static final w b = new w();
    }
}
