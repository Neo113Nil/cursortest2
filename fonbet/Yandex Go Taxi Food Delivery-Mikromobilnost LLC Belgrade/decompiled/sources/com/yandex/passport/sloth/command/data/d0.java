package com.yandex.passport.sloth.command.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nor;
import defpackage.p53;
import defpackage.pnz;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes2.dex */
public final class d0 {
    public static final c0 Companion = new c0();
    public static final KSerializer[] c = {new p53(pnz.a, 0), new p53(nor.a, 0)};
    public final List a;
    public final List b;

    public /* synthetic */ d0(List list, List list2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, b0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return jl40.l(this.a, d0Var.a) && jl40.l(this.b, d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformVibrationData(vibrationPattern=");
        sb.append(this.a);
        sb.append(", vibrationAmplitude=");
        return unr0.t(sb, this.b, ')');
    }
}
