package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ahq0 {
    public static final ahq0 j;
    public final boolean a;
    public final rbv b;
    public final Text c;
    public final Text d;
    public final Text e;
    public final int f;
    public final Text g;
    public final int h;
    public final ColorModel i;

    static {
        Text.Empty empty = Text.Empty.INSTANCE;
        new ahq0(false, (rbv) null, (Text) empty, (Text) empty, (Text) empty, unr0.h(Text.Companion, dzh0.ybsdk_payments_payment_method_title), ung0.ybColor_textIcon_primary, (ColorModel) null, 288);
        j = new ahq0(true, (rbv) null, (Text) empty, (Text) empty, (Text) empty, new Text.Resource(dzh0.ybsdk_payments_payment_method_title), ung0.ybColor_textIcon_primary, (ColorModel) null, 288);
    }

    public ahq0(boolean z, rbv rbvVar, Text text, Text text2, Text text3, Text.Resource resource, int i, ColorModel colorModel, int i2) {
        this(z, rbvVar, text, (i2 & 8) != 0 ? null : text2, (i2 & 16) != 0 ? null : text3, nyg0.ybsdk_background_itemlist_paymentmethod, (i2 & 64) != 0 ? unr0.h(Text.Companion, dzh0.ybsdk_payments_payment_method_title) : resource, (i2 & 128) != 0 ? ung0.ybColor_textIcon_primary : i, (i2 & 256) != 0 ? null : colorModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahq0)) {
            return false;
        }
        ahq0 ahq0Var = (ahq0) obj;
        return this.a == ahq0Var.a && jl40.l(this.b, ahq0Var.b) && jl40.l(this.c, ahq0Var.c) && jl40.l(this.d, ahq0Var.d) && jl40.l(this.e, ahq0Var.e) && this.f == ahq0Var.f && jl40.l(this.g, ahq0Var.g) && this.h == ahq0Var.h && jl40.l(this.i, ahq0Var.i);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        rbv rbvVar = this.b;
        int c = n.c(this.c, (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31);
        Text text = this.d;
        int hashCode2 = (c + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.e;
        int b = oyr.b(this.h, n.c(this.g, oyr.b(this.f, (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31, 31), 31), 31);
        ColorModel colorModel = this.i;
        return b + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(showRightIcon=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        ly3.C(sb, this.c, ", subtitle=", this.d, ", label=");
        sb.append(this.e);
        sb.append(", background=");
        sb.append(this.f);
        sb.append(", contentDescription=");
        sb.append(this.g);
        sb.append(", rightIconColorAttr=");
        sb.append(this.h);
        sb.append(", titleColor=");
        return n.o(sb, this.i, Extension.C_BRAKE);
    }

    public ahq0(boolean z, rbv rbvVar, Text text, Text text2, Text text3, int i, Text text4, int i2, ColorModel colorModel) {
        this.a = z;
        this.b = rbvVar;
        this.c = text;
        this.d = text2;
        this.e = text3;
        this.f = i;
        this.g = text4;
        this.h = i2;
        this.i = colorModel;
    }
}
