package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.p9;

/* loaded from: classes7.dex */
public final class hq71 {
    public final tg81 a;
    public final vi71 b;
    public final hlx0 c;
    public final ku81 d;
    public final ck61 e;
    public final j371 f;
    public final cr71 g;
    public final v981 h;
    public final se71 i;
    public final p9 j;

    public hq71(tg81 tg81Var, vi71 vi71Var, hlx0 hlx0Var, ku81 ku81Var, ck61 ck61Var, j371 j371Var, cr71 cr71Var, v981 v981Var, se71 se71Var, p9 p9Var) {
        this.a = tg81Var;
        this.b = vi71Var;
        this.c = hlx0Var;
        this.d = ku81Var;
        this.e = ck61Var;
        this.f = j371Var;
        this.g = cr71Var;
        this.h = v981Var;
        this.i = se71Var;
        this.j = p9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hq71) {
            hq71 hq71Var = (hq71) obj;
            if (jl40.l(this.a, hq71Var.a) && this.b.equals(hq71Var.b) && this.c == hq71Var.c && this.d.equals(hq71Var.d) && jl40.l(this.e, hq71Var.e) && this.f.equals(hq71Var.f) && this.g == hq71Var.g && jl40.l(this.h, hq71Var.h) && jl40.l(this.i, hq71Var.i) && this.j == hq71Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        se71 se71Var = this.i;
        return this.j.hashCode() + ((hashCode + (se71Var == null ? 0 : se71Var.hashCode())) * 31);
    }

    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.a + ", nativeValidator=" + this.b + ", nativeVisualBlock=" + this.c + ", nativeViewRenderer=" + this.d + ", nativeAdFactoriesProvider=" + this.e + ", forceImpressionConfigurator=" + this.f + ", adViewRenderingValidator=" + this.g + ", sdkEnvironmentModule=" + this.h + ", nativeData=" + this.i + ", adStructureType=" + this.j + Extension.C_BRAKE;
    }
}
