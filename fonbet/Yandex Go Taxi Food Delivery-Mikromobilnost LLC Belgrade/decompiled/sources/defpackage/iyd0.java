package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Liyd0;", "T", "", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class iyd0<T> {
    public final Object a;
    public final Integer b;

    public iyd0(Integer num, Object obj) {
        this.a = obj;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyd0)) {
            return false;
        }
        iyd0 iyd0Var = (iyd0) obj;
        return jl40.l(this.a, iyd0Var.a) && jl40.l(this.b, iyd0Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Pollable(value=" + this.a + ", pollingIntervalMs=" + this.b + Extension.C_BRAKE;
    }
}
