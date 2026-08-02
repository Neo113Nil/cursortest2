package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class dnv0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SummaryPromotionsParam.Type.values().length];
        try {
            iArr[SummaryPromotionsParam.Type.MAAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryPromotionsParam.Type.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[Alternatives.OptionTypeLegacy.values().length];
        try {
            iArr2[Alternatives.OptionTypeLegacy.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.MULTICLASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.ALTPIN_B.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.ANTISURGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.PLUS_PROMO.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.COMBO_INNER.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.MULTIMODAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.REQUIREMENT_OPTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.COMBO_OUTER.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[Alternatives.OptionTypeLegacy.PERFECT_CHAIN.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
