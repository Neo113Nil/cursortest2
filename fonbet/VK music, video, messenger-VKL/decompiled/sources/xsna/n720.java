package xsna;

import android.content.res.ColorStateList;
import android.view.MenuItem;

/* compiled from: MenuItemCompat.java */
/* loaded from: classes11.dex */
public final class n720 {
    public static void a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof nin0) {
            ((nin0) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void b(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof nin0) {
            ((nin0) menuItem).setIconTintList(colorStateList);
        } else {
            menuItem.setIconTintList(colorStateList);
        }
    }
}
