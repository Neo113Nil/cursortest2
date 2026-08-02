package com.yandex.go.pickup_from_photo.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PhotoPickUpButtonName", "", "Lcom/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PhotoPickUpButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Camera", "Flash", "Back", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoPickUpAnalytics$PhotoPickUpButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoPickUpAnalytics$PhotoPickUpButtonName[] $VALUES;
    public static final PhotoPickUpAnalytics$PhotoPickUpButtonName Back;
    public static final PhotoPickUpAnalytics$PhotoPickUpButtonName Camera;
    public static final PhotoPickUpAnalytics$PhotoPickUpButtonName Flash;
    private final String eventValue;

    static {
        PhotoPickUpAnalytics$PhotoPickUpButtonName photoPickUpAnalytics$PhotoPickUpButtonName = new PhotoPickUpAnalytics$PhotoPickUpButtonName("Camera", 0, "camera");
        Camera = photoPickUpAnalytics$PhotoPickUpButtonName;
        PhotoPickUpAnalytics$PhotoPickUpButtonName photoPickUpAnalytics$PhotoPickUpButtonName2 = new PhotoPickUpAnalytics$PhotoPickUpButtonName("Flash", 1, "flash");
        Flash = photoPickUpAnalytics$PhotoPickUpButtonName2;
        PhotoPickUpAnalytics$PhotoPickUpButtonName photoPickUpAnalytics$PhotoPickUpButtonName3 = new PhotoPickUpAnalytics$PhotoPickUpButtonName("Back", 2, "back");
        Back = photoPickUpAnalytics$PhotoPickUpButtonName3;
        PhotoPickUpAnalytics$PhotoPickUpButtonName[] photoPickUpAnalytics$PhotoPickUpButtonNameArr = {photoPickUpAnalytics$PhotoPickUpButtonName, photoPickUpAnalytics$PhotoPickUpButtonName2, photoPickUpAnalytics$PhotoPickUpButtonName3};
        $VALUES = photoPickUpAnalytics$PhotoPickUpButtonNameArr;
        $ENTRIES = a.a(photoPickUpAnalytics$PhotoPickUpButtonNameArr);
    }

    public PhotoPickUpAnalytics$PhotoPickUpButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PhotoPickUpAnalytics$PhotoPickUpButtonName valueOf(String str) {
        return (PhotoPickUpAnalytics$PhotoPickUpButtonName) Enum.valueOf(PhotoPickUpAnalytics$PhotoPickUpButtonName.class, str);
    }

    public static PhotoPickUpAnalytics$PhotoPickUpButtonName[] values() {
        return (PhotoPickUpAnalytics$PhotoPickUpButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
