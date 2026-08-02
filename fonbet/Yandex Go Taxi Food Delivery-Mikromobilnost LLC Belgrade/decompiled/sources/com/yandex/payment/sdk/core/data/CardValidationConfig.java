package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tp8;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yandex/payment/sdk/core/data/CardValidationConfig;", "Landroid/os/Parcelable;", "Lcom/yandex/payment/sdk/core/data/CardBinValidationConfig;", "binConfig", "Lcom/yandex/payment/sdk/core/data/CardExpirationDateValidationConfig;", "expirationDateConfig", "<init>", "(Lcom/yandex/payment/sdk/core/data/CardBinValidationConfig;Lcom/yandex/payment/sdk/core/data/CardExpirationDateValidationConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/payment/sdk/core/data/CardBinValidationConfig;", "getBinConfig", "()Lcom/yandex/payment/sdk/core/data/CardBinValidationConfig;", "Lcom/yandex/payment/sdk/core/data/CardExpirationDateValidationConfig;", "getExpirationDateConfig", "()Lcom/yandex/payment/sdk/core/data/CardExpirationDateValidationConfig;", "Companion", "tp8", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardValidationConfig implements Parcelable {
    private static final CardValidationConfig Default;
    private final CardBinValidationConfig binConfig;
    private final CardExpirationDateValidationConfig expirationDateConfig;
    public static final tp8 Companion = new tp8();
    public static final Parcelable.Creator<CardValidationConfig> CREATOR = new Creator();

    static {
        CardBinValidationConfig cardBinValidationConfig;
        CardExpirationDateValidationConfig cardExpirationDateValidationConfig;
        CardBinValidationConfig.Companion.getClass();
        cardBinValidationConfig = CardBinValidationConfig.Default;
        CardExpirationDateValidationConfig.Companion.getClass();
        cardExpirationDateValidationConfig = CardExpirationDateValidationConfig.Default;
        Default = new CardValidationConfig(cardBinValidationConfig, cardExpirationDateValidationConfig);
    }

    public CardValidationConfig(CardBinValidationConfig cardBinValidationConfig, CardExpirationDateValidationConfig cardExpirationDateValidationConfig) {
        this.binConfig = cardBinValidationConfig;
        this.expirationDateConfig = cardExpirationDateValidationConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CardBinValidationConfig getBinConfig() {
        return this.binConfig;
    }

    public final CardExpirationDateValidationConfig getExpirationDateConfig() {
        return this.expirationDateConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.binConfig.writeToParcel(dest, flags);
        this.expirationDateConfig.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardValidationConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardValidationConfig createFromParcel(Parcel parcel) {
            return new CardValidationConfig(CardBinValidationConfig.CREATOR.createFromParcel(parcel), CardExpirationDateValidationConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardValidationConfig[] newArray(int i) {
            return new CardValidationConfig[i];
        }
    }
}
