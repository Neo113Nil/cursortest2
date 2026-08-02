package com.yandex.go.pickup_from_photo.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PickUpError", "", "Lcom/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PickUpError;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UploadHandleError", "FetchingHandleError", "FetchingStatusFailed", "FetchingTimeout", "FetchingEmptyResult", "SuggestHandleError", "Unknown", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PhotoPickUpAnalytics$PickUpError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoPickUpAnalytics$PickUpError[] $VALUES;
    public static final PhotoPickUpAnalytics$PickUpError FetchingEmptyResult;
    public static final PhotoPickUpAnalytics$PickUpError FetchingHandleError;
    public static final PhotoPickUpAnalytics$PickUpError FetchingStatusFailed;
    public static final PhotoPickUpAnalytics$PickUpError FetchingTimeout;
    public static final PhotoPickUpAnalytics$PickUpError SuggestHandleError;
    public static final PhotoPickUpAnalytics$PickUpError Unknown;
    public static final PhotoPickUpAnalytics$PickUpError UploadHandleError;
    private final String eventValue;

    static {
        PhotoPickUpAnalytics$PickUpError photoPickUpAnalytics$PickUpError = new PhotoPickUpAnalytics$PickUpError("UploadHandleError", 0, "upload_handle_error");
        UploadHandleError = photoPickUpAnalytics$PickUpError;
        PhotoPickUpAnalytics$PickUpError photoPickUpAnalytics$PickUpError2 = new PhotoPickUpAnalytics$PickUpError("FetchingHandleError", 1, "fetching_handle_error");
        FetchingHandleError = photoPickUpAnalytics$PickUpError2;
        PhotoPickUpAnalytics$PickUpError photoPickUpAnalytics$PickUpError3 = new PhotoPickUpAnalytics$PickUpError("FetchingStatusFailed", 2, "fetching_status_failed");
        FetchingStatusFailed = photoPickUpAnalytics$PickUpError3;
        PhotoPickUpAnalytics$PickUpError photoPickUpAnalytics$PickUpError4 = new PhotoPickUpAnalytics$PickUpError("FetchingTimeout", 3, "fetching_timeout");
        FetchingTimeout = photoPickUpAnalytics$PickUpError4;
        PhotoPickUpAnalytics$PickUpError photoPickUpAnalytics$PickUpError5 = new PhotoPickUpAnalytics$PickUpError("FetchingEmptyResult", 4, "fetching_empty_result");
        FetchingEmptyResult = photoPickUpAnalytics$PickUpError5;
        PhotoPickUpAnalytics$PickUpError photoPickUpAnalytics$PickUpError6 = new PhotoPickUpAnalytics$PickUpError("SuggestHandleError", 5, "suggest_handle_error");
        SuggestHandleError = photoPickUpAnalytics$PickUpError6;
        PhotoPickUpAnalytics$PickUpError photoPickUpAnalytics$PickUpError7 = new PhotoPickUpAnalytics$PickUpError("Unknown", 6, "unknown");
        Unknown = photoPickUpAnalytics$PickUpError7;
        PhotoPickUpAnalytics$PickUpError[] photoPickUpAnalytics$PickUpErrorArr = {photoPickUpAnalytics$PickUpError, photoPickUpAnalytics$PickUpError2, photoPickUpAnalytics$PickUpError3, photoPickUpAnalytics$PickUpError4, photoPickUpAnalytics$PickUpError5, photoPickUpAnalytics$PickUpError6, photoPickUpAnalytics$PickUpError7};
        $VALUES = photoPickUpAnalytics$PickUpErrorArr;
        $ENTRIES = a.a(photoPickUpAnalytics$PickUpErrorArr);
    }

    public PhotoPickUpAnalytics$PickUpError(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PhotoPickUpAnalytics$PickUpError valueOf(String str) {
        return (PhotoPickUpAnalytics$PickUpError) Enum.valueOf(PhotoPickUpAnalytics$PickUpError.class, str);
    }

    public static PhotoPickUpAnalytics$PickUpError[] values() {
        return (PhotoPickUpAnalytics$PickUpError[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
