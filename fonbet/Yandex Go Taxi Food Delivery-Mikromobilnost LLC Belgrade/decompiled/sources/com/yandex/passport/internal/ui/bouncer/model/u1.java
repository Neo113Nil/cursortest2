package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class u1 implements c2 {
    public final boolean a;
    public final List b;

    public u1(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.a == u1Var.a && this.b.equals(u1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMaster(createMasterEnterPhoneNumberOption=");
        sb.append(this.a);
        sb.append(", masterAccounts=");
        return unr0.t(sb, this.b, ')');
    }
}
