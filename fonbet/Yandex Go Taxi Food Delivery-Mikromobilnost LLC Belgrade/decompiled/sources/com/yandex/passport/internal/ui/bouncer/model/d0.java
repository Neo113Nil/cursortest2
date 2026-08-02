package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class d0 implements n0 {
    public final LoginProperties a;
    public final List b;
    public final ModernAccount c;
    public final ModernAccount d;
    public final boolean e;
    public final boolean f;
    public final Uid g;
    public final String h;

    public d0(LoginProperties loginProperties, ArrayList arrayList, ModernAccount modernAccount, ModernAccount modernAccount2, boolean z, boolean z2, Uid uid, String str, int i) {
        List list = (i & 2) != 0 ? EmptyList.a : arrayList;
        modernAccount = (i & 4) != 0 ? null : modernAccount;
        modernAccount2 = (i & 8) != 0 ? null : modernAccount2;
        z = (i & 16) != 0 ? true : z;
        z2 = (i & 32) != 0 ? true : z2;
        uid = (i & 64) != 0 ? null : uid;
        str = (i & 128) != 0 ? null : str;
        this.a = loginProperties;
        this.b = list;
        this.c = modernAccount;
        this.d = modernAccount2;
        this.e = z;
        this.f = z2;
        this.g = uid;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof d0) {
                d0 d0Var = (d0) obj;
                if (jl40.l(this.a, d0Var.a) && this.b.equals(d0Var.b) && jl40.l(this.c, d0Var.c) && jl40.l(this.d, d0Var.d) && this.e == d0Var.e && this.f == d0Var.f && jl40.l(this.g, d0Var.g)) {
                    String str = d0Var.h;
                    String str2 = this.h;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals) {
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

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        ModernAccount modernAccount = this.c;
        int hashCode = (c + (modernAccount == null ? 0 : modernAccount.hashCode())) * 31;
        ModernAccount modernAccount2 = this.d;
        int e = unr0.e(unr0.e((hashCode + (modernAccount2 == null ? 0 : modernAccount2.hashCode())) * 31, 31, this.e), 31, this.f);
        Uid uid = this.g;
        int hashCode2 = (e + (uid == null ? 0 : uid.hashCode())) * 31;
        String str = this.h;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowMansion(properties=");
        sb.append(this.a);
        sb.append(", accounts=");
        sb.append(this.b);
        sb.append(", selectedAccount=");
        sb.append(this.c);
        sb.append(", bindPhoneAccount=");
        sb.append(this.d);
        sb.append(", isRelogin=");
        sb.append(this.e);
        sb.append(", canGoBack=");
        sb.append(this.f);
        sb.append(", uidForProfile=");
        sb.append(this.g);
        sb.append(", customUrl=");
        String str = this.h;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.common.url.b.l(str)));
        sb.append(')');
        return sb.toString();
    }
}
