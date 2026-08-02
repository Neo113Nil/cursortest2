package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.core.view.components.text.links.a;
import com.vk.core.view.text.strategies.ExpandMeasureStrategy;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: BaseExpandableText.kt */
/* loaded from: classes17.dex */
public class fd6 extends VkLinkedText implements too0 {
    public final RectF A;
    public final RectF B;
    public final RectF C;
    public o7q D;
    public final fw5 E;
    public final qij0 F;
    public boolean G;
    public ExpandMeasureStrategy H;
    public int I;
    public int J;
    public int[] K;
    public boolean L;
    public float M;
    public boolean N;
    public boolean O;
    public final StringBuilder P;
    public boolean k;
    public final com.vk.core.view.components.text.links.a l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public Float s;
    public final Paint t;
    public final GradientDrawable u;
    public CharSequence v;
    public StaticLayout w;
    public int x;
    public int y;
    public final RectF z;

    /* compiled from: BaseExpandableText.kt */
    public static final class a extends g2v0 {
        public final fd6 h;
        public final int i;
        public final Rect j;

        public a(fd6 fd6Var) {
            super(fd6Var);
            this.h = fd6Var;
            this.i = R.id.ds_internal_expandable_text_more_button;
            this.j = new Rect();
        }

        @Override // xsna.g2v0, xsna.y9q
        public final int getVirtualViewAt(float f, float f2) {
            return this.h.A.contains(f, f2) ? this.i : super.getVirtualViewAt(f, f2);
        }

        @Override // xsna.g2v0, xsna.y9q
        public final void getVisibleVirtualViews(List<Integer> list) {
            super.getVisibleVirtualViews(list);
            if (this.h.A.isEmpty()) {
                return;
            }
            list.add(Integer.valueOf(this.i));
        }

        @Override // xsna.g2v0, xsna.y9q
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i != this.i) {
                return super.onPerformActionForVirtualView(i, i2, bundle);
            }
            fd6 fd6Var = this.h;
            CharSequence charSequence = fd6Var.v;
            if (!(charSequence instanceof Spanned)) {
                return false;
            }
            Spanned spanned = (Spanned) charSequence;
            rku0 rku0Var = (rku0) rl3.O(spanned.getSpans(0, spanned.length(), rku0.class));
            if (rku0Var == null) {
                return true;
            }
            rku0Var.f(fd6Var.getContext(), fd6Var);
            return true;
        }

        @Override // xsna.g2v0, xsna.y9q
        public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            if (i != this.i) {
                super.onPopulateEventForVirtualView(i, accessibilityEvent);
                return;
            }
            fd6 fd6Var = this.h;
            CharSequence charSequence = fd6Var.v;
            if (charSequence == null && (charSequence = fd6Var.getText()) == null) {
                charSequence = "";
            }
            accessibilityEvent.setContentDescription(charSequence);
        }

        @Override // xsna.g2v0, xsna.y9q
        public final void onPopulateNodeForVirtualView(int i, am amVar) {
            if (i != this.i) {
                super.onPopulateNodeForVirtualView(i, amVar);
                return;
            }
            fd6 fd6Var = this.h;
            CharSequence charSequence = fd6Var.v;
            if (charSequence == null && (charSequence = fd6Var.getText()) == null) {
                charSequence = "";
            }
            amVar.r(charSequence);
            amVar.t(true);
            amVar.o(true);
            RectF rectF = fd6Var.A;
            int i2 = (int) rectF.left;
            int i3 = (int) rectF.top;
            int i4 = (int) rectF.right;
            int i5 = (int) rectF.bottom;
            Rect rect = this.j;
            rect.set(i2, i3, i4, i5);
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
            }
            amVar.j(rect);
            amVar.a(16);
        }
    }

    /* compiled from: BaseExpandableText.kt */
    public static final class b extends a.b {
        public final fd6 b;

        public b(fd6 fd6Var) {
            this.b = fd6Var;
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final Context getContext() {
            return this.b.getContext();
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final Layout getLayout() {
            return this.b.w;
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final int getLineBounds(int i, Rect rect) {
            fd6 fd6Var = this.b;
            StaticLayout staticLayout = fd6Var.w;
            RectF rectF = fd6Var.A;
            if (staticLayout == null || rectF.isEmpty()) {
                if (rect != null) {
                    rect.setEmpty();
                }
                return 0;
            }
            if (rect != null) {
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            }
            return ((int) rectF.bottom) - staticLayout.getLineDescent(0);
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final CharSequence getText() {
            return this.b.v;
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final View getView() {
            return this.b;
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final void invalidate() {
            this.b.invalidate();
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final void playSoundEffect(int i) {
            this.b.playSoundEffect(0);
        }
    }

    public fd6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean e(Layout layout, int i) {
        int lineStart = layout.getLineStart(i + 1);
        CharSequence text = layout.getText();
        for (int lineStart2 = layout.getLineStart(i); lineStart2 < lineStart; lineStart2++) {
            char charAt = text.charAt(lineStart2);
            if (charAt != 10240 && !ro.j(charAt) && charAt != 8230 && charAt != 8229) {
                return false;
            }
        }
        return true;
    }

    private final v7q getCurrentExpandMeasureStrategy() {
        return (this.G && this.H == ExpandMeasureStrategy.ShowMoreLine) ? this.F : this.E;
    }

    private final int getSmallestWidth() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    private final void setLastVisibleLine(int i) {
        this.p = i;
        getCurrentExpandMeasureStrategy().c(this.p);
    }

    public void Ng() {
        int i = this.J;
        if (i != -1) {
            b(gpo0.d(i, this));
        }
        o7q o7qVar = this.D;
        if (o7qVar != null) {
            o7qVar.Ng();
        }
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText, com.vk.core.view.components.text.links.a.InterfaceC0867a
    public final void a(RectF rectF, float f) {
        RectF rectF2 = this.z;
        if (rectF2.isEmpty()) {
            return;
        }
        float centerX = (rectF2.centerX() - getPaddingLeft()) - f;
        float paddingTop = (rectF2.top - getPaddingTop()) + f;
        float f2 = rectF.top;
        if (f2 >= paddingTop && rectF.right > centerX) {
            rectF.right = centerX;
        } else {
            if (f2 >= paddingTop || rectF.bottom <= paddingTop) {
                return;
            }
            rectF.bottom = paddingTop;
        }
    }

    public final void b(int i) {
        this.I = i;
        int[] iArr = {0, i};
        this.K = iArr;
        this.u.setColors(iArr);
        this.t.setColor(rl3.a0(this.K));
    }

    public final void f() {
        Layout layout = getLayout();
        if (!getCurrentExpandMeasureStrategy().g()) {
            o7q o7qVar = this.D;
            if (o7qVar != null) {
                int measuredHeight = getMeasuredHeight();
                if (o7qVar.g) {
                    o7qVar.e.bottom = measuredHeight;
                }
                o7qVar.d = false;
                com.vk.core.view.components.text.links.a aVar = o7qVar.b;
                if (aVar != null) {
                    aVar.j = Integer.MAX_VALUE;
                    return;
                }
                return;
            }
            return;
        }
        int lineBottom = layout.getLineBottom(this.p);
        o7q o7qVar2 = this.D;
        if (o7qVar2 != null) {
            int i = this.p;
            o7qVar2.e.set(getPaddingLeft(), lineBottom, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
            com.vk.core.view.components.text.links.a aVar2 = o7qVar2.b;
            if (aVar2 != null) {
                aVar2.j = i + 1;
            }
            o7qVar2.d = true;
        }
    }

    public final int getMaxExcerptTextLines() {
        return this.q;
    }

    public final int getMinTrimmedTextLines() {
        return this.r;
    }

    public com.vk.core.view.components.text.links.a getShowMoreLinkDelegate() {
        return this.l;
    }

    public final void i() {
        Layout layout = getLayout();
        this.k = false;
        int lineVisibleEnd = !e(layout, this.p) ? layout.getLineVisibleEnd(this.p) : layout.getLineStart(this.p);
        StringBuilder sb = this.P;
        sb.setLength(0);
        sb.append(getText(), 0, lineVisibleEnd);
        if (this.L) {
            setContentDescription(sb);
        }
    }

    @Override // android.view.View, com.vk.core.view.components.text.links.a.InterfaceC0867a
    public final void invalidate() {
        if (this.o) {
            return;
        }
        super.invalidate();
    }

    public final void l() {
        this.k = true;
        StringBuilder sb = this.P;
        sb.setLength(0);
        sb.append(getText());
        if (this.L) {
            setContentDescription(sb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.vk.core.view.components.text.links.VkLinkedText, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        RectF rectF;
        boolean isEmpty;
        RectF rectF2;
        StaticLayout staticLayout;
        float f;
        super.onDraw(canvas);
        o7q o7qVar = this.D;
        if (o7qVar != null) {
            Paint paint = o7qVar.c;
            RectF rectF3 = o7qVar.e;
            if ((o7qVar.d || o7qVar.g) && !rectF3.isEmpty()) {
                paint.setColor(krv0.l(R.attr.vk_ui_background_content));
                if (o7qVar.g) {
                    float f2 = rectF3.top;
                    f = u11.b(rectF3.bottom, f2, o7qVar.f, f2);
                } else {
                    f = rectF3.top;
                }
                float f3 = f;
                float f4 = rectF3.left;
                float f5 = rectF3.right;
                float f6 = rectF3.bottom;
                canvas2 = canvas;
                canvas2.drawRect(f4, f3, f5, f6, paint);
                rectF = this.z;
                if (!rectF.isEmpty()) {
                    float f7 = rectF.left;
                    float f8 = rectF.top;
                    int save = canvas2.save();
                    canvas2.translate(f7, f8);
                    this.u.draw(canvas2);
                    canvas2.restoreToCount(save);
                }
                RectF rectF4 = this.C;
                isEmpty = rectF4.isEmpty();
                Paint paint2 = this.t;
                if (!isEmpty) {
                    canvas2.drawRect(rectF4, paint2);
                }
                rectF2 = this.B;
                if (!rectF2.isEmpty()) {
                    canvas2.drawRect(rectF2, paint2);
                }
                staticLayout = this.w;
                if (staticLayout == null) {
                    RectF rectF5 = this.A;
                    if (rectF5.isEmpty()) {
                        return;
                    }
                    float f9 = rectF5.left;
                    float f10 = rectF5.top;
                    int save2 = canvas2.save();
                    canvas2.translate(f9, f10);
                    getShowMoreLinkDelegate().a(canvas2);
                    staticLayout.draw(canvas2);
                    canvas2.restoreToCount(save2);
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        rectF = this.z;
        if (!rectF.isEmpty()) {
        }
        RectF rectF42 = this.C;
        isEmpty = rectF42.isEmpty();
        Paint paint22 = this.t;
        if (!isEmpty) {
        }
        rectF2 = this.B;
        if (!rectF2.isEmpty()) {
        }
        staticLayout = this.w;
        if (staticLayout == null) {
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.C;
        rectF.setEmpty();
        RectF rectF2 = this.A;
        rectF2.setEmpty();
        RectF rectF3 = this.B;
        rectF3.setEmpty();
        RectF rectF4 = this.z;
        rectF4.setEmpty();
        if (this.n && qv20.l(this)) {
            boolean z2 = getLayoutDirection() == 0;
            GradientDrawable.Orientation orientation = z2 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT;
            GradientDrawable gradientDrawable = this.u;
            if (gradientDrawable.getOrientation() != orientation) {
                gradientDrawable.setOrientation(orientation);
            }
            if (z2) {
                Layout layout = getLayout();
                boolean e = e(layout, this.p);
                float lineWidth = e ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : layout.getLineWidth(this.p);
                float lineTop = layout.getLineTop(this.p);
                getCurrentExpandMeasureStrategy().b(layout);
                float f2 = getCurrentExpandMeasureStrategy().f(lineTop);
                int ellipsisStart = layout.getEllipsisStart(this.p);
                float primaryHorizontal = ellipsisStart == 0 ? lineWidth : layout.getPrimaryHorizontal(layout.getLineStart(this.p) + ellipsisStart);
                float lineMax = layout.getLineMax(this.p);
                float f3 = f2 - lineTop;
                float paddingLeft = getPaddingLeft();
                float paddingTop = getPaddingTop() + lineTop;
                if (ellipsisStart != 0) {
                    rectF.set(primaryHorizontal, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, primaryHorizontal < lineMax ? lineMax : layout.getWidth(), f3);
                    rectF.offset(paddingLeft, paddingTop);
                }
                float f4 = 2 * f3;
                if (f4 <= lineWidth) {
                    lineWidth = f4;
                }
                float f5 = primaryHorizontal - lineWidth;
                StaticLayout staticLayout = this.w;
                if (staticLayout == null || this.x <= 0) {
                    l();
                    o7q o7qVar = this.D;
                    if (o7qVar != null) {
                        o7qVar.a(getMeasuredHeight());
                    }
                } else {
                    i();
                    float f6 = !e ? this.y : 0;
                    float f7 = (!e ? lineMax : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + this.x + f6;
                    float width = layout.getWidth();
                    if (f7 > width) {
                        f7 = width;
                    }
                    float f8 = f7 - this.x;
                    if (f8 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f8 = 0.0f;
                    }
                    if ((primaryHorizontal - f8) - f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = f6;
                        rectF3.set(f8 - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, primaryHorizontal, f3);
                        rectF3.offset(paddingLeft, paddingTop);
                    } else {
                        f = f6;
                    }
                    f();
                    float lineDescent = f3 - layout.getLineDescent(this.p);
                    int lineBottom = staticLayout.getLineBottom(0) - staticLayout.getLineTop(0);
                    int lineDescent2 = lineBottom - staticLayout.getLineDescent(0);
                    rectF2.set(f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.x + f8, lineBottom);
                    rectF2.offset(paddingLeft, (lineDescent - lineDescent2) + paddingTop);
                    f5 = (f8 - lineWidth) - f;
                    if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                }
                if ((rectF3.isEmpty() ? rectF2.left : rectF3.left) < lineMax + paddingLeft) {
                    rectF4.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineWidth, f3);
                    rectF4.offset(paddingLeft + f5, paddingTop);
                }
                gradientDrawable.setBounds(0, 0, an10.b(rectF4.width()), an10.b(rectF4.height()));
            } else {
                Layout layout2 = getLayout();
                boolean e2 = e(layout2, this.p);
                float lineWidth2 = e2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : layout2.getLineWidth(this.p);
                float width2 = layout2.getWidth();
                float f9 = width2 - lineWidth2;
                float f10 = f9 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f9;
                float lineTop2 = layout2.getLineTop(this.p);
                getCurrentExpandMeasureStrategy().b(layout2);
                float f11 = getCurrentExpandMeasureStrategy().f(lineTop2) - lineTop2;
                float paddingLeft2 = getPaddingLeft();
                float paddingTop2 = getPaddingTop() + lineTop2;
                float f12 = 2 * f11;
                if (f12 <= lineWidth2) {
                    lineWidth2 = f12;
                }
                float f13 = width2 - lineWidth2;
                StaticLayout staticLayout2 = this.w;
                if (staticLayout2 == null || this.x <= 0) {
                    l();
                    o7q o7qVar2 = this.D;
                    if (o7qVar2 != null) {
                        o7qVar2.a(getMeasuredHeight());
                    }
                } else {
                    i();
                    int i5 = !e2 ? this.y : 0;
                    float f14 = this.x;
                    float f15 = i5;
                    float f16 = (f10 - f14) - f15;
                    if (f16 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    f13 = f14 + f16 + f15;
                    float width3 = layout2.getWidth();
                    if (f13 > width3) {
                        f13 = width3;
                    }
                    if (f13 - f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        rectF3.set(f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13, f11);
                        rectF3.offset(paddingLeft2, paddingTop2);
                    }
                    f();
                    int lineBottom2 = staticLayout2.getLineBottom(0) - staticLayout2.getLineTop(0);
                    int lineDescent3 = lineBottom2 - staticLayout2.getLineDescent(0);
                    rectF2.set(f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.x + f16, lineBottom2);
                    rectF2.offset(paddingLeft2 + f15, ((f11 - layout2.getLineDescent(this.p)) - lineDescent3) + paddingTop2);
                }
                if ((rectF3.isEmpty() ? rectF2.right : rectF3.right) > f10 + paddingLeft2) {
                    rectF4.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineWidth2, f11);
                    rectF4.offset(paddingLeft2 + f13, paddingTop2);
                }
                gradientDrawable.setBounds(0, 0, an10.b(rectF4.width()), an10.b(rectF4.height()));
            }
        } else {
            l();
            o7q o7qVar3 = this.D;
            if (o7qVar3 != null) {
                o7qVar3.a(getMeasuredHeight());
            }
        }
        if (this.m && this.k) {
            setTextIsSelectable(true);
            setShouldSkipNextFocus(true);
            requestFocus();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int lineSpacingExtra;
        int lineForOffset;
        if (!this.n) {
            super.onMeasure(i, i2);
            return;
        }
        this.o = true;
        int smallestWidth = View.MeasureSpec.getMode(i) == 0 ? getSmallestWidth() : Math.min(View.MeasureSpec.getSize(i) - (getPaddingRight() + getPaddingLeft()), getSmallestWidth());
        if (getMaxLines() == Integer.MAX_VALUE) {
            Float f = this.s;
            int b2 = an10.b(smallestWidth * (f != null ? f.floatValue() : 1.0f)) / getLineHeight();
            if (b2 < 1) {
                b2 = 1;
            }
            this.q = b2;
            int i3 = this.r + b2;
            if (i3 >= b2) {
                b2 = i3;
            }
            setMaxLines(b2);
        }
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        int lineCount = layout.getLineCount() - 1;
        if (lineCount < 0) {
            lineCount = 0;
        }
        setLastVisibleLine(lineCount);
        CharSequence charSequence = this.v;
        if (this.w == null && charSequence != null && charSequence.length() != 0) {
            StaticLayout a2 = ylb.a((int) getPaint().measureText(charSequence.toString()), getPaint(), charSequence);
            this.x = (int) Math.ceil(a2.getLineWidth(0));
            this.y = (int) Math.ceil(Layout.getDesiredWidth(" ", getPaint()));
            this.w = a2;
        }
        int i4 = this.q;
        if (this.O) {
            Layout layout2 = getLayout();
            int i5 = this.q - 1;
            if (i5 < 0) {
                i5 = 0;
            }
            CharSequence text = getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                int nextSpanTransition = spanned.nextSpanTransition(-1, spanned.length(), uou0.class);
                if (nextSpanTransition != spanned.length() && (lineForOffset = layout2.getLineForOffset(nextSpanTransition)) < i5) {
                    int i6 = lineForOffset + 1;
                    this.q = i6;
                    setMaxLines(i6 + this.r);
                }
            }
            if (i4 != this.q) {
                super.onMeasure(i, i2);
            }
        }
        if (qv20.l(this) && layout.getLineCount() > this.q) {
            Layout layout3 = getLayout();
            int measuredHeight = getMeasuredHeight();
            int lineCount2 = getLineCount();
            int i7 = this.q - 1;
            if (i7 < 0) {
                i7 = 0;
            }
            setLastVisibleLine(i7);
            int i8 = lineCount2 - 1;
            int i9 = this.p + 1;
            if (i9 <= i8) {
                while (true) {
                    measuredHeight -= layout3.getLineBottom(i8) - layout3.getLineTop(i8);
                    if (i8 == i9) {
                        break;
                    } else {
                        i8--;
                    }
                }
            }
            if (this.N && getMeasuredHeight() != measuredHeight && 1 <= (lineSpacingExtra = (int) (getLineSpacingExtra() + 0.5f)) && lineSpacingExtra < measuredHeight) {
                measuredHeight -= lineSpacingExtra;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        int measuredHeight2 = getMeasuredHeight();
        int lineCount3 = getLineCount();
        int i10 = this.p + 1;
        if (lineCount3 > i10) {
            lineCount3 = i10;
        }
        if (lineCount3 < 1) {
            lineCount3 = 1;
        }
        int i11 = lineCount3 - 1;
        setLastVisibleLine(i11 < 0 ? 0 : i11);
        Layout layout4 = getLayout();
        int i12 = i11;
        while (true) {
            if (-1 >= i12) {
                break;
            }
            if (!e(layout4, i12)) {
                setLastVisibleLine(i12);
                break;
            } else {
                measuredHeight2 -= layout4.getLineBottom(i12) - layout4.getLineTop(i12);
                i12--;
            }
        }
        if (this.p != i11) {
            Layout layout5 = getLayout();
            if (this.w != null && this.x != 0) {
                if (layout5.getWidth() - layout5.getLineMax(this.p) <= this.x + this.y) {
                    setLastVisibleLine(this.p + 1);
                    this.H = ExpandMeasureStrategy.ShowMoreLine;
                    getCurrentExpandMeasureStrategy().c(this.p);
                    getCurrentExpandMeasureStrategy().b(layout4);
                    getCurrentExpandMeasureStrategy().d(this.w);
                    int e = getCurrentExpandMeasureStrategy().e();
                    if (e < 0) {
                        e = 0;
                    }
                    measuredHeight2 += e;
                    getCurrentExpandMeasureStrategy().a(e);
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight2);
                    this.o = false;
                }
            }
        }
        this.H = ExpandMeasureStrategy.TextLine;
        getCurrentExpandMeasureStrategy().c(this.p);
        getCurrentExpandMeasureStrategy().b(layout4);
        getCurrentExpandMeasureStrategy().d(this.w);
        getCurrentExpandMeasureStrategy().a(0);
        setMeasuredDimension(getMeasuredWidth(), measuredHeight2);
        this.o = false;
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText, android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        return getShowMoreLinkDelegate().b(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.o) {
            return;
        }
        super.requestLayout();
    }

    public final void setAvailableShowMoreExpandSpanMeasureStrategy(boolean z) {
        this.G = z;
    }

    public final void setExpandAnimationController(o7q o7qVar) {
        this.D = o7qVar;
        if (o7qVar != null) {
            o7qVar.b = getDelegate();
        }
    }

    public final void setGradientColor(int i) {
        b(i);
        this.J = -1;
    }

    public final void setGradientColorAttrRes(int i) {
        b(gpo0.d(i, this));
        this.J = i;
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText
    public void setHighlightCornerRadius(float f) {
        super.setHighlightCornerRadius(f);
        getShowMoreLinkDelegate().i = f;
    }

    public final void setIsTextSelectionFullVisibleTextEnabled(boolean z) {
        this.m = z;
    }

    public final void setMaxExcerptLines(int i) {
        if (this.q != i) {
            if (i < 1) {
                i = 1;
            }
            this.q = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setMaxExcerptTextLines(int i) {
        this.q = i;
    }

    public final void setMaxLinesRatio(Float f) {
        if (epx.e(this.s, f)) {
            return;
        }
        this.s = f;
        requestLayout();
        invalidate();
    }

    public final void setMinTrimmedLines(int i) {
        if (this.r != i) {
            this.r = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setMinTrimmedTextLines(int i) {
        this.r = i;
    }

    public final void setShouldExcludeExtraSpaceWhenTextTruncated(boolean z) {
        if (this.N != z) {
            this.N = z;
            requestLayout();
            invalidate();
        }
    }

    public final void setShouldTrimByCuttableSpans(boolean z) {
        if (this.O != z) {
            this.O = z;
            requestLayout();
            invalidate();
        }
    }

    public final void setShouldTruncate(boolean z) {
        if (this.n != z) {
            this.n = z;
            requestLayout();
            invalidate();
        }
    }

    public final void setShowMoreText(CharSequence charSequence) {
        if (TextUtils.equals(this.v, charSequence)) {
            return;
        }
        this.v = charSequence;
        this.w = null;
        this.x = 0;
        this.y = 0;
        invalidate();
    }

    public final void setTextSelectionFullVisibleTextEnabled(boolean z) {
        this.m = z;
    }

    @Override // com.vk.core.view.components.text.links.VkLinkedText
    public void setUseNewAccessibilityBehaviour(boolean z) {
        super.setUseNewAccessibilityBehaviour(z);
        if (this.L != z) {
            this.L = z;
            if (z) {
                setContentDescription(this.P);
            }
        }
    }

    public fd6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.k = true;
        this.l = new com.vk.core.view.components.text.links.a(new b(this));
        this.q = Integer.MAX_VALUE;
        Paint paint = new Paint();
        this.t = paint;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.u = gradientDrawable;
        this.z = new RectF();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new RectF();
        fw5 fw5Var = new fw5();
        this.E = fw5Var;
        this.F = new qij0(fw5Var);
        this.H = ExpandMeasureStrategy.TextLine;
        this.J = -1;
        this.M = -1.0f;
        this.P = new StringBuilder();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.o, 0, 0);
        try {
            this.I = obtainStyledAttributes.getColor(0, krv0.l(R.attr.vk_ui_background_content));
            obtainStyledAttributes.recycle();
            this.K = new int[]{0, this.I};
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            gradientDrawable.setColors(this.K);
            paint.setColor(rl3.a0(this.K));
            a aVar = new a(this);
            this.d = aVar;
            w6u0 w6u0Var = this.f;
            if (w6u0Var != null) {
                aVar.g = w6u0Var;
            }
            if (this.g && !aVar.e) {
                aVar.e = true;
                aVar.f = aVar.b.getContentDescription();
            }
            iut0.q(this, aVar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
