package com.ybsdk.widgets.common;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.WidgetWithToggleView;
import defpackage.jl40;
import defpackage.vfc;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class o {
    public final WidgetWithToggleView.ToggleState a;
    public final ColorModel b;
    public final ColorModel c;

    public o(WidgetWithToggleView.ToggleState toggleState, ColorModel colorModel, ColorModel colorModel2) {
        this.a = toggleState;
        this.b = colorModel;
        this.c = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b.equals(oVar.b) && jl40.l(this.c, oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vfc.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleViewState(toggleState=");
        sb.append(this.a);
        sb.append(", thumbColor=");
        sb.append(this.b);
        sb.append(", trackColor=");
        return defpackage.n.o(sb, this.c, Extension.C_BRAKE);
    }
}
