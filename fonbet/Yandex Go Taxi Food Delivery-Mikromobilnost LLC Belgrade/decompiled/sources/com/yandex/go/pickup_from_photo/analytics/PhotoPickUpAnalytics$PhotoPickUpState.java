package com.yandex.go.pickup_from_photo.analytics;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PhotoPickUpState", "", "Lcom/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PhotoPickUpState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FirstPhoto", "SecondPhoto", "ThirdPhoto", "Loading", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoPickUpAnalytics$PhotoPickUpState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoPickUpAnalytics$PhotoPickUpState[] $VALUES;
    public static final PhotoPickUpAnalytics$PhotoPickUpState FirstPhoto;
    public static final PhotoPickUpAnalytics$PhotoPickUpState Loading;
    public static final PhotoPickUpAnalytics$PhotoPickUpState SecondPhoto;
    public static final PhotoPickUpAnalytics$PhotoPickUpState ThirdPhoto;
    private final String eventValue;

    static {
        PhotoPickUpAnalytics$PhotoPickUpState photoPickUpAnalytics$PhotoPickUpState = new PhotoPickUpAnalytics$PhotoPickUpState("FirstPhoto", 0, "first_photo");
        FirstPhoto = photoPickUpAnalytics$PhotoPickUpState;
        PhotoPickUpAnalytics$PhotoPickUpState photoPickUpAnalytics$PhotoPickUpState2 = new PhotoPickUpAnalytics$PhotoPickUpState("SecondPhoto", 1, "second_photo");
        SecondPhoto = photoPickUpAnalytics$PhotoPickUpState2;
        PhotoPickUpAnalytics$PhotoPickUpState photoPickUpAnalytics$PhotoPickUpState3 = new PhotoPickUpAnalytics$PhotoPickUpState("ThirdPhoto", 2, "third_photo");
        ThirdPhoto = photoPickUpAnalytics$PhotoPickUpState3;
        PhotoPickUpAnalytics$PhotoPickUpState photoPickUpAnalytics$PhotoPickUpState4 = new PhotoPickUpAnalytics$PhotoPickUpState("Loading", 3, ResultType.RESULT_TYPE_LOADING);
        Loading = photoPickUpAnalytics$PhotoPickUpState4;
        PhotoPickUpAnalytics$PhotoPickUpState[] photoPickUpAnalytics$PhotoPickUpStateArr = {photoPickUpAnalytics$PhotoPickUpState, photoPickUpAnalytics$PhotoPickUpState2, photoPickUpAnalytics$PhotoPickUpState3, photoPickUpAnalytics$PhotoPickUpState4};
        $VALUES = photoPickUpAnalytics$PhotoPickUpStateArr;
        $ENTRIES = a.a(photoPickUpAnalytics$PhotoPickUpStateArr);
    }

    public PhotoPickUpAnalytics$PhotoPickUpState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PhotoPickUpAnalytics$PhotoPickUpState valueOf(String str) {
        return (PhotoPickUpAnalytics$PhotoPickUpState) Enum.valueOf(PhotoPickUpAnalytics$PhotoPickUpState.class, str);
    }

    public static PhotoPickUpAnalytics$PhotoPickUpState[] values() {
        return (PhotoPickUpAnalytics$PhotoPickUpState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
