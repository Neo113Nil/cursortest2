package com.yandex.go.taxi.order.details.v1.ui;

import defpackage.jl40;
import defpackage.oyr;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a extends f {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final List d;

    public a(CharSequence charSequence, int i, int i2, List list) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ActionButton(text=" + ((Object) this.a) + ", textColor=" + this.b + ", backgroundColor=" + this.c + ", paddings=" + this.d + Extension.C_BRAKE;
    }
}
