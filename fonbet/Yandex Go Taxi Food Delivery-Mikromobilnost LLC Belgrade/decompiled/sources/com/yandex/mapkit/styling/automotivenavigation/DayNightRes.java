package com.yandex.mapkit.styling.automotivenavigation;

import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", "", "dayId", "", "nightId", "<init>", "(II)V", "getDayId", "()I", "getNightId", "get", "isNightMode", "", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DayNightRes {
    private final int dayId;
    private final int nightId;

    public DayNightRes(int i, int i2) {
        this.dayId = i;
        this.nightId = i2;
    }

    public static /* synthetic */ DayNightRes copy$default(DayNightRes dayNightRes, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dayNightRes.dayId;
        }
        if ((i3 & 2) != 0) {
            i2 = dayNightRes.nightId;
        }
        return dayNightRes.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDayId() {
        return this.dayId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNightId() {
        return this.nightId;
    }

    public final DayNightRes copy(int dayId, int nightId) {
        return new DayNightRes(dayId, nightId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayNightRes)) {
            return false;
        }
        DayNightRes dayNightRes = (DayNightRes) other;
        return this.dayId == dayNightRes.dayId && this.nightId == dayNightRes.nightId;
    }

    public final int get(boolean isNightMode) {
        return isNightMode ? this.nightId : this.dayId;
    }

    public final int getDayId() {
        return this.dayId;
    }

    public final int getNightId() {
        return this.nightId;
    }

    public int hashCode() {
        return Integer.hashCode(this.nightId) + (Integer.hashCode(this.dayId) * 31);
    }

    public String toString() {
        return b64.d(this.dayId, this.nightId, "DayNightRes(dayId=", ", nightId=", Extension.C_BRAKE);
    }
}
