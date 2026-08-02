package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;

/* compiled from: FeedRecyclerErrorView.kt */
/* loaded from: classes4.dex */
public final class t3r extends ee {
    public final AppCompatTextView d;
    public final VkSimpleButton e;

    public t3r(Context context) {
        super(context, null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.d = appCompatTextView;
        VkSimpleButton vkSimpleButton = new VkSimpleButton(context, null, 6);
        vkSimpleButton.setMode(VkButton.Mode.Tertiary);
        vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
        this.e = vkSimpleButton;
        appCompatTextView.setId(R.id.error_text);
        appCompatTextView.setGravity(17);
        appCompatTextView.setPadding(cn70.b(32), 0, cn70.b(32), 0);
        appCompatTextView.setText(R.string.vk_common_network_error);
        appCompatTextView.setTextSize(16.0f);
        jno0.c(appCompatTextView, R.attr.vk_ui_text_muted);
        vkSimpleButton.setId(R.id.error_retry);
        vkSimpleButton.setText(R.string.vk_common_retry);
        vkSimpleButton.setOnClickListener(new a06(this, 4));
        addView(appCompatTextView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = cn70.b(12);
        s3q0 s3q0Var = s3q0.a;
        addView(vkSimpleButton, layoutParams);
        int b = cn70.b(16);
        setPadding(b, b, b, b);
    }

    @Override // xsna.ee
    public final void b() {
        this.d.setText(R.string.vk_common_network_error);
        this.e.setVisibility(0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int a = defpackage.j0.a(measuredWidth, paddingLeft, measuredWidth2, 2, paddingLeft);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i6 = a + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i7 = i6 - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i8 = paddingTop + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
                int i9 = measuredHeight + i8;
                childAt.layout(i7, i8, measuredWidth2 + i7, i9);
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                paddingTop = i9 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int a = gp10.a(i, 0, Integer.MAX_VALUE, paddingRight);
        int a2 = gp10.a(i2, 0, Integer.MAX_VALUE, paddingBottom);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                childAt.measure(tr.a(a, 1073741823, 0, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(a2 - i4, 1073741823)), Integer.MIN_VALUE));
                int measuredWidth = childAt.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i6 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i3 = Math.max(i3, i6 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0) + measuredWidth);
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i7 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                i4 = lr.a(i7, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0, measuredHeight, i4);
            }
        }
        setMeasuredDimension(i3 + paddingRight, i4 + paddingBottom);
    }

    @Override // xsna.ee
    public void setActionTitle(int i) {
        this.e.setText(i);
    }

    @Override // xsna.ee
    public void setMessage(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // xsna.ee
    public void setRetryBtnVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }
}
