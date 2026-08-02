package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.jl40;
import defpackage.smw0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {
    public final Uid a;
    public final com.yandex.passport.common.ui.progress.g b;
    public final AppTheme c;
    public final Map d;

    public d(Uid uid, com.yandex.passport.common.ui.progress.g gVar, AppTheme appTheme, Map map) {
        this.a = uid;
        this.b = gVar;
        this.c = appTheme;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c == dVar.c && jl40.l(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteAccountProperties(uid=");
        sb.append(this.a);
        sb.append(", progressProperties=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", headers=");
        return smw0.n(sb, this.d, ')');
    }
}
