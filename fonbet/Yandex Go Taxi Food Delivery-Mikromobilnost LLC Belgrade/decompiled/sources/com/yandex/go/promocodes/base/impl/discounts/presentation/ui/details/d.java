package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import android.text.SpannableStringBuilder;
import defpackage.jmf0;
import defpackage.lrj;
import defpackage.wlf0;

/* loaded from: classes13.dex */
public final class d {
    public static final DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus a(wlf0 wlf0Var) {
        int i = lrj.a[wlf0Var.g.ordinal()];
        if (i == 1) {
            return DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.INVALID;
        }
        if (i != 2) {
            return DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.VALID;
        }
        jmf0 jmf0Var = wlf0Var.h;
        return (jmf0Var == null || !jmf0Var.c) ? DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.RESTRICTED : DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus.NEED_CARD;
    }

    public static final CharSequence b(CharSequence charSequence, Object... objArr) {
        if (objArr.length != 0) {
            for (Object obj : objArr) {
                if (obj != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    for (Object obj2 : objArr) {
                        if (obj2 != null) {
                            spannableStringBuilder.setSpan(obj2, 0, spannableStringBuilder.length(), 17);
                        }
                    }
                    return spannableStringBuilder;
                }
            }
        }
        return charSequence;
    }
}
