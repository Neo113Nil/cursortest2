package com.yandex.delivery.attrbutedtext.api;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.b64;
import defpackage.i8s;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class e implements i8s, a {
    public final String a;
    public final FormattedText.VerticalAlignment b;
    public final String c;
    public final int d;
    public final int e;
    public final Float f;
    public final boolean g;

    public e(String str, FormattedText.VerticalAlignment verticalAlignment, String str2, int i, int i2, Float f, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        verticalAlignment = (i3 & 2) != 0 ? FormattedText.VerticalAlignment.BASELINE : verticalAlignment;
        str2 = (i3 & 4) != 0 ? "" : str2;
        i = (i3 & 8) != 0 ? 0 : i;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        f = (i3 & 32) != 0 ? null : f;
        this.a = str;
        this.b = verticalAlignment;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = f;
        this.g = true;
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final String a() {
        return this.c;
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final boolean b() {
        return this.g;
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final FormattedText.VerticalAlignment c() {
        return this.b;
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final Float d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jl40.l(this.a, eVar.a) && this.b == eVar.b && jl40.l(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && jl40.l(this.f, eVar.f) && this.g == eVar.g;
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final Integer getHeight() {
        return Integer.valueOf(this.e);
    }

    @Override // com.yandex.delivery.attrbutedtext.api.a
    public final Integer getWidth() {
        return Integer.valueOf(this.d);
    }

    public final int hashCode() {
        int b = oyr.b(this.e, oyr.b(this.d, unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
        Float f = this.f;
        return Boolean.hashCode(this.g) + ((b + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(tag=");
        sb.append(this.a);
        sb.append(", verticalAlignment=");
        sb.append(this.b);
        sb.append(", color=");
        b64.A(this.d, this.c, ", width=", ", height=", sb);
        sb.append(this.e);
        sb.append(", baselineOffset=");
        sb.append(this.f);
        sb.append(", updateFontMetrics=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }

    public e() {
        this(null, null, null, 0, 0, null, HProv.PP_VERSION_TIMESTAMP);
    }
}
