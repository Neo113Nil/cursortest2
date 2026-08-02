package com.vkontakte.android.ui.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.h;
import com.google.android.material.R$style;
import com.vk.core.navigation.R$styleable;
import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;
import xsna.abg0;
import xsna.anj;
import xsna.bpn0;
import xsna.dhr0;
import xsna.dm10;
import xsna.j58;
import xsna.l58;
import xsna.t58;
import xsna.too0;
import xsna.w58;
import xsna.y58;

/* loaded from: classes11.dex */
public class BottomNavigationView extends FrameLayout implements too0 {
    public static final int[] j = {R.attr.state_checked};
    public static final int[] k = {-16842910};
    public final t58 b;

    @NonNull
    public final w58 c;
    public final y58 d;
    public int e;
    public int f;
    public a g;
    public boolean h;

    @Nullable
    public SparseIntArray i;

    public interface a {
        boolean a(@NonNull MenuItem menuItem);

        void f(@NonNull h hVar, j58 j58Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ColorStateList colorStateList;
        y58 y58Var = new y58();
        this.d = y58Var;
        this.e = com.vkontakte.android.R.attr.vk_ui_vkontakte_color_tabbar_inactive_icon;
        this.f = com.vkontakte.android.R.attr.vk_ui_vkontakte_color_tabbar_active_icon;
        this.h = false;
        this.i = null;
        t58 t58Var = new t58(context);
        this.b = t58Var;
        w58 w58Var = new w58(context);
        this.c = w58Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        w58Var.setLayoutParams(layoutParams);
        y58Var.c = w58Var;
        w58Var.setPresenter(y58Var);
        t58Var.b(y58Var, t58Var.a);
        y58Var.h(getContext(), t58Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, R$style.Widget_Design_BottomNavigationView);
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            ColorStateList b = anj.b(typedValue.resourceId, getContext());
            if (getContext().getTheme().resolveAttribute(this.f, typedValue, true)) {
                int i = typedValue.data;
                int defaultColor = b.getDefaultColor();
                int[] iArr = j;
                int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
                int[] iArr3 = k;
                colorStateList = new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{b.getColorForState(iArr3, defaultColor), i, defaultColor});
                w58Var.setItemTextColor(colorStateList);
                w58Var.setItemBackgroundRes(0);
                y58Var.d = true;
                bpn0 bpn0Var = dm10.c;
                ((l58) (bpn0Var != null ? bpn0Var : null).getValue()).a(t58Var, this);
                y58Var.d = false;
                y58Var.c(true);
                obtainStyledAttributes.recycle();
                addView(w58Var, layoutParams);
                t58Var.e = new com.vkontakte.android.ui.bottomnavigation.a(this);
                w58Var.setItemOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.c68
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        BottomNavigationView bottomNavigationView = BottomNavigationView.this;
                        if (bottomNavigationView.g == null || !(view instanceof j58)) {
                            return false;
                        }
                        j58 j58Var = (j58) view;
                        bottomNavigationView.g.f(j58Var.getItemData(), (j58) view);
                        if (!bottomNavigationView.c.o.a) {
                            j58Var.j.setVisibility(0);
                        }
                        return true;
                    }
                });
                Ng();
            }
        }
        colorStateList = null;
        w58Var.setItemTextColor(colorStateList);
        w58Var.setItemBackgroundRes(0);
        y58Var.d = true;
        bpn0 bpn0Var2 = dm10.c;
        ((l58) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).a(t58Var, this);
        y58Var.d = false;
        y58Var.c(true);
        obtainStyledAttributes.recycle();
        addView(w58Var, layoutParams);
        t58Var.e = new com.vkontakte.android.ui.bottomnavigation.a(this);
        w58Var.setItemOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.c68
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                BottomNavigationView bottomNavigationView = BottomNavigationView.this;
                if (bottomNavigationView.g == null || !(view instanceof j58)) {
                    return false;
                }
                j58 j58Var = (j58) view;
                bottomNavigationView.g.f(j58Var.getItemData(), (j58) view);
                if (!bottomNavigationView.c.o.a) {
                    j58Var.j.setVisibility(0);
                }
                return true;
            }
        });
        Ng();
    }

    @Override // xsna.too0
    public final void Ng() {
        if (this.h) {
            return;
        }
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        int i = this.e;
        abg0 abg0Var = dhr0.t;
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{abg0Var.c(i), abg0Var.c(this.f)});
        w58 w58Var = this.c;
        w58Var.setIconTintList(colorStateList);
        w58Var.setItemTextColor(colorStateList);
    }

    public int getActiveMenuId() {
        int activeButton = this.c.getActiveButton();
        if (activeButton < 0) {
            return -1;
        }
        t58 t58Var = this.b;
        if (activeButton < t58Var.f.size()) {
            return t58Var.getItem(activeButton).getItemId();
        }
        return -1;
    }

    public int getItemBackgroundResource() {
        return this.c.getItemBackgroundRes();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.c.getIconTintList();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.c.getItemTextColor();
    }

    public int getMaxItemCount() {
        return 6;
    }

    @NonNull
    public Menu getMenu() {
        return this.b;
    }

    @NonNull
    public w58 getMenuView() {
        return this.c;
    }

    public void setIndicatorDot(int i) {
        this.c.setIndicatorDot(i);
    }

    public void setIndicatorInvisible(int i) {
        this.c.setIndicatorInvisible(i);
    }

    public void setItemBackgroundResource(int i) {
        this.c.setItemBackgroundRes(i);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.c.setIconTintList(colorStateList);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.c.setItemTextColor(colorStateList);
    }

    public void setOnNavigationItemSelectedListener(@Nullable a aVar) {
        this.g = aVar;
    }

    public void setTitlesVisibility(boolean z) {
        this.c.setTitlesVisibility(z);
    }
}
