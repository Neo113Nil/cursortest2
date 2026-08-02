package com.ybsdk.feature.deeplink.api.actions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0017R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/DefaultPaymentMethodSet;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "deeplinkUri", "", "productId", "", "parameters", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/Map;)Lcom/ybsdk/feature/deeplink/api/actions/DefaultPaymentMethodSet;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getDeeplinkUri", "Ljava/lang/String;", "getProductId", "Ljava/util/Map;", "getParameters", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DefaultPaymentMethodSet implements BaseDeeplinkAction, Parcelable {
    public static final Parcelable.Creator<DefaultPaymentMethodSet> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final Map<String, String> parameters;
    private final String productId;

    public DefaultPaymentMethodSet(Uri uri, String str, Map<String, String> map) {
        this.deeplinkUri = uri;
        this.productId = str;
        this.parameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultPaymentMethodSet copy$default(DefaultPaymentMethodSet defaultPaymentMethodSet, Uri uri, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = defaultPaymentMethodSet.deeplinkUri;
        }
        if ((i & 2) != 0) {
            str = defaultPaymentMethodSet.productId;
        }
        if ((i & 4) != 0) {
            map = defaultPaymentMethodSet.parameters;
        }
        return defaultPaymentMethodSet.copy(uri, str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final Map<String, String> component3() {
        return this.parameters;
    }

    public final DefaultPaymentMethodSet copy(Uri deeplinkUri, String productId, Map<String, String> parameters) {
        return new DefaultPaymentMethodSet(deeplinkUri, productId, parameters);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultPaymentMethodSet)) {
            return false;
        }
        DefaultPaymentMethodSet defaultPaymentMethodSet = (DefaultPaymentMethodSet) other;
        return jl40.l(this.deeplinkUri, defaultPaymentMethodSet.deeplinkUri) && jl40.l(this.productId, defaultPaymentMethodSet.productId) && jl40.l(this.parameters, defaultPaymentMethodSet.parameters);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return this.parameters.hashCode() + unr0.b(this.deeplinkUri.hashCode() * 31, 31, this.productId);
    }

    public String toString() {
        Uri uri = this.deeplinkUri;
        String str = this.productId;
        Map<String, String> map = this.parameters;
        StringBuilder sb = new StringBuilder("DefaultPaymentMethodSet(deeplinkUri=");
        sb.append(uri);
        sb.append(", productId=");
        sb.append(str);
        sb.append(", parameters=");
        return b64.r(sb, map, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.deeplinkUri, flags);
        dest.writeString(this.productId);
        Iterator x = qv10.x(this.parameters, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DefaultPaymentMethodSet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPaymentMethodSet createFromParcel(Parcel parcel) {
            Uri uri = (Uri) parcel.readParcelable(DefaultPaymentMethodSet.class.getClassLoader());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new DefaultPaymentMethodSet(uri, readString, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPaymentMethodSet[] newArray(int i) {
            return new DefaultPaymentMethodSet[i];
        }
    }
}
