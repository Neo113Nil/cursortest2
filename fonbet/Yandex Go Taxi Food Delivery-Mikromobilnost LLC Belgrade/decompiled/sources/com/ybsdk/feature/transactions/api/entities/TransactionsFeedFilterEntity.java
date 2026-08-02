package com.ybsdk.feature.transactions.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/transactions/api/entities/TransactionsFeedFilterEntity;", "Landroid/os/Parcelable;", "", CreateApplicationWithProductJsonAdapter.productKey, "agreementId", "headerStyle", "filtersStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transactions/api/entities/TransactionsFeedFilterEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getAgreementId", "getHeaderStyle", "getFiltersStyle", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsFeedFilterEntity implements Parcelable {
    public static final Parcelable.Creator<TransactionsFeedFilterEntity> CREATOR = new Creator();
    private final String agreementId;
    private final String filtersStyle;
    private final String headerStyle;
    private final String product;

    public TransactionsFeedFilterEntity(String str, String str2, String str3, String str4) {
        this.product = str;
        this.agreementId = str2;
        this.headerStyle = str3;
        this.filtersStyle = str4;
    }

    public static /* synthetic */ TransactionsFeedFilterEntity copy$default(TransactionsFeedFilterEntity transactionsFeedFilterEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionsFeedFilterEntity.product;
        }
        if ((i & 2) != 0) {
            str2 = transactionsFeedFilterEntity.agreementId;
        }
        if ((i & 4) != 0) {
            str3 = transactionsFeedFilterEntity.headerStyle;
        }
        if ((i & 8) != 0) {
            str4 = transactionsFeedFilterEntity.filtersStyle;
        }
        return transactionsFeedFilterEntity.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeaderStyle() {
        return this.headerStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFiltersStyle() {
        return this.filtersStyle;
    }

    public final TransactionsFeedFilterEntity copy(String product, String agreementId, String headerStyle, String filtersStyle) {
        return new TransactionsFeedFilterEntity(product, agreementId, headerStyle, filtersStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsFeedFilterEntity)) {
            return false;
        }
        TransactionsFeedFilterEntity transactionsFeedFilterEntity = (TransactionsFeedFilterEntity) other;
        return jl40.l(this.product, transactionsFeedFilterEntity.product) && jl40.l(this.agreementId, transactionsFeedFilterEntity.agreementId) && jl40.l(this.headerStyle, transactionsFeedFilterEntity.headerStyle) && jl40.l(this.filtersStyle, transactionsFeedFilterEntity.filtersStyle);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getFiltersStyle() {
        return this.filtersStyle;
    }

    public final String getHeaderStyle() {
        return this.headerStyle;
    }

    public final String getProduct() {
        return this.product;
    }

    public int hashCode() {
        int hashCode = this.product.hashCode() * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headerStyle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filtersStyle;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.product;
        String str2 = this.agreementId;
        return g8e.r(b64.v("TransactionsFeedFilterEntity(product=", str, ", agreementId=", str2, ", headerStyle="), this.headerStyle, ", filtersStyle=", this.filtersStyle, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.product);
        dest.writeString(this.agreementId);
        dest.writeString(this.headerStyle);
        dest.writeString(this.filtersStyle);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionsFeedFilterEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionsFeedFilterEntity createFromParcel(Parcel parcel) {
            return new TransactionsFeedFilterEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionsFeedFilterEntity[] newArray(int i) {
            return new TransactionsFeedFilterEntity[i];
        }
    }
}
