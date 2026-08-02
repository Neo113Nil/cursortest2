package androidx.appcompat.widget;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.ActionMenuItem;
import defpackage.dfz0;
import defpackage.iog0;
import defpackage.k0i0;
import defpackage.n4i0;
import defpackage.wyg;

/* loaded from: classes10.dex */
public final class p implements wyg {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public d m;
    public final int n;
    public final Drawable o;

    public p(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = k0i0.abc_action_bar_up_description;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        dfz0 e = dfz0.e(iog0.actionBarStyle, 0, toolbar.getContext(), null, n4i0.ActionBar);
        TypedArray typedArray = e.b;
        this.o = e.b(n4i0.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence text = typedArray.getText(n4i0.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.g) {
                        androidx.core.view.b.r(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(n4i0.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable b = e.b(n4i0.ActionBar_logo);
            if (b != null) {
                this.e = b;
                c();
            }
            Drawable b2 = e.b(n4i0.ActionBar_icon);
            if (b2 != null) {
                this.d = b2;
                c();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                if ((this.b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(n4i0.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(n4i0.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(n4i0.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(n4i0.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(n4i0.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(n4i0.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(n4i0.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(n4i0.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.b = i;
        }
        e.g();
        if (i2 != this.n) {
            this.n = i2;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i3 = this.n;
                this.j = i3 != 0 ? toolbar.getContext().getString(i3) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper$1
            final ActionMenuItem mNavItem;

            {
                this.mNavItem = new ActionMenuItem(p.this.a.getContext(), 0, R.id.home, 0, 0, p.this.h);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                p pVar = p.this;
                Window.Callback callback = pVar.k;
                if (callback == null || !pVar.l) {
                    return;
                }
                callback.onMenuItemSelected(0, this.mNavItem);
            }
        });
    }

    public final void a(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.b & 4) != 0) {
            CharSequence charSequence = this.j;
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            Toolbar toolbar = this.a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(charSequence);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }
}
