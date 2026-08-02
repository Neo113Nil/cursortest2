package xsna;

import com.vk.voip.dto.profiles.VoipFriendStatus;

/* compiled from: VKUser.kt */
/* loaded from: classes7.dex */
public final class whr0 {
    public final String a;
    public final sew0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final VoipFriendStatus g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final a o;
    public final boolean p;
    public final String q;
    public final qdw0 r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final boolean w;

    /* compiled from: VKUser.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    public whr0(String str, sew0 sew0Var, boolean z, boolean z2, boolean z3, boolean z4, VoipFriendStatus voipFriendStatus, String str2, String str3, String str4, String str5, String str6, boolean z5, boolean z6, a aVar, boolean z7, String str7, qdw0 qdw0Var) {
        this.a = str;
        this.b = sew0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = voipFriendStatus;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = z5;
        this.n = z6;
        this.o = aVar;
        this.p = z7;
        this.q = str7;
        this.r = qdw0Var;
        this.s = (!z5 || str6.length() <= 0) ? str2 : str6;
        this.t = (!z5 || str6.length() <= 0) ? str3 : "";
        this.u = (!z5 || str6.length() <= 0) ? str4 : str6;
        this.v = (!z5 || str6.length() <= 0) ? str5 : str6;
        this.w = aVar != null;
    }

    public static whr0 a(whr0 whr0Var, String str, int i) {
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String str4 = whr0Var.a;
        sew0 sew0Var = whr0Var.b;
        boolean z3 = whr0Var.c;
        boolean z4 = whr0Var.d;
        boolean z5 = whr0Var.e;
        boolean z6 = whr0Var.f;
        VoipFriendStatus voipFriendStatus = whr0Var.g;
        String str5 = whr0Var.h;
        String str6 = whr0Var.i;
        String str7 = whr0Var.j;
        String str8 = whr0Var.k;
        String str9 = whr0Var.l;
        boolean z7 = whr0Var.m;
        boolean z8 = whr0Var.n;
        a aVar = whr0Var.o;
        if ((i & 32768) != 0) {
            str2 = str4;
            z = whr0Var.p;
        } else {
            str2 = str4;
            z = false;
        }
        if ((i & 65536) != 0) {
            z2 = z;
            str3 = whr0Var.q;
        } else {
            z2 = z;
            str3 = str;
        }
        boolean z9 = z2;
        String str10 = str3;
        return new whr0(str2, sew0Var, z3, z4, z5, z6, voipFriendStatus, str5, str6, str7, str8, str9, z7, z8, aVar, z9, str10, whr0Var.r);
    }

    public final String b() {
        return this.q;
    }

    public final String c() {
        return this.s;
    }

    public final String d() {
        return this.t;
    }

    public final String e() {
        String str = this.t;
        int length = str.length();
        String str2 = this.s;
        if (length <= 0) {
            return str2;
        }
        return str2 + ' ' + str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whr0)) {
            return false;
        }
        whr0 whr0Var = (whr0) obj;
        return epx.f(this.a, whr0Var.a) && epx.f(this.b, whr0Var.b) && this.c == whr0Var.c && this.d == whr0Var.d && this.e == whr0Var.e && this.f == whr0Var.f && this.g == whr0Var.g && epx.f(this.h, whr0Var.h) && epx.f(this.i, whr0Var.i) && epx.f(this.j, whr0Var.j) && epx.f(this.k, whr0Var.k) && epx.f(this.l, whr0Var.l) && this.m == whr0Var.m && this.n == whr0Var.n && epx.f(this.o, whr0Var.o) && this.p == whr0Var.p && epx.f(this.q, whr0Var.q) && epx.f(this.r, whr0Var.r);
    }

    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((this.g.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        a aVar = this.o;
        int b2 = qoy.b((b + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.p);
        String str = this.q;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        qdw0 qdw0Var = this.r;
        return hashCode + (qdw0Var != null ? qdw0Var.hashCode() : 0);
    }

    public final String toString() {
        return "VKUser(id=" + this.a + ", avatar=" + this.b + ", isFemale=" + this.c + ", isVerified=" + this.d + ", isAnonym=" + this.e + ", canCall=" + this.f + ", friendStatus=" + this.g + ", firstName=" + this.h + ", lastName=" + this.i + ", firstNameGen=" + this.j + ", firstNameDat=" + this.k + ", contactName=" + this.l + ", useContactName=" + this.m + ", isCommunity=" + this.n + ", contactBookInfo=" + this.o + ", canJoinToCommunity=" + this.p + ", changedName=" + this.q + ", animatedAvatar=" + this.r + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ whr0(java.lang.String r23, xsna.sew0 r24, boolean r25, boolean r26, boolean r27, boolean r28, com.vk.voip.dto.profiles.VoipFriendStatus r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, boolean r36, xsna.whr0.a r37, boolean r38, java.lang.String r39, xsna.qdw0 r40, int r41) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r1 == 0) goto La
            r17 = r2
            goto Lc
        La:
            r17 = r36
        Lc:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r3 = 0
            if (r1 == 0) goto L14
            r18 = r3
            goto L16
        L14:
            r18 = r37
        L16:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L1f
            r19 = r2
            goto L21
        L1f:
            r19 = r38
        L21:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L29
            r20 = r3
            goto L2b
        L29:
            r20 = r39
        L2b:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            r21 = r3
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r3 = r22
            goto L6d
        L4f:
            r21 = r40
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
        L6d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.whr0.<init>(java.lang.String, xsna.sew0, boolean, boolean, boolean, boolean, com.vk.voip.dto.profiles.VoipFriendStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, xsna.whr0$a, boolean, java.lang.String, xsna.qdw0, int):void");
    }
}
