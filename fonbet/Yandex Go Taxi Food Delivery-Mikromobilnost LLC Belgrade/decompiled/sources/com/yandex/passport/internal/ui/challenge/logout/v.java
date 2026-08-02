package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v {
    public final Uid a;
    public final AppTheme b;
    public final String c;
    public final boolean d;
    public final com.yandex.passport.common.ui.progress.g e;
    public final Map f;

    public v(Uid uid, AppTheme appTheme, String str, boolean z, com.yandex.passport.common.ui.progress.g gVar, Map map) {
        this.a = uid;
        this.b = appTheme;
        this.c = str;
        this.d = z;
        this.e = gVar;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a.equals(vVar.a) && this.b == vVar.b && jl40.l(this.c, vVar.c) && this.d == vVar.d && this.e.equals(vVar.e) && jl40.l(this.f, vVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogoutProperties(uid=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", canLogoutOnDevice=");
        sb.append(this.d);
        sb.append(", progressProperties=");
        sb.append(this.e);
        sb.append(", headers=");
        return smw0.n(sb, this.f, ')');
    }
}
