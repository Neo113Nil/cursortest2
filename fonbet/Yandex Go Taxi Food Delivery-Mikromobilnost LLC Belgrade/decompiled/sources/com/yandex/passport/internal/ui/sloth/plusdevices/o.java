package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class o {
    public final Uid a;
    public final AppTheme b;
    public final String c;
    public final String d;
    public final boolean e;

    static {
        int i = Uid.$stable;
    }

    public o(Uid uid, AppTheme appTheme, String str, String str2, boolean z) {
        this.a = uid;
        this.b = appTheme;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.a) && this.b == oVar.b && jl40.l(this.c, oVar.c) && jl40.l(this.d, oVar.d) && this.e == oVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagingPlusDevicesProperties(uid=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", service=");
        sb.append(this.c);
        sb.append(", brand=");
        sb.append(this.d);
        sb.append(", isForceShowManagingPlusDevices=");
        return unr0.u(sb, this.e, ')');
    }
}
