package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.videoplayer.api.VideoPlayer$RepeatMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class nrc {
    public final rbv a;
    public final ColorModel b;
    public final lrc c;
    public final int d;
    public final String e;
    public final boolean f;
    public final VideoPlayer$RepeatMode g;
    public final boolean h;
    public final zrc i;
    public final int j;
    public final String k;
    public final Integer l;

    public nrc(rbv rbvVar, ColorModel colorModel, lrc lrcVar, int i, String str, boolean z, VideoPlayer$RepeatMode videoPlayer$RepeatMode, boolean z2, zrc zrcVar, int i2, Integer num) {
        this.a = rbvVar;
        this.b = colorModel;
        this.c = lrcVar;
        this.d = i;
        this.e = str;
        this.f = z;
        this.g = videoPlayer$RepeatMode;
        this.h = z2;
        this.i = zrcVar;
        this.j = i2;
        this.k = str;
        this.l = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrc)) {
            return false;
        }
        nrc nrcVar = (nrc) obj;
        return jl40.l(this.a, nrcVar.a) && jl40.l(this.b, nrcVar.b) && this.c.equals(nrcVar.c) && this.d == nrcVar.d && this.e.equals(nrcVar.e) && this.f == nrcVar.f && this.g == nrcVar.g && this.h == nrcVar.h && this.i.equals(nrcVar.i) && this.j == nrcVar.j && this.k.equals(nrcVar.k) && jl40.l(this.l, nrcVar.l);
    }

    public final int hashCode() {
        rbv rbvVar = this.a;
        int hashCode = (rbvVar == null ? 0 : rbvVar.hashCode()) * 31;
        ColorModel colorModel = this.b;
        int b = unr0.b(oyr.b(this.j, (this.i.hashCode() + unr0.e((this.g.hashCode() + unr0.e(unr0.b(oyr.b(this.d, (this.c.hashCode() + ((hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31)) * 31, 31), 31, this.e), 31, this.f)) * 31, 31, this.h)) * 31, 31), 31, this.k);
        Integer num = this.l;
        return b + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(backgroundImage=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", infoViewState=");
        sb.append(this.c);
        sb.append(", infoViewPaddingTopPx=");
        sb.append(this.d);
        sb.append(", videoUri=");
        tse0.y(this.e, ", hasButton=", ", repeatMode=", sb, this.f);
        sb.append(this.g);
        sb.append(", playWhenReady=");
        sb.append(this.h);
        sb.append(", loadingState=");
        sb.append(this.i);
        sb.append(", shimmerPaddingTopDp=");
        sb.append(this.j);
        sb.append(", id=");
        sb.append(this.k);
        sb.append(", topInsetPx=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
