package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportLatLng;
import com.yandex.passport.api.PassportLocation;
import com.yandex.passport.api.m2;
import com.yandex.passport.api.p2;
import com.yandex.passport.internal.network.UrlOverride;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.smw0;
import defpackage.x4e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000256Bm\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ$\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJv\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001bR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001dR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b2\u0010\u001fR.\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b3\u0010\u001d¨\u00067"}, d2 = {"Lcom/yandex/passport/internal/properties/UpdateableProperties;", "Lcom/yandex/passport/api/m2;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/network/UrlOverride;", "urlOverride", "", "Lcom/yandex/passport/api/PassportLocation;", "locationsUrlOverride", "", "Lcom/yandex/passport/api/PassportLatLng;", "productLocation", "deviceGeoLocation", "", "", "vpnBlockerAdditionalParams", "<init>", "(Lcom/yandex/passport/internal/network/UrlOverride;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/network/UrlOverride;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Lcom/yandex/passport/internal/network/UrlOverride;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lcom/yandex/passport/internal/properties/UpdateableProperties;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/network/UrlOverride;", "getUrlOverride", "Ljava/util/Map;", "getLocationsUrlOverride", "Ljava/util/List;", "getProductLocation", "getDeviceGeoLocation", "getVpnBlockerAdditionalParams", "Companion", "a", "com/yandex/passport/internal/properties/z", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UpdateableProperties implements m2, Parcelable {
    public static final int $stable = 8;
    private final List<PassportLatLng> deviceGeoLocation;
    private final Map<PassportLocation, UrlOverride> locationsUrlOverride;
    private final List<PassportLatLng> productLocation;
    private final UrlOverride urlOverride;
    private final Map<String, String[]> vpnBlockerAdditionalParams;
    public static final z Companion = new z();
    public static final Parcelable.Creator<UpdateableProperties> CREATOR = new Creator();

    public static final class a implements m2 {
        public p2 a;
        public Map b;
        public List c;
        public Map w;

        @Override // com.yandex.passport.api.m2
        public final List getDeviceGeoLocation() {
            return this.c;
        }

        @Override // com.yandex.passport.api.m2
        public final Map getLocationsUrlOverride() {
            return this.b;
        }

        @Override // com.yandex.passport.api.m2
        public final List getProductLocation() {
            return null;
        }

        @Override // com.yandex.passport.api.m2
        public final p2 getUrlOverride() {
            return this.a;
        }

        @Override // com.yandex.passport.api.m2
        public final Map getVpnBlockerAdditionalParams() {
            return this.w;
        }
    }

    public /* synthetic */ UpdateableProperties(UrlOverride urlOverride, Map map, List list, List list2, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlOverride, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : map2);
    }

    public static /* synthetic */ UpdateableProperties copy$default(UpdateableProperties updateableProperties, UrlOverride urlOverride, Map map, List list, List list2, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            urlOverride = updateableProperties.urlOverride;
        }
        if ((i & 2) != 0) {
            map = updateableProperties.locationsUrlOverride;
        }
        if ((i & 4) != 0) {
            list = updateableProperties.productLocation;
        }
        if ((i & 8) != 0) {
            list2 = updateableProperties.deviceGeoLocation;
        }
        if ((i & 16) != 0) {
            map2 = updateableProperties.vpnBlockerAdditionalParams;
        }
        Map map3 = map2;
        List list3 = list;
        return updateableProperties.copy(urlOverride, map, list3, list2, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final UrlOverride getUrlOverride() {
        return this.urlOverride;
    }

    public final Map<PassportLocation, UrlOverride> component2() {
        return this.locationsUrlOverride;
    }

    public final List<PassportLatLng> component3() {
        return this.productLocation;
    }

    public final List<PassportLatLng> component4() {
        return this.deviceGeoLocation;
    }

    public final Map<String, String[]> component5() {
        return this.vpnBlockerAdditionalParams;
    }

    public final UpdateableProperties copy(UrlOverride urlOverride, Map<PassportLocation, UrlOverride> locationsUrlOverride, List<PassportLatLng> productLocation, List<PassportLatLng> deviceGeoLocation, Map<String, String[]> vpnBlockerAdditionalParams) {
        return new UpdateableProperties(urlOverride, locationsUrlOverride, productLocation, deviceGeoLocation, vpnBlockerAdditionalParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateableProperties)) {
            return false;
        }
        UpdateableProperties updateableProperties = (UpdateableProperties) other;
        return jl40.l(this.urlOverride, updateableProperties.urlOverride) && jl40.l(this.locationsUrlOverride, updateableProperties.locationsUrlOverride) && jl40.l(this.productLocation, updateableProperties.productLocation) && jl40.l(this.deviceGeoLocation, updateableProperties.deviceGeoLocation) && jl40.l(this.vpnBlockerAdditionalParams, updateableProperties.vpnBlockerAdditionalParams);
    }

    @Override // com.yandex.passport.api.m2
    public List<PassportLatLng> getDeviceGeoLocation() {
        return this.deviceGeoLocation;
    }

    @Override // com.yandex.passport.api.m2
    public Map<PassportLocation, UrlOverride> getLocationsUrlOverride() {
        return this.locationsUrlOverride;
    }

    @Override // com.yandex.passport.api.m2
    public List<PassportLatLng> getProductLocation() {
        return this.productLocation;
    }

    @Override // com.yandex.passport.api.m2
    public Map<String, String[]> getVpnBlockerAdditionalParams() {
        return this.vpnBlockerAdditionalParams;
    }

    public int hashCode() {
        UrlOverride urlOverride = this.urlOverride;
        int hashCode = (urlOverride == null ? 0 : urlOverride.hashCode()) * 31;
        Map<PassportLocation, UrlOverride> map = this.locationsUrlOverride;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<PassportLatLng> list = this.productLocation;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<PassportLatLng> list2 = this.deviceGeoLocation;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, String[]> map2 = this.vpnBlockerAdditionalParams;
        return hashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateableProperties(urlOverride=");
        sb.append(this.urlOverride);
        sb.append(", locationsUrlOverride=");
        sb.append(this.locationsUrlOverride);
        sb.append(", productLocation=");
        sb.append(this.productLocation);
        sb.append(", deviceGeoLocation=");
        sb.append(this.deviceGeoLocation);
        sb.append(", vpnBlockerAdditionalParams=");
        return smw0.n(sb, this.vpnBlockerAdditionalParams, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        UrlOverride urlOverride = this.urlOverride;
        if (urlOverride == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            urlOverride.writeToParcel(dest, flags);
        }
        Map<PassportLocation, UrlOverride> map = this.locationsUrlOverride;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                ((PassportLocation) entry.getKey()).writeToParcel(dest, flags);
                ((UrlOverride) entry.getValue()).writeToParcel(dest, flags);
            }
        }
        List<PassportLatLng> list = this.productLocation;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator m = oo31.m(dest, 1, list);
            while (m.hasNext()) {
                ((PassportLatLng) m.next()).writeToParcel(dest, flags);
            }
        }
        List<PassportLatLng> list2 = this.deviceGeoLocation;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator m2 = oo31.m(dest, 1, list2);
            while (m2.hasNext()) {
                ((PassportLatLng) m2.next()).writeToParcel(dest, flags);
            }
        }
        Map<String, String[]> map2 = this.vpnBlockerAdditionalParams;
        if (map2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator s2 = x4e.s(dest, 1, map2);
        while (s2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) s2.next();
            dest.writeString((String) entry2.getKey());
            dest.writeStringArray((String[]) entry2.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UpdateableProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateableProperties createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            ArrayList arrayList2;
            LinkedHashMap linkedHashMap2 = null;
            UrlOverride createFromParcel = parcel.readInt() == 0 ? null : UrlOverride.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(PassportLocation.CREATOR.createFromParcel(parcel), UrlOverride.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = oo31.d(PassportLatLng.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = oo31.d(PassportLatLng.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.createStringArray());
                }
            }
            return new UpdateableProperties(createFromParcel, linkedHashMap, arrayList, arrayList2, linkedHashMap2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateableProperties[] newArray(int i) {
            return new UpdateableProperties[i];
        }
    }

    @Override // com.yandex.passport.api.m2
    public UrlOverride getUrlOverride() {
        return this.urlOverride;
    }

    public UpdateableProperties(UrlOverride urlOverride, Map<PassportLocation, UrlOverride> map, List<PassportLatLng> list, List<PassportLatLng> list2, Map<String, String[]> map2) {
        this.urlOverride = urlOverride;
        this.locationsUrlOverride = map;
        this.productLocation = list;
        this.deviceGeoLocation = list2;
        this.vpnBlockerAdditionalParams = map2;
    }

    public UpdateableProperties() {
        this(null, null, null, null, null, 31, null);
    }
}
