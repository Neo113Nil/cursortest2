package com.yandex.go.pickup_from_photo.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PhotoPickUpSource", "", "Lcom/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$PhotoPickUpSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Zerosuggest", "FoundModal", "ErrorModal", "Clarify", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoPickUpAnalytics$PhotoPickUpSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoPickUpAnalytics$PhotoPickUpSource[] $VALUES;
    public static final PhotoPickUpAnalytics$PhotoPickUpSource Clarify;
    public static final PhotoPickUpAnalytics$PhotoPickUpSource ErrorModal;
    public static final PhotoPickUpAnalytics$PhotoPickUpSource FoundModal;
    public static final PhotoPickUpAnalytics$PhotoPickUpSource Zerosuggest;
    private final String eventValue;

    static {
        PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource = new PhotoPickUpAnalytics$PhotoPickUpSource("Zerosuggest", 0, "zerosuggest");
        Zerosuggest = photoPickUpAnalytics$PhotoPickUpSource;
        PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource2 = new PhotoPickUpAnalytics$PhotoPickUpSource("FoundModal", 1, "found_modal");
        FoundModal = photoPickUpAnalytics$PhotoPickUpSource2;
        PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource3 = new PhotoPickUpAnalytics$PhotoPickUpSource("ErrorModal", 2, "error_modal");
        ErrorModal = photoPickUpAnalytics$PhotoPickUpSource3;
        PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource4 = new PhotoPickUpAnalytics$PhotoPickUpSource("Clarify", 3, "clarify");
        Clarify = photoPickUpAnalytics$PhotoPickUpSource4;
        PhotoPickUpAnalytics$PhotoPickUpSource[] photoPickUpAnalytics$PhotoPickUpSourceArr = {photoPickUpAnalytics$PhotoPickUpSource, photoPickUpAnalytics$PhotoPickUpSource2, photoPickUpAnalytics$PhotoPickUpSource3, photoPickUpAnalytics$PhotoPickUpSource4};
        $VALUES = photoPickUpAnalytics$PhotoPickUpSourceArr;
        $ENTRIES = a.a(photoPickUpAnalytics$PhotoPickUpSourceArr);
    }

    public PhotoPickUpAnalytics$PhotoPickUpSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PhotoPickUpAnalytics$PhotoPickUpSource valueOf(String str) {
        return (PhotoPickUpAnalytics$PhotoPickUpSource) Enum.valueOf(PhotoPickUpAnalytics$PhotoPickUpSource.class, str);
    }

    public static PhotoPickUpAnalytics$PhotoPickUpSource[] values() {
        return (PhotoPickUpAnalytics$PhotoPickUpSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
