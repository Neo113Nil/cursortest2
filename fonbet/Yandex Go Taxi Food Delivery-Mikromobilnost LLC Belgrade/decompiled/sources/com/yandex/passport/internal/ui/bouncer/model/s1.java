package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class s1 {
    public final c2 a;
    public final r1 b;
    public final LoginProperties c;
    public final g1 d;
    public final ChallengeState e;
    public final String f;

    public /* synthetic */ s1(BouncerUiState$SocialAction bouncerUiState$SocialAction, LoginProperties loginProperties, int i) {
        this((i & 1) != 0 ? new x1(false, false) : bouncerUiState$SocialAction, p1.a, (i & 4) != 0 ? null : loginProperties, null, ChallengeState.UNKNOWN, null);
    }

    public static s1 a(s1 s1Var, c2 c2Var, r1 r1Var, LoginProperties loginProperties, g1 g1Var, ChallengeState challengeState, String str, int i) {
        if ((i & 1) != 0) {
            c2Var = s1Var.a;
        }
        c2 c2Var2 = c2Var;
        if ((i & 2) != 0) {
            r1Var = s1Var.b;
        }
        r1 r1Var2 = r1Var;
        if ((i & 4) != 0) {
            loginProperties = s1Var.c;
        }
        LoginProperties loginProperties2 = loginProperties;
        if ((i & 8) != 0) {
            g1Var = s1Var.d;
        }
        g1 g1Var2 = g1Var;
        if ((i & 16) != 0) {
            challengeState = s1Var.e;
        }
        ChallengeState challengeState2 = challengeState;
        if ((i & 32) != 0) {
            str = s1Var.f;
        }
        return new s1(c2Var2, r1Var2, loginProperties2, g1Var2, challengeState2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return jl40.l(this.a, s1Var.a) && jl40.l(this.b, s1Var.b) && jl40.l(this.c, s1Var.c) && jl40.l(this.d, s1Var.d) && this.e == s1Var.e && jl40.l(this.f, s1Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        LoginProperties loginProperties = this.c;
        int hashCode2 = (hashCode + (loginProperties == null ? 0 : loginProperties.hashCode())) * 31;
        g1 g1Var = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (g1Var == null ? 0 : g1Var.hashCode())) * 31)) * 31;
        String str = this.f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BouncerState(uiState=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", loginProperties=");
        sb.append(this.c);
        sb.append(", bouncerParameters=");
        sb.append(this.d);
        sb.append(", challengeState=");
        sb.append(this.e);
        sb.append(", phoneNumber=");
        return b64.p(sb, this.f, ')');
    }

    public s1(c2 c2Var, r1 r1Var, LoginProperties loginProperties, g1 g1Var, ChallengeState challengeState, String str) {
        this.a = c2Var;
        this.b = r1Var;
        this.c = loginProperties;
        this.d = g1Var;
        this.e = challengeState;
        this.f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s1() {
        this(null, 0 == true ? 1 : 0, 63);
    }
}
