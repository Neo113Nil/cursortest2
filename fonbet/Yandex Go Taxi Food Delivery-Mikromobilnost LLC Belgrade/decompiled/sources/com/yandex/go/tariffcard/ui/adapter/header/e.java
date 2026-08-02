package com.yandex.go.tariffcard.ui.adapter.header;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.iix0;
import defpackage.yhx0;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes14.dex */
public final class e {
    public final iix0 a;
    public final yhx0 b;

    public e(iix0 iix0Var, yhx0 yhx0Var) {
        this.a = iix0Var;
        this.b = yhx0Var;
    }

    public final d a(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView3, PlaceholderView placeholderView, ShimmeringRobotoTextView shimmeringRobotoTextView, PlaceholderView placeholderView2, ShimmeringRobotoTextView shimmeringRobotoTextView2, PlaceholderView placeholderView3, ShimmeringRobotoTextView shimmeringRobotoTextView3, View view) {
        return new d(linearLayout, robotoTextView, robotoTextView2, appCompatImageView, robotoTextView3, placeholderView, shimmeringRobotoTextView, placeholderView2, shimmeringRobotoTextView2, placeholderView3, shimmeringRobotoTextView3, this.b, view, new HeaderViewHolderDelegateFactory$create$1(0, this.a, iix0.class, "priceClicked", "priceClicked()V", 0), new HeaderViewHolderDelegateFactory$create$2(0, this.a, iix0.class, "priceDetailsClicked", "priceDetailsClicked()V", 0), new HeaderViewHolderDelegateFactory$create$3(0, this.a, iix0.class, "tariffInfoClicked", "tariffInfoClicked()V", 0), new HeaderViewHolderDelegateFactory$create$4(0, this.a, iix0.class, "addressesClicked", "addressesClicked()V", 0));
    }
}
