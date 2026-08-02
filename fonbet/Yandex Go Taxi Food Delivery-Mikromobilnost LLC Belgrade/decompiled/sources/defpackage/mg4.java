package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.ScaleType;

/* loaded from: classes5.dex */
public final class mg4 implements qg4 {
    public final sbv a;
    public final Float b;
    public final ScaleType c;

    public mg4(sbv sbvVar, Float f, ScaleType scaleType) {
        this.a = sbvVar;
        this.b = f;
        this.c = scaleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg4)) {
            return false;
        }
        mg4 mg4Var = (mg4) obj;
        return this.a.equals(mg4Var.a) && jl40.l(this.b, mg4Var.b) && this.c == mg4Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        ScaleType scaleType = this.c;
        return hashCode2 + (scaleType != null ? scaleType.hashCode() : 0);
    }

    public final String toString() {
        return "ImageBackground(image=" + this.a + ", alpha=" + this.b + ", scaleType=" + this.c + Extension.C_BRAKE;
    }
}
