package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.PhotoStackView;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: MsgPartDonutSnippetView.kt */
/* loaded from: classes2.dex */
public final class yp30 extends ViewGroup implements hux0 {
    public final VKImageView b;
    public final View c;
    public final TextView d;
    public final View e;
    public final TextView f;
    public final TextView g;
    public final PhotoStackView h;
    public final TextView i;
    public final TimeAndStatusView j;
    public int k;

    /* compiled from: MsgPartDonutSnippetView.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
    }

    public yp30(Context context) {
        super(context, null, 0);
        this.k = 3;
        LayoutInflater.from(context).inflate(R.layout.vkim_msg_part_donut_snippet, (ViewGroup) this, true);
        this.b = (VKImageView) findViewById(R.id.image_view);
        this.c = findViewById(R.id.icon_view);
        this.d = (TextView) findViewById(R.id.title_view);
        this.e = findViewById(R.id.verified);
        this.f = (TextView) findViewById(R.id.subtitle_view);
        this.g = (TextView) findViewById(R.id.text_view);
        this.h = (PhotoStackView) findViewById(R.id.photo_image_view);
        this.i = (TextView) findViewById(R.id.button);
        this.j = (TimeAndStatusView) findViewById(R.id.timeAndStatus);
    }

    public static int a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
        }
        return 0;
    }

    public static int b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static int c(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int marginStart = (marginLayoutParams != null ? marginLayoutParams.getMarginStart() : 0) + i;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + i2;
        view.layout(marginStart, i3, view.getMeasuredWidth() + marginStart, view.getMeasuredHeight() + i3);
        return view.getBottom();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams != null ? new a(layoutParams) : new a(-2, -2);
    }

    @Override // xsna.hux0
    public TimeAndStatusView getTimeAndStatusView() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        VKImageView vKImageView = this.b;
        vKImageView.layout(paddingLeft, paddingTop, vKImageView.getMeasuredWidth() + paddingLeft, vKImageView.getMeasuredHeight() + paddingTop);
        int right = vKImageView.getRight();
        View view = this.c;
        int measuredWidth2 = right - view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int marginStart = (marginLayoutParams != null ? marginLayoutParams.getMarginStart() : 0) + measuredWidth2;
        int bottom = vKImageView.getBottom() - view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i5 = (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + bottom;
        dgn.b(view, i5, marginStart, i5, view.getMeasuredWidth() + marginStart);
        int right2 = vKImageView.getRight();
        ViewGroup.LayoutParams layoutParams3 = vKImageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int marginEnd = right2 + (marginLayoutParams3 != null ? marginLayoutParams3.getMarginEnd() : 0);
        TextView textView = this.d;
        if (textView.getVisibility() != 8) {
            int c = c(marginEnd, paddingTop, textView);
            View view2 = this.e;
            if (view2.getVisibility() != 8) {
                c(textView.getRight(), paddingTop, view2);
            }
            paddingTop = c;
        }
        TextView textView2 = this.f;
        if (textView2.getVisibility() != 8) {
            paddingTop = c(marginEnd, paddingTop, textView2);
        }
        TextView textView3 = this.g;
        if (textView3.getVisibility() != 8) {
            int c2 = c(marginEnd, paddingTop, textView3);
            PhotoStackView photoStackView = this.h;
            paddingTop = photoStackView.getVisibility() != 8 ? c(textView3.getRight(), paddingTop, photoStackView) : c2;
        }
        TextView textView4 = this.i;
        if (textView4.getVisibility() != 8) {
            c(marginEnd, paddingTop, textView4);
        }
        if (getTimeAndStatusView().getVisibility() != 8) {
            int measuredWidth3 = measuredWidth - getTimeAndStatusView().getMeasuredWidth();
            int measuredHeight2 = measuredHeight - getTimeAndStatusView().getMeasuredHeight();
            getTimeAndStatusView().layout(measuredWidth3, measuredHeight2, getTimeAndStatusView().getMeasuredWidth() + measuredWidth3, getTimeAndStatusView().getMeasuredHeight() + measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        yp30 yp30Var;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        PhotoStackView photoStackView;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int a2 = gp10.a(i, suggestedMinimumWidth, Integer.MAX_VALUE, paddingRight);
        int a3 = gp10.a(i2, suggestedMinimumHeight, Integer.MAX_VALUE, paddingBottom);
        measureChildWithMargins(this.b, gp10.c(a2, Integer.MIN_VALUE), paddingRight, gp10.c(a3, Integer.MIN_VALUE), paddingBottom);
        VKImageView vKImageView = this.b;
        int a4 = a(vKImageView) + vKImageView.getMeasuredWidth();
        int b = b(vKImageView) + vKImageView.getMeasuredHeight();
        measureChildWithMargins(this.c, gp10.c(a2, Integer.MIN_VALUE), paddingRight, gp10.c(a3, Integer.MIN_VALUE), paddingBottom);
        int max = Math.max(0, a2 - a4);
        if (getTimeAndStatusView().getVisibility() != 8) {
            i4 = 8;
            i6 = paddingBottom;
            i5 = paddingRight;
            i3 = 0;
            yp30Var = this;
            yp30Var.measureChildWithMargins(getTimeAndStatusView(), gp10.c(max, Integer.MIN_VALUE), 0, gp10.c(a3, Integer.MIN_VALUE), 0);
            i7 = yp30Var.getTimeAndStatusView().getMeasuredWidth() + a(yp30Var.getTimeAndStatusView());
            i8 = yp30Var.getTimeAndStatusView().getMeasuredHeight() + b(yp30Var.getTimeAndStatusView());
        } else {
            i3 = 0;
            i4 = 8;
            i5 = paddingRight;
            i6 = paddingBottom;
            yp30Var = this;
            i7 = 0;
            i8 = 0;
        }
        View view = yp30Var.e;
        if (view.getVisibility() != i4) {
            yp30Var.measureChildWithMargins(yp30Var.e, gp10.c(max, Integer.MIN_VALUE), 0, gp10.c(a3, Integer.MIN_VALUE), 0);
            int measuredWidth = view.getMeasuredWidth() + a(view);
            i9 = view.getMeasuredHeight() + b(view);
            i10 = measuredWidth;
        } else {
            i9 = i3;
            i10 = i9;
        }
        TextView textView = yp30Var.d;
        if (textView.getVisibility() != i4) {
            i11 = i9;
            yp30Var.measureChildWithMargins(yp30Var.d, gp10.c(max - i10, Integer.MIN_VALUE), 0, gp10.c(a3, Integer.MIN_VALUE), 0);
            int measuredWidth2 = textView.getMeasuredWidth() + a(textView);
            i12 = textView.getMeasuredHeight() + b(textView);
            i13 = measuredWidth2;
        } else {
            i11 = i9;
            i12 = i3;
            i13 = i12;
        }
        TextView textView2 = yp30Var.f;
        if (textView2.getVisibility() != i4) {
            i14 = i12;
            yp30Var.measureChildWithMargins(yp30Var.f, gp10.c(max, Integer.MIN_VALUE), 0, gp10.c(a3, Integer.MIN_VALUE), 0);
            i15 = textView2.getMeasuredWidth() + a(textView2);
            i16 = textView2.getMeasuredHeight() + b(textView2);
        } else {
            i14 = i12;
            i15 = i3;
            i16 = i15;
        }
        TextView textView3 = yp30Var.g;
        if (textView3.getVisibility() != i4) {
            i17 = i15;
            yp30Var.measureChildWithMargins(yp30Var.g, gp10.c(max, Integer.MIN_VALUE), 0, gp10.c(a3, Integer.MIN_VALUE), 0);
            int measuredWidth3 = textView3.getMeasuredWidth() + a(textView3);
            i18 = textView3.getMeasuredHeight() + b(textView3);
            i19 = measuredWidth3;
        } else {
            i17 = i15;
            i18 = i3;
            i19 = i18;
        }
        PhotoStackView photoStackView2 = yp30Var.h;
        if (photoStackView2.getVisibility() != i4) {
            photoStackView = photoStackView2;
            i20 = i18;
            yp30Var.measureChildWithMargins(yp30Var.h, gp10.c(max, Integer.MIN_VALUE), 0, gp10.c(a3, Integer.MIN_VALUE), 0);
            i21 = photoStackView.getMeasuredWidth() + a(photoStackView);
            i22 = photoStackView.getMeasuredHeight() + b(photoStackView);
        } else {
            photoStackView = photoStackView2;
            i20 = i18;
            i21 = i3;
            i22 = i21;
        }
        int i26 = i19 + i21;
        if (i26 > max) {
            photoStackView.setVisibility(4);
        }
        TextView textView4 = yp30Var.i;
        if (textView4.getVisibility() != i4) {
            i24 = i22;
            i23 = i26;
            yp30Var.measureChildWithMargins(yp30Var.i, gp10.c(max - i7, Integer.MIN_VALUE), 0, gp10.c(a3, Integer.MIN_VALUE), 0);
            int measuredWidth4 = textView4.getMeasuredWidth() + a(textView4);
            i25 = textView4.getMeasuredHeight() + b(textView4);
            i3 = measuredWidth4;
        } else {
            i23 = i26;
            i24 = i22;
            i25 = i3;
        }
        yp30Var.setMeasuredDimension(gp10.b(i, suggestedMinimumWidth, Integer.MAX_VALUE, i5, a4 + Math.max(Math.max(i13 + i10, Math.max(i17, i23)), i3 + i7)), gp10.b(i2, suggestedMinimumHeight, Integer.MAX_VALUE, i6, Math.max(b, (i8 / 2) + Math.max(i20, i24) + Math.max(i14, i11) + i16 + i25)));
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
    }

    public final void setButtonForegroundResource(int i) {
        this.i.setForeground(m33.a(i, getContext()));
    }

    public final void setButtonText(CharSequence charSequence) {
        TextView textView = this.i;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setButtonTextColor(int i) {
        this.i.setTextColor(i);
    }

    public final void setDetailsText(CharSequence charSequence) {
        TextView textView = this.g;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setDetailsTextColor(int i) {
        this.g.setTextColor(i);
    }

    public final void setIconImageResource(int i) {
        this.c.setBackground(m33.a(i, getContext()));
    }

    public final void setImage(ImageList imageList) {
        Image Bb;
        this.b.load((imageList == null || (Bb = imageList.Bb(cn70.b(40), cn70.b(40))) == null) ? null : Bb.d);
    }

    public final void setPhotos(List<ImageList> list) {
        List<ImageList> list2 = list;
        PhotoStackView photoStackView = this.h;
        if (list2 == null || list2.isEmpty()) {
            photoStackView.setVisibility(8);
            return;
        }
        int size = list.size();
        int i = this.k;
        if (size > i) {
            size = i;
        }
        photoStackView.setCount(size);
        for (int i2 = 0; i2 < size; i2++) {
            Image Bb = list.get(i2).Bb(cn70.b(16), cn70.b(16));
            photoStackView.h(i2, Bb != null ? Bb.d : null);
        }
        photoStackView.setVisibility(0);
    }

    public final void setPhotosGap(float f) {
        this.h.setMarginBetweenImages(f);
    }

    public final void setPhotosMaxCount(int i) {
        if (this.k != i) {
            this.k = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setPhotosOverlapOffset(float f) {
        this.h.setOverlapOffset(f);
    }

    public final void setSubtitleText(CharSequence charSequence) {
        TextView textView = this.f;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setSubtitleTextColor(int i) {
        this.f.setTextColor(i);
    }

    public final void setTimeTextColor(int i) {
        getTimeAndStatusView().setTimeTextColor(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        TextView textView = this.d;
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setTitleTextColor(int i) {
        this.d.setTextColor(i);
    }

    public final void setVerified(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // xsna.hux0
    public final void X3() {
    }
}
