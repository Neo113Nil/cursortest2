package com.yandex.go.taxi.order.models.api.response.progress_bar;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/progress_bar/ProgressBarDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/progress_bar/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ProgressBarDto {
    public static final a Companion = new a();
    public final int a;
    public final String b;
    public final boolean c;

    public /* synthetic */ ProgressBarDto(int i, String str, boolean z, int i2) {
        this.a = (i & 1) == 0 ? 0 : i2;
        this.b = (i & 2) == 0 ? "" : str;
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarDto)) {
            return false;
        }
        ProgressBarDto progressBarDto = (ProgressBarDto) obj;
        return this.a == progressBarDto.a && jl40.l(this.b, progressBarDto.b) && this.c == progressBarDto.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(unr0.v(this.a, "ProgressBarDto(timeInterval=", ", foregroundColor=", this.b, ", shouldIncrease="), this.c, Extension.C_BRAKE);
    }

    public ProgressBarDto(int i) {
        this.a = 0;
        this.b = "";
        this.c = true;
    }

    public ProgressBarDto() {
        this(0);
    }
}
