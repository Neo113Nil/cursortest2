package xsna;

import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallDuration;
import java.util.List;

/* compiled from: VoipScheduleCallPatch.kt */
/* loaded from: classes7.dex */
public abstract class tww0 implements xl50 {

    /* compiled from: VoipScheduleCallPatch.kt */
    public static abstract class a extends tww0 {

        /* compiled from: VoipScheduleCallPatch.kt */
        /* renamed from: xsna.tww0$a$a, reason: collision with other inner class name */
        public static final class C3777a extends a {
            public static final C3777a b = new C3777a();
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class b extends tww0 {
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
            return "AudioMuteOption(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static abstract class c extends tww0 {

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class a extends c {
            public static final a b = new a();
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class b extends c {
            public final rww0 b;

            public b(rww0 rww0Var) {
                this.b = rww0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SelectGroup(group=" + this.b + ')';
            }
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class d extends tww0 {
        public final VoipScheduledCallDuration b;

        public d(VoipScheduledCallDuration voipScheduledCallDuration) {
            this.b = voipScheduledCallDuration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CallDuration(duration=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class e extends tww0 {
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
            return ho8.a(new StringBuilder("CallName(value="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class f extends tww0 {
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
            return defpackage.q0.a(new StringBuilder("CallNameFocus(hasFocus="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class g extends tww0 {
        public static final g b = new g();
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class h extends tww0 {
        public static final h b = new h();
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static abstract class i extends tww0 {

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class a extends i {
            public static final a b = new a();
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class b extends i {
            public static final b b = new b();
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static abstract class j extends tww0 {

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class a extends j {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class b extends j {
            public static final b b = new b();
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class c extends j {
            public static final c b = new c();
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static abstract class k extends tww0 {

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class a extends k {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class b extends k {
            public static final b b = new b();
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class c extends k {
            public final List<rww0> b;
            public final VoipScheduleCallTimeZone c;
            public final List<VoipScheduleCallTimeZone> d;
            public final m6h0 e;

            public c(List<rww0> list, VoipScheduleCallTimeZone voipScheduleCallTimeZone, List<VoipScheduleCallTimeZone> list2, m6h0 m6h0Var) {
                this.b = list;
                this.c = voipScheduleCallTimeZone;
                this.d = list2;
                this.e = m6h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
            }

            public final String toString() {
                return "Success(groups=" + this.b + ", defaultTimeZone=" + this.c + ", timeZones=" + this.d + ", scheduledCallSettings=" + this.e + ')';
            }
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class d extends k {
            public final VoipScheduleCallTimeZone b;
            public final List<VoipScheduleCallTimeZone> c;
            public final x5h0 d;

            public d(VoipScheduleCallTimeZone voipScheduleCallTimeZone, List<VoipScheduleCallTimeZone> list, x5h0 x5h0Var) {
                this.b = voipScheduleCallTimeZone;
                this.c = list;
                this.d = x5h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                return "SuccessEdit(defaultTimeZone=" + this.b + ", timeZones=" + this.c + ", call=" + this.d + ')';
            }
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static abstract class l extends tww0 {

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class a extends l {
            public static final a b = new a();
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class b extends l {
            public static final b b = new b();
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class m extends tww0 {
        public final boolean b;

        public m(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("NotificationReminder(shouldSkipNotificationReminder="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class n extends tww0 {
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
            return "RepeatEndDate(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class o extends tww0 {
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
            return "RepeatRecurrence(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class p extends tww0 {
        public final long b;

        public p(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && mvo0.a(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return "ScheduleEndDate(date=" + ((Object) mvo0.b(this.b)) + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class q extends tww0 {
        public final long b;

        public q(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && mvo0.a(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return "ScheduleStartDate(date=" + ((Object) mvo0.b(this.b)) + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class r extends tww0 {
        public final m6h0 b;

        public r(m6h0 m6h0Var) {
            this.b = m6h0Var;
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
            return "SyncSettings(settings=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class s extends tww0 {
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
            return "TimeZone(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static final class t extends tww0 {
        public final ScheduledVideoMuteOption b;

        public t(ScheduledVideoMuteOption scheduledVideoMuteOption) {
            this.b = scheduledVideoMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.b == ((t) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "VideoMuteOption(value=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static abstract class u extends tww0 {

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class a extends u {
            public static final a b = new a();
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class b extends u {
            public static final b b = new b();
        }
    }

    /* compiled from: VoipScheduleCallPatch.kt */
    public static abstract class v extends tww0 {

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class a extends v {
            public static final a b = new a();
        }

        /* compiled from: VoipScheduleCallPatch.kt */
        public static final class b extends v {
            public static final b b = new b();
        }
    }
}
