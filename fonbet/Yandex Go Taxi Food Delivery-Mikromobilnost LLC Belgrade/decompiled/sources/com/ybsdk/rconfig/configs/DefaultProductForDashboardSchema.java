package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/DefaultProductForDashboardSchema;", "", "Lcom/ybsdk/rconfig/configs/DefaultProductForDashboard;", CreateApplicationWithProductJsonAdapter.productKey, "<init>", "(Lcom/ybsdk/rconfig/configs/DefaultProductForDashboard;)V", "component1", "()Lcom/ybsdk/rconfig/configs/DefaultProductForDashboard;", "copy", "(Lcom/ybsdk/rconfig/configs/DefaultProductForDashboard;)Lcom/ybsdk/rconfig/configs/DefaultProductForDashboardSchema;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/DefaultProductForDashboard;", "getProduct", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DefaultProductForDashboardSchema {

    @Json(name = CreateApplicationWithProductJsonAdapter.productKey)
    private final DefaultProductForDashboard product;

    public DefaultProductForDashboardSchema(DefaultProductForDashboard defaultProductForDashboard) {
        this.product = defaultProductForDashboard;
    }

    public static /* synthetic */ DefaultProductForDashboardSchema copy$default(DefaultProductForDashboardSchema defaultProductForDashboardSchema, DefaultProductForDashboard defaultProductForDashboard, int i, Object obj) {
        if ((i & 1) != 0) {
            defaultProductForDashboard = defaultProductForDashboardSchema.product;
        }
        return defaultProductForDashboardSchema.copy(defaultProductForDashboard);
    }

    /* renamed from: component1, reason: from getter */
    public final DefaultProductForDashboard getProduct() {
        return this.product;
    }

    public final DefaultProductForDashboardSchema copy(DefaultProductForDashboard product) {
        return new DefaultProductForDashboardSchema(product);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DefaultProductForDashboardSchema) && this.product == ((DefaultProductForDashboardSchema) other).product;
    }

    public final DefaultProductForDashboard getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.product.hashCode();
    }

    public String toString() {
        return "DefaultProductForDashboardSchema(product=" + this.product + Extension.C_BRAKE;
    }
}
