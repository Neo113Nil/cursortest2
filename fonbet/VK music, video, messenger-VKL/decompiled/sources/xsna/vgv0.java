package xsna;

import android.text.TextUtils;
import xsna.ngv0;
import xsna.tlo0;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public final class vgv0 {
    public final tlo0 a;
    public final ngv0 b;
    public final ngv0 c;
    public final int d;
    public final TextUtils.TruncateAt e;

    public /* synthetic */ vgv0(tlo0.h hVar, ngv0.a aVar, ngv0 ngv0Var, int i, int i2) {
        this(hVar, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : ngv0Var, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? null : TextUtils.TruncateAt.END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [xsna.tlo0] */
    public static vgv0 a(vgv0 vgv0Var, tlo0.h hVar, int i, int i2) {
        tlo0.h hVar2 = hVar;
        if ((i2 & 1) != 0) {
            hVar2 = vgv0Var.a;
        }
        tlo0.h hVar3 = hVar2;
        ngv0 ngv0Var = vgv0Var.b;
        ngv0 ngv0Var2 = vgv0Var.c;
        if ((i2 & 8) != 0) {
            i = vgv0Var.d;
        }
        TextUtils.TruncateAt truncateAt = vgv0Var.e;
        vgv0Var.getClass();
        return new vgv0(hVar3, ngv0Var, ngv0Var2, i, truncateAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgv0)) {
            return false;
        }
        vgv0 vgv0Var = (vgv0) obj;
        return epx.f(this.a, vgv0Var.a) && epx.f(this.b, vgv0Var.b) && epx.f(this.c, vgv0Var.c) && this.d == vgv0Var.d && this.e == vgv0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ngv0 ngv0Var = this.b;
        int hashCode2 = (hashCode + (ngv0Var == null ? 0 : ngv0Var.hashCode())) * 31;
        ngv0 ngv0Var2 = this.c;
        int a = shy.a(this.d, (hashCode2 + (ngv0Var2 == null ? 0 : ngv0Var2.hashCode())) * 31, 31);
        TextUtils.TruncateAt truncateAt = this.e;
        return a + (truncateAt != null ? truncateAt.hashCode() : 0);
    }

    public final String toString() {
        return "Title(title=" + this.a + ", before=" + this.b + ", after=" + this.c + ", maxLines=" + this.d + ", overflow=" + this.e + ')';
    }

    public vgv0(tlo0 tlo0Var, ngv0 ngv0Var, ngv0 ngv0Var2, int i, TextUtils.TruncateAt truncateAt) {
        this.a = tlo0Var;
        this.b = ngv0Var;
        this.c = ngv0Var2;
        this.d = i;
        this.e = truncateAt;
    }
}
