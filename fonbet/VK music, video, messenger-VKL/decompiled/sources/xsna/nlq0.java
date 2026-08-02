package xsna;

import com.vk.dto.common.VerifyInfo;

/* compiled from: UserProfile.kt */
/* loaded from: classes2.dex */
public final class nlq0 {
    public final long a;
    public final String b;
    public final String c;
    public final VerifyInfo d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final qtd0 m;
    public final boolean n;

    public nlq0(long j, String str, String str2, VerifyInfo verifyInfo, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, qtd0 qtd0Var, boolean z7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = verifyInfo;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = qtd0Var;
        this.n = z7;
    }

    public static nlq0 a(nlq0 nlq0Var, long j, String str, String str2, VerifyInfo verifyInfo, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, qtd0 qtd0Var, int i) {
        long j2 = (i & 1) != 0 ? nlq0Var.a : j;
        String str5 = (i & 2) != 0 ? nlq0Var.b : str;
        String str6 = (i & 4) != 0 ? nlq0Var.c : str2;
        VerifyInfo verifyInfo2 = (i & 8) != 0 ? nlq0Var.d : verifyInfo;
        String str7 = (i & 16) != 0 ? nlq0Var.e : str3;
        String str8 = (i & 32) != 0 ? nlq0Var.f : str4;
        boolean z5 = nlq0Var.g;
        boolean z6 = (i & 128) != 0 ? nlq0Var.h : z;
        boolean z7 = (i & 256) != 0 ? nlq0Var.i : z2;
        boolean z8 = nlq0Var.j;
        boolean z9 = (i & 1024) != 0 ? nlq0Var.k : z3;
        boolean z10 = (i & 2048) != 0 ? nlq0Var.l : z4;
        qtd0 qtd0Var2 = (i & 4096) != 0 ? nlq0Var.m : qtd0Var;
        boolean z11 = nlq0Var.n;
        nlq0Var.getClass();
        nlq0Var.getClass();
        return new nlq0(j2, str5, str6, verifyInfo2, str7, str8, z5, z6, z7, z8, z9, z10, qtd0Var2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlq0)) {
            return false;
        }
        nlq0 nlq0Var = (nlq0) obj;
        return this.a == nlq0Var.a && epx.f(this.b, nlq0Var.b) && epx.f(this.c, nlq0Var.c) && epx.f(this.d, nlq0Var.d) && epx.f(this.e, nlq0Var.e) && epx.f(this.f, nlq0Var.f) && this.g == nlq0Var.g && this.h == nlq0Var.h && this.i == nlq0Var.i && this.j == nlq0Var.j && this.k == nlq0Var.k && this.l == nlq0Var.l && epx.f(this.m, nlq0Var.m) && this.n == nlq0Var.n;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(urd0.a((this.d.hashCode() + urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        qtd0 qtd0Var = this.m;
        return Boolean.hashCode(false) + qoy.b((b + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfile(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", verifyInfo=");
        sb.append(this.d);
        sb.append(", mobilePhone=");
        sb.append(this.e);
        sb.append(", pageLink=");
        sb.append(this.f);
        sb.append(", canWrite=");
        sb.append(this.g);
        sb.append(", canCall=");
        sb.append(this.h);
        sb.append(", notificationEnabled=");
        sb.append(this.i);
        sb.append(", inviteToChatsAllowed=");
        sb.append(this.j);
        sb.append(", blocked=");
        sb.append(this.k);
        sb.append(", deactivated=");
        sb.append(this.l);
        sb.append(", profile=");
        sb.append(this.m);
        sb.append(", canChangeTheme=");
        return n23.b(sb, this.n, ", verifiedOtherService=false)");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ nlq0(long r19, java.lang.String r21, java.lang.String r22, com.vk.dto.common.VerifyInfo r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, xsna.qtd0 r32, boolean r33, int r34) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 2
            if (r1 == 0) goto La
            java.lang.String r1 = "..."
            r5 = r1
            goto Lc
        La:
            r5 = r21
        Lc:
            r1 = r0 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L14
            r6 = r2
            goto L16
        L14:
            r6 = r22
        L16:
            r1 = r0 & 8
            if (r1 == 0) goto L29
            com.vk.dto.common.VerifyInfo r7 = new com.vk.dto.common.VerifyInfo
            r14 = 63
            r15 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L2b
        L29:
            r7 = r23
        L2b:
            r1 = r0 & 16
            if (r1 == 0) goto L31
            r8 = r2
            goto L33
        L31:
            r8 = r24
        L33:
            r1 = r0 & 32
            if (r1 == 0) goto L39
            r9 = r2
            goto L3b
        L39:
            r9 = r25
        L3b:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L42
            r10 = r2
            goto L44
        L42:
            r10 = r26
        L44:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L4a
            r11 = r2
            goto L4c
        L4a:
            r11 = r27
        L4c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L52
            r12 = r2
            goto L54
        L52:
            r12 = r28
        L54:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L5a
            r13 = r2
            goto L5c
        L5a:
            r13 = r29
        L5c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L62
            r14 = r2
            goto L64
        L62:
            r14 = r30
        L64:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L6a
            r15 = r2
            goto L6c
        L6a:
            r15 = r31
        L6c:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L79
            r17 = r2
            r3 = r19
            r16 = r32
            r2 = r18
            goto L81
        L79:
            r17 = r33
            r2 = r18
            r3 = r19
            r16 = r32
        L81:
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.nlq0.<init>(long, java.lang.String, java.lang.String, com.vk.dto.common.VerifyInfo, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, xsna.qtd0, boolean, int):void");
    }
}
