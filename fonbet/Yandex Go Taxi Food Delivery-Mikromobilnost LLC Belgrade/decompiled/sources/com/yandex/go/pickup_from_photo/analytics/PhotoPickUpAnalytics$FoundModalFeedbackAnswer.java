package com.yandex.go.pickup_from_photo.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$FoundModalFeedbackAnswer", "", "Lcom/yandex/go/pickup_from_photo/analytics/PhotoPickUpAnalytics$FoundModalFeedbackAnswer;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Yes", "No", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoPickUpAnalytics$FoundModalFeedbackAnswer {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoPickUpAnalytics$FoundModalFeedbackAnswer[] $VALUES;
    public static final PhotoPickUpAnalytics$FoundModalFeedbackAnswer No;
    public static final PhotoPickUpAnalytics$FoundModalFeedbackAnswer Yes;
    private final String eventValue;

    static {
        PhotoPickUpAnalytics$FoundModalFeedbackAnswer photoPickUpAnalytics$FoundModalFeedbackAnswer = new PhotoPickUpAnalytics$FoundModalFeedbackAnswer("Yes", 0, "yes");
        Yes = photoPickUpAnalytics$FoundModalFeedbackAnswer;
        PhotoPickUpAnalytics$FoundModalFeedbackAnswer photoPickUpAnalytics$FoundModalFeedbackAnswer2 = new PhotoPickUpAnalytics$FoundModalFeedbackAnswer("No", 1, "no");
        No = photoPickUpAnalytics$FoundModalFeedbackAnswer2;
        PhotoPickUpAnalytics$FoundModalFeedbackAnswer[] photoPickUpAnalytics$FoundModalFeedbackAnswerArr = {photoPickUpAnalytics$FoundModalFeedbackAnswer, photoPickUpAnalytics$FoundModalFeedbackAnswer2};
        $VALUES = photoPickUpAnalytics$FoundModalFeedbackAnswerArr;
        $ENTRIES = a.a(photoPickUpAnalytics$FoundModalFeedbackAnswerArr);
    }

    public PhotoPickUpAnalytics$FoundModalFeedbackAnswer(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PhotoPickUpAnalytics$FoundModalFeedbackAnswer valueOf(String str) {
        return (PhotoPickUpAnalytics$FoundModalFeedbackAnswer) Enum.valueOf(PhotoPickUpAnalytics$FoundModalFeedbackAnswer.class, str);
    }

    public static PhotoPickUpAnalytics$FoundModalFeedbackAnswer[] values() {
        return (PhotoPickUpAnalytics$FoundModalFeedbackAnswer[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
