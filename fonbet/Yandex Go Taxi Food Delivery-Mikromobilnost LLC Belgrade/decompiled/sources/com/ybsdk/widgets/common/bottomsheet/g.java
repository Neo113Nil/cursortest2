package com.ybsdk.widgets.common.bottomsheet;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.rbv;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class g {
    public final rbv a;
    public final BottomSheetDialogView.State.ImageScale b;
    public final Integer c;
    public final float d;
    public final Integer e;

    public g(rbv rbvVar, BottomSheetDialogView.State.ImageScale imageScale, Integer num, Integer num2, int i) {
        imageScale = (i & 2) != 0 ? BottomSheetDialogView.State.ImageScale.CENTER_CROP : imageScale;
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 16) != 0 ? null : num2;
        this.a = rbvVar;
        this.b = imageScale;
        this.c = num;
        this.d = 1.0f;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return jl40.l(this.a, gVar.a) && this.b == gVar.b && jl40.l(this.c, gVar.c) && Float.compare(this.d, gVar.d) == 0 && jl40.l(this.e, gVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int c = g8e.c(this.d, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.e;
        return c + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(model=");
        sb.append(this.a);
        sb.append(", scale=");
        sb.append(this.b);
        sb.append(", paddingTop=");
        sb.append(this.c);
        sb.append(", alfa=");
        sb.append(this.d);
        sb.append(", paddingLeft=");
        return oo31.j(sb, this.e, Extension.C_BRAKE);
    }
}
