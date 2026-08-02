package defpackage;

import android.widget.ImageView;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class hrc {
    public final Integer a;
    public final rbv b;
    public final lrc c;
    public final urc d;
    public final ImageView.ScaleType e;
    public final int f;
    public final ImageScaleTypeEntity g;
    public final Integer h;

    public hrc(Integer num, rbv rbvVar, lrc lrcVar, urc urcVar, ImageView.ScaleType scaleType, int i, ImageScaleTypeEntity imageScaleTypeEntity, Integer num2) {
        this.a = num;
        this.b = rbvVar;
        this.c = lrcVar;
        this.d = urcVar;
        this.e = scaleType;
        this.f = i;
        this.g = imageScaleTypeEntity;
        this.h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrc)) {
            return false;
        }
        hrc hrcVar = (hrc) obj;
        return jl40.l(this.a, hrcVar.a) && jl40.l(this.b, hrcVar.b) && this.c.equals(hrcVar.c) && jl40.l(this.d, hrcVar.d) && this.e == hrcVar.e && this.f == hrcVar.f && this.g == hrcVar.g && jl40.l(this.h, hrcVar.h);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        rbv rbvVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31;
        urc urcVar = this.d;
        int hashCode3 = (this.g.hashCode() + oyr.b(this.f, (this.e.hashCode() + ((hashCode2 + (urcVar == null ? 0 : urcVar.hashCode())) * 31)) * 31, 31)) * 31;
        Integer num2 = this.h;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "State(backgroundColor=" + this.a + ", image=" + this.b + ", infoViewState=" + this.c + ", imagePaddings=" + this.d + ", scaleType=" + this.e + ", infoViewPaddingTopPx=" + this.f + ", imageScaleTypeEntity=" + this.g + ", topInsetPx=" + this.h + Extension.C_BRAKE;
    }
}
