package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$OpenFormat;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class exe0 {
    public static final uwe0 Companion = new uwe0();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(23)), null, null, null, null};
    public final PresentationOptionsDto$OpenFormat a;
    public final xwe0 b;
    public final bxe0 c;
    public final Integer d;
    public final Boolean e;

    public /* synthetic */ exe0(int i, PresentationOptionsDto$OpenFormat presentationOptionsDto$OpenFormat, xwe0 xwe0Var, bxe0 bxe0Var, Integer num, Boolean bool) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, twe0.a.getDescriptor());
            throw null;
        }
        this.a = presentationOptionsDto$OpenFormat;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = xwe0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bxe0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exe0)) {
            return false;
        }
        exe0 exe0Var = (exe0) obj;
        return this.a == exe0Var.a && jl40.l(this.b, exe0Var.b) && jl40.l(this.c, exe0Var.c) && jl40.l(this.d, exe0Var.d) && jl40.l(this.e, exe0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xwe0 xwe0Var = this.b;
        int hashCode2 = (hashCode + (xwe0Var == null ? 0 : xwe0Var.hashCode())) * 31;
        bxe0 bxe0Var = this.c;
        int hashCode3 = (hashCode2 + (bxe0Var == null ? 0 : bxe0Var.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PresentationOptionsDto(openFormat=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", modalHeight=");
        sb.append(this.c);
        sb.append(", shadowAlpha=");
        sb.append(this.d);
        sb.append(", disableClose=");
        return oo31.i(sb, this.e, ')');
    }
}
