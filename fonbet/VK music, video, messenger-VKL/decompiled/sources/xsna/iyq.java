package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextFlag;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.dek0;

/* compiled from: FeedDigestSpotlightView.kt */
/* loaded from: classes4.dex */
public final class iyq extends ViewGroup implements too0 {
    public static final float n = cn70.a() * 0.5f;
    public boolean b;
    public final Paint c;
    public final AppCompatTextView d;
    public final FluidHorizontalLayout e;
    public final AppCompatTextView f;
    public final AppCompatTextView g;
    public final AppCompatTextView h;
    public final View i;
    public final AppCompatTextView j;
    public final AppCompatTextView k;
    public final VKImageView l;
    public final AppCompatTextView m;

    /* compiled from: FeedDigestSpotlightView.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
    }

    public iyq(Context context) {
        super(context, null, 0);
        float f;
        int i;
        this.b = true;
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(n);
        this.c = paint;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.digest_text);
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.k(appCompatTextView, fontFamily, Float.valueOf(15.0f), 4);
        appCompatTextView.setLineSpacing(cn70.a() * 3.0f, 1.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setMaxLines(4);
        appCompatTextView.setGravity(8388659);
        jno0.c(appCompatTextView, R.attr.vk_ui_text_primary);
        f4m.x(cn70.b(12), appCompatTextView);
        f4m.w(cn70.b(12), appCompatTextView);
        this.d = appCompatTextView;
        FluidHorizontalLayout fluidHorizontalLayout = new FluidHorizontalLayout(context);
        fluidHorizontalLayout.setId(R.id.digest_name_container);
        fluidHorizontalLayout.setGravity(16);
        fluidHorizontalLayout.setMinimumHeight(cn70.b(16));
        f4m.x(cn70.b(12), fluidHorizontalLayout);
        f4m.w(cn70.b(12), fluidHorizontalLayout);
        this.e = fluidHorizontalLayout;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.digest_name);
        appCompatTextView2.setGravity(16);
        appCompatTextView2.setMinHeight(cn70.b(16));
        appCompatTextView2.setMinimumHeight(cn70.b(16));
        Float valueOf = Float.valueOf(13.0f);
        com.vk.typography.b.k(appCompatTextView2, fontFamily, valueOf, 4);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setIncludeFontPadding(false);
        appCompatTextView2.setMaxLines(1);
        jno0.c(appCompatTextView2, R.attr.vk_ui_text_secondary);
        appCompatTextView2.setBackgroundResource(R.drawable.highlight_radius_4);
        FluidHorizontalLayout.a aVar = new FluidHorizontalLayout.a(-2, -2);
        aVar.d = 16;
        aVar.a = true;
        s3q0 s3q0Var = s3q0.a;
        fluidHorizontalLayout.addView(appCompatTextView2, aVar);
        this.f = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(R.id.digest_time);
        appCompatTextView3.setGravity(16);
        appCompatTextView3.setTextAlignment(1);
        appCompatTextView3.setMinHeight(cn70.b(16));
        appCompatTextView3.setMinimumHeight(cn70.b(16));
        appCompatTextView3.setIncludeFontPadding(false);
        jno0.c(appCompatTextView3, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(appCompatTextView3, fontFamily, valueOf, 4);
        FluidHorizontalLayout.a aVar2 = new FluidHorizontalLayout.a(-2, -2);
        aVar2.d = 16;
        aVar2.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(appCompatTextView3, aVar2);
        this.g = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        appCompatTextView4.setId(R.id.digest_comments_divider);
        appCompatTextView4.setGravity(16);
        appCompatTextView4.setTextAlignment(1);
        appCompatTextView4.setMinHeight(cn70.b(16));
        appCompatTextView4.setMinimumHeight(cn70.b(16));
        appCompatTextView4.setIncludeFontPadding(false);
        jno0.c(appCompatTextView4, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(appCompatTextView4, fontFamily, valueOf, 4);
        appCompatTextView4.setText("·");
        FluidHorizontalLayout.a aVar3 = new FluidHorizontalLayout.a(-2, -2);
        aVar3.d = 16;
        aVar3.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(appCompatTextView4, aVar3);
        this.h = appCompatTextView4;
        View view = new View(context);
        view.setId(R.id.digest_comments_icon);
        view.setImportantForAccessibility(2);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.vk_icon_comment_outline_16, R.attr.vk_ui_icon_secondary, view);
        FluidHorizontalLayout.a aVar4 = new FluidHorizontalLayout.a(cn70.b(16), cn70.b(16));
        aVar4.d = 16;
        aVar4.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(view, aVar4);
        this.i = view;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(context);
        appCompatTextView5.setId(R.id.digest_comments_counter);
        appCompatTextView5.setGravity(16);
        appCompatTextView5.setTextAlignment(1);
        appCompatTextView5.setMinHeight(cn70.b(16));
        appCompatTextView5.setMinimumHeight(cn70.b(16));
        appCompatTextView5.setIncludeFontPadding(false);
        jno0.c(appCompatTextView5, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(appCompatTextView5, fontFamily, valueOf, 4);
        FluidHorizontalLayout.a aVar5 = new FluidHorizontalLayout.a(-2, -2);
        aVar5.d = 16;
        aVar5.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(appCompatTextView5, aVar5);
        this.j = appCompatTextView5;
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(context);
        appCompatTextView6.setId(R.id.digest_badge);
        appCompatTextView6.setGravity(16);
        appCompatTextView6.setMinHeight(cn70.b(16));
        appCompatTextView6.setMinimumHeight(cn70.b(16));
        com.vk.typography.b.k(appCompatTextView6, FontFamily.MEDIUM, Float.valueOf(12.0f), 4);
        appCompatTextView6.setTextColor(-1);
        dhr0.h0(R.drawable.destructive_radius_4, appCompatTextView6);
        appCompatTextView6.setIncludeFontPadding(false);
        appCompatTextView6.setPadding(cn70.b(4), 0, cn70.b(4), 0);
        FluidHorizontalLayout.a aVar6 = new FluidHorizontalLayout.a(-2, cn70.b(16));
        aVar6.d = 16;
        aVar6.setMarginStart(cn70.b(12));
        fluidHorizontalLayout.addView(appCompatTextView6, aVar6);
        this.k = appCompatTextView6;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setId(R.id.photo);
        vKImageView.setAspectRatio(2.19375f);
        vKImageView.setPlaceholderImage(R.drawable.placeholder_radius_8);
        vKImageView.setCornerRadius(cn70.a() * 8.0f);
        this.l = vKImageView;
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(context);
        appCompatTextView7.setGravity(16);
        appCompatTextView7.setMinHeight(cn70.b(16));
        appCompatTextView7.setMinimumHeight(cn70.b(16));
        appCompatTextView7.setEllipsize(truncateAt);
        appCompatTextView7.setIncludeFontPadding(false);
        appCompatTextView7.setMaxLines(1);
        appCompatTextView7.setTextColor(-1);
        FontFamily fontFamily2 = FontFamily.DISPLAY_MEDIUM;
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        int i2 = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
        if (i2 == 1) {
            f = 21.0f;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(21.0f);
        }
        Font.Companion.getClass();
        Font a2 = Font.a.a(fontFamily2, f);
        Typeface k = a2.k(context);
        float j = a2.j();
        appCompatTextView7.setTypeface(k);
        appCompatTextView7.setLetterSpacing(j);
        if ((TextFlag.DO_NOT_CHANGE_SIZE.h() & 0) == 0) {
            int i3 = b.a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
            if (i3 == 1) {
                i = 0;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 2;
            }
            appCompatTextView7.setTextSize(i, 21.0f);
        }
        appCompatTextView7.setPadding(cn70.b(16), 0, cn70.b(16), cn70.b(14));
        this.m = appCompatTextView7;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setId(R.id.digest_list_item);
        dhr0.h0(R.drawable.highlight, this);
        a aVar7 = new a(-2, -2);
        ((ViewGroup.MarginLayoutParams) aVar7).topMargin = cn70.b(8);
        addView(appCompatTextView, aVar7);
        int i4 = dek0.a;
        dek0.b(vKImageView, null, new dek0.a(cn70.a() * 8.0f, false), 2);
        addView(vKImageView, 0, new a(-1, -2));
        a aVar8 = new a(-1, -2);
        ((ViewGroup.MarginLayoutParams) aVar8).topMargin = cn70.b(5);
        addView(fluidHorizontalLayout, aVar8);
        f4m.y(0, this);
        f4m.v(cn70.b(8), this);
        addView(appCompatTextView7, new a(-1, -2));
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.b) {
            float a2 = y8g0.a(R.dimen.post_side_padding);
            float f = 2;
            float f2 = n;
            canvas.drawLine(a2, f2 / f, getWidth() - y8g0.a(R.dimen.post_side_padding), f2 / f, this.c);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null ? new a(layoutParams) : generateDefaultLayoutParams();
    }

    public final AppCompatTextView getBadgeView() {
        return this.k;
    }

    public final AppCompatTextView getCommentsCounterView() {
        return this.j;
    }

    public final AppCompatTextView getCommentsDividerView() {
        return this.h;
    }

    public final View getCommentsIconView() {
        return this.i;
    }

    public final VKImageView getCoverView() {
        return this.l;
    }

    public final FluidHorizontalLayout getFluidLayout() {
        return this.e;
    }

    public final AppCompatTextView getNameTextView() {
        return this.f;
    }

    public final AppCompatTextView getTextView() {
        return this.d;
    }

    public final AppCompatTextView getTimeView() {
        return this.g;
    }

    public final AppCompatTextView getTitleView() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AppCompatTextView appCompatTextView;
        int paddingTop = getPaddingTop();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z2 = getLayoutDirection() == 1;
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            appCompatTextView = this.m;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt != null && !childAt.equals(appCompatTextView) && childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i6 = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                if (z2) {
                    dgn.b(childAt, i6, measuredWidth - childAt.getMeasuredWidth(), i6, measuredWidth);
                } else {
                    dgn.b(childAt, i6, paddingLeft, i6, childAt.getMeasuredWidth() + paddingLeft);
                }
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                paddingTop = (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) + measuredHeight;
            }
            i5++;
        }
        int visibility = appCompatTextView.getVisibility();
        VKImageView vKImageView = this.l;
        if (visibility == 8) {
            vKImageView.getBottom();
        } else {
            appCompatTextView.layout(vKImageView.getLeft(), vKImageView.getBottom() - appCompatTextView.getMeasuredHeight(), vKImageView.getRight(), vKImageView.getBottom());
            appCompatTextView.getBottom();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        VKImageView vKImageView = this.l;
        if (vKImageView.getVisibility() != 8) {
            measureChildWithMargins(vKImageView, i, 0, i2, 0);
            ViewParent parent = vKImageView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            int i6 = dek0.a;
            if (dek0.a(vKImageView) && viewGroup != null) {
                measureChildWithMargins(viewGroup, i, 0, i2, 0);
            }
            int measuredHeight = vKImageView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = vKImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i7 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = vKImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i8 = i7 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
            AppCompatTextView appCompatTextView = this.m;
            if (appCompatTextView.getVisibility() != 8) {
                appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(vKImageView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            i3 = i8;
        } else {
            i3 = 0;
        }
        AppCompatTextView appCompatTextView2 = this.d;
        if (appCompatTextView2.getVisibility() != 8) {
            measureChildWithMargins(appCompatTextView2, i, 0, i2, 0);
            int measuredWidth = appCompatTextView2.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams3 = appCompatTextView2.getLayoutParams();
            int marginStart = measuredWidth + (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams4 = appCompatTextView2.getLayoutParams();
            int marginEnd = marginStart + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd() : 0);
            int measuredHeight2 = appCompatTextView2.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams5 = appCompatTextView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            int i9 = measuredHeight2 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
            ViewGroup.LayoutParams layoutParams6 = appCompatTextView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            i4 = marginEnd;
            i5 = i9 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        } else {
            i4 = 0;
            i5 = 0;
        }
        FluidHorizontalLayout fluidHorizontalLayout = this.e;
        if (fluidHorizontalLayout.getVisibility() != 8) {
            measureChildWithMargins(fluidHorizontalLayout, i, 0, i2, 0);
            int measuredWidth2 = fluidHorizontalLayout.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams7 = fluidHorizontalLayout.getLayoutParams();
            int marginStart2 = measuredWidth2 + (layoutParams7 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams8 = fluidHorizontalLayout.getLayoutParams();
            i4 += marginStart2 + (layoutParams8 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams8).getMarginEnd() : 0);
            int measuredHeight3 = fluidHorizontalLayout.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams9 = fluidHorizontalLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
            int i10 = measuredHeight3 + (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0);
            ViewGroup.LayoutParams layoutParams10 = fluidHorizontalLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
            i5 += i10 + (marginLayoutParams6 != null ? marginLayoutParams6.bottomMargin : 0);
        }
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + i4, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + i5, i2));
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + i3);
    }

    public final void setMaxLines(int i) {
        this.d.setMaxLines(i);
    }

    public final void setSeparatorVisibility(boolean z) {
        if (this.b != z) {
            this.b = z;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
