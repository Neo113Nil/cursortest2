package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.settings.api.domain.SettingsItemEntity$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class o8r0 {
    public final String a;
    public final SettingsItemEntity$Type b;
    public final Text c;
    public final Text d;
    public final ColorModel e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final rbv i;
    public final q8r0 j;
    public final String k;

    public /* synthetic */ o8r0(String str, SettingsItemEntity$Type settingsItemEntity$Type, Text text, Text text2, ColorModel colorModel, boolean z, boolean z2, String str2, rbv rbvVar, p8r0 p8r0Var, String str3, int i) {
        this(str, settingsItemEntity$Type, (i & 4) != 0 ? null : text, (i & 8) != 0 ? null : text2, (i & 16) != 0 ? null : colorModel, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : str2, (i & 512) != 0 ? null : rbvVar, (i & 1024) != 0 ? msb1.T : p8r0Var, (i & 2048) != 0 ? null : str3);
    }

    public static o8r0 a(o8r0 o8r0Var, Text text, boolean z, boolean z2, String str, int i) {
        String str2 = o8r0Var.a;
        SettingsItemEntity$Type settingsItemEntity$Type = o8r0Var.b;
        if ((i & 4) != 0) {
            text = o8r0Var.c;
        }
        Text text2 = text;
        Text text3 = o8r0Var.d;
        ColorModel colorModel = o8r0Var.e;
        if ((i & 32) != 0) {
            z = o8r0Var.f;
        }
        boolean z3 = z;
        String str3 = (i & 128) != 0 ? o8r0Var.h : str;
        o8r0Var.getClass();
        rbv rbvVar = o8r0Var.i;
        q8r0 q8r0Var = o8r0Var.j;
        String str4 = o8r0Var.k;
        o8r0Var.getClass();
        return new o8r0(str2, settingsItemEntity$Type, text2, text3, colorModel, z3, z2, str3, rbvVar, q8r0Var, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8r0)) {
            return false;
        }
        o8r0 o8r0Var = (o8r0) obj;
        return jl40.l(this.a, o8r0Var.a) && this.b == o8r0Var.b && jl40.l(this.c, o8r0Var.c) && jl40.l(this.d, o8r0Var.d) && jl40.l(this.e, o8r0Var.e) && this.f == o8r0Var.f && this.g == o8r0Var.g && jl40.l(this.h, o8r0Var.h) && jl40.l(this.i, o8r0Var.i) && jl40.l(this.j, o8r0Var.j) && jl40.l(this.k, o8r0Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Text text = this.c;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.d;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        ColorModel colorModel = this.e;
        int e = unr0.e(unr0.e((hashCode3 + (colorModel == null ? 0 : colorModel.hashCode())) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        int e2 = unr0.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, false);
        rbv rbvVar = this.i;
        int hashCode4 = (this.j.hashCode() + ((e2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31;
        String str2 = this.k;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsItemEntity(key=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        ly3.C(sb, this.c, ", description=", this.d, ", descriptionColorModel=");
        sb.append(this.e);
        sb.append(", enabled=");
        sb.append(this.f);
        sb.append(", checked=");
        unr0.A(", action=", this.h, ", isLoading=false, image=", sb, this.g);
        sb.append(this.i);
        sb.append(", payload=");
        sb.append(this.j);
        sb.append(", analyticAction=");
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }

    public o8r0(String str, SettingsItemEntity$Type settingsItemEntity$Type, Text text, Text text2, ColorModel colorModel, boolean z, boolean z2, String str2, rbv rbvVar, q8r0 q8r0Var, String str3) {
        this.a = str;
        this.b = settingsItemEntity$Type;
        this.c = text;
        this.d = text2;
        this.e = colorModel;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = rbvVar;
        this.j = q8r0Var;
        this.k = str3;
    }
}
