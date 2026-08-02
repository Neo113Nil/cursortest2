package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.ui.bouncer.model.DisplayState;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class z implements x {
    public final ModernAccount a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final o h;
    public final String i;
    public final List j;
    public final DisplayState k;
    public final String l;

    public z(ModernAccount modernAccount, String str, String str2, String str3, String str4, String str5, boolean z, o oVar, String str6, List list, DisplayState displayState) {
        this.a = modernAccount;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = oVar;
        this.i = str6;
        this.j = list;
        this.k = displayState;
        this.l = str5 == null ? null : str5;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final DisplayState a() {
        return this.k;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final String b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final o c() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                if (jl40.l(this.a, zVar.a) && jl40.l(this.b, zVar.b) && jl40.l(this.c, zVar.c) && jl40.l(this.d, zVar.d) && jl40.l(this.e, zVar.e)) {
                    String str = zVar.f;
                    String str2 = this.f;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.g == zVar.g && this.h.equals(zVar.h) && jl40.l(this.i, zVar.i) && jl40.l(this.j, zVar.j) && this.k == zVar.k) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final List g() {
        return this.j;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final String getAvatarUrl() {
        return this.l;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final String getEmail() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final boolean getHasPlus() {
        return this.g;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.x
    public final String getPhoneNumber() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (this.h.hashCode() + unr0.e((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.g)) * 31;
        String str6 = this.i;
        return this.k.hashCode() + unr0.c((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultAccount(modernAccount=");
        sb.append(this.a);
        sb.append(", publicName=");
        sb.append(this.b);
        sb.append(", displayLogin=");
        sb.append(this.c);
        sb.append(", phoneNumber=");
        sb.append(this.d);
        sb.append(", email=");
        sb.append(this.e);
        sb.append(", avatarCommonUrl=");
        String str = this.f;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.common.url.b.l(str)));
        sb.append(", hasPlus=");
        sb.append(this.g);
        sb.append(", variant=");
        sb.append(this.h);
        sb.append(", deleteMessageOverride=");
        sb.append(this.i);
        sb.append(", badges=");
        sb.append(this.j);
        sb.append(", displayState=");
        sb.append(this.k);
        sb.append(')');
        return sb.toString();
    }
}
