package com.ybsdk.screens.registration.applicationstatus.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", CreateApplicationWithProductJsonAdapter.productKey, "Lcom/ybsdk/api/entities/YBProduct;", "getProduct", "()Lcom/ybsdk/api/entities/YBProduct;", "standaloneRegistration", "", "getStandaloneRegistration", "()Z", "registrationAction", "", "getRegistrationAction", "()Ljava/lang/String;", "StatusPolling", "OpenProduct", "Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams$OpenProduct;", "Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams$StatusPolling;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RegistrationApplicationStatusScreenParams extends ScreenParams {
    YBProduct getProduct();

    String getRegistrationAction();

    boolean getStandaloneRegistration();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001c¨\u0006-"}, d2 = {"Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams$OpenProduct;", "Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams;", "Lcom/ybsdk/api/entities/YBProduct;", CreateApplicationWithProductJsonAdapter.productKey, "", "standaloneRegistration", "", "", "additionalRequestParams", "registrationAction", "<init>", "(Lcom/ybsdk/api/entities/YBProduct;ZLjava/util/Map;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/entities/YBProduct;", "component2", "()Z", "component3", "()Ljava/util/Map;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/api/entities/YBProduct;ZLjava/util/Map;Ljava/lang/String;)Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams$OpenProduct;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/entities/YBProduct;", "getProduct", "Z", "getStandaloneRegistration", "Ljava/util/Map;", "getAdditionalRequestParams", "Ljava/lang/String;", "getRegistrationAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenProduct implements RegistrationApplicationStatusScreenParams {
        public static final Parcelable.Creator<OpenProduct> CREATOR = new Creator();
        private final Map<String, String> additionalRequestParams;
        private final YBProduct product;
        private final String registrationAction;
        private final boolean standaloneRegistration;

        public OpenProduct(YBProduct yBProduct, boolean z, Map<String, String> map, String str) {
            this.product = yBProduct;
            this.standaloneRegistration = z;
            this.additionalRequestParams = map;
            this.registrationAction = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OpenProduct copy$default(OpenProduct openProduct, YBProduct yBProduct, boolean z, Map map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                yBProduct = openProduct.product;
            }
            if ((i & 2) != 0) {
                z = openProduct.standaloneRegistration;
            }
            if ((i & 4) != 0) {
                map = openProduct.additionalRequestParams;
            }
            if ((i & 8) != 0) {
                str = openProduct.registrationAction;
            }
            return openProduct.copy(yBProduct, z, map, str);
        }

        /* renamed from: component1, reason: from getter */
        public final YBProduct getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getStandaloneRegistration() {
            return this.standaloneRegistration;
        }

        public final Map<String, String> component3() {
            return this.additionalRequestParams;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRegistrationAction() {
            return this.registrationAction;
        }

        public final OpenProduct copy(YBProduct product, boolean standaloneRegistration, Map<String, String> additionalRequestParams, String registrationAction) {
            return new OpenProduct(product, standaloneRegistration, additionalRequestParams, registrationAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenProduct)) {
                return false;
            }
            OpenProduct openProduct = (OpenProduct) other;
            return this.product == openProduct.product && this.standaloneRegistration == openProduct.standaloneRegistration && jl40.l(this.additionalRequestParams, openProduct.additionalRequestParams) && jl40.l(this.registrationAction, openProduct.registrationAction);
        }

        public final Map<String, String> getAdditionalRequestParams() {
            return this.additionalRequestParams;
        }

        @Override // com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams
        public YBProduct getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams
        public String getRegistrationAction() {
            return this.registrationAction;
        }

        @Override // com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams
        public boolean getStandaloneRegistration() {
            return this.standaloneRegistration;
        }

        public int hashCode() {
            int d = unr0.d(unr0.e(this.product.hashCode() * 31, 31, this.standaloneRegistration), 31, this.additionalRequestParams);
            String str = this.registrationAction;
            return d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OpenProduct(product=" + this.product + ", standaloneRegistration=" + this.standaloneRegistration + ", additionalRequestParams=" + this.additionalRequestParams + ", registrationAction=" + this.registrationAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product.name());
            dest.writeInt(this.standaloneRegistration ? 1 : 0);
            Iterator x = qv10.x(this.additionalRequestParams, dest);
            while (x.hasNext()) {
                Map.Entry entry = (Map.Entry) x.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeString(this.registrationAction);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OpenProduct> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenProduct createFromParcel(Parcel parcel) {
                YBProduct valueOf = YBProduct.valueOf(parcel.readString());
                int i = 0;
                boolean z = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                while (i != readInt) {
                    i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                }
                return new OpenProduct(valueOf, z, linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenProduct[] newArray(int i) {
                return new OpenProduct[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017JD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b/\u0010\u0017¨\u00060"}, d2 = {"Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams$StatusPolling;", "Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams;", "", "applicationId", "", "standaloneRegistration", "Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "ongoingOperation", "Lcom/ybsdk/api/entities/YBProduct;", CreateApplicationWithProductJsonAdapter.productKey, "registrationAction", "<init>", "(Ljava/lang/String;ZLcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;Lcom/ybsdk/api/entities/YBProduct;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "component4", "()Lcom/ybsdk/api/entities/YBProduct;", "component5", "copy", "(Ljava/lang/String;ZLcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;Lcom/ybsdk/api/entities/YBProduct;Ljava/lang/String;)Lcom/ybsdk/screens/registration/applicationstatus/presentation/RegistrationApplicationStatusScreenParams$StatusPolling;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationId", "Z", "getStandaloneRegistration", "Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "getOngoingOperation", "Lcom/ybsdk/api/entities/YBProduct;", "getProduct", "getRegistrationAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusPolling implements RegistrationApplicationStatusScreenParams {
        public static final Parcelable.Creator<StatusPolling> CREATOR = new Creator();
        private final String applicationId;
        private final RegistrationType$OngoingOperation ongoingOperation;
        private final YBProduct product;
        private final String registrationAction;
        private final boolean standaloneRegistration;

        public StatusPolling(String str, boolean z, RegistrationType$OngoingOperation registrationType$OngoingOperation, YBProduct yBProduct, String str2) {
            this.applicationId = str;
            this.standaloneRegistration = z;
            this.ongoingOperation = registrationType$OngoingOperation;
            this.product = yBProduct;
            this.registrationAction = str2;
        }

        public static /* synthetic */ StatusPolling copy$default(StatusPolling statusPolling, String str, boolean z, RegistrationType$OngoingOperation registrationType$OngoingOperation, YBProduct yBProduct, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = statusPolling.applicationId;
            }
            if ((i & 2) != 0) {
                z = statusPolling.standaloneRegistration;
            }
            if ((i & 4) != 0) {
                registrationType$OngoingOperation = statusPolling.ongoingOperation;
            }
            if ((i & 8) != 0) {
                yBProduct = statusPolling.product;
            }
            if ((i & 16) != 0) {
                str2 = statusPolling.registrationAction;
            }
            String str3 = str2;
            RegistrationType$OngoingOperation registrationType$OngoingOperation2 = registrationType$OngoingOperation;
            return statusPolling.copy(str, z, registrationType$OngoingOperation2, yBProduct, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getStandaloneRegistration() {
            return this.standaloneRegistration;
        }

        /* renamed from: component3, reason: from getter */
        public final RegistrationType$OngoingOperation getOngoingOperation() {
            return this.ongoingOperation;
        }

        /* renamed from: component4, reason: from getter */
        public final YBProduct getProduct() {
            return this.product;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRegistrationAction() {
            return this.registrationAction;
        }

        public final StatusPolling copy(String applicationId, boolean standaloneRegistration, RegistrationType$OngoingOperation ongoingOperation, YBProduct product, String registrationAction) {
            return new StatusPolling(applicationId, standaloneRegistration, ongoingOperation, product, registrationAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusPolling)) {
                return false;
            }
            StatusPolling statusPolling = (StatusPolling) other;
            return jl40.l(this.applicationId, statusPolling.applicationId) && this.standaloneRegistration == statusPolling.standaloneRegistration && this.ongoingOperation == statusPolling.ongoingOperation && this.product == statusPolling.product && jl40.l(this.registrationAction, statusPolling.registrationAction);
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final RegistrationType$OngoingOperation getOngoingOperation() {
            return this.ongoingOperation;
        }

        @Override // com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams
        public YBProduct getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams
        public String getRegistrationAction() {
            return this.registrationAction;
        }

        @Override // com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams
        public boolean getStandaloneRegistration() {
            return this.standaloneRegistration;
        }

        public int hashCode() {
            int hashCode = (this.product.hashCode() + ((this.ongoingOperation.hashCode() + unr0.e(this.applicationId.hashCode() * 31, 31, this.standaloneRegistration)) * 31)) * 31;
            String str = this.registrationAction;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.applicationId;
            boolean z = this.standaloneRegistration;
            RegistrationType$OngoingOperation registrationType$OngoingOperation = this.ongoingOperation;
            YBProduct yBProduct = this.product;
            String str2 = this.registrationAction;
            StringBuilder l = oo31.l("StatusPolling(applicationId=", str, ", standaloneRegistration=", ", ongoingOperation=", z);
            l.append(registrationType$OngoingOperation);
            l.append(", product=");
            l.append(yBProduct);
            l.append(", registrationAction=");
            return oyr.t(l, str2, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.applicationId);
            dest.writeInt(this.standaloneRegistration ? 1 : 0);
            dest.writeString(this.ongoingOperation.name());
            dest.writeString(this.product.name());
            dest.writeString(this.registrationAction);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StatusPolling> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StatusPolling createFromParcel(Parcel parcel) {
                return new StatusPolling(parcel.readString(), parcel.readInt() != 0, RegistrationType$OngoingOperation.valueOf(parcel.readString()), YBProduct.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StatusPolling[] newArray(int i) {
                return new StatusPolling[i];
            }
        }
    }
}
