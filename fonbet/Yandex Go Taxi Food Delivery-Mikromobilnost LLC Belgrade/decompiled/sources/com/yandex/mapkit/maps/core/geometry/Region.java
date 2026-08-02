package com.yandex.mapkit.maps.core.geometry;

import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/Region;", "", "topLeft", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "topRight", "bottomLeft", "bottomRight", "<init>", "(Lcom/yandex/mapkit/maps/core/geometry/Point;Lcom/yandex/mapkit/maps/core/geometry/Point;Lcom/yandex/mapkit/maps/core/geometry/Point;Lcom/yandex/mapkit/maps/core/geometry/Point;)V", "getTopLeft", "()Lcom/yandex/mapkit/maps/core/geometry/Point;", "getTopRight", "getBottomLeft", "getBottomRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Region {
    private final Point bottomLeft;
    private final Point bottomRight;
    private final Point topLeft;
    private final Point topRight;

    public Region(Point point, Point point2, Point point3, Point point4) {
        this.topLeft = point;
        this.topRight = point2;
        this.bottomLeft = point3;
        this.bottomRight = point4;
    }

    public static /* synthetic */ Region copy$default(Region region, Point point, Point point2, Point point3, Point point4, int i, Object obj) {
        if ((i & 1) != 0) {
            point = region.topLeft;
        }
        if ((i & 2) != 0) {
            point2 = region.topRight;
        }
        if ((i & 4) != 0) {
            point3 = region.bottomLeft;
        }
        if ((i & 8) != 0) {
            point4 = region.bottomRight;
        }
        return region.copy(point, point2, point3, point4);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getTopLeft() {
        return this.topLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final Point getTopRight() {
        return this.topRight;
    }

    /* renamed from: component3, reason: from getter */
    public final Point getBottomLeft() {
        return this.bottomLeft;
    }

    /* renamed from: component4, reason: from getter */
    public final Point getBottomRight() {
        return this.bottomRight;
    }

    public final Region copy(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        return new Region(topLeft, topRight, bottomLeft, bottomRight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Region)) {
            return false;
        }
        Region region = (Region) other;
        return jl40.l(this.topLeft, region.topLeft) && jl40.l(this.topRight, region.topRight) && jl40.l(this.bottomLeft, region.bottomLeft) && jl40.l(this.bottomRight, region.bottomRight);
    }

    public final Point getBottomLeft() {
        return this.bottomLeft;
    }

    public final Point getBottomRight() {
        return this.bottomRight;
    }

    public final Point getTopLeft() {
        return this.topLeft;
    }

    public final Point getTopRight() {
        return this.topRight;
    }

    public int hashCode() {
        return this.bottomRight.hashCode() + ((this.bottomLeft.hashCode() + ((this.topRight.hashCode() + (this.topLeft.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Region(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + Extension.C_BRAKE;
    }
}
