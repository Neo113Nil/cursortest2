package com.ybsdk.feature.split.deposit.internal.ui.autotopup.status;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/autotopup/status/SplitDepositAutoTopupStatusScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "logo", "", "paymentMethodId", "Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;", "paymentMethodType", "<init>", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;", "copy", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;)Lcom/ybsdk/feature/split/deposit/internal/ui/autotopup/status/SplitDepositAutoTopupStatusScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getLogo", "Ljava/lang/String;", "getPaymentMethodId", "Lcom/ybsdk/feature/autotopup/api/domain/model/PaymentMethodType;", "getPaymentMethodType", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitDepositAutoTopupStatusScreenParams implements ScreenParams {
    public static final Parcelable.Creator<SplitDepositAutoTopupStatusScreenParams> CREATOR = new Creator();
    private final ThemedImageUrlEntity logo;
    private final String paymentMethodId;
    private final PaymentMethodType paymentMethodType;

    public SplitDepositAutoTopupStatusScreenParams(ThemedImageUrlEntity themedImageUrlEntity, String str, PaymentMethodType paymentMethodType) {
        this.logo = themedImageUrlEntity;
        this.paymentMethodId = str;
        this.paymentMethodType = paymentMethodType;
    }

    public static /* synthetic */ SplitDepositAutoTopupStatusScreenParams copy$default(SplitDepositAutoTopupStatusScreenParams splitDepositAutoTopupStatusScreenParams, ThemedImageUrlEntity themedImageUrlEntity, String str, PaymentMethodType paymentMethodType, int i, Object obj) {
        if ((i & 1) != 0) {
            themedImageUrlEntity = splitDepositAutoTopupStatusScreenParams.logo;
        }
        if ((i & 2) != 0) {
            str = splitDepositAutoTopupStatusScreenParams.paymentMethodId;
        }
        if ((i & 4) != 0) {
            paymentMethodType = splitDepositAutoTopupStatusScreenParams.paymentMethodType;
        }
        return splitDepositAutoTopupStatusScreenParams.copy(themedImageUrlEntity, str, paymentMethodType);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemedImageUrlEntity getLogo() {
        return this.logo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethodType getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final SplitDepositAutoTopupStatusScreenParams copy(ThemedImageUrlEntity logo, String paymentMethodId, PaymentMethodType paymentMethodType) {
        return new SplitDepositAutoTopupStatusScreenParams(logo, paymentMethodId, paymentMethodType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitDepositAutoTopupStatusScreenParams)) {
            return false;
        }
        SplitDepositAutoTopupStatusScreenParams splitDepositAutoTopupStatusScreenParams = (SplitDepositAutoTopupStatusScreenParams) other;
        return jl40.l(this.logo, splitDepositAutoTopupStatusScreenParams.logo) && jl40.l(this.paymentMethodId, splitDepositAutoTopupStatusScreenParams.paymentMethodId) && this.paymentMethodType == splitDepositAutoTopupStatusScreenParams.paymentMethodType;
    }

    public final ThemedImageUrlEntity getLogo() {
        return this.logo;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final PaymentMethodType getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        return this.paymentMethodType.hashCode() + unr0.b(this.logo.hashCode() * 31, 31, this.paymentMethodId);
    }

    public String toString() {
        return "SplitDepositAutoTopupStatusScreenParams(logo=" + this.logo + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethodType=" + this.paymentMethodType + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.logo, flags);
        dest.writeString(this.paymentMethodId);
        dest.writeString(this.paymentMethodType.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SplitDepositAutoTopupStatusScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositAutoTopupStatusScreenParams createFromParcel(Parcel parcel) {
            return new SplitDepositAutoTopupStatusScreenParams((ThemedImageUrlEntity) parcel.readParcelable(SplitDepositAutoTopupStatusScreenParams.class.getClassLoader()), parcel.readString(), PaymentMethodType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositAutoTopupStatusScreenParams[] newArray(int i) {
            return new SplitDepositAutoTopupStatusScreenParams[i];
        }
    }
}
