package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ee10 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final Boolean e;

    public ee10(String str, ArrayList arrayList, String str2, String str3, Boolean bool) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee10)) {
            return false;
        }
        ee10 ee10Var = (ee10) obj;
        return jl40.l(this.a, ee10Var.a) && this.b.equals(ee10Var.b) && jl40.l(this.c, ee10Var.c) && jl40.l(this.d, ee10Var.d) && jl40.l(this.e, ee10Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int b = ly3.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = x4e.m("MediaItem(id=", this.a, ", streams=", ", firstFrameHash=", this.b);
        g8e.D(m, this.c, ", firstFrameUrl=", this.d, ", shouldShowFirstFrameUntilPlayback=");
        return nzs.d(m, this.e, Extension.C_BRAKE);
    }
}
