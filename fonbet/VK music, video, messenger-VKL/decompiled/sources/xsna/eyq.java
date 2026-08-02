package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.WeakHashMap;

/* compiled from: FeedDigestListItemView.kt */
/* loaded from: classes4.dex */
public final class eyq extends ViewGroup implements too0 {
    public static final float o = cn70.a() * 0.5f;
    public boolean b;
    public final float c;
    public final Paint d;
    public final AppCompatTextView e;
    public final VKImageView f;
    public final AppCompatImageView g;
    public final FluidHorizontalLayout h;
    public final AppCompatTextView i;
    public final AppCompatTextView j;
    public final AppCompatTextView k;
    public final View l;
    public final AppCompatTextView m;
    public final AppCompatTextView n;

    /* compiled from: FeedDigestListItemView.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
    }

    public eyq(Context context) {
        super(context, null, 0);
        this.b = true;
        this.c = cn70.a() * 12.0f;
        Paint paint = new Paint();
        abg0 abg0Var = dhr0.t;
        paint.setColor(abg0Var.c(R.attr.vk_ui_separator_primary_alpha));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(o);
        this.d = paint;
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
        addView(appCompatTextView, new a(-2, -2));
        this.e = appCompatTextView;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setId(R.id.digest_attach_thumb);
        a aVar = new a(cn70.b(60), cn70.b(44));
        aVar.setMarginStart(cn70.b(12));
        s3q0 s3q0Var = s3q0.a;
        addView(vKImageView, aVar);
        this.f = vKImageView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.digest_overlay);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appCompatImageView.setImportantForAccessibility(2);
        appCompatImageView.setBackgroundColor(abg0Var.c(R.attr.vk_ui_image_placeholder));
        appCompatImageView.setImageResource(R.drawable.vk_icon_play_24);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        addView(appCompatImageView, new a(cn70.b(60), cn70.b(44)));
        this.g = appCompatImageView;
        FluidHorizontalLayout fluidHorizontalLayout = new FluidHorizontalLayout(context);
        fluidHorizontalLayout.setId(R.id.digest_name_container);
        fluidHorizontalLayout.setGravity(16);
        fluidHorizontalLayout.setMinimumHeight(cn70.b(16));
        this.h = fluidHorizontalLayout;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.digest_name);
        appCompatTextView2.setGravity(16);
        appCompatTextView2.setMinHeight(cn70.b(16));
        appCompatTextView2.setMinimumHeight(cn70.b(16));
        Float valueOf = Float.valueOf(13.0f);
        com.vk.typography.b.k(appCompatTextView2, fontFamily, valueOf, 4);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setIncludeFontPadding(false);
        appCompatTextView2.setSingleLine();
        jno0.c(appCompatTextView2, R.attr.vk_ui_text_secondary);
        appCompatTextView2.setBackgroundResource(R.drawable.highlight_radius_4);
        FluidHorizontalLayout.a aVar2 = new FluidHorizontalLayout.a(-2, -2);
        aVar2.d = 16;
        aVar2.a = true;
        fluidHorizontalLayout.addView(appCompatTextView2, aVar2);
        this.i = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(R.id.digest_time);
        appCompatTextView3.setGravity(16);
        appCompatTextView3.setTextAlignment(1);
        appCompatTextView3.setMinHeight(cn70.b(16));
        appCompatTextView3.setMinimumHeight(cn70.b(16));
        appCompatTextView3.setIncludeFontPadding(false);
        jno0.c(appCompatTextView3, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(appCompatTextView3, fontFamily, valueOf, 4);
        FluidHorizontalLayout.a aVar3 = new FluidHorizontalLayout.a(-2, -2);
        aVar3.d = 16;
        aVar3.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(appCompatTextView3, aVar3);
        this.j = appCompatTextView3;
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
        FluidHorizontalLayout.a aVar4 = new FluidHorizontalLayout.a(-2, -2);
        aVar4.d = 16;
        aVar4.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(appCompatTextView4, aVar4);
        this.k = appCompatTextView4;
        View view = new View(context);
        view.setId(R.id.digest_comments_icon);
        view.setImportantForAccessibility(2);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.vk_icon_comment_outline_16, R.attr.vk_ui_icon_secondary, view);
        FluidHorizontalLayout.a aVar5 = new FluidHorizontalLayout.a(cn70.b(16), cn70.b(16));
        aVar5.d = 16;
        aVar5.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(view, aVar5);
        this.l = view;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(context);
        appCompatTextView5.setId(R.id.digest_comments_counter);
        appCompatTextView5.setGravity(16);
        appCompatTextView5.setTextAlignment(1);
        appCompatTextView5.setMinHeight(cn70.b(16));
        appCompatTextView5.setMinimumHeight(cn70.b(16));
        appCompatTextView5.setIncludeFontPadding(false);
        jno0.c(appCompatTextView5, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(appCompatTextView5, fontFamily, valueOf, 4);
        FluidHorizontalLayout.a aVar6 = new FluidHorizontalLayout.a(-2, -2);
        aVar6.d = 16;
        aVar6.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(appCompatTextView5, aVar6);
        this.m = appCompatTextView5;
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
        FluidHorizontalLayout.a aVar7 = new FluidHorizontalLayout.a(-2, cn70.b(16));
        aVar7.d = 16;
        aVar7.setMarginStart(cn70.b(12));
        fluidHorizontalLayout.addView(appCompatTextView6, aVar7);
        this.n = appCompatTextView6;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setId(R.id.digest_list_item);
        setPadding(cn70.b(12), cn70.b(9), cn70.b(12), cn70.b(8));
        dhr0.h0(R.drawable.highlight, this);
        a aVar8 = new a(-1, -2);
        ((ViewGroup.MarginLayoutParams) aVar8).topMargin = cn70.b(5);
        addView(fluidHorizontalLayout, aVar8);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.d.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.b) {
            float f = 2;
            float f2 = o;
            canvas.drawLine(this.c, f2 / f, getMeasuredWidth() - this.c, f2 / f, this.d);
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

    public final VKImageView getAttachThumb() {
        return this.f;
    }

    public final AppCompatTextView getBadgeView() {
        return this.n;
    }

    public final AppCompatTextView getCommentsCounterView() {
        return this.m;
    }

    public final AppCompatTextView getCommentsDividerView() {
        return this.k;
    }

    public final View getCommentsIconView() {
        return this.l;
    }

    public final FluidHorizontalLayout getFluidLayout() {
        return this.h;
    }

    public final AppCompatTextView getNameTextView() {
        return this.i;
    }

    public final AppCompatImageView getOverlayView() {
        return this.g;
    }

    public final AppCompatTextView getTextView() {
        return this.e;
    }

    public final AppCompatTextView getTimeView() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z2 = getLayoutDirection() == 1;
        VKImageView vKImageView = this.f;
        int visibility = vKImageView.getVisibility();
        AppCompatImageView appCompatImageView = this.g;
        if (visibility != 8) {
            int measuredWidth2 = vKImageView.getMeasuredWidth();
            int measuredHeight = vKImageView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = vKImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i5 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + paddingTop;
            ViewGroup.LayoutParams layoutParams2 = vKImageView.getLayoutParams();
            int marginStart = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams3 = vKImageView.getLayoutParams();
            int marginEnd = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0;
            if (z2) {
                int i6 = paddingLeft + marginEnd;
                vKImageView.layout(i6, i5, i6 + measuredWidth2, measuredHeight + i5);
                paddingLeft += measuredWidth2 + marginStart + marginEnd;
            } else {
                int i7 = measuredWidth - marginEnd;
                vKImageView.layout(i7 - measuredWidth2, i5, i7, measuredHeight + i5);
                measuredWidth -= (measuredWidth2 + marginStart) + marginEnd;
            }
            if (appCompatImageView.getVisibility() != 8) {
                appCompatImageView.layout(vKImageView.getLeft(), vKImageView.getTop(), vKImageView.getRight(), vKImageView.getBottom());
            }
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != null && childAt != vKImageView && childAt != appCompatImageView && childAt.getVisibility() != 8) {
                int measuredWidth3 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                int i9 = paddingTop + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
                if (z2) {
                    childAt.layout(measuredWidth - measuredWidth3, i9, measuredWidth, measuredHeight2 + i9);
                } else {
                    dgn.b(childAt, i9, paddingLeft, i9, childAt.getMeasuredWidth() + paddingLeft);
                }
                int bottom = childAt.getBottom();
                ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                paddingTop = bottom + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        int i3;
        int i4;
        int i5;
        int i6;
        View view2 = this.f;
        if (view2.getVisibility() != 8) {
            measureChildWithMargins(view2, i, 0, i2, 0);
            view = view2;
            int measuredWidth = view.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int marginStart = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            int marginEnd = marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i7 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            int i8 = i7 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
            AppCompatImageView appCompatImageView = this.g;
            if (appCompatImageView.getVisibility() != 8) {
                appCompatImageView.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
            }
            i3 = marginEnd;
            i4 = i8;
        } else {
            view = view2;
            i3 = 0;
            i4 = 0;
        }
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView.getVisibility() != 8) {
            measureChildWithMargins(appCompatTextView, i, i3, i2, 0);
            int measuredWidth2 = appCompatTextView.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams5 = appCompatTextView.getLayoutParams();
            int marginStart2 = measuredWidth2 + (layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams6 = appCompatTextView.getLayoutParams();
            int marginEnd2 = marginStart2 + (layoutParams6 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd() : 0);
            int measuredHeight2 = appCompatTextView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams7 = appCompatTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
            int i9 = measuredHeight2 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
            ViewGroup.LayoutParams layoutParams8 = appCompatTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
            int i10 = i9 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
            if (view.getVisibility() != 8 && appCompatTextView.getLayout().getLineCount() == 1) {
                i10 += cn70.b(4);
            }
            i5 = marginEnd2;
            i6 = i10;
        } else {
            i5 = 0;
            i6 = 0;
        }
        View view3 = this.h;
        if (view3.getVisibility() != 8) {
            measureChildWithMargins(view3, i, i3, i2, 0);
            int measuredWidth3 = view3.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams9 = view3.getLayoutParams();
            int marginStart3 = measuredWidth3 + (layoutParams9 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams9).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams10 = view3.getLayoutParams();
            i5 += marginStart3 + (layoutParams10 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams10).getMarginEnd() : 0);
            int measuredHeight3 = view3.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams11 = view3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
            int i11 = measuredHeight3 + (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0);
            ViewGroup.LayoutParams layoutParams12 = view3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
            i6 += i11 + (marginLayoutParams6 != null ? marginLayoutParams6.bottomMargin : 0);
        }
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + i3 + i5, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + Math.max(i4, i6), i2));
    }

    public final void setMaxLines(int i) {
        this.e.setMaxLines(i);
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
