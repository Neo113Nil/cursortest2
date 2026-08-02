package com.yandex.go.pickup_from_photo.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PhotoPickUpCloseReason", "", "Lcom/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PhotoPickUpCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "PointFound", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoPickUpAnalytics$PhotoPickUpCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoPickUpAnalytics$PhotoPickUpCloseReason[] $VALUES;
    public static final PhotoPickUpAnalytics$PhotoPickUpCloseReason Back;
    public static final PhotoPickUpAnalytics$PhotoPickUpCloseReason PointFound;
    private final String eventValue;

    static {
        PhotoPickUpAnalytics$PhotoPickUpCloseReason photoPickUpAnalytics$PhotoPickUpCloseReason = new PhotoPickUpAnalytics$PhotoPickUpCloseReason("Back", 0, "back");
        Back = photoPickUpAnalytics$PhotoPickUpCloseReason;
        PhotoPickUpAnalytics$PhotoPickUpCloseReason photoPickUpAnalytics$PhotoPickUpCloseReason2 = new PhotoPickUpAnalytics$PhotoPickUpCloseReason("PointFound", 1, "point_found");
        PointFound = photoPickUpAnalytics$PhotoPickUpCloseReason2;
        PhotoPickUpAnalytics$PhotoPickUpCloseReason[] photoPickUpAnalytics$PhotoPickUpCloseReasonArr = {photoPickUpAnalytics$PhotoPickUpCloseReason, photoPickUpAnalytics$PhotoPickUpCloseReason2};
        $VALUES = photoPickUpAnalytics$PhotoPickUpCloseReasonArr;
        $ENTRIES = a.a(photoPickUpAnalytics$PhotoPickUpCloseReasonArr);
    }

    public PhotoPickUpAnalytics$PhotoPickUpCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PhotoPickUpAnalytics$PhotoPickUpCloseReason valueOf(String str) {
        return (PhotoPickUpAnalytics$PhotoPickUpCloseReason) Enum.valueOf(PhotoPickUpAnalytics$PhotoPickUpCloseReason.class, str);
    }

    public static PhotoPickUpAnalytics$PhotoPickUpCloseReason[] values() {
        return (PhotoPickUpAnalytics$PhotoPickUpCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
