package com.yandex.go.pickup_from_photo.data.model;

import defpackage.aib0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z4b0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/pickup_from_photo/data/model/PhotoRecognitionStatus;", "", "Companion", "aib0", "DONE", "IN_PROGRESS", "FAILED", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoRecognitionStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoRecognitionStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final aib0 Companion;
    public static final PhotoRecognitionStatus DONE;
    public static final PhotoRecognitionStatus FAILED;
    public static final PhotoRecognitionStatus IN_PROGRESS;
    public static final PhotoRecognitionStatus UNKNOWN;

    static {
        PhotoRecognitionStatus photoRecognitionStatus = new PhotoRecognitionStatus("DONE", 0);
        DONE = photoRecognitionStatus;
        PhotoRecognitionStatus photoRecognitionStatus2 = new PhotoRecognitionStatus("IN_PROGRESS", 1);
        IN_PROGRESS = photoRecognitionStatus2;
        PhotoRecognitionStatus photoRecognitionStatus3 = new PhotoRecognitionStatus("FAILED", 2);
        FAILED = photoRecognitionStatus3;
        PhotoRecognitionStatus photoRecognitionStatus4 = new PhotoRecognitionStatus("UNKNOWN", 3);
        UNKNOWN = photoRecognitionStatus4;
        PhotoRecognitionStatus[] photoRecognitionStatusArr = {photoRecognitionStatus, photoRecognitionStatus2, photoRecognitionStatus3, photoRecognitionStatus4};
        $VALUES = photoRecognitionStatusArr;
        $ENTRIES = kotlin.enums.a.a(photoRecognitionStatusArr);
        Companion = new aib0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z4b0(13));
    }

    public static PhotoRecognitionStatus valueOf(String str) {
        return (PhotoRecognitionStatus) Enum.valueOf(PhotoRecognitionStatus.class, str);
    }

    public static PhotoRecognitionStatus[] values() {
        return (PhotoRecognitionStatus[]) $VALUES.clone();
    }
}
