package defpackage;

import android.widget.ImageView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class bks {
    public final rbv a;
    public final aks b;
    public final ImageView.ScaleType c;

    public bks(rbv rbvVar, aks aksVar, int i) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        aksVar = (i & 2) != 0 ? null : aksVar;
        scaleType = (i & 4) != 0 ? ImageView.ScaleType.CENTER_CROP : scaleType;
        this.a = rbvVar;
        this.b = aksVar;
        this.c = scaleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bks)) {
            return false;
        }
        bks bksVar = (bks) obj;
        return jl40.l(this.a, bksVar.a) && jl40.l(this.b, bksVar.b) && this.c == bksVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        aks aksVar = this.b;
        return this.c.hashCode() + ((hashCode + (aksVar == null ? 0 : aksVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Image(icon=" + this.a + ", size=" + this.b + ", scaleType=" + this.c + Extension.C_BRAKE;
    }
}
