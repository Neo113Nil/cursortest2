package com.yandex.passport.sloth.command.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import defpackage.uw51;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes2.dex */
public final class a0 {
    public static final z Companion = new z();
    public static final KSerializer[] d = {com.yandex.passport.common.url.b.Companion.serializer(), null, null};
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ a0(String str, int i, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, y.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return jl40.l(this.a, a0Var.a) && this.b == a0Var.b && this.c == a0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenExternalUrlData(url=");
        uw51.y(sb, this.a, ", isAuthUrlRequired=");
        sb.append(this.b);
        sb.append(", isWebViewClosed=");
        return unr0.u(sb, this.c, ')');
    }
}
