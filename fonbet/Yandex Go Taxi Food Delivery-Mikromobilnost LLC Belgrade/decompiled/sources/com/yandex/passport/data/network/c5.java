package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.yjd;
import java.util.LinkedHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes15.dex */
public final class c5 {
    public static final b5 Companion = new b5();
    public final String a;
    public final LinkedHashMap b;

    public /* synthetic */ c5(int i, String str, LinkedHashMap linkedHashMap) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, a5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = new LinkedHashMap();
        } else {
            this.b = linkedHashMap;
        }
    }

    public static final /* synthetic */ void c(c5 c5Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        String str = c5Var.a;
        LinkedHashMap linkedHashMap = c5Var.b;
        yjdVar.o(serialDescriptor, 0, str);
        if (!yjdVar.F() && jl40.l(linkedHashMap, new LinkedHashMap())) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, com.yandex.passport.data.network.utils.b.a, linkedHashMap);
    }

    public final String a() {
        return this.a;
    }

    public final LinkedHashMap b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return jl40.l(this.a, c5Var.a) && jl40.l(this.b, c5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoLoginAppParametersDTO(appId=" + this.a + ", extraParams=" + this.b + ')';
    }
}
