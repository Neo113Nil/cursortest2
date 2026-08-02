package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.ui.domik.FinishRegistrationActivities;
import defpackage.jl40;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public final class q1 implements r1 {
    public final ModernAccount a;
    public final ClientToken b;
    public final PassportLoginAction c;
    public final String d;
    public final String e;
    public final EnumSet f;

    public q1(ModernAccount modernAccount, ClientToken clientToken, PassportLoginAction passportLoginAction, String str, String str2, EnumSet enumSet, int i) {
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        enumSet = (i & 32) != 0 ? EnumSet.noneOf(FinishRegistrationActivities.class) : enumSet;
        this.a = modernAccount;
        this.b = clientToken;
        this.c = passportLoginAction;
        this.d = str;
        this.e = str2;
        this.f = enumSet;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        if (!jl40.l(this.a, q1Var.a) || !jl40.l(this.b, q1Var.b) || this.c != q1Var.c) {
            return false;
        }
        String str = q1Var.d;
        String str2 = this.d;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l && jl40.l(this.e, q1Var.e) && jl40.l(this.f, q1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ClientToken clientToken = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (clientToken == null ? 0 : clientToken.hashCode())) * 31)) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(account=");
        sb.append(this.a);
        sb.append(", clientToken=");
        sb.append(this.b);
        sb.append(", loginAction=");
        sb.append(this.c);
        sb.append(", additionalActionResponse=");
        String str = this.d;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.internal.ui.c.J(str)));
        sb.append(", phoneNumber=");
        sb.append(this.e);
        sb.append(", skipFinishRegistrationActivities=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
