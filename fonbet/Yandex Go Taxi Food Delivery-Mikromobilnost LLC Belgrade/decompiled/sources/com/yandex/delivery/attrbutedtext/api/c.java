package com.yandex.delivery.attrbutedtext.api;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.b8s;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class c implements b8s {
    public final FormattedText.LineThroughStyle a;
    public final String b;

    public c(FormattedText.LineThroughStyle lineThroughStyle, String str) {
        this.a = lineThroughStyle;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && jl40.l(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LineThrough(style=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }

    public c() {
        this(FormattedText.LineThroughStyle.DEFAULT, "");
    }
}
