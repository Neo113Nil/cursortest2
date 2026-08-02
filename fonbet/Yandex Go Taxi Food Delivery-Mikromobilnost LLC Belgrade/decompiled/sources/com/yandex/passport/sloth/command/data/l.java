package com.yandex.passport.sloth.command.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.uw51;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes2.dex */
public final class l {
    public static final k Companion = new k();
    public static final KSerializer[] c = {com.yandex.passport.common.url.b.Companion.serializer(), null};
    public final String a;
    public final String b;

    public /* synthetic */ l(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, j.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return jl40.l(this.a, lVar.a) && jl40.l(this.b, lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishWithUrlData(url=");
        uw51.y(sb, this.a, ", purpose=");
        return b64.p(sb, this.b, ')');
    }
}
