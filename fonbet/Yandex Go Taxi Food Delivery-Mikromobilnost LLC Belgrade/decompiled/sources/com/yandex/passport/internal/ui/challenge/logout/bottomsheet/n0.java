package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.common.core.Uid;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class n0 {
    public final Uid a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final g f;
    public final g g;
    public final g h;
    public final g i;
    public final f j;

    public n0(Uid uid, List list, boolean z, boolean z2, boolean z3, g gVar, g gVar2, g gVar3, g gVar4, f fVar) {
        this.a = uid;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = gVar;
        this.g = gVar2;
        this.h = gVar3;
        this.i = gVar4;
        this.j = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            return this.a.equals(n0Var.a) && this.b.equals(n0Var.b) && this.c == n0Var.c && this.d == n0Var.d && this.e == n0Var.e && this.f == n0Var.f && this.g == n0Var.g && this.h == n0Var.h && this.i == n0Var.i && this.j == n0Var.j;
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + unr0.e(unr0.e(unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LogoutBottomSheetData(uid=" + this.a + ", masterMembers=" + this.b + ", showYandex=" + this.c + ", showDelete=" + this.d + ", showLogoutOnDevice=" + this.e + ", onShow=" + this.f + ", onThisApp=" + this.g + ", onAllApps=" + this.h + ", onDelete=" + this.i + ", onCancel=" + this.j + ')';
    }
}
