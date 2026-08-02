package com.yandex.mapkit.styling.transportnavigation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;", "", "dayIconId", "", "nightIconId", "byConnectorToLevelLabelId", "getOffLabelId", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;)V", "getDayIconId", "()I", "getNightIconId", "getByConnectorToLevelLabelId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGetOffLabelId", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final class ImageResources {
    private final Integer byConnectorToLevelLabelId;
    private final int dayIconId;
    private final Integer getOffLabelId;
    private final int nightIconId;

    public ImageResources(int i, int i2, Integer num, Integer num2) {
        this.dayIconId = i;
        this.nightIconId = i2;
        this.byConnectorToLevelLabelId = num;
        this.getOffLabelId = num2;
    }

    public final Integer getByConnectorToLevelLabelId() {
        return this.byConnectorToLevelLabelId;
    }

    public final int getDayIconId() {
        return this.dayIconId;
    }

    public final Integer getGetOffLabelId() {
        return this.getOffLabelId;
    }

    public final int getNightIconId() {
        return this.nightIconId;
    }
}
