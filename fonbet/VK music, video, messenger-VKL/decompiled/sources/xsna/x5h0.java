package xsna;

import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.userid.CallsUserId;

/* compiled from: ScheduledCall.kt */
/* loaded from: classes7.dex */
public final class x5h0 {
    public final CallId a;
    public final String b;
    public final CallsUserId c;
    public final String d;
    public final ScheduledCallRecurrence e;
    public final mvo0 f;
    public final long g;
    public final long h;
    public final String i;
    public final s49 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final ScheduledAudioMuteOption n;
    public final ScheduledVideoMuteOption o;
    public final ScheduledWatchTogetherOption p;
    public final boolean q;
    public final boolean r;
    public final long s;
    public final ScheduledScreenSharingMuteOption t;
    public final boolean u;
    public final boolean v;
    public final boolean w;

    public x5h0(CallId callId, String str, CallsUserId callsUserId, String str2, ScheduledCallRecurrence scheduledCallRecurrence, mvo0 mvo0Var, long j, long j2, String str3, s49 s49Var, boolean z, boolean z2, boolean z3, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, boolean z4, boolean z5, long j3, ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption, boolean z6, boolean z7) {
        this.a = callId;
        this.b = str;
        this.c = callsUserId;
        this.d = str2;
        this.e = scheduledCallRecurrence;
        this.f = mvo0Var;
        this.g = j;
        this.h = j2;
        this.i = str3;
        this.j = s49Var;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = scheduledAudioMuteOption;
        this.o = scheduledVideoMuteOption;
        this.p = scheduledWatchTogetherOption;
        this.q = z4;
        this.r = z5;
        this.s = j3;
        this.t = scheduledScreenSharingMuteOption;
        this.u = z6;
        this.v = z7;
        this.w = scheduledCallRecurrence != ScheduledCallRecurrence.NEVER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5h0)) {
            return false;
        }
        x5h0 x5h0Var = (x5h0) obj;
        return epx.f(this.a, x5h0Var.a) && epx.f(this.b, x5h0Var.b) && epx.f(this.c, x5h0Var.c) && epx.f(this.d, x5h0Var.d) && this.e == x5h0Var.e && epx.f(this.f, x5h0Var.f) && mvo0.a(this.g, x5h0Var.g) && this.h == x5h0Var.h && epx.f(this.i, x5h0Var.i) && epx.f(this.j, x5h0Var.j) && this.k == x5h0Var.k && this.l == x5h0Var.l && this.m == x5h0Var.m && this.n == x5h0Var.n && this.o == x5h0Var.o && epx.f(this.p, x5h0Var.p) && this.q == x5h0Var.q && this.r == x5h0Var.r && mvo0.a(this.s, x5h0Var.s) && this.t == x5h0Var.t && this.u == x5h0Var.u && this.v == x5h0Var.v;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + urd0.a((this.c.hashCode() + urd0.a(this.a.b.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31;
        mvo0 mvo0Var = this.f;
        int a = urd0.a(bh10.a(bh10.a((hashCode + (mvo0Var == null ? 0 : Long.hashCode(mvo0Var.a))) * 31, 31, this.g), 31, this.h), 31, this.i);
        s49 s49Var = this.j;
        return Boolean.hashCode(this.v) + qoy.b((this.t.hashCode() + bh10.a(qoy.b(qoy.b((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + qoy.b(qoy.b(qoy.b((a + (s49Var != null ? s49Var.hashCode() : 0)) * 31, 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31)) * 31, 31, this.q), 31, this.r), 31, this.s)) * 31, 31, this.u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledCall(callId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", callerId=");
        sb.append(this.c);
        sb.append(", callerName=");
        sb.append(this.d);
        sb.append(", recurrence=");
        sb.append(this.e);
        sb.append(", repeatUntilTime=");
        sb.append(this.f);
        sb.append(", startTime=");
        sb.append((Object) mvo0.b(this.g));
        sb.append(", durationMs=");
        sb.append(this.h);
        sb.append(", vkJoinLink=");
        sb.append(this.i);
        sb.append(", chat=");
        sb.append(this.j);
        sb.append(", waitingRoom=");
        sb.append(this.k);
        sb.append(", isFeedbackEnabled=");
        sb.append(this.l);
        sb.append(", shouldSkipNotificationReminder=");
        sb.append(this.m);
        sb.append(", audioMuteOption=");
        sb.append(this.n);
        sb.append(", videoMuteOption=");
        sb.append(this.o);
        sb.append(", watchTogetherOption=");
        sb.append(this.p);
        sb.append(", onlyAuthUsers=");
        sb.append(this.q);
        sb.append(", canEdit=");
        sb.append(this.r);
        sb.append(", markerTime=");
        sb.append((Object) mvo0.b(this.s));
        sb.append(", screenSharingOption=");
        sb.append(this.t);
        sb.append(", isRecordEnabled=");
        sb.append(this.u);
        sb.append(", showChatHistory=");
        return defpackage.q0.a(sb, this.v, ')');
    }
}
