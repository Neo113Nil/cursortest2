package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.k;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import java.util.WeakHashMap;

/* compiled from: BottomNavigationItemView.java */
/* loaded from: classes11.dex */
public final class j58 extends FrameLayout implements k.a {
    public static final int[] u = {R.attr.state_checked};
    public static final int[] v = {10, 9};
    public final int b;
    public final float c;
    public final float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final ImageView h;
    public final FrameLayout i;
    public final View j;
    public final TextView k;
    public final TextView l;
    public final View m;
    public final TextView n;
    public final View o;
    public int p;
    public androidx.appcompat.view.menu.h q;
    public ColorStateList r;
    public int s;
    public final l58 t;

    public j58(@NonNull Context context) {
        super(context, null, 0);
        this.e = false;
        this.f = false;
        this.g = false;
        this.p = -1;
        this.s = 28;
        bpn0 bpn0Var = dm10.c;
        this.t = (l58) (bpn0Var != null ? bpn0Var : null).getValue();
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_text_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_text_size);
        this.b = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_margin);
        float f = dimensionPixelSize2;
        float f2 = dimensionPixelSize;
        this.c = (f * 1.0f) / f2;
        this.d = (f2 * 1.0f) / f;
        LayoutInflater.from(getContext()).inflate(com.vkontakte.android.R.layout.navigation_long_press_view, (ViewGroup) this, true);
        this.j = findViewById(com.vkontakte.android.R.id.pressed_state);
        LayoutInflater.from(context).inflate(R$layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(R$drawable.mtrl_navigation_bar_item_background);
        this.i = (FrameLayout) findViewById(R$id.navigation_bar_item_icon_container);
        this.h = (ImageView) findViewById(R$id.navigation_bar_item_icon_view);
        setIconSizeDp(this.s);
        TextView textView = (TextView) findViewById(R$id.navigation_bar_item_small_label_view);
        this.k = textView;
        TextView textView2 = (TextView) findViewById(R$id.navigation_bar_item_large_label_view);
        this.l = textView2;
        Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        textView.setTypeface(a);
        textView2.setTypeface(a);
        textView.setLetterSpacing(0.02f);
        textView2.setLetterSpacing(0.02f);
        ((ViewGroup) textView2.getParent()).setPadding(0, 0, 0, iah0.a(5));
        LayoutInflater.from(getContext()).inflate(com.vkontakte.android.R.layout.navigation_bottom_indicator, (ViewGroup) this, true);
        this.m = findViewById(com.vkontakte.android.R.id.indicator_container);
        this.n = (TextView) findViewById(com.vkontakte.android.R.id.counter);
        this.o = findViewById(com.vkontakte.android.R.id.dot);
        LayoutInflater.from(getContext()).inflate(com.vkontakte.android.R.layout.navigation_bottom_action, (ViewGroup) this, true);
        dhr0.a.j0((ImageView) findViewById(com.vkontakte.android.R.id.action_icon), com.vkontakte.android.R.attr.vk_ui_vkontakte_color_tabbar_active_icon, PorterDuff.Mode.MULTIPLY);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(androidx.appcompat.view.menu.h hVar) {
        this.q = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        l58 l58Var = this.t;
        if (l58Var.b().contains(Integer.valueOf(this.q.a))) {
            androidx.appcompat.view.menu.h hVar2 = this.q;
            int i = hVar2.a;
            l58Var.c(hVar2.isChecked(), this.q.getIcon(), this);
        } else {
            this.h.setForeground(new ColorDrawable(0));
            setIcon(this.q.getIcon());
        }
        setTitle(hVar.e);
        setId(hVar.a);
        if (TextUtils.isEmpty(hVar.q)) {
            setContentDescription(hVar.e);
        } else {
            setContentDescription(hVar.q);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.h getItemData() {
        return this.q;
    }

    public int getItemPosition() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.h hVar = this.q;
        if (hVar != null && hVar.isCheckable() && this.q.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, u);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.m;
        if (view.getVisibility() != 8) {
            float f = 2;
            int min = Math.min(((getMeasuredWidth() / 2) - view.getWidth()) - iah0.a(f), 0) + iah0.a(f) + (view.getMeasuredWidth() / 2);
            view.layout(view.getLeft() + min, view.getTop(), view.getRight() + min, view.getBottom());
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.q.setChecked(z);
        TextView textView = this.l;
        float width = textView.getWidth() / 2;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        textView.setPivotX(width);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.k;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        boolean z2 = this.f;
        int i = this.b;
        FrameLayout frameLayout = this.i;
        View view = this.m;
        if (z2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.gravity = 17;
            layoutParams2.topMargin = i;
            layoutParams2.bottomMargin = iah0.a(1.5f) + i;
            view.setLayoutParams(layoutParams2);
            view.setTranslationY(-iah0.a(5.5f));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            float f = 1.0f;
            if (this.e) {
                if (z) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams3.gravity = 49;
                    layoutParams3.topMargin = i;
                    frameLayout.setLayoutParams(layoutParams3);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams4.gravity = 49;
                    layoutParams4.topMargin = i;
                    layoutParams4.bottomMargin = iah0.a(1.5f) + i;
                    view.setLayoutParams(layoutParams4);
                    view.setTranslationY(-iah0.a(5.5f));
                    textView.setVisibility(0);
                    textView.setScaleX(1.0f);
                    textView.setScaleY(1.0f);
                } else {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams5.gravity = 17;
                    layoutParams5.topMargin = i;
                    frameLayout.setLayoutParams(layoutParams5);
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams6.gravity = 17;
                    layoutParams6.topMargin = i;
                    layoutParams6.bottomMargin = iah0.a(1.5f) + i;
                    view.setLayoutParams(layoutParams6);
                    view.setTranslationY(-iah0.a(5.5f));
                    textView.setVisibility(4);
                    textView.setScaleX(0.5f);
                    textView.setScaleY(0.5f);
                }
                textView2.setVisibility(4);
            } else {
                boolean z3 = this.g;
                float f2 = this.d;
                textView.setScaleX((z3 || z) ? 1.0f : f2);
                if (this.g || z) {
                    f2 = 1.0f;
                }
                textView.setScaleY(f2);
                boolean z4 = this.g;
                float f3 = this.c;
                textView2.setScaleX((!z4 && z) ? f3 : 1.0f);
                if (!this.g && z) {
                    f = f3;
                }
                textView2.setScaleY(f);
                if (z) {
                    textView.setVisibility(0);
                    textView2.setVisibility(4);
                } else {
                    textView.setVisibility(4);
                    textView2.setVisibility(0);
                }
                FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams7.gravity = 17;
                layoutParams7.topMargin = 0;
                layoutParams7.bottomMargin = iah0.a(6);
                frameLayout.setLayoutParams(layoutParams7);
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams8.gravity = 17;
                layoutParams8.topMargin = 0;
                layoutParams8.bottomMargin = iah0.a(8);
                view.setLayoutParams(layoutParams8);
                view.setTranslationY(-iah0.a(5.5f));
            }
        }
        refreshDrawableState();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.k.setEnabled(z);
        this.l.setEnabled(z);
        this.h.setEnabled(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            drawable.setTintList(this.r);
        }
        this.h.setImageDrawable(drawable);
    }

    public void setIconSizeDp(int i) {
        this.s = i;
        ImageView imageView = this.h;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i2 = this.s;
        if (i2 >= 0) {
            i2 = iah0.a(i2);
        }
        layoutParams.width = i2;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int i3 = this.s;
        if (i3 >= 0) {
            i3 = iah0.a(i3);
        }
        layoutParams2.height = i3;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.r = colorStateList;
        androidx.appcompat.view.menu.h hVar = this.q;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setIconsMode(boolean z) {
        this.f = z;
    }

    public void setIndicatorCounter(@NonNull CharSequence charSequence) {
        this.m.setVisibility(0);
        this.o.setVisibility(8);
        TextView textView = this.n;
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (charSequence.length() == 1) {
            textView.setLetterSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            textView.setLetterSpacing(0.02f);
        }
    }

    public void setItemBackground(int i) {
        Drawable a = i == 0 ? null : m33.a(i, getContext());
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setBackground(a);
    }

    public void setItemPosition(int i) {
        this.p = i;
    }

    public void setShiftingMode(boolean z) {
        this.e = z;
    }

    public void setStaticMode(boolean z) {
        this.g = z;
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.k.setTextColor(colorStateList);
        this.l.setTextColor(colorStateList);
    }

    public void setTextSize(int i) {
        int i2 = i >= 12 ? 2 : 1;
        float f = i;
        this.k.setTextSize(i2, f);
        this.l.setTextSize(i2, f);
    }

    public void setTitle(CharSequence charSequence) {
        this.k.setText(charSequence);
        this.l.setText(charSequence);
    }
}
