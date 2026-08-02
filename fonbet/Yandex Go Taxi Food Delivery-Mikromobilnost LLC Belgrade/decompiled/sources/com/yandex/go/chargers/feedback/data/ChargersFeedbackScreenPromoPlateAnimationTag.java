package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.uz9;
import defpackage.wu9;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/feedback/data/ChargersFeedbackScreenPromoPlateAnimationTag;", "", "Companion", "uz9", "DISCOUNT_PROGRESS_ACHIEVED", "TASK_PROGRESS_ACHIEVED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFeedbackScreenPromoPlateAnimationTag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersFeedbackScreenPromoPlateAnimationTag[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final uz9 Companion;
    public static final ChargersFeedbackScreenPromoPlateAnimationTag DISCOUNT_PROGRESS_ACHIEVED;
    public static final ChargersFeedbackScreenPromoPlateAnimationTag TASK_PROGRESS_ACHIEVED;

    static {
        ChargersFeedbackScreenPromoPlateAnimationTag chargersFeedbackScreenPromoPlateAnimationTag = new ChargersFeedbackScreenPromoPlateAnimationTag("DISCOUNT_PROGRESS_ACHIEVED", 0);
        DISCOUNT_PROGRESS_ACHIEVED = chargersFeedbackScreenPromoPlateAnimationTag;
        ChargersFeedbackScreenPromoPlateAnimationTag chargersFeedbackScreenPromoPlateAnimationTag2 = new ChargersFeedbackScreenPromoPlateAnimationTag("TASK_PROGRESS_ACHIEVED", 1);
        TASK_PROGRESS_ACHIEVED = chargersFeedbackScreenPromoPlateAnimationTag2;
        ChargersFeedbackScreenPromoPlateAnimationTag[] chargersFeedbackScreenPromoPlateAnimationTagArr = {chargersFeedbackScreenPromoPlateAnimationTag, chargersFeedbackScreenPromoPlateAnimationTag2};
        $VALUES = chargersFeedbackScreenPromoPlateAnimationTagArr;
        $ENTRIES = kotlin.enums.a.a(chargersFeedbackScreenPromoPlateAnimationTagArr);
        Companion = new uz9();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(17));
    }

    public static ChargersFeedbackScreenPromoPlateAnimationTag valueOf(String str) {
        return (ChargersFeedbackScreenPromoPlateAnimationTag) Enum.valueOf(ChargersFeedbackScreenPromoPlateAnimationTag.class, str);
    }

    public static ChargersFeedbackScreenPromoPlateAnimationTag[] values() {
        return (ChargersFeedbackScreenPromoPlateAnimationTag[]) $VALUES.clone();
    }
}
