package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportUidImpl;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wwg;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001)B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/yandex/passport/internal/properties/TryAddPlusDeviceProperties;", "", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", Constants.KEY_SERVICE, "brand", "<init>", "(Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportUidImpl;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/properties/TryAddPlusDeviceProperties;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Ljava/lang/String;", "getService", "getBrand", "Companion", "com/yandex/passport/internal/properties/x", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TryAddPlusDeviceProperties implements Parcelable {
    public static final int $stable = 8;
    private static final String KEY_TRY_ADD_PLUS_DEVICE_PROPERTIES = "key_try_add_plus_device_properties";
    private final String brand;
    private final String service;
    private final PassportUidImpl uid;
    public static final x Companion = new x();
    public static final Parcelable.Creator<TryAddPlusDeviceProperties> CREATOR = new Creator();

    public TryAddPlusDeviceProperties(PassportUidImpl passportUidImpl, String str, String str2) {
        this.uid = passportUidImpl;
        this.service = str;
        this.brand = str2;
    }

    public static /* synthetic */ TryAddPlusDeviceProperties copy$default(TryAddPlusDeviceProperties tryAddPlusDeviceProperties, PassportUidImpl passportUidImpl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            passportUidImpl = tryAddPlusDeviceProperties.uid;
        }
        if ((i & 2) != 0) {
            str = tryAddPlusDeviceProperties.service;
        }
        if ((i & 4) != 0) {
            str2 = tryAddPlusDeviceProperties.brand;
        }
        return tryAddPlusDeviceProperties.copy(passportUidImpl, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    public final TryAddPlusDeviceProperties copy(PassportUidImpl uid, String service, String brand) {
        return new TryAddPlusDeviceProperties(uid, service, brand);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TryAddPlusDeviceProperties)) {
            return false;
        }
        TryAddPlusDeviceProperties tryAddPlusDeviceProperties = (TryAddPlusDeviceProperties) other;
        return jl40.l(this.uid, tryAddPlusDeviceProperties.uid) && jl40.l(this.service, tryAddPlusDeviceProperties.service) && jl40.l(this.brand, tryAddPlusDeviceProperties.brand);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getService() {
        return this.service;
    }

    public int hashCode() {
        return this.brand.hashCode() + unr0.b(this.uid.hashCode() * 31, 31, this.service);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_TRY_ADD_PLUS_DEVICE_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TryAddPlusDeviceProperties(uid=");
        sb.append(this.uid);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", brand=");
        return b64.p(sb, this.brand, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.service);
        dest.writeString(this.brand);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TryAddPlusDeviceProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TryAddPlusDeviceProperties createFromParcel(Parcel parcel) {
            return new TryAddPlusDeviceProperties(PassportUidImpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TryAddPlusDeviceProperties[] newArray(int i) {
            return new TryAddPlusDeviceProperties[i];
        }
    }

    /* renamed from: getUid, reason: merged with bridge method [inline-methods] */
    public PassportUidImpl m311getUid() {
        return this.uid;
    }
}
