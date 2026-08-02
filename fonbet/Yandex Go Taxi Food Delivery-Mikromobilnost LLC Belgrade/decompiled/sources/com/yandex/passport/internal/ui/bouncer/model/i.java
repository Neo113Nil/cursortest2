package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.common.core.Uid;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class i implements j {
    public final Uid a;
    public final Uid b;
    public final PassportLoginAction c;

    static {
        int i = Uid.$stable;
    }

    public i(Uid uid, Uid uid2, PassportLoginAction passportLoginAction) {
        this.a = uid;
        this.b = uid2;
        this.c = passportLoginAction;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.j
    public final Uid a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c == iVar.c;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.model.j
    public final PassportLoginAction getLoginAction() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MemberAccount(accountUid=" + this.a + ", masterUid=" + this.b + ", loginAction=" + this.c + ')';
    }
}
