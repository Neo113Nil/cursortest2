package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.l1;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wwg;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b\u000b\u0010\"¨\u00065"}, d2 = {"Lcom/yandex/passport/internal/properties/ManagingPlusDevicesPropertiesImpl;", "Lcom/yandex/passport/api/l1;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", Constants.KEY_SERVICE, "brand", "", "isForceShowManagingPlusDevices", "<init>", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportTheme;", "component2", "()Lcom/yandex/passport/api/PassportUidImpl;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "copy", "(Lcom/yandex/passport/api/PassportTheme;Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Z)Lcom/yandex/passport/internal/properties/ManagingPlusDevicesPropertiesImpl;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Ljava/lang/String;", "getService", "getBrand", "Z", "Companion", "com/yandex/passport/internal/properties/j", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ManagingPlusDevicesPropertiesImpl implements l1, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_MANAGING_PLUS_DEVICES_PROPERTIES = "key_managing_plus_devices_properties";
    private final String brand;
    private final boolean isForceShowManagingPlusDevices;
    private final String service;
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    public static final j Companion = new j();
    public static final Parcelable.Creator<ManagingPlusDevicesPropertiesImpl> CREATOR = new Creator();

    public ManagingPlusDevicesPropertiesImpl(PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, String str2, boolean z) {
        this.theme = passportTheme;
        this.uid = passportUidImpl;
        this.service = str;
        this.brand = str2;
        this.isForceShowManagingPlusDevices = z;
    }

    public static /* synthetic */ ManagingPlusDevicesPropertiesImpl copy$default(ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl, PassportTheme passportTheme, PassportUidImpl passportUidImpl, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            passportTheme = managingPlusDevicesPropertiesImpl.theme;
        }
        if ((i & 2) != 0) {
            passportUidImpl = managingPlusDevicesPropertiesImpl.uid;
        }
        if ((i & 4) != 0) {
            str = managingPlusDevicesPropertiesImpl.service;
        }
        if ((i & 8) != 0) {
            str2 = managingPlusDevicesPropertiesImpl.brand;
        }
        if ((i & 16) != 0) {
            z = managingPlusDevicesPropertiesImpl.isForceShowManagingPlusDevices;
        }
        boolean z2 = z;
        String str3 = str;
        return managingPlusDevicesPropertiesImpl.copy(passportTheme, passportUidImpl, str3, str2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsForceShowManagingPlusDevices() {
        return this.isForceShowManagingPlusDevices;
    }

    public final ManagingPlusDevicesPropertiesImpl copy(PassportTheme theme, PassportUidImpl uid, String service, String brand, boolean isForceShowManagingPlusDevices) {
        return new ManagingPlusDevicesPropertiesImpl(theme, uid, service, brand, isForceShowManagingPlusDevices);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagingPlusDevicesPropertiesImpl)) {
            return false;
        }
        ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl = (ManagingPlusDevicesPropertiesImpl) other;
        return this.theme == managingPlusDevicesPropertiesImpl.theme && jl40.l(this.uid, managingPlusDevicesPropertiesImpl.uid) && jl40.l(this.service, managingPlusDevicesPropertiesImpl.service) && jl40.l(this.brand, managingPlusDevicesPropertiesImpl.brand) && this.isForceShowManagingPlusDevices == managingPlusDevicesPropertiesImpl.isForceShowManagingPlusDevices;
    }

    @Override // com.yandex.passport.api.l1
    public String getBrand() {
        return this.brand;
    }

    @Override // com.yandex.passport.api.l1
    public String getService() {
        return this.service;
    }

    @Override // com.yandex.passport.api.l1
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isForceShowManagingPlusDevices) + unr0.b(unr0.b((this.uid.hashCode() + (this.theme.hashCode() * 31)) * 31, 31, this.service), 31, this.brand);
    }

    @Override // com.yandex.passport.api.l1
    public boolean isForceShowManagingPlusDevices() {
        return this.isForceShowManagingPlusDevices;
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_MANAGING_PLUS_DEVICES_PROPERTIES, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ManagingPlusDevicesPropertiesImpl(theme=");
        sb.append(this.theme);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", brand=");
        sb.append(this.brand);
        sb.append(", isForceShowManagingPlusDevices=");
        return unr0.u(sb, this.isForceShowManagingPlusDevices, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.theme.name());
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.service);
        dest.writeString(this.brand);
        dest.writeInt(this.isForceShowManagingPlusDevices ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ManagingPlusDevicesPropertiesImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManagingPlusDevicesPropertiesImpl createFromParcel(Parcel parcel) {
            return new ManagingPlusDevicesPropertiesImpl(PassportTheme.valueOf(parcel.readString()), PassportUidImpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManagingPlusDevicesPropertiesImpl[] newArray(int i) {
            return new ManagingPlusDevicesPropertiesImpl[i];
        }
    }

    @Override // com.yandex.passport.api.l1
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
