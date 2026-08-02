package com.ybsdk.feature.split.deposit.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/feature/split/deposit/api/model/SelectedAutoTopupPaymentMethod;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "logo", "", "id", "Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;", "paymentMethodType", "<init>", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;", "copy", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;)Lcom/ybsdk/feature/split/deposit/api/model/SelectedAutoTopupPaymentMethod;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getLogo", "Ljava/lang/String;", "getId", "Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;", "getPaymentMethodType", "feature-split-deposit-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectedAutoTopupPaymentMethod implements Parcelable {
    public static final Parcelable.Creator<SelectedAutoTopupPaymentMethod> CREATOR = new Creator();
    private final String id;
    private final ThemedImageUrlEntity logo;
    private final PaymentMethodType paymentMethodType;

    public SelectedAutoTopupPaymentMethod(ThemedImageUrlEntity themedImageUrlEntity, String str, PaymentMethodType paymentMethodType) {
        this.logo = themedImageUrlEntity;
        this.id = str;
        this.paymentMethodType = paymentMethodType;
    }

    public static /* synthetic */ SelectedAutoTopupPaymentMethod copy$default(SelectedAutoTopupPaymentMethod selectedAutoTopupPaymentMethod, ThemedImageUrlEntity themedImageUrlEntity, String str, PaymentMethodType paymentMethodType, int i, Object obj) {
        if ((i & 1) != 0) {
            themedImageUrlEntity = selectedAutoTopupPaymentMethod.logo;
        }
        if ((i & 2) != 0) {
            str = selectedAutoTopupPaymentMethod.id;
        }
        if ((i & 4) != 0) {
            paymentMethodType = selectedAutoTopupPaymentMethod.paymentMethodType;
        }
        return selectedAutoTopupPaymentMethod.copy(themedImageUrlEntity, str, paymentMethodType);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemedImageUrlEntity getLogo() {
        return this.logo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethodType getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final SelectedAutoTopupPaymentMethod copy(ThemedImageUrlEntity logo, String id, PaymentMethodType paymentMethodType) {
        return new SelectedAutoTopupPaymentMethod(logo, id, paymentMethodType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedAutoTopupPaymentMethod)) {
            return false;
        }
        SelectedAutoTopupPaymentMethod selectedAutoTopupPaymentMethod = (SelectedAutoTopupPaymentMethod) other;
        return jl40.l(this.logo, selectedAutoTopupPaymentMethod.logo) && jl40.l(this.id, selectedAutoTopupPaymentMethod.id) && this.paymentMethodType == selectedAutoTopupPaymentMethod.paymentMethodType;
    }

    public final String getId() {
        return this.id;
    }

    public final ThemedImageUrlEntity getLogo() {
        return this.logo;
    }

    public final PaymentMethodType getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        return this.paymentMethodType.hashCode() + unr0.b(this.logo.hashCode() * 31, 31, this.id);
    }

    public String toString() {
        return "SelectedAutoTopupPaymentMethod(logo=" + this.logo + ", id=" + this.id + ", paymentMethodType=" + this.paymentMethodType + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.logo, flags);
        dest.writeString(this.id);
        dest.writeString(this.paymentMethodType.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectedAutoTopupPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedAutoTopupPaymentMethod createFromParcel(Parcel parcel) {
            return new SelectedAutoTopupPaymentMethod((ThemedImageUrlEntity) parcel.readParcelable(SelectedAutoTopupPaymentMethod.class.getClassLoader()), parcel.readString(), PaymentMethodType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedAutoTopupPaymentMethod[] newArray(int i) {
            return new SelectedAutoTopupPaymentMethod[i];
        }
    }
}
