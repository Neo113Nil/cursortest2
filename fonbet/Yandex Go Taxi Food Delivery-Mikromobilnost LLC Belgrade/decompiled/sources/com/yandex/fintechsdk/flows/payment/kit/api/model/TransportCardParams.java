package com.yandex.fintechsdk.flows.payment.kit.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÀ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0003HÀ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0017\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/model/TransportCardParams;", "Landroid/os/Parcelable;", "", "", "body", Constants.DEEPLINK, "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1$flows_payment_kit_release", "()Ljava/util/Map;", "component1", "component2$flows_payment_kit_release", "()Ljava/lang/String;", "component2", "copy", "(Ljava/util/Map;Ljava/lang/String;)Lcom/yandex/fintechsdk/flows/payment/kit/api/model/TransportCardParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getBody$flows_payment_kit_release", "Ljava/lang/String;", "getDeeplink$flows_payment_kit_release", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TransportCardParams implements Parcelable {
    public static final Parcelable.Creator<TransportCardParams> CREATOR = new Creator();
    private final Map<String, String> body;
    private final String deeplink;

    public TransportCardParams(Map<String, String> map, String str) {
        this.body = map;
        this.deeplink = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransportCardParams copy$default(TransportCardParams transportCardParams, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = transportCardParams.body;
        }
        if ((i & 2) != 0) {
            str = transportCardParams.deeplink;
        }
        return transportCardParams.copy(map, str);
    }

    public final Map<String, String> component1$flows_payment_kit_release() {
        return this.body;
    }

    /* renamed from: component2$flows_payment_kit_release, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final TransportCardParams copy(Map<String, String> body, String deeplink) {
        return new TransportCardParams(body, deeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransportCardParams)) {
            return false;
        }
        TransportCardParams transportCardParams = (TransportCardParams) other;
        return jl40.l(this.body, transportCardParams.body) && jl40.l(this.deeplink, transportCardParams.deeplink);
    }

    public final Map<String, String> getBody$flows_payment_kit_release() {
        return this.body;
    }

    public final String getDeeplink$flows_payment_kit_release() {
        return this.deeplink;
    }

    public int hashCode() {
        return this.deeplink.hashCode() + (this.body.hashCode() * 31);
    }

    public String toString() {
        return "TransportCardParams(body=" + this.body + ", deeplink=" + this.deeplink + Extension.C_BRAKE;
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
    public static final class Creator implements Parcelable.Creator<TransportCardParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransportCardParams createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new TransportCardParams(linkedHashMap, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransportCardParams[] newArray(int i) {
            return new TransportCardParams[i];
        }
    }
}
