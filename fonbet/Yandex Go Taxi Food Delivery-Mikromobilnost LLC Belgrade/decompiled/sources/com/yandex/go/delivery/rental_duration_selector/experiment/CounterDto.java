package com.yandex.go.delivery.rental_duration_selector.experiment;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/experiment/CounterDto;", "", "Companion", "$serializer", "com/yandex/go/delivery/rental_duration_selector/experiment/d", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CounterDto {
    public static final d Companion = new d();
    public final String a;

    public /* synthetic */ CounterDto(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CounterDto) && jl40.l(this.a, ((CounterDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CounterDto(titleKey=", this.a, Extension.C_BRAKE);
    }

    public CounterDto(int i) {
        this.a = "";
    }

    public CounterDto() {
        this(0);
    }
}
