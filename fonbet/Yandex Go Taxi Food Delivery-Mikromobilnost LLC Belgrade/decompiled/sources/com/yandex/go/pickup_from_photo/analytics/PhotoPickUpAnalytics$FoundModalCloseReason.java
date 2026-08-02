package com.yandex.go.pickup_from_photo.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$FoundModalCloseReason", "", "Lcom/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$FoundModalCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Done", "Retry", "Map", "Back", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoPickUpAnalytics$FoundModalCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoPickUpAnalytics$FoundModalCloseReason[] $VALUES;
    public static final PhotoPickUpAnalytics$FoundModalCloseReason Back;
    public static final PhotoPickUpAnalytics$FoundModalCloseReason Done;
    public static final PhotoPickUpAnalytics$FoundModalCloseReason Map;
    public static final PhotoPickUpAnalytics$FoundModalCloseReason Retry;
    private final String eventValue;

    static {
        PhotoPickUpAnalytics$FoundModalCloseReason photoPickUpAnalytics$FoundModalCloseReason = new PhotoPickUpAnalytics$FoundModalCloseReason("Done", 0, "done");
        Done = photoPickUpAnalytics$FoundModalCloseReason;
        PhotoPickUpAnalytics$FoundModalCloseReason photoPickUpAnalytics$FoundModalCloseReason2 = new PhotoPickUpAnalytics$FoundModalCloseReason("Retry", 1, "retry");
        Retry = photoPickUpAnalytics$FoundModalCloseReason2;
        PhotoPickUpAnalytics$FoundModalCloseReason photoPickUpAnalytics$FoundModalCloseReason3 = new PhotoPickUpAnalytics$FoundModalCloseReason("Map", 2, PolicyMappingsExtension.MAP);
        Map = photoPickUpAnalytics$FoundModalCloseReason3;
        PhotoPickUpAnalytics$FoundModalCloseReason photoPickUpAnalytics$FoundModalCloseReason4 = new PhotoPickUpAnalytics$FoundModalCloseReason("Back", 3, "back");
        Back = photoPickUpAnalytics$FoundModalCloseReason4;
        PhotoPickUpAnalytics$FoundModalCloseReason[] photoPickUpAnalytics$FoundModalCloseReasonArr = {photoPickUpAnalytics$FoundModalCloseReason, photoPickUpAnalytics$FoundModalCloseReason2, photoPickUpAnalytics$FoundModalCloseReason3, photoPickUpAnalytics$FoundModalCloseReason4};
        $VALUES = photoPickUpAnalytics$FoundModalCloseReasonArr;
        $ENTRIES = a.a(photoPickUpAnalytics$FoundModalCloseReasonArr);
    }

    public PhotoPickUpAnalytics$FoundModalCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PhotoPickUpAnalytics$FoundModalCloseReason valueOf(String str) {
        return (PhotoPickUpAnalytics$FoundModalCloseReason) Enum.valueOf(PhotoPickUpAnalytics$FoundModalCloseReason.class, str);
    }

    public static PhotoPickUpAnalytics$FoundModalCloseReason[] values() {
        return (PhotoPickUpAnalytics$FoundModalCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
