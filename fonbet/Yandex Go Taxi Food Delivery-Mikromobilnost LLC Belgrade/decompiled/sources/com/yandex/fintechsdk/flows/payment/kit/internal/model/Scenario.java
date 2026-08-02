package com.yandex.fintechsdk.flows.payment.kit.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.flows.payment.kit.api.model.GooglePayParams;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentToken;
import com.yandex.fintechsdk.flows.payment.kit.api.model.TransportCardParams;
import com.yandex.fintechsdk.flows.payment.kit.api.model.VerificationParams;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.w511;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "Landroid/os/Parcelable;", "<init>", "()V", "scenarioName", "", "getScenarioName", "()Ljava/lang/String;", "Payment", "CardBinding", "SelectMethod", "SbpTokenBinding", "TransportCards", "Verification", "GooglePlayBinding", "DynamicLinkFlow", "Widget", "Unbinding", "TransportBanner", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$CardBinding;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$DynamicLinkFlow;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$GooglePlayBinding;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Payment;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$SbpTokenBinding;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$SelectMethod;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$TransportBanner;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$TransportCards;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Unbinding;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Verification;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Widget;", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class Scenario implements Parcelable {
    public /* synthetic */ Scenario(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getScenarioName() {
        if (this instanceof CardBinding) {
            return "CardBinding";
        }
        if (this instanceof DynamicLinkFlow) {
            return "DynamicLinkFlow";
        }
        if (this instanceof GooglePlayBinding) {
            return "GooglePlayBinding";
        }
        if (this instanceof Payment) {
            return "Payment";
        }
        if (this instanceof SelectMethod) {
            return "SelectMethod";
        }
        if (this instanceof SbpTokenBinding) {
            return "SbpTokenBinding";
        }
        if (this instanceof TransportCards) {
            return "TransportCards";
        }
        if (this instanceof Unbinding) {
            return "Unbinding";
        }
        if (this instanceof Verification) {
            return "Verification";
        }
        if (this instanceof Widget) {
            return "Widget";
        }
        if (equals(TransportBanner.INSTANCE)) {
            return "TransportBanner";
        }
        w511.b();
        return null;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$CardBinding;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "", "verificationToken", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$CardBinding;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVerificationToken", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardBinding extends Scenario {
        public static final Parcelable.Creator<CardBinding> CREATOR = new Creator();
        private final String verificationToken;

        public CardBinding(String str) {
            super(null);
            this.verificationToken = str;
        }

        public static /* synthetic */ CardBinding copy$default(CardBinding cardBinding, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardBinding.verificationToken;
            }
            return cardBinding.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public final CardBinding copy(String verificationToken) {
            return new CardBinding(verificationToken);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CardBinding) && jl40.l(this.verificationToken, ((CardBinding) other).verificationToken);
        }

        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public int hashCode() {
            String str = this.verificationToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return oyr.p("CardBinding(verificationToken=", this.verificationToken, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.verificationToken);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardBinding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBinding createFromParcel(Parcel parcel) {
                return new CardBinding(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBinding[] newArray(int i) {
                return new CardBinding[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$DynamicLinkFlow;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "", "dynamicLink", StateEntry.COLUMN_PATH, "queryParamsJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$DynamicLinkFlow;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDynamicLink", "getPath", "getQueryParamsJson", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DynamicLinkFlow extends Scenario {
        public static final Parcelable.Creator<DynamicLinkFlow> CREATOR = new Creator();
        private final String dynamicLink;
        private final String path;
        private final String queryParamsJson;

        public DynamicLinkFlow(String str, String str2, String str3) {
            super(null);
            this.dynamicLink = str;
            this.path = str2;
            this.queryParamsJson = str3;
        }

        public static /* synthetic */ DynamicLinkFlow copy$default(DynamicLinkFlow dynamicLinkFlow, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dynamicLinkFlow.dynamicLink;
            }
            if ((i & 2) != 0) {
                str2 = dynamicLinkFlow.path;
            }
            if ((i & 4) != 0) {
                str3 = dynamicLinkFlow.queryParamsJson;
            }
            return dynamicLinkFlow.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDynamicLink() {
            return this.dynamicLink;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* renamed from: component3, reason: from getter */
        public final String getQueryParamsJson() {
            return this.queryParamsJson;
        }

        public final DynamicLinkFlow copy(String dynamicLink, String path, String queryParamsJson) {
            return new DynamicLinkFlow(dynamicLink, path, queryParamsJson);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DynamicLinkFlow)) {
                return false;
            }
            DynamicLinkFlow dynamicLinkFlow = (DynamicLinkFlow) other;
            return jl40.l(this.dynamicLink, dynamicLinkFlow.dynamicLink) && jl40.l(this.path, dynamicLinkFlow.path) && jl40.l(this.queryParamsJson, dynamicLinkFlow.queryParamsJson);
        }

        public final String getDynamicLink() {
            return this.dynamicLink;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getQueryParamsJson() {
            return this.queryParamsJson;
        }

        public int hashCode() {
            return this.queryParamsJson.hashCode() + unr0.b(this.dynamicLink.hashCode() * 31, 31, this.path);
        }

        public String toString() {
            String str = this.dynamicLink;
            String str2 = this.path;
            return oyr.t(b64.v("DynamicLinkFlow(dynamicLink=", str, ", path=", str2, ", queryParamsJson="), this.queryParamsJson, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.dynamicLink);
            dest.writeString(this.path);
            dest.writeString(this.queryParamsJson);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DynamicLinkFlow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DynamicLinkFlow createFromParcel(Parcel parcel) {
                return new DynamicLinkFlow(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DynamicLinkFlow[] newArray(int i) {
                return new DynamicLinkFlow[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$GooglePlayBinding;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/GooglePayParams;", "params", "<init>", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/GooglePayParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/GooglePayParams;", "copy", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/GooglePayParams;)Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$GooglePlayBinding;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/GooglePayParams;", "getParams", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GooglePlayBinding extends Scenario {
        public static final Parcelable.Creator<GooglePlayBinding> CREATOR = new Creator();
        private final GooglePayParams params;

        public GooglePlayBinding(GooglePayParams googlePayParams) {
            super(null);
            this.params = googlePayParams;
        }

        public static /* synthetic */ GooglePlayBinding copy$default(GooglePlayBinding googlePlayBinding, GooglePayParams googlePayParams, int i, Object obj) {
            if ((i & 1) != 0) {
                googlePayParams = googlePlayBinding.params;
            }
            return googlePlayBinding.copy(googlePayParams);
        }

        /* renamed from: component1, reason: from getter */
        public final GooglePayParams getParams() {
            return this.params;
        }

        public final GooglePlayBinding copy(GooglePayParams params) {
            return new GooglePlayBinding(params);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GooglePlayBinding) && jl40.l(this.params, ((GooglePlayBinding) other).params);
        }

        public final GooglePayParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        public String toString() {
            return "GooglePlayBinding(params=" + this.params + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.params.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GooglePlayBinding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePlayBinding createFromParcel(Parcel parcel) {
                return new GooglePlayBinding(GooglePayParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePlayBinding[] newArray(int i) {
                return new GooglePlayBinding[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006&"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Payment;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "", "isAnonym", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/PaymentToken;", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "", "email", "<init>", "(ZLcom/yandex/fintechsdk/flows/payment/kit/api/model/PaymentToken;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/PaymentToken;", "component3", "()Ljava/lang/String;", "copy", "(ZLcom/yandex/fintechsdk/flows/payment/kit/api/model/PaymentToken;Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Payment;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/PaymentToken;", "getToken", "Ljava/lang/String;", "getEmail", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payment extends Scenario {
        public static final Parcelable.Creator<Payment> CREATOR = new Creator();
        private final String email;
        private final boolean isAnonym;
        private final PaymentToken token;

        public Payment(boolean z, PaymentToken paymentToken, String str) {
            super(null);
            this.isAnonym = z;
            this.token = paymentToken;
            this.email = str;
        }

        public static /* synthetic */ Payment copy$default(Payment payment, boolean z, PaymentToken paymentToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = payment.isAnonym;
            }
            if ((i & 2) != 0) {
                paymentToken = payment.token;
            }
            if ((i & 4) != 0) {
                str = payment.email;
            }
            return payment.copy(z, paymentToken, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAnonym() {
            return this.isAnonym;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentToken getToken() {
            return this.token;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final Payment copy(boolean isAnonym, PaymentToken token, String email) {
            return new Payment(isAnonym, token, email);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return this.isAnonym == payment.isAnonym && jl40.l(this.token, payment.token) && jl40.l(this.email, payment.email);
        }

        public final String getEmail() {
            return this.email;
        }

        public final PaymentToken getToken() {
            return this.token;
        }

        public int hashCode() {
            int hashCode = (this.token.hashCode() + (Boolean.hashCode(this.isAnonym) * 31)) * 31;
            String str = this.email;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean isAnonym() {
            return this.isAnonym;
        }

        public String toString() {
            boolean z = this.isAnonym;
            PaymentToken paymentToken = this.token;
            String str = this.email;
            StringBuilder sb = new StringBuilder("Payment(isAnonym=");
            sb.append(z);
            sb.append(", token=");
            sb.append(paymentToken);
            sb.append(", email=");
            return oyr.t(sb, str, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.isAnonym ? 1 : 0);
            this.token.writeToParcel(dest, flags);
            dest.writeString(this.email);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Payment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Payment createFromParcel(Parcel parcel) {
                return new Payment(parcel.readInt() != 0, PaymentToken.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Payment[] newArray(int i) {
                return new Payment[i];
            }
        }

        public /* synthetic */ Payment(boolean z, PaymentToken paymentToken, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, paymentToken, (i & 4) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$SbpTokenBinding;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "", "verificationToken", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$SbpTokenBinding;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVerificationToken", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SbpTokenBinding extends Scenario {
        public static final Parcelable.Creator<SbpTokenBinding> CREATOR = new Creator();
        private final String verificationToken;

        public SbpTokenBinding(String str) {
            super(null);
            this.verificationToken = str;
        }

        public static /* synthetic */ SbpTokenBinding copy$default(SbpTokenBinding sbpTokenBinding, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sbpTokenBinding.verificationToken;
            }
            return sbpTokenBinding.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public final SbpTokenBinding copy(String verificationToken) {
            return new SbpTokenBinding(verificationToken);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SbpTokenBinding) && jl40.l(this.verificationToken, ((SbpTokenBinding) other).verificationToken);
        }

        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public int hashCode() {
            String str = this.verificationToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return oyr.p("SbpTokenBinding(verificationToken=", this.verificationToken, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.verificationToken);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpTokenBinding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpTokenBinding createFromParcel(Parcel parcel) {
                return new SbpTokenBinding(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpTokenBinding[] newArray(int i) {
                return new SbpTokenBinding[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$SelectMethod;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectMethod extends Scenario {
        public static final SelectMethod INSTANCE = new SelectMethod();
        public static final Parcelable.Creator<SelectMethod> CREATOR = new Creator();

        private SelectMethod() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SelectMethod);
        }

        public int hashCode() {
            return -477396013;
        }

        public String toString() {
            return "SelectMethod";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectMethod createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SelectMethod.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectMethod[] newArray(int i) {
                return new SelectMethod[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$TransportBanner;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransportBanner extends Scenario {
        public static final TransportBanner INSTANCE = new TransportBanner();
        public static final Parcelable.Creator<TransportBanner> CREATOR = new Creator();

        private TransportBanner() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TransportBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransportBanner createFromParcel(Parcel parcel) {
                parcel.readInt();
                return TransportBanner.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransportBanner[] newArray(int i) {
                return new TransportBanner[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$TransportCards;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/TransportCardParams;", "params", "<init>", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/TransportCardParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/TransportCardParams;", "copy", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/TransportCardParams;)Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$TransportCards;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/TransportCardParams;", "getParams", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TransportCards extends Scenario {
        public static final Parcelable.Creator<TransportCards> CREATOR = new Creator();
        private final TransportCardParams params;

        public TransportCards(TransportCardParams transportCardParams) {
            super(null);
            this.params = transportCardParams;
        }

        public static /* synthetic */ TransportCards copy$default(TransportCards transportCards, TransportCardParams transportCardParams, int i, Object obj) {
            if ((i & 1) != 0) {
                transportCardParams = transportCards.params;
            }
            return transportCards.copy(transportCardParams);
        }

        /* renamed from: component1, reason: from getter */
        public final TransportCardParams getParams() {
            return this.params;
        }

        public final TransportCards copy(TransportCardParams params) {
            return new TransportCards(params);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TransportCards) && jl40.l(this.params, ((TransportCards) other).params);
        }

        public final TransportCardParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        public String toString() {
            return "TransportCards(params=" + this.params + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.params.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TransportCards> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransportCards createFromParcel(Parcel parcel) {
                return new TransportCards(TransportCardParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransportCards[] newArray(int i) {
                return new TransportCards[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Unbinding;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unbinding extends Scenario {
        public static final Unbinding INSTANCE = new Unbinding();
        public static final Parcelable.Creator<Unbinding> CREATOR = new Creator();

        private Unbinding() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unbinding);
        }

        public int hashCode() {
            return -1181429066;
        }

        public String toString() {
            return "Unbinding";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unbinding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unbinding createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Unbinding.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unbinding[] newArray(int i) {
                return new Unbinding[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Verification;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams;", "params", "<init>", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams;", "copy", "(Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams;)Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Verification;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/fintechsdk/flows/payment/kit/api/model/VerificationParams;", "getParams", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Verification extends Scenario {
        public static final Parcelable.Creator<Verification> CREATOR = new Creator();
        private final VerificationParams params;

        public Verification(VerificationParams verificationParams) {
            super(null);
            this.params = verificationParams;
        }

        public static /* synthetic */ Verification copy$default(Verification verification, VerificationParams verificationParams, int i, Object obj) {
            if ((i & 1) != 0) {
                verificationParams = verification.params;
            }
            return verification.copy(verificationParams);
        }

        /* renamed from: component1, reason: from getter */
        public final VerificationParams getParams() {
            return this.params;
        }

        public final Verification copy(VerificationParams params) {
            return new Verification(params);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Verification) && jl40.l(this.params, ((Verification) other).params);
        }

        public final VerificationParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        public String toString() {
            return "Verification(params=" + this.params + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.params, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Verification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Verification createFromParcel(Parcel parcel) {
                return new Verification((VerificationParams) parcel.readParcelable(Verification.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Verification[] newArray(int i) {
                return new Verification[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Widget;", "Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario;", "", "", "body", Constants.DEEPLINK, "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/Map;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/Map;Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/internal/model/Scenario$Widget;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getBody", "Ljava/lang/String;", "getDeeplink", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Widget extends Scenario {
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();
        private final Map<String, String> body;
        private final String deeplink;

        public Widget(Map<String, String> map, String str) {
            super(null);
            this.body = map;
            this.deeplink = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Widget copy$default(Widget widget, Map map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                map = widget.body;
            }
            if ((i & 2) != 0) {
                str = widget.deeplink;
            }
            return widget.copy(map, str);
        }

        public final Map<String, String> component1() {
            return this.body;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Widget copy(Map<String, String> body, String deeplink) {
            return new Widget(body, deeplink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Widget)) {
                return false;
            }
            Widget widget = (Widget) other;
            return jl40.l(this.body, widget.body) && jl40.l(this.deeplink, widget.deeplink);
        }

        public final Map<String, String> getBody() {
            return this.body;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + (this.body.hashCode() * 31);
        }

        public String toString() {
            return "Widget(body=" + this.body + ", deeplink=" + this.deeplink + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator x = qv10.x(this.body, dest);
            while (x.hasNext()) {
                Map.Entry entry = (Map.Entry) x.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeString(this.deeplink);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Widget createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                }
                return new Widget(linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Widget[] newArray(int i) {
                return new Widget[i];
            }
        }
    }

    private Scenario() {
    }
}
