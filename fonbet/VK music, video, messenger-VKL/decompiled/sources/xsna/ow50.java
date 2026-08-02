package xsna;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.k;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$string;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import xsna.a5p0;
import xsna.am;
import xsna.iut0;

/* compiled from: NavigationBarItemView.java */
/* loaded from: classes13.dex */
public abstract class ow50 extends FrameLayout implements k.a {
    public static final int[] H = {R.attr.state_checked};
    public static final c I = new c();
    public static final d J = new d();
    public float A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public int F;

    @Nullable
    public com.google.android.material.badge.a G;
    public boolean b;
    public ColorStateList c;

    @Nullable
    public Drawable d;
    public int e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public int k;
    public boolean l;

    @Nullable
    public final FrameLayout m;

    @Nullable
    public final View n;
    public final ImageView o;
    public final ViewGroup p;
    public final TextView q;
    public final TextView r;
    public int s;
    public int t;

    @Nullable
    public androidx.appcompat.view.menu.h u;

    @Nullable
    public ColorStateList v;

    @Nullable
    public Drawable w;

    @Nullable
    public Drawable x;
    public ValueAnimator y;
    public c z;

    /* compiled from: NavigationBarItemView.java */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            com.google.android.material.badge.a aVar;
            ow50 ow50Var = ow50.this;
            ImageView imageView = ow50Var.o;
            if (imageView.getVisibility() != 0 || (aVar = ow50Var.G) == null) {
                return;
            }
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(imageView, null);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    public class b implements Runnable {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ow50.this.i(this.b);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    public static class c {
        public float a(float f, float f2) {
            return 1.0f;
        }
    }

    /* compiled from: NavigationBarItemView.java */
    public static class d extends c {
        @Override // xsna.ow50.c
        public final float a(float f, float f2) {
            return rq2.a(0.4f, 1.0f, f);
        }
    }

    public ow50(@NonNull Context context) {
        super(context);
        this.b = false;
        this.s = -1;
        this.t = 0;
        this.z = I;
        this.A = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.E = false;
        this.F = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.m = (FrameLayout) findViewById(R$id.navigation_bar_item_icon_container);
        this.n = findViewById(R$id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R$id.navigation_bar_item_icon_view);
        this.o = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R$id.navigation_bar_item_labels_group);
        this.p = viewGroup;
        TextView textView = (TextView) findViewById(R$id.navigation_bar_item_small_label_view);
        this.q = textView;
        TextView textView2 = (TextView) findViewById(R$id.navigation_bar_item_large_label_view);
        this.r = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.e = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f = viewGroup.getPaddingBottom();
        this.g = getResources().getDimensionPixelSize(R$dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(TextView textView, int i) {
        int i2;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(R$styleable.TextAppearance_android_textSize, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                i2 = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                if (i2 == 0) {
                    textView.setTextSize(0, i2);
                    return;
                }
                return;
            }
        }
        i2 = 0;
        if (i2 == 0) {
        }
    }

    public static void g(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.m;
        return frameLayout != null ? frameLayout : this.o;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof ow50) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.G;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.G.f.b.x.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.o.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(int i, int i2, @NonNull View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void j(int i, @NonNull View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void a(float f, float f2) {
        this.h = f - f2;
        this.i = (f2 * 1.0f) / f;
        this.j = (f * 1.0f) / f2;
    }

    public final void b() {
        androidx.appcompat.view.menu.h hVar = this.u;
        if (hVar != null) {
            setChecked(hVar.isChecked());
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(@NonNull androidx.appcompat.view.menu.h hVar) {
        this.u = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.e);
        setId(hVar.a);
        if (!TextUtils.isEmpty(hVar.q)) {
            setContentDescription(hVar.q);
        }
        a5p0.a.a(this, !TextUtils.isEmpty(hVar.r) ? hVar.r : hVar.e);
        setVisibility(hVar.isVisible() ? 0 : 8);
        this.b = true;
    }

    public final void d() {
        Drawable drawable = this.d;
        ColorStateList colorStateList = this.c;
        FrameLayout frameLayout = this.m;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.B && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(olg0.c(this.c), null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(olg0.a(this.c), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.m;
        if (frameLayout != null && this.B) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f, float f2) {
        View view = this.n;
        if (view != null) {
            c cVar = this.z;
            cVar.getClass();
            view.setScaleX(rq2.a(0.4f, 1.0f, f));
            view.setScaleY(cVar.a(f, f2));
            view.setAlpha(rq2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.8f : 0.0f, f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : 0.2f, f));
        }
        this.A = f;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.n;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public com.google.android.material.badge.a getBadge() {
        return this.G;
    }

    public int getItemBackgroundResId() {
        return R$drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    @Nullable
    public androidx.appcompat.view.menu.h getItemData() {
        return this.u;
    }

    public int getItemDefaultMarginResId() {
        return R$dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.s;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.p;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.g : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.p;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i) {
        View view = this.n;
        if (view == null || i <= 0) {
            return;
        }
        int min = Math.min(this.C, i - (this.F * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.E && this.k == 2) ? min : this.D;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.h hVar = this.u;
        if (hVar != null && hVar.isCheckable() && this.u.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, H);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.G;
        if (aVar != null && aVar.isVisible()) {
            androidx.appcompat.view.menu.h hVar = this.u;
            CharSequence charSequence = hVar.e;
            if (!TextUtils.isEmpty(hVar.q)) {
                charSequence = this.u.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.G.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) am.h.a(0, 1, getItemVisiblePosition(), 1, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) am.a.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R$string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new b(i));
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.n;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.B = z;
        d();
        View view = this.n;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.D = i;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.g != i) {
            this.g = i;
            b();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.F = i;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.E = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.C = i;
        i(getWidth());
    }

    public void setBadge(@NonNull com.google.android.material.badge.a aVar) {
        com.google.android.material.badge.a aVar2 = this.G;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.o;
        if (aVar2 != null && imageView != null && aVar2 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            com.google.android.material.badge.a aVar3 = this.G;
            if (aVar3 != null) {
                if (aVar3.d() != null) {
                    aVar3.d().setForeground(null);
                } else {
                    imageView.getOverlay().remove(aVar3);
                }
            }
            this.G = null;
        }
        this.G = aVar;
        if (imageView == null || aVar == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        com.google.android.material.badge.a aVar4 = this.G;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar4.setBounds(rect);
        aVar4.i(imageView, null);
        if (aVar4.d() != null) {
            aVar4.d().setForeground(aVar4);
        } else {
            imageView.getOverlay().add(aVar4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setChecked(boolean z) {
        int i;
        TextView textView = this.r;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.q;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (this.B && this.b) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.y = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, f);
                this.y = ofFloat;
                ofFloat.addUpdateListener(new pw50(this, f));
                this.y.setInterpolator(tb30.d(getContext(), R$attr.motionEasingEmphasizedInterpolator, rq2.b));
                this.y.setDuration(tb30.c(R$attr.motionDurationLong2, getResources().getInteger(R$integer.material_motion_duration_long_1), getContext()));
                this.y.start();
                i = this.k;
                ViewGroup viewGroup = this.p;
                if (i == -1) {
                    if (i == 0) {
                        if (z) {
                            h(this.e, 49, getIconOrContainer());
                            j(this.f, viewGroup);
                            textView.setVisibility(0);
                        } else {
                            h(this.e, 17, getIconOrContainer());
                            j(0, viewGroup);
                            textView.setVisibility(4);
                        }
                        textView2.setVisibility(4);
                    } else if (i == 1) {
                        j(this.f, viewGroup);
                        if (z) {
                            h((int) (this.e + this.h), 49, getIconOrContainer());
                            g(textView, 1.0f, 1.0f, 0);
                            float f2 = this.i;
                            g(textView2, f2, f2, 4);
                        } else {
                            h(this.e, 49, getIconOrContainer());
                            float f3 = this.j;
                            g(textView, f3, f3, 4);
                            g(textView2, 1.0f, 1.0f, 0);
                        }
                    } else if (i == 2) {
                        h(this.e, 17, getIconOrContainer());
                        textView.setVisibility(8);
                        textView2.setVisibility(8);
                    }
                } else if (this.l) {
                    if (z) {
                        h(this.e, 49, getIconOrContainer());
                        j(this.f, viewGroup);
                        textView.setVisibility(0);
                    } else {
                        h(this.e, 17, getIconOrContainer());
                        j(0, viewGroup);
                        textView.setVisibility(4);
                    }
                    textView2.setVisibility(4);
                } else {
                    j(this.f, viewGroup);
                    if (z) {
                        h((int) (this.e + this.h), 49, getIconOrContainer());
                        g(textView, 1.0f, 1.0f, 0);
                        float f4 = this.i;
                        g(textView2, f4, f4, 4);
                    } else {
                        h(this.e, 49, getIconOrContainer());
                        float f5 = this.j;
                        g(textView, f5, f5, 4);
                        g(textView2, 1.0f, 1.0f, 0);
                    }
                }
                refreshDrawableState();
                setSelected(z);
            }
        }
        e(f, f);
        i = this.k;
        ViewGroup viewGroup2 = this.p;
        if (i == -1) {
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.q.setEnabled(z);
        this.r.setEnabled(z);
        this.o.setEnabled(z);
        if (!z) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.f.a(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            iut0.f.a(this, systemIcon);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.w) {
            return;
        }
        this.w = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.x = drawable;
            ColorStateList colorStateList = this.v;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.o.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.v = colorStateList;
        if (this.u == null || (drawable = this.x) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.x.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f != i) {
            this.f = i;
            b();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.e != i) {
            this.e = i;
            b();
        }
    }

    public void setItemPosition(int i) {
        this.s = i;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.c = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.k != i) {
            this.k = i;
            if (this.E && i == 2) {
                this.z = J;
            } else {
                this.z = I;
            }
            i(getWidth());
            b();
        }
    }

    public void setShifting(boolean z) {
        if (this.l != z) {
            this.l = z;
            b();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.t = i;
        TextView textView = this.r;
        f(textView, i);
        a(this.q.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.t);
        TextView textView = this.r;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.q;
        f(textView, i);
        a(textView.getTextSize(), this.r.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.q.setTextColor(colorStateList);
            this.r.setTextColor(colorStateList);
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.q.setText(charSequence);
        this.r.setText(charSequence);
        androidx.appcompat.view.menu.h hVar = this.u;
        if (hVar == null || TextUtils.isEmpty(hVar.q)) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.h hVar2 = this.u;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.r)) {
            charSequence = this.u.r;
        }
        a5p0.a.a(this, charSequence);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.d = drawable;
        d();
    }
}
