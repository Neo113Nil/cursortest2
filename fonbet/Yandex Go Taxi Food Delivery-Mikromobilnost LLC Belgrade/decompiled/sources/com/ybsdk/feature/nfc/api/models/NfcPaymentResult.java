package com.ybsdk.feature.nfc.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult;", "Landroid/os/Parcelable;", "tokenReference", "", "getTokenReference", "()Ljava/lang/String;", "Success", "Error", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult$Error;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult$Success;", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NfcPaymentResult extends Parcelable {
    String getTokenReference();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001c¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult$Error;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult;", "", "tokenReference", "Lcom/ybsdk/feature/nfc/api/models/NfcResultErrorType;", "errorType", "Lcom/ybsdk/feature/nfc/api/models/NfcCommandType;", "terminalCommand", "", "tukReplenishmentRequired", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/nfc/api/models/NfcResultErrorType;Lcom/ybsdk/feature/nfc/api/models/NfcCommandType;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/nfc/api/models/NfcResultErrorType;", "component3", "()Lcom/ybsdk/feature/nfc/api/models/NfcCommandType;", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/nfc/api/models/NfcResultErrorType;Lcom/ybsdk/feature/nfc/api/models/NfcCommandType;Z)Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult$Error;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTokenReference", "Lcom/ybsdk/feature/nfc/api/models/NfcResultErrorType;", "getErrorType", "Lcom/ybsdk/feature/nfc/api/models/NfcCommandType;", "getTerminalCommand", "Z", "getTukReplenishmentRequired", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements NfcPaymentResult {
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final NfcResultErrorType errorType;
        private final NfcCommandType terminalCommand;
        private final String tokenReference;
        private final boolean tukReplenishmentRequired;

        public Error(String str, NfcResultErrorType nfcResultErrorType, NfcCommandType nfcCommandType, boolean z) {
            this.tokenReference = str;
            this.errorType = nfcResultErrorType;
            this.terminalCommand = nfcCommandType;
            this.tukReplenishmentRequired = z;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, NfcResultErrorType nfcResultErrorType, NfcCommandType nfcCommandType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.tokenReference;
            }
            if ((i & 2) != 0) {
                nfcResultErrorType = error.errorType;
            }
            if ((i & 4) != 0) {
                nfcCommandType = error.terminalCommand;
            }
            if ((i & 8) != 0) {
                z = error.tukReplenishmentRequired;
            }
            return error.copy(str, nfcResultErrorType, nfcCommandType, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTokenReference() {
            return this.tokenReference;
        }

        /* renamed from: component2, reason: from getter */
        public final NfcResultErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component3, reason: from getter */
        public final NfcCommandType getTerminalCommand() {
            return this.terminalCommand;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getTukReplenishmentRequired() {
            return this.tukReplenishmentRequired;
        }

        public final Error copy(String tokenReference, NfcResultErrorType errorType, NfcCommandType terminalCommand, boolean tukReplenishmentRequired) {
            return new Error(tokenReference, errorType, terminalCommand, tukReplenishmentRequired);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return jl40.l(this.tokenReference, error.tokenReference) && this.errorType == error.errorType && this.terminalCommand == error.terminalCommand && this.tukReplenishmentRequired == error.tukReplenishmentRequired;
        }

        public final NfcResultErrorType getErrorType() {
            return this.errorType;
        }

        public final NfcCommandType getTerminalCommand() {
            return this.terminalCommand;
        }

        @Override // com.ybsdk.feature.nfc.api.models.NfcPaymentResult
        public String getTokenReference() {
            return this.tokenReference;
        }

        public final boolean getTukReplenishmentRequired() {
            return this.tukReplenishmentRequired;
        }

        public int hashCode() {
            return Boolean.hashCode(this.tukReplenishmentRequired) + ((this.terminalCommand.hashCode() + ((this.errorType.hashCode() + (this.tokenReference.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Error(tokenReference=" + this.tokenReference + ", errorType=" + this.errorType + ", terminalCommand=" + this.terminalCommand + ", tukReplenishmentRequired=" + this.tukReplenishmentRequired + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.tokenReference);
            dest.writeString(this.errorType.name());
            dest.writeString(this.terminalCommand.name());
            dest.writeInt(this.tukReplenishmentRequired ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString(), NfcResultErrorType.valueOf(parcel.readString()), NfcCommandType.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J2\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult$Success;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult;", "", "tokenReference", "currencyValue", "transactionAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult$Success;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTokenReference", "getCurrencyValue", "getTransactionAmount", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements NfcPaymentResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final String currencyValue;
        private final String tokenReference;
        private final String transactionAmount;

        public Success(String str, String str2, String str3) {
            this.tokenReference = str;
            this.currencyValue = str2;
            this.transactionAmount = str3;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.tokenReference;
            }
            if ((i & 2) != 0) {
                str2 = success.currencyValue;
            }
            if ((i & 4) != 0) {
                str3 = success.transactionAmount;
            }
            return success.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTokenReference() {
            return this.tokenReference;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyValue() {
            return this.currencyValue;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTransactionAmount() {
            return this.transactionAmount;
        }

        public final Success copy(String tokenReference, String currencyValue, String transactionAmount) {
            return new Success(tokenReference, currencyValue, transactionAmount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return jl40.l(this.tokenReference, success.tokenReference) && jl40.l(this.currencyValue, success.currencyValue) && jl40.l(this.transactionAmount, success.transactionAmount);
        }

        public final String getCurrencyValue() {
            return this.currencyValue;
        }

        @Override // com.ybsdk.feature.nfc.api.models.NfcPaymentResult
        public String getTokenReference() {
            return this.tokenReference;
        }

        public final String getTransactionAmount() {
            return this.transactionAmount;
        }

        public int hashCode() {
            int hashCode = this.tokenReference.hashCode() * 31;
            String str = this.currencyValue;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionAmount;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.tokenReference;
            String str2 = this.currencyValue;
            return oyr.t(b64.v("Success(tokenReference=", str, ", currencyValue=", str2, ", transactionAmount="), this.transactionAmount, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.tokenReference);
            dest.writeString(this.currencyValue);
            dest.writeString(this.transactionAmount);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }
    }
}
