package defpackage;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeChartView;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;

/* loaded from: classes3.dex */
public final class p561 implements zo31 {
    public final FundIncomeWidgetView a;
    public final FundIncomeChartView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;
    public final SpoilerTextView f;
    public final AppCompatImageView g;
    public final LinearLayout h;
    public final HorizontalScrollView i;
    public final AppCompatTextView j;

    public p561(FundIncomeWidgetView fundIncomeWidgetView, FundIncomeChartView fundIncomeChartView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, SpoilerTextView spoilerTextView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, HorizontalScrollView horizontalScrollView, AppCompatTextView appCompatTextView4) {
        this.a = fundIncomeWidgetView;
        this.b = fundIncomeChartView;
        this.c = appCompatTextView;
        this.d = appCompatTextView2;
        this.e = appCompatTextView3;
        this.f = spoilerTextView;
        this.g = appCompatImageView;
        this.h = linearLayout;
        this.i = horizontalScrollView;
        this.j = appCompatTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
