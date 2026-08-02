package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.api.dto.VoipChatInfo;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: StartVoipCallConfiguration.kt */
/* loaded from: classes7.dex */
public final class zqk0 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final Set<String> h;
    public final boolean i;
    public final UserId j;
    public final xdw0 k;
    public final VoipChatInfo l;
    public final xmw0 m;
    public final int n;
    public final boolean o;
    public final esa p;
    public final Long q;
    public final da9 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public zqk0(String str, long j, String str2, String str3, String str4, boolean z, boolean z2, Set set, boolean z3, UserId userId, xdw0 xdw0Var, VoipChatInfo voipChatInfo, xmw0 xmw0Var, int i, boolean z4, esa esaVar, Long l, da9 da9Var, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = set;
        this.i = z3;
        this.j = userId;
        this.k = xdw0Var;
        this.l = voipChatInfo;
        this.m = xmw0Var;
        this.n = i;
        this.o = z4;
        this.p = esaVar;
        this.q = l;
        this.r = da9Var;
        this.s = z5;
        this.t = z6;
        this.u = z7;
    }

    public static zqk0 a(zqk0 zqk0Var, LinkedHashSet linkedHashSet, boolean z, int i) {
        da9 da9Var;
        boolean z2;
        String str = zqk0Var.a;
        long j = zqk0Var.b;
        String str2 = zqk0Var.c;
        String str3 = zqk0Var.d;
        String str4 = zqk0Var.e;
        boolean z3 = zqk0Var.f;
        boolean z4 = zqk0Var.g;
        Set<String> set = (i & 128) != 0 ? zqk0Var.h : linkedHashSet;
        boolean z5 = zqk0Var.i;
        zqk0Var.getClass();
        Set<String> set2 = set;
        UserId userId = zqk0Var.j;
        xdw0 xdw0Var = zqk0Var.k;
        VoipChatInfo voipChatInfo = zqk0Var.l;
        xmw0 xmw0Var = zqk0Var.m;
        int i2 = zqk0Var.n;
        boolean z6 = zqk0Var.o;
        esa esaVar = zqk0Var.p;
        Long l = zqk0Var.q;
        da9 da9Var2 = zqk0Var.r;
        if ((i & 524288) != 0) {
            da9Var = da9Var2;
            z2 = zqk0Var.s;
        } else {
            da9Var = da9Var2;
            z2 = z;
        }
        boolean z7 = zqk0Var.t;
        boolean z8 = zqk0Var.u;
        zqk0Var.getClass();
        return new zqk0(str, j, str2, str3, str4, z3, z4, set2, z5, userId, xdw0Var, voipChatInfo, xmw0Var, i2, z6, esaVar, l, da9Var, z2, z7, z8);
    }

    public final xdw0 b() {
        return this.k;
    }

    public final da9 c() {
        return this.r;
    }

    public final esa d() {
        return this.p;
    }

    public final xmw0 e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqk0)) {
            return false;
        }
        zqk0 zqk0Var = (zqk0) obj;
        return epx.f(this.a, zqk0Var.a) && this.b == zqk0Var.b && epx.f(this.c, zqk0Var.c) && epx.f(this.d, zqk0Var.d) && epx.f(this.e, zqk0Var.e) && this.f == zqk0Var.f && this.g == zqk0Var.g && epx.f(this.h, zqk0Var.h) && this.i == zqk0Var.i && epx.f(this.j, zqk0Var.j) && epx.f(this.k, zqk0Var.k) && epx.f(this.l, zqk0Var.l) && epx.f(this.m, zqk0Var.m) && this.n == zqk0Var.n && this.o == zqk0Var.o && epx.f(this.p, zqk0Var.p) && epx.f(this.q, zqk0Var.q) && epx.f(this.r, zqk0Var.r) && this.s == zqk0Var.s && this.t == zqk0Var.t && this.u == zqk0Var.u;
    }

    public final long f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }

    public final Long h() {
        return this.q;
    }

    public final int hashCode() {
        String str = this.a;
        int a = bh10.a(qoy.b(qoy.b(fw3.b(qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, false), 31, this.j.b);
        xdw0 xdw0Var = this.k;
        int hashCode = (a + (xdw0Var == null ? 0 : xdw0Var.hashCode())) * 31;
        VoipChatInfo voipChatInfo = this.l;
        int hashCode2 = (hashCode + (voipChatInfo == null ? 0 : voipChatInfo.hashCode())) * 31;
        xmw0 xmw0Var = this.m;
        int b = qoy.b(shy.a(this.n, (hashCode2 + (xmw0Var == null ? 0 : xmw0Var.hashCode())) * 31, 31), 31, this.o);
        esa esaVar = this.p;
        int hashCode3 = (b + (esaVar == null ? 0 : esaVar.hashCode())) * 31;
        Long l = this.q;
        return Boolean.hashCode(this.u) + qoy.b(qoy.b((this.r.hashCode() + ((hashCode3 + (l != null ? l.hashCode() : 0)) * 31)) * 31, 31, this.s), 31, this.t);
    }

    public final boolean i() {
        return this.t;
    }

    public final boolean j() {
        return this.s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartVoipCallConfiguration(joinLink=");
        sb.append(this.a);
        sb.append(", dialogId=");
        sb.append(this.b);
        sb.append(", shortName=");
        sb.append(this.c);
        sb.append(", fullName=");
        sb.append(this.d);
        sb.append(", photoMax=");
        sb.append(this.e);
        sb.append(", isFemale=");
        sb.append(this.f);
        sb.append(", isVerified=");
        sb.append(this.g);
        sb.append(", membersIds=");
        sb.append(this.h);
        sb.append(", isGroupCall=");
        sb.append(this.i);
        sb.append(", isChatRoom=false, tokenizedCallerId=");
        sb.append(this.j);
        sb.append(", anonymousUserInfo=");
        sb.append(this.k);
        sb.append(", chatInfo=");
        sb.append(this.l);
        sb.append(", contactInfo=");
        sb.append(this.m);
        sb.append(", unreadMsgCount=");
        sb.append(this.n);
        sb.append(", isWatchTogetherEnabledForAll=");
        sb.append(this.o);
        sb.append(", changeNameCallParams=");
        sb.append(this.p);
        sb.append(", miniAppId=");
        sb.append(this.q);
        sb.append(", callStateChangeCallback=");
        sb.append(this.r);
        sb.append(", isVideo=");
        sb.append(this.s);
        sb.append(", isAudio=");
        sb.append(this.t);
        sb.append(", photoIsNft=");
        return defpackage.q0.a(sb, this.u, ')');
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public zqk0(java.lang.String r27, long r28, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, boolean r34, java.util.Set r35, boolean r36, com.vk.dto.common.id.UserId r37, xsna.xdw0 r38, com.vk.voip.api.dto.VoipChatInfo r39, xsna.xmw0 r40, int r41, boolean r42, xsna.esa r43, java.lang.Long r44, xsna.xa4 r45, boolean r46, boolean r47, boolean r48, int r49) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.zqk0.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.Set, boolean, com.vk.dto.common.id.UserId, xsna.xdw0, com.vk.voip.api.dto.VoipChatInfo, xsna.xmw0, int, boolean, xsna.esa, java.lang.Long, xsna.xa4, boolean, boolean, boolean, int):void");
    }
}
