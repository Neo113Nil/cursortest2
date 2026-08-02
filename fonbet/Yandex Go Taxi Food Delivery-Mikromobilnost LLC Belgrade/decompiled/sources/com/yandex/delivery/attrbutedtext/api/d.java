package com.yandex.delivery.attrbutedtext.api;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.i8s;
import defpackage.jl40;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class d implements i8s {
    public final FormattedText.a a;
    public final List b;

    public d(FormattedText.a aVar, List list) {
        this.a = aVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b);
    }

    public final int hashCode() {
        FormattedText.a aVar = this.a;
        return this.b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Container(groupAttributes=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }

    public d() {
        this(null, EmptyList.a);
    }
}
