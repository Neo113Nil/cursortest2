package com.yandex.mobile.drive.sdk.full.model;

import com.yandex.mobile.drive.sdk.full.GeoPoint;
import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/MapAddressData;", "Ljava/io/Serializable;", "Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", IssuingDistributionPointExtension.POINT, "", "title", "<init>", "(Lcom/yandex/mobile/drive/sdk/full/GeoPoint;Ljava/lang/String;)V", "Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", "getPoint", "()Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MapAddressData implements Serializable {

    @ysq0(IssuingDistributionPointExtension.POINT)
    private final GeoPoint point;

    @ysq0("title")
    private final String title;

    public /* synthetic */ MapAddressData(GeoPoint geoPoint, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : geoPoint, (i & 2) != 0 ? null : str);
    }

    public final Map a() {
        GeoPoint geoPoint = this.point;
        Double valueOf = geoPoint != null ? Double.valueOf(geoPoint.getLon()) : null;
        GeoPoint geoPoint2 = this.point;
        Pair pair = new Pair(IssuingDistributionPointExtension.POINT, valueOf + " " + (geoPoint2 != null ? Double.valueOf(geoPoint2.getLat()) : null));
        String str = this.title;
        if (str == null) {
            str = "";
        }
        return b.i(pair, new Pair("title", str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapAddressData)) {
            return false;
        }
        MapAddressData mapAddressData = (MapAddressData) obj;
        return jl40.l(this.point, mapAddressData.point) && jl40.l(this.title, mapAddressData.title);
    }

    public final int hashCode() {
        GeoPoint geoPoint = this.point;
        int hashCode = (geoPoint == null ? 0 : geoPoint.hashCode()) * 31;
        String str = this.title;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MapAddressData(point=" + this.point + ", title=" + this.title + Extension.C_BRAKE;
    }

    public MapAddressData(GeoPoint geoPoint, String str) {
        this.point = geoPoint;
        this.title = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapAddressData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
