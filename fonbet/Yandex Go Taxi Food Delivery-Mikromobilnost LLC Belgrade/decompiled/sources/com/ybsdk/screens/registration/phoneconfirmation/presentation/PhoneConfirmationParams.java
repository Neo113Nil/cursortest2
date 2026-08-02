package com.ybsdk.screens.registration.phoneconfirmation.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.jl40;
import defpackage.n;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"JZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\"¨\u00066"}, d2 = {"Lcom/ybsdk/screens/registration/phoneconfirmation/presentation/PhoneConfirmationParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/api/entities/YBProduct;", CreateApplicationWithProductJsonAdapter.productKey, "", "", "additionalRegistrationParams", "Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "ongoingOperation", "", "standAloneRegistration", "showAgreement", "registrationDeeplink", "<init>", "(Lcom/ybsdk/api/entities/YBProduct;Ljava/util/Map;Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;ZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/entities/YBProduct;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "component4", "()Z", "component5", "component6", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/api/entities/YBProduct;Ljava/util/Map;Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;ZZLjava/lang/String;)Lcom/ybsdk/screens/registration/phoneconfirmation/presentation/PhoneConfirmationParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/entities/YBProduct;", "getProduct", "Ljava/util/Map;", "getAdditionalRegistrationParams", "Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "getOngoingOperation", "Z", "getStandAloneRegistration", "getShowAgreement", "Ljava/lang/String;", "getRegistrationDeeplink", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PhoneConfirmationParams implements ScreenParams {
    public static final Parcelable.Creator<PhoneConfirmationParams> CREATOR = new Creator();
    private final Map<String, String> additionalRegistrationParams;
    private final RegistrationType$OngoingOperation ongoingOperation;
    private final YBProduct product;
    private final String registrationDeeplink;
    private final boolean showAgreement;
    private final boolean standAloneRegistration;

    public PhoneConfirmationParams(YBProduct yBProduct, Map<String, String> map, RegistrationType$OngoingOperation registrationType$OngoingOperation, boolean z, boolean z2, String str) {
        this.product = yBProduct;
        this.additionalRegistrationParams = map;
        this.ongoingOperation = registrationType$OngoingOperation;
        this.standAloneRegistration = z;
        this.showAgreement = z2;
        this.registrationDeeplink = str;
    }

    public static /* synthetic */ PhoneConfirmationParams copy$default(PhoneConfirmationParams phoneConfirmationParams, YBProduct yBProduct, Map map, RegistrationType$OngoingOperation registrationType$OngoingOperation, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            yBProduct = phoneConfirmationParams.product;
        }
        if ((i & 2) != 0) {
            map = phoneConfirmationParams.additionalRegistrationParams;
        }
        if ((i & 4) != 0) {
            registrationType$OngoingOperation = phoneConfirmationParams.ongoingOperation;
        }
        if ((i & 8) != 0) {
            z = phoneConfirmationParams.standAloneRegistration;
        }
        if ((i & 16) != 0) {
            z2 = phoneConfirmationParams.showAgreement;
        }
        if ((i & 32) != 0) {
            str = phoneConfirmationParams.registrationDeeplink;
        }
        boolean z3 = z2;
        String str2 = str;
        return phoneConfirmationParams.copy(yBProduct, map, registrationType$OngoingOperation, z, z3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final YBProduct getProduct() {
        return this.product;
    }

    public final Map<String, String> component2() {
        return this.additionalRegistrationParams;
    }

    /* renamed from: component3, reason: from getter */
    public final RegistrationType$OngoingOperation getOngoingOperation() {
        return this.ongoingOperation;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getStandAloneRegistration() {
        return this.standAloneRegistration;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowAgreement() {
        return this.showAgreement;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRegistrationDeeplink() {
        return this.registrationDeeplink;
    }

    public final PhoneConfirmationParams copy(YBProduct product, Map<String, String> additionalRegistrationParams, RegistrationType$OngoingOperation ongoingOperation, boolean standAloneRegistration, boolean showAgreement, String registrationDeeplink) {
        return new PhoneConfirmationParams(product, additionalRegistrationParams, ongoingOperation, standAloneRegistration, showAgreement, registrationDeeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneConfirmationParams)) {
            return false;
        }
        PhoneConfirmationParams phoneConfirmationParams = (PhoneConfirmationParams) other;
        return this.product == phoneConfirmationParams.product && jl40.l(this.additionalRegistrationParams, phoneConfirmationParams.additionalRegistrationParams) && this.ongoingOperation == phoneConfirmationParams.ongoingOperation && this.standAloneRegistration == phoneConfirmationParams.standAloneRegistration && this.showAgreement == phoneConfirmationParams.showAgreement && jl40.l(this.registrationDeeplink, phoneConfirmationParams.registrationDeeplink);
    }

    public final Map<String, String> getAdditionalRegistrationParams() {
        return this.additionalRegistrationParams;
    }

    public final RegistrationType$OngoingOperation getOngoingOperation() {
        return this.ongoingOperation;
    }

    public final YBProduct getProduct() {
        return this.product;
    }

    public final String getRegistrationDeeplink() {
        return this.registrationDeeplink;
    }

    public final boolean getShowAgreement() {
        return this.showAgreement;
    }

    public final boolean getStandAloneRegistration() {
        return this.standAloneRegistration;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e((this.ongoingOperation.hashCode() + unr0.d(this.product.hashCode() * 31, 31, this.additionalRegistrationParams)) * 31, 31, this.standAloneRegistration), 31, this.showAgreement);
        String str = this.registrationDeeplink;
        return e + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        YBProduct yBProduct = this.product;
        Map<String, String> map = this.additionalRegistrationParams;
        RegistrationType$OngoingOperation registrationType$OngoingOperation = this.ongoingOperation;
        boolean z = this.standAloneRegistration;
        boolean z2 = this.showAgreement;
        String str = this.registrationDeeplink;
        StringBuilder sb = new StringBuilder("PhoneConfirmationParams(product=");
        sb.append(yBProduct);
        sb.append(", additionalRegistrationParams=");
        sb.append(map);
        sb.append(", ongoingOperation=");
        sb.append(registrationType$OngoingOperation);
        sb.append(", standAloneRegistration=");
        sb.append(z);
        sb.append(", showAgreement=");
        return n.m(", registrationDeeplink=", str, Extension.C_BRAKE, sb, z2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.product.name());
        Iterator x = qv10.x(this.additionalRegistrationParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeString(this.ongoingOperation.name());
        dest.writeInt(this.standAloneRegistration ? 1 : 0);
        dest.writeInt(this.showAgreement ? 1 : 0);
        dest.writeString(this.registrationDeeplink);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhoneConfirmationParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            YBProduct valueOf = YBProduct.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (true) {
                z = true;
                if (i == readInt) {
                    break;
                }
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            RegistrationType$OngoingOperation valueOf2 = RegistrationType$OngoingOperation.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z = false;
            }
            return new PhoneConfirmationParams(valueOf, linkedHashMap, valueOf2, z, parcel.readInt() != 0 ? z2 : false, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmationParams[] newArray(int i) {
            return new PhoneConfirmationParams[i];
        }
    }

    public /* synthetic */ PhoneConfirmationParams(YBProduct yBProduct, Map map, RegistrationType$OngoingOperation registrationType$OngoingOperation, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yBProduct, map, registrationType$OngoingOperation, z, (i & 16) != 0 ? true : z2, str);
    }
}
