package com.yandex.div.core.view2;

import android.graphics.Typeface;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div2.DivFontWeight;

/* compiled from: DivTypefaceResolver.kt */
/* loaded from: classes7.dex */
public final class DivTypefaceResolverKt {

    /* compiled from: DivTypefaceResolver.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivFontWeight.values().length];
            try {
                iArr[DivFontWeight.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivFontWeight.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivFontWeight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivFontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Typeface getTypeface(int i, DivTypefaceProvider divTypefaceProvider) {
        Typeface typefaceFor = divTypefaceProvider.getTypefaceFor(i);
        return typefaceFor == null ? Typeface.DEFAULT : typefaceFor;
    }

    public static final int getTypefaceValue(DivFontWeight divFontWeight, Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i = divFontWeight == null ? -1 : WhenMappings.$EnumSwitchMapping$0[divFontWeight.ordinal()];
        if (i == 1) {
            return 300;
        }
        if (i == 2) {
            return 400;
        }
        if (i == 3) {
            return 500;
        }
        if (i != 4) {
            return 400;
        }
        return IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
    }

    public static final Typeface getTypeface(DivFontWeight divFontWeight, Integer num, DivTypefaceProvider divTypefaceProvider) {
        return getTypeface(getTypefaceValue(divFontWeight, num), divTypefaceProvider);
    }
}
