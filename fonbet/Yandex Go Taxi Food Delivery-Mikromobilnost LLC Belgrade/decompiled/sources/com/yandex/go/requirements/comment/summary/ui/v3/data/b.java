package com.yandex.go.requirements.comment.summary.ui.v3.data;

import defpackage.jl40;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b {
    public final UpdateReason a;
    public final UpdateSource b;
    public final String c;

    public b(UpdateReason updateReason, UpdateSource updateSource, String str) {
        this.a = updateReason;
        this.b = updateSource;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && jl40.l(this.c, bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Input(updateReason=");
        sb.append(this.a);
        sb.append(", updateSource=");
        sb.append(this.b);
        sb.append(", input=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
