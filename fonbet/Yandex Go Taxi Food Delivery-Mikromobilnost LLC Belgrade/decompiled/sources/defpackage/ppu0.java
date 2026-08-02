package defpackage;

import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ppu0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PromotionBackground.Type.values().length];
        try {
            iArr[PromotionBackground.Type.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PromotionBackground.Type.ANIMATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PromotionBackground.Type.IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[StoryWidgets.ActionType.values().length];
        try {
            iArr2[StoryWidgets.ActionType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[StoryWidgets.ActionType.WEB_VIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[StoryWidgets.ActionType.SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[StoryWidgets.ActionType.SCREEN_SHARE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[StoryWidgets.ActionType.MOVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[StoryWidgets.ActionType.CLIPBOARD_COPY.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[StoryWidgets.ActionType.SAVE_BENEFIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
