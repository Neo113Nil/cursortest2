package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes15.dex */
public final class j3 {
    public static final i3 Companion = new i3();
    public static final KSerializer[] l = {null, null, null, null, null, null, com.yandex.passport.common.url.b.Companion.serializer(), null, null};
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final UUID k;

    public /* synthetic */ j3(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, UUID uuid) {
        if (254 != (i & 254)) {
            qje.Z(i, 254, h3.a.getDescriptor());
            throw null;
        }
        this.a = new com.yandex.passport.data.models.g(1);
        this.b = 0L;
        this.c = (i & 1) == 0 ? ConstantDeviceInfo.APP_PLATFORM : str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        if ((i & 256) == 0) {
            this.k = UUID.randomUUID();
        } else {
            this.k = uuid;
        }
    }

    public final com.yandex.passport.data.models.g a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return jl40.l(this.a, j3Var.a) && this.b == j3Var.b && jl40.l(this.c, j3Var.c) && jl40.l(this.d, j3Var.d) && jl40.l(this.e, j3Var.e) && jl40.l(this.f, j3Var.f) && jl40.l(this.g, j3Var.g) && jl40.l(this.h, j3Var.h) && jl40.l(this.i, j3Var.i) && jl40.l(this.j, j3Var.j) && jl40.l(this.k, j3Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", os=");
        sb.append(this.c);
        sb.append(", osVersion=");
        sb.append(this.d);
        sb.append(", appId=");
        sb.append(this.e);
        sb.append(", appVersion=");
        sb.append(this.f);
        sb.append(", passportVersion=");
        sb.append(this.g);
        sb.append(", uid=");
        sb.append(this.h);
        sb.append(", returnUrl=");
        uw51.y(sb, this.i, ", clientTokenString=");
        sb.append(this.j);
        sb.append(", extUuid=");
        sb.append(this.k);
        sb.append(')');
        return sb.toString();
    }

    public j3(com.yandex.passport.data.models.g gVar, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        UUID randomUUID = UUID.randomUUID();
        this.a = gVar;
        this.b = j;
        this.c = ConstantDeviceInfo.APP_PLATFORM;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = randomUUID;
    }
}
