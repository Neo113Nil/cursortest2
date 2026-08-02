package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.ScaleType;

/* loaded from: classes5.dex */
public final class pg4 implements qg4 {
    public final String a;
    public final Float b;
    public final ScaleType c;
    public final boolean d;
    public final boolean e;
    public final qg4 f;

    public pg4(String str, Float f, ScaleType scaleType, boolean z, boolean z2, qg4 qg4Var) {
        this.a = str;
        this.b = f;
        this.c = scaleType;
        this.d = z;
        this.e = z2;
        this.f = qg4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg4)) {
            return false;
        }
        pg4 pg4Var = (pg4) obj;
        return jl40.l(this.a, pg4Var.a) && jl40.l(this.b, pg4Var.b) && this.c == pg4Var.c && this.d == pg4Var.d && this.e == pg4Var.e && jl40.l(this.f, pg4Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        ScaleType scaleType = this.c;
        int e = unr0.e(unr0.e((hashCode2 + (scaleType == null ? 0 : scaleType.hashCode())) * 31, 31, this.d), 31, this.e);
        qg4 qg4Var = this.f;
        return e + (qg4Var != null ? qg4Var.hashCode() : 0);
    }

    public final String toString() {
        return "VideoBackground(videoUrl=" + this.a + ", alpha=" + this.b + ", scaleType=" + this.c + ", loop=" + this.d + ", muted=" + this.e + ", previewContent=" + this.f + Extension.C_BRAKE;
    }
}
