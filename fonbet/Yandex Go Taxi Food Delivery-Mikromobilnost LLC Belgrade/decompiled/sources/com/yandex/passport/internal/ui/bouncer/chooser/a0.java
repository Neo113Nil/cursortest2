package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ui.bouncer.model.q2;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class a0 {
    public final List a;
    public final Uid b;
    public final q2 c;
    public final Throwable d;

    public a0(List list, Uid uid, q2 q2Var, Throwable th) {
        this.a = list;
        this.b = uid;
        this.c = q2Var;
        this.d = th;
    }

    public static a0 a(a0 a0Var, List list, Uid uid, q2 q2Var, Throwable th, int i) {
        if ((i & 1) != 0) {
            list = a0Var.a;
        }
        if ((i & 2) != 0) {
            uid = a0Var.b;
        }
        if ((i & 4) != 0) {
            q2Var = a0Var.c;
        }
        if ((i & 8) != 0) {
            th = a0Var.d;
        }
        a0Var.getClass();
        return new a0(list, uid, q2Var, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return jl40.l(this.a, a0Var.a) && jl40.l(this.b, a0Var.b) && jl40.l(this.c, a0Var.c) && jl40.l(this.d, a0Var.d);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Uid uid = this.b;
        int hashCode2 = (hashCode + (uid == null ? 0 : uid.hashCode())) * 31;
        q2 q2Var = this.c;
        int hashCode3 = (hashCode2 + (q2Var == null ? 0 : q2Var.hashCode())) * 31;
        Throwable th = this.d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(masterChooserItems=");
        sb.append(this.a);
        sb.append(", selectedMasterUid=");
        sb.append(this.b);
        sb.append(", createProfileData=");
        sb.append(this.c);
        sb.append(", error=");
        return unr0.s(sb, this.d, ')');
    }

    public a0() {
        this(null, null, null, null);
    }
}
