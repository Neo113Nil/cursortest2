package defpackage;

import ru.yandex.taxi.design.ChipsState;
import ru.yandex.taxi.requirements.models.domain.RequirementBubbleAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class mej0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ChipsState.values().length];
        try {
            iArr[ChipsState.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChipsState.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[RequirementBubbleAction.values().length];
        try {
            iArr2[RequirementBubbleAction.REMOVE_ALT_CHOICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[RequirementBubbleAction.CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[RequirementBubbleAction.PREORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[RequirementBubbleAction.INTERCITY_CONTACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[RequirementBubbleAction.COMPOUND_OPTIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[RequirementBubbleAction.COUNTER_PLUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[RequirementBubbleAction.COUNTER_MINUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
