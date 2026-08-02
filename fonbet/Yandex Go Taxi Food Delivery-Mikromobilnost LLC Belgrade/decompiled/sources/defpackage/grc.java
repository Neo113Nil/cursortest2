package defpackage;

import android.widget.ImageView;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class grc {
    public final Integer a;
    public final ColorModel b;
    public final rbv c;
    public final lrc d;
    public final urc e;
    public final int f;
    public final ImageView.ScaleType g;
    public final Float h;
    public final Integer i;
    public final Integer j;

    public grc(Integer num, ColorModel colorModel, rbv rbvVar, lrc lrcVar, urc urcVar, int i, ImageView.ScaleType scaleType, Float f, Integer num2, Integer num3) {
        this.a = num;
        this.b = colorModel;
        this.c = rbvVar;
        this.d = lrcVar;
        this.e = urcVar;
        this.f = i;
        this.g = scaleType;
        this.h = f;
        this.i = num2;
        this.j = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grc)) {
            return false;
        }
        grc grcVar = (grc) obj;
        return jl40.l(this.a, grcVar.a) && jl40.l(this.b, grcVar.b) && jl40.l(this.c, grcVar.c) && this.d.equals(grcVar.d) && jl40.l(this.e, grcVar.e) && this.f == grcVar.f && this.g == grcVar.g && jl40.l(this.h, grcVar.h) && jl40.l(this.i, grcVar.i) && jl40.l(this.j, grcVar.j);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ColorModel colorModel = this.b;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        rbv rbvVar = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31;
        urc urcVar = this.e;
        int hashCode4 = (this.g.hashCode() + oyr.b(this.f, (hashCode3 + (urcVar == null ? 0 : urcVar.hashCode())) * 31, 31)) * 31;
        Float f = this.h;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.i;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "State(backgroundColor=" + this.a + ", imageBackground=" + this.b + ", image=" + this.c + ", infoViewState=" + this.d + ", imagePaddings=" + this.e + ", infoViewPaddingTopPx=" + this.f + ", scaleType=" + this.g + ", guidelinePercent=" + this.h + ", imageViewSizeHeight=" + this.i + ", topInsetPx=" + this.j + Extension.C_BRAKE;
    }
}
