package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.feed.design.view.newsfeed.text.BaseChipTextView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.hbc;
import xsna.t1q;

/* compiled from: TextWithChipsContainer.kt */
/* loaded from: classes18.dex */
public final class xno0 extends ViewGroup {
    public final LayoutInflater b;
    public final VkLinkedText c;
    public final Object d;
    public final h3g0 e;
    public final Object f;
    public final Object g;
    public t1q h;
    public final d i;
    public b j;
    public final int k;
    public final Object l;
    public final Object m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public final StringBuilder q;
    public boolean r;
    public boolean s;

    /* compiled from: TextWithChipsContainer.kt */
    public final class a extends b {
        public final int b;

        public a(int i) {
            super();
            this.b = i;
        }

        @Override // xsna.xno0.b
        public final void c() {
            xno0 xno0Var = xno0.this;
            xno0Var.q.setLength(0);
            xno0Var.q.append(xno0Var.c.getText());
            xno0Var.c.setContentDescription(xno0Var.q);
        }

        @Override // xsna.xno0.b
        public final void d() {
            xno0.a(xno0.this);
        }

        @Override // xsna.xno0.b
        public final void e() {
            Layout layout;
            xno0 xno0Var = xno0.this;
            int i = this.b;
            BaseChipTextView c = xno0.c(xno0Var, i);
            if (c == null || (layout = c.getLayout()) == null) {
                return;
            }
            int paddingLeft = c.getPaddingLeft() + xno0Var.getPaddingLeft();
            int paddingTop = xno0Var.getPaddingTop();
            if (bwt0.K(xno0Var.c)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xno0Var.c.getLayoutParams();
                paddingTop = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + xno0Var.c.getMeasuredHeight() + paddingTop;
            }
            for (int i2 = 0; i2 < i; i2++) {
                BaseChipTextView c2 = xno0.c(xno0Var, i2);
                if (c2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c2.getLayoutParams();
                    paddingTop = marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + c2.getMeasuredHeight() + paddingTop;
                }
            }
            a(layout, 0, paddingLeft, layout.getLineTop(0) + c.getPaddingTop() + paddingTop + ((ViewGroup.MarginLayoutParams) c.getLayoutParams()).topMargin);
        }

        @Override // xsna.xno0.b
        public final void f() {
            Layout layout;
            xno0 xno0Var = xno0.this;
            int i = this.b;
            BaseChipTextView c = xno0.c(xno0Var, i);
            if (c == null || (layout = c.getLayout()) == null) {
                return;
            }
            int i2 = -(c.getPaddingRight() + xno0Var.getPaddingRight());
            int paddingTop = xno0Var.getPaddingTop();
            if (bwt0.K(xno0Var.c)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xno0Var.c.getLayoutParams();
                paddingTop = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + xno0Var.c.getMeasuredHeight() + paddingTop;
            }
            for (int i3 = 0; i3 < i; i3++) {
                BaseChipTextView c2 = xno0.c(xno0Var, i3);
                if (c2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c2.getLayoutParams();
                    paddingTop = marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + c2.getMeasuredHeight() + paddingTop;
                }
            }
            b(layout, 0, i2, layout.getLineTop(0) + c.getPaddingTop() + paddingTop + ((ViewGroup.MarginLayoutParams) c.getLayoutParams()).topMargin);
        }

        @Override // xsna.xno0.b
        public final void g(int i) {
            xno0 xno0Var = xno0.this;
            int measuredHeight = xno0Var.getMeasuredHeight();
            int allChipCount = xno0Var.getAllChipCount() - 1;
            if (allChipCount < 0) {
                allChipCount = 0;
            }
            int i2 = this.b + 1;
            int i3 = new k9x(i2, allChipCount, 1).c;
            if (i2 <= i3) {
                while (true) {
                    BaseChipTextView c = xno0.c(xno0Var, i2);
                    if (c != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c.getLayoutParams();
                        measuredHeight = (measuredHeight - c.getMeasuredHeight()) - (marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                    }
                    if (i2 == i3) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            xno0Var.setMeasuredDimension(View.MeasureSpec.getSize(i), measuredHeight);
        }
    }

    /* compiled from: TextWithChipsContainer.kt */
    public abstract class b {
        public b() {
        }

        public final void a(Layout layout, int i, int i2, int i3) {
            xno0 xno0Var = xno0.this;
            Rect rect = xno0Var.n;
            int measuredWidth = xno0Var.getMeasuredWidth() - (xno0Var.getPaddingRight() + xno0Var.getPaddingLeft());
            if (measuredWidth < 0) {
                measuredWidth = 0;
            }
            int measuredWidth2 = xno0Var.getShowMoreView().getMeasuredWidth();
            int lineMax = ((int) layout.getLineMax(i)) + measuredWidth2;
            if (lineMax > measuredWidth) {
                lineMax = measuredWidth;
            }
            int i4 = lineMax - measuredWidth2;
            if (i4 < 0) {
                i4 = 0;
            }
            Layout layout2 = xno0Var.getShowMoreView().getLayout();
            if (layout2 == null) {
                return;
            }
            int lineBottom = layout.getLineBottom(i) - layout.getLineTop(i);
            int lineDescent = lineBottom - layout.getLineDescent(i);
            int measuredHeight = xno0Var.getShowMoreView().getMeasuredHeight();
            int lineDescent2 = measuredHeight - layout2.getLineDescent(0);
            rect.set(i4, 0, lineMax, measuredHeight);
            int i5 = (lineDescent - lineDescent2) + i3;
            if (lineMax == measuredWidth) {
                int i6 = rect.left;
                int i7 = i6 - (lineBottom * 2);
                if (i7 < 0) {
                    i7 = 0;
                }
                Rect rect2 = xno0Var.o;
                rect2.set(i7, 0, i6, lineBottom);
                rect2.offset(i2, i5);
                xno0Var.getGradientDrawable().setBounds(0, 0, rect2.width(), rect2.height());
                h(rect, i2, i3, lineBottom);
            }
            rect.offset(i2, i5);
            xno0Var.getShowMoreView().layout(rect.left, rect.top, rect.right, rect.bottom);
        }

        public final void b(Layout layout, int i, int i2, int i3) {
            int lineWidth = (int) layout.getLineWidth(i);
            xno0 xno0Var = xno0.this;
            Rect rect = xno0Var.n;
            int paddingRight = xno0Var.getPaddingRight() + xno0Var.getPaddingLeft();
            int measuredWidth = xno0Var.getMeasuredWidth();
            int i4 = measuredWidth - lineWidth;
            if (i4 < paddingRight) {
                i4 = paddingRight;
            }
            int measuredWidth2 = xno0Var.getShowMoreView().getMeasuredWidth();
            int i5 = i4 - measuredWidth2;
            if (i5 < paddingRight) {
                i5 = paddingRight;
            }
            int i6 = measuredWidth2 + i5;
            if (i6 <= measuredWidth) {
                measuredWidth = i6;
            }
            Layout layout2 = xno0Var.getShowMoreView().getLayout();
            if (layout2 == null) {
                return;
            }
            int lineBottom = layout.getLineBottom(i) - layout.getLineTop(i);
            int lineDescent = lineBottom - layout.getLineDescent(i);
            int measuredHeight = xno0Var.getShowMoreView().getMeasuredHeight();
            int lineDescent2 = measuredHeight - layout2.getLineDescent(0);
            rect.set(i5, 0, measuredWidth, measuredHeight);
            int i7 = (lineDescent - lineDescent2) + i3;
            if (i5 == paddingRight) {
                int i8 = rect.right;
                Rect rect2 = xno0Var.o;
                rect2.set(i8, 0, (lineBottom * 2) + i8, lineBottom);
                rect2.offset(i2, i7);
                xno0Var.getGradientDrawable().setBounds(0, 0, rect2.width(), rect2.height());
                h(rect, i2, i3, lineBottom);
            }
            rect.offset(i2, i7);
            xno0Var.getShowMoreView().layout(rect.left, rect.top, rect.right, rect.bottom);
        }

        public abstract void c();

        public abstract void d();

        public abstract void e();

        public abstract void f();

        public abstract void g(int i);

        public final void h(Rect rect, int i, int i2, int i3) {
            int i4 = rect.left;
            int i5 = rect.right;
            xno0 xno0Var = xno0.this;
            Rect rect2 = xno0Var.p;
            rect2.set(i4, 0, i5, i3);
            rect2.offset(i, i2);
            xno0Var.getShowMoreBgDrawable().setBounds(0, 0, rect2.width(), rect2.height());
        }
    }

    /* compiled from: TextWithChipsContainer.kt */
    public final class c {
        public c() {
        }

        public final int a(int i) {
            Layout layout = xno0.this.c.getLayout();
            if (layout != null) {
                for (int i2 = i; -1 < i2; i2--) {
                    int lineStart = layout.getLineStart(i2 + 1);
                    CharSequence text = layout.getText();
                    for (int lineStart2 = layout.getLineStart(i2); lineStart2 < lineStart; lineStart2++) {
                        char charAt = text.charAt(lineStart2);
                        if (charAt != 10240 && !ro.j(charAt)) {
                            return i2;
                        }
                    }
                }
            }
            return i;
        }
    }

    /* compiled from: TextWithChipsContainer.kt */
    public final class e extends b {
        public final int b;

        public e(int i) {
            super();
            this.b = i;
        }

        @Override // xsna.xno0.b
        public final void c() {
            xno0 xno0Var = xno0.this;
            Layout layout = xno0Var.c.getLayout();
            if (layout == null) {
                return;
            }
            int lineVisibleEnd = layout.getLineVisibleEnd(this.b);
            xno0Var.q.setLength(0);
            xno0Var.q.append(xno0Var.c.getText(), 0, lineVisibleEnd);
            xno0Var.c.setContentDescription(xno0Var.q);
        }

        @Override // xsna.xno0.b
        public final void d() {
            xno0.a(xno0.this);
        }

        @Override // xsna.xno0.b
        public final void e() {
            xno0 xno0Var = xno0.this;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xno0Var.c.getLayoutParams();
            Layout layout = xno0Var.c.getLayout();
            if (layout == null) {
                return;
            }
            int paddingLeft = xno0Var.c.getPaddingLeft() + xno0Var.getPaddingLeft();
            int paddingTop = xno0Var.c.getPaddingTop() + xno0Var.getPaddingTop() + marginLayoutParams.topMargin;
            int i = this.b;
            a(layout, i, paddingLeft, layout.getLineTop(i) + paddingTop);
        }

        @Override // xsna.xno0.b
        public final void f() {
            xno0 xno0Var = xno0.this;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xno0Var.c.getLayoutParams();
            Layout layout = xno0Var.c.getLayout();
            if (layout == null) {
                return;
            }
            int i = -(xno0Var.c.getPaddingRight() + xno0Var.getPaddingRight());
            int paddingTop = xno0Var.c.getPaddingTop() + xno0Var.getPaddingTop() + marginLayoutParams.topMargin;
            int i2 = this.b;
            b(layout, i2, i, layout.getLineTop(i2) + paddingTop);
        }

        @Override // xsna.xno0.b
        public final void g(int i) {
            int i2;
            xno0 xno0Var = xno0.this;
            VkLinkedText vkLinkedText = xno0Var.c;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vkLinkedText.getLayoutParams();
            int paddingBottom = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + vkLinkedText.getPaddingBottom() + vkLinkedText.getPaddingTop() + xno0Var.getPaddingBottom() + xno0Var.getPaddingTop();
            Layout layout = vkLinkedText.getLayout();
            if (layout != null && (i2 = this.b) >= 0) {
                int i3 = 0;
                while (true) {
                    paddingBottom += layout.getLineBottom(i3) - layout.getLineTop(i3);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            xno0Var.setMeasuredDimension(View.MeasureSpec.getSize(i), paddingBottom);
        }
    }

    public xno0(Context context) {
        super(context, null, 0);
        LayoutInflater from = LayoutInflater.from(context);
        this.b = from;
        VkLinkedText vkLinkedText = (VkLinkedText) from.inflate(R.layout.pds_text_with_chips_main_text, (ViewGroup) this, false);
        addView(vkLinkedText, new ViewGroup.MarginLayoutParams(-1, -2));
        this.c = vkLinkedText;
        v5n0 v5n0Var = new v5n0(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, v5n0Var);
        this.e = new h3g0(7);
        this.f = msy.a(lazyThreadSafetyMode, new t970(12));
        this.g = msy.a(lazyThreadSafetyMode, new wzb0(this, 17));
        this.h = t1q.a.a;
        d dVar = new d();
        this.i = dVar;
        this.j = dVar;
        this.k = krv0.m(R.attr.vk_ui_background_content, context);
        this.l = msy.a(lazyThreadSafetyMode, new dei0(this, 14));
        this.m = msy.a(lazyThreadSafetyMode, new iml0(this, 3));
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        StringBuilder sb = new StringBuilder();
        this.q = sb;
        setId(R.id.text_with_chips_container_view);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setImportantForAccessibility(2);
        setContentDescription(null);
        setPadding(cn70.b(16), cn70.b(8), cn70.b(16), cn70.b(4));
        vkLinkedText.setCanShowMessageOptions(true);
        vkLinkedText.setUseNewAccessibilityBehaviour(true);
        vkLinkedText.setContentDescription(sb);
    }

    public static final void a(xno0 xno0Var) {
        xno0Var.addViewInLayout(xno0Var.getShowMoreView(), -1, xno0Var.getShowMoreView().getLayoutParams(), true);
    }

    public static final BaseChipTextView c(xno0 xno0Var, int i) {
        int childCount = xno0Var.getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                return null;
            }
            View childAt = xno0Var.getChildAt(i2);
            if (childAt != null) {
                BaseChipTextView baseChipTextView = childAt instanceof BaseChipTextView ? (BaseChipTextView) childAt : null;
                if (baseChipTextView == null) {
                    continue;
                } else {
                    if (i3 == i) {
                        return baseChipTextView;
                    }
                    i3++;
                }
            }
            i2++;
        }
    }

    public static final void g(xno0 xno0Var) {
        xno0Var.removeViewInLayout(xno0Var.getShowMoreView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAllChipCount() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                if ((childAt instanceof BaseChipTextView ? (BaseChipTextView) childAt : null) != null) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<BaseChipTextView> getChipViewListBuffer() {
        return (List) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final c getExcerptStrategyPicker() {
        return (c) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final GradientDrawable getGradientDrawable() {
        return (GradientDrawable) this.m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ColorDrawable getShowMoreBgDrawable() {
        return (ColorDrawable) this.l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkText getShowMoreView() {
        return (VkText) this.d.getValue();
    }

    private final int getSmallestWidth() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Rect rect = this.o;
        if (rect.isEmpty()) {
            return;
        }
        float f = rect.left;
        float f2 = rect.top;
        int save = canvas.save();
        canvas.translate(f, f2);
        getGradientDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (epx.f(view, getShowMoreView())) {
            Rect rect = this.p;
            if (!rect.isEmpty()) {
                float f = rect.left;
                float f2 = rect.top;
                int save = canvas.save();
                canvas.translate(f, f2);
                getShowMoreBgDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final t1q getCurrentExcerptType() {
        return this.h;
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return this.c.getCustomSelectionActionModeCallback();
    }

    public final BaseChipTextView i(hbc hbcVar, String str) {
        int i;
        BaseChipTextView baseChipTextView = (BaseChipTextView) ((tvb0) this.e.b).c();
        if (baseChipTextView == null) {
            baseChipTextView = (BaseChipTextView) LayoutInflater.from(getContext()).inflate(R.layout.pds_text_with_chips_link_chip, (ViewGroup) this, false);
        }
        boolean z = hbcVar instanceof hbc.b;
        if (z) {
            i = R.id.author_chip_view;
        } else if (hbcVar instanceof hbc.a.b) {
            i = R.id.link_chip_view;
        } else {
            if (!(hbcVar instanceof hbc.a.C2984a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.id.file_chip_view;
        }
        baseChipTextView.setId(i);
        baseChipTextView.getContext();
        hfo0 hfo0Var = com.vk.feed.design.view.newsfeed.text.c.a;
        if (!z && !(hbcVar instanceof hbc.a.b)) {
            if (!(hbcVar instanceof hbc.a.C2984a)) {
                throw new NoWhenBranchMatchedException();
            }
            hfo0Var = new com.vk.feed.design.view.newsfeed.text.d();
        }
        baseChipTextView.setEllipsizeDelegate$design_release(hfo0Var);
        Context context = baseChipTextView.getContext();
        int i2 = R.attr.vk_ui_text_secondary;
        if (!z) {
            if (hbcVar instanceof hbc.a.b) {
                i2 = R.attr.vk_ui_text_link;
            } else if (!(hbcVar instanceof hbc.a.C2984a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        baseChipTextView.setTextColor(krv0.m(i2, context));
        int i3 = R.style.VkUiTypography_FootnoteMedium;
        if (!z) {
            if (hbcVar instanceof hbc.a.b) {
                i3 = R.style.VkUiTypography_Paragraph;
            } else if (!(hbcVar instanceof hbc.a.C2984a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        baseChipTextView.setTextAppearance(i3);
        baseChipTextView.setTag(hbcVar);
        baseChipTextView.setText(str);
        bwt0.e0(baseChipTextView, 0, 0, 0, 0);
        baseChipTextView.getContext();
        return baseChipTextView;
    }

    public final void j() {
        getChipViewListBuffer().clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                BaseChipTextView baseChipTextView = childAt instanceof BaseChipTextView ? (BaseChipTextView) childAt : null;
                if (baseChipTextView != null) {
                    getChipViewListBuffer().add(baseChipTextView);
                }
            }
        }
        for (BaseChipTextView baseChipTextView2 : getChipViewListBuffer()) {
            removeView(baseChipTextView2);
            ((tvb0) this.e.b).a(baseChipTextView2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        if (r12 > r10) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, int i2, t1q t1qVar) {
        b bVar;
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null && !f4m.f(childAt) && childAt.getId() != R.id.show_more_view) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measureChildWithMargins(childAt, childAt instanceof BaseChipTextView ? View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (getPaddingRight() + getPaddingLeft()), Integer.MIN_VALUE) : i, 0, i2, 0);
                i3 = Math.max(i3, childAt.getMeasuredHeight() + i3 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i4 = Math.max(i4, childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i4, getSuggestedMinimumWidth()), i, i5), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i3, getSuggestedMinimumHeight()), i2, 0));
        measureChildWithMargins(getShowMoreView(), i, 0, i2, 0);
        c excerptStrategyPicker = getExcerptStrategyPicker();
        xno0 xno0Var = xno0.this;
        VkLinkedText vkLinkedText = xno0Var.c;
        if (!(t1qVar instanceof t1q.b)) {
            if (t1qVar instanceof t1q.c) {
                t1q.c cVar = (t1q.c) t1qVar;
                if (!f4m.f(vkLinkedText)) {
                    int smallestWidth = (int) (((i == 0 ? xno0Var.getSmallestWidth() : Math.min(View.MeasureSpec.getSize(i), xno0Var.getSmallestWidth())) - (xno0Var.getPaddingRight() + xno0Var.getPaddingLeft())) / vkLinkedText.getLineHeight());
                    Layout layout = vkLinkedText.getLayout();
                    if (layout != null) {
                        if (layout.getLineCount() > cVar.a + smallestWidth) {
                            int i7 = smallestWidth - 1;
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            bVar = xno0Var.new e(excerptStrategyPicker.a(i7));
                            if (bVar == null) {
                                r9 = xno0Var.getAllChipCount() >= 3 ? xno0Var.new a(0) : null;
                                if (r9 == null) {
                                    bVar = xno0Var.i;
                                }
                                bVar = r9;
                            }
                        }
                    }
                }
                bVar = null;
                if (bVar == null) {
                }
            } else {
                if (!(t1qVar instanceof t1q.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = xno0Var.i;
            }
            this.j = bVar;
            bVar.g(i);
        }
        t1q.b bVar2 = (t1q.b) t1qVar;
        int i8 = bVar2.b;
        int i9 = bVar2.a;
        if (!f4m.f(vkLinkedText)) {
            int i10 = i9 + i8;
            Layout layout2 = vkLinkedText.getLayout();
            if (layout2 != null) {
                int lineCount = layout2.getLineCount();
                if (lineCount <= i10) {
                    int allChipCount = xno0Var.getAllChipCount() + lineCount;
                    if (lineCount >= i9) {
                    }
                }
                int i11 = i9 - 1;
                if (i11 < 0) {
                    i11 = 0;
                }
                bVar = xno0Var.new e(excerptStrategyPicker.a(i11));
                if (bVar == null) {
                    Layout layout3 = vkLinkedText.getLayout();
                    if (layout3 != null) {
                        int lineCount2 = i9 - (bwt0.K(vkLinkedText) ? layout3.getLineCount() : 0);
                        if (lineCount2 < 0) {
                            lineCount2 = 0;
                        }
                        int allChipCount2 = xno0Var.getAllChipCount();
                        if (allChipCount2 >= 3) {
                            r9 = xno0Var.new a(0);
                        } else if (allChipCount2 > i8 + lineCount2) {
                            int i12 = lineCount2 - 1;
                            r9 = xno0Var.new a(i12 >= 0 ? i12 : 0);
                        }
                    }
                    if (r9 == null) {
                        bVar = xno0Var.i;
                    }
                    bVar = r9;
                }
                this.j = bVar;
                bVar.g(i);
            }
        }
        bVar = null;
        if (bVar == null) {
        }
        this.j = bVar;
        bVar.g(i);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 0;
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && !f4m.f(childAt) && childAt.getId() != R.id.show_more_view) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int i6 = paddingTop + marginLayoutParams.topMargin;
                if (z2) {
                    int paddingLeft = getPaddingLeft();
                    childAt.layout(paddingLeft, i6, measuredWidth + paddingLeft, i6 + measuredHeight);
                } else {
                    int measuredWidth2 = getMeasuredWidth() - getPaddingRight();
                    childAt.layout(measuredWidth2 - measuredWidth, i6, measuredWidth2, i6 + measuredHeight);
                }
                paddingTop = measuredHeight + marginLayoutParams.bottomMargin + i6;
            }
        }
        this.o.setEmpty();
        this.p.setEmpty();
        removeViewInLayout(getShowMoreView());
        b bVar = this.j;
        bVar.d();
        xno0 xno0Var = xno0.this;
        boolean z3 = xno0Var.getLayoutDirection() == 0;
        if (z3) {
            bVar.e();
        } else {
            bVar.f();
        }
        GradientDrawable gradientDrawable = xno0Var.getGradientDrawable();
        GradientDrawable.Orientation orientation = z3 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT;
        if (gradientDrawable.getOrientation() != orientation) {
            gradientDrawable.setOrientation(orientation);
        }
        bVar.c();
        if (this.r) {
            boolean z4 = this.j instanceof d;
            VkLinkedText vkLinkedText = this.c;
            vkLinkedText.setTextIsSelectable(z4);
            if (z4) {
                vkLinkedText.setShouldSkipNextFocus(true);
                vkLinkedText.requestFocus();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.c.setIncludeFontPadding(false);
        super.onMeasure(i, i2);
        k(i, i2, this.h);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.r || this.s) {
            super.requestChildFocus(view, view2);
        }
    }

    public final void setContainerViewsClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        getShowMoreView().setOnClickListener(onClickListener);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                BaseChipTextView baseChipTextView = childAt instanceof BaseChipTextView ? (BaseChipTextView) childAt : null;
                if (baseChipTextView != null) {
                    baseChipTextView.setOnClickListener(onClickListener);
                }
            }
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        this.c.setCustomSelectionActionModeCallback(callback);
    }

    public final void setExcerptType(t1q t1qVar) {
        this.h = t1qVar;
        requestLayout();
        invalidate();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnTextTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }

    public final void setRequestChildFocusEnabled(boolean z) {
        this.s = z;
    }

    public final void setText(CharSequence charSequence) {
        boolean z = false;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        }
        VkLinkedText vkLinkedText = this.c;
        vkLinkedText.setText(charSequence);
        f4m.E(vkLinkedText, z);
        requestLayout();
        invalidate();
    }

    public final void setTextIsSelectable(boolean z) {
        this.c.setTextIsSelectable(z);
    }

    public final void setTextIsSelectableInFullExcerptType(boolean z) {
        this.r = z;
        this.c.setShouldIgnoreScrollAfterGainFocus(z);
    }

    /* compiled from: TextWithChipsContainer.kt */
    public final class d extends b {
        public d() {
            super();
        }

        @Override // xsna.xno0.b
        public final void c() {
            xno0 xno0Var = xno0.this;
            xno0Var.q.setLength(0);
            xno0Var.q.append(xno0Var.c.getText());
            xno0Var.c.setContentDescription(xno0Var.q);
        }

        @Override // xsna.xno0.b
        public final void d() {
            xno0.g(xno0.this);
        }

        @Override // xsna.xno0.b
        public final void e() {
        }

        @Override // xsna.xno0.b
        public final void f() {
        }

        @Override // xsna.xno0.b
        public final void g(int i) {
        }
    }
}
