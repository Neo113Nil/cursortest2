package com.yandex.fintechsdk.flows.payment.kit.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams;", "Landroid/os/Parcelable;", "<init>", "()V", "ByBindingId", "ByVerificationToken", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams$ByBindingId;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams$ByVerificationToken;", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class VerificationParams implements Parcelable {
    public /* synthetic */ VerificationParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams$ByBindingId;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams;", "", "bindingId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams$ByBindingId;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBindingId", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ByBindingId extends VerificationParams {
        public static final Parcelable.Creator<ByBindingId> CREATOR = new Creator();
        private final String bindingId;

        public ByBindingId(String str) {
            super(null);
            this.bindingId = str;
        }

        public static /* synthetic */ ByBindingId copy$default(ByBindingId byBindingId, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = byBindingId.bindingId;
            }
            return byBindingId.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBindingId() {
            return this.bindingId;
        }

        public final ByBindingId copy(String bindingId) {
            return new ByBindingId(bindingId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ByBindingId) && jl40.l(this.bindingId, ((ByBindingId) other).bindingId);
        }

        public final String getBindingId() {
            return this.bindingId;
        }

        public int hashCode() {
            return this.bindingId.hashCode();
        }

        public String toString() {
            return oyr.p("ByBindingId(bindingId=", this.bindingId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.bindingId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ByBindingId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByBindingId createFromParcel(Parcel parcel) {
                return new ByBindingId(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByBindingId[] newArray(int i) {
                return new ByBindingId[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams$ByVerificationToken;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams;", "", "verificationToken", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams$ByVerificationToken;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVerificationToken", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ByVerificationToken extends VerificationParams {
        public static final Parcelable.Creator<ByVerificationToken> CREATOR = new Creator();
        private final String verificationToken;

        public ByVerificationToken(String str) {
            super(null);
            this.verificationToken = str;
        }

        public static /* synthetic */ ByVerificationToken copy$default(ByVerificationToken byVerificationToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = byVerificationToken.verificationToken;
            }
            return byVerificationToken.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public final ByVerificationToken copy(String verificationToken) {
            return new ByVerificationToken(verificationToken);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ByVerificationToken) && jl40.l(this.verificationToken, ((ByVerificationToken) other).verificationToken);
        }

        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public int hashCode() {
            return this.verificationToken.hashCode();
        }

        public String toString() {
            return oyr.p("ByVerificationToken(verificationToken=", this.verificationToken, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.verificationToken);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ByVerificationToken> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByVerificationToken createFromParcel(Parcel parcel) {
                return new ByVerificationToken(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByVerificationToken[] newArray(int i) {
                return new ByVerificationToken[i];
            }
        }
    }

    private VerificationParams() {
    }
}
