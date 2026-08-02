package com.yandex.go.payments_widgets.section.payments;

import defpackage.f9a0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import flex.section.divkit.DivkitSnippet;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments_widgets/section/payments/PaymentWidgetsDataDto;", "", "Companion", "$serializer", "com/yandex/go/payments_widgets/section/payments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentWidgetsDataDto {
    public static final a Companion = new a();
    public static final i3y[] e;
    public final DivkitSnippet a;
    public final DivkitSnippet b;
    public final Boolean c;
    public final Boolean d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new f9a0(23)), kotlin.a.b(lazyThreadSafetyMode, new f9a0(24)), null, null};
    }

    public /* synthetic */ PaymentWidgetsDataDto(int i, DivkitSnippet divkitSnippet, DivkitSnippet divkitSnippet2, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = divkitSnippet;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = divkitSnippet2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentWidgetsDataDto)) {
            return false;
        }
        PaymentWidgetsDataDto paymentWidgetsDataDto = (PaymentWidgetsDataDto) obj;
        return jl40.l(this.a, paymentWidgetsDataDto.a) && jl40.l(this.b, paymentWidgetsDataDto.b) && jl40.l(this.c, paymentWidgetsDataDto.c) && jl40.l(this.d, paymentWidgetsDataDto.d);
    }

    public final int hashCode() {
        DivkitSnippet divkitSnippet = this.a;
        int hashCode = (divkitSnippet == null ? 0 : divkitSnippet.hashCode()) * 31;
        DivkitSnippet divkitSnippet2 = this.b;
        int hashCode2 = (hashCode + (divkitSnippet2 == null ? 0 : divkitSnippet2.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentWidgetsDataDto(expandedWidgets=" + this.a + ", collapsedWidgets=" + this.b + ", isInitiallyCollapsed=" + this.c + ", isExpandable=" + this.d + Extension.C_BRAKE;
    }

    public PaymentWidgetsDataDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
