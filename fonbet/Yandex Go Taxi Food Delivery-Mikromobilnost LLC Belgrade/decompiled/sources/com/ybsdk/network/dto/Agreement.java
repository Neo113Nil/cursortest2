package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.network.dto.common.Product;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/network/dto/Agreement;", "", "agreementId", "", CreateApplicationWithProductJsonAdapter.productKey, "Lcom/ybsdk/network/dto/common/Product;", "accessors", "", "Lcom/ybsdk/network/dto/Agreement$Accessor;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/network/dto/common/Product;Ljava/util/List;)V", "getAgreementId", "()Ljava/lang/String;", "getProduct", "()Lcom/ybsdk/network/dto/common/Product;", "getAccessors", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Accessor", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Agreement {
    private final List<Accessor> accessors;
    private final String agreementId;
    private final Product product;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/network/dto/Agreement$Accessor;", "", "accessorId", "", "<init>", "(Ljava/lang/String;)V", "getAccessorId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Accessor {
        private final String accessorId;

        public Accessor(@Json(name = "accessor_id") String str) {
            this.accessorId = str;
        }

        public static /* synthetic */ Accessor copy$default(Accessor accessor, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accessor.accessorId;
            }
            return accessor.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccessorId() {
            return this.accessorId;
        }

        public final Accessor copy(@Json(name = "accessor_id") String accessorId) {
            return new Accessor(accessorId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Accessor) && jl40.l(this.accessorId, ((Accessor) other).accessorId);
        }

        public final String getAccessorId() {
            return this.accessorId;
        }

        public int hashCode() {
            return this.accessorId.hashCode();
        }

        public String toString() {
            return oyr.p("Accessor(accessorId=", this.accessorId, Extension.C_BRAKE);
        }
    }

    public Agreement(@Json(name = "agreement_id") String str, @Json(name = "product") Product product, @Json(name = "accessors") List<Accessor> list) {
        this.agreementId = str;
        this.product = product;
        this.accessors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Agreement copy$default(Agreement agreement, String str, Product product, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreement.agreementId;
        }
        if ((i & 2) != 0) {
            product = agreement.product;
        }
        if ((i & 4) != 0) {
            list = agreement.accessors;
        }
        return agreement.copy(str, product, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    public final List<Accessor> component3() {
        return this.accessors;
    }

    public final Agreement copy(@Json(name = "agreement_id") String agreementId, @Json(name = "product") Product product, @Json(name = "accessors") List<Accessor> accessors) {
        return new Agreement(agreementId, product, accessors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Agreement)) {
            return false;
        }
        Agreement agreement = (Agreement) other;
        return jl40.l(this.agreementId, agreement.agreementId) && this.product == agreement.product && jl40.l(this.accessors, agreement.accessors);
    }

    public final List<Accessor> getAccessors() {
        return this.accessors;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Product getProduct() {
        return this.product;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        Product product = this.product;
        return this.accessors.hashCode() + ((hashCode + (product == null ? 0 : product.hashCode())) * 31);
    }

    public String toString() {
        String str = this.agreementId;
        Product product = this.product;
        List<Accessor> list = this.accessors;
        StringBuilder sb = new StringBuilder("Agreement(agreementId=");
        sb.append(str);
        sb.append(", product=");
        sb.append(product);
        sb.append(", accessors=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
