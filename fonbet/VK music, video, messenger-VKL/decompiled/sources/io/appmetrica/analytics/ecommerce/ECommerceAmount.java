package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.vo;
import java.math.BigDecimal;
import xsna.i5s;

/* loaded from: classes8.dex */
public class ECommerceAmount {
    private final BigDecimal a;
    private final String b;

    public ECommerceAmount(long j, @NonNull String str) {
        this(vo.a(j), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.a;
    }

    @NonNull
    public String getUnit() {
        return this.b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.a);
        sb.append(", unit='");
        return i5s.a(sb, this.b, "'}");
    }

    public ECommerceAmount(double d, @NonNull String str) {
        this(new BigDecimal(vo.a(d)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.a = bigDecimal;
        this.b = str;
    }
}
