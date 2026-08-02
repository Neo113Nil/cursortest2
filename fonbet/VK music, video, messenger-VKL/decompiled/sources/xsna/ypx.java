package xsna;

import android.content.Context;
import android.util.TypedValue;
import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InverseDonutPriceItemStyleProvider.kt */
/* loaded from: classes18.dex */
public final class ypx implements w1o {

    /* compiled from: InverseDonutPriceItemStyleProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutPriceTemplateItemStyle.values().length];
            try {
                iArr[DonutPriceTemplateItemStyle.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.w1o
    public final int a(Context context, DonutPriceTemplateItemStyle donutPriceTemplateItemStyle) {
        int i;
        TypedValue typedValue = krv0.a;
        if (epx.f(krv0.i(context), Boolean.TRUE)) {
            if (a.$EnumSwitchMapping$0[donutPriceTemplateItemStyle.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_text_tertiary;
        } else {
            if (a.$EnumSwitchMapping$0[donutPriceTemplateItemStyle.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_overlay_secondary;
        }
        return krv0.m(i, context);
    }
}
