package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TileStyle;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.ImagePositionState;

/* loaded from: classes5.dex */
public final class a5z0 {
    public final mcu a;
    public final t4z0 b;
    public final w3b1 c;
    public final a4b1 d;
    public final ky e;
    public final v4v f;
    public final ImagePositionState g;
    public final TileStyle h;
    public final String i;
    public final Object j;

    public a5z0(mcu mcuVar, t4z0 t4z0Var, w3b1 w3b1Var, a4b1 a4b1Var, ky kyVar, ra90 ra90Var, ImagePositionState imagePositionState, TileStyle tileStyle, String str, Object obj) {
        this.a = mcuVar;
        this.b = t4z0Var;
        this.c = w3b1Var;
        this.d = a4b1Var;
        this.e = kyVar;
        this.f = ra90Var;
        this.g = imagePositionState;
        this.h = tileStyle;
        this.i = str;
        this.j = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5z0)) {
            return false;
        }
        a5z0 a5z0Var = (a5z0) obj;
        return jl40.l(this.a, a5z0Var.a) && jl40.l(this.b, a5z0Var.b) && jl40.l(this.c, a5z0Var.c) && jl40.l(this.d, a5z0Var.d) && jl40.l(this.e, a5z0Var.e) && jl40.l(this.f, a5z0Var.f) && this.g == a5z0Var.g && this.h == a5z0Var.h && jl40.l(this.i, a5z0Var.i) && jl40.l(this.j, a5z0Var.j);
    }

    public final int hashCode() {
        mcu mcuVar = this.a;
        int hashCode = (mcuVar == null ? 0 : mcuVar.hashCode()) * 31;
        t4z0 t4z0Var = this.b;
        int hashCode2 = (hashCode + (t4z0Var == null ? 0 : t4z0Var.hashCode())) * 31;
        w3b1 w3b1Var = this.c;
        int hashCode3 = (hashCode2 + (w3b1Var == null ? 0 : w3b1Var.hashCode())) * 31;
        a4b1 a4b1Var = this.d;
        int hashCode4 = (hashCode3 + (a4b1Var == null ? 0 : a4b1Var.hashCode())) * 31;
        ky kyVar = this.e;
        int hashCode5 = (hashCode4 + (kyVar == null ? 0 : kyVar.hashCode())) * 31;
        v4v v4vVar = this.f;
        int hashCode6 = (this.h.hashCode() + ((this.g.hashCode() + ((hashCode5 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31)) * 31)) * 31;
        String str = this.i;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.j;
        return hashCode7 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileState(header=");
        sb.append(this.a);
        sb.append(", footer=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", badge=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", imagePosition=");
        sb.append(this.g);
        sb.append(", style=");
        sb.append(this.h);
        sb.append(", metricaLabel=");
        return tse0.l(sb, this.i, ", meta=", this.j, Extension.C_BRAKE);
    }
}
