package defpackage;

import ru.yandex.taxi.requirements.models.domain.PreorderBubbleAvailability;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class gnj0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[RequirementBubbleDto.RequirementBubbleActionDto.values().length];
        try {
            iArr[RequirementBubbleDto.RequirementBubbleActionDto.SHOW_INTERCITY_CONTACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequirementBubbleDto.RequirementBubbleActionDto.SHOW_SCHEDULE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequirementBubbleDto.RequirementBubbleActionDto.SHOW_COMPOUND_SELECT_OPTIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequirementBubbleDto.RequirementBubbleActionDto.CHANGE_COUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RequirementBubbleDto.RequirementBubbleActionDto.DEFAULT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[PreorderBubbleAvailability.values().length];
        try {
            iArr2[PreorderBubbleAvailability.UNAVAILABLE_IN_TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PreorderBubbleAvailability.UNAVAILABLE_SELECTED_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
