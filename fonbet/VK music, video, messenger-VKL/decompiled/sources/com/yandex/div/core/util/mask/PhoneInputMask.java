package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.TextDiff;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: PhoneInputMask.kt */
/* loaded from: classes7.dex */
public final class PhoneInputMask extends BaseInputMask {
    private final izs<Exception, s3q0> onError;

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneInputMask(izs<? super Exception, s3q0> izsVar) {
        super(PhoneInputMaskKt.getDEFAULT_MASK_DATA());
        this.onError = izsVar;
    }

    private final void calculateCursorPositionBy(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < getDestructedValue().size() && i3 < i) {
            int i4 = i2 + 1;
            if (getDestructedValue().get(i2) instanceof BaseInputMask.MaskChar.Dynamic) {
                i3++;
            }
            i2 = i4;
        }
        setCursorPosition(firstHolderAfter(i2));
    }

    private final String newMaskPatternFor(String str) {
        String phoneMaskPattern = PhoneInputMaskKt.getPhoneMaskPattern(str);
        if (epx.f(phoneMaskPattern, getMaskData().getPattern())) {
            return null;
        }
        return phoneMaskPattern;
    }

    private final s3q0 tryInvalidateMaskDataWith(String str) {
        String newMaskPatternFor = newMaskPatternFor(str);
        if (newMaskPatternFor == null) {
            return null;
        }
        updateMaskDataWith(newMaskPatternFor);
        return s3q0.a;
    }

    private final void updateMaskDataWith(String str) {
        updateMaskData(new BaseInputMask.MaskData(str, PhoneInputMaskKt.getDEFAULT_DECODING_MASK_KEY(), getMaskData().getAlwaysVisible()), false);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(String str, Integer num) {
        TextDiff.Companion companion = TextDiff.Companion;
        TextDiff build = companion.build(getValue(), str);
        if (num != null) {
            int intValue = num.intValue() - build.getAdded();
            if (intValue < 0) {
                intValue = 0;
            }
            build = new TextDiff(intValue, build.getAdded(), build.getRemoved());
        }
        String rawValue = getRawValue();
        int replaceBodyTail = replaceBodyTail(build, str);
        String rawValue2 = getRawValue();
        String newMaskPatternFor = newMaskPatternFor(rawValue2);
        if (newMaskPatternFor == null) {
            calculateCursorPosition(build, replaceBodyTail);
            return;
        }
        updateMaskDataWith(newMaskPatternFor);
        BaseInputMask.replaceChars$default(this, rawValue2, 0, null, 4, null);
        TextDiff build2 = companion.build(rawValue, rawValue2);
        calculateCursorPositionBy(build2.getAdded() + build2.getStart());
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(Exception exc) {
        this.onError.invoke(exc);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(String str) {
        tryInvalidateMaskDataWith(str);
        super.overrideRawValue(str);
    }
}
