package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.yjd;
import java.util.LinkedHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes15.dex */
public final class f5 {
    public static final e5 Companion = new e5();
    public final String a;
    public final LinkedHashMap b;

    public /* synthetic */ f5(int i, String str, LinkedHashMap linkedHashMap) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, d5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = new LinkedHashMap();
        } else {
            this.b = linkedHashMap;
        }
    }

    public static final /* synthetic */ void c(f5 f5Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        String str = f5Var.a;
        LinkedHashMap linkedHashMap = f5Var.b;
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
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return jl40.l(this.a, f5Var.a) && jl40.l(this.b, f5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoLoginClientIdParametersDTO(clientId=" + this.a + ", extraParams=" + this.b + ')';
    }
}
