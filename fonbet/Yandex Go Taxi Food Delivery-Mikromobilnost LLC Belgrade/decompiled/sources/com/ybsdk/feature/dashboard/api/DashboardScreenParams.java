package com.ybsdk.feature.dashboard.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/dashboard/api/DashboardScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/dashboard/api/model/ProductId;", "productId", "", "agreementId", "productType", "<init>", "(Lcom/ybsdk/feature/dashboard/api/model/ProductId;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/dashboard/api/model/ProductId;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/ybsdk/feature/dashboard/api/model/ProductId;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/dashboard/api/DashboardScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/dashboard/api/model/ProductId;", "getProductId", "Ljava/lang/String;", "getAgreementId", "getProductType", "feature-dashboard-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardScreenParams implements ScreenParams {
    public static final Parcelable.Creator<DashboardScreenParams> CREATOR = new Creator();
    private final String agreementId;
    private final ProductId productId;
    private final String productType;

    public /* synthetic */ DashboardScreenParams(ProductId productId, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProductId.WALLET : productId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ DashboardScreenParams copy$default(DashboardScreenParams dashboardScreenParams, ProductId productId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            productId = dashboardScreenParams.productId;
        }
        if ((i & 2) != 0) {
            str = dashboardScreenParams.agreementId;
        }
        if ((i & 4) != 0) {
            str2 = dashboardScreenParams.productType;
        }
        return dashboardScreenParams.copy(productId, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductId getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final DashboardScreenParams copy(ProductId productId, String agreementId, String productType) {
        return new DashboardScreenParams(productId, agreementId, productType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardScreenParams)) {
            return false;
        }
        DashboardScreenParams dashboardScreenParams = (DashboardScreenParams) other;
        return this.productId == dashboardScreenParams.productId && jl40.l(this.agreementId, dashboardScreenParams.agreementId) && jl40.l(this.productType, dashboardScreenParams.productType);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final ProductId getProductId() {
        return this.productId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int hashCode = this.productId.hashCode() * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productType;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        ProductId productId = this.productId;
        String str = this.agreementId;
        String str2 = this.productType;
        StringBuilder sb = new StringBuilder("DashboardScreenParams(productId=");
        sb.append(productId);
        sb.append(", agreementId=");
        sb.append(str);
        sb.append(", productType=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.productId.name());
        dest.writeString(this.agreementId);
        dest.writeString(this.productType);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DashboardScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DashboardScreenParams createFromParcel(Parcel parcel) {
            return new DashboardScreenParams(ProductId.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DashboardScreenParams[] newArray(int i) {
            return new DashboardScreenParams[i];
        }
    }

    public DashboardScreenParams(ProductId productId, String str, String str2) {
        this.productId = productId;
        this.agreementId = str;
        this.productType = str2;
    }

    public DashboardScreenParams() {
        this(null, null, null, 7, null);
    }
}
