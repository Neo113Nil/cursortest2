package com.yandex.mobile.drive.sdk.full;

import defpackage.jl40;
import defpackage.ysq0;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/GreenArea;", "", "Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", "center", "", "area", "<init>", "(Lcom/yandex/mobile/drive/sdk/full/GeoPoint;[Lcom/yandex/mobile/drive/sdk/full/GeoPoint;)V", "Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", "getCenter", "()Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", "[Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", "getArea", "()[Lcom/yandex/mobile/drive/sdk/full/GeoPoint;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GreenArea {

    @ysq0("area")
    private final GeoPoint[] area;

    @ysq0("center")
    private final GeoPoint center;

    public GreenArea(GeoPoint geoPoint, GeoPoint[] geoPointArr) {
        this.center = geoPoint;
        this.area = geoPointArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!GreenArea.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        GreenArea greenArea = (GreenArea) obj;
        if (jl40.l(this.center, greenArea.center)) {
            return Arrays.equals(this.area, greenArea.area);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.area) + (this.center.hashCode() * 31);
    }

    public final String toString() {
        return "GreenArea(center=" + this.center + ", area=" + Arrays.toString(this.area) + Extension.C_BRAKE;
    }
}
