package com.yandex.fintechsdk.entities.config.payment.paymentkit;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u0012¨\u0006$"}, d2 = {"Lcom/yandex/fintechsdk/entities/config/payment/paymentkit/PaymentKitConfig;", "Landroid/os/Parcelable;", "", "expBoxes", "", "flags", ACSPConstants.STATUS, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/yandex/fintechsdk/entities/config/payment/paymentkit/PaymentKitConfig;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExpBoxes", "Ljava/util/Map;", "getFlags", "getStatus", "entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaymentKitConfig implements Parcelable {
    public static final Parcelable.Creator<PaymentKitConfig> CREATOR = new Creator();
    private final String expBoxes;
    private final Map<String, String> flags;
    private final String status;

    public PaymentKitConfig(String str, Map<String, String> map, String str2) {
        this.expBoxes = str;
        this.flags = map;
        this.status = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentKitConfig copy$default(PaymentKitConfig paymentKitConfig, String str, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentKitConfig.expBoxes;
        }
        if ((i & 2) != 0) {
            map = paymentKitConfig.flags;
        }
        if ((i & 4) != 0) {
            str2 = paymentKitConfig.status;
        }
        return paymentKitConfig.copy(str, map, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExpBoxes() {
        return this.expBoxes;
    }

    public final Map<String, String> component2() {
        return this.flags;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final PaymentKitConfig copy(String expBoxes, Map<String, String> flags, String status) {
        return new PaymentKitConfig(expBoxes, flags, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentKitConfig)) {
            return false;
        }
        PaymentKitConfig paymentKitConfig = (PaymentKitConfig) other;
        return jl40.l(this.expBoxes, paymentKitConfig.expBoxes) && jl40.l(this.flags, paymentKitConfig.flags) && jl40.l(this.status, paymentKitConfig.status);
    }

    public final String getExpBoxes() {
        return this.expBoxes;
    }

    public final Map<String, String> getFlags() {
        return this.flags;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + unr0.d(this.expBoxes.hashCode() * 31, 31, this.flags);
    }

    public String toString() {
        String str = this.expBoxes;
        Map<String, String> map = this.flags;
        String str2 = this.status;
        StringBuilder sb = new StringBuilder("PaymentKitConfig(expBoxes=");
        sb.append(str);
        sb.append(", flags=");
        sb.append(map);
        sb.append(", status=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.expBoxes);
        Iterator x = qv10.x(this.flags, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeString(this.status);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentKitConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentKitConfig createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new PaymentKitConfig(readString, linkedHashMap, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentKitConfig[] newArray(int i) {
            return new PaymentKitConfig[i];
        }
    }
}
