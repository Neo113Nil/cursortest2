package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.UserInfo;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class r {
    public final UserInfo a;
    public final PassportAccountUpgradeStatus b;
    public final List c;
    public final List d = EmptyList.a;
    public final MasterToken e;

    public r(UserInfo userInfo, PassportAccountUpgradeStatus passportAccountUpgradeStatus, List list, MasterToken masterToken) {
        this.a = userInfo;
        this.b = passportAccountUpgradeStatus;
        this.c = list;
        this.e = masterToken;
    }

    public final List a() {
        return this.c;
    }

    public final MasterToken b() {
        return this.e;
    }

    public final PassportAccountUpgradeStatus c() {
        return this.b;
    }

    public final UserInfo d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jl40.l(this.a, rVar.a) && this.b == rVar.b && this.c.equals(rVar.c) && this.d.equals(rVar.d) && jl40.l(this.e, rVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PassportAccountUpgradeStatus passportAccountUpgradeStatus = this.b;
        int c = unr0.c(unr0.c((hashCode + (passportAccountUpgradeStatus == null ? 0 : passportAccountUpgradeStatus.hashCode())) * 31, 31, this.c), 31, this.d);
        MasterToken masterToken = this.e;
        return c + (masterToken != null ? masterToken.hashCode() : 0);
    }

    public final String toString() {
        return "MegaUserInfo(userInfo=" + this.a + ", passportAccountUpgradeStatus=" + this.b + ", members=" + this.c + ", masterMembers=" + this.d + ", newMasterToken=" + this.e + ')';
    }
}
