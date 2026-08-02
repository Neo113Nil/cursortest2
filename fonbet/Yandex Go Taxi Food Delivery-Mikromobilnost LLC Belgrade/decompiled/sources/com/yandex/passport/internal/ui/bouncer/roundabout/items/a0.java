package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ui.bouncer.model.DisplayState;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;
import java.util.List;

/* loaded from: classes2.dex */
public final class a0 implements x {
    public final Uid a;
    public final Uid b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final o h;
    public final boolean i;
    public final DisplayState j;

    public a0(Uid uid, Uid uid2, String str, String str2, String str3, String str4, List list, o oVar, boolean z, DisplayState displayState) {
        this.a = uid;
        this.b = uid2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = oVar;
        this.i = z;
        this.j = displayState;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final DisplayState a() {
        return this.j;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final String b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final o c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a.equals(a0Var.a) && this.b.equals(a0Var.b) && jl40.l(this.c, a0Var.c) && jl40.l(this.d, a0Var.d) && jl40.l(this.e, a0Var.e) && jl40.l(this.f, a0Var.f) && this.g.equals(a0Var.g) && this.h.equals(a0Var.h) && this.i == a0Var.i && this.j == a0Var.j;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final List g() {
        return this.g;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final String getAvatarUrl() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final String getEmail() {
        return null;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final boolean getHasPlus() {
        return this.i;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final String getPhoneNumber() {
        return this.e;
    }

    public final int hashCode() {
        int a = uw51.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int b = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        return this.j.hashCode() + unr0.e((this.h.hashCode() + unr0.c((b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g)) * 31, 31, this.i);
    }

    public final String toString() {
        return "MasterMember(uid=" + this.a + ", masterUid=" + this.b + ", displayLogin=" + this.c + ", publicName=" + this.d + ", phoneNumber=" + this.e + ", avatarUrl=" + this.f + ", badges=" + this.g + ", variant=" + this.h + ", hasPlus=" + this.i + ", displayState=" + this.j + ')';
    }
}
