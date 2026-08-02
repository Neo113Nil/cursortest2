package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class krc extends gc5 {
    public final rbv c;
    public final Text d;
    public final ColorModel e;
    public final Text f;
    public final ColorModel g;
    public final boolean h;

    public krc(rbv rbvVar, Text text, ColorModel colorModel, Text text2, ColorModel colorModel2, boolean z) {
        super((String) null, 3);
        this.c = rbvVar;
        this.d = text;
        this.e = colorModel;
        this.f = text2;
        this.g = colorModel2;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krc)) {
            return false;
        }
        krc krcVar = (krc) obj;
        return jl40.l(this.c, krcVar.c) && jl40.l(this.d, krcVar.d) && jl40.l(this.e, krcVar.e) && jl40.l(this.f, krcVar.f) && jl40.l(this.g, krcVar.g) && this.h == krcVar.h;
    }

    public final int hashCode() {
        rbv rbvVar = this.c;
        int hashCode = (rbvVar == null ? 0 : rbvVar.hashCode()) * 31;
        Text text = this.d;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        ColorModel colorModel = this.e;
        int hashCode3 = (hashCode2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        Text text2 = this.f;
        int hashCode4 = (hashCode3 + (text2 == null ? 0 : text2.hashCode())) * 31;
        ColorModel colorModel2 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode4 + (colorModel2 != null ? colorModel2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CommunicationFullScreenInfoItem(image=" + this.c + ", title=" + this.d + ", titleColor=" + this.e + ", subtitle=" + this.f + ", subtitleColor=" + this.g + ", hideBackgroundImage=" + this.h + Extension.C_BRAKE;
    }

    public /* synthetic */ krc(rbv rbvVar, Text text, Text.Resource resource) {
        this(rbvVar, text, null, resource, null, false);
    }
}
