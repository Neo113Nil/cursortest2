package androidx.appcompat.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.core.internal.view.SupportMenuItem;
import defpackage.gx;
import defpackage.ny61;
import java.lang.reflect.Constructor;

/* loaded from: classes10.dex */
public final class b {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ SupportMenuInflater E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public gx z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public b(SupportMenuInflater supportMenuInflater, Menu menu) {
        this.E = supportMenuInflater;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.mContext.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        SupportMenuInflater supportMenuInflater = this.E;
        if (str != null) {
            if (supportMenuInflater.mContext.isRestricted()) {
                ny61.r("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            menuItem.setOnMenuItemClickListener(new SupportMenuInflater.InflatedOnMenuItemClickListener(supportMenuInflater.getRealOwner(), this.y));
        }
        if (this.r >= 2) {
            if (menuItem instanceof MenuItemImpl) {
                ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
            } else if (menuItem instanceof MenuItemWrapperICS) {
                ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, supportMenuInflater.mActionViewConstructorArguments));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        gx gxVar = this.z;
        if (gxVar != null && (menuItem instanceof SupportMenuItem)) {
            ((SupportMenuItem) menuItem).setSupportActionProvider(gxVar);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof SupportMenuItem;
        if (z2) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((SupportMenuItem) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
