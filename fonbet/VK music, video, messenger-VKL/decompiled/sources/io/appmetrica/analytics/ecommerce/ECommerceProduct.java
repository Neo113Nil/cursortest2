package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import xsna.ms9;

/* loaded from: classes8.dex */
public class ECommerceProduct {
    private final String a;
    private String b;
    private List c;
    private Map d;
    private ECommercePrice e;
    private ECommercePrice f;
    private List g;

    public ECommerceProduct(@NonNull String str) {
        this.a = str;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.c;
    }

    @Nullable
    public String getName() {
        return this.b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.g;
    }

    @NonNull
    public String getSku() {
        return this.a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String str) {
        this.b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.g = list;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceProduct{sku='");
        sb.append(this.a);
        sb.append("', name='");
        sb.append(this.b);
        sb.append("', categoriesPath=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(", actualPrice=");
        sb.append(this.e);
        sb.append(", originalPrice=");
        sb.append(this.f);
        sb.append(", promocodes=");
        return ms9.a('}', sb, this.g);
    }
}
