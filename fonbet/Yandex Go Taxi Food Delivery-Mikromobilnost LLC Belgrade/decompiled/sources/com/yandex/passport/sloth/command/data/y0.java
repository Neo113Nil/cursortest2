package com.yandex.passport.sloth.command.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes2.dex */
public final class y0 {
    public static final x0 Companion = new x0();
    public final String a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final boolean f;

    public /* synthetic */ y0(int i, String str, Float f, Float f2, Float f3, Float f4, boolean z) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, w0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return jl40.l(this.a, y0Var.a) && jl40.l(this.b, y0Var.b) && jl40.l(this.c, y0Var.c) && jl40.l(this.d, y0Var.d) && jl40.l(this.e, y0Var.e) && this.f == y0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.c;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.d;
        int hashCode4 = (hashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (f4 != null ? f4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPopupSizeData(mode=");
        sb.append(this.a);
        sb.append(", cornerRadius=");
        sb.append(this.b);
        sb.append(", horizontalMargins=");
        sb.append(this.c);
        sb.append(", verticalMargins=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", animate=");
        return unr0.u(sb, this.f, ')');
    }
}
