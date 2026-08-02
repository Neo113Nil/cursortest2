package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/TransferMe2MeConfirmPullScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "partnerId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/TransferMe2MeConfirmPullScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPartnerId", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferMe2MeConfirmPullScreenParams implements ScreenParams {
    public static final Parcelable.Creator<TransferMe2MeConfirmPullScreenParams> CREATOR = new Creator();
    private final String partnerId;

    public TransferMe2MeConfirmPullScreenParams(String str) {
        this.partnerId = str;
    }

    public static /* synthetic */ TransferMe2MeConfirmPullScreenParams copy$default(TransferMe2MeConfirmPullScreenParams transferMe2MeConfirmPullScreenParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferMe2MeConfirmPullScreenParams.partnerId;
        }
        return transferMe2MeConfirmPullScreenParams.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    public final TransferMe2MeConfirmPullScreenParams copy(String partnerId) {
        return new TransferMe2MeConfirmPullScreenParams(partnerId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransferMe2MeConfirmPullScreenParams) && jl40.l(this.partnerId, ((TransferMe2MeConfirmPullScreenParams) other).partnerId);
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public int hashCode() {
        return this.partnerId.hashCode();
    }

    public String toString() {
        return oyr.p("TransferMe2MeConfirmPullScreenParams(partnerId=", this.partnerId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.partnerId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferMe2MeConfirmPullScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferMe2MeConfirmPullScreenParams createFromParcel(Parcel parcel) {
            return new TransferMe2MeConfirmPullScreenParams(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferMe2MeConfirmPullScreenParams[] newArray(int i) {
            return new TransferMe2MeConfirmPullScreenParams[i];
        }
    }
}
