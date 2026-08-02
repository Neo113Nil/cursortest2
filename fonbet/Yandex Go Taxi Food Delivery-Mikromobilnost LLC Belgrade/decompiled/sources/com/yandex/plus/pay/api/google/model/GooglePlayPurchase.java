package com.yandex.plus.pay.api.google.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.auu0;
import defpackage.cwt;
import defpackage.dwt;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mvt;
import defpackage.o4o;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.common.clid.ClidProvider;

@gsq0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010&J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b/\u00100Jh\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010&J\u0010\u00104\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b4\u0010\u001fJ\u001a\u00107\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010&R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010&R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010&R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u00100¨\u0006H"}, d2 = {"Lcom/yandex/plus/pay/api/google/model/GooglePlayPurchase;", "Landroid/os/Parcelable;", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "", "products", "originalJson", "jsonBase64", X509CertImpl.SIGNATURE, AuthSdkActivity.RESPONSE_TYPE_TOKEN, "", "acknowledge", "Lcom/yandex/plus/pay/api/google/model/PurchaseState;", ClidProvider.STATE, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/yandex/plus/pay/api/google/model/PurchaseState;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/yandex/plus/pay/api/google/model/PurchaseState;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_api_release", "(Lcom/yandex/plus/pay/api/google/model/GooglePlayPurchase;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "()Lcom/yandex/plus/pay/api/google/model/PurchaseState;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/yandex/plus/pay/api/google/model/PurchaseState;)Lcom/yandex/plus/pay/api/google/model/GooglePlayPurchase;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId", "Ljava/util/List;", "getProducts", "getOriginalJson", "getJsonBase64", "getSignature", "getToken", "Z", "getAcknowledge", "Lcom/yandex/plus/pay/api/google/model/PurchaseState;", "getState", "Companion", "cwt", "dwt", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GooglePlayPurchase implements Parcelable {
    private static final i3y[] $childSerializers;
    private final boolean acknowledge;
    private final String jsonBase64;
    private final String orderId;
    private final String originalJson;
    private final List<String> products;
    private final String signature;
    private final PurchaseState state;
    private final String token;
    public static final dwt Companion = new dwt();
    public static final Parcelable.Creator<GooglePlayPurchase> CREATOR = new Creator();

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new i3y[]{null, a.b(lazyThreadSafetyMode, new mvt(1)), null, null, null, null, null, a.b(lazyThreadSafetyMode, new mvt(2))};
    }

    public /* synthetic */ GooglePlayPurchase(int i, String str, List list, String str2, String str3, String str4, String str5, boolean z, PurchaseState purchaseState, psq0 psq0Var) {
        if (255 != (i & 255)) {
            qje.Z(i, 255, cwt.a.getDescriptor());
            throw null;
        }
        this.orderId = str;
        this.products = list;
        this.originalJson = str2;
        this.jsonBase64 = str3;
        this.signature = str4;
        this.token = str5;
        this.acknowledge = z;
        this.state = purchaseState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new p53(auu0.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new o4o("com.yandex.plus.pay.api.google.model.PurchaseState", (Enum[]) PurchaseState.values());
    }

    public static /* synthetic */ GooglePlayPurchase copy$default(GooglePlayPurchase googlePlayPurchase, String str, List list, String str2, String str3, String str4, String str5, boolean z, PurchaseState purchaseState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePlayPurchase.orderId;
        }
        if ((i & 2) != 0) {
            list = googlePlayPurchase.products;
        }
        if ((i & 4) != 0) {
            str2 = googlePlayPurchase.originalJson;
        }
        if ((i & 8) != 0) {
            str3 = googlePlayPurchase.jsonBase64;
        }
        if ((i & 16) != 0) {
            str4 = googlePlayPurchase.signature;
        }
        if ((i & 32) != 0) {
            str5 = googlePlayPurchase.token;
        }
        if ((i & 64) != 0) {
            z = googlePlayPurchase.acknowledge;
        }
        if ((i & 128) != 0) {
            purchaseState = googlePlayPurchase.state;
        }
        boolean z2 = z;
        PurchaseState purchaseState2 = purchaseState;
        String str6 = str4;
        String str7 = str5;
        return googlePlayPurchase.copy(str, list, str2, str3, str6, str7, z2, purchaseState2);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_api_release(GooglePlayPurchase self, yjd output, SerialDescriptor serialDesc) {
        i3y[] i3yVarArr = $childSerializers;
        output.g(serialDesc, 0, auu0.a, self.orderId);
        output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.products);
        output.o(serialDesc, 2, self.originalJson);
        output.o(serialDesc, 3, self.jsonBase64);
        output.o(serialDesc, 4, self.signature);
        output.o(serialDesc, 5, self.token);
        output.n(serialDesc, 6, self.acknowledge);
        output.e(serialDesc, 7, (KSerializer) i3yVarArr[7].getValue(), self.state);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final List<String> component2() {
        return this.products;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginalJson() {
        return this.originalJson;
    }

    /* renamed from: component4, reason: from getter */
    public final String getJsonBase64() {
        return this.jsonBase64;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* renamed from: component6, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAcknowledge() {
        return this.acknowledge;
    }

    /* renamed from: component8, reason: from getter */
    public final PurchaseState getState() {
        return this.state;
    }

    public final GooglePlayPurchase copy(String orderId, List<String> products, String originalJson, String jsonBase64, String signature, String token, boolean acknowledge, PurchaseState state) {
        return new GooglePlayPurchase(orderId, products, originalJson, jsonBase64, signature, token, acknowledge, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePlayPurchase)) {
            return false;
        }
        GooglePlayPurchase googlePlayPurchase = (GooglePlayPurchase) other;
        return jl40.l(this.orderId, googlePlayPurchase.orderId) && jl40.l(this.products, googlePlayPurchase.products) && jl40.l(this.originalJson, googlePlayPurchase.originalJson) && jl40.l(this.jsonBase64, googlePlayPurchase.jsonBase64) && jl40.l(this.signature, googlePlayPurchase.signature) && jl40.l(this.token, googlePlayPurchase.token) && this.acknowledge == googlePlayPurchase.acknowledge && this.state == googlePlayPurchase.state;
    }

    public final boolean getAcknowledge() {
        return this.acknowledge;
    }

    public final String getJsonBase64() {
        return this.jsonBase64;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final PurchaseState getState() {
        return this.state;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.orderId;
        return this.state.hashCode() + unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.products), 31, this.originalJson), 31, this.jsonBase64), 31, this.signature), 31, this.token), 31, this.acknowledge);
    }

    public String toString() {
        return "GooglePlayPurchase(orderId=" + this.orderId + ", products=" + this.products + ", originalJson=" + this.originalJson + ", jsonBase64=" + this.jsonBase64 + ", signature=" + this.signature + ", token=" + this.token + ", acknowledge=" + this.acknowledge + ", state=" + this.state + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.orderId);
        dest.writeStringList(this.products);
        dest.writeString(this.originalJson);
        dest.writeString(this.jsonBase64);
        dest.writeString(this.signature);
        dest.writeString(this.token);
        dest.writeInt(this.acknowledge ? 1 : 0);
        dest.writeString(this.state.name());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePlayPurchase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePlayPurchase createFromParcel(Parcel parcel) {
            return new GooglePlayPurchase(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, PurchaseState.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePlayPurchase[] newArray(int i) {
            return new GooglePlayPurchase[i];
        }
    }

    public GooglePlayPurchase(String str, List<String> list, String str2, String str3, String str4, String str5, boolean z, PurchaseState purchaseState) {
        this.orderId = str;
        this.products = list;
        this.originalJson = str2;
        this.jsonBase64 = str3;
        this.signature = str4;
        this.token = str5;
        this.acknowledge = z;
        this.state = purchaseState;
    }
}
