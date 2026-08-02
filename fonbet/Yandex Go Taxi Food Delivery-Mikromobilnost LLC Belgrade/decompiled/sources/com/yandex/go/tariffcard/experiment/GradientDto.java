package com.yandex.go.tariffcard.experiment;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/GradientDto;", "", "Companion", "$serializer", "com/yandex/go/tariffcard/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GradientDto {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final double c;

    public /* synthetic */ GradientDto(String str, double d, String str2, int i) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, GradientDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientDto)) {
            return false;
        }
        GradientDto gradientDto = (GradientDto) obj;
        return jl40.l(this.a, gradientDto.a) && jl40.l(this.b, gradientDto.b) && Double.compare(this.c, gradientDto.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return nzs.c(b64.v("GradientDto(startColor=", this.a, ", endColor=", this.b, ", endLocation="), this.c, Extension.C_BRAKE);
    }
}
