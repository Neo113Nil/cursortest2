package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class htk0 extends itk0 {
    public final float a;
    public final float b;
    public final List c;

    public htk0(float f, float f2, List list) {
        this.a = f;
        this.b = f2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htk0)) {
            return false;
        }
        htk0 htk0Var = (htk0) obj;
        return Float.compare(this.a, htk0Var.a) == 0 && Float.compare(this.b, htk0Var.b) == 0 && jl40.l(this.c, htk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ly3.s(oo31.k("TrafficLightUiState(minZoom=", this.a, ", maxZoom=", this.b, ", trafficLightObjects="), this.c, Extension.C_BRAKE);
    }
}
