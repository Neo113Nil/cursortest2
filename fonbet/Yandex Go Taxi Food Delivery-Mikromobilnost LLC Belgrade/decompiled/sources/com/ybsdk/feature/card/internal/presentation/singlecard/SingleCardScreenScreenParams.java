package com.ybsdk.feature.card.internal.presentation.singlecard;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/singlecard/SingleCardScreenScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "cardId", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/card/internal/presentation/singlecard/SingleCardScreenScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardId", "getProductId", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SingleCardScreenScreenParams implements ScreenParams {
    public static final Parcelable.Creator<SingleCardScreenScreenParams> CREATOR = new Creator();
    private final String cardId;
    private final String productId;

    public SingleCardScreenScreenParams(String str, String str2) {
        this.cardId = str;
        this.productId = str2;
    }

    public static /* synthetic */ SingleCardScreenScreenParams copy$default(SingleCardScreenScreenParams singleCardScreenScreenParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleCardScreenScreenParams.cardId;
        }
        if ((i & 2) != 0) {
            str2 = singleCardScreenScreenParams.productId;
        }
        return singleCardScreenScreenParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final SingleCardScreenScreenParams copy(String cardId, String productId) {
        return new SingleCardScreenScreenParams(cardId, productId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleCardScreenScreenParams)) {
            return false;
        }
        SingleCardScreenScreenParams singleCardScreenScreenParams = (SingleCardScreenScreenParams) other;
        return jl40.l(this.cardId, singleCardScreenScreenParams.cardId) && jl40.l(this.productId, singleCardScreenScreenParams.productId);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        String str = this.cardId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return unr0.p("SingleCardScreenScreenParams(cardId=", this.cardId, ", productId=", this.productId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardId);
        dest.writeString(this.productId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SingleCardScreenScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleCardScreenScreenParams createFromParcel(Parcel parcel) {
            return new SingleCardScreenScreenParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleCardScreenScreenParams[] newArray(int i) {
            return new SingleCardScreenScreenParams[i];
        }
    }
}
