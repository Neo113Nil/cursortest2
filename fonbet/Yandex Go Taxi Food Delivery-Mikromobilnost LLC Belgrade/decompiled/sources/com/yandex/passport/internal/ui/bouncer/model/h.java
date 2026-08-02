package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class h implements j {
    public final ModernAccount a;
    public final PassportLoginAction b;
    public final Uid c;

    public h(ModernAccount modernAccount, PassportLoginAction passportLoginAction) {
        this.a = modernAccount;
        this.b = passportLoginAction;
        this.c = modernAccount.getUid();
        modernAccount.getMasterUid();
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.j
    public final Uid a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return jl40.l(this.a, hVar.a) && this.b == hVar.b;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.j
    public final PassportLoginAction getLoginAction() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Account(modernAccount=" + this.a + ", loginAction=" + this.b + ')';
    }
}
