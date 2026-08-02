package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;

/* compiled from: VoipExtendedStateSnapshot.kt */
/* loaded from: classes7.dex */
public final class cow0 {
    public final CallId a;
    public final UserId b;
    public final long c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Integer i;
    public final VoipCallSource j;
    public final Long k;
    public final boolean l;

    public cow0(CallId callId, UserId userId, long j, String str, int i, boolean z, boolean z2, boolean z3, Integer num, VoipCallSource voipCallSource, Long l, boolean z4) {
        this.a = callId;
        this.b = userId;
        this.c = j;
        this.d = str;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = num;
        this.j = voipCallSource;
        this.k = l;
        this.l = z4;
    }

    public final CallId a() {
        return this.a;
    }

    public final VoipCallSource b() {
        return this.j;
    }

    public final long c() {
        return this.c;
    }

    public final Integer d() {
        return this.i;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cow0)) {
            return false;
        }
        cow0 cow0Var = (cow0) obj;
        return epx.f(this.a, cow0Var.a) && epx.f(this.b, cow0Var.b) && this.c == cow0Var.c && epx.f(this.d, cow0Var.d) && this.e == cow0Var.e && this.f == cow0Var.f && this.g == cow0Var.g && this.h == cow0Var.h && epx.f(this.i, cow0Var.i) && epx.f(this.j, cow0Var.j) && epx.f(this.k, cow0Var.k) && this.l == cow0Var.l;
    }

    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.b.hashCode() * 31;
        UserId userId = this.b;
        int b = qoy.b(qoy.b(qoy.b(shy.a(this.e, urd0.a(bh10.a((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
        Integer num = this.i;
        int hashCode2 = (this.j.hashCode() + ((b + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Long l = this.k;
        return Boolean.hashCode(this.l) + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipExtendedStateSnapshot(callId=");
        sb.append(this.a);
        sb.append(", opponentId=");
        sb.append(this.b);
        sb.append(", dialogId=");
        sb.append(this.c);
        sb.append(", libVersion=");
        sb.append(this.d);
        sb.append(", callDurationSeconds=");
        sb.append(this.e);
        sb.append(", isGroupCall=");
        sb.append(this.f);
        sb.append(", isCurrentUserAnonymous=");
        sb.append(this.g);
        sb.append(", isNewCallAboutToStart=");
        sb.append(this.h);
        sb.append(", groupCallUsersCount=");
        sb.append(this.i);
        sb.append(", callSource=");
        sb.append(this.j);
        sb.append(", miniAppId=");
        sb.append(this.k);
        sb.append(", isSuspiciousCall=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
