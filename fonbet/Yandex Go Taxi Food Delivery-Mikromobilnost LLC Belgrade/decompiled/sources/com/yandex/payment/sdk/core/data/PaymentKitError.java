package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 72\u00020\u00012\u00020\u0002:\u000489:;BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u0011J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\u0011J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#JR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\u0013J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b4\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010#¨\u0006<"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "Landroid/os/Parcelable;", "", "Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind;", "kind", "Lcom/yandex/payment/sdk/core/data/PaymentKitError$Trigger;", "trigger", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", ACSPConstants.STATUS, Constants.KEY_MESSAGE, "Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind6_6_0;", "kind6_6_0", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind;Lcom/yandex/payment/sdk/core/data/PaymentKitError$Trigger;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind6_6_0;)V", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind;", "component2", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError$Trigger;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind6_6_0;", "copy", "(Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind;Lcom/yandex/payment/sdk/core/data/PaymentKitError$Trigger;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind6_6_0;)Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind;", "getKind", "Lcom/yandex/payment/sdk/core/data/PaymentKitError$Trigger;", "getTrigger", "Ljava/lang/Integer;", "getCode", "Ljava/lang/String;", "getStatus", "getMessage", "Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind6_6_0;", "getKind6_6_0", "Companion", "Kind", "Kind6_6_0", "Trigger", "com/yandex/payment/sdk/core/data/a", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PaymentKitError extends Throwable implements Parcelable {
    private final Integer code;
    private final Kind kind;
    private final Kind6_6_0 kind6_6_0;
    private final String message;
    private final String status;
    private final Trigger trigger;
    public static final a Companion = new a();
    public static final Parcelable.Creator<PaymentKitError> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind;", "", "unknown", "internalError", "authorization", "network", "bindingInvalidArgument", "tooManyCards", "googlePay", "fail3DS", "expiredCard", "invalidProcessingRequest", "limitExceeded", "notEnoughFunds", "paymentAuthorizationReject", "paymentCancelled", "paymentGatewayTechnicalError", "paymentTimeout", "promocodeAlreadyUsed", "restrictedCard", "transactionNotPermitted", "userCancelled", "creditRejected", "noEmail", "sbpBanksNotFound", "paymentMethodNotFound", "startBankError", "sbpBankListLoadFailed", "passportAccountNotAuthorized", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Kind {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind authorization;
        public static final Kind bindingInvalidArgument;
        public static final Kind creditRejected;
        public static final Kind expiredCard;
        public static final Kind fail3DS;
        public static final Kind googlePay;
        public static final Kind internalError;
        public static final Kind invalidProcessingRequest;
        public static final Kind limitExceeded;
        public static final Kind network;
        public static final Kind noEmail;
        public static final Kind notEnoughFunds;
        public static final Kind passportAccountNotAuthorized;
        public static final Kind paymentAuthorizationReject;
        public static final Kind paymentCancelled;
        public static final Kind paymentGatewayTechnicalError;
        public static final Kind paymentMethodNotFound;
        public static final Kind paymentTimeout;
        public static final Kind promocodeAlreadyUsed;
        public static final Kind restrictedCard;
        public static final Kind sbpBankListLoadFailed;
        public static final Kind sbpBanksNotFound;
        public static final Kind startBankError;
        public static final Kind tooManyCards;
        public static final Kind transactionNotPermitted;
        public static final Kind unknown;
        public static final Kind userCancelled;

        static {
            Kind kind = new Kind("unknown", 0);
            unknown = kind;
            Kind kind2 = new Kind("internalError", 1);
            internalError = kind2;
            Kind kind3 = new Kind("authorization", 2);
            authorization = kind3;
            Kind kind4 = new Kind("network", 3);
            network = kind4;
            Kind kind5 = new Kind("bindingInvalidArgument", 4);
            bindingInvalidArgument = kind5;
            Kind kind6 = new Kind("tooManyCards", 5);
            tooManyCards = kind6;
            Kind kind7 = new Kind("googlePay", 6);
            googlePay = kind7;
            Kind kind8 = new Kind("fail3DS", 7);
            fail3DS = kind8;
            Kind kind9 = new Kind("expiredCard", 8);
            expiredCard = kind9;
            Kind kind10 = new Kind("invalidProcessingRequest", 9);
            invalidProcessingRequest = kind10;
            Kind kind11 = new Kind("limitExceeded", 10);
            limitExceeded = kind11;
            Kind kind12 = new Kind("notEnoughFunds", 11);
            notEnoughFunds = kind12;
            Kind kind13 = new Kind("paymentAuthorizationReject", 12);
            paymentAuthorizationReject = kind13;
            Kind kind14 = new Kind("paymentCancelled", 13);
            paymentCancelled = kind14;
            Kind kind15 = new Kind("paymentGatewayTechnicalError", 14);
            paymentGatewayTechnicalError = kind15;
            Kind kind16 = new Kind("paymentTimeout", 15);
            paymentTimeout = kind16;
            Kind kind17 = new Kind("promocodeAlreadyUsed", 16);
            promocodeAlreadyUsed = kind17;
            Kind kind18 = new Kind("restrictedCard", 17);
            restrictedCard = kind18;
            Kind kind19 = new Kind("transactionNotPermitted", 18);
            transactionNotPermitted = kind19;
            Kind kind20 = new Kind("userCancelled", 19);
            userCancelled = kind20;
            Kind kind21 = new Kind("creditRejected", 20);
            creditRejected = kind21;
            Kind kind22 = new Kind("noEmail", 21);
            noEmail = kind22;
            Kind kind23 = new Kind("sbpBanksNotFound", 22);
            sbpBanksNotFound = kind23;
            Kind kind24 = new Kind("paymentMethodNotFound", 23);
            paymentMethodNotFound = kind24;
            Kind kind25 = new Kind("startBankError", 24);
            startBankError = kind25;
            Kind kind26 = new Kind("sbpBankListLoadFailed", 25);
            sbpBankListLoadFailed = kind26;
            Kind kind27 = new Kind("passportAccountNotAuthorized", 26);
            passportAccountNotAuthorized = kind27;
            Kind[] kindArr = {kind, kind2, kind3, kind4, kind5, kind6, kind7, kind8, kind9, kind10, kind11, kind12, kind13, kind14, kind15, kind16, kind17, kind18, kind19, kind20, kind21, kind22, kind23, kind24, kind25, kind26, kind27};
            $VALUES = kindArr;
            $ENTRIES = kotlin.enums.a.a(kindArr);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentKitError$Kind6_6_0;", "", "failedChallengeUnknown", "failedChallengeNoTriesLeft", "needToUnbingSbpToken", "sbpTokenBindingDuplicate", "warning", "payment_failed_but_new_attempt_allowed", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Kind6_6_0 {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Kind6_6_0[] $VALUES;
        public static final Kind6_6_0 failedChallengeNoTriesLeft;
        public static final Kind6_6_0 failedChallengeUnknown;
        public static final Kind6_6_0 needToUnbingSbpToken;
        public static final Kind6_6_0 payment_failed_but_new_attempt_allowed;
        public static final Kind6_6_0 sbpTokenBindingDuplicate;
        public static final Kind6_6_0 warning;

        static {
            Kind6_6_0 kind6_6_0 = new Kind6_6_0("failedChallengeUnknown", 0);
            failedChallengeUnknown = kind6_6_0;
            Kind6_6_0 kind6_6_02 = new Kind6_6_0("failedChallengeNoTriesLeft", 1);
            failedChallengeNoTriesLeft = kind6_6_02;
            Kind6_6_0 kind6_6_03 = new Kind6_6_0("needToUnbingSbpToken", 2);
            needToUnbingSbpToken = kind6_6_03;
            Kind6_6_0 kind6_6_04 = new Kind6_6_0("sbpTokenBindingDuplicate", 3);
            sbpTokenBindingDuplicate = kind6_6_04;
            Kind6_6_0 kind6_6_05 = new Kind6_6_0("warning", 4);
            warning = kind6_6_05;
            Kind6_6_0 kind6_6_06 = new Kind6_6_0("payment_failed_but_new_attempt_allowed", 5);
            payment_failed_but_new_attempt_allowed = kind6_6_06;
            Kind6_6_0[] kind6_6_0Arr = {kind6_6_0, kind6_6_02, kind6_6_03, kind6_6_04, kind6_6_05, kind6_6_06};
            $VALUES = kind6_6_0Arr;
            $ENTRIES = kotlin.enums.a.a(kind6_6_0Arr);
        }

        public static Kind6_6_0 valueOf(String str) {
            return (Kind6_6_0) Enum.valueOf(Kind6_6_0.class, str);
        }

        public static Kind6_6_0[] values() {
            return (Kind6_6_0[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentKitError$Trigger;", "", "internal", "mobileBackend", "diehard", "nspk", "external", "passport", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Trigger {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger diehard;
        public static final Trigger external;
        public static final Trigger internal;
        public static final Trigger mobileBackend;
        public static final Trigger nspk;
        public static final Trigger passport;

        static {
            Trigger trigger = new Trigger("internal", 0);
            internal = trigger;
            Trigger trigger2 = new Trigger("mobileBackend", 1);
            mobileBackend = trigger2;
            Trigger trigger3 = new Trigger("diehard", 2);
            diehard = trigger3;
            Trigger trigger4 = new Trigger("nspk", 3);
            nspk = trigger4;
            Trigger trigger5 = new Trigger("external", 4);
            external = trigger5;
            Trigger trigger6 = new Trigger("passport", 5);
            passport = trigger6;
            Trigger[] triggerArr = {trigger, trigger2, trigger3, trigger4, trigger5, trigger6};
            $VALUES = triggerArr;
            $ENTRIES = kotlin.enums.a.a(triggerArr);
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public PaymentKitError(Kind kind, Trigger trigger, Integer num, String str, String str2, Kind6_6_0 kind6_6_0) {
        super(str2);
        this.kind = kind;
        this.trigger = trigger;
        this.code = num;
        this.status = str;
        this.message = str2;
        this.kind6_6_0 = kind6_6_0;
    }

    public static /* synthetic */ PaymentKitError copy$default(PaymentKitError paymentKitError, Kind kind, Trigger trigger, Integer num, String str, String str2, Kind6_6_0 kind6_6_0, int i, Object obj) {
        if ((i & 1) != 0) {
            kind = paymentKitError.kind;
        }
        if ((i & 2) != 0) {
            trigger = paymentKitError.trigger;
        }
        if ((i & 4) != 0) {
            num = paymentKitError.code;
        }
        if ((i & 8) != 0) {
            str = paymentKitError.status;
        }
        if ((i & 16) != 0) {
            str2 = paymentKitError.message;
        }
        if ((i & 32) != 0) {
            kind6_6_0 = paymentKitError.kind6_6_0;
        }
        String str3 = str2;
        Kind6_6_0 kind6_6_02 = kind6_6_0;
        return paymentKitError.copy(kind, trigger, num, str, str3, kind6_6_02);
    }

    /* renamed from: component1, reason: from getter */
    public final Kind getKind() {
        return this.kind;
    }

    /* renamed from: component2, reason: from getter */
    public final Trigger getTrigger() {
        return this.trigger;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component6, reason: from getter */
    public final Kind6_6_0 getKind6_6_0() {
        return this.kind6_6_0;
    }

    public final PaymentKitError copy(Kind kind, Trigger trigger, Integer code, String status, String message, Kind6_6_0 kind6_6_0) {
        return new PaymentKitError(kind, trigger, code, status, message, kind6_6_0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentKitError)) {
            return false;
        }
        PaymentKitError paymentKitError = (PaymentKitError) other;
        return this.kind == paymentKitError.kind && this.trigger == paymentKitError.trigger && jl40.l(this.code, paymentKitError.code) && jl40.l(this.status, paymentKitError.status) && jl40.l(this.message, paymentKitError.message) && this.kind6_6_0 == paymentKitError.kind6_6_0;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final Kind6_6_0 getKind6_6_0() {
        return this.kind6_6_0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        int hashCode = (this.trigger.hashCode() + (this.kind.hashCode() * 31)) * 31;
        Integer num = this.code;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.status;
        int b = unr0.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.message);
        Kind6_6_0 kind6_6_0 = this.kind6_6_0;
        return b + (kind6_6_0 != null ? kind6_6_0.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        Kind kind = this.kind;
        Trigger trigger = this.trigger;
        Integer num = this.code;
        String str = this.status;
        String message = getMessage();
        StringBuilder sb = new StringBuilder("<PaymentKit Error> kind: ");
        sb.append(kind);
        sb.append(", trigger: ");
        sb.append(trigger);
        sb.append(", code: ");
        tse0.w(num, ", status: ", str, ", message: ", sb);
        sb.append(message);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.kind.name());
        dest.writeString(this.trigger.name());
        Integer num = this.code;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        dest.writeString(this.status);
        dest.writeString(this.message);
        Kind6_6_0 kind6_6_0 = this.kind6_6_0;
        if (kind6_6_0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(kind6_6_0.name());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentKitError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentKitError createFromParcel(Parcel parcel) {
            return new PaymentKitError(Kind.valueOf(parcel.readString()), Trigger.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Kind6_6_0.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentKitError[] newArray(int i) {
            return new PaymentKitError[i];
        }
    }

    public PaymentKitError(Kind kind, Trigger trigger, Integer num, String str, String str2) {
        this(kind, trigger, num, str, str2, null, 32, null);
    }

    public /* synthetic */ PaymentKitError(Kind kind, Trigger trigger, Integer num, String str, String str2, Kind6_6_0 kind6_6_0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kind, trigger, num, str, str2, (i & 32) != 0 ? null : kind6_6_0);
    }
}
