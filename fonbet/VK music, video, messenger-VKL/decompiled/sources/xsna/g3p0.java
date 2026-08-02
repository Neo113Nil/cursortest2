package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.vkontakte.android.R;
import xsna.uko;

/* compiled from: ToolbarExt.kt */
/* loaded from: classes18.dex */
public final class g3p0 {
    public static final void a(Toolbar toolbar, int i, int i2, int i3, ColorStateList colorStateList) {
        Drawable drawable;
        Drawable drawable2;
        Drawable mutate;
        int childCount = toolbar.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = toolbar.getChildAt(i4);
            String string = toolbar.getContext().getString(R.string.dynamic_theme_ignored);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (!epx.f(imageView.getTag(), string) && (drawable2 = imageView.getDrawable()) != null) {
                    if (drawable2 instanceof baf0) {
                        mutate = new baf0(((baf0) drawable2).b, i3);
                    } else {
                        mutate = drawable2.mutate();
                        mutate.setTint(i3);
                    }
                    imageView.setImageDrawable(mutate);
                }
            }
            if (childAt instanceof ActionMenuView) {
                ActionMenuView actionMenuView = (ActionMenuView) childAt;
                int childCount2 = actionMenuView.getChildCount();
                for (int i5 = 0; i5 < childCount2; i5++) {
                    View childAt2 = actionMenuView.getChildAt(i5);
                    if (childAt2 instanceof ActionMenuItemView) {
                        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt2;
                        if (!(actionMenuItemView.getCompoundDrawables().length == 0) && (drawable = actionMenuItemView.getCompoundDrawables()[0]) != null) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setTintList(colorStateList);
                            actionMenuItemView.setCompoundDrawables(mutate2, null, null, null);
                        }
                    }
                }
            }
        }
        toolbar.setTitleTextColor(i);
        toolbar.setSubtitleTextColor(i2);
        Drawable a = dhr0.t.a(R.drawable.vk_icon_more_vertical_28);
        if (a != null) {
            uko.a aVar = uko.a;
            Drawable mutate3 = a.mutate();
            mutate3.setTintList(colorStateList);
            toolbar.setOverflowIcon(mutate3);
        }
    }

    public static final void b(Toolbar toolbar) {
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.toolbar_title_textColor);
        int c2 = abg0Var.c(R.attr.toolbar_subtitle_textColor);
        dhr0.a.getClass();
        a(toolbar, c, c2, abg0Var.c(R.attr.vk_ui_icon_accent_themed), anj.b(R.color.vk_ui_header_tint, dhr0.E()));
    }

    public static final void c(Toolbar toolbar) {
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_text_muted);
        int c2 = abg0Var.c(R.attr.vk_ui_text_muted);
        int c3 = abg0Var.c(R.attr.vk_ui_icon_medium);
        dhr0.a.getClass();
        a(toolbar, c, c2, c3, anj.b(R.color.vk_ui_icon_medium_tint, dhr0.E()));
    }
}
