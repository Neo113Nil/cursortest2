package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w {
    public final com.yandex.passport.internal.ui.sloth.e a;
    public final Locale b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Map f;
    public final FrontendUrlType g;

    public w(Uid uid, Locale locale, String str, String str2, Map map, FrontendUrlType frontendUrlType, int i) {
        this(new v(uid), locale, str, (i & 8) != 0 ? null : str2, (i & 16) == 0, (i & 32) != 0 ? kotlin.collections.b.f() : map, (i & 64) != 0 ? FrontendUrlType.PASSPORT : frontendUrlType);
    }

    public final com.yandex.passport.internal.ui.sloth.e a() {
        return this.a;
    }

    public final Map b() {
        return this.f;
    }

    public final FrontendUrlType c() {
        return this.g;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return jl40.l(this.a, wVar.a) && jl40.l(this.b, wVar.b) && jl40.l(this.c, wVar.c) && jl40.l(this.d, wVar.d) && this.e == wVar.e && jl40.l(this.f, wVar.f) && this.g == wVar.g;
    }

    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Locale locale = this.b;
        int b = unr0.b((hashCode + (locale == null ? 0 : locale.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return this.g.hashCode() + unr0.d(unr0.e((b + (str != null ? str.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(accountSpec=");
        sb.append(this.a);
        sb.append(", locale=");
        sb.append(this.b);
        sb.append(", returnUrl=");
        uw51.y(sb, this.c, ", tld=");
        sb.append(this.d);
        sb.append(", isForceRequiredHost=");
        sb.append(this.e);
        sb.append(", analyticsMap=");
        sb.append(this.f);
        sb.append(", frontendUrlType=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ w(u uVar, String str) {
        this((com.yandex.passport.internal.ui.sloth.e) uVar, (Locale) null, str, (String) null, false, kotlin.collections.b.f(), FrontendUrlType.PASSPORT);
    }

    public w(com.yandex.passport.internal.ui.sloth.e eVar, Locale locale, String str, String str2, boolean z, Map map, FrontendUrlType frontendUrlType) {
        this.a = eVar;
        this.b = locale;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = map;
        this.g = frontendUrlType;
    }
}
