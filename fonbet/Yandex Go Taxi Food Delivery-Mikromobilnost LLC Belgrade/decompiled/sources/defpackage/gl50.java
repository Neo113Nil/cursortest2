package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgl50;", "", "Companion", "el50", "fl50", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class gl50 {
    public static final fl50 Companion = new fl50();
    public final String a;
    public final Float b;
    public final int c;

    public /* synthetic */ gl50(int i, String str, Float f, int i2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = 60;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl50)) {
            return false;
        }
        gl50 gl50Var = (gl50) obj;
        return jl40.l(this.a, gl50Var.a) && jl40.l(this.b, gl50Var.b) && this.c == gl50Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearestStopDto(id=");
        sb.append(this.a);
        sb.append(", minZoom=");
        sb.append(this.b);
        sb.append(", pollingTime=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }

    public gl50() {
        this.a = "";
        this.b = null;
        this.c = 60;
    }
}
