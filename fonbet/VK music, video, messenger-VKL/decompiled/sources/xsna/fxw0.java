package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallHighlightItem;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import java.util.List;

/* compiled from: VoipScheduleCallState.kt */
/* loaded from: classes7.dex */
public abstract class fxw0 implements km50 {

    /* compiled from: VoipScheduleCallState.kt */
    public static final class b extends fxw0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("Error(error="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduleCallState.kt */
    public static final class c extends fxw0 {
        public static final c b = new c();
    }

    /* compiled from: VoipScheduleCallState.kt */
    public static final class d extends fxw0 {
        public static final d b = new d();
    }

    /* compiled from: VoipScheduleCallState.kt */
    public static final class e extends fxw0 {
        public static final e b = new e();
    }

    /* compiled from: VoipScheduleCallState.kt */
    public static final class f extends fxw0 {
        public static final f b = new f();
    }

    /* compiled from: VoipScheduleCallState.kt */
    public static final class a extends fxw0 {
        public final CallId b;
        public final List<rww0> c;
        public final String d;
        public final long e;
        public final mvo0 f;
        public final long g;
        public final VoipScheduleCallTimeZone h;
        public final List<VoipScheduleCallTimeZone> i;
        public final ScheduledCallRecurrence j;
        public final mvo0 k;
        public final AbstractC2899a l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final boolean q;
        public final String r;
        public final ScheduledAudioMuteOption s;
        public final ScheduledVideoMuteOption t;
        public final ScheduledWatchTogetherOption u;
        public final boolean v;
        public final ScheduledCallHighlightItem w;
        public final ScheduledScreenSharingMuteOption x;
        public final boolean y;
        public final boolean z;

        /* compiled from: VoipScheduleCallState.kt */
        /* renamed from: xsna.fxw0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2899a {

            /* compiled from: VoipScheduleCallState.kt */
            /* renamed from: xsna.fxw0$a$a$a, reason: collision with other inner class name */
            public static final class C2900a extends AbstractC2899a {
                public static final C2900a a = new C2900a();
            }

            /* compiled from: VoipScheduleCallState.kt */
            /* renamed from: xsna.fxw0$a$a$b */
            public static final class b extends AbstractC2899a {
                public final rww0 a;

                public b(rww0 rww0Var) {
                    this.a = rww0Var;
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
                    return "Group(group=" + this.a + ')';
                }
            }
        }

        public a() {
            throw null;
        }

        public a(CallId callId, List list, String str, long j, mvo0 mvo0Var, long j2, VoipScheduleCallTimeZone voipScheduleCallTimeZone, List list2, ScheduledCallRecurrence scheduledCallRecurrence, mvo0 mvo0Var2, AbstractC2899a abstractC2899a, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, boolean z6, ScheduledCallHighlightItem scheduledCallHighlightItem, ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption, boolean z7, boolean z8) {
            this.b = callId;
            this.c = list;
            this.d = str;
            this.e = j;
            this.f = mvo0Var;
            this.g = j2;
            this.h = voipScheduleCallTimeZone;
            this.i = list2;
            this.j = scheduledCallRecurrence;
            this.k = mvo0Var2;
            this.l = abstractC2899a;
            this.m = z;
            this.n = z2;
            this.o = z3;
            this.p = z4;
            this.q = z5;
            this.r = str2;
            this.s = scheduledAudioMuteOption;
            this.t = scheduledVideoMuteOption;
            this.u = scheduledWatchTogetherOption;
            this.v = z6;
            this.w = scheduledCallHighlightItem;
            this.x = scheduledScreenSharingMuteOption;
            this.y = z7;
            this.z = z8;
        }

        public static a a(a aVar, CallId callId, String str, long j, long j2, VoipScheduleCallTimeZone voipScheduleCallTimeZone, ScheduledCallRecurrence scheduledCallRecurrence, mvo0 mvo0Var, AbstractC2899a abstractC2899a, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, boolean z6, ScheduledCallHighlightItem scheduledCallHighlightItem, ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption, boolean z7, boolean z8, int i) {
            CallId callId2 = (i & 1) != 0 ? aVar.b : callId;
            List<rww0> list = aVar.c;
            String str3 = (i & 4) != 0 ? aVar.d : str;
            long j3 = (i & 8) != 0 ? aVar.e : j;
            mvo0 mvo0Var2 = aVar.f;
            long j4 = (i & 32) != 0 ? aVar.g : j2;
            VoipScheduleCallTimeZone voipScheduleCallTimeZone2 = (i & 64) != 0 ? aVar.h : voipScheduleCallTimeZone;
            List<VoipScheduleCallTimeZone> list2 = aVar.i;
            ScheduledCallRecurrence scheduledCallRecurrence2 = (i & 256) != 0 ? aVar.j : scheduledCallRecurrence;
            mvo0 mvo0Var3 = (i & 512) != 0 ? aVar.k : mvo0Var;
            AbstractC2899a abstractC2899a2 = (i & 1024) != 0 ? aVar.l : abstractC2899a;
            boolean z9 = (i & 2048) != 0 ? aVar.m : z;
            boolean z10 = (i & 4096) != 0 ? aVar.n : z2;
            boolean z11 = (i & 8192) != 0 ? aVar.o : z3;
            boolean z12 = (i & 16384) != 0 ? aVar.p : z4;
            boolean z13 = (32768 & i) != 0 ? aVar.q : z5;
            String str4 = (65536 & i) != 0 ? aVar.r : str2;
            ScheduledAudioMuteOption scheduledAudioMuteOption2 = (131072 & i) != 0 ? aVar.s : scheduledAudioMuteOption;
            ScheduledVideoMuteOption scheduledVideoMuteOption2 = (262144 & i) != 0 ? aVar.t : scheduledVideoMuteOption;
            ScheduledWatchTogetherOption scheduledWatchTogetherOption2 = (524288 & i) != 0 ? aVar.u : scheduledWatchTogetherOption;
            boolean z14 = (1048576 & i) != 0 ? aVar.v : z6;
            ScheduledCallHighlightItem scheduledCallHighlightItem2 = (2097152 & i) != 0 ? aVar.w : scheduledCallHighlightItem;
            ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption2 = (4194304 & i) != 0 ? aVar.x : scheduledScreenSharingMuteOption;
            boolean z15 = (8388608 & i) != 0 ? aVar.y : z7;
            boolean z16 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? aVar.z : z8;
            aVar.getClass();
            return new a(callId2, list, str3, j3, mvo0Var2, j4, voipScheduleCallTimeZone2, list2, scheduledCallRecurrence2, mvo0Var3, abstractC2899a2, z9, z10, z11, z12, z13, str4, scheduledAudioMuteOption2, scheduledVideoMuteOption2, scheduledWatchTogetherOption2, z14, scheduledCallHighlightItem2, scheduledScreenSharingMuteOption2, z15, z16);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && mvo0.a(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && this.j == aVar.j && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && epx.f(this.r, aVar.r) && this.s == aVar.s && this.t == aVar.t && epx.f(this.u, aVar.u) && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && this.y == aVar.y && this.z == aVar.z;
        }

        public final int hashCode() {
            int a = bh10.a(urd0.a(fw3.a(this.b.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            mvo0 mvo0Var = this.f;
            int hashCode = (this.j.hashCode() + fw3.a((this.h.hashCode() + bh10.a((a + (mvo0Var == null ? 0 : Long.hashCode(mvo0Var.a))) * 31, 31, this.g)) * 31, 31, this.i)) * 31;
            mvo0 mvo0Var2 = this.k;
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.l.hashCode() + ((hashCode + (mvo0Var2 == null ? 0 : Long.hashCode(mvo0Var2.a))) * 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
            String str = this.r;
            int b2 = qoy.b((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.v);
            ScheduledCallHighlightItem scheduledCallHighlightItem = this.w;
            return Boolean.hashCode(this.z) + qoy.b((this.x.hashCode() + ((b2 + (scheduledCallHighlightItem != null ? scheduledCallHighlightItem.hashCode() : 0)) * 31)) * 31, 31, this.y);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(callId=");
            sb.append(this.b);
            sb.append(", groups=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", scheduleDate=");
            sb.append((Object) mvo0.b(this.e));
            sb.append(", markerTime=");
            sb.append(this.f);
            sb.append(", durationMs=");
            sb.append(this.g);
            sb.append(", selectedTimeZone=");
            sb.append(this.h);
            sb.append(", timeZoneList=");
            sb.append(this.i);
            sb.append(", repeatStep=");
            sb.append(this.j);
            sb.append(", repeatUntilDate=");
            sb.append(this.k);
            sb.append(", scheduleAs=");
            sb.append(this.l);
            sb.append(", isWaitingHallEnabled=");
            sb.append(this.m);
            sb.append(", shouldSkipNotificationReminder=");
            sb.append(this.n);
            sb.append(", isAnonymousJoinEnabled=");
            sb.append(this.o);
            sb.append(", isFeedbackEnabled=");
            sb.append(this.p);
            sb.append(", isLoading=");
            sb.append(this.q);
            sb.append(", link=");
            sb.append(this.r);
            sb.append(", audioMuteOption=");
            sb.append(this.s);
            sb.append(", videoMuteOption=");
            sb.append(this.t);
            sb.append(", isWatchTogetherOption=");
            sb.append(this.u);
            sb.append(", nameFieldHasFocus=");
            sb.append(this.v);
            sb.append(", highlightItem=");
            sb.append(this.w);
            sb.append(", screenSharingMuteOption=");
            sb.append(this.x);
            sb.append(", onlyAdminCanRecord=");
            sb.append(this.y);
            sb.append(", shouldShowChatHistory=");
            return defpackage.q0.a(sb, this.z, ')');
        }

        public /* synthetic */ a(CallId callId, List list, String str, long j, mvo0 mvo0Var, long j2, VoipScheduleCallTimeZone voipScheduleCallTimeZone, List list2, ScheduledCallRecurrence scheduledCallRecurrence, mvo0 mvo0Var2, AbstractC2899a abstractC2899a, boolean z, boolean z2, boolean z3, boolean z4, String str2, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption, boolean z5, boolean z6, int i) {
            this(callId, list, str, j, mvo0Var, j2, voipScheduleCallTimeZone, list2, scheduledCallRecurrence, mvo0Var2, abstractC2899a, z, z2, z3, z4, false, (i & 65536) != 0 ? null : str2, scheduledAudioMuteOption, scheduledVideoMuteOption, scheduledWatchTogetherOption, false, null, scheduledScreenSharingMuteOption, z5, z6);
        }
    }
}
