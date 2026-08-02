package com.vkontakte.android.ui.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vk.thirdparty.R$styleable;
import com.vk.typography.FontFamily;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import xsna.dc90;
import xsna.dhr0;
import xsna.ec90;
import xsna.f5h0;
import xsna.fc90;
import xsna.iah0;
import xsna.qb3;
import xsna.too0;
import xsna.u11;

/* loaded from: classes7.dex */
public class PagerSlidingTabStripBase extends HorizontalScrollView implements too0 {
    public static final int[] G = {R.attr.textSize, R.attr.textColor};
    public ColorStateList A;
    public Typeface B;
    public int C;
    public int D;
    public int E;
    public final Locale F;
    public LinearLayout.LayoutParams b;
    public final g c;
    public ArrayList d;
    public final LinearLayout e;
    public ViewPager f;
    public int g;
    public int h;
    public float i;
    public final Paint j;
    public final Paint k;
    public int l;
    public int m;
    public final int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public final int x;
    public int y;
    public int z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.b = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public final void onGlobalLayout() {
            PagerSlidingTabStripBase pagerSlidingTabStripBase = PagerSlidingTabStripBase.this;
            pagerSlidingTabStripBase.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int currentItem = pagerSlidingTabStripBase.f.getCurrentItem();
            pagerSlidingTabStripBase.getClass();
            pagerSlidingTabStripBase.h = currentItem;
            PagerSlidingTabStripBase.a(pagerSlidingTabStripBase, pagerSlidingTabStripBase.h, 0);
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PagerSlidingTabStripBase.this.f.setCurrentItem(this.b);
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PagerSlidingTabStripBase.this.f.setCurrentItem(this.b);
        }
    }

    public class d implements View.OnClickListener {
        public final /* synthetic */ int b;

        public d(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PagerSlidingTabStripBase.this.f.setCurrentItem(this.b);
        }
    }

    public interface e {
        String a();
    }

    public interface f {
        int a();
    }

    public class g implements ViewPager.j {
        public g() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            PagerSlidingTabStripBase pagerSlidingTabStripBase = PagerSlidingTabStripBase.this;
            if (i == 0) {
                PagerSlidingTabStripBase.a(pagerSlidingTabStripBase, pagerSlidingTabStripBase.f.getCurrentItem(), 0);
            }
            ArrayList arrayList = pagerSlidingTabStripBase.d;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ViewPager.j) it.next()).onPageScrollStateChanged(i);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            PagerSlidingTabStripBase pagerSlidingTabStripBase = PagerSlidingTabStripBase.this;
            if (pagerSlidingTabStripBase.e.getChildAt(i) != null) {
                pagerSlidingTabStripBase.h = i;
                pagerSlidingTabStripBase.i = f;
                PagerSlidingTabStripBase.a(pagerSlidingTabStripBase, i, (int) (r1.getWidth() * f));
                pagerSlidingTabStripBase.invalidate();
                ArrayList arrayList = pagerSlidingTabStripBase.d;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ViewPager.j) it.next()).onPageScrolled(i, f, i2);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            int[] iArr = PagerSlidingTabStripBase.G;
            PagerSlidingTabStripBase pagerSlidingTabStripBase = PagerSlidingTabStripBase.this;
            pagerSlidingTabStripBase.h = i;
            pagerSlidingTabStripBase.g();
            ArrayList arrayList = pagerSlidingTabStripBase.d;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ViewPager.j) it.next()).onPageSelected(i);
                }
            }
        }
    }

    public interface h {
        Drawable a();
    }

    public interface i {
        String a();
    }

    public PagerSlidingTabStripBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new g();
        this.h = 0;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = -10066330;
        this.m = 436207616;
        this.n = -1;
        this.o = 436207616;
        this.p = false;
        this.q = true;
        this.r = true;
        this.s = 52;
        this.t = 8;
        this.u = 2;
        this.v = 12;
        this.w = 24;
        this.x = 0;
        this.y = 12;
        this.z = -10066330;
        this.B = null;
        this.C = 1;
        this.D = 0;
        this.E = com.vkontakte.android.R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.e = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(1);
        addView(linearLayout);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.s = (int) TypedValue.applyDimension(1, this.s, displayMetrics);
        this.t = (int) TypedValue.applyDimension(1, this.t, displayMetrics);
        this.u = (int) TypedValue.applyDimension(1, this.u, displayMetrics);
        this.v = (int) TypedValue.applyDimension(1, this.v, displayMetrics);
        this.w = (int) TypedValue.applyDimension(1, this.w, displayMetrics);
        int applyDimension = (int) TypedValue.applyDimension(1, 1, displayMetrics);
        this.y = (int) TypedValue.applyDimension(1, this.y, displayMetrics);
        int applyDimension2 = (int) TypedValue.applyDimension(1, 0, displayMetrics);
        this.x = applyDimension2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G);
        this.y = obtainStyledAttributes.getDimensionPixelSize(0, this.y);
        this.z = obtainStyledAttributes.getColor(1, this.z);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        this.l = obtainStyledAttributes2.getColor(2, this.l);
        this.m = obtainStyledAttributes2.getColor(8, this.m);
        this.n = dhr0.A("underlineColor", attributeSet);
        this.o = obtainStyledAttributes2.getColor(0, this.o);
        this.t = obtainStyledAttributes2.getDimensionPixelSize(3, this.t);
        this.u = obtainStyledAttributes2.getDimensionPixelSize(9, this.u);
        this.w = obtainStyledAttributes2.getDimensionPixelSize(7, this.w);
        this.E = obtainStyledAttributes2.getResourceId(4, this.E);
        this.p = obtainStyledAttributes2.getBoolean(6, this.p);
        this.s = obtainStyledAttributes2.getDimensionPixelSize(5, this.s);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(1, applyDimension2);
        this.x = dimensionPixelSize;
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(applyDimension);
        linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.b = new LinearLayout.LayoutParams(-2, -1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.F == null) {
            this.F = getResources().getConfiguration().locale;
        }
    }

    public static void a(PagerSlidingTabStripBase pagerSlidingTabStripBase, int i2, int i3) {
        LinearLayout linearLayout = pagerSlidingTabStripBase.e;
        if (pagerSlidingTabStripBase.g == 0 || i2 >= linearLayout.getChildCount() || i2 < 0) {
            return;
        }
        int left = (linearLayout.getChildAt(i2).getLeft() + i3) - pagerSlidingTabStripBase.x;
        if (i2 > 0 || i3 > 0) {
            left -= pagerSlidingTabStripBase.s;
        }
        if (left != pagerSlidingTabStripBase.D) {
            pagerSlidingTabStripBase.D = left;
            pagerSlidingTabStripBase.scrollTo(left, 0);
        }
    }

    private void setStyle(TextView textView) {
        textView.setTextSize(0, this.y);
        textView.setTypeface(this.B, this.C);
        ColorStateList colorStateList = this.A;
        if (colorStateList == null) {
            textView.setTextColor(this.z);
        } else {
            textView.setTextColor(colorStateList);
        }
        if (this.r) {
            textView.setAllCaps(true);
        }
    }

    public void Ng() {
        int i2 = this.n;
        if (i2 != -1) {
            setUnderlineColor(dhr0.t.c(i2));
        }
    }

    public final void b(int i2, h hVar) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setFocusable(true);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
        imageButton.setImageDrawable(hVar.a());
        imageButton.setOnClickListener(new d(i2));
        this.e.addView(imageButton);
    }

    public final void c(int i2, CharSequence charSequence) {
        TextView textView = new TextView(getContext());
        textView.setText(charSequence);
        textView.setFocusable(true);
        textView.setGravity(17);
        textView.setSingleLine();
        textView.setOnClickListener(new b(i2));
        setStyle(textView);
        this.e.addView(textView);
    }

    public final void d(int i2, i iVar) {
        VKImageView vKImageView = new VKImageView(getContext());
        vKImageView.setFocusable(true);
        vKImageView.getHierarchy().o(f5h0.g.a);
        vKImageView.o0(iVar.a(), null);
        vKImageView.setOnClickListener(new c(i2));
        this.e.addView(vKImageView);
    }

    public final void e() {
        LinearLayout linearLayout;
        int width = getWidth();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            linearLayout = this.e;
            if (i2 >= linearLayout.getChildCount()) {
                break;
            }
            linearLayout.getChildAt(i2).measure(Integer.MIN_VALUE | width, 1073741824 | getHeight());
            i3 += linearLayout.getChildAt(i2).getMeasuredWidth();
            i2++;
        }
        boolean z = (Math.abs(width - i3) < iah0.a(50.0f) && this.q) || this.p;
        for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
            View childAt = linearLayout.getChildAt(i4);
            if (z) {
                if (i4 >= 0) {
                    childAt.setPadding(0, 0, 0, 0);
                }
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else {
                if (i4 >= 0) {
                    int i5 = this.w;
                    childAt.setPadding(i5, 0, i5, 0);
                }
                childAt.setLayoutParams(this.b);
            }
        }
    }

    public void f() {
        LinearLayout linearLayout = this.e;
        linearLayout.removeAllViews();
        this.g = this.f.getAdapter().getCount();
        for (int i2 = 0; i2 < this.g; i2++) {
            if (this.f.getAdapter() instanceof f) {
                int a2 = ((f) this.f.getAdapter()).a();
                ImageButton imageButton = new ImageButton(getContext());
                imageButton.setFocusable(true);
                imageButton.setImageResource(a2);
                imageButton.setOnClickListener(new ec90(this, i2));
                linearLayout.addView(imageButton);
            } else if ((this.f.getAdapter() instanceof i) && (this.f.getAdapter() instanceof h)) {
                if (TextUtils.isEmpty(((i) this.f.getAdapter()).a())) {
                    b(i2, (h) this.f.getAdapter());
                } else {
                    d(i2, (i) this.f.getAdapter());
                }
            } else if (this.f.getAdapter() instanceof i) {
                d(i2, (i) this.f.getAdapter());
            } else if (this.f.getAdapter() instanceof h) {
                b(i2, (h) this.f.getAdapter());
            } else if (this.f.getAdapter() instanceof e) {
                CharSequence pageTitle = this.f.getAdapter().getPageTitle(i2);
                String a3 = ((e) this.f.getAdapter()).a();
                if (a3 == null) {
                    c(i2, pageTitle);
                } else {
                    TextView textView = new TextView(getContext());
                    textView.setText(pageTitle);
                    textView.setFocusable(true);
                    textView.setGravity(17);
                    textView.setSingleLine();
                    textView.setPadding(0, 0, iah0.a(5.0f), 0);
                    com.vk.typography.b.f(textView, FontFamily.REGULAR);
                    TextView textView2 = new TextView(getContext());
                    textView2.setText(a3);
                    textView2.setTextColor(-1);
                    com.vk.typography.b.k(textView2, FontFamily.BOLD, Float.valueOf(13.0f), 4);
                    textView2.setBackgroundResource(com.vkontakte.android.R.drawable.badge_tab);
                    LinearLayout linearLayout2 = new LinearLayout(getContext());
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(17);
                    linearLayout2.addView(textView);
                    linearLayout2.addView(textView2);
                    linearLayout2.setOnClickListener(new dc90(this, i2));
                    linearLayout.addView(linearLayout2);
                }
            } else {
                c(i2, this.f.getAdapter().getPageTitle(i2));
            }
        }
        g();
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
        if (getWidth() > 0) {
            e();
        } else {
            getViewTreeObserver().addOnPreDrawListener(new fc90(this));
        }
    }

    public final void g() {
        int i2 = 0;
        while (i2 < this.g) {
            View childAt = this.e.getChildAt(i2);
            childAt.setLayoutParams(this.b);
            childAt.setBackgroundResource(this.E);
            if (this.p) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else {
                int i3 = this.w;
                childAt.setPadding(i3, 0, i3, 0);
            }
            if (childAt instanceof TextView) {
                setStyle((TextView) childAt);
            }
            if (childAt instanceof LinearLayout) {
                setStyle((TextView) ((LinearLayout) childAt).getChildAt(0));
            }
            childAt.setSelected(i2 == this.h);
            i2++;
        }
    }

    public int getDividerColor() {
        return this.o;
    }

    public int getDividerPadding() {
        return this.v;
    }

    public ColorStateList getInactiveTabTextColor() {
        return this.A;
    }

    public int getIndicatorColor() {
        return this.l;
    }

    public int getIndicatorHeight() {
        return this.t;
    }

    public int getScrollOffset() {
        return this.s;
    }

    public boolean getShouldExpand() {
        return this.p;
    }

    public int getTabBackground() {
        return this.E;
    }

    public int getTabPaddingLeftRight() {
        return this.w;
    }

    public int getTextColor() {
        return this.z;
    }

    public int getTextSize() {
        return this.y;
    }

    public int getUnderlineColor() {
        return this.m;
    }

    public int getUnderlineHeight() {
        return this.u;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (isInEditMode() || this.g == 0) {
            return;
        }
        int height = getHeight();
        int i3 = this.m;
        Paint paint = this.j;
        paint.setColor(i3);
        float f2 = height - this.u;
        LinearLayout linearLayout = this.e;
        float f3 = height;
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, linearLayout.getWidth(), f3, paint);
        paint.setColor(this.l);
        int i4 = this.g;
        View childAt = linearLayout.getChildAt(this.h);
        if (childAt == null) {
            return;
        }
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.i > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i2 = this.h) < i4 - 1) {
            View childAt2 = linearLayout.getChildAt(i2 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f4 = this.i;
            left = u11.b(1.0f, f4, left, left2 * f4);
            right = u11.b(1.0f, f4, right, right2 * f4);
        }
        canvas.drawRect(left, height - this.t, right, f3, paint);
        int i5 = this.o;
        Paint paint2 = this.k;
        paint2.setColor(i5);
        for (int i6 = 0; i6 < i4 - 1; i6++) {
            View childAt3 = linearLayout.getChildAt(i6);
            canvas.drawLine(childAt3.getRight(), this.v, childAt3.getRight(), height - this.v, paint2);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.p || View.MeasureSpec.getMode(i2) == 0) {
            return;
        }
        this.e.measure(getMeasuredWidth() | 1073741824, i3);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.h = savedState.b;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.h;
        return savedState;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (this.p) {
            return;
        }
        post(new qb3(this, 9));
    }

    public void setAllCaps(boolean z) {
        this.r = z;
    }

    public void setAutoExpand(boolean z) {
        this.q = z;
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        g();
        requestLayout();
    }

    public void setDefaultTabLayoutParams(LinearLayout.LayoutParams layoutParams) {
        this.b = layoutParams;
    }

    public void setDividerColor(int i2) {
        this.o = i2;
        invalidate();
    }

    public void setDividerColorResource(int i2) {
        this.o = getResources().getColor(i2);
        invalidate();
    }

    public void setDividerPadding(int i2) {
        this.v = i2;
        invalidate();
    }

    public void setIndicatorColor(int i2) {
        this.l = i2;
        invalidate();
    }

    public void setIndicatorColorResource(int i2) {
        this.l = getResources().getColor(i2);
        invalidate();
    }

    public void setIndicatorHeight(int i2) {
        this.t = i2;
        invalidate();
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.j jVar) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(jVar);
    }

    public void setScrollOffset(int i2) {
        this.s = i2;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.p = z;
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        g();
        requestLayout();
    }

    public void setTabBackground(int i2) {
        this.E = i2;
        g();
    }

    public void setTabPaddingLeftRight(int i2) {
        this.w = i2;
        g();
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        g();
    }

    public void setTextColorResource(int i2) {
        this.z = getResources().getColor(i2);
        g();
    }

    public void setTextSize(int i2) {
        this.y = i2;
        g();
    }

    public void setUnderlineColor(int i2) {
        this.m = i2;
        invalidate();
    }

    public void setUnderlineColorResource(int i2) {
        this.m = getResources().getColor(i2);
        invalidate();
    }

    public void setUnderlineHeight(int i2) {
        this.u = i2;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.addOnPageChangeListener(this.c);
        f();
    }

    public void setTextColor(int i2) {
        this.z = i2;
        g();
    }
}
