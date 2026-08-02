package com.yandex.go.zone.dto.objects;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.thp;
import defpackage.trq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/zone/dto/objects/FeedbackBadgeChoice$FeedbackBadgeType", "", "Lcom/yandex/go/zone/dto/objects/FeedbackBadgeChoice$FeedbackBadgeType;", "Companion", "trq", BaseDatabaseHelper.TYPE_TEXT, "ACHIEVEMENT_ICON", "TAG", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeedbackBadgeChoice$FeedbackBadgeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedbackBadgeChoice$FeedbackBadgeType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final FeedbackBadgeChoice$FeedbackBadgeType ACHIEVEMENT_ICON;
    public static final trq Companion;
    public static final FeedbackBadgeChoice$FeedbackBadgeType TAG;
    public static final FeedbackBadgeChoice$FeedbackBadgeType TEXT;

    static {
        FeedbackBadgeChoice$FeedbackBadgeType feedbackBadgeChoice$FeedbackBadgeType = new FeedbackBadgeChoice$FeedbackBadgeType(BaseDatabaseHelper.TYPE_TEXT, 0);
        TEXT = feedbackBadgeChoice$FeedbackBadgeType;
        FeedbackBadgeChoice$FeedbackBadgeType feedbackBadgeChoice$FeedbackBadgeType2 = new FeedbackBadgeChoice$FeedbackBadgeType("ACHIEVEMENT_ICON", 1);
        ACHIEVEMENT_ICON = feedbackBadgeChoice$FeedbackBadgeType2;
        FeedbackBadgeChoice$FeedbackBadgeType feedbackBadgeChoice$FeedbackBadgeType3 = new FeedbackBadgeChoice$FeedbackBadgeType("TAG", 2);
        TAG = feedbackBadgeChoice$FeedbackBadgeType3;
        FeedbackBadgeChoice$FeedbackBadgeType[] feedbackBadgeChoice$FeedbackBadgeTypeArr = {feedbackBadgeChoice$FeedbackBadgeType, feedbackBadgeChoice$FeedbackBadgeType2, feedbackBadgeChoice$FeedbackBadgeType3};
        $VALUES = feedbackBadgeChoice$FeedbackBadgeTypeArr;
        $ENTRIES = kotlin.enums.a.a(feedbackBadgeChoice$FeedbackBadgeTypeArr);
        Companion = new trq();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new thp(24));
    }

    public static FeedbackBadgeChoice$FeedbackBadgeType valueOf(String str) {
        return (FeedbackBadgeChoice$FeedbackBadgeType) Enum.valueOf(FeedbackBadgeChoice$FeedbackBadgeType.class, str);
    }

    public static FeedbackBadgeChoice$FeedbackBadgeType[] values() {
        return (FeedbackBadgeChoice$FeedbackBadgeType[]) $VALUES.clone();
    }
}
