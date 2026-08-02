package com.yandex.payment.common.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.g0k0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000 )2\u00020\u0001:\u0004*+,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u0014\u0010&\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'¨\u0006."}, d2 = {"Lcom/yandex/payment/common/result/ResultType;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/yandex/payment/common/data/TextRes;", "title", "Lcom/yandex/payment/common/data/TextRes;", "getTitle", "()Lcom/yandex/payment/common/data/TextRes;", "subtitle", "getSubtitle", "mainButtonText", "getMainButtonText", "extraButtonText", "getExtraButtonText", "", "resultId", "Ljava/lang/String;", "getResultId", "()Ljava/lang/String;", "", "delayToAutoHide", "J", "getDelayToAutoHide", "()J", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "identifier", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "getIdentifier", "()Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "getType", "type", "", "isBackButtonExist", "()Z", "isCloseButtonExist", "Companion", "Loading", "Failure", "Success", "g0k0", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ResultType implements Parcelable {

    @Deprecated
    public static final long AUTO_HIDE_DISABLED = -1;
    private static final g0k0 Companion = new g0k0();

    @Deprecated
    public static final String RESULT_TYPE_FAILURE = "failure";

    @Deprecated
    public static final String RESULT_TYPE_LOADING = "loading";

    @Deprecated
    public static final String RESULT_TYPE_SUCCESS = "success";
    private final long delayToAutoHide = -1;
    private final PaymentKitError error;
    private final TextRes extraButtonText;
    private final ResultScreenIdentifier identifier;
    private final TextRes mainButtonText;
    private final String resultId;
    private final TextRes subtitle;
    private final TextRes title;

    public long getDelayToAutoHide() {
        return this.delayToAutoHide;
    }

    public PaymentKitError getError() {
        return this.error;
    }

    public TextRes getExtraButtonText() {
        return this.extraButtonText;
    }

    public ResultScreenIdentifier getIdentifier() {
        return this.identifier;
    }

    public TextRes getMainButtonText() {
        return this.mainButtonText;
    }

    public String getResultId() {
        return this.resultId;
    }

    public TextRes getSubtitle() {
        return this.subtitle;
    }

    public TextRes getTitle() {
        return this.title;
    }

    public abstract String getType();

    /* renamed from: isBackButtonExist */
    public abstract boolean getIsBackButtonExist();

    /* renamed from: isCloseButtonExist */
    public abstract boolean getIsCloseButtonExist();

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b(\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b)\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/yandex/payment/common/result/ResultType$Failure;", "Lcom/yandex/payment/common/result/ResultType;", "", "type", "", "isBackButtonExist", "isCloseButtonExist", "Lcom/yandex/payment/common/data/TextRes;", "title", "subtitle", "mainButtonText", "extraButtonText", "resultId", "", "delayToAutoHide", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "identifier", "<init>", "(Ljava/lang/String;ZZLcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Ljava/lang/String;JLcom/yandex/payment/sdk/core/data/PaymentKitError;Lcom/yandex/payment/common/result/ResultScreenIdentifier;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Z", "()Z", "Lcom/yandex/payment/common/data/TextRes;", "getTitle", "()Lcom/yandex/payment/common/data/TextRes;", "getSubtitle", "getMainButtonText", "getExtraButtonText", "getResultId", "J", "getDelayToAutoHide", "()J", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "getIdentifier", "()Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Failure extends ResultType {
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        private final long delayToAutoHide;
        private final PaymentKitError error;
        private final TextRes extraButtonText;
        private final ResultScreenIdentifier identifier;
        private final boolean isBackButtonExist;
        private final boolean isCloseButtonExist;
        private final TextRes mainButtonText;
        private final String resultId;
        private final TextRes subtitle;
        private final TextRes title;
        private final String type;

        public /* synthetic */ Failure(String str, boolean z, boolean z2, TextRes textRes, TextRes textRes2, TextRes textRes3, TextRes textRes4, String str2, long j, PaymentKitError paymentKitError, ResultScreenIdentifier resultScreenIdentifier, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ResultType.RESULT_TYPE_FAILURE : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : textRes, (i & 16) != 0 ? null : textRes2, (i & 32) != 0 ? null : textRes3, (i & 64) != 0 ? null : textRes4, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? -1L : j, (i & 512) != 0 ? null : paymentKitError, (i & 1024) != 0 ? null : resultScreenIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public long getDelayToAutoHide() {
            return this.delayToAutoHide;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public PaymentKitError getError() {
            return this.error;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getExtraButtonText() {
            return this.extraButtonText;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public ResultScreenIdentifier getIdentifier() {
            return this.identifier;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getMainButtonText() {
            return this.mainButtonText;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public String getResultId() {
            return this.resultId;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getTitle() {
            return this.title;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public String getType() {
            return this.type;
        }

        @Override // com.yandex.payment.common.result.ResultType
        /* renamed from: isBackButtonExist, reason: from getter */
        public boolean getIsBackButtonExist() {
            return this.isBackButtonExist;
        }

        @Override // com.yandex.payment.common.result.ResultType
        /* renamed from: isCloseButtonExist, reason: from getter */
        public boolean getIsCloseButtonExist() {
            return this.isCloseButtonExist;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.type);
            dest.writeInt(this.isBackButtonExist ? 1 : 0);
            dest.writeInt(this.isCloseButtonExist ? 1 : 0);
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.subtitle, flags);
            dest.writeParcelable(this.mainButtonText, flags);
            dest.writeParcelable(this.extraButtonText, flags);
            dest.writeString(this.resultId);
            dest.writeLong(this.delayToAutoHide);
            dest.writeParcelable(this.error, flags);
            dest.writeParcelable(this.identifier, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                boolean z;
                String readString = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Failure(readString, z2, parcel.readInt() == 0 ? z : true, (TextRes) parcel.readParcelable(Failure.class.getClassLoader()), (TextRes) parcel.readParcelable(Failure.class.getClassLoader()), (TextRes) parcel.readParcelable(Failure.class.getClassLoader()), (TextRes) parcel.readParcelable(Failure.class.getClassLoader()), parcel.readString(), parcel.readLong(), (PaymentKitError) parcel.readParcelable(Failure.class.getClassLoader()), (ResultScreenIdentifier) parcel.readParcelable(Failure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        public Failure(String str, boolean z, boolean z2, TextRes textRes, TextRes textRes2, TextRes textRes3, TextRes textRes4, String str2, long j, PaymentKitError paymentKitError, ResultScreenIdentifier resultScreenIdentifier) {
            this.type = str;
            this.isBackButtonExist = z;
            this.isCloseButtonExist = z2;
            this.title = textRes;
            this.subtitle = textRes2;
            this.mainButtonText = textRes3;
            this.extraButtonText = textRes4;
            this.resultId = str2;
            this.delayToAutoHide = j;
            this.error = paymentKitError;
            this.identifier = resultScreenIdentifier;
        }

        public Failure() {
            this(null, false, false, null, null, null, null, null, 0L, null, null, 2047, null);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b$\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/payment/common/result/ResultType$Loading;", "Lcom/yandex/payment/common/result/ResultType;", "", "type", "", "isBackButtonExist", "isCloseButtonExist", "Lcom/yandex/payment/common/data/TextRes;", "title", "subtitle", "mainButtonText", "extraButtonText", "resultId", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "identifier", "<init>", "(Ljava/lang/String;ZZLcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Ljava/lang/String;Lcom/yandex/payment/common/result/ResultScreenIdentifier;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Z", "()Z", "Lcom/yandex/payment/common/data/TextRes;", "getTitle", "()Lcom/yandex/payment/common/data/TextRes;", "getSubtitle", "getMainButtonText", "getExtraButtonText", "getResultId", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "getIdentifier", "()Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading extends ResultType {
        public static final Parcelable.Creator<Loading> CREATOR = new Creator();
        private final TextRes extraButtonText;
        private final ResultScreenIdentifier identifier;
        private final boolean isBackButtonExist;
        private final boolean isCloseButtonExist;
        private final TextRes mainButtonText;
        private final String resultId;
        private final TextRes subtitle;
        private final TextRes title;
        private final String type;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Loading(java.lang.String r2, boolean r3, boolean r4, com.yandex.payment.common.data.TextRes r5, com.yandex.payment.common.data.TextRes r6, com.yandex.payment.common.data.TextRes r7, com.yandex.payment.common.data.TextRes r8, java.lang.String r9, com.yandex.payment.common.result.ResultScreenIdentifier r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r1 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L6
                java.lang.String r2 = "loading"
            L6:
                r12 = r11 & 2
                r0 = 0
                if (r12 == 0) goto Lc
                r3 = r0
            Lc:
                r12 = r11 & 4
                if (r12 == 0) goto L11
                r4 = r0
            L11:
                r12 = r11 & 8
                r0 = 0
                if (r12 == 0) goto L17
                r5 = r0
            L17:
                r12 = r11 & 16
                if (r12 == 0) goto L1c
                r6 = r0
            L1c:
                r12 = r11 & 32
                if (r12 == 0) goto L21
                r7 = r0
            L21:
                r12 = r11 & 64
                if (r12 == 0) goto L26
                r8 = r0
            L26:
                r12 = r11 & 128(0x80, float:1.8E-43)
                if (r12 == 0) goto L2b
                r9 = r0
            L2b:
                r11 = r11 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L3a
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L44
            L3a:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L44:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.payment.common.result.ResultType.Loading.<init>(java.lang.String, boolean, boolean, com.yandex.payment.common.data.TextRes, com.yandex.payment.common.data.TextRes, com.yandex.payment.common.data.TextRes, com.yandex.payment.common.data.TextRes, java.lang.String, com.yandex.payment.common.result.ResultScreenIdentifier, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getExtraButtonText() {
            return this.extraButtonText;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public ResultScreenIdentifier getIdentifier() {
            return this.identifier;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getMainButtonText() {
            return this.mainButtonText;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public String getResultId() {
            return this.resultId;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getTitle() {
            return this.title;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public String getType() {
            return this.type;
        }

        @Override // com.yandex.payment.common.result.ResultType
        /* renamed from: isBackButtonExist, reason: from getter */
        public boolean getIsBackButtonExist() {
            return this.isBackButtonExist;
        }

        @Override // com.yandex.payment.common.result.ResultType
        /* renamed from: isCloseButtonExist, reason: from getter */
        public boolean getIsCloseButtonExist() {
            return this.isCloseButtonExist;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.type);
            dest.writeInt(this.isBackButtonExist ? 1 : 0);
            dest.writeInt(this.isCloseButtonExist ? 1 : 0);
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.subtitle, flags);
            dest.writeParcelable(this.mainButtonText, flags);
            dest.writeParcelable(this.extraButtonText, flags);
            dest.writeString(this.resultId);
            dest.writeParcelable(this.identifier, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Loading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                boolean z;
                String readString = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Loading(readString, z2, parcel.readInt() == 0 ? z : true, (TextRes) parcel.readParcelable(Loading.class.getClassLoader()), (TextRes) parcel.readParcelable(Loading.class.getClassLoader()), (TextRes) parcel.readParcelable(Loading.class.getClassLoader()), (TextRes) parcel.readParcelable(Loading.class.getClassLoader()), parcel.readString(), (ResultScreenIdentifier) parcel.readParcelable(Loading.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        public Loading(String str, boolean z, boolean z2, TextRes textRes, TextRes textRes2, TextRes textRes3, TextRes textRes4, String str2, ResultScreenIdentifier resultScreenIdentifier) {
            this.type = str;
            this.isBackButtonExist = z;
            this.isCloseButtonExist = z2;
            this.title = textRes;
            this.subtitle = textRes2;
            this.mainButtonText = textRes3;
            this.extraButtonText = textRes4;
            this.resultId = str2;
            this.identifier = resultScreenIdentifier;
        }

        public Loading() {
            this(null, false, false, null, null, null, null, null, null, 511, null);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/yandex/payment/common/result/ResultType$Success;", "Lcom/yandex/payment/common/result/ResultType;", "", "type", "", "isBackButtonExist", "isCloseButtonExist", "Lcom/yandex/payment/common/data/TextRes;", "title", "subtitle", "mainButtonText", "extraButtonText", "resultId", "", "delayToAutoHide", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "identifier", "<init>", "(Ljava/lang/String;ZZLcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Lcom/yandex/payment/common/data/TextRes;Ljava/lang/String;JLcom/yandex/payment/common/result/ResultScreenIdentifier;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Z", "()Z", "Lcom/yandex/payment/common/data/TextRes;", "getTitle", "()Lcom/yandex/payment/common/data/TextRes;", "getSubtitle", "getMainButtonText", "getExtraButtonText", "getResultId", "J", "getDelayToAutoHide", "()J", "Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "getIdentifier", "()Lcom/yandex/payment/common/result/ResultScreenIdentifier;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Success extends ResultType {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final long delayToAutoHide;
        private final TextRes extraButtonText;
        private final ResultScreenIdentifier identifier;
        private final boolean isBackButtonExist;
        private final boolean isCloseButtonExist;
        private final TextRes mainButtonText;
        private final String resultId;
        private final TextRes subtitle;
        private final TextRes title;
        private final String type;

        public /* synthetic */ Success(String str, boolean z, boolean z2, TextRes textRes, TextRes textRes2, TextRes textRes3, TextRes textRes4, String str2, long j, ResultScreenIdentifier resultScreenIdentifier, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "success" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : textRes, (i & 16) != 0 ? null : textRes2, (i & 32) != 0 ? null : textRes3, (i & 64) != 0 ? null : textRes4, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? -1L : j, (i & 512) != 0 ? null : resultScreenIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public long getDelayToAutoHide() {
            return this.delayToAutoHide;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getExtraButtonText() {
            return this.extraButtonText;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public ResultScreenIdentifier getIdentifier() {
            return this.identifier;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getMainButtonText() {
            return this.mainButtonText;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public String getResultId() {
            return this.resultId;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public TextRes getTitle() {
            return this.title;
        }

        @Override // com.yandex.payment.common.result.ResultType
        public String getType() {
            return this.type;
        }

        @Override // com.yandex.payment.common.result.ResultType
        /* renamed from: isBackButtonExist, reason: from getter */
        public boolean getIsBackButtonExist() {
            return this.isBackButtonExist;
        }

        @Override // com.yandex.payment.common.result.ResultType
        /* renamed from: isCloseButtonExist, reason: from getter */
        public boolean getIsCloseButtonExist() {
            return this.isCloseButtonExist;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.type);
            dest.writeInt(this.isBackButtonExist ? 1 : 0);
            dest.writeInt(this.isCloseButtonExist ? 1 : 0);
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.subtitle, flags);
            dest.writeParcelable(this.mainButtonText, flags);
            dest.writeParcelable(this.extraButtonText, flags);
            dest.writeString(this.resultId);
            dest.writeLong(this.delayToAutoHide);
            dest.writeParcelable(this.identifier, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                boolean z;
                String readString = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Success(readString, z2, parcel.readInt() == 0 ? z : true, (TextRes) parcel.readParcelable(Success.class.getClassLoader()), (TextRes) parcel.readParcelable(Success.class.getClassLoader()), (TextRes) parcel.readParcelable(Success.class.getClassLoader()), (TextRes) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString(), parcel.readLong(), (ResultScreenIdentifier) parcel.readParcelable(Success.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String str, boolean z, boolean z2, TextRes textRes, TextRes textRes2, TextRes textRes3, TextRes textRes4, String str2, long j, ResultScreenIdentifier resultScreenIdentifier) {
            this.type = str;
            this.isBackButtonExist = z;
            this.isCloseButtonExist = z2;
            this.title = textRes;
            this.subtitle = textRes2;
            this.mainButtonText = textRes3;
            this.extraButtonText = textRes4;
            this.resultId = str2;
            this.delayToAutoHide = j;
            this.identifier = resultScreenIdentifier;
        }

        public Success() {
            this(null, false, false, null, null, null, null, null, 0L, null, 1023, null);
        }
    }
}
