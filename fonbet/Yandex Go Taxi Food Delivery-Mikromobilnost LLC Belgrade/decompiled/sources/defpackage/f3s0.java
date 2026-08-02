package defpackage;

import com.yandex.go.dto.response.ActionType;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class f3s0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[BaseShortcutModel$Source.values().length];
        try {
            iArr[BaseShortcutModel$Source.HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseShortcutModel$Source.TURBO_BUTTONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BaseShortcutModel$Source.ITEMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BaseShortcutModel$Source.TOP_ITEMS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BaseShortcutModel$Source.BOTTOM_ITEMS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BaseShortcutModel$Source.HORIZONTAL_STACK_ITEM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BaseShortcutModel$Source.VERTICAL_STACK_ITEM.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BaseShortcutModel$Source.LOCAL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
        int[] iArr2 = new int[ActionType.values().length];
        try {
            iArr2[ActionType.TAXI_SUMMARY_REDIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ActionType.CITY_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[OfferType.values().length];
        try {
            iArr3[OfferType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[OfferType.HEADER_SUMMARY_REDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[OfferType.ACTION_DRIVEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[OfferType.ACTION_DRIVEN_THUMB.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[OfferType.ROUND_BUTTON.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[OfferType.SQUARE_BUTTON.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[OfferType.PERSONAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[OfferType.PERSONAL_SLIDER.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[OfferType.TAXI_EXPECTED_DESTINATION.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[OfferType.LIST_ITEM.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[OfferType.MEDIA.ordinal()] = 11;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[OfferType.DRIVE.ordinal()] = 12;
        } catch (NoSuchFieldError unused22) {
        }
        c = iArr3;
    }
}
