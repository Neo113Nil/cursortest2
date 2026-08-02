package xsna;

import ru.ok.android.api.core.ApiInvocationException;
import xsna.tgv0;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public final class pgv0 {
    public final vgv0 a;
    public final ugv0 b;
    public final qgv0 c;
    public final sgv0 d;
    public final tgv0 e;
    public final rgv0 f;
    public final ogv0 g;
    public final ogv0 h;
    public final ogv0 i;

    public pgv0() {
        this(null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [xsna.tgv0] */
    public static pgv0 a(pgv0 pgv0Var, vgv0 vgv0Var, qgv0 qgv0Var, tgv0.a aVar, ogv0 ogv0Var, ogv0 ogv0Var2, int i) {
        if ((i & 1) != 0) {
            vgv0Var = pgv0Var.a;
        }
        vgv0 vgv0Var2 = vgv0Var;
        ugv0 ugv0Var = pgv0Var.b;
        if ((i & 4) != 0) {
            qgv0Var = pgv0Var.c;
        }
        qgv0 qgv0Var2 = qgv0Var;
        sgv0 sgv0Var = pgv0Var.d;
        tgv0.a aVar2 = aVar;
        if ((i & 16) != 0) {
            aVar2 = pgv0Var.e;
        }
        tgv0.a aVar3 = aVar2;
        rgv0 rgv0Var = pgv0Var.f;
        ogv0 ogv0Var3 = (i & 64) != 0 ? pgv0Var.g : ogv0Var;
        ogv0 ogv0Var4 = (i & 128) != 0 ? pgv0Var.h : ogv0Var2;
        ogv0 ogv0Var5 = pgv0Var.i;
        pgv0Var.getClass();
        return new pgv0(vgv0Var2, ugv0Var, qgv0Var2, sgv0Var, aVar3, rgv0Var, ogv0Var3, ogv0Var4, ogv0Var5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgv0)) {
            return false;
        }
        pgv0 pgv0Var = (pgv0) obj;
        return epx.f(this.a, pgv0Var.a) && epx.f(this.b, pgv0Var.b) && epx.f(this.c, pgv0Var.c) && epx.f(this.d, pgv0Var.d) && epx.f(this.e, pgv0Var.e) && epx.f(this.f, pgv0Var.f) && epx.f(this.g, pgv0Var.g) && epx.f(this.h, pgv0Var.h) && epx.f(this.i, pgv0Var.i);
    }

    public final int hashCode() {
        vgv0 vgv0Var = this.a;
        int hashCode = (vgv0Var == null ? 0 : vgv0Var.hashCode()) * 31;
        ugv0 ugv0Var = this.b;
        int hashCode2 = (hashCode + (ugv0Var == null ? 0 : ugv0Var.hashCode())) * 31;
        qgv0 qgv0Var = this.c;
        int hashCode3 = (hashCode2 + (qgv0Var == null ? 0 : qgv0Var.hashCode())) * 31;
        sgv0 sgv0Var = this.d;
        int hashCode4 = (hashCode3 + (sgv0Var == null ? 0 : sgv0Var.hashCode())) * 31;
        tgv0 tgv0Var = this.e;
        int hashCode5 = (hashCode4 + (tgv0Var == null ? 0 : tgv0Var.hashCode())) * 31;
        rgv0 rgv0Var = this.f;
        int hashCode6 = (hashCode5 + (rgv0Var == null ? 0 : rgv0Var.hashCode())) * 31;
        ogv0 ogv0Var = this.g;
        int hashCode7 = (hashCode6 + (ogv0Var == null ? 0 : ogv0Var.hashCode())) * 31;
        ogv0 ogv0Var2 = this.h;
        int hashCode8 = (hashCode7 + (ogv0Var2 == null ? 0 : ogv0Var2.hashCode())) * 31;
        ogv0 ogv0Var3 = this.i;
        return hashCode8 + (ogv0Var3 != null ? ogv0Var3.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultMiddle(title=" + this.a + ", subtitle=" + this.b + ", extraSubtitle=" + this.c + ", overtitle=" + this.d + ", slot=" + this.e + ", meta=" + this.f + ", firstButton=" + this.g + ", secondButton=" + this.h + ", thirdButton=" + this.i + ')';
    }

    public pgv0(vgv0 vgv0Var, ugv0 ugv0Var, qgv0 qgv0Var, sgv0 sgv0Var, tgv0 tgv0Var, rgv0 rgv0Var, ogv0 ogv0Var, ogv0 ogv0Var2, ogv0 ogv0Var3) {
        this.a = vgv0Var;
        this.b = ugv0Var;
        this.c = qgv0Var;
        this.d = sgv0Var;
        this.e = tgv0Var;
        this.f = rgv0Var;
        this.g = ogv0Var;
        this.h = ogv0Var2;
        this.i = ogv0Var3;
    }

    public /* synthetic */ pgv0(vgv0 vgv0Var, ugv0 ugv0Var, qgv0 qgv0Var, tgv0.a aVar, ogv0 ogv0Var, ogv0 ogv0Var2, int i) {
        this((i & 1) != 0 ? null : vgv0Var, (i & 2) != 0 ? null : ugv0Var, (i & 4) != 0 ? null : qgv0Var, null, (i & 16) != 0 ? null : aVar, null, (i & 64) != 0 ? null : ogv0Var, (i & 128) != 0 ? null : ogv0Var2, null);
    }
}
