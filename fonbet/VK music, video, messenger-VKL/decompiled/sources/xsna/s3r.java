package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: FeedRecyclerEmptyView.kt */
/* loaded from: classes4.dex */
public final class s3r extends ViewGroup implements fe90 {
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public int d;
    public int e;
    public final int f;
    public CharSequence g;
    public final boolean h;
    public int i;

    public s3r(Context context) {
        super(context, null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.b = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.c = appCompatTextView;
        this.f = R.string.liblists_empty_list;
        this.h = true;
        appCompatImageView.setId(R.id.image);
        appCompatImageView.setImportantForAccessibility(2);
        appCompatImageView.setVisibility(8);
        appCompatTextView.setId(R.id.text);
        appCompatTextView.setTextSize(16.0f);
        appCompatTextView.setGravity(1);
        appCompatTextView.setLineSpacing(cn70.a() * 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        jno0.c(appCompatTextView, R.attr.vk_ui_text_secondary);
        setText(R.string.liblists_empty_list);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(cn70.b(160), cn70.b(160));
        marginLayoutParams.bottomMargin = cn70.b(30);
        s3q0 s3q0Var = s3q0.a;
        addView(appCompatImageView, marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams2.leftMargin = cn70.b(32);
        marginLayoutParams2.rightMargin = cn70.b(32);
        addView(appCompatTextView, marginLayoutParams2);
    }

    @Override // xsna.fe90
    public final void a() {
        setText(this.f);
        setImage(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop() + ((getMeasuredHeight() - this.i) / 2);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int a = defpackage.j0.a(paddingRight, paddingLeft, measuredWidth, 2, paddingLeft);
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
                childAt.layout(i7, i8, measuredWidth + i7, i9);
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                paddingTop = i9 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = 0;
        int a = gp10.a(i, 0, Integer.MAX_VALUE, paddingRight);
        int a2 = gp10.a(i2, 0, Integer.MAX_VALUE, paddingBottom);
        CharSequence charSequence = this.g;
        int i4 = 8;
        if (((charSequence != null && charSequence.length() != 0) || this.d != 0) && this.e != 0) {
            boolean z = this.h;
            AppCompatImageView appCompatImageView = this.b;
            if (!z || a < a2) {
                appCompatImageView.setVisibility(0);
            } else {
                appCompatImageView.setVisibility(8);
            }
        }
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != i4) {
                childAt.measure(tr.a(a, 1073741823, i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(i3, Math.min(a2 - i6, 1073741823)), Integer.MIN_VALUE));
                int measuredWidth = childAt.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i8 = marginLayoutParams != null ? marginLayoutParams.leftMargin : i3;
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i7 = Math.max(i7, i8 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0) + measuredWidth);
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i9 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                i6 = lr.a(i9, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0, measuredHeight, i6);
            }
            i5++;
            i3 = 0;
            i4 = 8;
        }
        this.i = i6;
        setMeasuredDimension(gp10.b(i, 0, Integer.MAX_VALUE, paddingRight, i7), gp10.b(i2, 0, Integer.MAX_VALUE, paddingBottom, i6));
    }

    public void setImage(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        AppCompatImageView appCompatImageView = this.b;
        if (i == 0) {
            appCompatImageView.setVisibility(8);
        } else {
            try {
                appCompatImageView.setImageResource(i);
            } catch (OutOfMemoryError unused) {
            }
            appCompatImageView.setVisibility(0);
        }
    }

    public void setImageTint(int i) {
        this.b.setImageTintList(ColorStateList.valueOf(i));
    }

    @Override // xsna.fe90
    public void setText(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        AppCompatTextView appCompatTextView = this.c;
        if (i == 0) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setText(i);
            appCompatTextView.setVisibility(0);
        }
    }

    public void setTextSize(float f) {
        this.c.setTextSize(f);
    }

    @Override // xsna.fe90
    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(this.g, charSequence)) {
            return;
        }
        this.g = charSequence;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.c;
        if (!isEmpty) {
            appCompatTextView.setText(charSequence);
            appCompatTextView.setVisibility(0);
        } else {
            appCompatTextView.setVisibility(8);
        }
    }
}
