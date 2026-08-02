package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.domik.DomikExternalAuthRequest;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class w1 implements c2 {
    public final LoginProperties a;
    public final boolean b;
    public final List c;
    public final ModernAccount w;
    public final boolean x;
    public final DomikExternalAuthRequest y;
    public final boolean z;

    public w1(LoginProperties loginProperties, boolean z, List list, ModernAccount modernAccount, boolean z2, DomikExternalAuthRequest domikExternalAuthRequest, int i) {
        list = (i & 4) != 0 ? EmptyList.a : list;
        domikExternalAuthRequest = (i & 32) != 0 ? null : domikExternalAuthRequest;
        this.a = loginProperties;
        this.b = z;
        this.c = list;
        this.w = modernAccount;
        this.x = z2;
        this.y = domikExternalAuthRequest;
        this.z = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return jl40.l(this.a, w1Var.a) && this.b == w1Var.b && this.c.equals(w1Var.c) && jl40.l(this.w, w1Var.w) && this.x == w1Var.x && jl40.l(this.y, w1Var.y) && this.z == w1Var.z;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ModernAccount modernAccount = this.w;
        int e = unr0.e((c + (modernAccount == null ? 0 : modernAccount.hashCode())) * 31, 31, this.x);
        DomikExternalAuthRequest domikExternalAuthRequest = this.y;
        return Boolean.hashCode(this.z) + ((e + (domikExternalAuthRequest != null ? domikExternalAuthRequest.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Fallback(properties=");
        sb.append(this.a);
        sb.append(", canGoBack=");
        sb.append(this.b);
        sb.append(", masterAccounts=");
        sb.append(this.c);
        sb.append(", selectedAccount=");
        sb.append(this.w);
        sb.append(", isRelogin=");
        sb.append(this.x);
        sb.append(", externalAuthRequest=");
        sb.append(this.y);
        sb.append(", forceNative=");
        return unr0.u(sb, this.z, ')');
    }
}
