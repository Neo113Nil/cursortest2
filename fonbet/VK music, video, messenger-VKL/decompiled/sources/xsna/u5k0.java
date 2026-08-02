package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: SmartTabHintView.kt */
/* loaded from: classes4.dex */
public final class u5k0 extends ViewGroup {
    public static final int g = cn70.b(250);
    public final LinearLayout b;
    public final TextView c;
    public final FluidHorizontalLayout d;
    public final TextView e;
    public final TextView f;

    public u5k0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.smart_tab_hint, (ViewGroup) this, true);
        this.d = (FluidHorizontalLayout) findViewById(R.id.hint_buttons_container);
        this.b = (LinearLayout) findViewById(R.id.hint_tab_bar_container);
        TextView textView = (TextView) findViewById(R.id.title);
        this.c = textView;
        TextView textView2 = (TextView) findViewById(R.id.ok_button);
        this.e = textView2;
        TextView textView3 = (TextView) findViewById(R.id.switch_button);
        this.f = textView3;
        FontFamily fontFamily = FontFamily.MEDIUM;
        Float valueOf = Float.valueOf(14.0f);
        com.vk.typography.b.k(textView, fontFamily, valueOf, 4);
        com.vk.typography.b.k(textView2, fontFamily, valueOf, 4);
        com.vk.typography.b.k(textView3, fontFamily, valueOf, 4);
    }

    public final FluidHorizontalLayout getButtonsContainer() {
        return this.d;
    }

    public final TextView getOkButton() {
        return this.e;
    }

    public final TextView getSwitchButton() {
        return this.f;
    }

    public final LinearLayout getTabBarContainer() {
        return this.b;
    }

    public final TextView getTitleView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        LinearLayout linearLayout = this.b;
        int measuredWidth2 = (measuredWidth - linearLayout.getMeasuredWidth()) / 2;
        linearLayout.layout(measuredWidth2, 0, linearLayout.getMeasuredWidth() + measuredWidth2, linearLayout.getMeasuredHeight());
        int measuredHeight = linearLayout.getMeasuredHeight();
        TextView textView = this.c;
        textView.layout(0, measuredHeight, textView.getMeasuredWidth(), textView.getMeasuredHeight() + linearLayout.getMeasuredHeight());
        int measuredHeight2 = textView.getMeasuredHeight() + linearLayout.getMeasuredHeight();
        FluidHorizontalLayout fluidHorizontalLayout = this.d;
        fluidHorizontalLayout.layout(0, measuredHeight2, fluidHorizontalLayout.getMeasuredWidth(), fluidHorizontalLayout.getMeasuredHeight() + textView.getMeasuredHeight() + linearLayout.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        LinearLayout linearLayout = this.b;
        measureChild(linearLayout, i, i2);
        int measuredWidth = linearLayout.getMeasuredWidth();
        if (size >= measuredWidth) {
            measuredWidth = size;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        FluidHorizontalLayout fluidHorizontalLayout = this.d;
        fluidHorizontalLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int g2 = swe0.g(fluidHorizontalLayout.getMeasuredWidth(), g, size);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(g2, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec3, makeMeasureSpec4);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(g2, 1073741824), View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredHeight() + textView.getMeasuredHeight() + fluidHorizontalLayout.getMeasuredHeight(), 1073741824));
    }
}
