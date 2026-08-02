package com.yandex.delivery.attrbutedtext.api;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.i8s;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class f implements i8s, a {
    public final String a;
    public final FormattedText.VerticalAlignment b;
    public final String c;
    public final boolean d;

    public f() {
        FormattedText.VerticalAlignment verticalAlignment = FormattedText.VerticalAlignment.BASELINE;
        this.a = "";
        this.b = verticalAlignment;
        this.c = "";
        this.d = true;
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final String a() {
        return this.c;
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final boolean b() {
        return this.d;
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final FormattedText.VerticalAlignment c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jl40.l(this.a, fVar.a) && this.b == fVar.b && jl40.l(this.c, fVar.c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageUrl(url=");
        sb.append(this.a);
        sb.append(", verticalAlignment=");
        sb.append(this.b);
        sb.append(", color=");
        return nnm.i(this.c, ", updateFontMetrics=", Extension.C_BRAKE, sb, this.d);
    }
}
