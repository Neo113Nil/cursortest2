package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaFontWeight;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextOverflow;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextStyle;

/* loaded from: classes5.dex */
public final class cyu0 {
    public final String a;
    public final YaTextStyle b;
    public final YaFontWeight c;
    public final long d;
    public final int e;
    public final YaTextOverflow f;

    public cyu0(String str, YaTextStyle yaTextStyle, YaFontWeight yaFontWeight, long j, int i, YaTextOverflow yaTextOverflow) {
        this.a = str;
        this.b = yaTextStyle;
        this.c = yaFontWeight;
        this.d = j;
        this.e = i;
        this.f = yaTextOverflow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyu0)) {
            return false;
        }
        cyu0 cyu0Var = (cyu0) obj;
        return jl40.l(this.a, cyu0Var.a) && this.b == cyu0Var.b && this.c == cyu0Var.c && ldc.c(this.d, cyu0Var.d) && this.e == cyu0Var.e && this.f == cyu0Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        YaFontWeight yaFontWeight = this.c;
        int hashCode2 = (hashCode + (yaFontWeight == null ? 0 : yaFontWeight.hashCode())) * 31;
        int i = ldc.n;
        return this.f.hashCode() + oyr.b(this.e, qv10.c(hashCode2, 31, this.d), 31);
    }

    public final String toString() {
        return "StyledTextParams(text=" + this.a + ", style=" + this.b + ", weight=" + this.c + ", color=" + ldc.i(this.d) + ", maxLines=" + this.e + ", overflow=" + this.f + Extension.C_BRAKE;
    }

    public /* synthetic */ cyu0(String str, YaTextStyle yaTextStyle, long j) {
        this(str, yaTextStyle, null, j, 1, YaTextOverflow.Ellipsis);
    }
}
