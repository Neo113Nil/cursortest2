package com.yandex.go.navigator.rate_route.experiement;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/rate_route/experiement/OptionDto;", "", "Companion", "$serializer", "com/yandex/go/navigator/rate_route/experiement/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OptionDto {
    public static final c Companion = new c();
    public final String a;
    public final String b;

    public /* synthetic */ OptionDto(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionDto)) {
            return false;
        }
        OptionDto optionDto = (OptionDto) obj;
        return jl40.l(this.a, optionDto.a) && jl40.l(this.b, optionDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OptionDto(id=", this.a, ", titleKey=", this.b, Extension.C_BRAKE);
    }

    public OptionDto() {
        this.a = "";
        this.b = "";
    }
}
