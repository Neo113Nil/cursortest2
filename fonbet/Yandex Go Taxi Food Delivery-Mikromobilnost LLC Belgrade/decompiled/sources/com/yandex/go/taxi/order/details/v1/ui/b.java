package com.yandex.go.taxi.order.details.v1.ui;

import defpackage.jl40;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class b extends f {
    public final CharSequence a;
    public final List b;

    public b(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributedText(text=" + ((Object) this.a) + ", paddings=" + this.b + Extension.C_BRAKE;
    }
}
