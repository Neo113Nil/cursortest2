package com.ybsdk.widgets.common.bottomsheet;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h {
    public final Text a;
    public final ColorModel b;

    public h(ColorModel colorModel, Text text) {
        this.a = text;
        this.b = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a) && jl40.l(this.b, hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Title(title=" + this.a + ", titleColor=" + this.b + Extension.C_BRAKE;
    }
}
