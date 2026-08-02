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
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.core.view.components.text.VkText;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* compiled from: DigestListItemView.kt */
/* loaded from: classes18.dex */
public class lym extends ViewGroup implements too0 {
    public static final float n = cn70.a() * 0.5f;
    public boolean b;
    public final Paint c;
    public final VkText d;
    public final VkImage e;
    public final VkImageSimple f;
    public final FluidHorizontalLayout g;
    public final VkText h;
    public final VkText i;
    public final VkText j;
    public final View k;
    public final VkText l;
    public final VkText m;

    /* compiled from: DigestListItemView.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
    }

    public lym(Context context) {
        super(context, null, 0);
        this.b = true;
        Paint paint = new Paint();
        paint.setColor(krv0.m(R.attr.vk_ui_separator_primary_alpha, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(n);
        this.c = paint;
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setId(R.id.digest_text);
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.k(vkText, fontFamily, Float.valueOf(15.0f), 4);
        vkText.setLineSpacing(cn70.a() * 3.0f, 1.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vkText.setEllipsize(truncateAt);
        vkText.setIncludeFontPadding(false);
        vkText.setMaxLines(4);
        vkText.setGravity(8388659);
        jno0.c(vkText, R.attr.vk_ui_text_primary);
        addView(vkText, new a(-2, -2));
        this.d = vkText;
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setId(R.id.digest_attach_thumb);
        a aVar = new a(cn70.b(60), cn70.b(44));
        aVar.setMarginStart(cn70.b(12));
        ((ViewGroup.MarginLayoutParams) aVar).topMargin = cn70.b(3);
        s3q0 s3q0Var = s3q0.a;
        addView(vkImage, aVar);
        this.e = vkImage;
        VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
        vkImageSimple.setId(R.id.digest_overlay);
        vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        vkImageSimple.setImportantForAccessibility(2);
        vkImageSimple.setBackgroundColor(krv0.m(R.attr.vk_ui_image_placeholder, context));
        LinkedHashMap linkedHashMap = x1z.a;
        vkImageSimple.setImageResource(R.drawable.vk_icon_play_24);
        vkImageSimple.setImageTintList(ColorStateList.valueOf(-1));
        addView(vkImageSimple, new a(cn70.b(60), cn70.b(44)));
        this.f = vkImageSimple;
        FluidHorizontalLayout fluidHorizontalLayout = new FluidHorizontalLayout(context);
        fluidHorizontalLayout.setId(R.id.digest_name_container);
        fluidHorizontalLayout.setGravity(16);
        fluidHorizontalLayout.setMinimumHeight(cn70.b(16));
        this.g = fluidHorizontalLayout;
        VkText vkText2 = new VkText(context, null, 6, 0);
        vkText2.setId(R.id.digest_name);
        vkText2.setGravity(16);
        vkText2.setMinHeight(cn70.b(16));
        vkText2.setMinimumHeight(cn70.b(16));
        Float valueOf = Float.valueOf(13.0f);
        com.vk.typography.b.k(vkText2, fontFamily, valueOf, 4);
        vkText2.setEllipsize(truncateAt);
        vkText2.setIncludeFontPadding(false);
        vkText2.setSingleLine();
        jno0.c(vkText2, R.attr.vk_ui_text_secondary);
        vkText2.setBackgroundResource(R.drawable.highlight_radius_4);
        FluidHorizontalLayout.a aVar2 = new FluidHorizontalLayout.a(-2, -2);
        aVar2.d = 16;
        aVar2.a = true;
        fluidHorizontalLayout.addView(vkText2, aVar2);
        this.h = vkText2;
        VkText vkText3 = new VkText(context, null, 6, 0);
        vkText3.setId(R.id.digest_time);
        vkText3.setGravity(16);
        vkText3.setTextAlignment(1);
        vkText3.setMinHeight(cn70.b(16));
        vkText3.setMinimumHeight(cn70.b(16));
        vkText3.setIncludeFontPadding(false);
        jno0.c(vkText3, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(vkText3, fontFamily, valueOf, 4);
        FluidHorizontalLayout.a aVar3 = new FluidHorizontalLayout.a(-2, -2);
        aVar3.d = 16;
        aVar3.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(vkText3, aVar3);
        this.i = vkText3;
        VkText vkText4 = new VkText(context, null, 6, 0);
        vkText4.setId(R.id.digest_comments_divider);
        vkText4.setGravity(16);
        vkText4.setTextAlignment(1);
        vkText4.setMinHeight(cn70.b(16));
        vkText4.setMinimumHeight(cn70.b(16));
        vkText4.setIncludeFontPadding(false);
        jno0.c(vkText4, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(vkText4, fontFamily, valueOf, 4);
        vkText4.setText("·");
        FluidHorizontalLayout.a aVar4 = new FluidHorizontalLayout.a(-2, -2);
        aVar4.d = 16;
        aVar4.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(vkText4, aVar4);
        this.j = vkText4;
        View view = new View(context);
        view.setId(R.id.digest_comments_icon);
        view.setImportantForAccessibility(2);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.vk_icon_comment_outline_16, R.attr.vk_ui_icon_secondary, view);
        FluidHorizontalLayout.a aVar5 = new FluidHorizontalLayout.a(cn70.b(16), cn70.b(16));
        aVar5.d = 16;
        aVar5.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(view, aVar5);
        this.k = view;
        VkText vkText5 = new VkText(context, null, 6, 0);
        vkText5.setId(R.id.digest_comments_counter);
        vkText5.setGravity(16);
        vkText5.setTextAlignment(1);
        vkText5.setMinHeight(cn70.b(16));
        vkText5.setMinimumHeight(cn70.b(16));
        vkText5.setIncludeFontPadding(false);
        jno0.c(vkText5, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(vkText5, fontFamily, valueOf, 4);
        FluidHorizontalLayout.a aVar6 = new FluidHorizontalLayout.a(-2, -2);
        aVar6.d = 16;
        aVar6.setMarginStart(cn70.b(4));
        fluidHorizontalLayout.addView(vkText5, aVar6);
        this.l = vkText5;
        VkText vkText6 = new VkText(context, null, 6, 0);
        vkText6.setId(R.id.digest_badge);
        vkText6.setGravity(16);
        vkText6.setMinHeight(cn70.b(16));
        vkText6.setMinimumHeight(cn70.b(16));
        com.vk.typography.b.k(vkText6, FontFamily.MEDIUM, Float.valueOf(12.0f), 4);
        vkText6.setTextColor(-1);
        dhr0.h0(R.drawable.destructive_radius_4, vkText6);
        vkText6.setIncludeFontPadding(false);
        vkText6.setPadding(cn70.b(4), 0, cn70.b(4), 0);
        FluidHorizontalLayout.a aVar7 = new FluidHorizontalLayout.a(-2, cn70.b(16));
        aVar7.d = 16;
        aVar7.setMarginStart(cn70.b(12));
        fluidHorizontalLayout.addView(vkText6, aVar7);
        this.m = vkText6;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setId(R.id.digest_list_item);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.post_side_padding);
        setPadding(dimensionPixelSize, cn70.b(12), dimensionPixelSize, cn70.b(12));
        dhr0.h0(R.drawable.highlight, this);
        a aVar8 = new a(-1, -2);
        ((ViewGroup.MarginLayoutParams) aVar8).topMargin = cn70.b(4);
        addView(fluidHorizontalLayout, aVar8);
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
            float a2 = e3m.a(R.dimen.post_side_padding, getContext());
            float f = 2;
            float f2 = n;
            canvas.drawLine(a2, f2 / f, getWidth() - e3m.a(R.dimen.post_side_padding, getContext()), f2 / f, this.c);
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

    public final VkImage getAttachThumb() {
        return this.e;
    }

    public final VkText getBadgeView() {
        return this.m;
    }

    public final VkText getCommentsCounterView() {
        return this.l;
    }

    public final VkText getCommentsDividerView() {
        return this.j;
    }

    public final View getCommentsIconView() {
        return this.k;
    }

    public final FluidHorizontalLayout getFluidLayout() {
        return this.g;
    }

    public final VkText getNameTextView() {
        return this.h;
    }

    public final VkImageSimple getOverlayView() {
        return this.f;
    }

    public final VkText getTextView() {
        return this.d;
    }

    public final VkText getTimeView() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z2 = getLayoutDirection() == 1;
        VkImage vkImage = this.e;
        int visibility = vkImage.getVisibility();
        VkImageSimple vkImageSimple = this.f;
        if (visibility != 8) {
            int measuredWidth2 = vkImage.getMeasuredWidth();
            int measuredHeight = vkImage.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = vkImage.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i5 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + paddingTop;
            ViewGroup.LayoutParams layoutParams2 = vkImage.getLayoutParams();
            int marginStart = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams3 = vkImage.getLayoutParams();
            int marginEnd = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0;
            if (z2) {
                int i6 = paddingLeft + marginEnd;
                vkImage.layout(i6, i5, i6 + measuredWidth2, measuredHeight + i5);
                paddingLeft += measuredWidth2 + marginStart + marginEnd;
            } else {
                int i7 = measuredWidth - marginEnd;
                vkImage.layout(i7 - measuredWidth2, i5, i7, measuredHeight + i5);
                measuredWidth -= (measuredWidth2 + marginStart) + marginEnd;
            }
            if (vkImageSimple.getVisibility() != 8) {
                vkImageSimple.layout(vkImage.getLeft(), vkImage.getTop(), vkImage.getRight(), vkImage.getBottom());
            }
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != null && childAt != vkImage && childAt != vkImageSimple && childAt.getVisibility() != 8) {
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
    public void onMeasure(int i, int i2) {
        View view;
        int i3;
        int i4;
        int i5;
        int i6;
        View view2 = this.e;
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
            VkImageSimple vkImageSimple = this.f;
            if (vkImageSimple.getVisibility() != 8) {
                vkImageSimple.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
            }
            i3 = marginEnd;
            i4 = i8;
        } else {
            view = view2;
            i3 = 0;
            i4 = 0;
        }
        VkText vkText = this.d;
        if (vkText.getVisibility() != 8) {
            measureChildWithMargins(vkText, i, i3, i2, 0);
            int measuredWidth2 = vkText.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams5 = vkText.getLayoutParams();
            int marginStart2 = measuredWidth2 + (layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams6 = vkText.getLayoutParams();
            int marginEnd2 = marginStart2 + (layoutParams6 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd() : 0);
            int measuredHeight2 = vkText.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams7 = vkText.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
            int i9 = measuredHeight2 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
            ViewGroup.LayoutParams layoutParams8 = vkText.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
            int i10 = i9 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
            if (view.getVisibility() != 8 && vkText.getLayout().getLineCount() == 1) {
                i10 += cn70.b(4);
            }
            i5 = marginEnd2;
            i6 = i10;
        } else {
            i5 = 0;
            i6 = 0;
        }
        View view3 = this.g;
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
        VkText vkText = this.d;
        vkText.setMaxLines(i);
        VkFadeText vkFadeText = vkText instanceof VkFadeText ? (VkFadeText) vkText : null;
        if (vkFadeText != null) {
            vkFadeText.setMaxTextLines(i);
        }
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
