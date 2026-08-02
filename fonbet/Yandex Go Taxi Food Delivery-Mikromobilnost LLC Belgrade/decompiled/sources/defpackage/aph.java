package defpackage;

import android.graphics.Bitmap;
import coil.view.Precision;
import coil.view.Scale;

/* loaded from: classes10.dex */
public final class aph {
    public final rjs0 a;
    public final Scale b;
    public final jse c;
    public final qx01 d;
    public final Precision e;
    public final Bitmap.Config f;
    public final Boolean g;

    public aph(rjs0 rjs0Var, Scale scale, jse jseVar, qx01 qx01Var, Precision precision, Bitmap.Config config, Boolean bool) {
        this.a = rjs0Var;
        this.b = scale;
        this.c = jseVar;
        this.d = qx01Var;
        this.e = precision;
        this.f = config;
        this.g = bool;
    }

    public final rjs0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aph)) {
            return false;
        }
        aph aphVar = (aph) obj;
        return jl40.l(this.a, aphVar.a) && this.b == aphVar.b && jl40.l(this.c, aphVar.c) && jl40.l(this.d, aphVar.d) && this.e == aphVar.e && this.f == aphVar.f && jl40.l(this.g, aphVar.g);
    }

    public final int hashCode() {
        rjs0 rjs0Var = this.a;
        int hashCode = (rjs0Var != null ? rjs0Var.hashCode() : 0) * 31;
        Scale scale = this.b;
        int hashCode2 = (hashCode + (scale != null ? scale.hashCode() : 0)) * 961;
        jse jseVar = this.c;
        int hashCode3 = (hashCode2 + (jseVar != null ? jseVar.hashCode() : 0)) * 29791;
        qx01 qx01Var = this.d;
        int hashCode4 = (hashCode3 + (qx01Var != null ? qx01Var.hashCode() : 0)) * 31;
        Precision precision = this.e;
        int hashCode5 = (hashCode4 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f;
        int hashCode6 = (hashCode5 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        return (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 923521;
    }
}
