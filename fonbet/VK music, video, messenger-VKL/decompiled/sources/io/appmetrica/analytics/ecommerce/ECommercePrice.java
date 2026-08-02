package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.ms9;

/* loaded from: classes8.dex */
public class ECommercePrice {
    private final ECommerceAmount a;
    private List b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.b = list;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommercePrice{fiat=");
        sb.append(this.a);
        sb.append(", internalComponents=");
        return ms9.a('}', sb, this.b);
    }
}
