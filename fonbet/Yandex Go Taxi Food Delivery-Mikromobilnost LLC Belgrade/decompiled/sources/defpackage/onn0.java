package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class onn0 {
    public final String a;
    public final Bitmap b;
    public final String c;
    public final String d;
    public final List e;

    public onn0(String str, Bitmap bitmap, String str2, String str3, List list) {
        this.a = str;
        this.b = bitmap;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onn0)) {
            return false;
        }
        onn0 onn0Var = (onn0) obj;
        return jl40.l(this.a, onn0Var.a) && jl40.l(this.b, onn0Var.b) && jl40.l(this.c, onn0Var.c) && this.d.equals(onn0Var.d) && this.e.equals(onn0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        return this.e.hashCode() + unr0.b(unr0.b((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersFinishInfoStatisticsUiState(vehicleNumber=");
        sb.append(this.a);
        sb.append(", vehicleImage=");
        sb.append(this.b);
        sb.append(", routeFromAddresses=");
        g8e.D(sb, this.c, ", mapUrl=", this.d, ", statisticsItems=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
