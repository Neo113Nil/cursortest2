package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.widget.TextView;
import com.yandex.messaging.extension.view.IconDirection;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import java.util.Locale;
import kotlin.Result;

/* loaded from: classes15.dex */
public abstract class bob1 {
    public static final boolean a(TextView textView, CharSequence charSequence) {
        int K;
        boolean isRtl;
        Locale locale = textView.getContext().getResources().getConfiguration().getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        boolean z = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        if (charSequence.length() != 0 && (K = evu0.K(charSequence, '\n', 0, 6) + 1) < charSequence.length()) {
            TextDirectionHeuristic textDirectionHeuristic = textView.getTextDirectionHeuristic();
            if (textDirectionHeuristic == null) {
                textDirectionHeuristic = textView.getLayoutDirection() == 1 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            isRtl = textDirectionHeuristic.isRtl(charSequence, K, charSequence.length() - K);
        } else {
            isRtl = false;
        }
        return z == isRtl;
    }

    public static final Integer b(String str) {
        Object failure;
        int parseColor;
        try {
            if (str.length() == 9) {
                parseColor = Color.parseColor(str.charAt(0) + str.substring(7, 9) + str.substring(1, 7));
            } else {
                parseColor = Color.parseColor(str);
            }
            failure = Integer.valueOf(parseColor);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Integer) failure;
    }

    public static void c(TextView textView, int i, int i2, int i3) {
        Drawable mutate;
        Integer num = (i3 & 4) != 0 ? null : 3;
        IconDirection iconDirection = IconDirection.End;
        Context context = textView.getContext();
        int color = context.getColor(i2);
        Drawable f = y3b1.f(context, i, color);
        if (f == null || (mutate = f.mutate()) == null) {
            return;
        }
        mutate.setTint(color);
        int b = m810.b(textView.getTextSize() * 1.2f);
        if (b < 1) {
            b = 1;
        }
        mutate.setBounds(0, 0, b, b);
        int i4 = zty0.a[iconDirection.ordinal()];
        if (i4 == 1) {
            e(textView, mutate, false);
        } else {
            if (i4 != 2) {
                w511.b();
                return;
            }
            d(textView, mutate, false);
        }
        if (num != null) {
            textView.setCompoundDrawablePadding(num.intValue());
        }
    }

    public static final void d(TextView textView, Drawable drawable, boolean z) {
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], drawable, textView.getCompoundDrawablesRelative()[3]);
        } else {
            textView.setCompoundDrawablesRelative(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], drawable, textView.getCompoundDrawablesRelative()[3]);
        }
    }

    public static final void e(TextView textView, Drawable drawable, boolean z) {
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
        } else {
            textView.setCompoundDrawablesRelative(drawable, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
        }
    }

    public static final Money f(MoneyEntity moneyEntity) {
        return new Money(moneyEntity.getAmount(), moneyEntity.getCurrency());
    }

    public static final MoneyEntity g(Money money, w530 w530Var) {
        return new MoneyEntity(money.getAmount(), money.getCurrency(), w530.a(w530Var, money.getAmount(), money.getCurrency(), false, null, false, 60));
    }
}
