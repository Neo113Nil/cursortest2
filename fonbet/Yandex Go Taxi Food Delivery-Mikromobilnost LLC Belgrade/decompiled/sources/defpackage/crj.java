package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.domain.entities.button.DiscountsButtonAction;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsActionUrl;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class crj {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DiscountsButtonAction.values().length];
        try {
            iArr[DiscountsButtonAction.ADD_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscountsButtonAction.SELECT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DiscountsButtonAction.GO_TO_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[DiscountsPromoCodeDetailsActionUrl.values().length];
        try {
            iArr2[DiscountsPromoCodeDetailsActionUrl.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DiscountsPromoCodeDetailsActionUrl.SCOOTERS_USE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
