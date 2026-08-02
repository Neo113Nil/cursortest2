package defpackage;

import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class obv implements kbv {
    public final String b;
    public final ImageModel$Tag$Theme c;
    public final int d;

    public /* synthetic */ obv(String str, ImageModel$Tag$Theme imageModel$Tag$Theme, int i, int i2) {
        this(str, (i & 2) != 0 ? null : imageModel$Tag$Theme, (i & 4) != 0 ? 0 : 640);
    }

    public static obv a(obv obvVar, ImageModel$Tag$Theme imageModel$Tag$Theme, int i, int i2) {
        String str = obvVar.b;
        if ((i2 & 4) != 0) {
            i = obvVar.d;
        }
        obvVar.getClass();
        return new obv(str, imageModel$Tag$Theme, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obv)) {
            return false;
        }
        obv obvVar = (obv) obj;
        return jl40.l(this.b, obvVar.b) && this.c == obvVar.c && this.d == obvVar.d;
    }

    @Override // defpackage.kbv
    public final String getKey() {
        ImageModel$Tag$Theme imageModel$Tag$Theme = this.c;
        return this.b + "||" + (imageModel$Tag$Theme != null ? imageModel$Tag$Theme.getId() : null) + "||" + this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ImageModel$Tag$Theme imageModel$Tag$Theme = this.c;
        return Integer.hashCode(this.d) + ((hashCode + (imageModel$Tag$Theme == null ? 0 : imageModel$Tag$Theme.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag(tag=");
        sb.append(this.b);
        sb.append(", forceTheme=");
        sb.append(this.c);
        sb.append(", forceSizeHint=");
        return oyr.m(this.d, Extension.C_BRAKE, sb);
    }

    public obv(String str, ImageModel$Tag$Theme imageModel$Tag$Theme, int i) {
        this.b = str;
        this.c = imageModel$Tag$Theme;
        this.d = i;
    }
}
